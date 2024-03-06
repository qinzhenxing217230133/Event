import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
 Scanner Scanner = new Scanner(System.in);
 Map<String, Event> events = new HashMap<>();

 while (true) {
 System.out.println("请选择操作：");
 System.out.println("1. 创建新活动"); 
 System.out.println("2. 管理活动");
 System.out.println("3. 退出"); 
 String option = Scanner.nextLine();

 switch (option) {
 case "1":
 System.out.println("请输入活动ID:");
 String eventID = Scanner.nextLine();
 System.out.println("请输入活动名称:");
 String eventName = Scanner.nextLine();
 System.out.println("请输入活动地点:");
 String eventVenue = Scanner.nextLine();
 System.out.println("请输入活动日期(格式：yyyy-MM-dd):");
 Date eventDate = java.sql.Date.valueOf(Scanner.nextLine());
 Event event = new Event(eventID, eventName, eventVenue, eventDate);
 events.put(eventID, event);
 System.out.println("活动已成功创建!");
 break;
 case "2":
 System.out.println("请输入要管理的活动ID:");
 String id = Scanner.nextLine();
 if (events.containsKey(id)) {
 events.get(id).organizeEvent();
 } else {
 System.out.println("未找到该活动ID!");
 }
 break;
 case "3":
 System.out.println("退出程序.");
 return;
 default:
 System.out.println("无效的选项，请重新选择.");
 break;
 }
 }
 }
}
