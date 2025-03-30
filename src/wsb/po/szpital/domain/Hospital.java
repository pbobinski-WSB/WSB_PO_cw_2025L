package wsb.po.szpital.domain;

import java.util.*;
//import java.util.List;

public class Hospital {

    private String name;
    private String localization;

    private List<Doctor> doctors = new ArrayList<>();

    private List<Patient> patients = new ArrayList<>();

    public Hospital(String name, String localization) {
        this.name = name;
        this.localization = localization;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", localization='" + localization + '\'' +
                '}';
    }

    public void printInfo() {
        System.out.println(this);
        System.out.println(doctors);
        System.out.println(patients);
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }
}
