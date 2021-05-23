package com.elgindy.sendemailbyjavaemailapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class contacto extends AppCompatActivity {


    // se declara el boton y la url
    private TextView t;
    private Button whatsapp;
    String url ="https://wa.me/573057684342";
    String url2 ="https://www.facebook.com/Pc-Tech-110166827930485";
    String url3 ="https://www.instagram.com/pctechcolombiatecnologia/";

// variables correo
    private EditText  subject, message;
    private String email = "pctechcolombiatecnologia@gmail.com";
    private Button button;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);



// procesos abrir links

        whatsapp= findViewById(R.id.whatsapp); //nombre del boton
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link =Uri.parse(url); //url para ir
                Intent i =new Intent (Intent.ACTION_VIEW,link);
                startActivity(i);
            }
        });

        // procesos abrir links facebook

        whatsapp= findViewById(R.id.facebook); //nombre del boton
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link =Uri.parse(url2); //url para ir
                Intent i =new Intent (Intent.ACTION_VIEW,link);
                startActivity(i);
            }
        });
        // procesos abrir links facebook

        whatsapp= findViewById(R.id.instagram); //nombre del boton
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link =Uri.parse(url3); //url para ir
                Intent i =new Intent (Intent.ACTION_VIEW,link);
                startActivity(i);
            }
        });

        // ir de una actvidad a otra
        Button btncontactanos; // id del boton
        btncontactanos=(Button) findViewById((R.id.btnini3));
        btncontactanos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick( View view){
                Intent  btncontactanos = new Intent(contacto.this,MainActivity.class);// donde esta a donde quiere ir
                startActivity(btncontactanos);

            }
        });

        // ir de una actvidad a otra
        Button buttoncontacto2; // id del boton
        btncontactanos=(Button) findViewById((R.id.buttoncontacto2));
        btncontactanos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick( View view){
                Intent  btncontactanos = new Intent(contacto.this,MainActivity.class);// donde esta a donde quiere ir
                startActivity(btncontactanos);

            }
        });

//proceso correo




        subject = findViewById(R.id.subject);
        message = findViewById(R.id.message);
        button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                senEmail();

                // funcion para mensaje
                Toast.makeText(getApplicationContext(),"Mensaje enviado Con exito.",Toast.LENGTH_LONG).show();
            }


        });



    }




    private void senEmail() {
        String mEmail = email.toString();
        String mSubject = subject.getText().toString();
        String mMessage = message.getText().toString();


        JavaMailAPI javaMailAPI = new JavaMailAPI(this, mEmail, mSubject, mMessage);

        javaMailAPI.execute();
    }





}