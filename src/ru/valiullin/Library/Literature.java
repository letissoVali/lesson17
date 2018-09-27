package ru.valiullin.Library;

import java.io.Serializable;

public abstract class Literature implements Serializable {
    private static final long serialVersionUID = 423678063775130904L;
    protected String name;
    protected String author;
    protected int pages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Literature{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }

    abstract String showInLib();

}
