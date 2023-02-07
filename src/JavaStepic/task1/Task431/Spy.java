package JavaStepic.task1.Task431;

import java.util.logging.Logger;

public class Spy implements MailService {
    private Logger logger;

    public Spy(Logger logger) {
        this.logger=logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if(mail instanceof MailMessage) {
            MailMessage mailMessage = (MailMessage) mail;
            String from = mailMessage.getFrom();
            String to = mailMessage.getTo();
            if (from.equals("AUSTIN_POWERS") || to.equals("AUSTIN_POWERS")) {
                logger.warning("Detected target mail correspondence: from " + from + " to " + to + " \"" + mailMessage.getMessage() + "\"");
            } else {
                logger.info("Usual correspondence: from " + from + " to " + to + "");
            }
        }
        return mail;

    }
}
