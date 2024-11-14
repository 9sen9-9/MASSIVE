public class Main {
    public static void main (String[] args) {
        Author agataKristy = new Author("Агата","Кристи");
        book tenLittleNegroes = new book("Десять Негритят",1980, agataKristy);
        tenLittleNegroes.setPublicationYear(1939);
        System.out.println(tenLittleNegroes.getAuthor());
        System.out.println(tenLittleNegroes);

     }
}
