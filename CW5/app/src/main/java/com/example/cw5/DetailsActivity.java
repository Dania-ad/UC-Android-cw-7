package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView textname = findViewById(R.id.textViewNameD);
        TextView textprice = findViewById(R.id.textViewPriceD);
        ImageView img = findViewById(R.id.imageViewDetails);

        Bundle bundle = getIntent().getExtras();

        Fruits fruit = (Fruits) bundle.getSerializable("fruit");

        textname.setText(fruit.getFruitName());
        textprice.setText(fruit.getFruitPrice()+" KD/Kilo");
        Picasso.with(this).load(fruit.getFruitImg()).into(img);


    }
}