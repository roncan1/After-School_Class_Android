package com.example.mmg_0603;

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

    TextView textView;
    Button button;
    RadioGroup radioGroup;
    RadioButton radioButton1, radioButton2;

    CheckBox checkBox;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.text1);
        button = (Button)findViewById(R.id.btn1);
        radioGroup = (RadioGroup)findViewById(R.id.radiogroup);
        radioButton1 = (RadioButton)findViewById(R.id.radio1);
        radioButton2 = (RadioButton)findViewById(R.id.radio2);
        checkBox = (CheckBox)findViewById(R.id.check);
        editText = (EditText)findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), textView.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case (R.id.radio1):
                        if (radioButton1.isChecked() == true) {
                            editText.setText("123456789");
                        } else {
                            editText.setText("0");
                        }
                        break;
                    case (R.id.radio2):
                        if (radioButton2.isChecked() == true){
                            editText.setText("2467");
                        } else {
                            editText.setText("0000");
                        }
                        break;

                    default:
                        editText.setText("0101");
                        Toast.makeText(getApplicationContext(), "오류", Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });

    }
}