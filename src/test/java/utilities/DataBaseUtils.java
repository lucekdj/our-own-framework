package utilities;

import jdk.nashorn.internal.runtime.regexp.joni.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseUtils {



    static String url= ConfigReader.getConfigProperty("db.url");
    static String username= ConfigReader.getConfigProperty("db.username");
    static String password= ConfigReader.getConfigProperty("db.password");

    static Connection con;
    static Statement stmt;
    static ResultSet rs;

    public static void InitializeDataBaseProperties(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(url,username,password);
            stmt= con.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void closeDataBaseConnection() {
        try {
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
public static ResultSet executeQuery(String query){
        try{
            rs= stmt.executeQuery(query);
        }catch (Exception e){
            e.printStackTrace();
        }
        return rs;
    }
}

