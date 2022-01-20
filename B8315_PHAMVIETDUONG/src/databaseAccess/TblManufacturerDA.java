/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseAccess;

import entities.TblManufacturer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class TblManufacturerDA {
    Connection con = null;

    public TblManufacturerDA() {
        try {
            con = ConnectionDB.getConnet();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TblManufacturerDA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<TblManufacturer> getAll() {
        List<TblManufacturer> list = new ArrayList<>();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from TblManufacturer");
            while(rs.next()){
                TblManufacturer manu = new TblManufacturer();
                manu.setManuId(rs.getInt(1));
                manu.setManuName(rs.getString(2));
                manu.setAddress(rs.getString(3));
                list.add(manu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TblManufacturer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public void closeCon(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TblManufacturer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
