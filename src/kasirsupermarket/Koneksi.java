/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasirsupermarket;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class Koneksi {
    Connection con;
    Statement stm;
    
    public void config(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/db_kasir","root","");
            stm = (Statement) con.createStatement();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "koneksi gagal" + e.getMessage());
        }
    }
}
//nama database db_kasir 
//nama table barang
