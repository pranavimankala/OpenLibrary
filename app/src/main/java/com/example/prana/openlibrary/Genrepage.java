package com.example.prana.openlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Genrepage extends AppCompatActivity {
    private  View view;
    ListView glst;
    int[] images = new int[]{R.drawable.autobiography
            , R.drawable.chickflick
            , R.drawable.comics
            , R.drawable.fantasy
            , R.drawable.kids
            , R.drawable.mythology
            , R.drawable.romancee
            , R.drawable.sciencefic
            , R.drawable.teenfic};
    String[] names = new String[]{"Autobiography", "Chick Flick", "Comics", "Fantasy", "Kids", "Mythology",
            "Romance", "Teen Fiction","Science Fiction"  };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genrepage);
        glst = (ListView) findViewById(R.id.listview);
        CustomAdaptor C = new CustomAdaptor();
        glst.setAdapter(C);
        glst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent mIntent = new Intent(Genrepage.this, Autobiography.class);
                    startActivity(mIntent);
                }
                if (position == 1) {
                    Intent mIntent = new Intent(Genrepage.this, Chickflick.class);
                    startActivity(mIntent);
                }

                if (position == 2) {
                    Intent mIntent = new Intent(Genrepage.this, Comics.class);
                    startActivity(mIntent);
                }
                if (position == 3) {
                    Intent mIntent = new Intent(Genrepage.this, Fantasy.class);
                    startActivity(mIntent);
                }
                if (position == 4) {
                    Intent mIntent = new Intent(Genrepage.this,Kids.class);
                    startActivity(mIntent);
                }
                if (position == 5) {
                    Intent mIntent = new Intent(Genrepage.this, Mythology.class);
                    startActivity(mIntent);
                }
                if (position == 6) {
                    Intent mIntent = new Intent(Genrepage.this, Romance.class);
                    startActivity(mIntent);
                }
                if (position == 7) {
                    Intent mIntent = new Intent(Genrepage.this, Teenfic.class);
                    startActivity(mIntent);
                }
                if (position == 8) {
                    Intent mIntent = new Intent(Genrepage.this, Sciencefic.class);
                    startActivity(mIntent);
                }
            }
            });

    }

    class CustomAdaptor extends BaseAdapter {


        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup viewGroup) {
            View view = getLayoutInflater().inflate(R.layout.customlayout, null);
            ImageView imgv = view.findViewById(R.id.imageView1);
            TextView txtv = view.findViewById(R.id.textview);
            imgv.setImageResource(images[i]);
            txtv.setText(names[i]);
            return view;

        }

    }
    }



