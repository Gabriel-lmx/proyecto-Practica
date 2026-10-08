package juego;

import java.awt.Color;

import entorno.Entorno;

public class Manzanas {
	double x;
	double y;
	double ancho;
	double alto;
	Casa[] casas;
			
	Manzanas(double x,double y,double ancho,double alto){
		this.x= x;
		this.y= y;
		this.ancho= ancho;
		this.alto= alto;
		casas= new Casa[8];
		
		int mx= (int)Getx();
		int my= (int)Gety();			
		int tc=15;
		casas[0]= new Casa(mx-30,my,tc,tc);		//medio a la izquierda
		casas[1]= new Casa(mx+30,my,tc,tc);		//medio a la derecha
		casas[2]= new Casa(mx-30,my+30,tc,tc);	//izquierda abajo
		casas[3]= new Casa(mx-30,my-30,tc,tc);	//izquierda arriba
		casas[4]= new Casa(mx,my-30,tc,tc);		//medio arriba		
		casas[5]= new Casa(mx,my+30,tc,tc);		//medio abajo
		casas[6]= new Casa(mx+30,my-30,tc,tc);	//derecha arriba
		casas[7]= new Casa(mx+30,my+30,tc,tc);	//derecha abajo
						
	}
	
	public void dibujarManzana(Entorno entorno) {
		entorno.dibujarRectangulo(x, y, ancho, alto, 0,Color.GREEN);
		for(int i=0;i<casas.length;i++) {
			if(casas[i]!=null) {
				casas[i].dibujarCasas(entorno);	//dibuja las casas usando el metodo de la clase Casas
			}
				
		}
		
	}
	
	public double Getx() {
		return this.x;
	}
	public double Gety() {
		return this.y;
	}
	public double GetAncho() {
		return this.ancho;
	}
	public double GetAlto() {
		return this.alto;
	}
	
	
}
