package subneteo;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;

/**
 *
 * @author Julio César Villanueva Ontiveros
 */

public class inicio extends javax.swing.JFrame {
    
    public inicio() {
        initComponents();
        Color color=new Color(204,255,204);
        this.getContentPane().setBackground(color);
        setBounds(0,0,640,400);
        setLocationRelativeTo(null);
        
        //Bóton cerrar
        ImageIcon imagen=new ImageIcon("img/cerrar.png");
        Icon icono=new ImageIcon(imagen.getImage().getScaledInstance(cerrar.getWidth(),cerrar.getHeight(), Image.SCALE_DEFAULT));
        cerrar.setIcon(icono);
        
        //Bóton minimizar
        ImageIcon imagen2=new ImageIcon("img/minimizar.png");
        Icon icono2=new ImageIcon(imagen2.getImage().getScaledInstance(minimizar.getWidth(),minimizar.getHeight(), Image.SCALE_DEFAULT));
        minimizar.setIcon(icono2);
        
        clase.addItem("A");
        clase.addItem("B");
        clase.addItem("C");
        for(int a=1; a<=8; a++){cantidad_subredes.addItem(String.valueOf(Math.round(Math.pow(2,a))));}
        
        Border bordejpanel = new TitledBorder(new EtchedBorder(), "SUBNETEO");
        subneteo.setBorder(bordejpanel); 
        
        Border bordejpanel1 = new TitledBorder(new EtchedBorder(), "TIPO DE RED");
        tipo_red.setBorder(bordejpanel1); 
    }
    
    int x,y;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cerrar = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        mover = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ip1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ip2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ip3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ip4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        d2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        d3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        d4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        d1 = new javax.swing.JTextField();
        m1 = new javax.swing.JTextField();
        m2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        m3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        m4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cantidad_subredes = new javax.swing.JComboBox<>();
        aceptar = new javax.swing.JButton();
        obtener_subredes = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        clase = new javax.swing.JComboBox<>();
        tipo_red = new javax.swing.JLabel();
        subneteo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(null);

