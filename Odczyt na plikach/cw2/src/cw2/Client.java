package cw2;

public class Client {
    private int id;
    private String firstName;
    private String lastName;
    private String country;
    private double moneySpend;

    public Client(int id, String firstName, String lastName, String country, double moneySpend) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.moneySpend = moneySpend;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String nationality) {
        this.country = nationality;
    }

    public double getMoneySpend() {
        return moneySpend;
    }

    public void setMoneySpend(double moneySpend) {
        this.moneySpend = moneySpend;
    }

    @Override
    public String toString() {
        return id + ":" + firstName + " " + lastName + ", " + country + ", " + moneySpend + "zł";
    }
}
