package org.mervegundogmus.oopj.chapter13;
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.printBookTypes();
        test.changeBookTypes();
        test.printBookTypes();
        System.out.println();

        Reader reader = new Reader("Merve","Gündoğmuş", 28);
        reader.getInfo();

        Author author = new Author("J. K. Rowling");
        author.getInfo();

        Book book = new Book(author, "The Ink Black Heart", BookType.ACTION);
        book.getInfo();

    }

    private void changeBookTypes() {
        System.out.println("Change %%%%");
        BookType.ACTION.setDescription("ACTION");
        BookType.FICTION.setDescription("FICTION");
        BookType.NONFICTION.setDescription("NONFICTION");
        BookType.SCINTIFIC.setDescription("SCINTIFIC");
        BookType.HORROR.setDescription("HORROR");
    }

    public void printBookTypes() {
        System.out.print("Book Types : ");

        for (BookType bookType : BookType.values()) {
            System.out.print(bookType.getDescription() + ", ");
        }
        System.out.println();
    }

}