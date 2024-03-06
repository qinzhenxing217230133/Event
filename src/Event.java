import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Event {
 private String eventID;
 private String eventName;
 private String eventVenue;
 private Date eventDate;
 private ArrayList<String> eventAttendees;

 public Event(String eventID, String eventName, String eventVenue, Date eventDate) {
 this.eventID = eventID;
 this.eventName = eventName;
 this.eventVenue = eventVenue;
 this.eventDate = eventDate;
 this.eventAttendees = new ArrayList<>();
 }

 public String getEventID() {
 return eventID;
 }

 public void setEventID(String eventID) {
 this.eventID = eventID;
 }

 public String getEventName() {
 return eventName;
 }

 public void setEventName(String eventName) {
 this.eventName = eventName;
 }

 public String getEventVenue() {
 return eventVenue;
 }

 public void setEventVenue(String eventVenue) {
 this.eventVenue = eventVenue;
 }

 public Date getEventDate() {
 return eventDate;
 }

 public void setEventDate(Date eventDate) {
 this.eventDate = eventDate;
 }

 public ArrayList<String> getEventAttendees() {
 return eventAttendees;
 }

 public void addAttendee(String attendee) {
 this.eventAttendees.add(attendee);
 }

 public void removeAttendee(String attendee) {
 this.eventAttendees.remove(attendee);
 }

 public boolean findAttendee(String attendee) {
 return this.eventAttendees.contains(attendee);
 }

 public int getNumberOfAttendees() {
 return this.eventAttendees.size();
 }

 @Override
 public String toString() {
 return "活动ID: " + eventID + "\n活动名称: " + eventName + "\n活动地点: " + eventVenue + "\n活动日期: " + eventDate + "\n参与者: " + eventAttendees;
 }
 
 public void organizeEvent() {
 Scanner scanner = new Scanner(System.in);
 System.out.println("请输入活动ID:");
 this.setEventID(scanner.nextLine());
 System.out.println("请输入活动名称:");
        this.setEventName(scanner.nextLine());
        System.out.println("请输入活动地点:");
        this.setEventVenue(scanner.nextLine());
        System.out.println("请输入活动日期(格式：yyyy-MM-dd):");
        this.setEventDate(java.sql.Date.valueOf(scanner.nextLine()));
        System.out.println("请输入参与者名单(以逗号分隔):");
        String[] attendees = scanner.nextLine().split(",");
        for (String attendee : attendees) {
            this.addAttendee(attendee);
        }
        System.out.println("活动已成功创建!");
        System.out.println(this.toString());
    }
}
