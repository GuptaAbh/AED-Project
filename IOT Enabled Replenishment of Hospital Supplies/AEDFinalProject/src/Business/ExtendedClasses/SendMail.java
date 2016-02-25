/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ExtendedClasses;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhishek
 */
public class SendMail {
    String mail;
    String username;
    public boolean  sendMailtouser(String email,String userrname)
    {
        this.mail = email;
        this.username  = userrname;
        Properties props =new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        
        System.out.println("inside");
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication()
                    {
                        return new PasswordAuthentication("abhi23gupta@gmail.com", "Oxyspray");
                    }
        }
                );
        
        try
{
    //SMTPAuthenticator auth = new SMTPAuthenticator();
    System.out.println("inside123");
   Message message = new MimeMessage(session);
   message.setFrom(new InternetAddress("abhi23gupta@gmail.com"));
   message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("abhi23gupta@gmail.com"));
   message.setSubject("User Account "+userrname+" has been Created");
   message.setText(" Your Account has been created");
    System.out.println("This");
   Transport.send(message);
   //JOptionPane.showMessageDialog(null, "message send");
   
}
    catch(Exception e)
    {
        //JOptionPane.showMessageDialog(null, e.getMessage());
        System.out.println("Mail not sent done");
        return false;
    }
        return true;
        
    }
    
    
    
}
