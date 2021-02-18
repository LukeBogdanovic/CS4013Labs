import java.util.StringTokenizer;

public class AppointmentDate {
   private int year;
   private int month;
   private int day;

   public AppointmentDate(String l) {
      StringTokenizer st = new StringTokenizer(l, "/");
      this.day = Integer.parseInt(st.nextToken());
      this.month = Integer.parseInt(st.nextToken());
      this.year = Integer.parseInt(st.nextToken());
   }

   public int getDay() {
      return day;
   }

   public int getMonth() {
      return month;
   }

   public int getYear() {
      return year;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public void setMonth(int month) {
      this.month = month;
   }

   public void setDay(int day) {
      this.day = day;
   }

   public String toString() {
      return day + "/" + month + "/" + year;
   }

}