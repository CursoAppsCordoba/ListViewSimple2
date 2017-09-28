package com.android.curso.listviewsimple;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ListView listView;
    private List<Contacto> lista=new ArrayList<>();
    ArrayAdapter adapter;
    static long serialVersion=1L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* try {
            FileOutputStream out=this.openFileOutput("prueba.dat",this.MODE_PRIVATE);
            PrintStream p=new PrintStream(out);
            p.print("hola mundo");
            ObjectOutputStream x=new ObjectOutputStream(out);
            x.writeObject(new ArrayList<String>());
            p.flush();
            p.close();

            FileInputStream in=this.openFileInput("prueba.dat");
            ObjectInputStream b=new ObjectInputStream(in);
            ArrayList<String> c= (ArrayList<String>) b.readObject();
            Toast.makeText(this,"hola mundo",Toast.LENGTH_LONG).show();
            in.close();
            b.close();




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/


        Resources res = getResources();
        listView=(ListView)findViewById(R.id.lista);
        lista.add(new Contacto("pepe", res.getDrawable(R.drawable.ic_img)));
        lista.add(new Contacto("antonio", res.getDrawable(R.drawable.ic_img)));
        adapter=new ArrayAdapter(this,R.layout.item,lista);
        listView.setAdapter(adapter);
        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,lista.get(i),Toast.LENGTH_LONG).show();
            }
        });*/
        Button btnEliminar=(Button)findViewById(R.id.button);
        btnEliminar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    /*    EditText editText=(EditText)findViewById(R.id.editText);
        if(lista.contains(editText.getText().toString())){
            lista.remove(editText.getText().toString());
            adapter.notifyDataSetChanged();
        }else{
            Toast.makeText(MainActivity.this,"no existe el elemento",Toast.LENGTH_LONG).show();
        }

*/
        switch (view.getId()){
            case R.id.button:
                Intent intent=new Intent(this,Destino.class);
                Serializable x=this.new Evento1();
              intent.putExtra("evento",  x);
                startActivity(intent);
                break;
        }

    }

    public class Evento1 implements Serializable,View.OnClickListener {

        @Override
        public void onClick(View v) {

            System.out.println("hola mundo");

        }


    }


}
