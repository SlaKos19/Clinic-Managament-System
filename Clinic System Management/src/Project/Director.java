package Project;

public class Director {

    private final String name;
    private long number_phone;
    private boolean present;

    public Director(String name, long number_phone, boolean present) {
        this.name = name;
        this.number_phone = number_phone;
        this.present = present;
    }

    private String getName() {
        return name;
    }

    private long getNumber_phone() {
        return number_phone;
    }

    private boolean isPresent() {
        return present;
    }

    public void infoDirector(){
        System.out.println("Project.Director this clinic is" + " " + getName() + " "  + "Present:" + " " + isPresent() + " " + "Please contact to this number:" + " " + getNumber_phone());
    }
}


