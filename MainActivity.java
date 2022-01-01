package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText et1,et2;
RadioButton one,two,three;
Button button;
TextView result;
Double d1,d2,dres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.weight);
        et2=findViewById(R.id.height);
        one=findViewById(R.id.m);
        two=findViewById(R.id.cm);
        three=findViewById(R.id.feet);
        button=findViewById(R.id.but);
        result=findViewById(R.id.res);

      button.setOnClickListener(View -> {

          d1= Double.parseDouble(et1.getText().toString());
          d2= Double.parseDouble(et2.getText().toString());

         if(one.isChecked())
         {
             dres=d1/(d2*d2);
             if(dres<18.5)
             {
                 result.setText("Under weight"+dres.toString());
             }
             else if(dres>18.5 && dres<24.9)
             {
                 result.setText("normal"+dres.toString());
             }

             else if(dres>24.9 && dres<29.9)
             {
                 result.setText("over weight"+dres.toString());
             }
             else if (dres>30)
             {
                 result.setText("obese"+dres.toString());
             }
         }

          if(two.isChecked())
          {
              dres=d1/((d2/100)*(d2/100));
              if(dres<18.5)
              {
                  result.setText("Under weight"+dres.toString());
              }
              else if(dres>18.5 && dres<24.9)
              {
                  result.setText("normal"+dres.toString());
              }

              else if(dres>24.9 && dres<29.9)
              {
                  result.setText("over weight"+dres.toString());
              }
              else if(dres>30)
              {
                  result.setText("obese"+dres.toString());
              }

          }

          if(three.isChecked())
          {
              dres=d1/((d2*0.30)*(d2*0.30));
              if(dres<18.5)
              {
                  result.setText("Under weight"+dres.toString());
              }
              else if(dres>18.5 && dres<24.9)
              {
                  result.setText("normal"+dres.toString());
              }

              else if(dres>24.9 && dres<29.9)
              {
                  result.setText("over weight"+dres.toString());
              }
              else if(dres>30)
              {
                  result.setText("obese"+dres.toString());
              }
          }
      });
    }
}