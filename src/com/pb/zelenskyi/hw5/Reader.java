package com.pb.zelenskyi.hw5;

import java.util.Date;

public class Reader {
    private String PIB;
    private int readernumber;
    private String fakultet;
    private Date date;
    private int phone;

    public Reader() {

    }

    public Reader(String PIB, int readernumber, String fakultet, Date date, int phone) {
        this.PIB = PIB;
        this.readernumber = readernumber;
        this.fakultet = fakultet;
        this.date = date;
        this.phone = phone;
    }

    public String getPIB() {
        return PIB;
    }

    public void setPIB(String PIB) {
        this.PIB = PIB;
    }

    public int getReadernumber() {
        return readernumber;
    }

    public void setReadernumber(int readernumber) {
        this.readernumber = readernumber;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void takeBook(Integer count){
        System.out.println("\n"+ PIB +" взял:"+count+" книги"); ;
    }
    public void takeBook(String... namebooks) {
        System.out.print( this.PIB +" взял книги :"); ;
        for (String namebook : namebooks) {
            System.out.print(namebook+",");
        }
        System.out.println();
    }
    public void takeBook(Book... namebooks) {
        System.out.print( this.PIB +" взял книги :"); ;
        for ( Book book : namebooks) {
            System.out.print(book.getNamebook()+"( "+ book.getNameaftor()+" " + book.getYaer()+"),");
        }
        System.out.println();
    }
    public void returnBook(Integer count){
        System.out.println( PIB +" вернул:"+count+" книги"); ;
    }
    public void returnBook(String... namebooks) {
        System.out.print( this.PIB +" вернул книги :"); ;
        for (String namebook : namebooks) {
            System.out.print(namebook+",");
        }
        System.out.println("");
    }
    public void returnBook(Book... namebooks) {
        System.out.print( this.PIB +" вернул книги :"); ;
        for ( Book book : namebooks) {
            System.out.print(book.getNamebook()+"( "+ book.getNameaftor()+" " + book.getYaer()+"),");
        }
    }

}

