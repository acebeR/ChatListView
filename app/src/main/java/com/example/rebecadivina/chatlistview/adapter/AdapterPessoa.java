package com.example.rebecadivina.chatlistview.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rebecadivina.chatlistview.R;
import com.example.rebecadivina.chatlistview.model.Pessoa;

import java.util.List;

public class AdapterPessoa  extends BaseAdapter {

    Activity activity;
    List<Pessoa> pessoas;

    public AdapterPessoa(Activity activity, List<Pessoa> pessoas) {
        this.activity = activity;
        this.pessoas = pessoas;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public int getCount() {
        return pessoas.size();
    }

    @Override
    public Object getItem(int i) {
        return pessoas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Pessoa pessoa = pessoas.get(i);

        view = View.inflate(activity, R.layout.list_pessoas, null);

        TextView nome = view.findViewById(R.id.nome);
        TextView email = view.findViewById(R.id.email);
        ImageView img = view.findViewById(R.id.foto);

        nome.setText(pessoa.getNome());
        email.setText(pessoa.getEmail());
        img.setImageResource(pessoa.getImagem());
        return view;
    }
}
