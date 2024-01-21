package com.example.motivate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//here is the change
public class MainActivity extends AppCompatActivity {
TextView t;
EditText e;
Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e=findViewById(R.id.edt);
        b=findViewById(R.id.btn);
        t=findViewById(R.id.txt1);
         b.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                String input=e.getText().toString();
                Double cm=Double.parseDouble(input);
                 Double ans =convert(cm);
                t.setText(""+ans.intValue());
             }
         });




    }
public static double convert(double h){
    return  h/2.54;
}
}