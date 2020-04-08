package ProgWithClasses.BookTask;

public class Book {
    private int id;
    private String author;
    private String publishingHouse;
    private int year;
    private int pages;
    private int price;
    private String cover;

    public Book(){
        id=0;
        author="";
        publishingHouse="";
        year=0;
        pages=0;
        price=0;
        cover="";
    }

    public Book(int id, String author, String publishingHouse, int year, int pages, int price, String cover){
        this.id=id;
        this.author=author;
        this.publishingHouse=publishingHouse;
        this.year=year;
        this.pages=pages;
        this.price=price;
        this.cover=cover;
    }

    public void setId(int id){this.id=id;}
    public int getId(){return id;}
    public void setAuthor(String author){this.author=author;}
    public String getAuthor(){return author;}
    public void setPublishingHouse(String publishingHouse) {this.publishingHouse = publishingHouse;}
    public String getPublishingHouse(){return publishingHouse;}
    public void setYear(int year){this.year=year;}
    public int getYear(){return year;}
    public void setPages(int pages){this.pages=pages;}
    public int getPages(){return pages;}
    public void setPrice(int price){this.price=price;}
    public int getPrice(){return price;}
    public void setCover(String cover){this.cover=cover;}
    public String getCover(){return cover;}

    public String toString(){
        String res=new String();
        res="id: "+id+"; автор: "+author+"; издательство: "+publishingHouse+"; год: "+year;
        res=res+"; количество страниц: "+pages+"; цена: "+price+"; обложка: "+cover;
        return res;
    }
}
