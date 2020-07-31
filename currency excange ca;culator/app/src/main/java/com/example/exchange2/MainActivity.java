package com.example.exchange2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button exchange=(Button)findViewById(R.id.EXCHANGE);
         exchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double rates=0;
                RadioButton canadaro = (RadioButton) findViewById(R.id.canada);
                RadioButton USAro= (RadioButton) findViewById(R.id.USA);
                RadioButton southafricaro=(RadioButton)findViewById(R.id.southafrica);
                RadioButton britainro=(RadioButton)findViewById(R.id.britain);
                if ( britainro.isChecked()){rates=141.29;
                    canadaro.setChecked(false);
                    USAro.setChecked(false);
                    southafricaro.setChecked(false);
                     }
                if (USAro.isChecked()){rates=107.74;
                    canadaro.setChecked(false);
                    USAro.setChecked(false);
                    southafricaro.setChecked(false);}
                if (southafricaro.isChecked()){rates=6.43;
                    canadaro.setChecked(false);
                    USAro.setChecked(false);
                    britainro.setChecked(false);
                    }
                if (canadaro.isChecked()){rates=80.28;
                    britainro.setChecked(false);
                    USAro.setChecked(false);
                    southafricaro.setChecked(false);
                    }
                EditText KSH =(EditText)findViewById(R.id.editTextKSH);
                TextView amount=(TextView)findViewById(R.id.textView3amount);
                float KSHx=Integer.parseInt(KSH.getText().toString());
                double output=KSHx/rates;
               if (canadaro.isChecked()){
                   amount.setText(output+" CAD");
               }
               if (USAro.isChecked()){
                   amount.setText(output+" USD");
               }
               if (southafricaro.isChecked()){
                   amount.setText(output+" ZAR");
               }
               if (britainro.isChecked()){
                   amount.setText(output+" GBP");
               }
                canadaro.setChecked(false);
                USAro.setChecked(false);
                southafricaro.setChecked(false);
                britainro.setChecked(false);

            }


    });
}}
