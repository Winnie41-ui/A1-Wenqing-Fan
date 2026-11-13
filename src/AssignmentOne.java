import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        // ========== GeneralPractitioner ==========
        ArrayList<String> gpDays = new ArrayList<>();
        gpDays.add("Monday");
        gpDays.add("Thursday");
        GeneralPractitioner gp = new GeneralPractitioner(1, "Dr. Alice", gpDays, "Community Clinic");
        System.out.println(gp.getRoleDescription());
        System.out.println(gp);
        System.out.println("--------------------------------");

        // ========== Specialist ==========
        ArrayList<String> specDays = new ArrayList<>();
        specDays.add("Tuesday");
        specDays.add("Friday");
        Specialist spec = new Specialist(2, "Dr. Bob", specDays, "Cardiology");
        System.out.println(spec.getRoleDescription());
        System.out.println(spec);
        System.out.println("--------------------------------");

        // ========== Nurse ==========
        ArrayList<String> nurseDays = new ArrayList<>();
        nurseDays.add("Wednesday");
        nurseDays.add("Saturday");
        Nurse nurse = new Nurse(3, "Cathy", nurseDays, "Emergency Ward");
        System.out.println(nurse.getRoleDescription());
        System.out.println(nurse);
        System.out.println("--------------------------------");

        // ========== Dietitian ==========
        ArrayList<String> dietDays = new ArrayList<>();
        dietDays.add("Monday");
        dietDays.add("Friday");
        Dietitian diet = new Dietitian(4, "David", dietDays, "Weight Management");
        System.out.println(diet.getRoleDescription());
        System.out.println(diet);
    }
}
