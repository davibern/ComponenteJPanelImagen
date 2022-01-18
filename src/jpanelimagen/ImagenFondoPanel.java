package jpanelimagen;

import java.io.File;
import javax.swing.JFileChooser;

/**
 * Este panel será el que se muestre cuando se despliegue el menú de imagenFondo.
 * 
 * Tiene que ser siempre de tipo JPanel Form
 * 
 * @author davibern
 * @version 1.0
 */
public class ImagenFondoPanel extends javax.swing.JPanel {

    /**
     * Creates new form ImagenFondoPanel
     */
    public ImagenFondoPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldRuta = new javax.swing.JTextField();
        jButtonAbrirRuta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSliderOpacidad = new javax.swing.JSlider();

        jLabel1.setText("Imagen");

        jTextFieldRuta.setEditable(false);

        jButtonAbrirRuta.setText("...");
        jButtonAbrirRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirRutaActionPerformed(evt);
            }
        });

        jLabel2.setText("Opacidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldRuta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAbrirRuta))
                    .addComponent(jSliderOpacidad, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAbrirRuta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jSliderOpacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Se obtiene la ruta absoluta de la imagen seleccionada y se escribe en el campo de texto
     * @param evt 
     */
    private void jButtonAbrirRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirRutaActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int resultado = fileChooser.showOpenDialog(this);
        
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            this.jTextFieldRuta.setText(file.getAbsoluteFile().toString());
        }
    }//GEN-LAST:event_jButtonAbrirRutaActionPerformed

    /**
     * Este panel tiene que tener un método público que sea capaz de devolver los valores seleccionados en la interfaz.
     * Es decir, un objeto de tipo ImagenFondo, que servirá para construir el propio panel. Es la forma de comunicar ambas clases.
     * 
     * @return ImagenFondo con la propiedad de la imagen y su opacidad.
     */
    public ImagenFondo getSelectedValue() {
        File file = new File(this.jTextFieldRuta.getText());
        Float opacidad = this.jSliderOpacidad.getValue() / 100f;
        
        return new ImagenFondo(file, opacidad);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrirRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSlider jSliderOpacidad;
    private javax.swing.JTextField jTextFieldRuta;
    // End of variables declaration//GEN-END:variables
}