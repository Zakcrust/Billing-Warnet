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
public class DataMember {

    Member[] data;
    int n;
    public DataMember(int MaxSize)
    {
        data = new Member[MaxSize];
        for(int i = 0; i< MaxSize; i++)
        {
            setData(i,"trolol","trolol",0);
        }
        n=0;
    }
    
    public void insertData(String user,String password, float saldo)
    {
        data[n] = new Member(user,password,saldo);
        n++;
    }
    
    
    private void setData(int id,String user,String password,float saldo)
    {
        data[id] = new Member(user,password,saldo);
    }
    
    
}
