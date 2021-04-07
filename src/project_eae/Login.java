package project_eae;

import java.awt.HeadlessException;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author ASAZING
 */
public class Login extends javax.swing.JFrame {

    public static Data capt = new Data();

    /**
     * Creates new form login
     */
    public Login() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/resources/logeo.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        contra = new javax.swing.JPasswordField();
        usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Usuario :");

        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Contraseña :");

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Noto Sans CJK SC Black", 3, 12)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("        CompuTecno");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/login.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1)
                                .addGap(40, 40, 40)
                                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12)
                                .addComponent(contra, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jButton1))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(288, 288, 288)
                                .addComponent(jButton2))
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel1))
                                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel3))
                                        .addComponent(contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(jButton2))
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
    }

    private void contraActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        setTitle("Inicio de sesion");
        try {
            if (validarContraseña(contra) && usuario.getText().equals("malcolm") || validarContraseña(contra) && usuario.getText().equals("ASAZING")) {

                Ventana.user.setText(usuario.getText());
                Ventana.jButton5.setEnabled(true);
                JOptionPane.showMessageDialog(null, "Bienvenido " + usuario.getText());
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, contra.getPassword());
                JOptionPane.showMessageDialog(null, "Error de Usuario"); // error al iniciar sesion 
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error : " + e);

        }
    }

    public Boolean validarContraseña(JPasswordField contraseña) {
        return Arrays.equals(contraseña.getPassword(), new char[]{'p', 'a', 's', 's', 'w', 'o', 'r', 'd'});

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPasswordField contra;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

}
