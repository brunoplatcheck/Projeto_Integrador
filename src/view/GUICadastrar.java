/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.CadastroVO;
import servicos.CadastrarServicos;
/**
 *
 * @author 181700028
 */
public class GUICadastrar extends javax.swing.JInternalFrame {

    /**
     * Creates new form GuiCad
     */
    public GUICadastrar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfSenha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfCPF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfEndereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfCEP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfTelefone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfDiscord = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfSteamFriend = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtfJogos1 = new javax.swing.JTextField();
        jtfJogos2 = new javax.swing.JTextField();
        jtfJogos3 = new javax.swing.JTextField();
        jtfJogos4 = new javax.swing.JTextField();
        jtfJogos5 = new javax.swing.JTextField();
        jbCadastrar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel6.setText("Nome");

        jLabel1.setText("Email");

        jLabel2.setText("Login");

        jLabel3.setText("Password");

        jLabel4.setText("CPF");

        jLabel5.setText("Endereco");

        jLabel7.setText("CEP");

        jLabel8.setText("Telefone");

        jLabel9.setText("Discord");

        jLabel10.setText("Steam Friend");

        jLabel11.setText("Jogos:");

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });
        jbCadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbCadastrarKeyPressed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jbLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbLimparKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfJogos1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfNome)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfLogin))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfSenha)
                            .addComponent(jtfCPF)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfEndereco)
                            .addComponent(jtfCEP)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfTelefone))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfDiscord))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfSteamFriend, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtfJogos2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtfJogos3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtfJogos4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtfJogos5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jtfDiscord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtfSteamFriend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtfJogos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfJogos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfJogos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfJogos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfJogos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void cadastrar(){
        
        try {
            CadastroVO cVO = new CadastroVO();

            cVO.setNome(jtfNome.getText());
            cVO.setEmail(jtfEmail.getText());
            cVO.setLogin(jtfLogin.getText());
            cVO.setPassword(jtfSenha.getText());
            cVO.setCpf(jtfCPF.getText());
            cVO.setEndereco(jtfEndereco.getText());
            cVO.setCep(jtfCEP.getText());
            cVO.setTelefone(jtfTelefone.getText());
            cVO.setDiscord(jtfDiscord.getText());
            cVO.setSteam(jtfSteamFriend.getText());
            cVO.setJogo1(jtfJogos1.getText());
            cVO.setJogo2(jtfJogos2.getText());
            cVO.setJogo3(jtfJogos3.getText());
            cVO.setJogo4(jtfJogos4.getText());
            cVO.setJogo5(jtfJogos5.getText());
            /*
            Temos que enviar o Objeto pVO para o banco.
            Assim a instrução SQL da DAO(ClienteDAO) foi copiada
            na ClienteServicos, que tem uma cópia dos métodos.
             */
            CadastrarServicos cs = servicos.ServicosFactory.getCadastrarServicos();

            //Chamando o método
            cs.cadastrarUsuario(cVO);

            //Retorno para o usuário
            JOptionPane.showMessageDialog(
                    null,
                    "Usuario cadastrado com sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    null,
                    "Error! Na GUICadastrar " +
                    e.getMessage());
        }
        
    }//fim do cadastrar
    
    private void limpar(){
        
        jtfNome.setText("");
        jtfEmail.setText("");
        jtfLogin.setText("");
        jtfSenha.setText("");
        jtfCPF.setText("");
        jtfEndereco.setText("");
        jtfCEP.setText("");
        jtfTelefone.setText("");
        jtfDiscord.setText("");
        jtfSteamFriend.setText("");
        jtfJogos1.setText("");
        jtfJogos2.setText("");
        jtfJogos3.setText("");
        jtfJogos4.setText("");
        jtfJogos5.setText("");
               
    }
    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        cadastrar();
        limpar();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbCadastrarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           cadastrar();
           limpar();
       }
    }//GEN-LAST:event_jbCadastrarKeyPressed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbLimparKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           limpar();
       }
    }//GEN-LAST:event_jbLimparKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JTextField jtfCEP;
    private javax.swing.JTextField jtfCPF;
    private javax.swing.JTextField jtfDiscord;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfJogos1;
    private javax.swing.JTextField jtfJogos2;
    private javax.swing.JTextField jtfJogos3;
    private javax.swing.JTextField jtfJogos4;
    private javax.swing.JTextField jtfJogos5;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfSenha;
    private javax.swing.JTextField jtfSteamFriend;
    private javax.swing.JTextField jtfTelefone;
    // End of variables declaration//GEN-END:variables
}
