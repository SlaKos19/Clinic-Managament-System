package Project.Staff;

import Project.Employees.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Other implements Staff {

    List<Employees> other = new ArrayList<>();


    @Override
    public void addStaff(Employees employees) {
        other.add(employees);

    }

    @Override
    public void view() {
        System.out.println("Other is this clinic:");
        for (Employees employees : other){
            System.out.println(employees.getName() + " " + employees.getSurname());
        }

    }

    @Override
    public void deleteStaff(Employees employees) {
        other.remove(employees);
        System.out.println("This staff is delete" + " " + employees.getName());
    }

    @Override
    public Employees findEmployees(String surname) {
        Optional<Employees> item =  other.stream()
                .filter(employees -> employees.getSurname().equals(surname))
                .findFirst();

        return item.orElseThrow();
    }
}
