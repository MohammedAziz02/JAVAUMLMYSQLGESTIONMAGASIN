package com.test.connexiontobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionToBd {
      Connection conn;
      public  Connection connecttodb() throws SQLException, ClassNotFoundException {
          Class.forName("com.mysql.cj.jdbc.Driver");
          this.conn = DriverManager.getConnection("jdbc:mysql://localhost/gstmagasinjava","root","");
          return  conn;
      }
}
