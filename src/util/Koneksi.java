/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Koneksi {

    public static Connection databasekoneksi;
    public static Statement st;

    public static Connection koneksiDB() {
            try {
                String DB, username, password;

                DB = "jdbc:mysql://localhost:3306/dabar";
                username = "root";
                password = "";
                databasekoneksi = (Connection) DriverManager.getConnection(DB, username, password);
                st = databasekoneksi.createStatement();
//                System.out.println("koneksi berhasil");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal "+ e.getMessage());
            }

        return databasekoneksi;

    }
}
