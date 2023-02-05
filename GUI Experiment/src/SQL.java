import java.sql.*;

public class SQL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/practice-db";
        String userName = "root";
        String password = "Arindam#1091";
        int rowCounter = 0;
        try {
            Connection con = DriverManager.getConnection(url,userName,password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select*from employee_db");
            while(rs.next()){
                rowCounter +=1;
                if("bikram@gmail.com".equals(rs.getString(1))){
                    System.out.println("Got Found!.....row no.: "+rowCounter);
                    break;
                }
            }
            System.out.println("Connected to MySQL......");
            con.close();

        } catch(SQLException e){
            System.out.println("Unexpected: "+e);
            e.printStackTrace();
        }
    }
}