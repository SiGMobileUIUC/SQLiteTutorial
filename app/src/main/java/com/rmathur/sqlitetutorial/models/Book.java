package com.rmathur.sqlitetutorial.models;

public class Book {

    private int id;
    private String title;
    private String author;

    public Book(){
        // nothing
    }

    public Book(String title, String author) {
        super();
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author
                + "]";
    }
}
