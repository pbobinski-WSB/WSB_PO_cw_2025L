from abc import ABC, abstractmethod

# INTERFEJSY
class Schedulable(ABC):
    @abstractmethod
    def schedule(self, time_slot):
        pass

class Billable(ABC):
    @abstractmethod
    def calculate_pay(self):
        pass

class Person:

    def __init__(self, name, age):
        self.name = name
        self.age = age

    def __repr__(self):
        return f"Person name={self.name}, age={self.age}"
    
    def get_info(self):
        return self.__repr__()

# KLASA STAFF - abstrakcyjna
class Staff(Person, Billable):
    def __init__(self, name, age):
        super().__init__(name, age)

    @abstractmethod
    def perform_duties(self):
        pass

class Doctor(Person, Billable):

    def __init__(self, name, age, specialization, monthly_salary):
        super().__init__(name, age)
        self.specialization = specialization
        self.monthly_salary = monthly_salary

    def calculate_pay(self):
        return self.monthly_salary

    def __repr__(self):
        return f"Doctor specialization={self.specialization}; {super().__repr__()}"


class Patient(Person):

    def __init__(self, name, age, medical_history):
        super().__init__(name, age)
        self.medical_history = medical_history

    def __repr__(self):
        return f"Patient medical history={self.medical_history}; {super().__repr__()}"

class Nurse(Staff, Schedulable):
    def __init__(self, name, age, hourlyRate, hoursWorked):
        super().__init__(name,age)
        self.hourlyRate = hourlyRate
        self.hoursWorked = hoursWorked

    def perform_duties(self):
        print("Nurse pracuje")

    def calculate_pay(self):
        return self.hourlyRate * self.hoursWorked
    
    def schedule(self, time_slot):
        print("Planuje ", time_slot)

class AdministrativeStaff(Staff):
    def __init__(self, name, age, monthly_salary):
        super().__init__(name, age)
        self.monthly_salary = monthly_salary

    def calculate_pay(self):
        return self.monthly_salary
    
    def perform_duties(self):
        print("Admin pracuje")

class Department:
    def __init__(self, name):
        self.name = name
        self.doctors = []
        self.patients = []
        self.staff = []
    
    def add_doctor(self, doctor):
        self.doctors.append(doctor)

    def add_patient(self, patient):
        self.patients.append(patient)

    def add_staff(self, staff):
        self.staff.append(staff)

    def show_staff(self):
        print("Personel depatramentu",self.name)
        print("Lekarze",len(self.doctors))
        print("Pacjenci",len(self.patients))
        print("Personel",len(self.staff))

class Hospital:
    _instance = None

    def __new__(cls, name=None, location=None):
        if cls._instance is None:
            cls._instance = super(Hospital, cls).__new__(cls)
            cls._instance.name = name
            cls._instance.location = location
            cls._instance.departments = []
        return cls._instance

    def add_department(self, department):
        self.departments.append(department)

    def show_structure(self):
        print(f"Szpital: {self.name}")
        for dept in self.departments:
            dept.show_staff()

    def __repr__(self):
        return f"Hospital name={self.name}, location= {self.location}"
    
