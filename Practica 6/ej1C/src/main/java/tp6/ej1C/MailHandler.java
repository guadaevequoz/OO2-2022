package tp6.ej1C;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.LogRecord;
import java.util.logging.SocketHandler;

import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class MailHandler extends SocketHandler{

	private String from, to, username, password;
	private Session session;
	
	public MailHandler() throws IOException {
		super("smtp.mailtrap.io",587);
		from = "example@logger.com";
		to = "destination@mail.com";

		// credenciales
		username = ""; // Completar con su username de mailtrap
		password = ""; // Completar con su password de mailtrap
		
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.mailtrap.io");
		props.put("mail.smtp.port", "587");				 
	    session = Session.getInstance(props,
			new Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	            	return new PasswordAuthentication(username, password);
	            }
		});

	}

	@Override
	public void publish(LogRecord record) {
		try {
			Message message = new MimeMessage(session);
		    message.setFrom(new InternetAddress(from, "Mail handler"));
		    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
		    message.setSubject(record.getMessage());
		    message.setText(getFormatter().format(record));
		    Transport.send(message);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
	    }
	}

	@Override
	public void close() throws SecurityException {
		// TODO Auto-generated method stub
		
	}

}
