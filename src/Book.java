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
        Book c2 = (Book) other;
        return name.equals(c2.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }

    @Override
    public String toString() {
        return "название - " + name + ", года выпуска - " +age;
    }
}