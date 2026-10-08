package juego;


import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego
{
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
	
	// Variables y métodos propios de cada grupo
	Circulo pelota;
        Rectangulo barra;
        Rectangulo[] ladrillos;
        boolean bandera;
	
	Juego()
	{
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Proyecto para TP", 800, 600);
		
		// Inicializar lo que haga falta para el juego
		pelota=new Circulo(400,300,15,Color.RED);
                barra= new Rectangulo(400,500,60,10,0,Color.BLUE);
                ladrillos= new Rectangulo[16];
                ladrillos[0]= new Rectangulo(30, 50, 40, 20, 0, Color.YELLOW);
                ladrillos[1]= new Rectangulo(80, 50, 40, 20, 0,Color.CYAN);
                ladrillos[2]= new Rectangulo(130, 50, 40, 20, 0, Color.GREEN);
                ladrillos[3]= new Rectangulo(180, 50, 40, 20, 0, Color.MAGENTA);
                ladrillos[4]= new Rectangulo(230, 50, 40, 20, 0, Color.ORANGE);
                ladrillos[5]= new Rectangulo(280, 50, 40, 20, 0, Color.YELLOW);
                ladrillos[6]= new Rectangulo(330, 50, 40, 20, 0,Color.CYAN);
                ladrillos[7]= new Rectangulo(380, 50, 40, 20, 0, Color.GREEN);
                ladrillos[8]= new Rectangulo(430, 50, 40, 20, 0, Color.MAGENTA);
                ladrillos[9]= new Rectangulo(480, 50, 40, 20, 0, Color.ORANGE);
                ladrillos[10]= new Rectangulo(530, 50, 40, 20, 0, Color.YELLOW);
                ladrillos[11]= new Rectangulo(580, 50, 40, 20, 0,Color.CYAN);
                ladrillos[12]= new Rectangulo(630, 50, 40, 20, 0, Color.GREEN);
                ladrillos[13]= new Rectangulo(680, 50, 40, 20, 0, Color.MAGENTA);
                ladrillos[14]= new Rectangulo(730, 50, 40, 20, 0, Color.ORANGE);
                ladrillos[15]= new Rectangulo(780, 50, 40, 20, 0, Color.YELLOW);                
                               
                bandera=true;

		// Inicia el juego!
		this.entorno.iniciar();
	}

	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y 
	 * por lo tanto es el método más importante de esta clase. Aquí se debe 
	 * actualizar el estado interno del juego para simular el paso del tiempo 
	 * (ver el enunciado del TP para mayor detalle).
	 */
	public void tick()
	{
            // Procesamiento de un instante de tiempo
            //entorno.dibujarCirculo(pelota.GetX(), pelota.GetY(), pelota.GetDiametro(), pelota.GetColor());
            pelota.dibujar(entorno);
            barra.dibujar(entorno);            
            for(int i=0; i<ladrillos.length;i++){
                ladrillos[i].dibujar(entorno);
            }
            if(bandera==true && this.pelota.GetY()<barra.GetY()-barra.GetAlto())
                this.pelota.caer();             
            else
                bandera=false;                
            
            if(bandera==false && this.pelota.GetY()>=ladrillos[0].GetY()+ladrillos[0].GetAlto())
                this.pelota.rebotar();
            else              
                bandera=true;
            
            for(int i=0; i<ladrillos.length;i++){
                if(pelota.GetY()==ladrillos[6].GetY() && pelota.GetX()==ladrillos[6].GetX()||
                   pelota.GetY()==ladrillos[7].GetY() && pelota.GetX()==ladrillos[7].GetX())
                    ladrillos[6]=null;
            }
                
                
	}
	

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Juego juego = new Juego();
	}
}
