package wsb.po.szpital.domain;

public class AdministrativeStaff extends Staff{

    private double monthlySalary;

    public AdministrativeStaff(String name, int age, double monthlySalary) {
        super(name, age);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void performDuties() {
        System.out.println("Admin pracuje");
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}
