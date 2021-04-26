package com.longs7.android_lab03;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_chon_mau).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ChooseColorActivity.class);

            startActivityForResult(intent, 13);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 13){
            Bundle bundle = data.getBundleExtra("result");

            ((TextView)findViewById(R.id.new_price)).setText(bundle.getString("price"));
            ((ImageView)findViewById(R.id.image)).setImageResource(bundle.getInt("image"));
        }

    }
}
