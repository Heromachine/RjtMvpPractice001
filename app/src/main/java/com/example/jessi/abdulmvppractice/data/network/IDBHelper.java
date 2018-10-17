package com.example.jessi.abdulmvppractice.data.network;

import com.example.jessi.abdulmvppractice.data.IDataManager;
import com.example.jessi.abdulmvppractice.data.Model;

public interface IDBHelper {

    void readRow(IDataManager.OnResponseListener listener);

    void writeRow(IDataManager.OnResponseListener listener, Model model);

}
