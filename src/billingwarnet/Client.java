/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingwarnet;

/**
 *
 * @author zak
 */
public class Client {
    
    int waktu;
    float harga;
    String user;
    boolean registered;
    boolean occupied;
    
    public Client()
    {
        harga = 0;
        waktu=0;
        user="";
        registered=false;
        occupied=false;
    }
    
    public Client(int waktu,String user, boolean registered, boolean occupied)
    {
        this.waktu = waktu;
        this.user = user;
        this.registered = registered;
        this.occupied = occupied;
    }
    
    public int getWaktu()
    {
        return waktu;
    }
    
    public void setWaktu(int x)
    {
        waktu = x;
    }
    
    public void addWaktu(int x)
    {
        waktu += x;
    }
    
    public void reduceWaktu(int x)
    {
        waktu -=x;
    }
    
    public void setUser(String x)
    {
        user = x;
    }
    
    public String getUser()
    {
        return user;
    }
    
    public boolean getRegistered()
    {
        return registered;
    }
    
    public void setRegistered(boolean x)
    {
        registered = x;
    }
    
    public boolean getOccupied()
    {
        return occupied;
    }
    
    public void setOccupied(boolean x)
    {
        occupied = x;
    }
}
