public class Main {
    public static void main(String[] args) {
        Autor c = new Autor("Лев Толстой");
        Autor c2 = new Autor("Толстой Лев");
        Book b = new Book("Война и мир", c ,1865);
        Book b2 = new Book("Мир и война", c2 ,1869);
        System.out.println(c.equals(c2));
        System.out.println(b.equals(b2));
        System.out.println(c.toString() + b);
        System.out.println(c2.toString() + b2);
        System.out.println(new Object());
    }
}