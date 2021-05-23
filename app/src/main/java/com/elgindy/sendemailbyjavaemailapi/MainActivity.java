package com.elgindy.sendemailbyjavaemailapi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // ir de una actvidad a otra
        Button btnconocenos; // id del boton
        btnconocenos=(Button) findViewById((R.id.btnconocenos));
        btnconocenos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick( View view){
                Intent  btnconocenos = new Intent(MainActivity.this,MainActivity2.class);// donde esta a donde quiere ir
                startActivity(btnconocenos);

            }
        });


        // ir de una actvidad a otra
        Button btndonde; // id del boton
        btndonde=(Button) findViewById((R.id.btndonde));
        btndonde.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick( View view){
                Intent  btndonde = new Intent(MainActivity.this,dondeestamos.class);// donde esta a donde quiere ir
                startActivity(btndonde);

            }
        });


        // ir de una actvidad a otra
        Button btncontactanos; // id del boton
        btncontactanos=(Button) findViewById((R.id.btncontactanos));
        btncontactanos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick( View view){
                Intent  btncontactanos = new Intent(MainActivity.this,contacto.class);// donde esta a donde quiere ir
                startActivity(btncontactanos);

            }
        });






    }





}