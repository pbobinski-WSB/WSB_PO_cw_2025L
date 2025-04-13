from domain import *

if __name__ == "__main__":
    hospital = Hospital("Szpital Miejski", "Warszawa")
    print(hospital)
    nurse = Nurse("Anna", 28, 50, 160)

    admin = AdministrativeStaff("Tomasz", 35, 5000)

    doc1 = Doctor("Dr. Kowalski", 45, "Kardiologia",12000)
    doc2 = Doctor("Dr. Nowak", 50, "Ortopedia",8000)

    pat1 = Patient("Jan Nowak", 30, "Nadciśnienie")
    pat2 = Patient("Anna Kowalska", 40, "Cukrzyca")

    cardio = Department("Kardiologia")
    cardio.add_staff(nurse)
    cardio.add_staff(admin)
    cardio.add_doctor(doc1)
    cardio.add_patient(pat1)

    orto = Department("Ortopedia")
    orto.add_staff(nurse)
    orto.add_staff(admin)
    orto.add_doctor(doc2)
    orto.add_patient(pat2)

    hospital.add_department(cardio)
    hospital.add_department(orto)
    hospital.show_structure()

    nurse.schedule("Poniedziałek 8:00")
    print(f"Wypłata pielęgniarki: {nurse.calculate_pay()} PLN")

    print(f"Wypłata lekarza: {doc1.calculate_pay()} PLN")
    print(f"Wypłata admina: {admin.calculate_pay()} PLN")
    print(f"Wypłata lekarza: {doc2.calculate_pay()} PLN")
