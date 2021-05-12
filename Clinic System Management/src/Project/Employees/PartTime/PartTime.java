package Project.Employees.PartTime;

import Project.Employees.AbstractEmployees;
import Project.Employees.TypeJob;

public class PartTime extends AbstractEmployees {

    TypeJob typeJob;

    public PartTime(String name, String surname) {
        super(name,surname);
    }

    public void viewTypeWork(){
        System.out.println("Part-time employee");
    }

    public TypeJob getType() {
        return TypeJob.PART_TIME;
    }
}
