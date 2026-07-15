/*
Build a system that sends a message to a user across channels: email, SMS, and push. 
Requirements: adding a new channel (e.g. slack) must not touch existing code; the core service must be unit-testable with no real network; a channel can't handle a message type shouldn't be forced to fake it.
*/


interface TextMessage {
    void sendMessage(String user, String message);
}

interface RichTextMessage {
    void sendMessage(String user, String subject, String message);
}

class EmailMessage implements RichTextMessage {

    public void sendMessage(String user, String subject, String message) {
        System.out.println("Sending Email to " + user + " with subject: " + subject + " and message: " + message);
    }
}

class SMSMessage implements TextMessage {

    public void sendMessage(String user, String message) {
        System.out.println("Sending SMS to " + user + " with message: " + message);
    }
}

class PushMessage implements TextMessage {

    public void sendMessage(String user, String message) {
        System.out.println("Sending Push Notification to " + user + " with message: " + message);
    }
}

class SlackMessage implements RichTextMessage {

    public void sendMessage(String user, String subject, String message) {
        System.out.println("Sending Slack Message to " + user + " with subject: " + subject + " and message: " + message);
    }
}


class MessageService {
    private TextMessage textMessage;
    private RichTextMessage richTextMessage;

    MessageService(TextMessage textMessage, RichTextMessage richTextMessage) {
        this.textMessage = textMessage;
        this.richTextMessage = richTextMessage;
    } 

    public void textNotify(String user, String message) {
        textMessage.sendMessage(user, message);
    }

    public void richTextNotify(String user, String subject, String message) {
        richTextMessage.sendMessage(user, subject, message);
    }
}

class Main {
    public static void main(String[] args) {
        MessageService msgService = new MessageService(new SMSMessage(), new SlackMessage());
        msgService.textNotify("user1", "Hello, this is a text message.");
        msgService.richTextNotify("user2", "Subject", "Hello, this is a rich text message.");
    }
}
