package subneteo;

/**
 *
 * @author Julio Cesar Villanueva Ontiveros
 */

import javax.swing.table.*;

public class subredes extends javax.swing.JDialog {
    
    public subredes(java.awt.Frame parent, boolean modal, String clase, String cantidad) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        String ip="";
        String[] datos=new String[2];
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("SUBRED");
        modelo.addColumn("IP");
        int anterior=0;
        for(int a=0; a<Integer.parseInt(cantidad); a++){
            switch(clase){
                case "A": ip+="0.";
                    for(int b=1; b<=8; b++){
                        if(Math.round(Math.pow(2,b))==Integer.parseInt(cantidad)){
                            ip+=(0+b)+".";
                        }
                    }
                    if(a==0){
                        ip+="0.0";
                    }else{
                        ip+=anterior+(256/Integer.parseInt(cantidad))+".0";
                        anterior=anterior+(256/Integer.parseInt(cantidad));
                    }
                    datos[0]=String.valueOf(a+1);
                    datos[1]=ip;
                    ip="";
                    modelo.addRow(datos);break;
                case "B": ip+="128.";
                    for(int b=1; b<=8; b++){
                        if(Math.round(Math.pow(2,b))==Integer.parseInt(cantidad)){
                            ip+=128-b+".";
                        }
                    }
                    if(a==0){
                        ip+="0.0";
                    }else{
                        ip+=anterior+(256/Integer.parseInt(cantidad))+".0";
                        anterior=anterior+(256/Integer.parseInt(cantidad));
                    }
                    datos[0]=String.valueOf(a+1);
                    datos[1]=ip;
                    ip="";
                    modelo.addRow(datos);break;
                case "C": ip+="192.";
                    for(int b=1; b<=8; b++){
                        if(Math.round(Math.pow(2,b))==Integer.parseInt(cantidad)){
                            ip+=192-b+".";
                        }
                    }
                    if(a==0){
                        ip+="0.0";
                    }else{
                        ip+=anterior+(256/Integer.parseInt(cantidad))+".0";
                        anterior=anterior+(256/Integer.parseInt(cantidad));
                    }
                    datos[0]=String.valueOf(a+1);
                    datos[1]=ip;
                    ip="";
                    modelo.addRow(datos);break;
            }
        }
        tabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                subredes dialog = new subredes(new javax.swing.JFrame(), true, "", "");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
