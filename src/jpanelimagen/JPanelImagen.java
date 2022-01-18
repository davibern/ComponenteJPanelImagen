package jpanelimagen;

import java.io.Serializable;
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
    private String rutaImagen;
    
    /**
     * Un complemento en Java necesita siempre un constructor sin argumentos
     */
    public JPanelImagen() {
    }
    
    // Para que la paleta de NetBeans pueda mostrar como propiedad rutaImagen hay que implementar
    // los setters y getters. Y tienen que tener el nombre tal cual lo crea NetBeans
    
    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    
}
