//package datamanagement;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class DataManager {
//    private List<String> dataList;
//
//    public DataManager() {
//        this.dataList = new ArrayList<>();
//    }
//
//    public void addData(String data) {
//        dataList.add(data);
//    }
//
//    public void updateData(int index, String newData) {
//        dataList.set(index, newData);
//    }
//
//    public void deleteData(int index) {
//        dataList.remove(index);
//    }
//
//    public List<String> getDataList() {
//        return dataList;
//    }
//}
//


package datamanagement;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private List<DataEntry> dataList;

    public DataManager() {
        dataList = new ArrayList<>();
    }

    public void addData(String data) {
        dataList.add(new DataEntry(data));
    }

    public void updateData(int index, String newData) {
        if (index >= 0 && index < dataList.size()) {
            dataList.get(index).setData(newData);
        }
    }

    public void deleteData(int index) {
        if (index >= 0 && index < dataList.size()) {
            dataList.remove(index);
        }
    }

    public List<DataEntry> getDataList() {
        return dataList;
    }
}
