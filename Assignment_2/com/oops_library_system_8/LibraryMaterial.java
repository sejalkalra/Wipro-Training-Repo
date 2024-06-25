package com.oops_library_system_8;

abstract class LibraryMaterial {
    String title;
    String author;
    
    public LibraryMaterial(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void checkout();
    abstract void returnMaterial();
}

