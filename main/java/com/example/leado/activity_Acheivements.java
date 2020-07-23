package com.example.leado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class activity_Acheivements extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__acheivements);

        ImageView courses = (ImageView) findViewById(R.id.imageView6);
        courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCourses();
            }
        });

        ImageView profile = (ImageView) findViewById(R.id.imageView8);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfile();
            }
        });
    }

    public void openCourses(){
        Intent intent = new Intent(this, activity_Courses.class);
        startActivity(intent);
    }

    public void openProfile(){
        Intent intent = new Intent(this, activity_Profile.class);
        startActivity(intent);
    }
}