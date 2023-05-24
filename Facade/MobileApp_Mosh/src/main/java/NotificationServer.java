public class NotificationServer {
    public Connection connection(String ipAddress){
        return new Connection();
    }

    public AuthToken authenticate(String appId, String key) {
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String target) {
        System.out.println("sending a message");
    }
}
