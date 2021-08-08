package wolftri;

/**
 *
 * @author Julio César Villanueva Ontiveros
 */

import DownloadServer.DownloadServer;
import Notification.Notification;
import main.ManageFile;
import java.awt.Color;
import java.sql.Connection;

public class update extends javax.swing.JDialog {

    DownloadServer download=new DownloadServer();
    Notification notify=new Notification();
    ManageFile file=new ManageFile();
    Connection conexion=null;
    String ruta="web\\db\\";
    String version_actual="";
    String version_new="";
    
    public update(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        btn_search_version.setForeground(Color.black);
        btn_search_version.setText("Buscar actualizaciones");
        this.version_actual=file.read_json(file.read_file(ruta+"wolftri.json"),"version");
        text_version_actual.setText("Wolftri - "+version_actual);
        
        text_files.setVisible(false);
        progreso.setVisible(false);
        btn_download.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text_version_actual = new javax.swing.JLabel();
        btn_search_version = new javax.swing.JButton();
        text_files = new javax.swing.JLabel();
        progreso = new javax.swing.JProgressBar();
        btn_download = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        text_version_actual.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        text_version_actual.setText("Cargando...");

        btn_search_version.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btn_search_version.setText("Buscar actualizaciones");
        btn_search_version.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_versionActionPerformed(evt);
            }
        });

        text_files.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btn_download.setText("DESCARGAR");
        btn_download.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_downloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text_version_actual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                        .addComponent(btn_search_version))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text_files)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_download))
                    .addComponent(progreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_version_actual)
                    .addComponent(btn_search_version))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_files, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_download, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progreso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_search_versionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_versionActionPerformed
        double[] datos=download.download("https://dogiloki.github.io/wolftri/server.json",ruta+"server.json");
        this.version_new=file.read_json(file.read_file(ruta+"server.json"),"version");
        if(version_actual.equals(version_new)){
            btn_search_version.setText("No hay actualizaciones");
        }else{
            text_files.setVisible(true);
            progreso.setVisible(true);
            btn_download.setVisible(true);
        }
    }//GEN-LAST:event_btn_search_versionActionPerformed

    private void btn_downloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_downloadActionPerformed
        text_files.setVisible(true);
        progreso.setVisible(true);
        btn_download.setVisible(true);
        String[] files=file.read_json(file.read_file(ruta+"server.json"),"files").split("\\|");
        text_files.setText("0 / "+files.length);
        for(int a=0; a<files.length; a++){
            System.out.println("web/prueba/"+files[a]);
            if(!file.exists("web/prueba/"+files[a])){
                if(file.is_file("web/prueba/"+files[a])){
                    file.write_file("web/prueba/"+files[a],"");
                }else{
                    file.create_folder("web/prueba/"+files[a]);
                }
            }
            download.download("https://dogiloki.github.io/wolftri/"+files[a],"web/prueba/"+files[a]);
            text_files.setText((a+1)+" / "+files.length);
        }
    }//GEN-LAST:event_btn_downloadActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                update dialog = new update(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_download;
    private javax.swing.JButton btn_search_version;
    private javax.swing.JProgressBar progreso;
    private javax.swing.JLabel text_files;
    private javax.swing.JLabel text_version_actual;
    // End of variables declaration//GEN-END:variables
}
