package jpanelimagen;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 * Esta clase servirá para enlazar el editor de propiedades con el panel
 * 
 * @author davibern
 * @version 1.0
 */
public class ImagenFondoPropertyEditorSupport extends PropertyEditorSupport {
    
    private ImagenFondoPanel imagenFondoPanel = new ImagenFondoPanel();

    /**
     * Este método lo usa NetBeans para preguntar si existe un editor personalizado o no
     * En este caso hay un editor personalizado, se pone a true.
     * 
     * @return True si hay editor personlaizado
     */
    @Override
    public boolean supportsCustomEditor() {
        return true;
    }
    
    /**
     * Este método está pidiendo el panel, es decir, lo que tiene que insertar en el editor de propiedades.
     * Se crea un atributo del panel y se iniciliza, luego se incluye en el método.
     * 
     * @return El panel que se tiene que insertar.
     */
    @Override
    public Component getCustomEditor() {
        return imagenFondoPanel;
    }

    /**
     * Este método devuelve un String para poder inicializar la propiedad con los valores que el usuario configura
     * cuando se inicializa el componente en el JFrame.
     * 
     * @return Inicialización con los valores de la propiedad que el usuario configura. 
     */
    @Override
    public String getJavaInitializationString() {
        ImagenFondo imagenFondo = imagenFondoPanel.getSelectedValue();
        String ruta = imagenFondo.getRutaImagen().getAbsolutePath();
        ruta = ruta.replace("\\", "/");
        return "new jpanelimagen.ImagenFondo(" + "new java.io.File(\"" + ruta + "\"), " + imagenFondo.getOpacidad() + "f)";
    }

    /**
     * Este método lo que hace es guardar los valores que el usuario ha aceptado una vez que ha rellenado
     * las opciones del panel de propiedades.
     * 
     * @return Propiedades del panel de propiedades.
     */
    @Override
    public Object getValue() {
        return imagenFondoPanel.getSelectedValue();
    }
    
}
