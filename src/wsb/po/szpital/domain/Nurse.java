package wsb.po.szpital.domain;

public class Nurse extends Staff implements Schedulable{

    private double hourlyRate;
    private int hoursWorked;

    public Nurse(String name, int age, double hourlyRate, int hoursWorked) {
        super(name,age);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void performDuties() {
        System.out.println("Nurse pracuje");
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void schedule(String timeSlot) {
        System.out.println("Terminarz: "+timeSlot);
    }
}
