package com.derachmatt.utsprakmobileprog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailHokage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hokage);

        narimadata();

    }

    private void narimadata(){
        if(getIntent().hasExtra("gambar")&&getIntent().hasExtra("desc")){
            String gmbr = getIntent().getStringExtra("gambar");
            String des = getIntent().getStringExtra("desc");

            setup(gmbr, des);
        }
    }

    private void setup(String gmbr, String des){
        ImageView img = findViewById(R.id.gambar);
        Glide.with(this)
                .asBitmap()
                .load(gmbr)
                .into(img);

        TextView d = findViewById(R.id.desc);
        d.setText(des);
    }
}
