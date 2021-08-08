package wolftri;

/**
 *
 * @author Julio César Villanueva Ontiveros
 */

import DownloadServer.*;
import java.sql.*;
import Notification.*;

public class main extends javax.swing.JFrame {

    DownloadServer download=new DownloadServer();
    Notification notify=new Notification();
    main.main file=new main.main();
    browser browser=new browser();
    Connection conexion=null;
    String ruta="";
    
    public main() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        getVersion();
        browser.loadURL("file:///"+file.get_dir()+"\\web\\index.html");
        resizableWeb();
        panel.add(browser);
    }
    
    public void getVersion(){
        this.ruta="web\\db\\wolftri.json";
        this.setTitle("WOLFTRI - "+file.read_json(file.read_file(ruta),"version"));
    }
    
    public void resizableWeb(){
        panel.setBounds(0,0,getDim("x"),getDim("y"));
        browser.setBounds(0,0,getDim("x"),getDim("y"));
        //JOptionPane.showMessageDialog(null,getDim("x")+" - "+getDim("y"));
    }
    
    public int getDim(String op){
        if(op.equals("x")){
            //int ancho=Toolkit.getDefaultToolkit().getScreenSize().width;
            int ancho=this.getContentPane().getWidth();
            return ancho;
        }
        if(op.equals("y")){
            //int alto=Toolkit.getDefaultToolkit().getScreenSize().height;
            int alto=this.getContentPane().getHeight();
            return alto;
        }
        return 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btn_actualizar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                panelComponentResized(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        jMenu1.setText("Opciones");

        btn_actualizar.setText("Actualizaciones");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jMenu1.add(btn_actualizar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelComponentResized
        resizableWeb();
    }//GEN-LAST:event_panelComponentResized

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        new update(this,true).setVisible(true);
    }//GEN-LAST:event_btn_actualizarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btn_actualizar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
