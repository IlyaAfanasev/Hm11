import java.util.Objects;

public class Author {

    private String lastName;
    private String firstName;

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

        return lastName + " " + firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return lastName.equals(author.lastName) && firstName.equals(author.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName);
    }
}
