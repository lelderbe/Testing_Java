package thinking_in_java;

/**
 * Created by user on 07.03.2016.
 */
public class ConnectionManager {
    private static ConnectionManager[] connection = new ConnectionManager[3];

    private ConnectionManager() {}

    public static ConnectionManager makeConnection() {
        ConnectionManager result = null;
        for (int i = 0; i < connection.length; i++) {
            if (connection[i] == null) {
                result = new ConnectionManager();
                connection[i] = result;
                System.out.print("Создан объект №" + (i + 1) + ", ");
                break;
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        ConnectionManager con1 = ConnectionManager.makeConnection();
        ConnectionManager con2 = ConnectionManager.makeConnection();
        ConnectionManager con3 = ConnectionManager.makeConnection();
        ConnectionManager con4 = ConnectionManager.makeConnection();

    }
}
