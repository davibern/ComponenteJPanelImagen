package jpanelimagen;

import java.awt.Graphics;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * El componente en este caso hereda de JPanel, si bien, es necesario que sea serializable
 * 
 * El componente lo que hará será permitir una imagen de fondo del panel, que por defecto, no está permitido
 * 
 * @author davibern
 * @version 1.0
 */
public class JPanelImagen extends JPanel implements Serializable {

    // Atributo que almacenará la ruta de imagen de fondo del panel
    // Este atributo aparecerá en el menú de propiedades del componente
    private File rutaImagen;
    
    /**
     * Un complemento en Java necesita siempre un constructor sin argumentos
     */
    public JPanelImagen() {
    }
    
    // Para que la paleta de NetBeans pueda mostrar como propiedad rutaImagen hay que implementar
    // los setters y getters. Y tienen que tener el nombre tal cual lo crea NetBeans

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    
    // Para pintar el componente en el panel está el método paintComponent
    // Hay que redefinir el método

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Si se ejecuta el componente pero no se añade ninguna imagen podríamos obtener un NullPointerException
        if (rutaImagen != null && rutaImagen.exists()) {
            // Se crea un objeto imagen a partir del archivo recibido
            ImageIcon imageIcon = new ImageIcon(rutaImagen.getAbsolutePath());
        
            // Se dibuja el panel con la imagen desde la coordenada 0, 0
            g.drawImage(imageIcon.getImage(), 0, 0, null);
        }
        
    }

}
