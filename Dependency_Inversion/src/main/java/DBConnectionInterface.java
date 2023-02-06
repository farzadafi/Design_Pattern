public interface DBConnectionInterface {
    int connect();
}

class MySqlConnection implements DBConnectionInterface {

    @Override
    public int connect() {
        return 0;
    }
}

class PasswordReminder {
    private int dbConnection;

    public PasswordReminder(MySqlConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
}
