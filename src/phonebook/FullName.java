package phonebook;

import java.util.Objects;


public class FullName {
    private final String firstName;
    private final String lastname;

    public FullName(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FullName fullName = (FullName) o;
        return Objects.equals(firstName, fullName.firstName) && Objects.equals(lastname, fullName.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastname);
    }

    @Override
    public String toString() {
        return firstName + " " + lastname;
    }
}
