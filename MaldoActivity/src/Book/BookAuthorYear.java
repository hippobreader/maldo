package Book;

public class BookAuthorYear {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F, Scott Fitzgerald", 1925);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("1984", "George Orwell", 1949);

        String book1Title = book1.getTitle();
        String book1Author = book1.getAuthor();
        int book1Year = book1.getYear();

        System.out.println(book1Title);
        System.out.println("By " + book1Author + " Year ");
        System.out.println("- " + book1Year + " -");
        System.out.println("");

        String book2Title = book2.getTitle();
        String book2Author = book2.getAuthor();
        int book2Year = book2.getYear();

        System.out.println(book2Title);
        System.out.println("By " + book2Author + " Year ");
        System.out.println("- " + book2Year + " -");
        System.out.println("");

        String book3Title = book3.getTitle();
        String book3Author = book3.getAuthor();
        int book3Year = book3.getYear();

        System.out.println(book3Title);
        System.out.println("By " + book3Author + " Year ");
        System.out.println("- " + book3Year + " -");
        System.out.println("");

    }
}