/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport;
import static airport.flight1.dh1;
import java.awt.Toolkit;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author CX0140TX
 */
public class flight extends javax.swing.JFrame {

    private static TableModel getModel() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
                
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
   
    public flight() {
      //this.setUndecorated(true);
     // this.setAlwaysOnTop(true);
      this.setResizable(false);
      this.setVisible(true);
      initComponents();
      Toolkit tk=Toolkit.getDefaultToolkit();
              
              int xsize =(int) tk.getScreenSize().getWidth();
              int ysize =(int) tk.getScreenSize().getWidth();
              
              this.setSize(xsize,ysize);
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(540, 290, 230, 40);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(1220, 510, 220, 40);

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(1220, 620, 220, 40);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "192", "104", "198", "211", "409", "805" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(540, 550, 230, 40);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "IndiGo", "jetAirways", "AirIndia", "BritishAirways", "FlyDubai", "Spicejet" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(550, 420, 230, 40);

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Banglore", "Delhi", "USA", "Dubai", "Madras", "Thiland", "Canada", "England", "France", "Bombay" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(1220, 270, 220, 40);

        jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Banglore", "Delhi", "USA", "Dubai", "Madras", "Thiland", "Canada", "England", "France", "Bombay" }));
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(1220, 380, 220, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 810, 170, 50);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(480, 810, 170, 50);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1050, 810, 170, 50);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setText("Record Show");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1340, 810, 190, 50);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton7.setText("Update");
        jButton7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(770, 810, 170, 50);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Flight Number");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(300, 290, 200, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Flight Name");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(310, 420, 160, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Airport Id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 550, 130, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("From");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1030, 270, 70, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("To");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1040, 380, 40, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Departure Date");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(940, 510, 210, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Arrival Date");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(980, 620, 160, 40);

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 1, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Flight");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(850, 100, 120, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon("E:\\pics\\1920x1080-data-out-3-68486062-airport-wallpapers.jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1920, 1070);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     try{
        
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
             conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","root");
             String query="insert into flight values(?,?,?,?,?,?,?)";
             PreparedStatement pst=conn.prepareStatement(query);
             pst.setInt(1,Integer.parseInt(jTextField1.getText()));
             pst.setString(2,jComboBox2.getSelectedItem().toString());
              pst.setString(3,jComboBox1.getSelectedItem().toString());
               pst.setString(4,jComboBox3.getSelectedItem().toString());
                pst.setString(5,jComboBox4.getSelectedItem().toString());
                pst.setString(6,jTextField5.getText());
                 pst.setString(7,jTextField7.getText());
                 pst.execute();
                 JOptionPane.showMessageDialog(null,"saved succesfully");
                
             
     }  catch (SQLException ex) {
     }  catch (ClassNotFoundException ex) {
            Logger.getLogger(flight.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new home().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      String sql=" delete from flight where FlightNo=?;";
      try{
          Class.forName("java.sql.Driver");
            Connection conn;
             conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","root");
           pst=conn.prepareStatement(sql);
           pst.setString(1, jTextField1.getText());
           
           pst.execute();
           JOptionPane.showMessageDialog(null,"Deleted");
           
           
      } catch (SQLException ex) {
            Logger.getLogger(flight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(flight.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     try{
            Class.forName("java.sql.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","root");
            
            String sql="update flight set FlightName = ?, airpotid = ?, AFrom = ?, ATo = ?, Departuredate = ?, AirvalDate = ? where FlightNo = ?";
            
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,jComboBox2.getSelectedItem().toString());
            pstmt.setString(2,jComboBox1.getSelectedItem().toString());
            pstmt.setString(3,jComboBox3.getSelectedItem().toString());
            pstmt.setString(4,jComboBox4.getSelectedItem().toString());
             pstmt.setString(5,jTextField5.getText());
              pstmt.setString(6,jTextField7.getText());
               pstmt.setString(7,jTextField1.getText());
               
               
               pstmt.executeUpdate();
               JOptionPane.showMessageDialog(null,"Record updated successfully");
               conn.close();
            
            
     }  catch (ClassNotFoundException ex) {
            Logger.getLogger(flight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(flight.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                   flight1 s=new flight1();
                          DefaultTableModel model=(DefaultTableModel)dh1.getModel();
        try{
           
            Class.forName("java.sql.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","root");
            Statement st=conn.createStatement();
            String query="Select * from Flight";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()) {
                String d1=rs.getString("FlightNo");
                String d2=rs.getString("FlightName");
                String d3=rs.getString("airpotid");
                String d4=rs.getString("AFrom");
                String d5=rs.getString("ATo");
                String d6=rs.getString("Departuredate");
                String d7=rs.getString("AirvalDate");

                model.addRow(new Object[] {d1,d2,d3,d4,d5,d6,d7});

            }
            rs.close();
            st.close();
            conn.close();
            
            

        } catch (Exception ex) {
        }
                   s.setVisible(true);
                   dispose();
      
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new flight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

    
}