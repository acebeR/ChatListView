package com.example.rebecadivina.chatlistview.activity;


import android.app.Activity;
import android.content.Intent;

import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.AdapterView;
import android.widget.ListView;

import com.example.rebecadivina.chatlistview.R;
import com.example.rebecadivina.chatlistview.adapter.AdapterPessoa;
import com.example.rebecadivina.chatlistview.model.Pessoa;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListaActivity extends Activity  implements AdapterView.OnItemClickListener{

    AdapterPessoa adapter;
    ListView listView;
    Intent intent1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);


        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Frozen",19, R.drawable.frozen,"frozen@gmail.com","123"));
        pessoas.add(new Pessoa("Ariana",23, R.drawable.ariana,"ariana@gmail.com","123"));
        pessoas.add(new Pessoa("Zeed",19, R.drawable.zeed,"zeed@gmail.com","123"));

        adapter = new AdapterPessoa(this, pessoas);

        listView = findViewById(R.id.lista);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Pessoa pessoa = (Pessoa) adapter.getItem(i);
        Log.d("teste ( nome )", pessoa.getNome());
        intent1 = new Intent(this, PerfilActivity.class);
        intent1.putExtra("objPessoa", pessoa);
        startActivity(intent1);


    }
}
