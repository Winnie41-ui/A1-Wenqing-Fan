import java.util.ArrayList;

/**
 * Manage appointment data and operations.
 */
public class AppointmentManager {
    private ArrayList<Appointment> appointmentList;

    public AppointmentManager() {
        appointmentList = new ArrayList<>();
    }

    /**
     * Add one appointment.
     */
    public void addAppointment(Appointment newApp) {
        appointmentList.add(newApp);
    }

    /**
     * Print all appointments.
     */
    public void printAllAppointments() {
        if (appointmentList.isEmpty()) {
            System.out.println("No appointments in the system.");
            return;
        }
        for (Appointment a : appointmentList) {
            System.out.println(a);
        }
    }

    /**
     * Search appointment by appointment ID.
     */
    public Appointment findAppointmentById(int id) {
        for (Appointment a : appointmentList) {
            if (a.getAppointmentId() == id) {
                return a;
            }
        }
        return null;
    }

    /**
     * Search appointments by health professional ID.
     */
    public ArrayList<Appointment> findAppointmentsByProfessionalId(int proId) {
        ArrayList<Appointment> resultList = new ArrayList<>();
        for (Appointment a : appointmentList) {
            if (a.getProfessional().getId() == proId) {
                resultList.add(a);
            }
        }
        return resultList;
    }

    /**
     * Delete appointment by ID, return operation result.
     */
    public boolean deleteAppointmentById(int id) {
        Appointment target = findAppointmentById(id);
        if (target != null) {
            appointmentList.remove(target);
            return true;
        }
        return false;
    }
}

