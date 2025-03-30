package wsb.po.szpital.tests;

public class TestHospital {

    public static void main(String[] args) {
        Hospital hospital = new Hospital("Centralny Szpital", "Warszawa");

        Doctor doc1 = new Doctor("Dr. Kowalski", 45, "Kardiologia");
        Doctor doc2 = new Doctor("Dr. Nowak", 50, "Ortopedia");

        Patient pat1 = new Patient("Jan Nowak", 30, "Nadciśnienie");
        Patient pat2 = new Patient("Anna Kowalska", 40, "Cukrzyca");

        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);
        hospital.addPatient(pat1);
        hospital.addPatient(pat2);

        hospital.printInfo();
    }
}
