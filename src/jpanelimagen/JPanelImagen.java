package jpanelimagen;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
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

    // Atributo que almacenará la ruta de imagen de fondo del panel y su opacidad
    // Este atributo aparecerá en el menú de propiedades del componente
    private ImagenFondo imagenFondo;
    
    /**
     * Un complemento en Java necesita siempre un constructor sin argumentos
     */
    public JPanelImagen() {
    }
    
    // Para que la paleta de NetBeans pueda mostrar como propiedad imagenFondo hay que implementar
    // los setters y getters. Y tienen que tener el nombre tal cual lo crea NetBeans

    public ImagenFondo getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(ImagenFondo imagenFondo) {
        this.imagenFondo = imagenFondo;
        repaint();
    }
    
    // Para pintar el componente en el panel está el método paintComponent
    // Hay que redefinir el método

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Si no se configura ImagenFondo, se obtiene NullPointerException
        if (imagenFondo != null) {
            // Si se ejecuta el componente pero no se añade ninguna imagen podríamos obtener un NullPointerException
            if (imagenFondo.getRutaImagen() != null && imagenFondo.getRutaImagen().exists()) {
                // Se crea un objeto imagen a partir del archivo recibido
                ImageIcon imageIcon = new ImageIcon(imagenFondo.getRutaImagen().getAbsolutePath());
                // Se pasa la opacidad de la propiedad de la imagen
                Graphics2D g2d = (Graphics2D) g;
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, imagenFondo.getOpacidad()));
                // Se dibuja el panel con la imagen desde la coordenada 0, 0
                g.drawImage(imageIcon.getImage(), 0, 0, null);
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
            }
        }

    }

}
