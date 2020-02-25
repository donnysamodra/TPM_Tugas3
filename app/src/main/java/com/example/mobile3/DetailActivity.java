package com.example.mobile3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mobile3.ModelPahlawan;
import com.example.mobile3.R;

public class DetailActivity extends AppCompatActivity {

    public static String EXTRA_DATA = "extra_data";
    private ImageView ivFoto;
    private TextView tvNama, tvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivFoto = findViewById(R.id.iv_FotoD);
        tvNama = findViewById(R.id.tv_NamaD);
        tvDescription = findViewById(R.id.tv_DescriptionD);


        ModelPahlawan pahlawan = getIntent().getParcelableExtra(EXTRA_DATA);
        int image = pahlawan.getHeroesImages();
        String nama = pahlawan.getHeroName();
        String description = pahlawan.getHeroDetails();

        if (pahlawan!=null){
            Glide.with(this).load(image).into(ivFoto);
            tvNama.setText(nama);
            tvDescription.setText(description);
        }

    }
}
