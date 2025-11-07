package _11_07;

import javafx.application.Application;
import javafx.scene.control.ComboBoxBase;
import javafx.stage.Stage;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class todoList extends Application {
    private Connection conn = null;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        try{
            Class.forName("org.sqlite.idbc3.JDBC3Connection");
            conn = DriverManager.getConnection("jdbc:sqlite:sql/test.sqlite");
            System.out.println("데이터베이스 연결 성공!");
        }
        catch (Exception e){
            System.out.println("데이터베이스 연결 실패...");
            System.out.println(e);
        }
    }
    public Connection dbConnector(){
        try{
            if(conn == null){
                Class.forName("org.sqlite.jdbc3.JDBC3Connaction");
                conn = DriverManager.getConnection("데이터베이스 연결 성공!");
                System.out.println("데이터베이스 연결 성공!");
                return conn;
            }
            else{
                return conn;
            }
        }
        catch (Exception e){
            System.out.println("데이터베이스 연결 실패...");
            System.out.println(e.getMessage());
            return null;
        }
    }
}
