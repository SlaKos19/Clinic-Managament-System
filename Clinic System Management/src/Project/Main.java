package Project;

import Project.Appointment.Appointment;
import Project.Appointment.Control;
import Project.Appointment.Treatment;
import Project.Employees.Employees;
import Project.Employees.FullTime.FullTime;
import Project.Employees.PartTime.PartTime;
import Project.Staff.Doctor;
import Project.Staff.Nurse;
import Project.Staff.Other;
import Project.Staff.Staff;

public class Main {
    public static void main(String[] args) {

        //We set the director of the clinic and the ability to download his data and check if he is available.
//        Director director = new Director("Kowalski", 123456789, true);
//        director.infoDirector();

        //Create patients and act on them.
//        Patient p1 = new Patient();
//        Patient p2 = new Patient();
//        Patient p3 = new Patient();
//        Patient p4 = new Patient();
//
//        p1.addPatient(1,"John", "Lucky", 7482987261l,666333000);
//        p2.addPatient(2,"Marcial", "Jerome", 6406328964l,123459854);
//        p3.addPatient(3,"John", "Lucky", 7649429875l,649853985);
//        p4.addPatient(4,"Tobi", "Macky", 7402639876l,986490649);
//        p1.addToListPatient(p1);
//        p1.addToListPatient(p2);
//        p1.addToListPatient(p3);
//        p1.addToListPatient(p4);
//        p1.viewListPatient();
//        p1.editPatient(123456678);
//        p1.viewPatient(p1);
//        p1.findPatient("Lucky");;


        //Adding a new employee depending on the type of job and occupation.
        //Add a doctor.
//        FullTime p1 = new FullTime("John","Iwi");
//        FullTime p2 = new FullTime("Stafani","Lombou");
//        FullTime p3 = new FullTime("Melania","Tomis");
//
//        PartTime p4 = new PartTime("Glen", "Matius");
//
//
//        Staff doctor = new Doctor();
//        doctor.addStaff(p1);
//        doctor.addStaff(p2);
//        doctor.addStaff(p3);
//        doctor.addStaff(p4);
//        doctor.view();
//        doctor.deleteStaff(p4);
//        doctor.view();
//        doctor.findEmployees("Iwi");

//        //Return a type a work.
//        doctor1.getType();
//        doctor2.getType();
//        doctor3.getType();
//        doctor4.getType();

        //Add a nurse.
//        FullTime nurse1 = new FullTime("Brygid","Lomi");
//        PartTime nurse2 = new PartTime("Aui", "Deja");
//        PartTime nurse3 = new PartTime("Ben", "Getiu");
//        PartTime nurse4 = new PartTime("Saline", "Zimo");
//
//        Staff nurse = new Nurse();
//        nurse.addStaff(nurse1);
//        nurse.addStaff(nurse2);
//        nurse.addStaff(nurse3);
//        nurse.addStaff(nurse4);
//        nurse.view();
//        nurse.deleteStaff(nurse3);
//        nurse.view();
//        nurse.findEmployees("Deja");

//        //Return a type a work.
//        nurse1.getType();
//        nurse2.getType();
//        nurse3.getType();
//        nurse4.getType();

        //Add a other.
//        FullTime electroradiologist  = new FullTime("Sim","Lom");
//        PartTime lab = new PartTime("Weri", "Minejko");
//        PartTime computer_specjalist = new PartTime("Tobi", "Moniu");
//        PartTime driver = new PartTime("Mon", "Zumo");
//
//        Other other = new Other();
//        other.addStaff(electroradiologist);
//        other.addStaff(lab);
//        other.addStaff(computer_specjalist);
//        other.addStaff(driver);
//        other.view();
//        other.deleteStaff(electroradiologist);
//        other.view();
//        other.findEmployees("Zumo");
//
//        //Return a type a work.
//        electroradiologist.getType();
//        lab.getType();
//        computer_specjalist.getType();
//        driver.getType();

        Appointment control1 = new Control(1,"Luis", "Lock",2021-05-13);
        Appointment control2 = new Control(2,"Alberto", "Fimini",2022-07-23);
        Appointment control3 = new Control(3,"Stefen", "Tos",2021-05-3);
        Appointment control4 = new Control(4,"Keni", "Pit",2021-06-30);


        control1.addVisit(control1);
        control1.addVisit(control2);
        control1.addVisit(control2);
        control1.addVisit(control3);
        control1.addVisit(control4);

        control1.viewVisit();
        control1.current();
        control1.deleteControl(control1);
        control1.viewVisit();


        Appointment Treatment1 = new Treatment(5,"Monac", "Gamre", 2021-06-16);
        Appointment Treatment2 = new Treatment(6,"Krys", "Jamre", 2022-07-26);
        Appointment Treatment3 = new Treatment(7,"Delie", "Olip", 2022-04-10);
        Appointment Treatment4 = new Treatment(8,"Mark", "Jami", 2021-10-10);








//        Doctor doctor1 = new Doctor();
//        doctor1.addStaff(new Employees("Krzysztof", "Uzbek"));
//        doctor1.view();
//
//        Doctor doctor2 = new Doctor();
//        doctor2.addStaff(new Employees("Józek", "Stach"));
//        doctor2.view();

//        Control control = new Control(1,"Krzysztof", " Zagrodzki", 2021-05-21);
//        Treatment treatment = new Treatment(2,"Stachio" ,"Stadziejski", 2021-06-01);
//
//        Clinic clinic = new Clinic();
//        clinic.addAppointment(control);
//        clinic.addAppointment(treatment);



    }
}
