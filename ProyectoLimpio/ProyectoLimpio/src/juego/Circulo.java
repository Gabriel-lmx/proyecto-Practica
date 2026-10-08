package juego;
import java.awt.Color;
import entorno.Entorno;

public class Circulo {
    private double x;
    private double y;
    private double diametro;
    private Color color;
    private double velocidad;

    public Circulo(double x,double y,double diametro,Color color) {
        this.x= x;
        this.y= y;
        this.diametro= diametro;
        this.color= color;
        this.velocidad= 4;
    }
    
    public double GetX(){return this.x;}
    public double GetY(){return this.y;}
    public double GetDiametro(){return this.diametro;}
    public Color GetColor(){return this.color;}
    public double GetVelocidad(){return this.velocidad;}
    
    public void dibujar(Entorno entorno){
        entorno.dibujarCirculo(x, y, diametro, color);
    }
    
    public void caer(){
        this.y+= GetVelocidad();
    }
    
    public void rebotar(){
        this.y-= GetVelocidad();
    }
}
