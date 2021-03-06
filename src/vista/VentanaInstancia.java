/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.mxgraph.model.mxCell;
import com.mxgraph.swing.mxGraphComponent;
import controlador.Grafo;
import controlador.GrafoInstancia;
import controlador.MouseEventInstancia;
import exception.NoEncontrado;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Esquema;
import modelo.Instancia;
import modelo.TipoCategoria;
import modelo.TipoDeDimension;

/**
 *
 * @author Camilo Sampedro
 */
public class VentanaInstancia extends javax.swing.JFrame {

    /**
     * Objeto con la información del grafo.
     */
    protected Grafo grafo;

    /**
     * Componente gráfico del grafo. Aquí se hacen las actualizaciones gráficas
     * y se puede obtener información gráfica del grafo y de los nodos.
     */
    private mxGraphComponent graphComponent;

    /**
     * Última celda (Vértice o lado) a la que se le hizo clic. Usado para
     * verificar qué celda eliminar, sabiendo que fue la última a la que se le
     * hizo clic. Si no hay ninguna celda seleccionada, este valor será nulo y
     * ninguna será eliminada.
     */
    private mxCell celda;

//    private final static Object[] opciones = {"Parcial", "Total"};
    private TipoDeDimension tipoDeDimension;

    private Instancia instancia;

    /**
     * Crea una nueva ventana de grafo vacío.
     */
    private VentanaInstancia() {
        grafo = new GrafoInstancia();
        instancia = new Instancia();
        initComponents();

        graphComponent.getGraphControl().addMouseListener(new MouseEventInstancia(grafo));
    }

    /**
     * Ventana con un grafo resultado.
     *
     * @param grafo Grafo a imprimir.
     */
    private VentanaInstancia(Grafo grafo) {
        this.grafo = grafo;
        instancia = new Instancia();
        initComponents();

        graphComponent.getGraphControl().addMouseListener(new MouseEventInstancia(grafo));
    }