        cerrar.setBackground(new java.awt.Color(255, 255, 255));
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cerrarMousePressed(evt);
            }
        });
        getContentPane().add(cerrar);
        cerrar.setBounds(612, 7, 20, 20);

        minimizar.setBackground(new java.awt.Color(255, 255, 255));
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minimizarMousePressed(evt);
            }
        });
        getContentPane().add(minimizar);
        minimizar.setBounds(586, 7, 20, 20);

        mover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moverMouseDragged(evt);
            }
        });
        mover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moverMousePressed(evt);
            }
        });
        getContentPane().add(mover);
        mover.setBounds(0, 0, 580, 27);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Cantidad de subredes:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 310, 150, 20);
        getContentPane().add(ip1);
        ip1.setBounds(100, 80, 28, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText(".");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 200, 7, 20);
        getContentPane().add(ip2);
        ip2.setBounds(140, 80, 28, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText(".");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 80, 7, 20);
        getContentPane().add(ip3);
        ip3.setBounds(180, 80, 28, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText(".");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 80, 7, 23);
        getContentPane().add(ip4);
        ip4.setBounds(220, 80, 28, 20);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 622, 39);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Mascara:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 170, 60, 20);

        d2.setEditable(false);
        getContentPane().add(d2);
        d2.setBounds(210, 200, 70, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText(".");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 80, 7, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setText(".");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(280, 200, 7, 20);

        d3.setEditable(false);
        getContentPane().add(d3);
        d3.setBounds(290, 200, 70, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setText(".");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(360, 200, 7, 20);

        d4.setEditable(false);
        getContentPane().add(d4);
        d4.setBounds(370, 200, 70, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Mascara Decimal:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 200, 120, 20);

        d1.setEditable(false);
        getContentPane().add(d1);
        d1.setBounds(130, 200, 70, 20);

        m1.setEditable(false);
        getContentPane().add(m1);
        m1.setBounds(70, 170, 28, 20);

        m2.setEditable(false);
        getContentPane().add(m2);
        m2.setBounds(110, 170, 28, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel11.setText(".");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(140, 170, 7, 20);

        m3.setEditable(false);
        getContentPane().add(m3);
        m3.setBounds(150, 170, 28, 20);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel12.setText(".");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(180, 170, 7, 23);

        m4.setEditable(false);
        getContentPane().add(m4);
        m4.setBounds(190, 170, 28, 20);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel13.setText(".");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(100, 170, 7, 20);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Dirección IP:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 80, 79, 17);

        cantidad_subredes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cantidad_subredes.setForeground(new java.awt.Color(52, 153, 255));
        getContentPane().add(cantidad_subredes);
        cantidad_subredes.setBounds(170, 310, 100, 20);

        aceptar.setBackground(new java.awt.Color(255, 255, 255));
        aceptar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        aceptar.setForeground(new java.awt.Color(52, 153, 255));
        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(aceptar);
        aceptar.setBounds(270, 75, 130, 25);

        obtener_subredes.setBackground(new java.awt.Color(255, 255, 255));
        obtener_subredes.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        obtener_subredes.setForeground(new java.awt.Color(52, 153, 255));
        obtener_subredes.setText("OBTENER SUBREDES");
        obtener_subredes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obtener_subredesActionPerformed(evt);
            }
        });
        getContentPane().add(obtener_subredes);
        obtener_subredes.setBounds(170, 350, 260, 30);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Tipo de red:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 280, 80, 20);

        clase.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        clase.setForeground(new java.awt.Color(52, 153, 255));
        clase.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                claseItemStateChanged(evt);
            }
        });
        getContentPane().add(clase);
        clase.setBounds(100, 280, 100, 20);
        getContentPane().add(tipo_red);
        tipo_red.setBounds(0, 50, 650, 190);
        getContentPane().add(subneteo);
        subneteo.setBounds(0, 250, 640, 150);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMouseDragged
        this.setLocation(this.getLocation().x+evt.getX()-x,this.getLocation().y+evt.getY()-y);
    }//GEN-LAST:event_moverMouseDragged

    private void moverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMousePressed
        //Obtiene cordenadas
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_moverMousePressed

    private void cerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMousePressed
        System.exit(0);
    }//GEN-LAST:event_cerrarMousePressed

    private void minimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMousePressed
        setExtendedState(1);
    }//GEN-LAST:event_minimizarMousePressed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        if(!ip1.getText().equals("") || !ip2.getText().equals("") || !ip3.getText().equals("") || !ip4.getText().equals("")){
            llenar_tabla();
        }else{
            JOptionPane.showMessageDialog(null,"Llene todos los campos","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void claseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_claseItemStateChanged
        cantidad_subredes.removeAllItems();
        switch(clase.getSelectedItem().toString()){
            case "A": for(int a=1; a<=8; a++){cantidad_subredes.addItem(String.valueOf(Math.round(Math.pow(2,a))));}break;
            case "B": for(int a=1; a<=8; a++){cantidad_subredes.addItem(String.valueOf(Math.round(Math.pow(2,a))));}break;
            case "C": for(int a=1; a<=8; a++){cantidad_subredes.addItem(String.valueOf(Math.round(Math.pow(2,a))));}break;
        }
    }//GEN-LAST:event_claseItemStateChanged

    private void obtener_subredesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obtener_subredesActionPerformed
        new subredes(this,true,clase.getSelectedItem().toString(),cantidad_subredes.getSelectedItem().toString()).setVisible(true);
    }//GEN-LAST:event_obtener_subredesActionPerformed

    int sele=0;
    
    public void llenar_tabla(){
        DefaultTableModel modelo=new DefaultTableModel();
        String clase="",desde="",hasta="",redes="",host="",aplicacion="";
        String[] datos=new String[6];
        int obtener_ip1=Integer.parseInt(ip1.getText());
        cantidad_subredes.removeAllItems();
        if(obtener_ip1>=0 && obtener_ip1<=127){
            clase="A";desde="0.0.0.0";hasta="127.255.255.255";redes="128";host="16,777,214";aplicacion="Redes Grandesa";
            d1.setText("11111111");d2.setText("00000000");d3.setText("00000000");d4.setText("00000000");
            m1.setText("255");m2.setText("0");m3.setText("0");m4.setText("0");
        }
        if(obtener_ip1>=128 && obtener_ip1<=191){
            clase="B";desde="128.0.0.0";hasta="191.255.255.255";redes="16,384";host="65,534";aplicacion="Redes Medianas";
            d1.setText("11111111");d2.setText("11111111");d3.setText("00000000");d4.setText("00000000");
            m1.setText("255");m2.setText("255");m3.setText("0");m4.setText("0");
        }
        if(obtener_ip1>=192 && obtener_ip1<=223){
            clase="C";desde="192.0.0.0";hasta="223.255.255.255";redes="2,097,157";host="254";aplicacion="Redes Pequeñas";
            d1.setText("11111111");d2.setText("11111111");d3.setText("11111111");d4.setText("00000000");
            m1.setText("255");m2.setText("255");m3.setText("255");m4.setText("0");
        }
        datos[0]=clase;
        datos[1]=desde;
        datos[2]=hasta;
        datos[3]=redes;
        datos[4]=host;
        datos[5]=aplicacion;
        modelo.addColumn("CLASE");
        modelo.addColumn("DESDE");
        modelo.addColumn("HASTA");
        modelo.addColumn("REDES");
        modelo.addColumn("HOST");
        modelo.addColumn("APLICACIÓN");
        modelo.addRow(datos);
        tabla.setModel(modelo);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JComboBox<String> cantidad_subredes;
    private javax.swing.JLabel cerrar;
    private javax.swing.JComboBox<String> clase;
    private javax.swing.JTextField d1;
    private javax.swing.JTextField d2;
    private javax.swing.JTextField d3;
    private javax.swing.JTextField d4;
    private javax.swing.JTextField ip1;
    private javax.swing.JTextField ip2;
    private javax.swing.JTextField ip3;
    private javax.swing.JTextField ip4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField m1;
    private javax.swing.JTextField m2;
    private javax.swing.JTextField m3;
    private javax.swing.JTextField m4;
    private javax.swing.JLabel minimizar;
    private javax.swing.JLabel mover;
    private javax.swing.JButton obtener_subredes;
    private javax.swing.JLabel subneteo;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel tipo_red;
    // End of variables declaration//GEN-END:variables
}
