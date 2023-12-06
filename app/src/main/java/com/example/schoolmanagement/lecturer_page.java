package com.example.schoolmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class lecturer_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecturer_page);

        final EditText editTextLecturerName = findViewById(R.id.editTextLecturerName);
        final EditText editTextLecturerPassword = findViewById(R.id.editTextLecturerPassword);
        Button buttonLogin = findViewById(R.id.buttonlogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lecturer_name = editTextLecturerName.getText().toString();
                String lecturer_password = editTextLecturerPassword.getText().toString();

                // Replace "admin" and "password" with your specific username and password
                if (lecturer_name.equals("lecturer") && lecturer_password.equals("password")) {
                    // Successful login, redirect to another activity
                    Intent intent = new Intent(lecturer_page.this, marks_page.class);
                    startActivity(intent);
                    finish(); // Close the login activity
                } else {
                    // Show an error message or handle unsuccessful login
                    // For simplicity, we just show a toast message
                    // You may want to implement a better feedback mechanism
                    Toast.makeText(lecturer_page.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
