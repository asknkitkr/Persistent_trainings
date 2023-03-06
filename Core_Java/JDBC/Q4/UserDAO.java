import java.util.ArrayList;
import java.util.Date;
import java.sql.*;

public class UserDAO {

  public ArrayList<User> listUsers() throws Exception {
    ArrayList<User> userList = new ArrayList<User>();

    Connection con = DBConnection.getConnection();

    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM user");

    while (rs.next()) {
      Integer id = rs.getInt("id");
      String name = rs.getString("name");
      String email = rs.getString("email");
      String password = rs.getString("password");
      Integer age = rs.getInt("age");
      String role = rs.getString("role");
      Date dateCreated = rs.getDate("created_date");
      String status = rs.getString("status");

      User user = new User(id, name, email, password, age, role, dateCreated, status);
      userList.add(user);
    }

    rs.close();
    st.close();
    con.close();

    return userList;
  }

  public void deleteUser(Integer id) throws Exception {
    Connection con = DBConnection.getConnection();
    PreparedStatement ps = con.prepareStatement("DELETE FROM user WHERE id=?");
    ps.setInt(1, id);

    ps.close();
    con.close();
  }

}