import java.util.ArrayList;
import java.util.Comparator;

/**
 * Manage appointment data and operations.
 */
public class AppointmentManager {
    private ArrayList<Appointment> appointmentList;

    public AppointmentManager() {
        appointmentList = new ArrayList<>();
    }

    /**
     * Add one appointment, check double‑booking conflict.
     * return true if add success, false for conflict.
     */
    public boolean addAppointment(Appointment newApp) {
        // 检查重复：同一个医护，同一个时间段
        for(Appointment a : appointmentList){
            if(a.getProfessional().getId() == newApp.getProfessional().getId()
                    && a.getTimeSlot().equals(newApp.getTimeSlot())){
                System.out.println("WARNING: Double‑booking! This health professional is already booked at " + newApp.getTimeSlot());
                return false;
            }
        }
        appointmentList.add(newApp);
        System.out.println("Appointment added successfully.");
        return true;
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
     * Sort appointments by time slot (earliest first).
     */
    public void sortAppointmentsByTime(){
        appointmentList.sort(Comparator.comparing(Appointment::getTimeSlot));
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
     * Filter appointments by patient phone number.
     */
    public ArrayList<Appointment> findAppointmentsByPatientPhone(String phone){
        ArrayList<Appointment> resultList = new ArrayList<>();
        for(Appointment a : appointmentList){
            if(a.getPatientPhone().equals(phone)){
                resultList.add(a);
            }
        }
        return resultList;
    }

    /**
     * Cancel appointment by patient phone number.
     */
    public boolean cancelAppointmentByPatientPhone(String phone){
        ArrayList<Appointment> list = findAppointmentsByPatientPhone(phone);
        if(list.isEmpty()){
            System.out.println("WARNING: Cannot cancel, no appointment found for this phone number.");
            return false;
        }
        for(Appointment ap : list){
            appointmentList.remove(ap);
        }
        System.out.println("Cancelled appointments for patient phone: " + phone);
        return true;
    }

    /**
     * Cancel appointment by professional ID + time slot
     */
    public boolean cancelAppointmentByProAndTime(int proId, String time){
        for(Appointment a : appointmentList){
            if(a.getProfessional().getId() == proId && a.getTimeSlot().equals(time)){
                appointmentList.remove(a);
                System.out.println("Cancelled appointment for professional " + proId + " at " + time);
                return true;
            }
        }
        System.out.println("WARNING: Cannot cancel, no matching appointment found.");
        return false;
    }
}
