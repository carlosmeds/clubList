package br.ufpr.tads.clublist.model;

import android.graphics.drawable.Drawable;
import android.net.Uri;

public class Club {

    private String name;
    private String city;
    private String state;
    private String image;
    private String titulo;

    public Club() {
    }

    public Club(String name, String city, String state, String image, String titulo) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.image = image;
        this.titulo = titulo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String owner) {
        this.city = owner;
    }

    public String getState() { return state;}

    public void setState(String state){ this.state=state; }

    public Drawable getImage() { return Drawable.createFromPath(image); }

    public void setImage(String image) { this.image = image; }

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
}
