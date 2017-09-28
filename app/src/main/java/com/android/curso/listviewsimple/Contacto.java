package com.android.curso.listviewsimple;

import android.graphics.drawable.Drawable;


public class Contacto {
    private String name;
    private Drawable img;

    public Contacto(String name, Drawable img) {
        this.name = name;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drawable getImg() {
        return img;
    }

    public void setImg(Drawable img) {
        this.img = img;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contacto)) return false;

        Contacto contacto = (Contacto) o;

        if (getName() != null ? !getName().equals(contacto.getName()) : contacto.getName() != null)
            return false;
        return getImg() != null ? getImg().equals(contacto.getImg()) : contacto.getImg() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getImg() != null ? getImg().hashCode() : 0);
        return result;
    }
}
