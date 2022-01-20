/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Admin
 */
public class TblManufacturer {
    private int manuId;
    private String manuName;
    private String address;

    public TblManufacturer() {
    }
    
    public int getManuId() {
        return manuId;
    }

    public void setManuId(int manuId) {
        this.manuId = manuId;
    }

    public String getManuName() {
        return manuName;
    }

    public void setManuName(String manuName) {
        this.manuName = manuName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
