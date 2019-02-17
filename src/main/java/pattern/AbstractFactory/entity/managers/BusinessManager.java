package pattern.AbstractFactory.entity.managers;

public class BusinessManager extends Manager {
    @Override
    public double getSalary() {
        return 2000;
    }

    @Override
    public void assignWork() {

    }

    @Override
    public String getSpecification() {
        return "I am business manager";
    }
}
