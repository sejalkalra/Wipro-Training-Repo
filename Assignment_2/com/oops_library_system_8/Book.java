package com.oops_library_system_8;

class Book extends LibraryMaterial {
    int numberOfPages;
    
    public Book(String title, String author, int numberOfPages) {
        super(title, author);
        this.numberOfPages = numberOfPages;
    }
    
    @Override
    void checkout() {
        System.out.println("Book \"" + title + "\" by " + author + " has been checked out.");
    }
    
    @Override
    void returnMaterial() {
        System.out.println("Book \"" + title + "\" by " + author + " has been returned.");
    }
}
