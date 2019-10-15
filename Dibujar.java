import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class Dibujar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dibujar extends JFrame
{
    // instance variables - replace the example below with your own
    private Triangulo triangulo;

    /**
     * Constructor for objects of class Dibujar
     */
    public Dibujar()
    {
        // initialise instance variables
        super( "Drawing Polygons" );
        setSize( 275, 230 );
        setVisible( true );

    }
    
    public Dibujar(Triangulo triangulo)
    {
        // initialise instance variables

        super( "Drawing Polygons" );
        this.triangulo = triangulo;
        setSize( 275, 230 );
        setVisible( true );

    }

    public void paint( Graphics g )
    {
        super.paint( g ); 

        Polygon polygon1 = new Polygon();
        
        polygon1.addPoint( triangulo.getPunto1().getX(), triangulo.getPunto1().getY() );
        polygon1.addPoint( triangulo.getPunto2().getX(), triangulo.getPunto2().getY() );
        polygon1.addPoint( triangulo.getPunto3().getX(), triangulo.getPunto3().getY() );  
        
         
        g.setColor(new java.awt.Color(triangulo.getcolor_Lineas().getR(), triangulo.getcolor_Lineas().getG(), triangulo.getcolor_Lineas().getB()));
        g.drawLine(triangulo.getPunto1().getX(), triangulo.getPunto1().getY(), triangulo.getPunto2().getX(), triangulo.getPunto2().getY());
        g.drawLine(triangulo.getPunto1().getX(), triangulo.getPunto1().getY(), triangulo.getPunto3().getX(), triangulo.getPunto3().getY());
        g.drawLine(triangulo.getPunto3().getX(), triangulo.getPunto3().getY(), triangulo.getPunto2().getX(), triangulo.getPunto2().getY());
        
        g.setColor(new java.awt.Color(triangulo.getcolor_Relleno().getR(), triangulo.getcolor_Relleno().getG(), triangulo.getcolor_Relleno().getB()));
        
        g.fillPolygon(polygon1); 
        
    }
    
    public void repintar(){
        repaint();
    }
    
    /**Metodo de acceso a la propiedad triangulo*/
    public Triangulo getTriangulo(){
        return this.triangulo;
    }//end method getTriangulo

    /**Metodo de modificación a la propiedad triangulo*/
    public void setTriangulo(Triangulo triangulo){
        this.triangulo = triangulo;
    }//end method setTriangulo

}