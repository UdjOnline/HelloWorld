package l28;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {

    private List<Book> books = new ArrayList<>();

    static class Book {
        String title;
        String author;
        int year;

        Book (String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        @Override
        public boolean equals (Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            if (year != book.year) return false;
            if (!title.equals(book.title)) return false;
            if (!author.equals(book.author)) return false;
            return true;
        }
        @Override
        public int hashCode() {
            int result = title.hashCode();
            result = 31 * result + author.hashCode();
            result = 31 * result + year;
            return result;
        }

        @Override
        public String toString() {
            return title + "by" + author + ", published in " + year;
        }
    }

    void addBook (String title, String author, int year) {
        books.add(new Book(title, author, year));
    }

    void removeBook(String title, String author, int year) {
        books.remove(new Book(title, author, year));
    }

    void showBookShelf() {
        System.out.println("______________________________________");
        System.out.print("These are " + this.books.size() + "books on the bookShelf: ");
        for (Book b : books) {
            System.out.println(b) ;
        }
        System.out.println("______________________________________");
    }

    class Iterator extends BookShelf {
        int index;
        Iterator() {
            this.index = 0;
        }

        public boolean checkBookShelf() {
            System.out.println(books.get(index).toString());
            if (this.index + 1 <books.size()) {
                this.index++;
                System.out.println("Iterator moves forward");
            } else {
                this.index = 0;
                System.out.println("Iterator circles back to the beginning");
            }
            return false;
        }
    }
}

class Main {
    public static void main(String[] args) {
        // создаём книжную полку bs:
        BookShelf bs = new BookShelf();

        // добавляем пять книг по Java:
        bs.addBook("Java. Complete Reference", "H.Shildt", 2020);
        bs.addBook("Java for Dummies", "B.Berd", 2019);
        bs.addBook("Java. Effective programming", "Joshua Bloch", 2017);
        bs.addBook("Pure code. Creation, Analysis & Refactoring", "Robert Martin", 2018);
        bs.addBook("Java EE design patterns for professionals", "M.Jener & A.Feedom", 2020);
        bs.showBookShelf();

        System.out.println("Remove book from index 2: ");
        bs.removeBook("Java for Dummies", "B.Berd", 2019); // убираем одну книгу
        bs.showBookShelf();

        // создаём итератор:
        BookShelf.Iterator myIterator = bs.new Iterator();
        System.out.println("Create Iterator:");

        myIterator.checkBookShelf();
        myIterator.checkBookShelf();
        myIterator.checkBookShelf();
        myIterator.checkBookShelf();
        myIterator.checkBookShelf();

        //for (int i = 0; i < bs.getSize(); i = i + 1) {
        //    System.out.println(myIterator.checkBookShelf());
    }
}