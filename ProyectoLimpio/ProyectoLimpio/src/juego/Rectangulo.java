package juego;
import java.awt.Color;
import entorno.Entorno;

public class Rectangulo {
    private double x;
    private double y;
    private double ancho;
    private double alto;
    private double angulo;
    private Color color;
    
    public Rectangulo(double x,double y,double ancho,double alto,double angulo,Color color){
        this.x= x;
        this.y= y;
        this.ancho= ancho;
        this.alto= alto;
        this.angulo= angulo;
        this.color= color;
    }
    
    public double GetX(){return this.x;}
    public double GetY(){return this.y;}
    public double GetAncho(){return this.ancho;}
    public double GetAlto(){return this.alto;}
    public double GetAngulo(){return this.angulo;}
    public Color GetColor(){return this.color;}  
    
    public void dibujar(Entorno entorno){
        entorno.dibujarRectangulo(x, y, ancho, alto, angulo, color);
    }
    
    
    
}
