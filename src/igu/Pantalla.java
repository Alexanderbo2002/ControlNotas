package igu;

public class Pantalla extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
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

        jTextField1 = new javax.swing.JTextField();
        PanelDeDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        grado = new javax.swing.JTextField();
        PanelDeBotones = new javax.swing.JPanel();
        btpromedio = new javax.swing.JButton();
        btlimpiar = new javax.swing.JButton();
        btarchivo = new javax.swing.JButton();
        PanelDeNotas = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        mat1 = new javax.swing.JTextField();
        cien1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        mat2 = new javax.swing.JTextField();
        mat3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        mat4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cien4 = new javax.swing.JTextField();
        cien3 = new javax.swing.JTextField();
        cien2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ing1 = new javax.swing.JTextField();
        ing2 = new javax.swing.JTextField();
        ing3 = new javax.swing.JTextField();
        ing4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        com1 = new javax.swing.JTextField();
        com2 = new javax.swing.JTextField();
        com3 = new javax.swing.JTextField();
        com4 = new javax.swing.JTextField();
        edu1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        edu2 = new javax.swing.JTextField();
        edu3 = new javax.swing.JTextField();
        edu4 = new javax.swing.JTextField();
        ex1 = new javax.swing.JTextField();
        ex2 = new javax.swing.JTextField();
        ex3 = new javax.swing.JTextField();
        ex4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PanelDeRespuesta = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        notas = new javax.swing.JTextArea();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Control De Notas");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre del usuario:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Grado:");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDeDatosLayout = new javax.swing.GroupLayout(PanelDeDatos);
        PanelDeDatos.setLayout(PanelDeDatosLayout);
        PanelDeDatosLayout.setHorizontalGroup(
            PanelDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(grado, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                    .addComponent(nombre))
                .addGap(23, 23, 23))
            .addGroup(PanelDeDatosLayout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDeDatosLayout.setVerticalGroup(
            PanelDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeDatosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btpromedio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btpromedio.setText("Promedio");
        btpromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpromedioActionPerformed(evt);
            }
        });

        btlimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btlimpiar.setText("Limpiar");
        btlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimpiarActionPerformed(evt);
            }
        });

        btarchivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btarchivo.setText("Guardar en archivo");
        btarchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btarchivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDeBotonesLayout = new javax.swing.GroupLayout(PanelDeBotones);
        PanelDeBotones.setLayout(PanelDeBotonesLayout);
        PanelDeBotonesLayout.setHorizontalGroup(
            PanelDeBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btarchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btlimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btpromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        PanelDeBotonesLayout.setVerticalGroup(
            PanelDeBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDeBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btpromedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btarchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Bimestre 1");

        mat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mat1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Bimestre 2");

        mat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mat2ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Bimestre 3");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Bimestre 4");

        cien4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cien4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Matematicas:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Ciencias Naturales:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Ingles:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Comunicacion y lenguaje:");

        edu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edu1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Educacion Fisica:");

        edu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edu2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Expresion Artistica:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Materias");

        javax.swing.GroupLayout PanelDeNotasLayout = new javax.swing.GroupLayout(PanelDeNotas);
        PanelDeNotas.setLayout(PanelDeNotasLayout);
        PanelDeNotasLayout.setHorizontalGroup(
            PanelDeNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeNotasLayout.createSequentialGroup()
                .addGroup(PanelDeNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelDeNotasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelDeNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(PanelDeNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ex1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(com1)
                            .addComponent(ing1)
                            .addComponent(cien1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(mat1)
                            .addComponent(edu1)))
                    .addGroup(PanelDeNotasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(20, 20, 20)))
                .addGap(18, 18, 18)
                .addGroup(PanelDeNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDeNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PanelDeNotasLayout.createSequentialGroup()
                            .addGroup(PanelDeNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(mat2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PanelDeNotasLayout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel12)))
                            .addGap(18, 18, 18)
                            .addGroup(PanelDeNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(mat3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(PanelDeNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(cien4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mat4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(PanelDeNotasLayout.createSequentialGroup()
                            .addGroup(PanelDeNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDeNotasLayout.createSequentialGroup()
                                    .addComponent(cien2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cien3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDeNotasLayout.createSequentialGroup()
                                    .addComponent(ing2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ing3)))
                            .addGap(18, 18, 18)
                            .addComponent(ing4)))
                    .addGroup(PanelDeNotasLayout.createSequentialGroup()
                        .addGroup(PanelDeNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ex2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(edu2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(com2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(PanelDeNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(com3)
                            .addComponent(edu3)
                            .addComponent(ex3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelDeNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(com4)
                            .addComponent(edu4)
                            .addComponent(ex4, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        PanelDeNotasLayout.setVerticalGroup(
            PanelDeNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeNotasLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(PanelDeNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDeNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDeNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cien4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cien3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cien2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDeNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ing1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(ing2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ing3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ing4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDeNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(com1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(com2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(com3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(com4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDeNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(edu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDeNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ex1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ex2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ex3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ex4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(23, 23, 23))
        );

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Notas");

        notas.setColumns(20);
        notas.setRows(5);
        jScrollPane1.setViewportView(notas);

        javax.swing.GroupLayout PanelDeRespuestaLayout = new javax.swing.GroupLayout(PanelDeRespuesta);
        PanelDeRespuesta.setLayout(PanelDeRespuestaLayout);
        PanelDeRespuestaLayout.setHorizontalGroup(
            PanelDeRespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeRespuestaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeRespuestaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(105, 105, 105))
        );
        PanelDeRespuestaLayout.setVerticalGroup(
            PanelDeRespuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeRespuestaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PanelDeBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelDeDatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(PanelDeNotas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDeRespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelDeDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelDeNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelDeBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addComponent(PanelDeRespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btpromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpromedioActionPerformed
    // Convertir el texto a un numero entero
    int nota1 = Integer.parseInt(mat1.getText());
    int nota2 = Integer.parseInt(mat2.getText());
    int nota3 = Integer.parseInt(mat3.getText());
    int nota4 = Integer.parseInt(mat4.getText());
    
    int promediomat = (nota1 + nota2 + nota3 + nota4) / 4;
    System.out.println("Promedio de Matematicas: " + promediomat);
        
    // Convertir el texto a un número entero
    int nota5 = Integer.parseInt(cien1.getText());
    int nota6 = Integer.parseInt(cien2.getText());
    int nota7 = Integer.parseInt(cien3.getText());
    int nota8 = Integer.parseInt(cien4.getText());
    
    int promediocien = (nota5 + nota6 + nota7 + nota8) / 4;
    System.out.println("Promedio de Ciencias Naturales: " + promediocien);
    
    // Convertir el texto a un numero entero
    int nota9 = Integer.parseInt(ing1.getText());
    int nota10 = Integer.parseInt(ing2.getText());
    int nota11 = Integer.parseInt(ing3.getText());
    int nota12 = Integer.parseInt(ing4.getText());
    
    int promedioing = (nota9 + nota10 + nota11 + nota12) / 4;
    System.out.println("Promedio de ingles: " + promedioing);
    
    // Convertir el texto a un numero entero
    int nota13 = Integer.parseInt(com1.getText());
    int nota14 = Integer.parseInt(com2.getText());
    int nota15 = Integer.parseInt(com3.getText());
    int nota16 = Integer.parseInt(com4.getText());
    
    int promediocom = (nota13 + nota14 + nota15 + nota16) / 4;
    System.out.println("Promedio de Comunicacion y Lenguaje: " + promediocom);
    
    // Convertir el texto a un numero entero
    int nota17 = Integer.parseInt(edu1.getText());
    int nota18 = Integer.parseInt(edu2.getText());
    int nota19 = Integer.parseInt(edu3.getText());
    int nota20 = Integer.parseInt(edu4.getText());
    
    int promedioedu = (nota17 + nota18 + nota19 + nota20) / 4;
    System.out.println("Promedio de Educacion Fisica: " + promedioedu);
        
    // Convertir el texto a un numero entero
    int nota21 = Integer.parseInt(ex1.getText());
    int nota22 = Integer.parseInt(ex2.getText());
    int nota23 = Integer.parseInt(ex3.getText());
    int nota24 = Integer.parseInt(ex4.getText());
    
    int promedioex = (nota21 + nota22 + nota23 + nota24) / 4;
    System.out.println("Promedio de Educacion Fisica: " + promedioex);
    //___________________________________________________________________
    // Obtener el nombre y grado desde los JTextFields
    String nombreUs = nombre.getText();
    String gradoUs = grado.getText();
    
    // Asignar el promedio al Textarea notas 
    String textopromediomat = "Promedio de Matematicas: " + promediomat;
    String textopromediocien = "Promedio de Ciencias Naturales: " + promediocien;
    String textopromedioing = "Promedio de Ingles: " + promedioing;
    String textopromediocom = "Promedio de Comunicacion y Lenguaje: " + promediocom;
    String textopromedioedu = "Promedio de Educacion Fisica: " + promedioedu;
    String textopromedioex = "Promedio de Expresion Artistica: " + promedioex;
    
    // Determinar el estado (Aprobado o Reprobado)
    String estado = (promediomat >= 60 && promediocien >= 60 && promedioing >= 60 && promediocom >= 60 && promedioex >= 60 && promedioedu >= 60) ? "Aprobado" : "Reprobado";

    //Concatenar todos los textos con saltos de línea
    String textoCompleto = "Nombre: " + nombreUs+ "\n" + "Grado: " + gradoUs + "\n\n" + textopromediomat + "\n" + textopromediocien + "\n" + textopromedioing + "\n" + textopromediocom + "\n" + textopromedioex + "\n" + textopromedioedu + "\n\nEstado: " + estado;
    
    // Imprimir en la consola y establecer el texto en el JTextArea
    System.out.println(textoCompleto);
    notas.setText(textoCompleto);
    
    }//GEN-LAST:event_btpromedioActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void mat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mat2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mat2ActionPerformed

    private void cien4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cien4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cien4ActionPerformed

    private void edu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edu1ActionPerformed

    private void edu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edu2ActionPerformed

    private void mat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mat1ActionPerformed

    private void btlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimpiarActionPerformed
    nombre.setText("");  
    grado.setText("");
    mat1.setText("");
    mat2.setText("");
    mat3.setText("");
    mat4.setText("");
    cien1.setText("");
    cien2.setText("");
    cien3.setText("");
    cien4.setText("");
    ing1.setText("");
    ing2.setText("");
    ing3.setText("");
    ing4.setText("");
    com1.setText("");
    com2.setText("");
    com3.setText("");
    com4.setText("");
    edu1.setText("");
    edu2.setText("");
    edu3.setText("");
    edu4.setText("");
    ex1.setText("");
    ex2.setText("");
    ex3.setText("");
    ex4.setText("");
    notas.setText("");
    
    }//GEN-LAST:event_btlimpiarActionPerformed

    private void btarchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btarchivoActionPerformed
    // Crear una instancia de la clase Archivo y guardar los datos del JTextArea 'notas'
    persistencia.Archivo archivo = new persistencia.Archivo();
    archivo.guardarDatos(notas.getText());    
    }//GEN-LAST:event_btarchivoActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDeBotones;
    private javax.swing.JPanel PanelDeDatos;
    private javax.swing.JPanel PanelDeNotas;
    private javax.swing.JPanel PanelDeRespuesta;
    private javax.swing.JButton btarchivo;
    private javax.swing.JButton btlimpiar;
    private javax.swing.JButton btpromedio;
    private javax.swing.JTextField cien1;
    private javax.swing.JTextField cien2;
    private javax.swing.JTextField cien3;
    private javax.swing.JTextField cien4;
    private javax.swing.JTextField com1;
    private javax.swing.JTextField com2;
    private javax.swing.JTextField com3;
    private javax.swing.JTextField com4;
    private javax.swing.JTextField edu1;
    private javax.swing.JTextField edu2;
    private javax.swing.JTextField edu3;
    private javax.swing.JTextField edu4;
    private javax.swing.JTextField ex1;
    private javax.swing.JTextField ex2;
    private javax.swing.JTextField ex3;
    private javax.swing.JTextField ex4;
    private javax.swing.JTextField grado;
    private javax.swing.JTextField ing1;
    private javax.swing.JTextField ing2;
    private javax.swing.JTextField ing3;
    private javax.swing.JTextField ing4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField mat1;
    private javax.swing.JTextField mat2;
    private javax.swing.JTextField mat3;
    private javax.swing.JTextField mat4;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextArea notas;
    // End of variables declaration//GEN-END:variables
}
