package com.example.mmg0615;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {


    Button button;
    TextView tv_name,tv_school, tv_team;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        button = (Button)findViewById(R.id.btn_set);
        tv_name = (TextView) findViewById(R.id.input_name);
        tv_school = (TextView) findViewById(R.id.input_school);
        tv_team = (TextView) findViewById(R.id.input_team);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        tv_name.setText(bundle.getString("name"));
        tv_school.setText(bundle.getString("school"));
        tv_team.setText(bundle.getString("team"));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent1 = new Intent(SubActivity.this, MainActivity.class);
               startActivity(intent);
               finish();
            }
        });

    }
}