/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseAccess;

import entities.TblProduct;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class TblProductDA {
    Connection con = null;

    public TblProductDA() {
        try {
            con = ConnectionDB.getConnet();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TblProductDA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<TblProduct> getAll() {
        List<TblProduct> list = new ArrayList<>();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT p.ProId, m.ManuName, p.ProName, p.YearMaking, p.ExpireDate, p.Price  FROM TblProduct AS p INNER JOIN TblManufacturer AS m ON p.MenuId = m.ManuId;");
            while(rs.next()){
                TblProduct product = new TblProduct();
                product.setProId(rs.getInt(1));
                product.setManuName(rs.getString(2));
                product.setProName(rs.getString(3));
                product.setYearMaking(rs.getInt(4));
                product.setExpireDate(rs.getDate(5));
                product.setPrice(rs.getFloat(6));
                list.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TblProductDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public boolean insert(TblProduct product)
    {
        try {
            PreparedStatement pst=con.prepareStatement("insert into TblProduct(MenuId, ProName, YearMaking, ExpireDate, Price) values(?,?,?,?,?)");
            pst.setInt(1, product.getMenuId());
            pst.setString(2, product.getProName());
            pst.setInt(3, product.getYearMaking());
            pst.setDate(4, product.getExpireDate());
            pst.setFloat(5, product.getPrice());
            return pst.executeUpdate()>0;
        } catch (SQLException ex) {
            Logger.getLogger(TblProductDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public List<TblProduct> search(String proName) {
        List<TblProduct> data = new ArrayList<>();
        try {
            PreparedStatement pst = con.prepareStatement("SELECT p.ProId, m.ManuName, p.ProName, p.YearMaking, p.ExpireDate, p.Price  FROM TblProduct AS p INNER JOIN TblManufacturer AS m ON p.MenuId = m.ManuId WHERE p.ProName like ?");
            pst.setString(1, "%"+proName+"%");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                TblProduct product = new TblProduct();
                product.setProId(rs.getInt(1));
                product.setManuName(rs.getString(2));
                product.setProName(rs.getString(3));
                product.setYearMaking(rs.getInt(4));
                product.setExpireDate(rs.getDate(5));
                product.setPrice(rs.getFloat(6));
                data.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TblProductDA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    public void closeCon(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TblProductDA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
