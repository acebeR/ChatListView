package com.example.rebecadivina.chatlistview.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rebecadivina.chatlistview.R;
import com.example.rebecadivina.chatlistview.model.Pessoa;

public class PerfilActivity extends Activity implements View.OnClickListener {

    Intent intent;
    TextView nome,email,idade;
    ImageView img;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        intent = getIntent();
        Pessoa p = (Pessoa) intent.getSerializableExtra("objPessoa");

        nome = (TextView) findViewById(R.id.nome);
        nome.setText(p.getNome());

        email = (TextView) findViewById(R.id.email);
        email.setText(p.getEmail());

        idade = (TextView) findViewById(R.id.idade);
        idade.setText(String.valueOf(p.getIdade()));

        img = (ImageView) findViewById(R.id.foto);
        img.setImageResource(p.getImagem());

        btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Button btn = findViewById(view.getId());
        if(btn != null){
            intent = new Intent(this, ListaActivity.class);
            startActivity(intent);
        }

    }
}
