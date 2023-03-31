public class Main {
    public static void main(String[] args) {

        Autor nameAutor = new Autor ("Лев Толстой");
        Book book = new Book("Война и мир",nameAutor,1865);
        System.out.println("Book.name = " + book.getName());
        System.out.println("Book.nameAutor = " + nameAutor.getAutor());
        System.out.println("Book.age = " + book.getAge());
        book.setAge(1869);
        System.out.println("Book.age = " + book.getAge());

        System.out.println();

        Autor nameAutor1 = new Autor ("Толстой Лев");
        Book book1 = new Book("Мир и война",nameAutor, 1866);
        System.out.println("Book.name = " + book1.getName());
        System.out.println("Book.nameAutor = " + nameAutor1.getAutor());
        System.out.println("Book.age = " + book1.getAge());
        book1.setAge(1868);
        System.out.println("Book.age = " + book1.getAge());
    }
}