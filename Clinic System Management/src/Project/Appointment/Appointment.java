package Project.Appointment;

public interface Appointment {
    boolean current();
    boolean revocation();
    int getId();
    String getName();
    String getSurname();
    int getdata();
    void addVisit(Appointment appointment);
    void viewVisit();
    void deleteControl(Appointment appointment);
}
