package wsb.po.szpital.domain;

public class Doctor extends Person implements Billable{

    private String specialization;
    private  double monthlySalary;


    public Doctor(String name, int age, String specialization, double monthlySalary) {
        super(name, age);
        this.monthlySalary = monthlySalary;
        this.specialization = specialization;
    }

    public void diagnose() {
        System.out.println("Diagnozuje");
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "specialization='" + specialization + '\'' +
                "} " + super.toString();
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}
