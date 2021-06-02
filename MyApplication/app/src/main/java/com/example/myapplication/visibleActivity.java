package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class visibleActivity extends AppCompatActivity {

    Button button;

    TextView textView1, textView2;
    Boolean frame2 = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        button = (Button) findViewById(R.id.invisible);
        textView1 = (TextView)findViewById(R.id.frame1);
        textView2 = (TextView)findViewById(R.id.frame2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (frame2 == true) {
                    textView1.setVisibility(View.INVISIBLE);
                    textView2.setVisibility(View.VISIBLE);
                    frame2 = false;
                } else if (frame2 == false){
                    textView1.setVisibility(View.VISIBLE);
                    textView2.setVisibility(View.INVISIBLE);
                    frame2 = false;
                } else {
                    Toast.makeText(getApplicationContext(), "오류", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}