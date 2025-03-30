package wsb.po.szpital.domain;

public class Patient extends Person{

    private String medicalHistory;

    public Patient(String name, int age, String medicalHistory) {
        super(name, age);
        this.medicalHistory = medicalHistory;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "medicalHistory='" + medicalHistory + '\'' +
                "} " + super.toString();
    }
}
