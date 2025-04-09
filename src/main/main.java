
package main;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import java.util.*;
import javax.swing.JOptionPane;
import models.*;


/**
 *
 * @author Ronald  (Login usando programacion Generica :D)
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    private List<? super Login> users = new ArrayList<>(); //Usamos el wildcard para que acepte cualquier subclase de login(cliente,admin).(Se necesita casteo)
    //Superclases de clase login(Admiten escritura, las demas wildcard no lo hacen).
    public main() {
        initComponents();
        setSize(Toolkit.getDefaultToolkit().getScreenSize()); //Set full screen.
        LoginPanel l = new LoginPanel(this);
        RegisterPanel r = new RegisterPanel(this);
  
        slide.setAnimate(12);
        slide.init(l,r);
        l.addEventRegister(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Muestra el formulario de registro.
                slide.show(1);
                r.register();
            }
        });
        r.addEventBackLogin(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                slide.show(0);
                l.login();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradiente1 = new swing.PanelGradiente();
        panelBorder1 = new swing.PanelBorder();
        slide = new swing.PanelSlide();
        cmdExit = new swing.MyButton();
        myButton1 = new swing.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelGradiente1.setForeground(new java.awt.Color(255, 204, 102));
        panelGradiente1.setColorPrimario(new java.awt.Color(246, 191, 130));
        panelGradiente1.setColorSecundario(new java.awt.Color(186, 121, 14));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        slide.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout slideLayout = new javax.swing.GroupLayout(slide);
        slide.setLayout(slideLayout);
        slideLayout.setHorizontalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        slideLayout.setVerticalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        panelBorder1.setLayer(slide, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        cmdExit.setText("Exit");
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });

        myButton1.setText("Show All Users");
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        panelGradiente1.setLayer(panelBorder1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGradiente1.setLayer(cmdExit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGradiente1.setLayer(myButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelGradiente1Layout = new javax.swing.GroupLayout(panelGradiente1);
        panelGradiente1.setLayout(panelGradiente1Layout);
        panelGradiente1Layout.setHorizontalGroup(
            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradiente1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGradiente1Layout.createSequentialGroup()
                        .addGap(0, 94, Short.MAX_VALUE)
                        .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 94, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradiente1Layout.createSequentialGroup()
                        .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelGradiente1Layout.setVerticalGroup(
            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradiente1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cmdExitActionPerformed

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        String info = obtenerUsuariosRegistrados();
        JOptionPane.showMessageDialog(this, info);
    }//GEN-LAST:event_myButton1ActionPerformed
    public void userRegister(Login user)
    {
        users.add(user);
    }
    public Login userVerification(String user, String passWord)
    {
        for(Object ob : users){
            if (ob instanceof Login l) {
                if (l.getUser().equals(user) && l.getPass().equals(passWord)) {
                    return l;
                }
            }
        }
        return null;
    }
    public boolean userExist(String usuario) {
        for (Object obj : users) {
            if (obj instanceof Login l) {
                if (l.getUser().equalsIgnoreCase(usuario)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    
    public String obtenerUsuariosRegistrados() {
    if (users.isEmpty()) {
        return "No hay usuarios registrados.";
    }

    StringBuilder sb = new StringBuilder("Usuarios Registrados:\n\n");

    for (Object obj : users) {
        if (obj instanceof Cliente c) {
            sb.append("- ").append(c.getUser()).append(" (Cliente)\n");
        } else if (obj instanceof Admin a) {
            sb.append("- ").append(a.getUser()).append(" (Administrador)\n");
        }
    }
    return sb.toString();
}
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton cmdExit;
    private swing.MyButton myButton1;
    private swing.PanelBorder panelBorder1;
    private swing.PanelGradiente panelGradiente1;
    private swing.PanelSlide slide;
    // End of variables declaration//GEN-END:variables
}
