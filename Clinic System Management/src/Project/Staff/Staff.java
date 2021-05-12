package Project.Staff;

import Project.Employees.Employees;

public interface Staff {

    void addStaff(Employees employees);
    void view();
    void deleteStaff(Employees employees);

    Employees findEmployees(String name);


}
