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
public class DataClient {
 
    Client[] data;
    private final int MAX_CLIENT = 8;
    
    public DataClient()
    {
        data = new Client[MAX_CLIENT];
    }
    
    public void setData(int clientId,int waktu,String user)
    {
        data[clientId] = new Client(waktu, user, true, true);
    }
    
    public void showUpdatingData()
    {
        for(int i = 0; i< MAX_CLIENT ; i++)
        {
            System.out.println("user :\t"+data[i].getUser()+"waktu :\t"+data[i].getWaktu());
        }
    }
}
