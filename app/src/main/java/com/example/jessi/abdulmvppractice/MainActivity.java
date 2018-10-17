package com.example.jessi.abdulmvppractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jessi.abdulmvppractice.data.Model;

public class MainActivity extends AppCompatActivity implements Contract.IView {

    EditText etInfo;
    Button setInfo;
    Button getInfo;
    TextView display;
    Contract.IPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        presenter = new Presenter(this);

        etInfo  = findViewById(R.id.et_info);
        setInfo = findViewById(R.id.btn_set);
        getInfo = findViewById(R.id.btn_get);
        display = findViewById(R.id.tv_info);
    }

    public void handelClick(View view){
        presenter.onSetClicked(view);
        presenter.onGetClicked(view);
    }

    @Override
    public void displayInfo(Model model){

        display.setText(model.getModelInfo());
    }

    @Override
    public Model getModel()
    {
        Model model = new Model(etInfo.getText().toString());
        return model;
    }

    @Override
    public void setToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
