/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linkz
 */
public class Book {
    private String author;
    private String name;
    private int pageCount;
    
    public Book(String author, String name, int pageCount){
        this.author = author;
        this.name = name;
        this.pageCount = pageCount;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPages(){
        return this.pageCount;
    }
    
    public String toString(){
        return this.author + ", " + this.name + ", " + this.pageCount + " pages";
    }
    
}
