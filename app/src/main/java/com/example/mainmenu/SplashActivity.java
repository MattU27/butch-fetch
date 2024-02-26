package com.example.mainmenu;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_DELAY = 2000; // 2 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Set a delay before starting the MainActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start MainActivity with slide animation
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in, android.R.anim.fade_out); // Apply slide in animation
                finish(); // Close splash screen
            }
        }, SPLASH_DELAY);
    }
}
