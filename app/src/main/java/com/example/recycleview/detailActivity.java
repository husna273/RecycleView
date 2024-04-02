package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class detailActivity extends AppCompatActivity  {

    private TextView tvBuku, tvharga, tvDesc;
    private ImageView igCover;
    private Button btnshare;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailactivity);

        tvBuku=findViewById(R.id.tvBuku);
        tvharga=findViewById(R.id.tvharga);
        tvDesc=findViewById(R.id.tvDesc);
        igCover=findViewById(R.id.igCover);
        btnshare = findViewById(R.id.btnshare);

        int foto = getIntent().getIntExtra("foto", 0);
        String buku= getIntent().getStringExtra("buku");
        String harga = getIntent().getStringExtra("harga");
        String sinopsis = getIntent().getStringExtra("sinopsis");

        tvBuku.setText(buku);
        tvharga.setText(harga);
        tvDesc.setText(sinopsis);
        igCover.setImageResource(foto);


        btnshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = buku + "\n" + harga + "\n" + sinopsis + "\n";

                Intent share =new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT, text);

                startActivity(Intent.createChooser(share, " Pilih aplikasi untuk mengirim "));
            }
        });

    }

}