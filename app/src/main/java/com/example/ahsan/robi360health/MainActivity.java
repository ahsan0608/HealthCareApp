package com.example.ahsan.robi360health;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        //Set Event
        setSingleEvent(mainGrid);
        //setToggleEvent(mainGrid);
    }

    private void setToggleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(MainActivity.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(MainActivity.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //Toast.makeText(MainActivity.this, "Clicked: "+finalI, Toast.LENGTH_SHORT).show();

                    if (finalI==0){
                    Intent intent = new Intent(MainActivity.this,MedicineMainActivity.class);
                    //intent.putExtra("info","This is activity from card item index  "+finalI);
                    startActivity(intent);
                    } else if (finalI==1){
                        Intent intent = new Intent(MainActivity.this,BloodBankMainActivity.class);
                        //intent.putExtra("info","This is activity from card item index  "+finalI);
                        startActivity(intent);
                    } else if (finalI==2){
                        Toast.makeText(MainActivity.this, "This service is unavailable now.: "+finalI, Toast.LENGTH_SHORT).show();
                    } else if (finalI==3){
                        Toast.makeText(MainActivity.this, "This service is unavailable now."+finalI, Toast.LENGTH_SHORT).show();
                    } else if (finalI==4){
                        Intent intent = new Intent(MainActivity.this,MapsActivity.class);
                        //intent.putExtra("info","This is activity from card item index  "+finalI);
                        startActivity(intent);
                    } else if (finalI==5){
                        Toast.makeText(MainActivity.this, "This service is unavailable now."+finalI, Toast.LENGTH_SHORT).show();
                    } else if (finalI==6){
                        Toast.makeText(MainActivity.this, "This service is unavailable now."+finalI, Toast.LENGTH_SHORT).show();
                    } else if (finalI==7){
                        Toast.makeText(MainActivity.this, "This service is unavailable now."+finalI, Toast.LENGTH_SHORT).show();
                    } else if (finalI==8){
                        Intent intent = new Intent(MainActivity.this,MapsActivity.class);
                        //intent.putExtra("info","This is activity from card item index  "+finalI);
                        startActivity(intent);
                    } else if (finalI==9){
                        Intent intent = new Intent(MainActivity.this,MapsActivity.class);
                        //intent.putExtra("info","This is activity from card item index  "+finalI);
                        startActivity(intent);
                    } else if (finalI==10){
                        Toast.makeText(MainActivity.this, "This service is unavailable now."+finalI, Toast.LENGTH_SHORT).show();
                    }



                }
            });
        }
    }
}