package com.example.numbers;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class NumberActivity extends AppCompatActivity {

    public static final String EXTRA_NUMBER = "extra_number";

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        int number = getIntent().getIntExtra(EXTRA_NUMBER, 0);

        ImageView imageView = findViewById(R.id.imageView);
        switch (number) {
            case 0:
                imageView.setImageResource(R.drawable.zero);
                break;
            case 1:
                imageView.setImageResource(R.drawable.one);
                break;
            case 2:
                imageView.setImageResource(R.drawable.two);
                break;
            case 3:
                imageView.setImageResource(R.drawable.three);
                break;
            case 4:
                imageView.setImageResource(R.drawable.four);
                break;
            case 5:
                imageView.setImageResource(R.drawable.five);
                break;
            case 6:
                imageView.setImageResource(R.drawable.six);
                break;
            case 7:
                imageView.setImageResource(R.drawable.seven);
                break;
            case 8:
                imageView.setImageResource(R.drawable.eight);
                break;
            case 9:
                imageView.setImageResource(R.drawable.nine);
                break;
            default:
                break;
        }

        // Find the corresponding sound and create a MediaPlayer object
        switch (number) {
            case 0:
                mediaPlayer = MediaPlayer.create(this, R.raw.zero);
                break;
            case 1:
                mediaPlayer = MediaPlayer.create(this, R.raw.one);
                break;
            case 2:
                mediaPlayer = MediaPlayer.create(this, R.raw.two);
                break;
            case 3:
                mediaPlayer = MediaPlayer.create(this, R.raw.three);
                break;
            case 4:
                mediaPlayer = MediaPlayer.create(this, R.raw.four);
                break;
            case 5:
                mediaPlayer = MediaPlayer.create(this, R.raw.five);
                break;
            case 6:
                mediaPlayer = MediaPlayer.create(this, R.raw.six);
                break;
            case 7:
                mediaPlayer = MediaPlayer.create(this, R.raw.seven);
                break;
            case 8:
                mediaPlayer = MediaPlayer.create(this, R.raw.eight);
                break;
            case 9:
                mediaPlayer = MediaPlayer.create(this, R.raw.nine);
                break;
            default:
                break;
        }

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
