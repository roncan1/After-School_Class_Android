package com.example.mmg_0607test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    CheckBox checkBox;
    RadioGroup radioGroup;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText)findViewById(R.id.EditText1);
        button = (Button)findViewById(R.id.EditTextBtn);
        checkBox = (CheckBox)findViewById(R.id.checkbtn);
        radioGroup = (RadioGroup)findViewById(R.id.radio_g);
        text = (TextView)findViewById(R.id.text1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), editText.getText().toString(), Toast.LENGTH_LONG).show();
                String value = editText.getText().toString();
                switch (value){
                    case "1":
                        checkBox.setChecked(true);
                        break;

                    case "0":
                        checkBox.setChecked(false);
                        break;
                }
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rbtn1:
                        text.setText("상일미디어고");
                        break;

                    case R.id.rbtn2:
                        text.setText("전공동아리");
                        break;
                }
            }
        });
    }
}