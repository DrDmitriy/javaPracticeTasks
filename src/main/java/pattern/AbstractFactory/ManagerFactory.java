package pattern.AbstractFactory;

import pattern.AbstractFactory.entity.Employee;
import pattern.AbstractFactory.entity.managers.BusinessManager;
import pattern.AbstractFactory.entity.managers.TechnicalManager;

import static pattern.AbstractFactory.ConstantType.BUSINESS_MANAGER;
import static pattern.AbstractFactory.ConstantType.TECHNICAL_MANAGER;

class ManagerFactory implements EmployeeFactory {

    @Override
    public Employee createEmployee(String employeeType) {
        switch (employeeType) {
            case (BUSINESS_MANAGER):
                return new BusinessManager();
            case (TECHNICAL_MANAGER):
                return new TechnicalManager();
        }
        throw new IllegalArgumentException(employeeType + "employee type not supported");
    }
}
