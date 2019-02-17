package pattern.AbstractFactory;

import static pattern.AbstractFactory.ConstantType.DEVELOPER_FACTORY;
import static pattern.AbstractFactory.ConstantType.MANAGER_FACTORY;


class FactoryProvider {
    static EmployeeFactory getFactory(String factoryType) {
        switch (factoryType) {
            case (DEVELOPER_FACTORY):
                return new DeveloperFactory();
            case (MANAGER_FACTORY):
                return new ManagerFactory();
        }
        throw new IllegalArgumentException(factoryType + " type factory don't support");
    }
}
