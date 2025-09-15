public class MainDemo2 {
    public static void main(String[] args) {
        Book.displayLibraryName();
        Book book1 = new Book("Java Basics", "John Smith", "ISBN1234");
        book1.displayDetails();
    }
}
