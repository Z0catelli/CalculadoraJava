/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacecalculadora;

/**
 *
 * @author gabri
 */
public class InterCalc extends javax.swing.JFrame {

    /**
     * Creates new form InterCalc
     */
    public InterCalc() {
        initComponents();
    }

    Double valor1, valor2;
    String sinal;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Resultado = new javax.swing.JTextField();
        Botao7 = new javax.swing.JButton();
        Botao8 = new javax.swing.JButton();
        Botao9 = new javax.swing.JButton();
        Botao4 = new javax.swing.JButton();
        Botao5 = new javax.swing.JButton();
        Botao6 = new javax.swing.JButton();
        Botao1 = new javax.swing.JButton();
        Botao2 = new javax.swing.JButton();
        Botao3 = new javax.swing.JButton();
        BotaoC = new javax.swing.JButton();
        BotaoCE = new javax.swing.JButton();
        BotaoSubtracao = new javax.swing.JButton();
        BotaoMultiplicacao = new javax.swing.JButton();
        BotaoSoma = new javax.swing.JButton();
        Botao0 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        BotaoIgual = new javax.swing.JButton();
        BotaoDivisao = new javax.swing.JButton();
        BotaoRaiz = new javax.swing.JButton();
        BotaoPotencia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Resultado.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                ResultadoAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoActionPerformed(evt);
            }
        });

        Botao7.setText("7");
        Botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao7ActionPerformed(evt);
            }
        });

        Botao8.setText("8");
        Botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao8ActionPerformed(evt);
            }
        });

        Botao9.setText("9");
        Botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao9ActionPerformed(evt);
            }
        });

        Botao4.setText("4");
        Botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao4ActionPerformed(evt);
            }
        });

        Botao5.setText("5");
        Botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao5ActionPerformed(evt);
            }
        });

        Botao6.setText("6");
        Botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao6ActionPerformed(evt);
            }
        });

        Botao1.setText("1");
        Botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao1ActionPerformed(evt);
            }
        });

        Botao2.setText("2");
        Botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao2ActionPerformed(evt);
            }
        });

        Botao3.setText("3");
        Botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao3ActionPerformed(evt);
            }
        });

        BotaoC.setText("C");
        BotaoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCActionPerformed(evt);
            }
        });

        BotaoCE.setText("CE");
        BotaoCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCEActionPerformed(evt);
            }
        });

        BotaoSubtracao.setText("-");
        BotaoSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSubtracaoActionPerformed(evt);
            }
        });

        BotaoMultiplicacao.setText("*");
        BotaoMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMultiplicacaoActionPerformed(evt);
            }
        });

        BotaoSoma.setText("+");
        BotaoSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSomaActionPerformed(evt);
            }
        });

        Botao0.setText("0");
        Botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao0ActionPerformed(evt);
            }
        });

        jButton18.setText(".");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        BotaoIgual.setText("=");
        BotaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoIgualActionPerformed(evt);
            }
        });

        BotaoDivisao.setText("/");
        BotaoDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDivisaoActionPerformed(evt);
            }
        });

        BotaoRaiz.setText("√");
        BotaoRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRaizActionPerformed(evt);
            }
        });

        BotaoPotencia.setText("^");
        BotaoPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPotenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BotaoC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotaoCE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotaoRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoC, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCE, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultadoActionPerformed

    private void Botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao0ActionPerformed
        Resultado.setText(Resultado.getText()+"0");
    }//GEN-LAST:event_Botao0ActionPerformed

    private void ResultadoAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ResultadoAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultadoAncestorMoved

    private void Botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao1ActionPerformed
        Resultado.setText(Resultado.getText()+"1");
    }//GEN-LAST:event_Botao1ActionPerformed

    private void Botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao2ActionPerformed
        Resultado.setText(Resultado.getText()+"2");
    }//GEN-LAST:event_Botao2ActionPerformed

    private void Botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao3ActionPerformed
        Resultado.setText(Resultado.getText()+"3");
    }//GEN-LAST:event_Botao3ActionPerformed

    private void Botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao4ActionPerformed
        Resultado.setText(Resultado.getText()+"4");
    }//GEN-LAST:event_Botao4ActionPerformed

    private void Botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao5ActionPerformed
        Resultado.setText(Resultado.getText()+"5");
    }//GEN-LAST:event_Botao5ActionPerformed

    private void Botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao6ActionPerformed
        Resultado.setText(Resultado.getText()+"6");
    }//GEN-LAST:event_Botao6ActionPerformed

    private void Botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao7ActionPerformed
        Resultado.setText(Resultado.getText()+"7");
    }//GEN-LAST:event_Botao7ActionPerformed

    private void Botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao8ActionPerformed
        Resultado.setText(Resultado.getText()+"8");
    }//GEN-LAST:event_Botao8ActionPerformed

    private void Botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao9ActionPerformed
        Resultado.setText(Resultado.getText()+"9");
    }//GEN-LAST:event_Botao9ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        Resultado.setText(Resultado.getText()+".");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void BotaoCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCEActionPerformed
        Resultado.setText("");
    }//GEN-LAST:event_BotaoCEActionPerformed

    private void BotaoSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSomaActionPerformed
        valor1 = Double.parseDouble(Resultado.getText());
        Resultado.setText("");
        sinal = "soma";
    }//GEN-LAST:event_BotaoSomaActionPerformed

    private void BotaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoIgualActionPerformed
       valor2= Double.parseDouble(Resultado.getText());
       if (sinal == "soma"){
           Resultado.setText(String.valueOf(valor1+valor2));
       }
       else if (sinal == "subtracao"){
           Resultado.setText(String.valueOf(valor1-valor2));
       }
       else if (sinal == "multiplicacao"){
           Resultado.setText(String.valueOf(valor1*valor2));
       }
       else if (sinal == "divisao"){
           Resultado.setText(String.valueOf(valor1/valor2));
       }
       /*else if (sinal == "raiz"){ //a calculadoria ficou mais funcional colocando a função de raiz direto no botao de raiz em vez de apertar no igual para obter o resultado da operação
           Resultado.setText(String.valueOf(Math.sqrt(valor1)));
       }*/
       else if (sinal == "potencia"){
           Resultado.setText(String.valueOf(Math.pow(valor1, valor2)));
       }
    }//GEN-LAST:event_BotaoIgualActionPerformed

    private void BotaoSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSubtracaoActionPerformed
        valor1 = Double.parseDouble(Resultado.getText());
        Resultado.setText("");
        sinal = "subtracao";
    }//GEN-LAST:event_BotaoSubtracaoActionPerformed

    private void BotaoMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMultiplicacaoActionPerformed
        valor1 = Double.parseDouble(Resultado.getText());
        Resultado.setText("");
        sinal = "multiplicacao";
    }//GEN-LAST:event_BotaoMultiplicacaoActionPerformed

    private void BotaoDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDivisaoActionPerformed
        valor1 = Double.parseDouble(Resultado.getText());
        Resultado.setText("");
        sinal = "divisao";
    }//GEN-LAST:event_BotaoDivisaoActionPerformed

    private void BotaoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCActionPerformed
        valor1 = null;
        valor2 = null;
        Resultado.setText("");
    }//GEN-LAST:event_BotaoCActionPerformed

    private void BotaoRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRaizActionPerformed
        valor1 = Double.parseDouble(Resultado.getText());
        Resultado.setText("");
        Resultado.setText(String.valueOf(Math.sqrt(valor1)));
    }//GEN-LAST:event_BotaoRaizActionPerformed

    private void BotaoPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPotenciaActionPerformed
        valor1 = Double.parseDouble(Resultado.getText());
        Resultado.setText("");
        sinal = "potencia";
    }//GEN-LAST:event_BotaoPotenciaActionPerformed

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
            java.util.logging.Logger.getLogger(InterCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao0;
    private javax.swing.JButton Botao1;
    private javax.swing.JButton Botao2;
    private javax.swing.JButton Botao3;
    private javax.swing.JButton Botao4;
    private javax.swing.JButton Botao5;
    private javax.swing.JButton Botao6;
    private javax.swing.JButton Botao7;
    private javax.swing.JButton Botao8;
    private javax.swing.JButton Botao9;
    private javax.swing.JButton BotaoC;
    private javax.swing.JButton BotaoCE;
    private javax.swing.JButton BotaoDivisao;
    private javax.swing.JButton BotaoIgual;
    private javax.swing.JButton BotaoMultiplicacao;
    private javax.swing.JButton BotaoPotencia;
    private javax.swing.JButton BotaoRaiz;
    private javax.swing.JButton BotaoSoma;
    private javax.swing.JButton BotaoSubtracao;
    private javax.swing.JTextField Resultado;
    private javax.swing.JButton jButton18;
    // End of variables declaration//GEN-END:variables
}
