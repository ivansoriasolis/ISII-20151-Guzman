/*
@authores : Eli y Dina
 */
package presentacion.forms;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class JFrameMDI extends javax.swing.JFrame {
      JDesktopPane theDesktop = new JDesktopPane();
      String JPanelFondoBotones;
     
      String JPanelFondo;
      String JPanelFondo1;
      String JPanelFondo2;
      String JPanelFondo3;
      String JPanelFondo4;
      
      
      
//       JDesktopPane theDesktop = new JDesktopPaneWithGraphic("andahuaylas_iglesia.jpg");//new JDesktopPane();
    /**
     * Creates new form JFrameMDI
     */
    public JFrameMDI() {
        initComponents();
        
        
        //--------------------
        //============= FONDO AVION       
//        JPanelFondo1 fondo1 = new JPanelFondo1();
//        theDesktop.add(fondo1);
//        fondo1.show();
//        fondo1.setLocation(450, 10);
        //----------------------------

       //============= FONDO LOGO SAN JOSE

        JPanelFondo3 fondo3 = new JPanelFondo3();
        theDesktop.add(fondo3);
        fondo3.show();
        fondo3.setLocation(18, 25);
        //--------------------------------------
        //============= FONDO SITEMA DE PAJARO

        JPanelFondo4 fondo4 = new JPanelFondo4();
        theDesktop.add(fondo4);
        fondo4.show();
        fondo4.setLocation(50, 400);
//        //----------------------------
       //============= FONDO SITEMA DE BOTONES

        JPanelFondoBotones fondo5 = new JPanelFondoBotones();
        theDesktop.add(fondo5);
        fondo5.show();
        fondo5.setLocation(220, 390);
        
        //----------------------------
        //============= FONDO PRINCIPAL
//       JPanelFondo2 fondo2 = new JPanelFondo2();
//        theDesktop.add(fondo2);
//        fondo2.show();
//       fondo2.setLocation(15, 28);
        
  
     //------------------------
     
  
        
        
        getContentPane().add(theDesktop);
        theDesktop.setBackground(Color.RED);//color de la ventana Rrincipal
        
              
        this.setSize(new Dimension(1370, 720));//ancho / alto
        this.setContentPane(theDesktop);
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmnuConfiguraConexion = new javax.swing.JMenuItem();
        jmnuConfiguraImpresion = new javax.swing.JMenuItem();
        jmnuVistaPrevia = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmnuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmnuCliente = new javax.swing.JMenuItem();
        jmnuClienteComercial = new javax.swing.JMenuItem();
        jmnuServicio = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        jmnuPedido = new javax.swing.JMenuItem();
        jmnuPedidoDetalle = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenuUsuario = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jmnuCCliente = new javax.swing.JMenuItem();
        jmnuCPedido = new javax.swing.JMenuItem();
        jmnuCEstadistica = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuUsuario1 = new javax.swing.JMenuItem();
        jmnuRCliente = new javax.swing.JMenu();
        reporteTurista = new javax.swing.JMenuItem();
        jmnuRClienteComercial = new javax.swing.JMenuItem();
        jmnuRServicio = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jmnuRPedido = new javax.swing.JMenuItem();
        jmnuRPorDia = new javax.swing.JMenuItem();
        jmnuRPorFecha = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        ReporteUsuario = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmnuAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Grupo : EDITORIAL \"SAN JOSE\"");

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 51));

        jMenu1.setBackground(new java.awt.Color(0, 0, 0));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AgenciaVuelosImagenes/Iconos/archivo.png"))); // NOI18N
        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Hobo Std", 1, 16)); // NOI18N

        jmnuConfiguraConexion.setBackground(new java.awt.Color(0, 0, 51));
        jmnuConfiguraConexion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jmnuConfiguraConexion.setForeground(new java.awt.Color(255, 255, 255));
        jmnuConfiguraConexion.setText("CONFIGURAR CONEXION");
        jMenu1.add(jmnuConfiguraConexion);

        jmnuConfiguraImpresion.setBackground(new java.awt.Color(0, 0, 51));
        jmnuConfiguraImpresion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jmnuConfiguraImpresion.setForeground(new java.awt.Color(255, 255, 255));
        jmnuConfiguraImpresion.setText("CONFIGURAR IMPRESION");
        jMenu1.add(jmnuConfiguraImpresion);

        jmnuVistaPrevia.setBackground(new java.awt.Color(0, 0, 51));
        jmnuVistaPrevia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jmnuVistaPrevia.setForeground(new java.awt.Color(255, 255, 255));
        jmnuVistaPrevia.setText("VISTA PREVIA");
        jMenu1.add(jmnuVistaPrevia);
        jMenu1.add(jSeparator1);

        jmnuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jmnuSalir.setBackground(new java.awt.Color(0, 0, 51));
        jmnuSalir.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jmnuSalir.setForeground(javax.swing.UIManager.getDefaults().getColor("ToolBar.dockingForeground"));
        jmnuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AgenciaVuelosImagenes/Iconos/salir.png"))); // NOI18N
        jmnuSalir.setText("SALIR");
        jmnuSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jmnuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AgenciaVuelosImagenes/Iconos/mantenimiento.png"))); // NOI18N
        jMenu2.setText("Mantenimiento");
        jMenu2.setFont(new java.awt.Font("Hobo Std", 1, 16)); // NOI18N

        jmnuCliente.setBackground(new java.awt.Color(0, 0, 51));
        jmnuCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jmnuCliente.setForeground(new java.awt.Color(255, 255, 255));
        jmnuCliente.setText("MANTENIMIENTO CLIENTE");
        jmnuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jmnuCliente);

        jmnuClienteComercial.setBackground(new java.awt.Color(0, 0, 51));
        jmnuClienteComercial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jmnuClienteComercial.setForeground(new java.awt.Color(255, 255, 255));
        jmnuClienteComercial.setText("MANTENIMIENTO TIPO-CLIENTE");
        jmnuClienteComercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuClienteComercialActionPerformed(evt);
            }
        });
        jMenu2.add(jmnuClienteComercial);

        jmnuServicio.setBackground(new java.awt.Color(0, 0, 51));
        jmnuServicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jmnuServicio.setForeground(new java.awt.Color(255, 255, 255));
        jmnuServicio.setText("MANTENIMIENTO SERVICIO");
        jmnuServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuServicioActionPerformed(evt);
            }
        });
        jMenu2.add(jmnuServicio);
        jMenu2.add(jSeparator12);

        jmnuPedido.setBackground(new java.awt.Color(0, 0, 51));
        jmnuPedido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jmnuPedido.setForeground(new java.awt.Color(255, 255, 255));
        jmnuPedido.setText("MANTENIMIENTO PEDIDO");
        jmnuPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuPedidoActionPerformed(evt);
            }
        });
        jMenu2.add(jmnuPedido);

        jmnuPedidoDetalle.setBackground(new java.awt.Color(0, 0, 51));
        jmnuPedidoDetalle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jmnuPedidoDetalle.setForeground(new java.awt.Color(255, 255, 255));
        jmnuPedidoDetalle.setText("MANTENIMIENTO PEDIDO-DETALLE");
        jmnuPedidoDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuPedidoDetalleActionPerformed(evt);
            }
        });
        jMenu2.add(jmnuPedidoDetalle);
        jMenu2.add(jSeparator11);

        jMenuUsuario.setBackground(new java.awt.Color(0, 0, 51));
        jMenuUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuUsuario.setForeground(new java.awt.Color(255, 0, 0));
        jMenuUsuario.setText("MANTENIMIENTO USUARIO");
        jMenuUsuario.setToolTipText("");
        jMenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuUsuario);

        jMenuBar1.add(jMenu2);

        jMenu6.setForeground(new java.awt.Color(255, 255, 255));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AgenciaVuelosImagenes/Iconos/consultas.png"))); // NOI18N
        jMenu6.setText("Consultas");
        jMenu6.setFont(new java.awt.Font("Hobo Std", 1, 16)); // NOI18N

        jmnuCCliente.setBackground(new java.awt.Color(0, 0, 51));
        jmnuCCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jmnuCCliente.setForeground(new java.awt.Color(255, 255, 255));
        jmnuCCliente.setText("CONSULTA CLIENTES");
        jmnuCCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuCClienteActionPerformed(evt);
            }
        });
        jMenu6.add(jmnuCCliente);

        jmnuCPedido.setBackground(new java.awt.Color(0, 0, 51));
        jmnuCPedido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jmnuCPedido.setForeground(new java.awt.Color(255, 255, 255));
        jmnuCPedido.setText("CONSULTA PEDIDOS");
        jmnuCPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuCPedidoActionPerformed(evt);
            }
        });
        jMenu6.add(jmnuCPedido);

        jmnuCEstadistica.setBackground(new java.awt.Color(0, 0, 51));
        jmnuCEstadistica.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jmnuCEstadistica.setForeground(new java.awt.Color(255, 255, 255));
        jmnuCEstadistica.setText("CONSULTA ESTADISTICA");
        jmnuCEstadistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuCEstadisticaActionPerformed(evt);
            }
        });
        jMenu6.add(jmnuCEstadistica);
        jMenu6.add(jSeparator9);

        jMenuUsuario1.setBackground(new java.awt.Color(0, 0, 51));
        jMenuUsuario1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuUsuario1.setForeground(new java.awt.Color(255, 0, 0));
        jMenuUsuario1.setText("USUARIO");
        jMenu6.add(jMenuUsuario1);

        jMenuBar1.add(jMenu6);

        jmnuRCliente.setBackground(new java.awt.Color(0, 0, 51));
        jmnuRCliente.setForeground(new java.awt.Color(255, 255, 255));
        jmnuRCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AgenciaVuelosImagenes/Iconos/reportes.jpg"))); // NOI18N
        jmnuRCliente.setText("Reportes");
        jmnuRCliente.setFont(new java.awt.Font("Hobo Std", 1, 16)); // NOI18N

        reporteTurista.setBackground(new java.awt.Color(0, 0, 51));
        reporteTurista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reporteTurista.setForeground(new java.awt.Color(255, 255, 255));
        reporteTurista.setText("REPORTE CLIENTE");
        reporteTurista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteTuristaActionPerformed(evt);
            }
        });
        jmnuRCliente.add(reporteTurista);

        jmnuRClienteComercial.setBackground(new java.awt.Color(0, 0, 51));
        jmnuRClienteComercial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jmnuRClienteComercial.setForeground(new java.awt.Color(255, 255, 255));
        jmnuRClienteComercial.setText("REPORTE TIPO-CLIENTE");
        jmnuRClienteComercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuRClienteComercialActionPerformed(evt);
            }
        });
        jmnuRCliente.add(jmnuRClienteComercial);

        jmnuRServicio.setBackground(new java.awt.Color(0, 0, 51));
        jmnuRServicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jmnuRServicio.setForeground(new java.awt.Color(255, 255, 255));
        jmnuRServicio.setText("REPORTE SERVICO");
        jmnuRServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuRServicioActionPerformed(evt);
            }
        });
        jmnuRCliente.add(jmnuRServicio);
        jmnuRCliente.add(jSeparator10);

        jmnuRPedido.setBackground(new java.awt.Color(0, 0, 51));
        jmnuRPedido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jmnuRPedido.setForeground(new java.awt.Color(255, 255, 255));
        jmnuRPedido.setText("REPORTE PEDIDO");
        jmnuRPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuRPedidoActionPerformed(evt);
            }
        });
        jmnuRCliente.add(jmnuRPedido);

        jmnuRPorDia.setBackground(new java.awt.Color(0, 0, 51));
        jmnuRPorDia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jmnuRPorDia.setForeground(new java.awt.Color(255, 255, 255));
        jmnuRPorDia.setText("REPORTE POR DIA");
        jmnuRPorDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuRPorDiaActionPerformed(evt);
            }
        });
        jmnuRCliente.add(jmnuRPorDia);

        jmnuRPorFecha.setBackground(new java.awt.Color(0, 0, 51));
        jmnuRPorFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jmnuRPorFecha.setForeground(new java.awt.Color(255, 255, 255));
        jmnuRPorFecha.setText("REPORTE FECHA");
        jmnuRPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuRPorFechaActionPerformed(evt);
            }
        });
        jmnuRCliente.add(jmnuRPorFecha);
        jmnuRCliente.add(jSeparator2);

        ReporteUsuario.setBackground(new java.awt.Color(0, 0, 51));
        ReporteUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ReporteUsuario.setForeground(new java.awt.Color(255, 0, 0));
        ReporteUsuario.setText("USUARIO");
        ReporteUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteUsuarioActionPerformed(evt);
            }
        });
        jmnuRCliente.add(ReporteUsuario);

        jMenuBar1.add(jmnuRCliente);

        jMenu5.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AgenciaVuelosImagenes/ImagesIconos/consultas.JPG"))); // NOI18N
        jMenu5.setText("Ayuda");
        jMenu5.setFont(new java.awt.Font("Hobo Std", 1, 16)); // NOI18N

        jmnuAyuda.setBackground(new java.awt.Color(0, 0, 51));
        jmnuAyuda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jmnuAyuda.setForeground(new java.awt.Color(255, 255, 255));
        jmnuAyuda.setText("ACERCA DE");
        jMenu5.add(jmnuAyuda);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmnuCClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuCClienteActionPerformed
    }//GEN-LAST:event_jmnuCClienteActionPerformed

    private void jmnuCPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuCPedidoActionPerformed

    }//GEN-LAST:event_jmnuCPedidoActionPerformed

    private void jmnuCEstadisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuCEstadisticaActionPerformed
    }//GEN-LAST:event_jmnuCEstadisticaActionPerformed

    private void jmnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        JOptionPane.showMessageDialog( null," ADIOS !!!");
    }//GEN-LAST:event_jmnuSalirActionPerformed

    private void reporteTuristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteTuristaActionPerformed
        // TODO add your handling code here:
