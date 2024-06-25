package com.oops_library_system_8;

public class Main {
    public static void main(String[] args) 
    {
        LibrarySystem librarySystem = new LibrarySystem();
        
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 224);
        Magazine magazine1 = new Magazine("National Geographic", "Various", 202);
        Audiobook audiobook1 = new Audiobook("1984", "George Orwell", "Simon Prebble");
        
        librarySystem.addMaterial(book1);
        librarySystem.addMaterial(magazine1);
        librarySystem.addMaterial(audiobook1);
        
        librarySystem.displayAvailableMaterials();
        
        librarySystem.checkoutMaterial(book1);
        librarySystem.checkoutMaterial(magazine1);
        
        librarySystem.displayAvailableMaterials();
        
        librarySystem.returnMaterial(book1);
        
        librarySystem.displayAvailableMaterials();
    }
}

