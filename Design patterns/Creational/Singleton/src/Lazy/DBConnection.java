package Lazy;

public class DBConnection {
    private static DBConnection conObject;
    private DBConnection(){}
    public static DBConnection getInstance() {
        if (conObject == null) {
            conObject = new DBConnection();
        }
        return conObject;
    }
}

/*
there is a problem with the threads
if 2 threads come simulteniously both will find null and both will create a new object. we will resolve this with syncronize
 */
