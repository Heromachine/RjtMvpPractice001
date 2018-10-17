package com.example.jessi.abdulmvppractice.data;

import com.example.jessi.abdulmvppractice.data.network.IDBHelper;

public interface IDataManager extends IDBHelper {

    interface OnResponseListener {
        void getTodoNote(Model model);
        
    }

}
