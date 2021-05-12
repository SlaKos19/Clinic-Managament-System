package Project.Employees;

public abstract class AbstractEmployees implements Employees {

    protected String name;
    protected String surname;

    public AbstractEmployees(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String getName() {
        return this.name = name;
    }

    @Override
    public String getSurname() {
        return this.surname = surname;
    }

}
