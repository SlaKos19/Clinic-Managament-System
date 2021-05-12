package Project;

import Project.Appointment.Appointment;
import Project.Staff.Staff;

import java.util.ArrayList;
import java.util.List;

public class Clinic {

    private Patient patient;
    private Staff staff;
    private Director director;

    List<Appointment> visit = new ArrayList<>();

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Appointment> getVisit() {
        return visit;
    }

    public void setVisit(List<Appointment> visit) {
        this.visit = visit;
    }
    public void addAppointment(Appointment appointment){
        boolean currentvisit = appointment.current();
        if (currentvisit){
            visit.add(appointment);
        }
    }
}
