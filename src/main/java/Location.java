/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shubham
 */
import javax.swing.JTable;
import java.sql.*;
import Project.ConnectionProvider;   //pakage name
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Location extends javax.swing.JFrame {

    /**
     * Creates new form Location
     */
    public Location() {
        initComponents();
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setText("SEARCH BLOOD DONOR (ADDRESS)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 10, 604, 39));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 756, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Icon ob = new ImageIcon("D:\\NetBeans-11.2\\BloodManagementSystem\\src\\main\\java\\Images\\Address - Copy.png");
        jLabel2.setIcon(ob); 
        jLabel2.setText("Address");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 83, 135, 38));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 83, 191, 31));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donor ID", "Donor Name", "Father Name", "Mother Name", "DOB", "Mobile Number", "Gender", "Email", "BloodGroup", "City", "Address"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 810, 292));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 471, 810, 10));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Icon obj = new ImageIcon("D:\\NetBeans-11.2\\HospitalManagementSystem\\src\\main\\java\\HMS ICON\\print.png");  //Created an icon object named close_icon for exit button//
        jButton1.setIcon(obj);//set thaat icon to exit button//

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 518, 90, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Icon close_icon = new ImageIcon("D:\\NetBeans-11.2\\HospitalManagementSystem\\src\\main\\java\\HMS ICON\\Close.png");  //Created an icon object named close_icon for exit button//
        jButton2.setIcon(close_icon);//set thaat icon to exit button//
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 90, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 90, 40));
         
        Icon ob1 = new ImageIcon("D:\\NetBeans-11.2\\BloodManagementSystem\\src\\main\\java\\Images\\Orange_background.jpg");
        jLabel3.setIcon(ob1); 
        //jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Orange_background.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        //new Home().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try 
        {
            jTable1.print(JTable.PrintMode.NORMAL);
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        String location=jTextField1.getText();
         try
        {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from donor where city='"+location+"' or address='"+location+"'");
            jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
            while(rs.next()){
            String ID=String.valueOf(rs.getInt("donorid"));
              String Name=rs.getString("name");
              String father=(rs.getString("fatherName"));
              String mother=String.valueOf(rs.getString("motherName"));
              String DOB=String.valueOf(rs.getString("DOB"));
              String M=String.valueOf(rs.getString("MobileNO"));
              String G=String.valueOf(rs.getString("gender"));
              String E=String.valueOf(rs.getString("email"));
              String B=String.valueOf(rs.getString("bloodgroup"));
              String C=String.valueOf(rs.getString("city"));
              String A=String.valueOf(rs.getString("address"));
              String tbData[]={ID,Name,father,mother,DOB,M,G,E,B,C,A};
              DefaultTableModel tb1Model=(DefaultTableModel)jTable1.getModel();
              tb1Model.addRow(tbData);
        }
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try
        {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from donor ");
            jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
            while(rs.next()){
              String ID=String.valueOf(rs.getInt("donorid"));
              String Name=rs.getString("name");
              String father=(rs.getString("fatherName"));
              String mother=String.valueOf(rs.getString("motherName"));
              String DOB=String.valueOf(rs.getString("DOB"));
              String M=String.valueOf(rs.getString("MobileNO"));
              String G=String.valueOf(rs.getString("gender"));
              String E=String.valueOf(rs.getString("email"));
              String B=String.valueOf(rs.getString("bloodgroup"));
              String C=String.valueOf(rs.getString("city"));
              String A=String.valueOf(rs.getString("address"));
              jTable1.setModel(new DefaultTableModel(null,new String[] {"ID","Name","father","mother","DOB","M","G","E","B","C","A"}));
              
        }
        setVisible(false);
        new Location().setVisible(true);
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Location().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}