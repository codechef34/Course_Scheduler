package src.ProgramModeling.database;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Interface to run queries and return a string
 *  Format columns by * and class by |
 *  @author Paul Davis, Deana Johnson
 */
public class QueryBuilder {
    private static DataBaseHandler dataBaseHandler;

    /**
     * Used to get the info for the programs.
     *     Each column is separated by *, eg COURSE*TITLE*PREREQ1*PREREQ2*CREDIT*DESC
     *     End of course delimited by |
     * @param program The program (table) you wish to get info for. eg CSCI
     * @return The String return, ERROR or empty if issue occurred
     *  csci1470*Computer Science I*math1390*null*4*An introductory course for computer science majors and minors with major emphasis on problem solving and programming. The programming component covers data types, input/output statements, control statements, pointers, subprograms and functions, and structures. | NEXTONE
     */
    public static String getProgramList(String program) {
        String theReturn = "";

        if(!checkDataBase()){
            System.err.println("There was an error getting program list for " + program);
            theReturn = "There was an error getting course for " + program;
            return theReturn;
        }

        ResultSet results = dataBaseHandler.executeStatement("SELECT * FROM " + program);

        if(results == null) {
            System.err.println("There was an error getting program list for " + program);
            theReturn = "There was an error getting program list for " + program;
            return theReturn;
        }

        try {
            while(results.next()) {
                theReturn += results.getString("course") + "*" + results.getString("title") + "*" + results.getString("prereq1")
                        + "*" + results.getString("prereq2") + "*" + results.getInt("credit") + "*" + results.getString("description") +
                        "|";
            }
        } catch (SQLException e) {
            System.err.println("There was an error getting program list for " + program);
            theReturn = "There was an error getting program list for " + program;
        }
        dataBaseHandler.disconnectFromDataBase();

        if(theReturn.isEmpty()) theReturn = "ERROR, nothing selected";

        return theReturn;
    }

    /**
     * Get the info for one specific course in a program
     * @param program The program, eg CSCI
     * @param course The course, eg csci1470
     * @return Comma decimated string with * names returns
     *  csci1470*Computer Science I*math1390*null*4*An introductory course for computer science majors and minors with major emphasis on problem solving and programming. The programming component covers data types, input/output statements, control statements, pointers, subprograms and functions, and structures.
     */
    public static String getCourseInfo(String program, String course) {
        String theReturn = "";

        //Null Check
        if(!checkDataBase()){
            System.err.println("There was an error getting course info for " + program);
            theReturn = "There was an error getting course for " + program;
            return theReturn;
        }

        ResultSet results = dataBaseHandler.executeStatement("SELECT * FROM " + program);

        if(results == null) {
            System.err.println("There was an error getting course info for " + program);
            theReturn = "There was an error getting course for " + program;
            return theReturn;
        }

        try {
            while(results.next()) {
                if (results.getString("course").equalsIgnoreCase(course)) {
                    theReturn += results.getString("course") + "*" + results.getString("title") + "*" + results.getString("prereq1")
                            + "," + results.getString("prereq2") + "*" + results.getInt("credit") + "*" + results.getString("description");
                }
            }
        } catch (SQLException e) {
            System.err.println("There was an error getting course info for " + program);
            theReturn = "There was an error getting course for " + program;
        }
        dataBaseHandler.disconnectFromDataBase();

        if(theReturn.isEmpty()) theReturn = "ERROR, nothing selected";

        return theReturn;
    }

    /**
     * Used to execute a sql command
     * @param sql The string representative of the sql statement
     * @return The returning set, if something returns
     */
    public static ResultSet executeStatement(String sql) {
        if(!checkDataBase())
            return null;

        return dataBaseHandler.executeStatement(sql);
    }

    /**
     * Used to validate the database
     * @return True if open and ready to go
     */
    public static boolean checkDataBase() {
        if(dataBaseHandler == null || dataBaseHandler.getCurrentState() == DataBaseHandler.CONNECTION_STATE.NOT_CONNECTED ||
                dataBaseHandler.getCurrentState() == DataBaseHandler.CONNECTION_STATE.ERROR_CONNECTING) {
            dataBaseHandler = new DataBaseHandler();
        }

        if(dataBaseHandler.getCurrentState() == DataBaseHandler.CONNECTION_STATE.NOT_CONNECTED || dataBaseHandler.getCurrentState() == DataBaseHandler.CONNECTION_STATE.ERROR_CONNECTING) {
            System.err.println("Error Creating DataBaseHandler object");
            return false;
        }
        return true;
    }
}
