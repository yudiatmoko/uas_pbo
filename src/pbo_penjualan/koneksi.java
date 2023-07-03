/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_penjualan;

import java.sql.*;

/**
 *
 * @author sudiy
 */
public class koneksi {
    
    public static Connection getKoneksi(){
        Connection koneksiDB = null;
        String url = "jdbc:mysql://localhost:3306/pbo_penjualan";
        String user = "root";
        String pw = "";
        
        try{
            koneksiDB = DriverManager.getConnection(url, user, pw);
            System.out.println("Koneksi Berhasil");
            
        } catch (SQLException e){
            System.out.println("Koneksi error");
        }
        
        return koneksiDB;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        getKoneksi();
        
    }
    
    
}
