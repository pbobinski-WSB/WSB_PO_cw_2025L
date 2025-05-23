package wsb.po.szpital.domain;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private final String name;

    public Department(String name) {
        this.name = name;
    }

    private final List<Doctor> doctors = new ArrayList<>();
    private final List<Patient> patients = new ArrayList<>();
    private final List<Staff> staff = new ArrayList<>();

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }


    public void addStaff(Staff staff) {
        this.staff.add(staff);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", doctors=" + doctors.size() +
                ", patients=" + patients.size() +
                ", staff=" + staff.size() +
                '}';
    }
}
