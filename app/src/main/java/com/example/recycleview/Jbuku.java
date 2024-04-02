package com.example.recycleview;

public class Jbuku {
        private String nameItem, sinopsis, price;
        private int coverbuku;

        public Jbuku(String judulbuku, int coverbuku, String sinopsis, String price) {
            this.nameItem = judulbuku;
            this.coverbuku = coverbuku;
            this.sinopsis = sinopsis;
            this.price = price;
        }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        price = price;
    }

    public int getCoverbuku() {
        return coverbuku;
    }

    public void setCoverbuku(int coverbuku) {
        this.coverbuku = coverbuku;
    }
}

