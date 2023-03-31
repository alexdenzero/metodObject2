public class Autor {

    private String autor;

    public Autor(String nameAutor) {
        this.autor = nameAutor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Autor c2 = (Autor) other;
        return autor.equals(c2.autor);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(autor);
    }

    @Override
    public String toString() {
        return autor + ": " + autor;
    }
}
