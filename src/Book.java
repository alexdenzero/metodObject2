import java.util.Objects;

public class Book {
    private  String name;
    private Autor autor;
    private int age;

    public Book(String name, Autor autor, int age) {
        this.name = name;
        this.autor = autor;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book b2 = (Book) other;
        return name.equals(b2.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, autor, age);

    }

    @Override
    public String toString() {
        return "название - " + name + ", автор - " + autor + ", года выпуска - " + age;
    }
}