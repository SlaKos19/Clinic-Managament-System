package Project.Staff;

import Project.Employees.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Doctor implements Staff {

    List<Employees> doctor = new ArrayList<>();

    @Override
    public void addStaff(Employees employees) {
        doctor.add(employees);

    }

    @Override
    public void view() {
        System.out.println("Doctor is this clinic:");
        for (Employees employees : doctor){
            System.out.println(employees.getName() + " " + employees.getSurname());
        }
    }

    @Override
    public void deleteStaff(Employees employees) {
        doctor.remove(employees);
        System.out.println("This staff is delete" + " " + employees.getName());
    }

    @Override
    public Employees findEmployees(String surname) {
        Optional<Employees> item =  doctor.stream()
                .filter(employees -> employees.getSurname().equals(surname))
                .findFirst();

        return item.orElseThrow();
    }


}
