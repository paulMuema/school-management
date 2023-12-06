package com.example.schoolmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class admin_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);

        final EditText editTextUsername = findViewById(R.id.editTextAdminName);
        final EditText editTextPassword = findViewById(R.id.editTextPassword);
        Button buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String admin_name = editTextUsername.getText().toString();
                String admin_password = editTextPassword.getText().toString();

                // Replace "admin" and "password" with your specific username and password
                if (admin_name.equals("admin") && admin_password.equals("password")) {
                    // Successful login, redirect to another activity
                    Intent intent = new Intent(admin_page.this, school_activity.class);
                    startActivity(intent);
                    finish(); // Close the login activity
                } else {
                    // Show an error message or handle unsuccessful login
                    // For simplicity, we just show a toast message
                    // You may want to implement a better feedback mechanism
                    Toast.makeText(admin_page.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
