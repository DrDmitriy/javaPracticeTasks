package pattern.AbstractFactory.entity.developers;

public class JavaDeveloper extends Developer {
    @Override
    public double getSalary() {
        return 1500;
    }

    @Override
    public void assignWork() {

    }

    @Override
    public String getSpecification() {
        return "I am Java specialist";
    }
}
