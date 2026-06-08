// A
abstract class Notification {

    // E
    private String recipient;

    public Notification(String recipient) {
        this.recipient = recipient;
    }

    public String getRecipient() {
        return recipient;
    }

    // Abstract behavior
    abstract void send();
}

// I
class EmailNotification extends Notification {

    public EmailNotification(String recipient) {
        super(recipient);
    }

    @Override
    void send() {
        System.out.println("Sending Email to " + getRecipient());
    }
}

class SMSNotification extends Notification {

    public SMSNotification(String recipient) {
        super(recipient);
    }

    @Override
    void send() {
        System.out.println("Sending SMS to " + getRecipient());
    }
}


public class NotificationDemo {

    public static void main(String[] args) {

        // ---------- POLYMORPHISM ----------
        Notification n1 = new EmailNotification("jishan@mail.com");
        Notification n2 = new SMSNotification("9999999999");

        n1.send();  
        n2.send();   
    }
}
