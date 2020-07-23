package com.example.leado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class activity_Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__profile);

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
    }

    public void openCourses(){
        Intent intent = new Intent(this, activity_Courses.class);
        startActivity(intent);
    }

    public void openAchievements(){
        Intent intent = new Intent(this, activity_Acheivements.class);
        startActivity(intent);
    }
}