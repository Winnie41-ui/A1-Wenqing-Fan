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

        // ========== Part4‑Part6 Appointment Test ==========
        AppointmentManager manager = new AppointmentManager();

        // Scenario 1: Successfully added a reservation normally
        Appointment app1 = new Appointment(5001, "Tom", "0411111111", diet, "09:00", "Routine nutrition check");
        Appointment app2 = new Appointment(5002, "Lily", "0422222222", gp, "08:30", "Regular follow-up");
        Appointment app3 = new Appointment(5003, "Jack", "0433333333", gp, "10:00", "First visit, penicillin allergy");

        System.out.println("=== Add valid appointments ===");
        manager.addAppointment(app1);
        manager.addAppointment(app2);
        manager.addAppointment(app3);

        //Scenario 2: Error test: Duplicate booking for the same GP at the same time
        System.out.println("\n=== Test double‑booking error scenario ===");
        Appointment conflictApp = new Appointment(5004, "Amy", "0444444444", gp, "08:30", "Stomach pain consultation");
        manager.addAppointment(conflictApp);

        // All appointments, sorted by time

        System.out.println("\n=== All appointments sorted by time ===");
        manager.sortAppointmentsByTime();
        manager.printAllAppointments();

        // Filter appointments by patient phone
        System.out.println("\n=== Filter appointments by patient phone 0422222222 ===");
        ArrayList<Appointment> patientApps = manager.findAppointmentsByPatientPhone("0422222222");
        for(Appointment ap : patientApps){
            System.out.println(ap);
        }

        // Normal cancellation: Medical ID+time
        System.out.println("\n=== Cancel appointment proId 1 at 08:30 ===");
        manager.cancelAppointmentByProAndTime(1,"08:30");
        manager.printAllAppointments();

        // Scenario 3: Error test: Cancel non-existent appointment
        System.out.println("\n=== Test cancel non‑existent appointment ===");
        manager.cancelAppointmentByProAndTime(999,"14:00");

        System.out.println("\n=== Final appointment list ===");
        manager.printAllAppointments();
    }
}
