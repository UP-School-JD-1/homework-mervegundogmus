package org.mervegundogmus.oopj.chapter13;
public enum BookType {
	 NONFICTION("NONFICTION"),ACTION("ACTION"),HORROR("HORROR"), FICTION("FICTION"), SCINTIFIC("SCINTIFIC") ;

    private String description;

    BookType(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}