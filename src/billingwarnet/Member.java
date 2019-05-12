/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingwarnet;

import javax.swing.JOptionPane;

/**
 *
 * @author zak
 */
public class Member {

    private String user;
    private String password;
    private float saldo;
   
    public Member()
    {
        user = "123";
        password = "123";
        saldo = 0;
    }
    
    public Member(String user, String password, float saldo)
    {
        this.user = user;
        this.password = password;
        this.saldo = saldo;
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
    
    public void addSaldo(float Saldo)
    {
        this.saldo += saldo;
    }
    
    public void takeSaldo(float Saldo)
    {
        this.saldo -= saldo;
    }
    
    public Float getSaldo()
    {
        return saldo;
    }
}
