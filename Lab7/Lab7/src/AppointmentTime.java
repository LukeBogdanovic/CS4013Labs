import java.util.StringTokenizer;

public class AppointmentTime {
   private String hours;
   private String minutes;

   public AppointmentTime(String l) {
      StringTokenizer st = new StringTokenizer(l, ":");
      this.hours = st.nextToken();
      this.minutes = st.nextToken();
   }

   public String getHours() {
      return hours;
   }

   public void setHours(String hours) {
      this.hours = hours;
   }

   public String getMinutes() {
      return minutes;
   }

   public void setMinutes(String minutes) {
      this.minutes = minutes;
   }

   public String toString() {
      return hours + ":" + minutes;
   }

}