package com.pb.zelenskyi.hw5;

import java.util.Date;

public class Library {
    public static void main(String[] args) {

        Book[] books = {new Book("Fantastic","Зеленский Д.","1999"),
                new Book("Science fiction","Козлов В.","2001"),
                new Book("Pulp fiction","Тарантино К.","1992")
        };
        Reader [] readers = {new Reader("Крумханзл П.",0,"PB",new Date(System.currentTimeMillis()),9379992),
                new Reader("Дубилет Д.",1,"MONO",new Date(System.currentTimeMillis()),228475786),
                new Reader("Кравчук Л.",2,"PB",new Date(System.currentTimeMillis()),123456789)
        };

        System.out.println("ALL BOOKS :");
        for (Book b:books){
            System.out.println(b.getNamebook()+" - "+b.getNameaftor()+" "+b.getYaer() + ",");
        }
        System.out.println("ALL READERS :");
        for (Reader r:readers){
            System.out.println(r.getPIB()+" "+r.getReadernumber()+" "+r.getFakultet() + " "+ r.getDate()+" "+r.getPhone()+",");
        }

        for (Reader r:readers){
            r.takeBook(books.length);
            r.returnBook(books.length);

            String [] names = new String[books.length];
            for (int i=0; i< books.length; i++){
                names[i]=books[i].getNamebook();
            }

            r.takeBook(names);
            r.takeBook(books);
            r.returnBook(names);
            r.returnBook(books);

        }
    }
}
