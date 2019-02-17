package pattern.AbstractFactory.entity.developers;

public class PythonDeveloper extends Developer {
    @Override
    public double getSalary() {
        return 1000;
    }

    @Override
    public void assignWork() {

    }

    @Override
    public String getSpecification() {
        return "I am Python specialist";
    }
}
