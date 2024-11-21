public class Book {
    private String name;
    public int publicationYear;
    private Author author;

    public Book(String name, int publicationYear, Author author) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return name + "(" + publicationYear + ")" + author.toString();
    }

    public void main() {
    }
}