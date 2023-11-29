package com.example.schoolmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home_page extends AppCompatActivity {

    private Button student_button, lecturer_button, admin_button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        student_button = findViewById(R.id.student_button);
        student_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(home_page.this, student_page.class);
                startActivity(intent);
                finish();
            }
        });

        lecturer_button = findViewById(R.id.lecturer_button);
        lecturer_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(home_page.this, lecturer_page.class);
                startActivity(intent);
                finish();
            }
        });

        admin_button = findViewById(R.id.admin_button);
        admin_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(home_page.this, admin_page.class);
                startActivity(intent);
                finish();
            }
        });
    }
}