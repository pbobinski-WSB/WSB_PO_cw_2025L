
from abstrakcje import *

class Tester(Staff, Billable):
    def __init__(self, name, age, monthly_salary):
        super().__init__(name, age)
        self.monthly_salary = monthly_salary

    def perform_duties(self):
        print(f"{self.name} zajmuje się testami.")

    def calculate_pay(self):
        return self.monthly_salary


class HospitalSingle:
    _instance = None

    def __new__(cls, name=None):
        if cls._instance is None:
            cls._instance = super(HospitalSingle, cls).__new__(cls)
            cls._instance.name = name
            cls._instance.departments = []
        return cls._instance

    def add_department(self, department):
        self.departments.append(department)

    def show_structure(self):
        print(f"Szpital: {self.name}")
        for dept in self.departments:
            dept.show_staff()


if __name__ == '__main__':
    
    tester = Tester('Adam', 30, 4000)

    tester.perform_duties()
    print(f"Wypłata testera: {tester.calculate_pay()} PLN")

    h1 = HospitalSingle("Szpital Miejski")
    h2 = HospitalSingle("Inny Szpital")

    print(h1 is h2)  
    print(h1.name)   
    print(h2.name)   