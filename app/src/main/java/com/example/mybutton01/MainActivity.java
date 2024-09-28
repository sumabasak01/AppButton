package com.example.mybutton01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    
    CheckBox Pizza,Burger,Coffee;
    Button Order;
    private Object String;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Pizza = findViewById(R.id.Pizza);
        Burger = findViewById(R.id.Burger);
        Coffee = findViewById(R.id.Coffee);
        Order = findViewById(R.id.Order);
        
        
        Order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked();
            }
        });
    }

    private void clicked() {

        String msg = "";
        if (Pizza.isChecked())
            msg = msg + "Pizza";
        if (Burger.isChecked())
            msg = msg + "\nBurger";
        if (Coffee.isChecked())
            msg = msg + "\nCoffee";

        Toast.makeText(this, msg+"is selected", Toast.LENGTH_SHORT).show();
        
    }

}










