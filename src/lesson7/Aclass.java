package lesson7;

public class Aclass {

    public String surname;
    int id;
    String address;
    protected double bankAccountId;
    private double salary;

    protected double salaryX2(double salary_old) {
        return salary = salary_old * 2;
    }

    public void showDataEmployee(int id0, String surname0, String address0) {
        System.out.println("ID is " + id + " Surname is " + surname + " address is " + address);
    }
    protected void showPrivateDataEmployee (int bankAccountId0, double salary0){
        System.out.println("Bank account ID is " + bankAccountId + " salary is " + salary);
    }
}
class AclassRun{
    public static void main(String[] args) {
        Aclass aclass1 = new Aclass();
        aclass1.showDataEmployee(001, "Minakov", "Tbilisi");

        aclass1.salaryX2(500);
        aclass1.showPrivateDataEmployee(10101010, 10_000.89);


    }
}