package com.elgindy.sendemailbyjavaemailapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.elgindy.sendemailbyjavaemailapi.MainActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        // ir de una actvidad a otra
        Button btninicio; // id del boton
        btninicio=(Button) findViewById((R.id.btnini));
        btninicio.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick( View view){
                Intent btninicio = new Intent(MainActivity2.this, MainActivity.class);// donde esta a donde quiere ir
                startActivity(btninicio);

            }
        });





    }
}