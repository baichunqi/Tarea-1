package com.example.llamandoawalter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView = null;
    private ImageButton imageButton = null;
    private ImageView imageView = null;

    // True if calling...
    private boolean isCalling = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        textView = (TextView) findViewById( R.id.textView );
        imageButton = (ImageButton) findViewById( R.id.imageButton );
        imageButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!isCalling) {
                    // Is calling now!
                    textView.setText( R.string.txt_calling );
                    imageButton.setImageResource(R.drawable.colgar);
                    imageView.setImageResource( R.drawable.walterwhite2 );
                    isCalling = true;
                } else {
                    textView.setText( R.string.txt_call_end );
                    imageButton.setImageResource(R.drawable.llamar);
                    imageView.setImageResource( R.drawable.walterwhite );
                    isCalling = false;
                }
            }

        });
        imageView = (ImageView) findViewById( R.id.imageView );
    }
}