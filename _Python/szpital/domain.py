class Person:
    
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def __repr__(self):
        return f"Person name={self.name}, age={self.age}"

class Doctor(Person):

    def __init__(self, name, age, specialization):
        super().__init__(name, age)
        self.specialization = specialization

    def __repr__(self):
        return f"Doctor specialization={self.specialization}; {super().__repr__()}"

class Patient(Person):
    
    def __init__(self, name, age, medical_history):
        super().__init__(name, age)
        self.medical_history = medical_history

    def __repr__(self):
        return f"Paient medical history={self.medical_history}; {super().__repr__()}"

class Hospital:

    def __init__(self, name, location):
        self.name = name
        self.location = location
        self.doctors = []
        self.patients = []
        
    def print_info(self):
        print (self)
        print (self.doctors)
        print (self.patients)
        

    def add_doctor(self, doctor):
        self.doctors.append(doctor)

    def add_patient(self, patient):
        self.patients.append(patient)

    def __repr__(self):
        return f"Hospital name={self.name}, localization={self.location}"