//        Reportes.VisorReportes v= new Reportes.VisorReportes();
//        v.showReportTURISTA();
    }//GEN-LAST:event_reporteTuristaActionPerformed

    private void jmnuRClienteComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuRClienteComercialActionPerformed
        // TODO add your handling code here:
//        Reportes.VisorReportes v= new Reportes.VisorReportes();
//        v.showReportHOTEL();
    }//GEN-LAST:event_jmnuRClienteComercialActionPerformed

    private void jmnuRServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuRServicioActionPerformed
        // TODO add your handling code here:
        
//          Reportes.VisorReportes v= new Reportes.VisorReportes();
//          v.showReportVUELO();
    }//GEN-LAST:event_jmnuRServicioActionPerformed

    private void jmnuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuClienteActionPerformed
                       
         
        JInternalFrameCliente  f= new JInternalFrameCliente();
        f.setTitle("Cliente: Mantenimiento de Datos");
        f.setVisible(true);
        theDesktop.add(f);
        
    }//GEN-LAST:event_jmnuClienteActionPerformed

    private void jmnuClienteComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuClienteComercialActionPerformed
        // TODO add your handling code here:
      JInternalFrameTipoCliente f= new JInternalFrameTipoCliente();
        f.setTitle("Tipo Cliente: Mantenimiento de Datos");
        f.setVisible(true);
        theDesktop.add(f);
    }//GEN-LAST:event_jmnuClienteComercialActionPerformed

    private void jmnuServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuServicioActionPerformed
        // TODO add your handling code here:
        
