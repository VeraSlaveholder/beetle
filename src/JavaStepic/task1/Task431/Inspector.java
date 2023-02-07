package JavaStepic.task1.Task431;

public class Inspector implements MailService {
    public static class IllegalPackageException extends RuntimeException {}
    public static class StolenPackageException extends RuntimeException {}

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailPackage) {
                Package pac = ((MailPackage) mail).getContent();
                String content = pac.getContent();
                if (content.indexOf("stones instead of ") == 0) {
                    throw new StolenPackageException();
                } else if (content.equals("WEAPONS") || content.equals("BANNED_SUBSTANCE")) {
                    throw new IllegalPackageException();
                }
            }
            return mail;
        }
}
