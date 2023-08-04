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
    private MySqlConnection dbConnection;

    public PasswordReminder(MySqlConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
}
