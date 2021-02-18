import java.util.StringTokenizer;

public class Appointment {
   private String description;
   private AppointmentDate day;
   private AppointmentTime from;
   private AppointmentTime to;

   public Appointment(String l) {
      StringTokenizer st = new StringTokenizer(l, " ");
      this.description = st.nextToken();
      this.day = new AppointmentDate(st.nextToken());
      this.from = new AppointmentTime(st.nextToken());
      this.to = new AppointmentTime(st.nextToken());
   }

   public String format() {
      return description + " " + day.toString() + " " + from.toString() + " " + to.toString();
   }

   public AppointmentDate getDay() {
      return day;
   }

   public void setDay(AppointmentDate day) {
      this.day = day;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public AppointmentTime getFrom() {
      return from;
   }

   public void setFrom(AppointmentTime from) {
      this.from = from;
   }

   public AppointmentTime getTo() {
      return to;
   }

   public void setTo(AppointmentTime to) {
      this.to = to;
   }

}
