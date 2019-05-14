package com.example.prana.openlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Displaypage extends AppCompatActivity {
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displaypage);

        button3 = (Button) findViewById(R.id.button3);
        button2 = (Button) findViewById(R.id.button2);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomepage();
            }

        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutpage();
            }

        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGenrepage();
            }

        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openContactpage();
            }

        });




    }

    public void openAboutpage() {
        Intent intent = new Intent(this, Aboutpage.class);
        startActivity(intent);

    }
    public void openHomepage()
    {
        Intent intent = new Intent(this, Homepage.class );
        startActivity(intent);

    }

    public void openGenrepage()
    {
        Intent intent = new Intent(this, Genrepage.class );
        startActivity(intent);

    }
    public void openContactpage()
    {
        Intent intent = new Intent(this, Contactpage.class );
        startActivity(intent);

    }


}
