package pattern.AbstractFactory;


import org.junit.Assert;
import org.junit.Test;
import pattern.AbstractFactory.entity.Employee;

import static pattern.AbstractFactory.ConstantType.*;

public class FactoryProviderTest {
    private EmployeeFactory managerFactory = FactoryProvider.getFactory(MANAGER_FACTORY);
    private EmployeeFactory developerFactory = FactoryProvider.getFactory(DEVELOPER_FACTORY);

    @Test
    public void testDeveloperFactory() {
        Employee javaDeveloper = developerFactory.createEmployee(JAVA_DEVELOPER);
        Assert.assertEquals("I am Java specialist", javaDeveloper.getSpecification());

        Employee pythonDeveloper = developerFactory.createEmployee(PYTHON_DEVELOPER);
        Assert.assertEquals("I am Python specialist", pythonDeveloper.getSpecification());
    }

    @Test
    public void testManagerFactory() {
        Employee businessManager = managerFactory.createEmployee(BUSINESS_MANAGER);
        Assert.assertEquals("I am business manager", businessManager.getSpecification());

        Employee technicalManager = managerFactory.createEmployee(TECHNICAL_MANAGER);
        Assert.assertEquals("I am technical manager", technicalManager.getSpecification());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalManagerTypeEmployee() {
        Employee employee = managerFactory.createEmployee("Sales");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalDeveloperTypeEmployee() {
        Employee employee = developerFactory.createEmployee("C++");
    }
}