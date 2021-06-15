package com.example.mmg0615;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText et_name,et_school, et_team;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.btn1);
        et_name = (EditText)findViewById(R.id.et_name);
        et_school = (EditText)findViewById(R.id.et_school);
        et_team = (EditText)findViewById(R.id.et_team);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                intent.putExtra("name", et_name.getText().toString());
                intent.putExtra("school", et_school.getText().toString());
                intent.putExtra("team", et_team.getText().toString());
                Toast.makeText(getApplicationContext(), et_name.getText() +
                        "," + et_school.getText() + "," + et_team.getText(), Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}