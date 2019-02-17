package pattern.AbstractFactory;

import pattern.AbstractFactory.entity.Employee;

interface EmployeeFactory {
    Employee createEmployee(String employeeType);

}
