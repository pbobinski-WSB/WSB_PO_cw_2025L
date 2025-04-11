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

# NADKLASA STAFF - abstrakcyjna
class Staff(ABC):
    def __init__(self, name, age):
        self.name = name
        self.age = age

    @abstractmethod
    def perform_duties(self):
        pass