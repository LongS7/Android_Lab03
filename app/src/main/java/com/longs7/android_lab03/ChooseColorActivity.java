package com.longs7.android_lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ChooseColorActivity extends AppCompatActivity {

    private ImageView imgImage;
    private TextView tvColor;
    private TextView tvSupplier;
    private TextView tvPrice;

    private PhoneColor blackPhone;
    private PhoneColor bluePhone;
    private PhoneColor whitePhone;
    private PhoneColor redPhone;
    private PhoneColor selectedPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_color);

        blackPhone = new PhoneColor(R.drawable.vsmart_black, "Đen", "Tiki Trading", "1.790.000 đ");
        bluePhone = new PhoneColor(R.drawable.vsmart_live_blue, "Xanh", "Tiki Trading", "1.790.000 đ");
        whitePhone = new PhoneColor(R.drawable.vs_bac, "Trắng", "Tiki Ttrading", "1.790.000 đ");
        redPhone = new PhoneColor(R.drawable.vs_red, "Đỏ", "Tiki Ttrading", "1.790.000 đ");

        imgImage = findViewById(R.id.image);
        tvColor = findViewById(R.id.color);
        tvSupplier = findViewById(R.id.supplier);
        tvPrice = findViewById(R.id.price);

        Button btnBlack = findViewById(R.id.rb_black);
        btnBlack.setOnClickListener(v -> changeColor("Black"));

        Button btnBlue = findViewById(R.id.rb_blue);
        btnBlue.setOnClickListener(v -> changeColor("Blue"));

        Button btnRed = findViewById(R.id.rb_red);
        btnRed.setOnClickListener(v -> changeColor("Red"));

        Button btnBac = findViewById(R.id.rb_white);
        btnBac.setOnClickListener(v -> changeColor("White"));

        findViewById(R.id.btnXong).setOnClickListener(v -> {
            Intent intent = new Intent(ChooseColorActivity.this, ChooseColorActivity.class);

            Bundle bundle = new Bundle();
            bundle.putInt("image", selectedPhone.getImage());
            bundle.putString("color", selectedPhone.getColor());
            bundle.putString("supplier", selectedPhone.getSupplier());
            bundle.putString("price", selectedPhone.getPrice());

            intent.putExtra("result", bundle);

            setResult(13, intent);

            finish();
        });
    }

    private void changeColor(String color) {
        findViewById(R.id.color_label).setVisibility(View.VISIBLE);
        tvColor.setVisibility(View.VISIBLE);
        findViewById(R.id.supplier_label).setVisibility(View.VISIBLE);
        tvSupplier.setVisibility(View.VISIBLE);
        tvPrice.setVisibility(View.VISIBLE);

        if(color.equals("Black")) {
            imgImage.setImageResource(blackPhone.getImage());
            tvColor.setText(blackPhone.getColor());
            selectedPhone = blackPhone;
        }
        if(color.equals("Blue")) {
            imgImage.setImageResource(bluePhone.getImage());
            tvColor.setText(bluePhone.getColor());
            selectedPhone = bluePhone;
        }
        if(color.equals("Red")) {
            imgImage.setImageResource(redPhone.getImage());
            tvColor.setText(redPhone.getColor());
            selectedPhone = redPhone;
        }
        if(color.equals("White")) {
            imgImage.setImageResource(whitePhone.getImage());
            tvColor.setText(whitePhone.getColor());
            selectedPhone = whitePhone;
        }


    }
}
