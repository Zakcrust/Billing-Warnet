/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingwarnet;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import billingwarnet.db.*;

/**
 *
 * @author zak
 */
public class MainFrame extends JFrame {

    public static JFrame frame;
    public static BillingMainMenu mainMenu;
    public static BillingAdminMenu adminMenu;
    public static BillingTransaction transaction;
    public static BillingClientStatus clientStatus;
    public static BillingLogin login;
    public static Admin admin;
    public static DataClient dataClient;
    public static DataMember dataMember;
    public static void main(String[] args)
    {
        int maxMember = 100;
        mainMenu = new BillingMainMenu();
        adminMenu = new BillingAdminMenu();
        adminMenu.setPanelGroup();
        transaction = new BillingTransaction();
        clientStatus = new BillingClientStatus();
        login = new BillingLogin();
        admin = new Admin();
        dataClient = new DataClient();
        dataMember = new DataMember(maxMember);
        System.out.println(dataMember.data[0].getUser());
        frame = new JFrame("Billing Warnet");
        frame.setSize(600,480);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // as per your requirement.
        frame.add(mainMenu, BorderLayout.CENTER);
        mainMenu.setDataClient(dataClient);
        frame.setVisible(true);
        
        DatabaseClass db = new DatabaseClass("warnet");
        
    }
    
    public static void hideMainMenu()
    {
        mainMenu.setVisible(false);
    }
    
    public static void addLogin()
    {
        frame.add(login, BorderLayout.CENTER);
    }
    
    public static void showLogin()
    {
        login.setVisible(true);
    }
    
    public static void hideLogin()
    {
        login.setVisible(false);
    }
    
    public static void addAdminMenu()
    {
        frame.add(adminMenu, BorderLayout.CENTER);
    }
    
    public static void  hideAdminMenu()
    {
        adminMenu.setVisible(false);
    }
    
    public static void showAdminMenu()
    {
        adminMenu.setVisible(true);
    }
    
    public static void addClientStatus()
    {
        frame.add(clientStatus, BorderLayout.CENTER);
    }
    
    public static void showClientStatus()
    {
        clientStatus.setVisible(true);
    }
    
    public static void hideClientStatus()
    {
        clientStatus.setVisible(false);
    }
    
    public static void addTransaction()
    {
        frame.add(transaction, BorderLayout.CENTER);
    }
    
    public static void showTransaction()
    {
        transaction.setVisible(true);
    }
    
    public static void hideTransaction()
    {
        transaction.setVisible(false);
    }
    
    public static DataClient getDataClient()
    {
        return dataClient;
    }
    
    public static Admin getAdmin()
    {
        return admin;
    }
    
    public static DataMember getDataMember()
    {
        return dataMember;
    }
    
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

}
