package src.ProgramModeling.database;

import java.sql.*;

/**
 * Project: DataBaseHandler
 *
 * @author Paul Davis
 * @since 11/6/15
 */
public class DataBaseHandler {

    //Enumeration to handle states
    public enum CONNECTION_STATE {
        CONNECTED,
        NOT_CONNECTED,
        ERROR_CONNECTING
    }

    private CONNECTION_STATE currentState;
    private Connection connection;

    //In case something changes its easy to swap things here
    private static final String URL = "jdbc:mysql://coursescheduler.ddns.net/coursescheduler";
    private static final String USER = "JamesBond";
    private static final String PASSWORD = "!H@t3@l3c";

    /**
     * Creates the DataBaseHandler object that will be used to interface with the datastore
     */
    public DataBaseHandler() {
        currentState = CONNECTION_STATE.NOT_CONNECTED;
        if(registerSQLDriver()) {
            connectToDataBase(URL, USER, PASSWORD);
        }
    }

    /**
     * Registers the driver class into memory.
     *
     * For this handler, the MySQL Driver
     * @return True if successful
     */
    public boolean registerSQLDriver() {
        System.out.println("Registering Driver...");

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Could not register MySQL Driver. Database Interactions will not function.\n");
            return false;
        }

        System.out.println("Driver Registered\n");
        return true;
    }

    /**
     * Connects to the database provided
     * @param url The URL of the DataBase
     * @param user The username
     * @param pass The username's password
     */
    public void connectToDataBase(String url, String user, String pass) {
        System.out.println("Attempting to connect to the datastore...");

        try {
            connection = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.err.println("Could not connect to datastore");
            System.err.println("URL: " + url + "\n" +
                                "User: " + user + "\n" +
                                "Pass: " + pass + "\n");
            currentState = CONNECTION_STATE.ERROR_CONNECTING;
            return;
        }
        currentState = CONNECTION_STATE.CONNECTED;
        System.out.println("Connected to datastore\n");
    }

    /**
     * Closes the connection to the database
     */
    public void disconnectFromDataBase() {
        try {
            connection.close();
            currentState = CONNECTION_STATE.NOT_CONNECTED;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Executes an SQL statement
     * @param statement The string literal of the SQL statement
     *                  for example:
     *                      "SELECT * FROM CSCI" will execute that as it were
     *                          an MySQL statement
     * @return The ResultSet object with the return of the statement. Can be NULL.
     *          To view, loop using resultSet.next() and resultSet.getXXX("column_name") where XXX is the
     *          data type eg. String or Int.
     */
    public ResultSet executeStatement(String statement) {
        try {
            Statement query = connection.createStatement();
            return query.executeQuery(statement);
        } catch (SQLException e) {
        }
        return null;
    }

    /**
     * Used to get the state of the handler
     * @return The state of the handler
     */
    public CONNECTION_STATE getCurrentState() {
        return currentState;
    }
}
