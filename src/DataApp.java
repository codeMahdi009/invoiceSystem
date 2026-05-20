import java.sql.*;
public class DataApp {
    public static void main(String[] args){ //throws ClassNotFoundException, SQLException{
        Connection connection = null;
        try {

	    //System.out.println(10/0);
	
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish connection
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Institute", "root", ""
            );

	 // Create statement
	Statement stmt= connection.createStatement();

	// Execute query to insert data
	String sql = "Insert into Student values(4,'Sunil','Kelaniya')";
	System.out.println(sql);
           int i = stmt.executeUpdate(sql);
	if(i>0)
	 System.out.println("Data updated successfully");

 	// Execute query
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM Student");
	while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
		String address = resultSet.getString("address");
                System.out.println("ID: " + id + " | Name: " + name);
            }
	

        } catch (ClassNotFoundException e) {
            System.out.println("Cannot find the driver");
        } 
	catch (SQLException e) {
            System.out.println("Database Error");
            e.printStackTrace();
        } 
	catch (Exception e) {
            System.out.println("Communication Error");
        } 
    }
}	