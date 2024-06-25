package com.oops_library_system_8;

class Magazine extends LibraryMaterial {
    int issueNumber;
    
    public Magazine(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
    }
    
    @Override
    void checkout() {
        System.out.println("Magazine \"" + title + "\" (Issue " + issueNumber + ") has been checked out.");
    }
    
    @Override
    void returnMaterial() {
        System.out.println("Magazine \"" + title + "\" (Issue " + issueNumber + ") has been returned.");
    }
}

