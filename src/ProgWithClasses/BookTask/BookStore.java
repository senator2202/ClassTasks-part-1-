package ProgWithClasses.BookTask;

import java.util.Random;

public class BookStore {
    private Book[] books;

    public BookStore(int n){
        books=new Book[n];
        Random r=new Random();
        String []authors={"Роулинг","Браун","Донцова"};
        String []houses={"Выснова","Распберри","Минск"};
        String []covers={"твердая","мягкая"};
        for(int i=0;i<n;i++){
            books[i]=new Book();
            books[i].setId(r.nextInt(100));
            books[i].setAuthor(authors[r.nextInt(3)]);
            books[i].setPublishingHouse(houses[r.nextInt(3)]);
            books[i].setYear(r.nextInt(20)+2000);
            books[i].setPages(r.nextInt(300)+300);
            books[i].setPrice(r.nextInt(30)+30);
            books[i].setCover(covers[r.nextInt(2)]);
        }
    }

    public String getBooksByAuthor(String author){
        String res=new String();
        for(int i=0;i<books.length;i++)
            if(books[i].getAuthor().compareTo(author)==0)
                res+=books[i].toString()+"\n";
        return res;
    }

    public String getBooksByPublishingHouse(String house){
        String res=new String();
        for(int i=0;i<books.length;i++)
            if(books[i].getPublishingHouse().compareTo(house)==0)
                res+=books[i].toString()+"\n";
        return res;
    }

    public String getBooksAfterYear(int year){
        String res=new String();
        for(int i=0;i<books.length;i++)
            if(books[i].getYear()>year)
                res+=books[i].toString()+"\n";
        return res;
    }

    public String getBooks() {
        String res = new String();
        for (int i = 0; i < books.length; i++)
            res += books[i].toString() + "\n";
        return res;
    }

}
