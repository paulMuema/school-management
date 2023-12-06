/*package com.example.schoolmanagement;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class course_page extends AppCompatActivity {

    private DatabaseReference databaseReference;
    private FirebaseUser currentUser;

    FirebaseDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_page2);

        // Get the current user
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        currentUser = firebaseAuth.getCurrentUser();

        // Get a reference to the Firebase Realtime Database
        databaseReference = FirebaseDatabase.getInstance().getReference("students");

        // Assuming you have a layout with checkboxes for courses
        final CheckBox checkBoxCourse1 = findViewById(R.id.checkBoxCourse1);
        final CheckBox checkBoxCourse2 = findViewById(R.id.checkBoxCourse2);
        final CheckBox checkBoxCourse3 = findViewById(R.id.checkBoxCourse3);
        final CheckBox checkBoxCourse4 = findViewById(R.id.checkBoxCourse4);
        final CheckBox checkBoxCourse5 = findViewById(R.id.checkBoxCourse5);
        // Add more checkboxes for additional courses

        Button buttonSubmit = findViewById(R.id.submitButton);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the selected courses
                Map<String, Boolean> selectedCourses = new HashMap<>();
                selectedCourses.put("course_id_1", checkBoxCourse1.isChecked());
                selectedCourses.put("course_id_2", checkBoxCourse2.isChecked());
                selectedCourses.put("course_id_3", checkBoxCourse3.isChecked());
                selectedCourses.put("course_id_4", checkBoxCourse4.isChecked());
                selectedCourses.put("course_id_5", checkBoxCourse5.isChecked());
                // Add more courses as needed

                // Save course selections to Firebase for the current user
                saveCourseSelections(selectedCourses);
            }
        });
    }

    private void saveCourseSelections(Map<String, Boolean> selectedCourses) {
        if (currentUser != null) {
            // Save course selections to Firebase
            String studentId = currentUser.get();
            databaseReference.child(studentId).child("courses").setValue(selectedCourses);

            Toast.makeText(this, "Course selections saved successfully", Toast.LENGTH_SHORT).show();
        } else {
            // Handle the case where the user is not authenticated
            Toast.makeText(this, "User not authenticated", Toast.LENGTH_SHORT).show();
        }
    }
}
*/