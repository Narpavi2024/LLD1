package DesignPattern.Singleton;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;

/*
  Steps to create Singleton class
  1.Make constructor private.
  2.Create static method that return the instance of the class.
  3.Static method check if instance is null.
  4.If null create new instance else return existing instance.
 */

public class DBConnection {
    private static DBConnection instance = null;
    String url;
    String username;
    String password;
    List<Connection> list;

    private DBConnection(){
        this.list = new ArrayList<>();
    }

    public static DBConnection getInstance(){

        if(instance == null){
            synchronized (DBConnection.class){
                if (instance == null){
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }
}
