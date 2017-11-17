package ro.sci.homework;

/**
 * Created SalesRepresentative class for storing sales representatives information
 */

public class SalesRepresentative {
    private String firstName;
    private String lastName;
    private int sales;
    private int quota;
    private int revenue = sales * quota;

    /**
     * Constructor for initializing SalesRepresentative object
     *
     * @param firstName initial sales representative first name
     * @param lastName  initial sales representative last name
     * @param sales     initial sales representative number of sales
     * @param quota     initial sales representative quota per sale
     */

    public SalesRepresentative(String firstName, String lastName, int sales, int quota) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sales = sales;
        this.quota = quota;
        this.revenue = sales * quota;
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

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {

        this.revenue = sales * quota;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + revenue;

    }
}
