package Project;

import Project.Employees.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Patient {

    private int id;
    private String name;
    private String surname;
    private long pesel;
    private long number_phone;
    List<Patient> patients = new ArrayList<>();

    public void addPatient(int id, String name, String surname, long pesel, long number_phone){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.number_phone = number_phone;

    }

    public void viewPatient(Patient patient) {
        System.out.println("ID:" + " " +getId() + " " + "Name:" + " " + getName() + " " + "Surname:" + " " + getSurname() + " " + "Pesel:" + " " + getPesel() + " " + "Number Phone:" + " " + getNumber_phone());

    }

    public void editPatient(long number_phone){
        this.number_phone = number_phone;
    }

    public void addToListPatient(Patient patient){
        patients.add(patient);
    }

    public void deletePatient(Patient patient){
        patients.remove(patient);
    }

    public void viewListPatient(){
        for (Patient patient : patients){
            System.out.println(patient.getName() + patient.getSurname() + patient.getPesel());
        }
    }

    public Patient findPatient(String surname) {
        Optional<Patient> item =  patients.stream()
                .filter(patient -> patient.getSurname().equals(surname))
                .findFirst();

        return item.orElseThrow();
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getPesel() {
        return pesel;
    }

    public long getNumber_phone() {
        return number_phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNumber_phone(long number_phone) {
        this.number_phone = number_phone;
    }
}
