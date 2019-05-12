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
public class Admin {
    boolean isAdmin;
    String user;
    String password;
    
    public Admin()
    {
        isAdmin=false;
        user ="admin";
        password ="admin";
    }
    
    public void setUser(String user)
    {
        this.user = user;
    }
    
    public String getUser()
    {
        return user;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setAdmin(boolean isAdmin)
    {
        this.isAdmin = isAdmin;
    }
    
    public boolean getAdmin()
    {
        return isAdmin;
    }
}
