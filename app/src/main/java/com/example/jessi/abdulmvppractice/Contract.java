package com.example.jessi.abdulmvppractice;

import android.view.View;

public interface Contract {

    interface IView {
        void displayInfo(Model model);

        Model getModel();

        void setToast(String message);
    }
    interface IPresenter {

        void onSetClicked(View view);

        void onGetClicked(View view);
    }

}
