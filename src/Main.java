import javax.mail.MessagingException;

public class Main {
    public static void main(String[] args) {

        MailIslemleri mail = new MailIslemleri();
        try {
            mail.mailGonder("yyyy@gmail.com");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}