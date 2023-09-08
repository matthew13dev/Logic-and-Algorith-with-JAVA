package Cap11_Library_Email;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Mail
{
    public void send (String to, String subject, String menssage) throws   EmailException
    {
        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(587);
        email.setAuthenticator(new DefaultAuthenticator("user@@Gmail.com", "password"));
        email.setSSLOnConnect(true);
        email.setFrom("user@Gmail.com");

        email.setSubject(subject);
        email.setMsg(menssage);
        email.addTo(to);
        email.send();
    }
}
