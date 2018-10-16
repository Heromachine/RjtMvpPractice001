package com.example.jessi.abdulmvppractice;

import android.view.View;

public class Presenter implements Contract.IPresenter {
    private static final String TAG = "Presenter";
    Contract.IView view;
    static Model model = new Model();

    public Presenter(MainActivity mainActivity) {
        view = mainActivity;
    }
    @Override
    public void onSetClicked(View view){
        switch(view.getId()){
            case R.id.btn_set:
                this.view.setToast("Set Clicked");
                model = this.view.getModel();
                break;
        }
    }

    @Override
    public void onGetClicked(View view) {
        switch(view.getId()){
            case R.id.btn_get:
                this.view.setToast("Get Clicked");
                this.view.displayInfo(model);
                break;
        }

    }
}
