package com.example.android.musicpicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
//***************************************************ROMANTIC SONGS INTENT********************************************************/
        TextView romantic_text = (TextView) findViewById(R.id.romantic_text);
        romantic_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent romantic_songs_list = new Intent(CategoriesActivity.this, RomanticSongs.class);
                startActivity(romantic_songs_list);
            }
        });

        ImageView romantic_image = (ImageView) findViewById(R.id.romantic_image);
        romantic_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent romantic_songs_list = new Intent(CategoriesActivity.this, RomanticSongs.class);
                startActivity(romantic_songs_list);
            }
        });
//***************************************************SAD SONGS INTENT**************************************************************/
        TextView sad_text = (TextView) findViewById(R.id.sad_text);
        sad_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sad_songs_list = new Intent(CategoriesActivity.this, sadsongs.class);
                startActivity(sad_songs_list);
            }
        });

        ImageView sad_image = (ImageView) findViewById(R.id.sad_image);
        sad_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sad_songs_list = new Intent(CategoriesActivity.this, sadsongs.class);
                startActivity(sad_songs_list);
            }
        });
//***************************************************TRANCE SONGS INTENT***********************************************************/
        TextView trance_text = (TextView) findViewById(R.id.trance_text);
        trance_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trance_songs_list = new Intent(CategoriesActivity.this, trancesongs.class);
                startActivity(trance_songs_list);
            }
        });

        ImageView trance_image = (ImageView) findViewById(R.id.trance_image);
        trance_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trance_songs_list = new Intent(CategoriesActivity.this, trancesongs.class);
                startActivity(trance_songs_list);
            }
        });
//***************************************************HIP HOP SONGS INTENT**********************************************************/
        TextView hiphop_text = (TextView) findViewById(R.id.hiphop_text);
        hiphop_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hiphop_songs_list = new Intent(CategoriesActivity.this, hiphopsongs.class);
                startActivity(hiphop_songs_list);
            }
        });

        ImageView hiphop_image = (ImageView) findViewById(R.id.hiphop_image);
        hiphop_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hiphop_songs_list = new Intent(CategoriesActivity.this, hiphopsongs.class);
                startActivity(hiphop_songs_list);
            }
        });
//***************************************************WORKOUT SONGS INTENT**********************************************************/
       TextView workout_text = (TextView) findViewById(R.id.workout_text);
        workout_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent workout_songs_list = new Intent(CategoriesActivity.this, workoutsongs.class);
                startActivity(workout_songs_list);
            }
        });

        ImageView workout_image = (ImageView) findViewById(R.id.workout_image);
        workout_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent workout_songs_list = new Intent(CategoriesActivity.this, workoutsongs.class);
                startActivity(workout_songs_list);
            }
        });
//***************************************************JAZZ SONGS INTENT*************************************************************/
        TextView jazz_text = (TextView) findViewById(R.id.jazz_text);
        jazz_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jazz_songs_list = new Intent(CategoriesActivity.this, jazzsongs.class);
                startActivity(jazz_songs_list);
            }
        });

        ImageView jazz_image = (ImageView) findViewById(R.id.jazz_image);
        jazz_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jazz_songs_list = new Intent(CategoriesActivity.this, jazzsongs.class);
                startActivity(jazz_songs_list);
            }
        });

    }
}
