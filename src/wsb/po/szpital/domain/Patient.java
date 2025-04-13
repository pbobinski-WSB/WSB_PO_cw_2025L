package wsb.po.szpital.domain;

public class Patient extends Person{

    private final String medicalHistory;

    public Patient(String name, int age, String medicalHistory) {
        super(name, age);
        this.medicalHistory = medicalHistory;
    }

    public void receiveTreatment(){
        System.out.println("Jest leczony");
    }

    @Override
    public String toString() {
        return "Patient{" +
                "medicalHistory='" + medicalHistory + '\'' +
                "} " + super.toString();
    }
}
