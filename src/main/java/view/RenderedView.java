package view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;

@ManagedBean
@ViewScoped
public class RenderedView implements Serializable{
	boolean flag;
	/**
	 * 
	 */
	private static final long serialVersionUID = -7861433250992814858L;
	String contenidoSeleccionado;
	
	public void setContenidoSeleccionado() {
		flag = true;
		System.out.println("Funciona");
	}
	public boolean isMostrarMarcador() {
	    return flag ? true : false;
	}

	public boolean isMostrarContenidoVideo() {
	    return "video".equals(contenidoSeleccionado);
	}

	public boolean isMostrarContenidoTabla() {
	    return "tabla".equals(contenidoSeleccionado);
	}

	public boolean isMostrarContenidoGrafico() {
	    return "grafico".equals(contenidoSeleccionado);
	}
	
}
