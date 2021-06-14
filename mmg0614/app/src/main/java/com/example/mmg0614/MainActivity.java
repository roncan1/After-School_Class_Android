package com.example.mmg0614;

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
    RadioButton rbtn1, rbtn2;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.EditText1);
        button = (Button)findViewById(R.id.EditTextBtn);
        checkBox = (CheckBox)findViewById(R.id.checkbtn);
        radioGroup = (RadioGroup)findViewById(R.id.radio_g);
        rbtn1 = (RadioButton)findViewById(R.id.rbtn1);
        rbtn2 = (RadioButton)findViewById(R.id.rbtn2);
        text = (TextView)findViewById(R.id.text1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), editText.getText(), Toast.LENGTH_LONG).show();
                String value = editText.getText().toString();
                if (value == "0") {
                    checkBox.setChecked(false);
                } else if (value == "1") {
                    checkBox.setChecked(true);
                } else {
                    Toast.makeText(getApplicationContext(), "원하는 값이 아님", Toast.LENGTH_SHORT).show();
                }
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case R.id.rbtn1:
                        text.setText("상일미디어고");
                        break;

                    case R.id.rbtn2:
                        text.setText("전공동아리");
                        break;

                    default:
                        text.setText("동민했어요요");
                        break;
                }

            }
       });

    }
}