package Project.Appointment;

import java.util.ArrayList;
import java.util.List;

public class Treatment implements Appointment{

    private int id;
    private String name;
    private String surname;
    private int date;

    List<Appointment> treatment = new ArrayList<>();


    public Treatment(int id, String name, String surname, int date) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.date = date;
    }

    @Override
    public boolean current() {
        System.out.println("Current visit Treatment");
        return true;
    }

    @Override
    public boolean revocation() {
        System.out.println("Visit Treatment out of date");
        return true;
    }

    @Override
    public int getId() {
        return this.id = id;
    }

    @Override
    public String getName() {
        return this.name = name;
    }

    @Override
    public String getSurname() {
        return this.surname = surname;
    }

    @Override
    public int getdata() {
        return date = date;
    }

    @Override
    public void addVisit(Appointment appointment) {
        treatment.add(appointment);
    }

    @Override
    public void viewVisit() {
        System.out.println("Treatment is this clinic:");
        for (Appointment appointment : treatment){
            System.out.println(appointment.getName() + " " + appointment.getSurname());
        }

    }

    @Override
    public void deleteControl(Appointment appointment) {
        treatment.remove(appointment);

    }
}
