package com.example.leado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class activity_firstCourse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_course);

        ImageView courses = (ImageView) findViewById(R.id.imageView6);
        courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCourses();
            }
        });

        ImageView achievements = (ImageView) findViewById(R.id.imageView7);
        achievements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAchievements();
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

    public void openAchievements(){
        Intent intent = new Intent(this, activity_Acheivements.class);
        startActivity(intent);
    }

    public void openProfile(){
        Intent intent = new Intent(this, activity_Profile.class);
        startActivity(intent);
    }
}