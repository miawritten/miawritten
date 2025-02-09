public class Library {
    String name;
    int year;
    Book[] books;
    Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    public void displayInfo(){
            System.out.println("The " + this.year + " " + this.name + " has " + this.books.length + " books.");
            System.out.println("Books available:");
            for(Book book : books){
                System.out.println(book.displayInfo());
            }
        }

    }

