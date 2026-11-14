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
        System.out.println("--------------------------------");

        // ========== Part3 Appointment Test ==========
        Appointment app1 = new Appointment(5001, "Tom", "0411111111", diet, "Monday");
        Appointment app2 = new Appointment(5002, "Lily", "0422222222", gp, "Thursday");

        AppointmentManager manager = new AppointmentManager();
        manager.addAppointment(app1);
        manager.addAppointment(app2);

        System.out.println("=== All Appointments ===");
        manager.printAllAppointments();

        Appointment found = manager.findAppointmentById(5001);
        if (found != null) {
            System.out.println("\nFound by appointment ID: " + found);
        }

        System.out.println("\n=== Appointments for professional ID 1 (Dr.Alice GP) ===");
        ArrayList<Appointment> proAppList = manager.findAppointmentsByProfessionalId(1);
        for(Appointment ap : proAppList){
            System.out.println(ap);
        }

        manager.deleteAppointmentById(5001);
        System.out.println("\n=== After deleting appointment 5001 ===");
        manager.printAllAppointments();
    }
}
