package wsb.po.szpital.domain;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private String name;
    private String location;

    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    public Hospital(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public void printInfo() {
        System.out.println(this.toString());
        System.out.println(doctors);
        //System.out.println(patients);
        for (Patient p : patients) {
            System.out.println(p.getInfo());
        }
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }
}
