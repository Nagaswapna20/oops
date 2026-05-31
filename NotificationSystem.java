interface Notifications {
    void sendMessages(String message);
}
class MobileNotification implements Notifications {
    public void sendMessages(String message) {
        System.out.println("Sending mobile notification: " + message);
    }
}
class EmailNotification implements Notifications {
    public void sendMessages(String message) {
        System.out.println("Sending email notification: " + message);
    }
}
public class NotificationSystem {
    public static void main(String[] args) {
        MobileNotification md = new MobileNotification();
        EmailNotification ed = new EmailNotification();
        md.sendMessages("You have a new message!");
        ed.sendMessages("You have a new email!");
    }

}
interface Notifications {
    void sendMessages(String message);
}
class InstaNotification implements Notifications {
    public void sendMessages(String message) {
        System.out.println("Sent Reel by Radha\n " + message);
    }
}
class JobNotification implements Notifications {
    public void sendMessages(String message) {
        System.out.println("Your selected in the role of Data Analytics\n " + message);
    }
}
public class NotificationSystem {
    public static void main(String[] args) {
        InstaNotification md=new InstaNotification();
        JobNotification ed=new JobNotification();
        md.sendMessages("You have a new message!");
        ed.sendMessages("You have a new email!");
    }
}