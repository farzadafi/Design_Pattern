public class Main {
    public static void main(String[] args) {
        var server = new NotificationServer();
        var connection = server.connection("id");
        Message message = new Message("Hello world");
        AuthToken authToken = server.authenticate("appId", "key");
        server.send(authToken, message, "target");
        connection.disconnect();
    }
}
