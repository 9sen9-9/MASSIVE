public class Author {
    private String firstName;
    private String lastName;
public Author (String firsName,String lastName){
    this.firstName=firsName;
    this.lastName=lastName;
}
public String getFirstName(){
    return this.firstName;
}
public String getLastName(){
    return this.lastName;
}
public String toString(){
    return firstName+" "+lastName;
}
}
