package jpanelimagen;

import java.io.File;
import java.io.Serializable;

/**
 * Esta clase servirá para crear el componente de propiedad del panel con imagen de fondo.
 * 
 * Para ello se necesitará un atributo File para recoger la imagen.
 * Y un atributo de coma flotante para la opacidad.
 * 
 * Esta clase, se enviraá a JPanelImagen como propiedad, en vez de tenerlos escritos en la propia clase.
 * 
 * Esta clase necesitará su constructor por defecto y los getters y setters para poder interactuar con el panel.
 * 
 * Además tiene que ser Serializable para poder implementar las propiedades del componente.
 * 
 * @author davibern
 * @version 1.0
 */
public class ImagenFondo implements Serializable {
    
    private File rutaImagen;
    private Float opacidad;

    public ImagenFondo(File rutaImagen, Float opacidad) {
        this.rutaImagen = rutaImagen;
        this.opacidad = opacidad;
    }

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public Float getOpacidad() {
        return opacidad;
    }

    public void setOpacidad(Float opacidad) {
        this.opacidad = opacidad;
    }

}
