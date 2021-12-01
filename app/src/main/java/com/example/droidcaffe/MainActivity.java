package com.example.droidcaffe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView img1, img2, img3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = (ImageView) findViewById(R.id.imageView);
        img2 = (ImageView) findViewById(R.id.imageView2);
        img3 = (ImageView) findViewById(R.id.imageView3);
        button = (Button) findViewById(R.id.button);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast( getResources().getString(R.string.donut_order_message));
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast( getResources().getString(R.string.ice_cream_order_message));
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToast( getResources().getString(R.string.froyo_order_message));
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFoodOrder();
            }
        });
    }
    public void displayToast(String message) {
        Toast.makeText( getApplicationContext(), message, Toast.LENGTH_SHORT ).show();
    }

    public void showFoodOrder(){
        Intent intent = new Intent(this,deliveryService.class);
        startActivity(intent);
    }

}