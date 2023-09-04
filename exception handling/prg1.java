class Employee:
    def __init__(self, name, emp_id, salary):
        self.name = name
        self.emp_id = emp_id
        self.salary = salary

    def display_info(self):
        print(f"Name: {self.name}, Employee ID: {self.emp_id}, Salary: {self.salary}")


class FrontDesk(Employee):
    def __init__(self, name, emp_id, salary):
        super().__init__(name, emp_id, salary)

    def check_in_guests(self):
        print(f"{self.name} at the Front Desk is checking in guests.")


class Housekeeping(Employee):
    def __init__(self, name, emp_id, salary):
        super().__init__(name, emp_id, salary)

    def clean_room(self):
        print(f"{self.name} from Housekeeping is cleaning a room.")


class DuplicateEmployeeException(Exception):
    pass


class Hotel:
    def __init__(self):
        self.front_desk_employees = []
        self.housekeeping_employees = []

    def hire_employee(self, employee, category):
        if category == "Front Desk":
            if employee in self.front_desk_employees:
                raise DuplicateEmployeeException("Front Desk employee already hired.")
            self.front_desk_employees.append(employee)
        elif category == "Housekeeping":
            if employee in self.housekeeping_employees:
                raise DuplicateEmployeeException("Housekeeping employee already hired.")
            self.housekeeping_employees.append(employee)

    def list_employees(self, category):
        if category == "Front Desk":
            print("Front Desk Employees:")
            for employee in self.front_desk_employees:
                employee.display_info()
        elif category == "Housekeeping":
            print("Housekeeping Employees:")
            for employee in self.housekeeping_employees:
                employee.display_info()


# Example usage:
hotel = Hotel()

try:
    emp1 = FrontDesk("Alice", 1, 2500)
    emp2 = Housekeeping("Bob", 2, 2000)

    hotel.hire_employee(emp1, "Front Desk")
    hotel.hire_employee(emp2, "Housekeeping")

    hotel.list_employees("Front Desk")
    hotel.list_employees("Housekeeping")

    emp1.check_in_guests()
    emp2.clean_room()

    # Attempt to hire a duplicate employee
    hotel.hire_employee(emp1, "Front Desk")

except DuplicateEmployeeException as e:
    print(f"Error: {e}")