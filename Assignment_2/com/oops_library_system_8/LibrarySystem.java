package com.oops_library_system_8;

import java.util.ArrayList;
import java.util.List;

class LibrarySystem {
    List<LibraryMaterial> availableMaterials;

    public LibrarySystem() {
        this.availableMaterials = new ArrayList<>();
    }

    public void addMaterial(LibraryMaterial material) {
        availableMaterials.add(material);
        System.out.println("Added \"" + material.title + "\" to the library.");
    }

    public void displayAvailableMaterials() {
        System.out.println("Available Materials:");
        for (LibraryMaterial material : availableMaterials) {
            if (material instanceof Book) {
                Book book = (Book) material;
                System.out.println("- Book: \"" + book.title + "\" by " + book.author + ", Pages: " + book.numberOfPages);
            } else if (material instanceof Magazine) {
                Magazine magazine = (Magazine) material;
                System.out.println("- Magazine: \"" + magazine.title + "\" by " + magazine.author + ", Issue: " + magazine.issueNumber);
            } else if (material instanceof Audiobook) {
                Audiobook audiobook = (Audiobook) material;
                System.out.println("- Audiobook: \"" + audiobook.title + "\" by " + audiobook.author + ", Narrator: " + audiobook.narrator);
            }
        }
    }

    public void checkoutMaterial(LibraryMaterial material) {
        if (availableMaterials.contains(material)) {
            material.checkout();
            availableMaterials.remove(material);
        } else {
            System.out.println("Material \"" + material.title + "\" is not available in the library.");
        }
    }

    public void returnMaterial(LibraryMaterial material) {
        if (!availableMaterials.contains(material)) {
            material.returnMaterial();
            availableMaterials.add(material);
        } else {
            System.out.println("Material \"" + material.title + "\" is already in the library.");
        }
    }
}

