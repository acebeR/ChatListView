package com.example.rebecadivina.chatlistview.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.example.rebecadivina.chatlistview.R;
import com.example.rebecadivina.chatlistview.model.Login;


/*
    1- Aplicativo de chat
        Primeira tela: login
        Segunda tela: lista de fotos com informações de cada pessoa(nome e telefone)
        Terceira tela: Quando clica na pessoa, ela deve mostrar tipo um perfil dela

 */
public class MainActivity extends Activity implements View.OnClickListener{

    EditText email,senha;
    Button entrar;
    TextView erro;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        entrar = findViewById(R.id.entrar);
        entrar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Button btn = findViewById(view.getId());


        if(btn != null){

            Login l = new Login();
            l.setEmail("admin@gmail.com");
            l.setSenha("1234");

            erro = (TextView) findViewById(R.id.erro);
            email = (EditText) findViewById(R.id.email);
            senha = (EditText) findViewById(R.id.senha);

            if(email.getText().toString().equals(l.getEmail()) && senha.getText().toString().equals(l.getSenha())){
                intent = new Intent(this, ListaActivity.class);

                startActivity(intent);
            }else{
                erro.setText("Email ou senha incorretos!!");

            }

        }
    }
}
