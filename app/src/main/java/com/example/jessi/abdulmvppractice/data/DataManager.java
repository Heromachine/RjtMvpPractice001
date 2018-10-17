package com.example.jessi.abdulmvppractice.data;

import com.example.jessi.abdulmvppractice.data.network.DBHelper;
import com.example.jessi.abdulmvppractice.data.network.IDBHelper;

public class DataManager implements IDataManager{

    IDBHelper idbHelper;
    public DataManager(){
        idbHelper = new DBHelper();
    }

    @Override
    public void readRow(OnResponseListener listener) {
        idbHelper.readRow(listener);
    }

    @Override
    public void writeRow(OnResponseListener listener, Model model) {
        idbHelper.writeRow(listener, model);
    }


}
