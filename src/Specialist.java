import java.util.ArrayList;

public class Specialist extends HealthProfessional {
    private String specialField;

    public Specialist(int id, String name, ArrayList<String> availableDays, String specialField) {
        super(id, name, availableDays);
        this.specialField = specialField;
    }

    @Override
    public String getRoleDescription() {
        return "Specialist, speciality: " + specialField;
    }

    @Override
    public String toString() {
        return super.toString() + ", Special Field: " + specialField;
    }
}
