/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tigacahaya;

import java.awt.Color;
import java.awt.Cursor;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.io.InputStream;
import java.sql.*;
import javax.swing.JOptionPane;
import static tigacahaya.ChangeServer.db;
import static tigacahaya.ChangeServer.password;
import static tigacahaya.ChangeServer.server;
import static tigacahaya.ChangeServer.userName;

public class Login extends javax.swing.JFrame {

    Properties prop = new Properties();
    OutputStream output = null;
    InputStream input = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Login() {
        
     try{
             input = new FileInputStream("config.properties");
          
            prop.load(input);
            
            userName=prop.getProperty("username");
            password=prop.getProperty("password");
            server=prop.getProperty("server");
            db=prop.getProperty("db");
         }
         catch(IOException e){
             
         }   
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Field_name = new javax.swing.JTextField();
        Field_password = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        buttonLogin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        labelAbout = new javax.swing.JLabel();
        labelServer = new javax.swing.JLabel();
        CheckBoxRememberMe = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(18, 104, 178));
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(18, 104, 178));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password");

        Field_name.setBackground(new java.awt.Color(18, 104, 178));
        Field_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Field_name.setForeground(new java.awt.Color(255, 255, 255));
        Field_name.setBorder(null);
        Field_name.setCaretColor(new java.awt.Color(255, 255, 255));
        Field_name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Field_password.setBackground(new java.awt.Color(18, 104, 178));
        Field_password.setForeground(new java.awt.Color(255, 255, 255));
        Field_password.setBorder(null);

        buttonLogin.setBackground(new java.awt.Color(117, 179, 226));
        buttonLogin.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogin.setText("Log in");
        buttonLogin.setBorder(null);
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name");

        labelAbout.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        labelAbout.setForeground(new java.awt.Color(117, 179, 226));
        labelAbout.setText("<html><u>About</u></html>");
        labelAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAboutMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAboutMouseEntered(evt);
            }
        });

        labelServer.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        labelServer.setForeground(new java.awt.Color(117, 179, 226));
        labelServer.setText("<html><u>Change Server</u></html>");
        labelServer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelServerMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelServerMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelServerMouseEntered(evt);
            }
        });

        CheckBoxRememberMe.setText("Remember me");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckBoxRememberMe)
                    .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Field_name, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Field_password, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(Field_name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(Field_password, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckBoxRememberMe)
                .addGap(18, 18, 18)
                .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        buttonLogin.getAccessibleContext().setAccessibleName("button_login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        
       try {
           
        System.out.println(prop.getProperty("server"));
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("db"));
        System.out.println(prop.getProperty("password"));
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://" + server + ":3306/" + db + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", userName, password);
            String Sql="Select * from karyawan where id =? and password =?";
            
            
            pst=conn.prepareStatement(Sql);
            pst.setString(1, Field_name.getText());
            pst.setString(2, Field_password.getText());
            rs=pst.executeQuery();
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null, "Login Berhasil");
                
                Properties prop = new Properties();
                OutputStream output = null;
                
                if(CheckBoxRememberMe.isSelected()==true)
                {
                    try {
                
		output = new FileOutputStream("configUser.properties");
		// set the properties value
		prop.setProperty("name", Field_name.getText());
                prop.setProperty("password", Field_password.getText());

		// save properties to project root folder
		prop.store(output,null);

	} catch (IOException io) {
		io.printStackTrace();
	} finally {
		if (output != null) {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
                }
                }
                
                
                    else{

	try {
                
		output = new FileOutputStream("configUser.properties");
		// set the properties value
		prop.setProperty("name", Field_name.getText());
                prop.setProperty("password", "");
                
		// save properties to project root folder
		prop.store(output,null);

	} catch (IOException io) {
		io.printStackTrace();
	} finally {
		if (output != null) {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
                            }
                            
    }
        
        this.dispose();
        GUI.guiStart();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Username Atau Password Salah");
            }
            
            
            
        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Login Gagal");

            
        }
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void labelAboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAboutMouseEntered
       
        setCursor(Cursor.HAND_CURSOR);
        labelAbout.setForeground(Color.WHITE);
    }//GEN-LAST:event_labelAboutMouseEntered

    private void labelAboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAboutMouseExited
        Color lightblue = new Color(117,179,226);
        setCursor(Cursor.DEFAULT_CURSOR);
        labelAbout.setForeground(lightblue);
    }//GEN-LAST:event_labelAboutMouseExited

    private void labelServerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelServerMouseEntered
        setCursor(Cursor.HAND_CURSOR);
        labelServer.setForeground(Color.WHITE);
    }//GEN-LAST:event_labelServerMouseEntered

    private void labelServerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelServerMouseExited
        Color lightblue = new Color(117,179,226);
        setCursor(Cursor.DEFAULT_CURSOR);
        labelServer.setForeground(lightblue);
    }//GEN-LAST:event_labelServerMouseExited

    private void labelServerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelServerMouseClicked
        this.dispose();
        ChangeServer server = new ChangeServer();
        server.setLocationRelativeTo(null);
        server.setVisible(true);       
    }//GEN-LAST:event_labelServerMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Properties prop = new Properties();
	
        
        if(Field_name.getText().equals(null)){
            Field_name.setText("");
        }
	
        else{
        try {
            
        input = new FileInputStream("configUser.properties");    
        
        prop.load(input);

		// get the property value and print it out
		Field_name.setText(prop.getProperty("name"));
		

	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
        }
        if(Field_password.getText().equals(null))
        {
            Field_password.setText("");
        }
        else{
             try {
            
        input = new FileInputStream("configUser.properties");    
        
        prop.load(input);

		// get the property value and print it out
		Field_password.setText(prop.getProperty("password"));
		

	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
        }
        }
        
        
        
        }
        if(prop.getProperty("password").equals("")){
            CheckBoxRememberMe.setSelected(false);
        }
        else{
            CheckBoxRememberMe.setSelected(true);
        }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       
        
    }
    
    public static void guiStart() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                System.out.println(info.getName());
                if ("Nimbus".equals(info.getName())) {

                    //javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxRememberMe;
    private javax.swing.JTextField Field_name;
    private javax.swing.JPasswordField Field_password;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelAbout;
    private javax.swing.JLabel labelServer;
    // End of variables declaration//GEN-END:variables

    
}
