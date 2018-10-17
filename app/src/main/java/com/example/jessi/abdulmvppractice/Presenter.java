package com.example.jessi.abdulmvppractice;

import android.view.View;

import com.example.jessi.abdulmvppractice.data.DataManager;
import com.example.jessi.abdulmvppractice.data.IDataManager;
import com.example.jessi.abdulmvppractice.data.Model;

public class Presenter implements Contract.IPresenter, IDataManager.OnResponseListener {
    private static final String TAG = "Presenter";
    Contract.IView view;
    IDataManager iDataManager;


    public Presenter(MainActivity mainActivity) {
        view = mainActivity;
        iDataManager = new DataManager();
    }


    @Override
    public void onSetClicked(View view){
        switch(view.getId()){
            case R.id.btn_set:
                this.view.setToast("Set Clicked");
                iDataManager.writeRow(this, this.view.getModel());
                break;
        }
    }

    @Override
    public void onGetClicked(View view) {
        switch(view.getId()){
            case R.id.btn_get:
                iDataManager.readRow(this);
                break;
        }

    }


    @Override
    public void getTodoNote(Model model) {
        this.view.displayInfo(model);
    }
}
