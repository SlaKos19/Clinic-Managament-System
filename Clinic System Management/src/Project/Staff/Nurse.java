package Project.Staff;

import Project.Employees.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Nurse implements Staff {

    List<Employees> nurse = new ArrayList<>();


    @Override
    public void addStaff(Employees employees) {
        nurse.add(employees);

    }

    @Override
    public void view() {
        System.out.println("Nurse is this clinic:");
        for (Employees employees : nurse){
            System.out.println(employees.getName() + " " + employees.getSurname());
        }
    }

    @Override
    public void deleteStaff(Employees employees) {
        nurse.remove(employees);
        System.out.println("This staff is delete" + " " + employees.getName());
    }

    @Override
    public Employees findEmployees(String surname) {
        Optional<Employees> item =  nurse.stream()
                .filter(employees -> employees.getSurname().equals(surname))
                .findFirst();

        return item.orElseThrow();
    }
}
