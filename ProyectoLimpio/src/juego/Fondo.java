package juego;
import java.awt.Color;

import entorno.Entorno;

public class Fondo {
	private double x;
	private double y;
	private double ancho;
	private double alto;
	Manzanas[] manzana;
	int cantManzanas=20;
		
	Fondo(double x,double y,double ancho,double alto){
		this.x= x;
		this.y= y;
		this.ancho= ancho;
		this.alto= alto;
		
		manzana= new Manzanas[cantManzanas];
		
		int fx= (int)Getx();
		int fy= (int)Gety();			
		int tm=80;				//tamaño de la manzana
		manzana[0]= new Manzanas(fx-240,fy*0.4,tm,tm);			//primera columna de manzanas
		manzana[1]= new Manzanas(fx-240,fy*0.8,tm,tm);
		manzana[2]= new Manzanas(fx-240,fy*1.2,tm,tm);
		manzana[3]= new Manzanas(fx-240,fy*1.6,tm,tm);
		
		manzana[4]= new Manzanas(fx-120,fy*0.4,tm,tm);
		manzana[5]= new Manzanas(fx-120,fy*0.8,tm,tm);
		manzana[6]= new Manzanas(fx-120,fy*1.2,tm,tm);
		manzana[7]= new Manzanas(fx-120,fy*1.6,tm,tm);
		
		manzana[8]= new Manzanas(fx,fy*0.4,tm,tm);
		manzana[9]= new Manzanas(fx,fy*0.8,tm,tm);
		manzana[10]= new Manzanas(fx,fy*1.2,tm,tm);
		manzana[11]= new Manzanas(fx,fy*1.6,tm,tm);
		
		manzana[12]= new Manzanas(fx+120,fy*0.4,tm,tm);
		manzana[13]= new Manzanas(fx+120,fy*0.8,tm,tm);
		manzana[14]= new Manzanas(fx+120,fy*1.2,tm,tm);
		manzana[15]= new Manzanas(fx+120,fy*1.6,tm,tm);
		
		manzana[16]= new Manzanas(fx+240,fy*0.4,tm,tm);
		manzana[17]= new Manzanas(fx+240,fy*0.8,tm,tm);
		manzana[18]= new Manzanas(fx+240,fy*1.2,tm,tm);
		manzana[19]= new Manzanas(fx+240,fy*1.6,tm,tm);
	
			
		
		/*for(int i=0;i<cantManzanas;i++) {
			manzana[i]= new Manzanas();
		}*/
	}
	
	public void dibujarFondo(Entorno entorno) {
		entorno.dibujarRectangulo(x, y, ancho, alto, 0,Color.GRAY);		
		for(int i=0;i<manzana.length;i++) {
			if(manzana[i]!=null) {
				manzana[i].dibujarManzana(entorno);	//dibuja las manzanas usando el metodo de la clase Manzanas
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
