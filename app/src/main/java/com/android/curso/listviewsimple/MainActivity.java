package com.android.curso.listviewsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ListView listView;
    private List<String> lista=new ArrayList<>();
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.lista);
         lista.add("matemáticas");
        lista.add("lengua");
        lista.add("Historia");
        adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,lista);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,lista.get(i),Toast.LENGTH_LONG).show();
            }
        });
        Button btnEliminar=(Button)findViewById(R.id.button);
        btnEliminar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        EditText editText=(EditText)findViewById(R.id.editText);
        if(lista.contains(editText.getText().toString())){
            lista.remove(editText.getText().toString());
            adapter.notifyDataSetChanged();
        }else{
            Toast.makeText(MainActivity.this,"no existe el elemento",Toast.LENGTH_LONG).show();
        }

    }
}
