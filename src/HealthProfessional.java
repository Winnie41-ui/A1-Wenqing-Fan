import java.util.ArrayList;
import java.util.Objects;

// Abstract parent class for all health professionals
public abstract class HealthProfessional {
    private int id;
    private String name;
    private ArrayList<String> availableDays;

    // Constructor
    public HealthProfessional(int id, String name, ArrayList<String> availableDays) {
        this.id = id;
        this.name = name;
        this.availableDays = availableDays;
    }

    // Getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public ArrayList<String> getAvailableDays() {
        return availableDays;
    }

    // Subclasses must implement this method to return their role
    public abstract String getRoleDescription();

    // Return readable information of this object
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Available Days: " + availableDays;
    }

    // Two professionals are equal if they have the same id
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HealthProfessional that = (HealthProfessional) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
