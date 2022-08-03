package com.manuni.fragmentdatasendingusingfragmentobject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nameEditTxt, ageEditTxt;
    private Button sendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameEditTxt.getText().toString();
                String age = ageEditTxt.getText().toString();
                DataReceiverFragment dataReceiverFragment = new DataReceiverFragment();
                dataReceiverFragment.setFragmentData(name,age);
                getSupportFragmentManager().beginTransaction().add(R.id.container,dataReceiverFragment).commit();
            }
        });

    }
    private void initViews(){
        nameEditTxt = findViewById(R.id.nameET);
        ageEditTxt = findViewById(R.id.ageET);
        sendBtn = findViewById(R.id.sendBtn);
    }
}