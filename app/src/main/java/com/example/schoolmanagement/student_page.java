package com.example.schoolmanagement;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

/*import com.example.schoolmanagement.databinding.ActivityMainBinding;*/
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class student_page extends AppCompatActivity {

    private Button next_button;
    /*ActivityMainBinding binding;*/
    String fName, lName, sId;
    FirebaseDatabase db;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_page);

        EditText firstNameEditText = findViewById(R.id.first_name);
        EditText lastNameEditText = findViewById(R.id.last_name);
        EditText studentIdEditText = findViewById(R.id.student_id);
        Button registerButton = findViewById(R.id.register_button);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = firstNameEditText.getText().toString();
                String lastName = lastNameEditText.getText().toString();
                String studentId = studentIdEditText.getText().toString();

                if (!firstName.isEmpty() && !lastName.isEmpty() && !studentId.isEmpty()) {
                    Student_info users = new Student_info(firstName, lastName, studentId);
                    db = FirebaseDatabase.getInstance();
                    reference = db.getReference("Students");
                    reference.child(firstName).setValue(users).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            firstNameEditText.setText("");
                            lastNameEditText.setText("");
                            studentIdEditText.setText("");
                            Toast.makeText(student_page.this, "Successfuly Updated", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button course_button = findViewById(R.id.course_button);
        course_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(student_page.this, course_page.class);
                startActivity(intent);
                finish();
            }
        });
    }
}