package wsb.po.szpital.domain;

public class Doctor extends Person {

    private String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "specialization='" + specialization + '\'' +
                "} " + super.toString();
    }
}
