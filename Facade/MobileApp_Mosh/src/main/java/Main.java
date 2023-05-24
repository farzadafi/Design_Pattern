public class Main {
    public static void main(String[] args) {

        //without Facade :(
        var server = new NotificationServer();
        var connection = server.connection("id");
        Message message = new Message("Hello world");
        AuthToken authToken = server.authenticate("appId", "key");
        server.send(authToken, message, "target");
        connection.disconnect();

        //with Facade :)
        NotificationService notificationService = new NotificationService();
        notificationService.send("Hello World", "farzadafi");
    }
}