    public VentanaInstancia(TipoDeDimension tipoDeDimensionActual) {
        grafo = new GrafoInstancia();
        this.tipoDeDimension = tipoDeDimensionActual;
        instancia = new Instancia();
        initComponents();

        graphComponent.getGraphControl().addMouseListener(new MouseEventInstancia(grafo));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        panelGrafo = new javax.swing.JPanel();
        btnAgregarCategoria = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jlNombre = new javax.swing.JLabel();
        tfIngresadorNombre = new javax.swing.JTextField();
        btnAgregarHecho = new javax.swing.JButton();
        btnConectar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlTiposDeCategoria = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuGrafo = new javax.swing.JMenu();
        btnMenuMakeOnto = new javax.swing.JMenuItem();
        btnMenuMakeCovering = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuEdicion = new javax.swing.JMenu();

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grafize - Ingresar esquema");

        panelGrafo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelGrafo.setLayout(new java.awt.GridLayout(1, 0));
        graphComponent = new mxGraphComponent(grafo);
        //graphComponent.setPreferredSize(new Dimension(500,500));
        //panelGrafo.setLayout(new FlowLayout(FlowLayout.LEFT));
        //System.out.println("Size:" + panelGrafo.getSize());
        panelGrafo.add(graphComponent);

        btnAgregarCategoria.setMnemonic('a');
        btnAgregarCategoria.setText("Agregar categoría");
        btnAgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCategoriaActionPerformed(evt);
            }
        });

        btnEliminar.setMnemonic('e');
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jlNombre.setText("Nombre:");

        btnAgregarHecho.setMnemonic('h');
        btnAgregarHecho.setText("Agregar hecho");
        btnAgregarHecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHechoActionPerformed(evt);
            }
        });

        btnConectar.setMnemonic('c');
        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        jlTiposDeCategoria.setModel(new javax.swing.AbstractListModel() {
            String[] strings = construirStrings();
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jlTiposDeCategoria);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tipos de categoría");

        menuGrafo.setText("Grafo");

        btnMenuMakeOnto.setText("Make onto");
        btnMenuMakeOnto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuMakeOntoActionPerformed(evt);
            }
        });
        menuGrafo.add(btnMenuMakeOnto);

        btnMenuMakeCovering.setText("Make covering");
        btnMenuMakeCovering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuMakeCoveringActionPerformed(evt);
            }
        });
        menuGrafo.add(btnMenuMakeCovering);
        menuGrafo.add(jSeparator1);

        jMenuItem1.setText("Cerrar");
        menuGrafo.add(jMenuItem1);

        jMenuBar1.add(menuGrafo);

        menuEdicion.setText("Edición");
        jMenuBar1.add(menuEdicion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConectar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAgregarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregarHecho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfIngresadorNombre))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelGrafo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelGrafo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIngresadorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarCategoria)
                    .addComponent(btnEliminar)
                    .addComponent(btnAgregarHecho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConectar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCategoriaActionPerformed
        // TODO add your handling code here:
        String nombre = tfIngresadorNombre.getText();
        String tipo = (String) jlTiposDeCategoria.getSelectedValue();
        if (tipo == null) {
            JOptionPane.showMessageDialog(this, "Por favor seleccione un tipo de categoría", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String textoFinalNodo = "<p><strong>" + nombre + "</strong></p>"
                + "<p><em>" + tipo + "</em></p>";
        grafo.agregarNodo(textoFinalNodo, Grafo.CATEGORIA, randX(), randY());
        instancia.InsertarNodo(tipo, nombre);
        tfIngresadorNombre.setText("");
    }//GEN-LAST:event_btnAgregarCategoriaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        grafo.eliminarNodosSeleccionados();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarHechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHechoActionPerformed
        // TODO add your handling code here:
//        grafo.agregarNodo(tfIngresadorNombre.getText(), Grafo.HECHO, randX(), randY());
//        tfIngresadorNombre.setText("");
        String nombre = tfIngresadorNombre.getText();
        String tipo = (String) jlTiposDeCategoria.getSelectedValue();
        if (tipo == null) {
            JOptionPane.showMessageDialog(this, "Por favor seleccione un tipo de categoría", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String textoFinalNodo = "<p><strong>" + nombre + "</strong></p>"
                + "<p><em>" + Esquema.getTipoDeHechos() + "</em></p>";
        grafo.agregarNodo(textoFinalNodo, Grafo.HECHO, randX(), randY());
        tfIngresadorNombre.setText("");
    }//GEN-LAST:event_btnAgregarHechoActionPerformed

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        // TODO add your handling code here:
        if (btnConectar.isSelected()) {
            celda = (mxCell) grafo.getSelectionCell();
            if (celda == null) {
                btnConectar.setSelected(false);
            }
        } else {
            mxCell otraCelda = (mxCell) grafo.getSelectionCell();
            if (otraCelda == null) {
                return;
            }
            if (celda.equals(otraCelda)) {
                return;
            }
            String nombreHijo = getNombre((String) celda.getValue());
            String categoriaHijo = getTipo((String) celda.getValue());
            String nombrePadre = getNombre((String) otraCelda.getValue());
            String categoriaPadre = getTipo((String) otraCelda.getValue());
            String insercion = JOptionPane.showInputDialog(this, "Ingrese el grado de inclusión\nEntre 0 y 1", "Grado de inclusión", JOptionPane.QUESTION_MESSAGE);
            try {
                double gradoInclusion = Double.parseDouble(insercion);
                if (gradoInclusion < 0 || gradoInclusion > 1) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese un número entre 0 y 1", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
//                if (tipoDeDimension.existeRelacion(tipoMayor, tipoMenor)) {
                grafo.enlazarNodos((String) celda.getValue(), (String) otraCelda.getValue(), gradoInclusion);
                instancia.InsertarPadre(categoriaHijo, nombreHijo, categoriaPadre, nombrePadre, gradoInclusion);
//                } else {
//                    JOptionPane.showMessageDialog(this, "No se puede conectar " + tipoMayor + " con " + tipoMenor + " según el esquema", "Error", JOptionPane.ERROR_MESSAGE);
//                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un número en el formato #.##", "Error", JOptionPane.ERROR_MESSAGE);

            } catch (NoEncontrado ex) {
                Logger.getLogger(VentanaInstancia.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnConectarActionPerformed

    private void btnMenuMakeOntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuMakeOntoActionPerformed
        // TODO add your handling code here:
        instancia.MakeOnto();
        VentanaFinal ventana = new VentanaFinal(tipoDeDimension, instancia);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnMenuMakeOntoActionPerformed

    private void btnMenuMakeCoveringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuMakeCoveringActionPerformed
        // TODO add your handling code here:
        instancia.MakeCovering();
        VentanaFinal ventana = new VentanaFinal(tipoDeDimension, instancia);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnMenuMakeCoveringActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInstancia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaInstancia().setVisible(true);
        });
    }

    /**
     * Obtiene un valor aleatorio para insertar en X un nodo.
     *
     * @return Número aleatorio entre 0 y ancho - 150
     */
    public int randX() {
        return (int) (Math.random() * (panelGrafo.getSize().width - 150));
    }

    /**
     * Obtiene un valor aleatorio para insertar en Y un nodo.
     *
     * @return Número aleatorio entre 0 y alto - 150
     */
    public int randY() {
        return (int) (Math.random() * (panelGrafo.getSize().height - 150));
    }

    String[] construirStrings() {
        ArrayList<String> strings = new ArrayList();
        tipoDeDimension.getAll().stream().forEach((tipoCategoria) -> {
            instancia.InsertarCategoria(tipoCategoria.getNombreCategoria());
            strings.add(tipoCategoria.getNombreCategoria());
        });
        return strings.toArray(new String[strings.size()]);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCategoria;
    private javax.swing.JButton btnAgregarHecho;
    private javax.swing.JToggleButton btnConectar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JMenuItem btnMenuMakeCovering;
    private javax.swing.JMenuItem btnMenuMakeOnto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JList jlTiposDeCategoria;
    private javax.swing.JMenu menuEdicion;
    private javax.swing.JMenu menuGrafo;
    private javax.swing.JPanel panelGrafo;
    private javax.swing.JTextField tfIngresadorNombre;
    // End of variables declaration//GEN-END:variables

    private String getNombre(String string) {
        String[] strings = string.split("strong>");
        return strings[1].replace("</", "");
    }

    private String getTipo(String string) {
        String[] strings = string.split("em>");
        return strings[1].replace("</", "");
    }

}
