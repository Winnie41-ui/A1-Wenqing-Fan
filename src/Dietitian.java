import java.util.ArrayList;

public class Dietitian extends HealthProfessional {
    private String foodExpertise;

    public Dietitian(int id, String name, ArrayList<String> availableDays, String foodExpertise) {
        super(id, name, availableDays);
        this.foodExpertise = foodExpertise;
    }

    @Override
    public String getRoleDescription() {
        return "Dietitian, expertise in: " + foodExpertise;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nutrition Expertise: " + foodExpertise;
    }
}
