public class Author {

    private String lastName;
    private String firstName;
    private String authorName;


    public Author(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastNameName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getAuthorName() {
        authorName = lastName + " " + firstName;
        return this.authorName;
    }


}
