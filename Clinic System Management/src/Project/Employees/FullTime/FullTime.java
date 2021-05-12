package Project.Employees.FullTime;

import Project.Employees.AbstractEmployees;
import Project.Employees.TypeJob;

public class FullTime extends AbstractEmployees {

    TypeJob typeJob;

    public FullTime(String name, String surname) {
        super(name, surname);
    }

    public void viewTypeWork(){
        System.out.println("Full-time employee");
    }

    public TypeJob getType() {
        return TypeJob.FULL_TIME;
    }
}