//       JInternalFrameTipocli  f= new JInternalFrameTipocli();
//        f.setTitle("Vuelos: Mantenimiento de Datos");
//        f.setVisible(true);
//        theDesktop.add(f);
    
    }//GEN-LAST:event_jmnuServicioActionPerformed

    private void jmnuPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuPedidoActionPerformed
        // TODO add your handling code here:
//          JInternalFrameSucursal  f= new JInternalFrameSucursal();
//        f.setTitle("Sucursal: Mantenimiento de Datos");
//        f.setVisible(true);
//        theDesktop.add(f);
    }//GEN-LAST:event_jmnuPedidoActionPerformed

    private void jmnuPedidoDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuPedidoDetalleActionPerformed
        // TODO add your handling code here:
//         JInternalFrameTuristaHotel  f= new JInternalFrameTuristaHotel();
//        f.setTitle("Turista: Mantenimiento de Datos");
//        f.setVisible(true);
//        theDesktop.add(f);
    }//GEN-LAST:event_jmnuPedidoDetalleActionPerformed

    private void jmnuRPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuRPedidoActionPerformed
        // TODO add your handling code here:
        
//         Reportes.VisorReportes v= new Reportes.VisorReportes();
//          v.showReportSUCURSAL();
    }//GEN-LAST:event_jmnuRPedidoActionPerformed

    private void jmnuRPorDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuRPorDiaActionPerformed
        // TODO add your handling code here:
