package calculadora;

import com.sun.glass.events.KeyEvent;
import java.awt.*;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author HP Notebook
 */
public class index extends javax.swing.JFrame {

    String conta="";
    String op=""; //Saber el tipo personalizacion
    String cf1;
    String cf;
    String cb1;
    String cb;
    String cc1;
    String cc; 
    
public index() {
        initComponents();
        //Configuracion
        
        //Color de Fondo
       try{
       
        FileReader r=new FileReader("color_fondo");
        BufferedReader cf1=new BufferedReader(r);
         
        cf=cf1.readLine();
       
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Error al almacenar configuracion de Color de Fondo");
        System.exit(0);
    }
    if(cf.equals("blue")){
            this.getContentPane().setBackground(Color.blue);
            casi.setBackground(Color.blue);
            edi.setBackground(Color.blue);
    }
    if(cf.equals("white")){
            this.getContentPane().setBackground(Color.white);
            casi.setBackground(Color.white);
            edi.setBackground(Color.white);
    }
    if(cf.equals("black")){
            this.getContentPane().setBackground(Color.black);
            casi.setBackground(Color.black);
            edi.setBackground(Color.black);
    }
    if(cf.equals("yellow")){
            this.getContentPane().setBackground(Color.yellow);
            casi.setBackground(Color.yellow);
            edi.setBackground(Color.yellow);
    }
    if(cf.equals("orange")){
            this.getContentPane().setBackground(Color.orange);
            casi.setBackground(Color.orange);
            edi.setBackground(Color.orange);
    }
    if(cf.equals("green")){
            this.getContentPane().setBackground(Color.green);
            casi.setBackground(Color.green);
            edi.setBackground(Color.green);
    }
    if(cf.equals("red")){
            this.getContentPane().setBackground(Color.red);
            casi.setBackground(Color.red);
            edi.setBackground(Color.red);
    }
    if(cf.equals("pink")){
            this.getContentPane().setBackground(Color.pink);
            casi.setBackground(Color.pink);
            edi.setBackground(Color.pink);
    }
    if(cf.equals("gray")){
            this.getContentPane().setBackground(Color.gray);
            casi.setBackground(Color.gray);
            edi.setBackground(Color.gray);
    }
    
    //Color de Botones
    try{
       
        FileReader r=new FileReader("color_botones");
        BufferedReader cb1=new BufferedReader(r);
         
        cb=cb1.readLine();
       
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Error al almacenar configuracion de Color de Botones");
    }
    if(cb.equals("blue")){
        b0.setBackground(Color.blue);
        b1.setBackground(Color.blue);
        b2.setBackground(Color.blue);
        b3.setBackground(Color.blue);
        b4.setBackground(Color.blue);
        b5.setBackground(Color.blue);
        b6.setBackground(Color.blue);
        b7.setBackground(Color.blue);
        b8.setBackground(Color.blue);
        b9.setBackground(Color.blue);
        bp.setBackground(Color.blue);
        suma.setBackground(Color.blue);
        resta.setBackground(Color.blue);
        multi.setBackground(Color.blue);
        division.setBackground(Color.blue);
        rese.setBackground(Color.blue);
        inicio.setBackground(Color.blue);
    }
    if(cb.equals("white")){
        b0.setBackground(Color.white);
        b1.setBackground(Color.white);
        b2.setBackground(Color.white);
        b3.setBackground(Color.white);
        b4.setBackground(Color.white);
        b5.setBackground(Color.white);
        b6.setBackground(Color.white);
        b7.setBackground(Color.white);
        b8.setBackground(Color.white);
        b9.setBackground(Color.white);
        bp.setBackground(Color.white);
        suma.setBackground(Color.white);
        resta.setBackground(Color.white);
        multi.setBackground(Color.white);
        division.setBackground(Color.white);
        rese.setBackground(Color.white);
        inicio.setBackground(Color.white);
    }
    if(cb.equals("black")){
        b0.setBackground(Color.black);
        b1.setBackground(Color.black);
        b2.setBackground(Color.black);
        b3.setBackground(Color.black);
        b4.setBackground(Color.black);
        b5.setBackground(Color.black);
        b6.setBackground(Color.black);
        b7.setBackground(Color.black);
        b8.setBackground(Color.black);
        b9.setBackground(Color.black);
        bp.setBackground(Color.black);
        suma.setBackground(Color.black);
        resta.setBackground(Color.black);
        multi.setBackground(Color.black);
        division.setBackground(Color.black);
        rese.setBackground(Color.black);
        inicio.setBackground(Color.black);
    }
    if(cb.equals("yellow")){
        b0.setBackground(Color.yellow);
        b1.setBackground(Color.yellow);
        b2.setBackground(Color.yellow);
        b3.setBackground(Color.yellow);
        b4.setBackground(Color.yellow);
        b5.setBackground(Color.yellow);
        b6.setBackground(Color.yellow);
        b7.setBackground(Color.yellow);
        b8.setBackground(Color.yellow);
        b9.setBackground(Color.yellow);
        bp.setBackground(Color.yellow);
        suma.setBackground(Color.yellow);
        resta.setBackground(Color.yellow);
        multi.setBackground(Color.yellow);
        division.setBackground(Color.yellow);
        rese.setBackground(Color.yellow);
        inicio.setBackground(Color.yellow);
    }
    if(cb.equals("orange")){
        b0.setBackground(Color.orange);
        b1.setBackground(Color.orange);
        b2.setBackground(Color.orange);
        b3.setBackground(Color.orange);
        b4.setBackground(Color.orange);
        b5.setBackground(Color.orange);
        b6.setBackground(Color.orange);
        b7.setBackground(Color.orange);
        b8.setBackground(Color.orange);
        b9.setBackground(Color.orange);
        bp.setBackground(Color.orange);
        suma.setBackground(Color.orange);
        resta.setBackground(Color.orange);
        multi.setBackground(Color.orange);
        division.setBackground(Color.orange);
        rese.setBackground(Color.orange);
        inicio.setBackground(Color.orange);
    }
    if(cb.equals("green")){
        b0.setBackground(Color.green);
        b1.setBackground(Color.green);
        b2.setBackground(Color.green);
        b3.setBackground(Color.green);
        b4.setBackground(Color.green);
        b5.setBackground(Color.green);
        b6.setBackground(Color.green);
        b7.setBackground(Color.green);
        b8.setBackground(Color.green);
        b9.setBackground(Color.green);
        bp.setBackground(Color.green);
        suma.setBackground(Color.green);
        resta.setBackground(Color.green);
        multi.setBackground(Color.green);
        division.setBackground(Color.green);
        rese.setBackground(Color.green);
        inicio.setBackground(Color.green);
    }
    if(cb.equals("red")){
        b0.setBackground(Color.red);
        b1.setBackground(Color.red);
        b2.setBackground(Color.red);
        b3.setBackground(Color.red);
        b4.setBackground(Color.red);
        b5.setBackground(Color.red);
        b6.setBackground(Color.red);
        b7.setBackground(Color.red);
        b8.setBackground(Color.red);
        b9.setBackground(Color.red);
        bp.setBackground(Color.red);
        suma.setBackground(Color.red);
        resta.setBackground(Color.red);
        multi.setBackground(Color.red);
        division.setBackground(Color.red);
        rese.setBackground(Color.red);
        inicio.setBackground(Color.red);
    }
    if(cb.equals("pink")){
        b0.setBackground(Color.pink);
        b1.setBackground(Color.pink);
        b2.setBackground(Color.pink);
        b3.setBackground(Color.pink);
        b4.setBackground(Color.pink);
        b5.setBackground(Color.pink);
        b6.setBackground(Color.pink);
        b7.setBackground(Color.pink);
        b8.setBackground(Color.pink);
        b9.setBackground(Color.pink);
        bp.setBackground(Color.pink);
        suma.setBackground(Color.pink);
        resta.setBackground(Color.pink);
        multi.setBackground(Color.pink);
        division.setBackground(Color.pink);
        rese.setBackground(Color.pink);
        inicio.setBackground(Color.pink);
    }
    if(cb.equals("gray")){
        b0.setBackground(Color.gray);
        b1.setBackground(Color.gray);
        b2.setBackground(Color.gray);
        b3.setBackground(Color.gray);
        b4.setBackground(Color.gray);
        b5.setBackground(Color.gray);
        b6.setBackground(Color.gray);
        b7.setBackground(Color.gray);
        b8.setBackground(Color.gray);
        b9.setBackground(Color.gray);
        bp.setBackground(Color.gray);
        suma.setBackground(Color.gray);
        resta.setBackground(Color.gray);
        multi.setBackground(Color.gray);
        division.setBackground(Color.gray);
        rese.setBackground(Color.gray);
        inicio.setBackground(Color.gray);
    }
    
    //Color de Numeros y Letras
    try{
       
        FileReader r=new FileReader("color_c");
        BufferedReader cc1=new BufferedReader(r);
         
        cc=cc1.readLine();
       
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Error al almacenar configuracion de Color de Botones");
    }
    if(cc.equals("blue")){
        b0.setForeground(Color.blue);
        b1.setForeground(Color.blue);
        b2.setForeground(Color.blue);
        b3.setForeground(Color.blue);
        b4.setForeground(Color.blue);
        b5.setForeground(Color.blue);
        b6.setForeground(Color.blue);
        b7.setForeground(Color.blue);
        b8.setForeground(Color.blue);
        b9.setForeground(Color.blue);
        bp.setForeground(Color.blue);
        suma.setForeground(Color.blue);
        resta.setForeground(Color.blue);            
        multi.setForeground(Color.blue);
        division.setForeground(Color.blue);
        rese.setForeground(Color.blue);
        inicio.setForeground(Color.blue);
        calculadora.setForeground(Color.blue);
        casi.setForeground(Color.blue);
    }
    if(cc.equals("black")){
        b0.setForeground(Color.black);
        b1.setForeground(Color.black);
        b2.setForeground(Color.black);
        b3.setForeground(Color.black);
        b4.setForeground(Color.black);
        b5.setForeground(Color.black);
        b6.setForeground(Color.black);
        b7.setForeground(Color.black);
        b8.setForeground(Color.black);
        b9.setForeground(Color.black);
        bp.setForeground(Color.black);
        suma.setForeground(Color.black);
        resta.setForeground(Color.black);            
        multi.setForeground(Color.black);
        division.setForeground(Color.black);
        rese.setForeground(Color.black);
        inicio.setForeground(Color.black);
        calculadora.setForeground(Color.black);
        casi.setForeground(Color.black);
    }
    if(cc.equals("white")){
        b0.setForeground(Color.white);
        b1.setForeground(Color.white);
        b2.setForeground(Color.white);
        b3.setForeground(Color.white);
        b4.setForeground(Color.white);
        b5.setForeground(Color.white);
        b6.setForeground(Color.white);
        b7.setForeground(Color.white);
        b8.setForeground(Color.white);
        b9.setForeground(Color.white);
        bp.setForeground(Color.white);
        suma.setForeground(Color.white);
        resta.setForeground(Color.white);            
        multi.setForeground(Color.white);
        division.setForeground(Color.white);
        rese.setForeground(Color.white);
        inicio.setForeground(Color.white);
        calculadora.setForeground(Color.white);
        casi.setForeground(Color.white);
    }
    if(cc.equals("yellow")){
        b0.setForeground(Color.yellow);
        b1.setForeground(Color.yellow);
        b2.setForeground(Color.yellow);
        b3.setForeground(Color.yellow);
        b4.setForeground(Color.yellow);
        b5.setForeground(Color.yellow);
        b6.setForeground(Color.yellow);
        b7.setForeground(Color.yellow);
        b8.setForeground(Color.yellow);
        b9.setForeground(Color.yellow);
        bp.setForeground(Color.yellow);
        suma.setForeground(Color.yellow);
        resta.setForeground(Color.yellow);            
        multi.setForeground(Color.yellow);
        division.setForeground(Color.yellow);
        rese.setForeground(Color.yellow);
        inicio.setForeground(Color.yellow);
        calculadora.setForeground(Color.yellow);
        casi.setForeground(Color.yellow);
    }
    if(cc.equals("orange")){
        b0.setForeground(Color.orange);
        b1.setForeground(Color.orange);
        b2.setForeground(Color.orange);
        b3.setForeground(Color.orange);
        b4.setForeground(Color.orange);
        b5.setForeground(Color.orange);
        b6.setForeground(Color.orange);
        b7.setForeground(Color.orange);
        b8.setForeground(Color.orange);
        b9.setForeground(Color.orange);
        bp.setForeground(Color.orange);
        suma.setForeground(Color.orange);
        resta.setForeground(Color.orange);            
        multi.setForeground(Color.orange);
        division.setForeground(Color.orange);
        rese.setForeground(Color.orange);
        inicio.setForeground(Color.orange);
        calculadora.setForeground(Color.orange);
        casi.setForeground(Color.orange);
    }
    if(cc.equals("green")){
        b0.setForeground(Color.green);
        b1.setForeground(Color.green);
        b2.setForeground(Color.green);
        b3.setForeground(Color.green);
        b4.setForeground(Color.green);
        b5.setForeground(Color.green);
        b6.setForeground(Color.green);
        b7.setForeground(Color.green);
        b8.setForeground(Color.green);
        b9.setForeground(Color.green);
        bp.setForeground(Color.green);
        suma.setForeground(Color.green);
        resta.setForeground(Color.green);            
        multi.setForeground(Color.green);
        division.setForeground(Color.green);
        rese.setForeground(Color.green);
        inicio.setForeground(Color.green);
        calculadora.setForeground(Color.green);
        casi.setForeground(Color.green);
    }
    if(cc.equals("red")){
        b0.setForeground(Color.red);
        b1.setForeground(Color.red);
        b2.setForeground(Color.red);
        b3.setForeground(Color.red);
        b4.setForeground(Color.red);
        b5.setForeground(Color.red);
        b6.setForeground(Color.red);
        b7.setForeground(Color.red);
        b8.setForeground(Color.red);
        b9.setForeground(Color.red);
        bp.setForeground(Color.red);
        suma.setForeground(Color.red);
        resta.setForeground(Color.red);            
        multi.setForeground(Color.red);
        division.setForeground(Color.red);
        rese.setForeground(Color.red);
        inicio.setForeground(Color.red);
        calculadora.setForeground(Color.red);
        casi.setForeground(Color.red);
    }
    if(cc.equals("pink")){
        b0.setForeground(Color.pink);
        b1.setForeground(Color.pink);
        b2.setForeground(Color.pink);
        b3.setForeground(Color.pink);
        b4.setForeground(Color.pink);
        b5.setForeground(Color.pink);
        b6.setForeground(Color.pink);
        b7.setForeground(Color.pink);
        b8.setForeground(Color.pink);
        b9.setForeground(Color.pink);
        bp.setForeground(Color.pink);
        suma.setForeground(Color.pink);
        resta.setForeground(Color.pink);            
        multi.setForeground(Color.pink);
        division.setForeground(Color.pink);
        rese.setForeground(Color.pink);
        inicio.setForeground(Color.pink);
        calculadora.setForeground(Color.pink);
        casi.setForeground(Color.pink);
    }
    if(cc.equals("gray")){
        b0.setForeground(Color.gray);
        b1.setForeground(Color.gray);
        b2.setForeground(Color.gray);
        b3.setForeground(Color.gray);
        b4.setForeground(Color.gray);
        b5.setForeground(Color.gray);
        b6.setForeground(Color.gray);
        b7.setForeground(Color.gray);
        b8.setForeground(Color.gray);
        b9.setForeground(Color.gray);
        bp.setForeground(Color.gray);
        suma.setForeground(Color.gray);
        resta.setForeground(Color.gray);            
        multi.setForeground(Color.gray);
        division.setForeground(Color.gray);
        rese.setForeground(Color.gray);
        inicio.setForeground(Color.gray);
        calculadora.setForeground(Color.gray);
        casi.setForeground(Color.gray);
    }
    
        /////////////////////////////////////////////////////////////////////
        
        //Configurason del Software
        
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(250,310);
        
        opcion.setVisible(false);
        //Personalizacion
        azul.setBackground(Color.blue);
        azul.setFont(new Font("Arial",3,14));
        azul.setVisible(false);

        blanco.setBackground(Color.white);
        blanco.setFont(new Font("Arial",3,14));
        blanco.setVisible(false);
        
        negro.setBackground(Color.black);
        negro.setFont(new Font("Arial",3,14));
        negro.setVisible(false);
        
        amarillo.setBackground(Color.yellow);
        amarillo.setFont(new Font("Arial",3,14));
        amarillo.setVisible(false);
        
        naranja.setBackground(Color.orange);
        naranja.setFont(new Font("Arial",3,14));
        naranja.setVisible(false);
        
        verde.setBackground(Color.green);
        verde.setFont(new Font("Arial",3,14));
        verde.setVisible(false);
        
        rojo.setBackground(Color.red);
        rojo.setFont(new Font("Arial",3,14));
        rojo.setVisible(false);
        
        rosa.setBackground(Color.pink);
        rosa.setFont(new Font("Arial",3,14));
        rosa.setVisible(false);
        
        gris.setBackground(Color.gray);
        gris.setFont(new Font("Arial",3,14));
        gris.setVisible(false);
        
        defa.setBackground(Color.white);
        defa.setFont(new Font("Arial",3,14));
        defa.setVisible(false);

}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calculadora = new javax.swing.JLabel();
        b0 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bp = new javax.swing.JButton();
        inicio = new javax.swing.JButton();
        resultado = new javax.swing.JTextField();
        suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        multi = new javax.swing.JButton();
        division = new javax.swing.JButton();
        rese = new javax.swing.JButton();
        opcion = new javax.swing.JComboBox<>();
        casi = new javax.swing.JCheckBox();
        azul = new javax.swing.JButton();
        blanco = new javax.swing.JButton();
        negro = new javax.swing.JButton();
        amarillo = new javax.swing.JButton();
        naranja = new javax.swing.JButton();
        verde = new javax.swing.JButton();
        rojo = new javax.swing.JButton();
        rosa = new javax.swing.JButton();
        defa = new javax.swing.JButton();
        gris = new javax.swing.JButton();
        edi = new javax.swing.JCheckBox();
        borrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        perso = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        calculadora.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        calculadora.setForeground(new java.awt.Color(0, 255, 102));
        calculadora.setText("Calculadora");

