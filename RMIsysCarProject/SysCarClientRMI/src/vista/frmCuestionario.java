/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author ANTONIO LIBORIO
 */
public class frmCuestionario extends javax.swing.JDialog {

    /**
     * Creates new form frmCuestionario
     */
    public frmCuestionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
          setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        preguntas = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPregunta = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        rdbOpcionA = new javax.swing.JRadioButton();
        rdbOpcionB = new javax.swing.JRadioButton();
        rdbOpcionC = new javax.swing.JRadioButton();
        rdbOpcionD = new javax.swing.JRadioButton();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Test");

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 16)); // NOI18N
        jLabel1.setText("Pregunta");

        txtPregunta.setEditable(false);
        txtPregunta.setColumns(20);
        txtPregunta.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        txtPregunta.setRows(5);
        jScrollPane1.setViewportView(txtPregunta);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione un opcion:"));

        preguntas.add(rdbOpcionA);
        rdbOpcionA.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        rdbOpcionA.setText("Opcion A");

        preguntas.add(rdbOpcionB);
        rdbOpcionB.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        rdbOpcionB.setText("Opcion B");

        preguntas.add(rdbOpcionC);
        rdbOpcionC.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        rdbOpcionC.setText("Opcion C");

        preguntas.add(rdbOpcionD);
        rdbOpcionD.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        rdbOpcionD.setText("Opcion D");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbOpcionA)
                    .addComponent(rdbOpcionB)
                    .addComponent(rdbOpcionC)
                    .addComponent(rdbOpcionD))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(rdbOpcionA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(rdbOpcionB)
                .addGap(23, 23, 23)
                .addComponent(rdbOpcionC)
                .addGap(28, 28, 28)
                .addComponent(rdbOpcionD)
                .addGap(34, 34, 34))
        );

        btnSiguienteCon.setFont(new java.awt.Font("Microsoft JhengHei", 1, 16)); // NOI18N
        btnSiguienteCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/siguiente.png"))); // NOI18N
        btnSiguienteCon.setText("Siguiente");

        lblImagen.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lblImagen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(435, Short.MAX_VALUE)
                .addComponent(btnSiguienteCon)
                .addGap(425, 425, 425))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSiguienteCon)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JButton btnSiguienteCon = new javax.swing.JButton();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblImagen;
    private javax.swing.ButtonGroup preguntas;
    public javax.swing.JRadioButton rdbOpcionA;
    public javax.swing.JRadioButton rdbOpcionB;
    public javax.swing.JRadioButton rdbOpcionC;
    public javax.swing.JRadioButton rdbOpcionD;
    public javax.swing.JTextArea txtPregunta;
    // End of variables declaration//GEN-END:variables
}
