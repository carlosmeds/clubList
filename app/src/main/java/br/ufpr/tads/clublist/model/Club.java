package br.ufpr.tads.clublist.model;

public class Club {

    private String name;
    private String city;

    public Club() {
    }

    public Club(String name, String city) {
        this.name = name;
        this.city = city;
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
}
