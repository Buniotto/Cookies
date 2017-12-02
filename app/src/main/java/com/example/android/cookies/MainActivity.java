package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int status = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        if (status == 0) {
            // TODO: Find a reference to the ImageView in the layout. Change the image.
            ImageView changeImage = (ImageView) findViewById(R.id.android_cookie_image_view);
            changeImage.setImageResource(R.drawable.after_cookie);
            // TODO: Find a reference to the TextView in the layout. Change the text.
            TextView changeText = (TextView) findViewById(R.id.status_text_view);
            changeText.setText("I'm so full");
            TextView changeTextButton = (TextView) findViewById(R.id.status_button_view);
            changeTextButton.setText("Another Cookie?");
            status = 1;
        } else {
            // TODO: Find a reference to the ImageView in the layout. Change the image.
            ImageView changeImage = (ImageView) findViewById(R.id.android_cookie_image_view);
            changeImage.setImageResource(R.drawable.before_cookie);
            // TODO: Find a reference to the TextView in the layout. Change the text.
            TextView changeText = (TextView) findViewById(R.id.status_text_view);
            changeText.setText("I'm so hungry");
            TextView changeTextButton = (TextView) findViewById(R.id.status_button_view);
            changeTextButton.setText("Eat Cookie");
            status = 0;
        }
    }
}