
/**
 * Appointment stores booking information for patients and health professionals.
 */
public class Appointment {
    private int appointmentId;
    private String patientName;
    private String patientPhone;
    private HealthProfessional professional;
    private String appointmentDay;

    /**
     * Create a new appointment.
     */
    public Appointment(int appointmentId, String patientName, String patientPhone,
                       HealthProfessional professional, String appointmentDay) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.professional = professional;
        this.appointmentDay = appointmentDay;
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

    public String getAppointmentDay() {
        return appointmentDay;
    }

    @Override
    public String toString() {
        return "Appointment ID: " + appointmentId
                + " | Patient: " + patientName
                + " | Phone: " + patientPhone
                + " | Day: " + appointmentDay
                + " | Provider: [" + professional.getRoleDescription() + "]";
    }
}
