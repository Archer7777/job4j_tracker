package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book = new Book("Clean code ", 650);
        Book book2 = new Book("Head First ", 230);
        Book book3 = new Book("Java SE ", 1100);
        Book book4 = new Book("Hibernate ", 840);
        Book[] books = new Book[4];
        books[0] = book;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + bk.getPages());
        }

        System.out.println("\n" + "Replace between book 0 and book 3");
        books[0] = book4;
        books[3] = book;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + bk.getPages());
        }

        System.out.println("\n" + "Cycle for Clean Code book");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if ("Clean code ".equals(bk.getName())) {
                System.out.println(bk.getName() + " - " + bk.getPages());
            }
        }
    }
}
