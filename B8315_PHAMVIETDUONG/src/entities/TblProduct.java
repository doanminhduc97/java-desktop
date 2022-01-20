/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;
import java.sql.Date;
/**
 *
 * @author Admin
 */
public class TblProduct {
    private int proId;
    private int menuId;
    private String proName;
    private String manuName;
    private int yearMaking;
    private Date expireDate;
    private float price;

    public TblProduct(int menuId, String proName, int yearMaking, Date expireDate, float price) {
        this.menuId = menuId;
        this.proName = proName;
        this.yearMaking = yearMaking;
        this.expireDate = expireDate;
        this.price = price;
    }

    public TblProduct() {
    }

    public String getManuName() {
        return manuName;
    }

    public void setManuName(String manuName) {
        this.manuName = manuName;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getYearMaking() {
        return yearMaking;
    }

    public void setYearMaking(int yearMaking) {
        this.yearMaking = yearMaking;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
}
