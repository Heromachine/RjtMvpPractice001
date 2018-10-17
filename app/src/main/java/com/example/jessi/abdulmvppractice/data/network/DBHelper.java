package com.example.jessi.abdulmvppractice.data.network;
import com.example.jessi.abdulmvppractice.data.IDataManager;
import com.example.jessi.abdulmvppractice.data.Model;

public class DBHelper implements IDBHelper {
    Model model = new Model("MY INFO");
    @Override
    public void readRow(IDataManager.OnResponseListener listener) {

        listener.getTodoNote(model);
    }

    @Override
    public void writeRow(IDataManager.OnResponseListener listener, Model model) {
        this.model = model;
    }
}
