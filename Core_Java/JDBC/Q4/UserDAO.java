import java.sql.*;
import java.util.ArrayList;

public class UserDAO {
  public ArrayList<User> listUsers() throws Exception {
    ArrayList<User> userList = new ArrayList<User>();
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    try {
      connection = DBConnection.getConnection();
      statement = connection.createStatement();
      resultSet = statement.executeQuery("SELECT * FROM \"user\"");

      while (resultSet.next()) {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("name"));
        user.setEmail(resultSet.getString("email"));
        user.setPassword(resultSet.getString("password"));
        user.setAge(resultSet.getInt("age"));
        user.setRole(resultSet.getString("role"));
        user.setCreatedDate(resultSet.getDate("created_date"));
        user.setStatus(resultSet.getString("status"));

        userList.add(user);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (resultSet != null) {
          resultSet.close();
        }
        if (statement != null) {
          statement.close();
        }
        if (connection != null) {
          connection.close();
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }

    return userList;
  }

  public void deleteUser(Integer id) throws Exception {
    Connection connection = null;
    PreparedStatement preparedStatement = null;

    try {
      connection = DBConnection.getConnection();
      preparedStatement = connection.prepareStatement("DELETE FROM \"user\" WHERE id=?");
      preparedStatement.setInt(1, id);
      preparedStatement.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (preparedStatement != null) {
          preparedStatement.close();
        }
        if (connection != null) {
          connection.close();
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}
