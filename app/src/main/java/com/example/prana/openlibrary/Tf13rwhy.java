package com.example.prana.openlibrary;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tf13rwhy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tf13rwhy);
    }
    public void buy22(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/Batman-Killing-Deluxe-Alan-Moore-ebook/dp/B009POHHRG/ref=sr_1_1?s=digital-text&ie=UTF8&qid=1507131678&sr=1-1&keywords=Batman%3A+The+Killing+Joke+alan+moore"));
        startActivity(browserIntent);
    }

    public void pdf22(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://getcomics.info/dc/batman-the-killing-joke/"));
        startActivity(browserIntent);
    }
}
