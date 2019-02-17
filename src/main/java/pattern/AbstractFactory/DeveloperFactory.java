package pattern.AbstractFactory;

import pattern.AbstractFactory.entity.Employee;
import pattern.AbstractFactory.entity.developers.JavaDeveloper;
import pattern.AbstractFactory.entity.developers.PythonDeveloper;

import static pattern.AbstractFactory.ConstantType.JAVA_DEVELOPER;
import static pattern.AbstractFactory.ConstantType.PYTHON_DEVELOPER;

class DeveloperFactory implements EmployeeFactory {

    @Override
    public Employee createEmployee(String employeeType) {
        switch (employeeType) {
            case (JAVA_DEVELOPER):
                return new JavaDeveloper();
            case (PYTHON_DEVELOPER):
                return new PythonDeveloper();
        }
        throw new IllegalArgumentException(employeeType + "employee type not supported");
    }
}
