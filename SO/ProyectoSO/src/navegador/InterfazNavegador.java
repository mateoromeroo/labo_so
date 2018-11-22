/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navegador;

import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import explorador.InterfazExplorador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import papelera.InterfazPapelera;

/**
 *
 * @author Rojeru San
 */
public class InterfazNavegador extends javax.swing.JFrame {

    private final static Color COLOR_ENTRADA = new Color(46, 132, 175);
    private final static Color COLOR_SALIDA = new Color(46, 54, 68);
    private static JPanel[] opcionesSideBar = new JPanel[2];
    JWebBrowser navegador = new JWebBrowser();

    public InterfazNavegador() {
        NativeInterface.open();
        initComponents();
        this.setTitle("Navegador");
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        navega1.setLayout(new BorderLayout());
        navegador.navigate("http://www.google.com");
        navegador.setBarsVisible(false);
        navegador.setButtonBarVisible(true);
        navegador.setLocationBarVisible(true);
        navega1.add(navegador);
        opcionesSideBar[0] = carpetas;
        opcionesSideBar[1] = papelera;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNavegador = new javax.swing.JPanel();
        navega1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        navegador1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        carpetas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        papelera = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelNavegador.setBackground(new java.awt.Color(255, 255, 255));

        navega1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout navega1Layout = new javax.swing.GroupLayout(navega1);
        navega1.setLayout(navega1Layout);
        navega1Layout.setHorizontalGroup(
            navega1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1169, Short.MAX_VALUE)
        );
        navega1Layout.setVerticalGroup(
            navega1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 68));

        navegador1.setBackground(new java.awt.Color(46, 132, 175));
        navegador1.setMinimumSize(new java.awt.Dimension(70, 70));
        navegador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navegador1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navegador1MouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cromo.png"))); // NOI18N

        javax.swing.GroupLayout navegador1Layout = new javax.swing.GroupLayout(navegador1);
        navegador1.setLayout(navegador1Layout);
        navegador1Layout.setHorizontalGroup(
            navegador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navegador1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );
        navegador1Layout.setVerticalGroup(
            navegador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        carpetas.setBackground(new java.awt.Color(46, 54, 68));
        carpetas.setMinimumSize(new java.awt.Dimension(65, 65));
        carpetas.setPreferredSize(new java.awt.Dimension(70, 70));
        carpetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                carpetasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carpetasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carpetasMousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(68, 73, 81));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carpeta.png"))); // NOI18N

        javax.swing.GroupLayout carpetasLayout = new javax.swing.GroupLayout(carpetas);
        carpetas.setLayout(carpetasLayout);
        carpetasLayout.setHorizontalGroup(
            carpetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carpetasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        carpetasLayout.setVerticalGroup(
            carpetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, carpetasLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        papelera.setBackground(new java.awt.Color(45, 52, 66));
        papelera.setMinimumSize(new java.awt.Dimension(70, 70));
        papelera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                papeleraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                papeleraMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                papeleraMousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/basura.png"))); // NOI18N

        javax.swing.GroupLayout papeleraLayout = new javax.swing.GroupLayout(papelera);
        papelera.setLayout(papeleraLayout);
        papeleraLayout.setHorizontalGroup(
            papeleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(papeleraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        papeleraLayout.setVerticalGroup(
            papeleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(carpetas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(navegador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(papelera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(438, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navegador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(papelera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(carpetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout panelNavegadorLayout = new javax.swing.GroupLayout(panelNavegador);
        panelNavegador.setLayout(panelNavegadorLayout);
        panelNavegadorLayout.setHorizontalGroup(
            panelNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navega1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1169, Short.MAX_VALUE)
        );
        panelNavegadorLayout.setVerticalGroup(
            panelNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNavegadorLayout.createSequentialGroup()
                .addComponent(navega1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNavegador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNavegador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void navegador1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navegador1MouseEntered
        
    }//GEN-LAST:event_navegador1MouseEntered

    private void navegador1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navegador1MouseExited
        
    }//GEN-LAST:event_navegador1MouseExited

    private void carpetasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carpetasMouseEntered
        setColor(0);
    }//GEN-LAST:event_carpetasMouseEntered

    private void carpetasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carpetasMouseExited
        exitColor(0);
    }//GEN-LAST:event_carpetasMouseExited

    private void papeleraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_papeleraMouseEntered
        setColor(1);
    }//GEN-LAST:event_papeleraMouseEntered

    private void papeleraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_papeleraMouseExited
        exitColor(1);
    }//GEN-LAST:event_papeleraMouseExited

    private void carpetasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carpetasMousePressed
        this.dispose();
        new InterfazExplorador();
    }//GEN-LAST:event_carpetasMousePressed

    private void papeleraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_papeleraMousePressed
        this.dispose();
        new InterfazPapelera();
    }//GEN-LAST:event_papeleraMousePressed
    
    public static void setColor(int opcion) {
        opcionesSideBar[opcion].setBackground(COLOR_ENTRADA);
    }

    public static void exitColor(int opcion) {
        opcionesSideBar[opcion].setBackground(COLOR_SALIDA);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel carpetas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel navega1;
    private javax.swing.JPanel navegador1;
    private javax.swing.JPanel panelNavegador;
    private javax.swing.JPanel papelera;
    // End of variables declaration//GEN-END:variables

}