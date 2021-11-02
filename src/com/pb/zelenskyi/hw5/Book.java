package com.pb.zelenskyi.hw5;

public class Book {
    private String namebook;
    private String nameaftor;
    private String yaer;

    public Book(String namebook, String nameaftor, String yaer) {
        this.namebook = namebook;
        this.nameaftor = nameaftor;
        this.yaer = yaer;
    }

    public Book() {

    }

    public String getNamebook() {
        return namebook;
    }

    public void setNamebook(String namebook) {
        this.namebook = namebook;
    }

    public String getNameaftor() {
        return nameaftor;
    }

    public void setNameaftor(String nameaftor) {
        this.nameaftor = nameaftor;
    }

    public String getYaer() {
        return yaer;
    }

    public void setYaer(String yaer) {
        this.yaer = yaer;
    }
}