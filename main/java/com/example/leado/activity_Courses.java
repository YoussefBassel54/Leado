package com.example.leado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_Courses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__courses);

        TextView selfAwareness = (TextView) findViewById(R.id.selfAwareness);
        selfAwareness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFirstCourse();
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

    public void openFirstCourse(){
        Intent intent = new Intent(this, activity_firstCourse.class);
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