package juego;

import java.awt.Color;
import entorno.Entorno;

public class Casa {

	private double x;
	private double y;
	private double ancho;
	private double alto;
	
	Casa(double x,double y,double ancho,double alto){
			this.x= x;
			this.y= y;
			this.ancho= ancho;
			this.alto= alto;
	}
	
	public void dibujarCasas(Entorno entorno) {
		entorno.dibujarRectangulo(x, y, ancho, alto, 0,Color.RED);
		
	}
}
