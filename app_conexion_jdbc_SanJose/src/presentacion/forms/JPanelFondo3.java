/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.forms;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @authores : Eli y Dina
 */
public class JPanelFondo3 extends javax.swing.JPanel {
   //FONDO SISTEMA logo
    /**
     * Creates new form JPanelFondo
     */
    public JPanelFondo3() {
        initComponents();
        
        initComponents();
        this.setSize(400,130);//ANCHO Y ALTO
    }
    @Override
    public void paintComponent(Graphics g){
    
    Dimension tam=getSize();
    ImageIcon ImagenFondo=new ImageIcon(new ImageIcon(getClass().getResource("/AgenciaVuelosImagenes/logoEntrada.png")).getImage());
    g.drawImage(ImagenFondo.getImage(), 0,0 , tam.width,tam.height,null);
    setOpaque(false);
    super.paintComponent(g);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}