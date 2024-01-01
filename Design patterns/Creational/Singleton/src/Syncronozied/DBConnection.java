package Syncronozied;

public class DBConnection {
    private static DBConnection conObject;
    private DBConnection(){}
    synchronized public static DBConnection getInstance() {
        if (conObject == null) {
            conObject = new DBConnection();
        }
        return conObject;
    }
}

/*
the problem with the syncronize is. it's too expensive.
if there are 1000 requests coming. for every request first it will lock then check null or not. locking is expensive
 */
