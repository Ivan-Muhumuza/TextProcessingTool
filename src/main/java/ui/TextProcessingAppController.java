package ui;

import datamanagement.DataManager;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import regex.RegexUtility;

public class TextProcessingAppController {

    @FXML
    public TextArea inputArea;
    @FXML
    private TextField regexPattern;
    @FXML
    private TextField replacementText;
    @FXML
    private TextArea resultArea;
    @FXML
    private TextField dataInput;
    @FXML
    private ListView<String> dataList;

    private final DataManager dataManager = new DataManager();

    @FXML
    private void handleMatch() {
        String text = inputArea.getText();
        String pattern = regexPattern.getText();
        boolean isMatch = RegexUtility.matchPattern(text, pattern);
        resultArea.setText("Match Found: " + isMatch);
    }

    @FXML
    private void handleReplace() {
        String text = inputArea.getText();
        String pattern = regexPattern.getText();
        String replacement = replacementText.getText();
        String replacedText = RegexUtility.replaceText(text, pattern, replacement);
        resultArea.setText("Replaced Text: " + replacedText);
    }

    @FXML
    private void handleAdd() {
        String data = dataInput.getText();
        dataManager.addData(data);
        dataList.getItems().add(data);
    }

    @FXML
    private void handleUpdate() {
        int selectedIndex = dataList.getSelectionModel().getSelectedIndex();
        if (selectedIndex != -1) {
            String newData = dataInput.getText();
            dataManager.updateData(selectedIndex, newData);
            dataList.getItems().set(selectedIndex, newData);
        }
    }

    @FXML
    private void handleDelete() {
        int selectedIndex = dataList.getSelectionModel().getSelectedIndex();
        if (selectedIndex != -1) {
            dataManager.deleteData(selectedIndex);
            dataList.getItems().remove(selectedIndex);
        }
    }

    @FXML
    private void handleClear() {
        inputArea.clear();
        regexPattern.clear();
        replacementText.clear();
        resultArea.clear();
    }

    @FXML
    private void handleClearData() {
        dataInput.clear();
    }
}
