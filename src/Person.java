public class Person {
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private String email;
    private Integer phNo;
    private Integer zip;

    public java.lang.String getFirstName() {
        return firstName;
    }

    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    public java.lang.String getLastName() {
        return lastName;
    }

    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    public java.lang.String getCity() {
        return city;
    }

    public void setCity(java.lang.String city) {
        this.city = city;
    }

    public java.lang.String getState() {
        return state;
    }

    public void setState(java.lang.String state) {
        this.state = state;
    }

    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public java.lang.Integer getPhNo() {
        return phNo;
    }

    public void setPhNo(java.lang.Integer phNo) {
        this.phNo = phNo;
    }

    public java.lang.Integer getZip() {
        return zip;
    }

    public void setZip(java.lang.Integer zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", phNo=" + phNo +
                ", zip=" + zip +
                '}';
    }
}
