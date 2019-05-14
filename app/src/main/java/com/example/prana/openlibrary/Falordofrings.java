package com.example.prana.openlibrary;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Falordofrings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_falordofrings);
    }
    public void buy11(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/Playing-My-Way-Sachin-Tendulkar/dp/1473605172/ref=sr_1_1?s=books&ie=UTF8&qid=1507045901&sr=1-1&keywords=playing+it+my+way"));
        startActivity(browserIntent);
    }

    public void pdf11(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nudge-book.com/wp-content/uploads/2014/11/Read-an-extract-from-Playing-It-My-Way.pdf"));
        startActivity(browserIntent);
    }

}
