package com.oops_library_system_8;

class Audiobook extends LibraryMaterial {
    String narrator;
    
    public Audiobook(String title, String author, String narrator) {
        super(title, author);
        this.narrator = narrator;
    }
    
    @Override
    void checkout() {
        System.out.println("Audiobook \"" + title + "\" narrated by " + narrator + " has been checked out.");
    }
    
    @Override
    void returnMaterial() {
        System.out.println("Audiobook \"" + title + "\" narrated by " + narrator + " has been returned.");
    }
}

