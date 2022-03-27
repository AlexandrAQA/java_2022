package lesson7;

public class Bclass {
    public String surname;
    int id;
    String address;
    protected double bankAccountId;
    private double salary;

    public Bclass(String surname0){
        surname = surname0;
    }

    Bclass (String address0, String surname0){
        address = address0;
        surname = surname0;
    }

    protected Bclass(int id0, String address0, String surname0, double bankAccountId0){
        id = id0;
        address = address0;
        surname = surname0;
        bankAccountId = bankAccountId0;
    }

    private Bclass (double bankAccountId0, double salary0) {
        bankAccountId = bankAccountId0;
        salary = salary0;
    }

    protected double salaryX2(double salary_old) {
        return salary = salary_old * 2;
    }

    public void showDataEmployee(int id0, String surname0, String address0) {
        System.out.println("ID is " + id + " Surname is " + surname + " address is " + address);
    }

}
