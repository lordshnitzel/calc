package com.example.currencycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView usd, gbp;
    double u = 0,b = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        usd = findViewById(R.id.txtUSD);
        gbp = findViewById(R.id.txtGBP);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(usd.getText().toString() != "") {
                    if(u != Integer.parseInt(usd.getText().toString())) {
                        u = Integer.parseInt(usd.getText().toString());
                        gbp.setText(String.valueOf(u/1.31));
                    }else{
                        b = Integer.parseInt(gbp.getText().toString());
                        usd.setText(String.valueOf(b/1.31));
                    }
                }else if(gbp.getText().toString() != ""){
                    if(b != Integer.parseInt(gbp.getText().toString())) {
                        b = Integer.parseInt(gbp.getText().toString());
                        usd.setText(String.valueOf(b*1.31));
                    }else{
                        u = Integer.parseInt(usd.getText().toString());
                        gbp.setText(String.valueOf(u*1.31));
                    }
                }
            }
        });
    }
}
