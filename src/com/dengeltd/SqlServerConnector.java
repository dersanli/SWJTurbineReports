package com.dengeltd;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by dersanli on 3/6/17.
 */
class SqlServerConnector {

    SqlServerConnector()
    {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String serverIP = "10.10.20.22";

        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setServerName(serverIP);
        ds.setDatabaseName("WINDTURBINE");
        ds.setUser("sa");
        ds.setPassword("!Soyut8745");

        try {
            conn = ds.getConnection();
            String SQL = "SELECT TOP 10 * FROM WTPLCTAGS";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString(4) + " " + rs.getString(6));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) try { rs.close(); } catch(Exception ignored) {}
            if (stmt != null) try { stmt.close(); } catch(Exception ignored) {}
            if (conn != null) try { conn.close(); } catch(Exception ignored) {}
        }
    }

}
