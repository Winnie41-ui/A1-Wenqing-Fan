
/**
 * Appointment stores booking information for patients and health professionals.
 */
public class Appointment {
    private int appointmentId;
    private String patientName;
    private String patientPhone;
    private HealthProfessional professional;
    private String timeSlot;

    /**
     * Create a new appointment.
     */
    public Appointment(int appointmentId, String patientName, String patientPhone,
                       HealthProfessional professional, String timeSlot) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.professional = professional;
        this.timeSlot = timeSlot;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public HealthProfessional getProfessional() {
        return professional;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    @Override
    public String toString() {
        return "Appointment ID: " + appointmentId
                + " | Patient: " + patientName
                + " | Phone: " + patientPhone
                + " | Time Slot: " + timeSlot
                + " | Provider: [" + professional.getRoleDescription() + "]";
    }
}
