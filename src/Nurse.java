import java.util.ArrayList;

public class Nurse extends HealthProfessional {
    private String ward;

    public Nurse(int id, String name, ArrayList<String> availableDays, String ward) {
        super(id, name, availableDays);
        this.ward = ward;
    }

    @Override
    public String getRoleDescription() {
        return "Nurse, responsible for ward: " + ward;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ward: " + ward;
    }
}
