package com.example.audiocontroller;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    private TextView tvSave;
    private CheckBox HDMICheckBox,CODECCheckBos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvSave = (TextView)findViewById(R.id.text1);
        tvSave.setOnClickListener(this);
        HDMICheckBox = (CheckBox)findViewById(R.id.checkbox1);
        HDMICheckBox.setOnCheckedChangeListener(this);
        CODECCheckBos = (CheckBox)findViewById(R.id.checkbox2);
        CODECCheckBos.setOnCheckedChangeListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.text1:

                break;
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()){
            case R.id.checkbox1:

                break;
            case R.id.checkbox2:

                break;
        }
    }
}
