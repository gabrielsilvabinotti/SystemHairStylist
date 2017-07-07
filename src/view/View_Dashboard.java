/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Gabriel
 */
public class View_Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form View_Dashboard
     */
    public View_Dashboard() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tab_agendamento = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_cad = new javax.swing.JMenu();
        sub_menu_cad_cliente = new javax.swing.JMenuItem();
        sub_menu_cad_servico = new javax.swing.JMenuItem();
        sub_menu_agendar = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HairDesser System");
        setResizable(false);

        tab_agendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tab_agendamento);

        menu_cad.setText("Cadastrar");

        sub_menu_cad_cliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        sub_menu_cad_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario.png"))); // NOI18N
        sub_menu_cad_cliente.setText("Cliente");
        sub_menu_cad_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sub_menu_cad_clienteMousePressed(evt);
            }
        });
        menu_cad.add(sub_menu_cad_cliente);

        sub_menu_cad_servico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        sub_menu_cad_servico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Servico.png"))); // NOI18N
        sub_menu_cad_servico.setText("Serviço");
        menu_cad.add(sub_menu_cad_servico);

        jMenuBar1.add(menu_cad);

        sub_menu_agendar.setText("Agendamento");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Agenda.png"))); // NOI18N
        jMenuItem3.setText("Agendar Hora");
        sub_menu_agendar.add(jMenuItem3);

        jMenuBar1.add(sub_menu_agendar);

        jMenu3.setText("Sair");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sub_menu_cad_clienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sub_menu_cad_clienteMousePressed
        new View_Cad_Cliente(this,rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_sub_menu_cad_clienteMousePressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menu_cad;
    private javax.swing.JMenu sub_menu_agendar;
    private javax.swing.JMenuItem sub_menu_cad_cliente;
    private javax.swing.JMenuItem sub_menu_cad_servico;
    private javax.swing.JTable tab_agendamento;
    // End of variables declaration//GEN-END:variables
}