//        Reportes.VisorReportes v= new Reportes.VisorReportes();
//          v.showReportTURISTAHOTEL();
    }//GEN-LAST:event_jmnuRPorDiaActionPerformed

    private void jmnuRPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuRPorFechaActionPerformed
        // TODO add your handling code here:
//        Reportes.VisorReportes v= new Reportes.VisorReportes();
//          v.showReportTURISTAVUELO();
    }//GEN-LAST:event_jmnuRPorFechaActionPerformed

    private void ReporteUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteUsuarioActionPerformed
        // TODO add your handling code here:
//          Reportes.VisorReportes v= new Reportes.VisorReportes();
//          v.showReportUSUARIO();
    }//GEN-LAST:event_ReporteUsuarioActionPerformed

    private void jMenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUsuarioActionPerformed
        // TODO add your handling code here:
        JInternalFrameUsuario f= new JInternalFrameUsuario();
        f.setTitle("Usuario: Mantenimiento de Datos");
        f.setVisible(true);
        theDesktop.add(f);
    }//GEN-LAST:event_jMenuUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMDI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ReporteUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuUsuario;
    private javax.swing.JMenuItem jMenuUsuario1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenuItem jmnuAyuda;
    private javax.swing.JMenuItem jmnuCCliente;
    private javax.swing.JMenuItem jmnuCEstadistica;
    private javax.swing.JMenuItem jmnuCPedido;
    private javax.swing.JMenuItem jmnuCliente;
    private javax.swing.JMenuItem jmnuClienteComercial;
    private javax.swing.JMenuItem jmnuConfiguraConexion;
    private javax.swing.JMenuItem jmnuConfiguraImpresion;
    private javax.swing.JMenuItem jmnuPedido;
    private javax.swing.JMenuItem jmnuPedidoDetalle;
    private javax.swing.JMenu jmnuRCliente;
    private javax.swing.JMenuItem jmnuRClienteComercial;
    private javax.swing.JMenuItem jmnuRPedido;
    private javax.swing.JMenuItem jmnuRPorDia;
    private javax.swing.JMenuItem jmnuRPorFecha;
    private javax.swing.JMenuItem jmnuRServicio;
    private javax.swing.JMenuItem jmnuSalir;
    private javax.swing.JMenuItem jmnuServicio;
    private javax.swing.JMenuItem jmnuVistaPrevia;
    private javax.swing.JMenuItem reporteTurista;
    // End of variables declaration//GEN-END:variables
}