        b0.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        b0.setForeground(new java.awt.Color(0, 255, 102));
        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        b1.setForeground(new java.awt.Color(0, 255, 102));
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        b2.setForeground(new java.awt.Color(0, 255, 102));
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        b3.setForeground(new java.awt.Color(0, 255, 102));
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        b4.setForeground(new java.awt.Color(0, 255, 102));
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        b5.setForeground(new java.awt.Color(0, 255, 102));
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        b6.setForeground(new java.awt.Color(0, 255, 102));
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        b7.setForeground(new java.awt.Color(0, 255, 102));
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        b8.setForeground(new java.awt.Color(0, 255, 102));
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        b9.setForeground(new java.awt.Color(0, 255, 102));
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        bp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bp.setForeground(new java.awt.Color(0, 255, 102));
        bp.setText(".");
        bp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpActionPerformed(evt);
            }
        });

        inicio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        inicio.setForeground(new java.awt.Color(0, 255, 102));
        inicio.setText("=");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

        resultado.setEditable(false);
        resultado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        resultado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                resultadoKeyPressed(evt);
            }
        });

        suma.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        suma.setForeground(new java.awt.Color(0, 255, 102));
        suma.setText("+");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        resta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        resta.setForeground(new java.awt.Color(0, 255, 102));
        resta.setText("-");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });

        multi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        multi.setForeground(new java.awt.Color(0, 255, 102));
        multi.setText("x");
        multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiActionPerformed(evt);
            }
        });

        division.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        division.setForeground(new java.awt.Color(0, 255, 102));
        division.setText("/");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        rese.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rese.setForeground(new java.awt.Color(0, 255, 102));
        rese.setText("CE");
        rese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reseActionPerformed(evt);
            }
        });

        opcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        opcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opcion", "Color de Fondo", "Color de Botones", "Color de Numeros y Letras" }));
        opcion.setToolTipText("");
        opcion.setInheritsPopupMenu(true);
        opcion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                opcionItemStateChanged(evt);
            }
        });
        opcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionActionPerformed(evt);
            }
        });

        casi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        casi.setForeground(new java.awt.Color(0, 255, 102));
        casi.setText("Personalización");
        casi.setToolTipText("");
        casi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                casiStateChanged(evt);
            }
        });

        azul.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        azul.setForeground(new java.awt.Color(255, 255, 255));
        azul.setText("Azul");
        azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azulActionPerformed(evt);
            }
        });

        blanco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        blanco.setText("Blanco");
        blanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blancoActionPerformed(evt);
            }
        });

        negro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        negro.setForeground(new java.awt.Color(255, 255, 255));
        negro.setText("Negro");
        negro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negroActionPerformed(evt);
            }
        });

        amarillo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        amarillo.setText("Amarillo");
        amarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amarilloActionPerformed(evt);
            }
        });

        naranja.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        naranja.setText("Naranja");
        naranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naranjaActionPerformed(evt);
            }
        });

        verde.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        verde.setText("Verde");
        verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verdeActionPerformed(evt);
            }
        });

        rojo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rojo.setText("Rojo");
        rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rojoActionPerformed(evt);
            }
        });

        rosa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rosa.setText("Rosa");
        rosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rosaActionPerformed(evt);
            }
        });

        defa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        defa.setText("Default");
        defa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaActionPerformed(evt);
            }
        });

        gris.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        gris.setText("Gris");
        gris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grisActionPerformed(evt);
            }
        });

        edi.setBackground(new java.awt.Color(255, 255, 255));
        edi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        edi.setForeground(new java.awt.Color(0, 255, 102));
        edi.setToolTipText("");
        edi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ediStateChanged(evt);
            }
        });

        borrar.setBackground(new java.awt.Color(0, 0, 0));
        borrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        borrar.setForeground(new java.awt.Color(255, 255, 255));
        borrar.setText("C");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        jMenu1.setText("Opciones");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        perso.setText("Salir");
        perso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persoActionPerformed(evt);
            }
        });
        jMenu1.add(perso);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(edi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b0)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b3)
                                    .addComponent(inicio)))
                            .addComponent(casi)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(resultado, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(b7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b9)
                                    .addComponent(borrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(resta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(multi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(division, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rese, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(calculadora)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(defa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(azul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(amarillo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(blanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(naranja, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(rosa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(negro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(verde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(gris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(opcion, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculadora)
                    .addComponent(opcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rese)
                        .addComponent(borrar))
                    .addComponent(edi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b7)
                    .addComponent(b8)
                    .addComponent(b9)
                    .addComponent(division)
                    .addComponent(azul)
                    .addComponent(blanco)
                    .addComponent(negro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4)
                    .addComponent(b5)
                    .addComponent(b6)
                    .addComponent(multi)
                    .addComponent(amarillo)
                    .addComponent(verde)
                    .addComponent(naranja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b2)
                        .addComponent(b3)
                        .addComponent(resta)
                        .addComponent(rojo)
                        .addComponent(rosa)
                        .addComponent(gris)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(defa)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b0)
                        .addComponent(bp)
                        .addComponent(inicio)
                        .addComponent(suma)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(casi)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        String boton4=b4.getText();
        conta+=boton4;
        resultado.setText(conta);
    }//GEN-LAST:event_b4ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        String boton9=b9.getText();
        conta+=boton9;
        resultado.setText(conta);
    }//GEN-LAST:event_b9ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        String boton0=b0.getText();
        conta+=boton0;
        resultado.setText(conta);
    }//GEN-LAST:event_b0ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        String boton1=b1.getText();
        conta+=boton1;
        resultado.setText(conta);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        String boton2=b2.getText();
        conta+=boton2;
        resultado.setText(conta);
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        String boton3=b3.getText();
        conta+=boton3;
        resultado.setText(conta);
    }//GEN-LAST:event_b3ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        String boton5=b5.getText();
        conta+=boton5;
        resultado.setText(conta);
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        String boton6=b6.getText();
        conta+=boton6;
        resultado.setText(conta);
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        String boton7=b7.getText();
        conta+=boton7;
        resultado.setText(conta);
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
       String boton8=b8.getText();
       conta+=boton8;
       resultado.setText(conta);
    }//GEN-LAST:event_b8ActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        String su=suma.getText();
        conta+=su;
        resultado.setText(conta);
    }//GEN-LAST:event_sumaActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        resultado();
    }//GEN-LAST:event_inicioActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        String re=resta.getText();
        conta+=re;
        resultado.setText(conta);
    }//GEN-LAST:event_restaActionPerformed

    private void multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiActionPerformed
        String mul=multi.getText();
        conta+=mul;
        resultado.setText(conta);
    }//GEN-LAST:event_multiActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        String divi=division.getText();
        conta+=divi;
        resultado.setText(conta);
    }//GEN-LAST:event_divisionActionPerformed

    private void reseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reseActionPerformed
        conta="";
        resultado.setText("");
    }//GEN-LAST:event_reseActionPerformed

    private void bpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpActionPerformed
        String punto=bp.getText();
        conta+=punto;
        resultado.setText(conta);
    }//GEN-LAST:event_bpActionPerformed

    private void persoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_persoActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
     
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void opcionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_opcionItemStateChanged
        op=opcion.getSelectedItem().toString();
        if(op.equals("Elige una opcion")){
            azul.setVisible(false);
            blanco.setVisible(false);
            negro.setVisible(false);
            amarillo.setVisible(false);
            naranja.setVisible(false);
            verde.setVisible(false);
            rojo.setVisible(false);
            rosa.setVisible(false);
            defa.setVisible(false);
            gris.setVisible(false);
        }
        if(!op.equals("")){  
            azul.setVisible(true);
            blanco.setVisible(true);
            negro.setVisible(true);
            amarillo.setVisible(true);
            naranja.setVisible(true);
            verde.setVisible(true);
            rojo.setVisible(true);
            rosa.setVisible(true);
            defa.setVisible(true);
            gris.setVisible(true);
        }
    }//GEN-LAST:event_opcionItemStateChanged

    private void casiStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_casiStateChanged
       if(casi.isSelected()==true){
           this.setSize(580,310);
           opcion.setVisible(true);
       }
       if(!casi.isSelected()==true){
           this.setSize(250,310);
           opcion.setVisible(false);
       }
    }//GEN-LAST:event_casiStateChanged

    private void azulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azulActionPerformed
        if(op.equals("Color de Fondo")){  
            this.getContentPane().setBackground(Color.blue);
            casi.setBackground(Color.blue);
            edi.setBackground(Color.blue);
            //Almacen
            //Crear el archivo
            File f=new File("color_fondo");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("blue");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion");
            }
        }
        if(op.equals("Color de Botones")){
            b0.setBackground(Color.blue);
            b1.setBackground(Color.blue);
            b2.setBackground(Color.blue);
            b3.setBackground(Color.blue);
            b4.setBackground(Color.blue);
            b5.setBackground(Color.blue);
            b6.setBackground(Color.blue);
            b7.setBackground(Color.blue);
            b8.setBackground(Color.blue);
            b9.setBackground(Color.blue);
            bp.setBackground(Color.blue);
            suma.setBackground(Color.blue);
            resta.setBackground(Color.blue);
            multi.setBackground(Color.blue);
            division.setBackground(Color.blue);
            rese.setBackground(Color.blue);
            inicio.setBackground(Color.blue);
            //Almacen
            //Crear el archivo
            File f=new File("color_botones");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("blue");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion");
            }
        }
        if(op.equals("Color de Numeros y Letras")){
            b0.setForeground(Color.blue);
            b1.setForeground(Color.blue);
            b2.setForeground(Color.blue);
            b3.setForeground(Color.blue);
            b4.setForeground(Color.blue);
            b5.setForeground(Color.blue);
            b6.setForeground(Color.blue);
            b7.setForeground(Color.blue);
            b8.setForeground(Color.blue);
            b9.setForeground(Color.blue);
            bp.setForeground(Color.blue);
            suma.setForeground(Color.blue);
            resta.setForeground(Color.blue);
            multi.setForeground(Color.blue);
            division.setForeground(Color.blue);
            rese.setForeground(Color.blue);
            inicio.setForeground(Color.blue);
            calculadora.setForeground(Color.blue);
            casi.setForeground(Color.blue);
            //Almacen
            //Crear el archivo
            File f=new File("color_c");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("blue");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion Color de Numeros y Letras");
            }
        }
    }//GEN-LAST:event_azulActionPerformed

    private void blancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blancoActionPerformed
       if(op.equals("Color de Fondo")){  
            this.getContentPane().setBackground(Color.white);
            casi.setBackground(Color.white);
            edi.setBackground(Color.white);
            //Almacen
            //Crear el archivo
            File f=new File("color_fondo");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("white");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion");
            }
        }
        if(op.equals("Color de Botones")){
            b0.setBackground(Color.white);
            b1.setBackground(Color.white);
            b2.setBackground(Color.white);
            b3.setBackground(Color.white);
            b4.setBackground(Color.white);
            b5.setBackground(Color.white);
            b6.setBackground(Color.white);
            b7.setBackground(Color.white);
            b8.setBackground(Color.white);
            b9.setBackground(Color.white);
            bp.setBackground(Color.white);
            suma.setBackground(Color.white);
            resta.setBackground(Color.white);
            multi.setBackground(Color.white);
            division.setBackground(Color.white);
            rese.setBackground(Color.white);
            inicio.setBackground(Color.white);
            //Almacen
            //Crear el archivo
            File f=new File("color_botones");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("white");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion");
            }
        }
        if(op.equals("Color de Numeros y Letras")){
            b0.setForeground(Color.white);
            b1.setForeground(Color.white);
            b2.setForeground(Color.white);
            b3.setForeground(Color.white);
            b4.setForeground(Color.white);
            b5.setForeground(Color.white);
            b6.setForeground(Color.white);
            b7.setForeground(Color.white);
            b8.setForeground(Color.white);
            b9.setForeground(Color.white);
            bp.setForeground(Color.white);
            suma.setForeground(Color.white);
            resta.setForeground(Color.white);
            multi.setForeground(Color.white);
            division.setForeground(Color.white);
            rese.setForeground(Color.white);
            inicio.setForeground(Color.white);
            calculadora.setForeground(Color.white);
            casi.setForeground(Color.white);
        }
        //Almacen
            //Crear el archivo
            File f=new File("color_c");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("white");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion Color de Numeros y Letras");
            }
    }//GEN-LAST:event_blancoActionPerformed

    private void negroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negroActionPerformed
        if(op.equals("Color de Fondo")){  
            this.getContentPane().setBackground(Color.black);
            casi.setBackground(Color.black);
            edi.setBackground(Color.black);
            //Almacen
            //Crear el archivo
            File f=new File("color_fondo");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("black");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion");
            }
        }
        if(op.equals("Color de Botones")){
            b0.setBackground(Color.black);
            b1.setBackground(Color.black);
            b2.setBackground(Color.black);
            b3.setBackground(Color.black);
            b4.setBackground(Color.black);
            b5.setBackground(Color.black);
            b6.setBackground(Color.black);
            b7.setBackground(Color.black);
            b8.setBackground(Color.black);
            b9.setBackground(Color.black);
            bp.setBackground(Color.black);
            suma.setBackground(Color.black);
            resta.setBackground(Color.black);
            multi.setBackground(Color.black);
            division.setBackground(Color.black);
            rese.setBackground(Color.black);
            inicio.setBackground(Color.black);
            //Almacen
            //Crear el archivo
            File f=new File("color_botones");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("black");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion");
            }
        }
        if(op.equals("Color de Numeros y Letras")){
            b0.setForeground(Color.black);
            b1.setForeground(Color.black);
            b2.setForeground(Color.black);
            b3.setForeground(Color.black);
            b4.setForeground(Color.black);
            b5.setForeground(Color.black);
            b6.setForeground(Color.black);
            b7.setForeground(Color.black);
            b8.setForeground(Color.black);
            b9.setForeground(Color.black);
            bp.setForeground(Color.black);
            suma.setForeground(Color.black);
            resta.setForeground(Color.black);
            multi.setForeground(Color.black);
            division.setForeground(Color.black);
            rese.setForeground(Color.black);
            inicio.setForeground(Color.black);
            calculadora.setForeground(Color.black);
            casi.setForeground(Color.black);
        }
        //Almacen
            //Crear el archivo
            File f=new File("color_c");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("black");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion Color de Numeros y Letras");
            }
    }//GEN-LAST:event_negroActionPerformed

    private void amarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amarilloActionPerformed
        if(op.equals("Color de Fondo")){  
            this.getContentPane().setBackground(Color.yellow);
            casi.setBackground(Color.yellow);
            edi.setBackground(Color.yellow);
            //Almacen
            //Crear el archivo
            File f=new File("color_fondo");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("yellow");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion");
            }
        }
        if(op.equals("Color de Botones")){
            b0.setBackground(Color.yellow);
            b1.setBackground(Color.yellow);
            b2.setBackground(Color.yellow);
            b3.setBackground(Color.yellow);
            b4.setBackground(Color.yellow);
            b5.setBackground(Color.yellow);
            b6.setBackground(Color.yellow);
            b7.setBackground(Color.yellow);
            b8.setBackground(Color.yellow);
            b9.setBackground(Color.yellow);
            bp.setBackground(Color.yellow);
            suma.setBackground(Color.yellow);
            resta.setBackground(Color.yellow);
            multi.setBackground(Color.yellow);
            division.setBackground(Color.yellow);
            rese.setBackground(Color.yellow);
            inicio.setBackground(Color.yellow);
            //Almacen
            //Crear el archivo
            File f=new File("color_botones");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("yellow");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion");
            }
        }
        if(op.equals("Color de Numeros y Letras")){
            b0.setForeground(Color.yellow);
            b1.setForeground(Color.yellow);
            b2.setForeground(Color.yellow);
            b3.setForeground(Color.yellow);
            b4.setForeground(Color.yellow);
            b5.setForeground(Color.yellow);
            b6.setForeground(Color.yellow);
            b7.setForeground(Color.yellow);
            b8.setForeground(Color.yellow);
            b9.setForeground(Color.yellow);
            bp.setForeground(Color.yellow);
            suma.setForeground(Color.yellow);
            resta.setForeground(Color.yellow);
            multi.setForeground(Color.yellow);
            division.setForeground(Color.yellow);
            rese.setForeground(Color.yellow);
            inicio.setForeground(Color.yellow);
            calculadora.setForeground(Color.yellow);
            casi.setForeground(Color.yellow);
        }
        //Almacen
            //Crear el archivo
            File f=new File("color_c");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("yellow");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion Color de Numeros y Letras");
            }
    }//GEN-LAST:event_amarilloActionPerformed

    private void naranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naranjaActionPerformed
        if(op.equals("Color de Fondo")){  
            this.getContentPane().setBackground(Color.orange);
            casi.setBackground(Color.orange);
            edi.setBackground(Color.orange);
            //Almacen
            //Crear el archivo
            File f=new File("color_fondo");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("orange");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion");
            }
        }
        if(op.equals("Color de Botones")){
            b0.setBackground(Color.orange);
            b1.setBackground(Color.orange);
            b2.setBackground(Color.orange);
            b3.setBackground(Color.orange);
            b4.setBackground(Color.orange);
            b5.setBackground(Color.orange);
            b6.setBackground(Color.orange);
            b7.setBackground(Color.orange);
            b8.setBackground(Color.orange);
            b9.setBackground(Color.orange);
            bp.setBackground(Color.orange);
            suma.setBackground(Color.orange);
            resta.setBackground(Color.orange);
            multi.setBackground(Color.orange);
            division.setBackground(Color.orange);
            rese.setBackground(Color.orange);
            inicio.setBackground(Color.orange);
            //Almacen
            //Crear el archivo
            File f=new File("color_botones");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("orange");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion");
            }
        }
        if(op.equals("Color de Numeros y Letras")){
            b0.setForeground(Color.orange);
            b1.setForeground(Color.orange);
            b2.setForeground(Color.orange);
            b3.setForeground(Color.orange);
            b4.setForeground(Color.orange);
            b5.setForeground(Color.orange);
            b6.setForeground(Color.orange);
            b7.setForeground(Color.orange);
            b8.setForeground(Color.orange);
            b9.setForeground(Color.orange);
            bp.setForeground(Color.orange);
            suma.setForeground(Color.orange);
            resta.setForeground(Color.orange);
            multi.setForeground(Color.orange);
            division.setForeground(Color.orange);
            rese.setForeground(Color.orange);
            inicio.setForeground(Color.orange);
            calculadora.setForeground(Color.orange);
            casi.setForeground(Color.orange);
        }
        //Almacen
            //Crear el archivo
            File f=new File("color_c");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("orange");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion Color de Numeros y Letras");
            }
    }//GEN-LAST:event_naranjaActionPerformed

    private void verdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verdeActionPerformed
        if(op.equals("Color de Fondo")){  
            this.getContentPane().setBackground(Color.green);
            casi.setBackground(Color.green);
            edi.setBackground(Color.green);
            //Almacen
            //Crear el archivo
            File f=new File("color_fondo");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("green");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion");
            }
        }
        if(op.equals("Color de Botones")){
            b0.setBackground(Color.green);
            b1.setBackground(Color.green);
            b2.setBackground(Color.green);
            b3.setBackground(Color.green);
            b4.setBackground(Color.green);
            b5.setBackground(Color.green);
            b6.setBackground(Color.green);
            b7.setBackground(Color.green);
            b8.setBackground(Color.green);
            b9.setBackground(Color.green);
            bp.setBackground(Color.green);
            suma.setBackground(Color.green);
            resta.setBackground(Color.green);
            multi.setBackground(Color.green);
            division.setBackground(Color.green);
            rese.setBackground(Color.green);
            inicio.setBackground(Color.green);
            //Almacen
            //Crear el archivo
            File f=new File("color_botones");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("green");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion");
            }
        }
        if(op.equals("Color de Numeros y Letras")){
            b0.setForeground(Color.green);
            b1.setForeground(Color.green);
            b2.setForeground(Color.green);
            b3.setForeground(Color.green);
            b4.setForeground(Color.green);
            b5.setForeground(Color.green);
            b6.setForeground(Color.green);
            b7.setForeground(Color.green);
            b8.setForeground(Color.green);
            b9.setForeground(Color.green);
            bp.setForeground(Color.green);
            suma.setForeground(Color.green);
            resta.setForeground(Color.green);
            multi.setForeground(Color.green);
            division.setForeground(Color.green);
            rese.setForeground(Color.green);
            inicio.setForeground(Color.green);
            calculadora.setForeground(Color.green);
            casi.setForeground(Color.green);
        }
        //Almacen
            //Crear el archivo
            File f=new File("color_c");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("green");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion Color de Numeros y Letras");
            }
    }//GEN-LAST:event_verdeActionPerformed

    private void rojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rojoActionPerformed
        if(op.equals("Color de Fondo")){  
            this.getContentPane().setBackground(Color.red);
            casi.setBackground(Color.red);
            edi.setBackground(Color.red);
            //Almacen
            //Crear el archivo
            File f=new File("color_fondo");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("red");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion");
            }
        }
        if(op.equals("Color de Botones")){
            b0.setBackground(Color.red);
            b1.setBackground(Color.red);
            b2.setBackground(Color.red);
            b3.setBackground(Color.red);
            b4.setBackground(Color.red);
            b5.setBackground(Color.red);
            b6.setBackground(Color.red);
            b7.setBackground(Color.red);
            b8.setBackground(Color.red);
            b9.setBackground(Color.red);
            bp.setBackground(Color.red);
            suma.setBackground(Color.red);
            resta.setBackground(Color.red);
            multi.setBackground(Color.red);
            division.setBackground(Color.red);
            rese.setBackground(Color.red);
            inicio.setBackground(Color.red);
            //Almacen
            //Crear el archivo
            File f=new File("color_botones");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("red");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion");
            }
        }
        if(op.equals("Color de Numeros y Letras")){
            b0.setForeground(Color.red);
            b1.setForeground(Color.red);
            b2.setForeground(Color.red);
            b3.setForeground(Color.red);
            b4.setForeground(Color.red);
            b5.setForeground(Color.red);
            b6.setForeground(Color.red);
            b7.setForeground(Color.red);
            b8.setForeground(Color.red);
            b9.setForeground(Color.red);
            bp.setForeground(Color.red);
            suma.setForeground(Color.red);
            resta.setForeground(Color.red);
            multi.setForeground(Color.red);
            division.setForeground(Color.red);
            rese.setForeground(Color.red);
            inicio.setForeground(Color.red);
            calculadora.setForeground(Color.red);
            casi.setForeground(Color.red);
        }
        //Almacen
            //Crear el archivo
            File f=new File("color_c");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("red");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion Color de Numeros y Letras");
            }
    }//GEN-LAST:event_rojoActionPerformed

    private void rosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rosaActionPerformed
        if(op.equals("Color de Fondo")){  
            this.getContentPane().setBackground(Color.pink);
            casi.setBackground(Color.pink);
            edi.setBackground(Color.pink);
            //Almacen
            //Crear el archivo
            File f=new File("color_fondo");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("pink");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion");
            }
        }
        if(op.equals("Color de Botones")){
            b0.setBackground(Color.pink);
            b1.setBackground(Color.pink);
            b2.setBackground(Color.pink);
            b3.setBackground(Color.pink);
            b4.setBackground(Color.pink);
            b5.setBackground(Color.pink);
            b6.setBackground(Color.pink);
            b7.setBackground(Color.pink);
            b8.setBackground(Color.pink);
            b9.setBackground(Color.pink);
            bp.setBackground(Color.pink);
            suma.setBackground(Color.pink);
            resta.setBackground(Color.pink);
            multi.setBackground(Color.pink);
            division.setBackground(Color.pink);
            rese.setBackground(Color.pink);
            inicio.setBackground(Color.pink);
            //Almacen
            //Crear el archivo
            File f=new File("color_botones");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("pink");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion");
            }
        }
        if(op.equals("Color de Numeros y Letras")){
            b0.setForeground(Color.pink);
            b1.setForeground(Color.pink);
            b2.setForeground(Color.pink);
            b3.setForeground(Color.pink);
            b4.setForeground(Color.pink);
            b5.setForeground(Color.pink);
            b6.setForeground(Color.pink);
            b7.setForeground(Color.pink);
            b8.setForeground(Color.pink);
            b9.setForeground(Color.pink);
            bp.setForeground(Color.pink);
            suma.setForeground(Color.pink);
            resta.setForeground(Color.pink);
            multi.setForeground(Color.pink);
            division.setForeground(Color.pink);
            rese.setForeground(Color.pink);
            inicio.setForeground(Color.pink);
            calculadora.setForeground(Color.pink);
            casi.setForeground(Color.pink);
        }
        //Almacen
            //Crear el archivo
            File f=new File("color_c");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("pink");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion Color de Numeros y Letras");
            }
    }//GEN-LAST:event_rosaActionPerformed

    private void defaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaActionPerformed
        this.getContentPane().setBackground(Color.blue);
        casi.setBackground(Color.blue);
            edi.setBackground(Color.blue);
        b0.setBackground(Color.black);
        b1.setBackground(Color.black);
        b2.setBackground(Color.black);
        b3.setBackground(Color.black);
        b4.setBackground(Color.black);
        b5.setBackground(Color.black);
        b6.setBackground(Color.black);
        b7.setBackground(Color.black);
        b8.setBackground(Color.black);
        b9.setBackground(Color.black);
        bp.setBackground(Color.black);
        inicio.setBackground(Color.black);
        suma.setBackground(Color.black);
        resta.setBackground(Color.black);
        multi.setBackground(Color.black);
        division.setBackground(Color.black);
        rese.setBackground(Color.black);
        
        b0.setForeground(Color.green);
        b1.setForeground(Color.green);
        b2.setForeground(Color.green);
        b3.setForeground(Color.green);
        b4.setForeground(Color.green);
        b5.setForeground(Color.green);
        b6.setForeground(Color.green);
        b7.setForeground(Color.green);
        b8.setForeground(Color.green);
        b9.setForeground(Color.green);
        bp.setForeground(Color.green);
        inicio.setForeground(Color.green);
        suma.setForeground(Color.green);
        resta.setForeground(Color.green);
        multi.setForeground(Color.green);
        division.setForeground(Color.green);
        rese.setForeground(Color.green);
        
        calculadora.setForeground(Color.green);
        casi.setForeground(Color.green);
        //Almacen
            //Crear el archivo
            File f=new File("color_fondo");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("blue");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion Color de Numeros y Letras");
            }
            //Almacen
            //Crear el archivo
            File f1=new File("color_botones");
            //Escritura
            try {
                FileWriter w = new FileWriter(f1);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("black");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion Color de Numeros y Letras");
            }
            //Almacen
            //Crear el archivo
            File f2=new File("color_c");
            //Escritura
            try {
                FileWriter w = new FileWriter(f2);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("green");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion Color de Numeros y Letras");
            }
    }//GEN-LAST:event_defaActionPerformed

    private void grisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grisActionPerformed
        if(op.equals("Color de Fondo")){  
            this.getContentPane().setBackground(Color.gray);
            casi.setBackground(Color.gray);
            edi.setBackground(Color.gray);
            //Almacen
            //Crear el archivo
            File f=new File("color_fondo");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("gray");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion");
            }
        }
        if(op.equals("Color de Botones")){
            b0.setBackground(Color.gray);
            b1.setBackground(Color.gray);
            b2.setBackground(Color.gray);
            b3.setBackground(Color.gray);
            b4.setBackground(Color.gray);
            b5.setBackground(Color.gray);
            b6.setBackground(Color.gray);
            b7.setBackground(Color.gray);
            b8.setBackground(Color.gray);
            b9.setBackground(Color.gray);
            bp.setBackground(Color.gray);
            suma.setBackground(Color.gray);
            resta.setBackground(Color.gray);
            multi.setBackground(Color.gray);
            division.setBackground(Color.gray);
            rese.setBackground(Color.gray);
            inicio.setBackground(Color.gray);
            //Almacen
            //Crear el archivo
            File f=new File("color_botones");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("gray");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion");
            }
        }
        if(op.equals("Color de Numeros y Letras")){
            b0.setForeground(Color.gray);
            b1.setForeground(Color.gray);
            b2.setForeground(Color.gray);
            b3.setForeground(Color.gray);
            b4.setForeground(Color.gray);
            b5.setForeground(Color.gray);
            b6.setForeground(Color.gray);
            b7.setForeground(Color.gray);
            b8.setForeground(Color.gray);
            b9.setForeground(Color.gray);
            bp.setForeground(Color.gray);
            suma.setForeground(Color.gray);
            resta.setForeground(Color.gray);
            multi.setForeground(Color.gray);
            division.setForeground(Color.gray);
            rese.setForeground(Color.gray);
            inicio.setForeground(Color.gray);
            calculadora.setForeground(Color.gray);
            casi.setForeground(Color.gray);
        }
        //Almacen
            //Crear el archivo
            File f=new File("color_c");
            //Escritura
            try {
                FileWriter w = new FileWriter(f);
                BufferedWriter bw=new BufferedWriter(w);
                PrintWriter wr=new PrintWriter(bw);
        
                //Almacenar informacion en .txt
                wr.append("gray");
                wr.close();
                bw.close();
            }catch(IOException ex) {
                JOptionPane.showMessageDialog(null,"Error al alamcenar configuracion Color de Numeros y Letras");
            }
    }//GEN-LAST:event_grisActionPerformed

    private void ediStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ediStateChanged
        if(edi.isSelected()==true){
            resultado.setEditable(true);
        }
        if(edi.isSelected()==false){
            resultado.setEditable(false);
        }
    }//GEN-LAST:event_ediStateChanged

    private void opcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionActionPerformed
        
    }//GEN-LAST:event_opcionActionPerformed

    private void resultadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resultadoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            resultado();
        }
    }//GEN-LAST:event_resultadoKeyPressed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        resultado.setText(resultado.getText().substring(resultado.getText().length()-1,resultado.getText().length()));
    }//GEN-LAST:event_borrarActionPerformed

    public void resultado(){
        
        String operacion=resultado.getText();
        String[] num=new String[100];
        String[] ope=new  String[100];
        int conta_num=0;
        int conta_ope=0;
        int aux=0,ultimo=0;
        for(int a=0; a<operacion.length(); a++){
            if(operacion.substring(a,a+1).equals("+")){
                conta_ope++;
                ope[conta_ope]=a+","+(a+1);
            }
            if(operacion.substring(a,a+1).equals("-")){
                conta_ope++;
                ope[conta_ope]=a+","+(a+1);
            }
            if(operacion.substring(a,a+1).equals("x") || operacion.substring(a,a+1).equals("*")){
                conta_ope++;
                ope[conta_ope]=a+","+(a+1);
            }
            if(operacion.substring(a,a+1).equals("/")){
                conta_ope++;
                ope[conta_ope]=a+","+(a+1);
            }
        }
        for(int b=1; b<=conta_ope; b++){
            conta_num++;
            num[conta_num]=aux+","+ope[b].substring(0,1);
            aux=Integer.parseInt(ope[b].substring(2,3));
        }
        conta_num++;
        num[conta_num]=aux+","+operacion.length();
        
        float resul=0;
        for(int r=1; r<=conta_ope; r++){
            int a=Integer.parseInt(ope[r].substring(0,1));
            int b=Integer.parseInt(ope[r].substring(2,3));
            int n1=Integer.parseInt(num[r].substring(0,1));
            int n2=Integer.parseInt(num[r].substring(2,3));
            int n11=Integer.parseInt(num[r+1].substring(0,1));
            int n22=Integer.parseInt(num[r+1].substring(2,3));
            float num1=Integer.parseInt(operacion.substring(n1,n2));
            float num2=Integer.parseInt(operacion.substring(n11,n22));
            if(r==1){
                if(operacion.substring(a,b).equals("+")){
                    resul=num1+num2;
                }
                if(operacion.substring(a,b).equals("-")){
                    resul=num1-num2;
                }
                if(operacion.substring(a,b).equals("x") || operacion.substring(a,b).equals("*")){
                    resul=num1*num2;
                }
                if(operacion.substring(a,b).equals("/")){
                    resul=num1/num2;
                }
            }else{
               if(operacion.substring(a,b).equals("+")){
                    resul+=num2;
                }
                if(operacion.substring(a,b).equals("-")){
                    resul-=num2;
                }
                if(operacion.substring(a,b).equals("x") || operacion.substring(a,b).equals("*")){
                    resul*=num2;
                }
                if(operacion.substring(a,b).equals("/")){
                    resul/=num2;
                } 
            }
        }
        resultado.setText(String.valueOf(resul));
        
        /*String resultado1=resultado.getText();
        conta=resultado1;
        int tama=conta.length();
        String num1, num2;
        String co;
        float num11, num22, t;
        int b=0;
        for(int a=0; a<=tama; a++){
            b++;
            co=conta.substring(a,b);
            if(co.equals("+")){
                num1=conta.substring(0,a);
                num2=conta.substring(b,tama);
                num11=Float.parseFloat(num1);
                num22=Float.parseFloat(num2);
                t=num11+num22;
                a+=tama++;
                resultado.setText(conta+"="+t);
            }
            if(co.equals("-")){
                num1=conta.substring(0,a);
                num2=conta.substring(b,tama);
                num11=Float.parseFloat(num1);
                num22=Float.parseFloat(num2);
                t=num11-num22;
                a+=tama++;
                resultado.setText(conta+"="+t);
            }
            if(co.equals("x") || co.equals("*")){
                num1=conta.substring(0,a);
                num2=conta.substring(b,tama);
                num11=Float.parseFloat(num1);
                num22=Float.parseFloat(num2);
                t=num11*num22;
                a+=tama++;
                resultado.setText(conta+"="+t);
            }
            if(co.equals("/")){
                num1=conta.substring(0,a);
                num2=conta.substring(b,tama);
                num11=Float.parseFloat(num1);
                num22=Float.parseFloat(num2);
                t=num11/num22;
                a+=tama++;
                resultado.setText(conta+"="+t);
            }
        }*/
    }
    
    public static void main(String args[]) throws IOException {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton amarillo;
    private javax.swing.JButton azul;
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton blanco;
    private javax.swing.JButton borrar;
    private javax.swing.JButton bp;
    private javax.swing.JLabel calculadora;
    private javax.swing.JCheckBox casi;
    private javax.swing.JButton defa;
    private javax.swing.JButton division;
    private javax.swing.JCheckBox edi;
    private javax.swing.JButton gris;
    private javax.swing.JButton inicio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton multi;
    private javax.swing.JButton naranja;
    private javax.swing.JButton negro;
    private javax.swing.JComboBox<String> opcion;
    private javax.swing.JMenuItem perso;
    private javax.swing.JButton rese;
    private javax.swing.JButton resta;
    private javax.swing.JTextField resultado;
    private javax.swing.JButton rojo;
    private javax.swing.JButton rosa;
    private javax.swing.JButton suma;
    private javax.swing.JButton verde;
    // End of variables declaration//GEN-END:variables

    private void Background(Color BLACK) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object getContent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
