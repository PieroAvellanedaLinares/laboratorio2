package Calculadora;


public class Calculadora extends javax.swing.JFrame {

    operaciones calcular = new operaciones();
    float num1;
    float num2;
    public Calculadora() {
        initComponents();
    }
    public void datos(){
    num1 = Float.parseFloat(Numero1.getText());
    num2 = Float.parseFloat(Numero2.getText());
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        respuesta = new javax.swing.JLabel();
        Numero1 = new javax.swing.JTextField();
        Numero2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sumabtn = new javax.swing.JButton();
        multibtn = new javax.swing.JButton();
        divisionbtn = new javax.swing.JButton();
        restabtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Número 1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Número 2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Respuesta:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        respuesta.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        respuesta.setText("0");
        jPanel2.add(respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        Numero1.setBorder(null);
        Numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero1ActionPerformed(evt);
            }
        });
        jPanel2.add(Numero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 80, 20));

        Numero2.setBorder(null);
        jPanel2.add(Numero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 80, 20));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel6.setText("Calculadora");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 50));

        sumabtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        sumabtn.setText("+");
        sumabtn.setFocusPainted(false);
        sumabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumabtnActionPerformed(evt);
            }
        });
        jPanel2.add(sumabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        multibtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        multibtn.setText("X");
        multibtn.setFocusPainted(false);
        multibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multibtnActionPerformed(evt);
            }
        });
        jPanel2.add(multibtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        divisionbtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        divisionbtn.setText("/");
        divisionbtn.setFocusPainted(false);
        divisionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionbtnActionPerformed(evt);
            }
        });
        jPanel2.add(divisionbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        restabtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        restabtn.setText("-");
        restabtn.setFocusPainted(false);
        restabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restabtnActionPerformed(evt);
            }
        });
        jPanel2.add(restabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void divisionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionbtnActionPerformed
      datos();
        calcular.dividir(num1,num2);
        respuesta.setText(String.valueOf(calcular.resultado));
    }//GEN-LAST:event_divisionbtnActionPerformed

    private void Numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Numero1ActionPerformed

    private void sumabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumabtnActionPerformed
        datos();
        calcular.sumar(num1,num2);
        respuesta.setText(String.valueOf(calcular.resultado));
    }//GEN-LAST:event_sumabtnActionPerformed

    private void restabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restabtnActionPerformed
       datos();
        calcular.restar(num1,num2);
        respuesta.setText(String.valueOf(calcular.resultado));
    }//GEN-LAST:event_restabtnActionPerformed

    private void multibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multibtnActionPerformed
      datos();
        calcular.multiplicar(num1,num2);
        respuesta.setText(String.valueOf(calcular.resultado));
    }//GEN-LAST:event_multibtnActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Numero1;
    private javax.swing.JTextField Numero2;
    private javax.swing.JButton divisionbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton multibtn;
    private javax.swing.JLabel respuesta;
    private javax.swing.JButton restabtn;
    private javax.swing.JButton sumabtn;
    // End of variables declaration//GEN-END:variables
}
