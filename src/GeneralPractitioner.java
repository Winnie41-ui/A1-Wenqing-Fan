import java.util.ArrayList;

public class GeneralPractitioner extends HealthProfessional {
    private String clinicName;

    public GeneralPractitioner(int id, String name, ArrayList<String> availableDays, String clinicName) {
        super(id, name, availableDays);
        this.clinicName = clinicName;
    }

    @Override
    public String getRoleDescription() {
        return "General Practitioner: works at " + clinicName;
    }

    @Override
    public String toString() {
        return super.toString() + ", Clinic Name: " + clinicName;
    }
}
