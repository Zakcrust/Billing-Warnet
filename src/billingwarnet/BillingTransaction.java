/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingwarnet;

import javax.swing.ButtonGroup;

/**
 *
 * @author zak
 */
public class BillingTransaction extends javax.swing.JPanel {

    /**
     * Creates new form BillingTransaction
     */
    DataClient dataClient;
    DataMember dataMember;
    long harga;
    String waktuText;
    int time;
    public BillingTransaction() {
        initComponents();
        groupButton();
    }

    public void setDataClient(DataClient dataClient)
    {
        this.dataClient = dataClient;
    }
    
    public void setDataMember(DataMember dataMember)
    {
        this.dataMember = dataMember;
    }
    
    public void setUserName()
    {
        if(dataMember!=null)
        {
            clientName.setText(dataMember.data[0].getUser());
            System.out.println(dataMember.data[0].getUser());
        }
        else
        {
            clientName.setText("Guest");
        }
    }
    
    private void checkSelectedPacket()
    {
        if(jam1.isSelected())
            {
                harga =3000;
                waktuText = "1 jam";
                time = 3600;
            }
            else if(jam2.isSelected())
            {
                harga =2*3000;
                waktuText = "2 Jam";
                time = 2*3600;
            }
            else if(jam3.isSelected())
            {
                harga =3*3000;
                waktuText = "3 Jam";
                time = 3*3600;
            }
            else if(jam5.isSelected())
            {
                harga =5*3000;
                waktuText = "5 Jam";
                time = 5*3600;
            }
            else if(jam7.isSelected())
            {
                harga =7*3000;
                waktuText = "7 jam";
                time = 7*3600;
            }
            else if(paketMalam.isSelected())
            {
                harga =10*3000;
                waktuText = "Paket Malam";
                time = 10*3600;
            }
            else
            {
                 MainFrame.infoBox("Pilih salah satu paket", "Peringatan");
            }
            
    }
    
    private void confirmTransaction()
    {
        
        if(dataMember!=null)
        {
            checkSelectedPacket();
            if(dataMember.data[0].getSaldo() < harga)
            {
                MainFrame.infoBox("Saldo anda tidak cukup","Peringatan");
                return;
            }
            MainFrame.clientStatus.setDisplayedStatus(dataMember.data[0].getUser(),String.valueOf(harga), waktuText);
        }
        else
        {
            checkSelectedPacket();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jam1 = new javax.swing.JRadioButton();
        jam2 = new javax.swing.JRadioButton();
        jam3 = new javax.swing.JRadioButton();
        jam5 = new javax.swing.JRadioButton();
        jam7 = new javax.swing.JRadioButton();
        paketMalam = new javax.swing.JRadioButton();
        personal = new javax.swing.JRadioButton();
        confirmTransaction = new javax.swing.JButton();
        clientName = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 480));

        jLabel1.setText("Nama");

        jLabel2.setText("Waktu");

        jam1.setText("1 jam");

        jam2.setText("2 jam");

        jam3.setText("3 jam");
        jam3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam3ActionPerformed(evt);
            }
        });

        jam5.setText("5 jam");

        jam7.setText("7 jam");

        paketMalam.setText("Paket Malam");

        personal.setText("Personal");

        confirmTransaction.setText("Konfirmasi");
        confirmTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmTransactionActionPerformed(evt);
            }
        });

        clientName.setText("ClientName");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clientName)
                                    .addComponent(jam1)
                                    .addComponent(jam2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jam3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jam7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jam5)
                                        .addGap(18, 18, 18)
                                        .addComponent(paketMalam))))
                            .addComponent(personal))))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(clientName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jam1)
                    .addComponent(jam3)
                    .addComponent(jam7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jam2)
                    .addComponent(jam5)
                    .addComponent(paketMalam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personal)
                .addGap(18, 18, 18)
                .addComponent(confirmTransaction)
                .addContainerGap(301, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void groupButton()
    {
        ButtonGroup group = new ButtonGroup();
        group.add(jam1);
        group.add(jam2);
        group.add(jam3);
        group.add(jam5);
        group.add(jam7);
        group.add(paketMalam);
        group.add(personal);
    }
    
    private void jam3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jam3ActionPerformed

    private void confirmTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmTransactionActionPerformed
        confirmTransaction();
        MainFrame.frame.add(MainFrame.adminMenu);
        MainFrame.frame.add(MainFrame.timeStatus);
        MainFrame.timeStatus.setTime(time);
        MainFrame.transaction.setVisible(false);
        MainFrame.adminMenu.setVisible(false);
        
    }//GEN-LAST:event_confirmTransactionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel clientName;
    protected javax.swing.JButton confirmTransaction;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    protected javax.swing.JRadioButton jam1;
    protected javax.swing.JRadioButton jam2;
    protected javax.swing.JRadioButton jam3;
    protected javax.swing.JRadioButton jam5;
    protected javax.swing.JRadioButton jam7;
    protected javax.swing.JRadioButton paketMalam;
    protected javax.swing.JRadioButton personal;
    // End of variables declaration//GEN-END:variables
}
