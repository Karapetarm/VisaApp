package Visa.applicant;


public class Applicant {
    private String firstName;
    private String lastName;
    private String address;
    private boolean isMale;

    public Applicant(String firstName, String lastName, String address,boolean isMale) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.isMale=isMale;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getAddress() {
        return address;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isMale() {
        return isMale;
    }
}
