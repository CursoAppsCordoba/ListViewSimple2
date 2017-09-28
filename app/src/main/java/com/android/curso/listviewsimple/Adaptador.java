package com.android.curso.listviewsimple;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by usuario on 28/09/2017.
 */

public class Adaptador extends ArrayAdapter<Contacto> {

    private List<Contacto> data;
    private int listItemResLayout;
    private Context context;

    public Adaptador(Context context, int resource, List<Contacto> objects) {
        super(context, resource, objects);
        this.data = objects;
        this.listItemResLayout = resource;
        this.context = context;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View item_lista = convertView;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            item_lista = inflater.inflate(R.layout.item, parent, false);
        }

        TextView nombre = (TextView) item_lista.findViewById(R.id.tv_name);
        ImageView img = (ImageView) item_lista.findViewById(R.id.img);




        return item_lista;
    }


}
