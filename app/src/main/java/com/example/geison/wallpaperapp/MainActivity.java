package com.example.geison.wallpaperapp;

import android.app.WallpaperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSetWallpaper = findViewById(R.id.button_set_wallpaper);
        ImageView wallpaper = findViewById(R.id.imageView_wallpaper);

        btnSetWallpaper.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());

                try {

                    wallpaperManager.setResource(+ R.drawable.wallpaper);
                } catch (IOException e) {

                    e.printStackTrace();
                }

                Toast.makeText(getApplicationContext(), "Papel de parede definido!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
