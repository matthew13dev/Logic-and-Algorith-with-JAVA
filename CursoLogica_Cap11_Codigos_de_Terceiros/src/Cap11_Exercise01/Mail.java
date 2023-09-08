package Cap11_Exercise01;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Mail
{
    public void send (String to, String subject, String menssage) throws   EmailException
    {

        String user = "user@Gmail.com";
        String password = "password";
        String hots_name = "smtp.gmail.com";
        Integer smtp_port = 587;

        Email email = new SimpleEmail();
        email.setHostName(hots_name);
        email.setSmtpPort(smtp_port);
        email.setAuthenticator(new DefaultAuthenticator(user, password));
        email.setSSLOnConnect(true);
        email.setFrom(user);

        email.setSubject(subject);
        email.setMsg(menssage);
        email.addTo(to);
        email.send();
    }
}
