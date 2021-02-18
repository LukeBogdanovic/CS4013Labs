import java.util.ArrayList;
import java.time.LocalTime;

public class AppointmentCalendar {
   private ArrayList<Appointment> appointments;

   public AppointmentCalendar() {
      this.appointments = new ArrayList<Appointment>();
   }

   public void add(Appointment a) {
      for (int i = 0; i < appointments.size(); i++) {
         if (appointments.get(i).getDay().toString().equals(a.getDay().toString())) {
            for (int j = 0; j < appointments.size(); j++) {
               String from1 = a.getFrom().toString();
               String from2 = appointments.get(i).getFrom().toString();
               String to1 = a.getTo().toString();
               String to2 = appointments.get(i).getTo().toString();
               LocalTime f1 = LocalTime.parse(from1);
               LocalTime f2 = LocalTime.parse(from2);
               LocalTime t1 = LocalTime.parse(to1);
               LocalTime t2 = LocalTime.parse(to2);
               if (f1.compareTo(t2) <= 0 && t1.compareTo(f2) >= 0) {
                  return;
               }
            }
         }
      }
      appointments.add(a);
   }

   public ArrayList<Appointment> getAppointmentsForDay(AppointmentDate a) {
      for (Appointment ap : appointments) {
         if (ap.getDay().equals(a)) {
            ArrayList<Appointment> app = new ArrayList<Appointment>();
            app.add(ap);
         }
      }
      return appointments;
   }

   public void cancel(Appointment a) {
      for (int i = 0; i < appointments.size(); i++) {
         if (appointments.get(i).equals(a)) {
            appointments.remove(a);
            break;
         }
      }
   }

   public ArrayList<Appointment> getAppointments() {
      return appointments;
   }

   public void setAppointments(ArrayList<Appointment> appointments) {
      this.appointments = appointments;
   }

}