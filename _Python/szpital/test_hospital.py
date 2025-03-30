# Testowanie
if __name__ == "__main__":
    hospital = Hospital("Centralny Szpital", "Warszawa")

    doc1 = Doctor("Dr. Kowalski", 45, "Kardiologia")
    doc2 = Doctor("Dr. Nowak", 50, "Ortopedia")

    pat1 = Patient("Jan Nowak", 30, "Nadciśnienie")
    pat2 = Patient("Anna Kowalska", 40, "Cukrzyca")

    hospital.add_doctor(doc1)
    hospital.add_doctor(doc2)
    hospital.add_patient(pat1)
    hospital.add_patient(pat2)

    hospital.print_info()