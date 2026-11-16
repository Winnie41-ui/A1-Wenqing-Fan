/**
 * Appointment stores booking information for patients and health professionals.
 */
public class Appointment {
    private int appointmentId;
    private String patientName;
    private String patientPhone;
    private HealthProfessional professional;
    private String timeSlot;
    // Add patient note for special medical information
    private String patientNote;

    /**
     * Create a new appointment.
     */
    public Appointment(int appointmentId, String patientName, String patientPhone,
                       HealthProfessional professional, String timeSlot, String patientNote) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.professional = professional;
        this.timeSlot = timeSlot;
        this.patientNote = patientNote;
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

    public String getPatientNote() {
        return patientNote;
    }

    @Override
    public String toString() {
        return "Appointment ID: " + appointmentId
                + " | Patient: " + patientName
                + " | Phone: " + patientPhone
                + " | Time Slot: " + timeSlot
                + " | Note: " + patientNote
                + " | Provider: [" + professional.getRoleDescription() + "]";
    }
}
