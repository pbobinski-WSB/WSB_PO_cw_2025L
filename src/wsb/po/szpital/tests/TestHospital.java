package wsb.po.szpital.tests;

import wsb.po.szpital.domain.*;

public class TestHospital {

    public static void main(String[] args) {

        //Hospital hospital = Hospital.getInstance("Szpital Miejski", "Warszawa");
        Hospital hospital = Hospital.instance;
        hospital.setName("Szpital Miejski");
        hospital.setLocation("Warszawa");

        System.out.println(hospital);

        Nurse nurse = new Nurse("Anna", 28, 50, 160);
        AdministrativeStaff admin = new AdministrativeStaff("Tomasz", 35, 5000);
        Doctor doc1 = new Doctor("Dr. Kowalski", 45, "Kardiologia", 12000);
        Doctor doc2 = new Doctor("Dr. Nowak", 50, "Ortopedia", 8000);

        Patient pat1 = new Patient("Jan Nowak", 30, "Nadciśnienie");
        Patient pat2 = new Patient("Anna Kowalska", 40, "Cukrzyca");

        Department cardio = new Department("Kardiologia");
        cardio.addStaff(nurse);
        cardio.addStaff(admin);
        cardio.addDoctor(doc1);
        cardio.addPatient(pat1);

        Department orto = new Department("Ortopedia");
        orto.addStaff(nurse);
        orto.addStaff(admin);
        orto.addDoctor(doc2);
        orto.addPatient(pat2);

        hospital.addDepartment(cardio);
        hospital.addDepartment(orto);
        hospital.showStructure();

        nurse.schedule("Poniedziałek 8:00");
        System.out.println("Wypłata pielęgniarki: " + nurse.calculatePay() + " PLN");
        System.out.println("Wypłata lekarza: " + doc1.calculatePay() + " PLN");
        System.out.println("Wypłata admina: " + admin.calculatePay() + " PLN");
        System.out.println("Wypłata lekarza: " + doc2.calculatePay() + " PLN");

    }
}
