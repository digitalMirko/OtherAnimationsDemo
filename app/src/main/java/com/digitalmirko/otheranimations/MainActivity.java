package com.digitalmirko.otheranimations;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    public void fade(View view) {

        Log.i("Info","Imageview clicked");

        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);

        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);

        // translate = move, move down by 1000dp in 2 seconds
//        bartImageView.animate().translationYBy(1000).setDuration(2000);

        // translate left, disappears to the left completely off the screen
//        bartImageView.animate().translationXBy(-1200).setDuration(2000);


        // rotation bart 180 deg in 1 second, he's standing on his head
//        bartImageView.animate().rotation(180).setDuration(1000);


        // rotation bart 5 times 360 deg in 1 second, lands back on his feet
//        bartImageView.animate().rotation(1800).setDuration(1000);

        // combine animations
        // rotation bart 5 times 360 deg in 1 second, lands back on his feet
        // then he fades out to nothing
//        bartImageView.animate().rotation(1800).alpha(0).setDuration(1000);

        // scale: scale to a particular value or by a particular value
        // scale to .5 in size with a duration of 1 second, use floats for types
//        bartImageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // challenge: animate bart into existence
        // start the app into a blank screen, bart spins into action from the left
        // after the animation he should be full screen as originally

        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);

//        bartImageView.animate().translationXBy(-1000);

        bartImageView.setX(-1000);

        // brings bart from left into view, rotates 10 times in 2 seconds
        bartImageView.animate().translationXBy(1000).rotation(3600).setDuration(2000);
    }
}
