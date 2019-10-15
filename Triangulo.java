public class Triangulo
{

    private Punto punto1;
    private Punto punto2;
    private Punto punto3;
    private Color colorLineas;
    private Color colorRelleno;

    public Triangulo(   )
    {

        punto1 = new Punto( 200, 50 );
        punto2 = new Punto( 300, 200 ); 
        punto3 = new Punto( 100, 200 );

        colorRelleno = new Color( 60, 168, 56 );
        colorLineas = new Color( 0, 83, 24 );
    }
    
        public Triangulo(Punto punto1, Punto punto2, Punto punto3){
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.colorRelleno = new Color(0,0,0);
        this.colorLineas = new Color(0,0,0);
    }
    
    public Triangulo(Punto punto1, Punto punto2, Punto punto3, Color colorRelleno){
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.colorRelleno = colorRelleno;
        this.colorLineas = new Color(0,0,0);
    }
    public Punto getPunto1( )
    {
        return punto1;
    }

    public void setPunto1( Integer pX, Integer pY )
    {
        punto1.setX( pX );
        punto1.setY( pY );
    }

    public Punto getPunto2( )
    {
        return punto2;
    }

    public void setPunto2( Integer pX, Integer pY )
    {
        punto2.setX( pX );
        punto2.setY( pY );
    }

    public Punto getPunto3( )
    {
        return punto3;
    }

    public void setPunto3( Integer pX, Integer pY )
    {
        punto3.setX( pX );
        punto3.setY( pY );
    } 

    public Color getcolor_Relleno( )
    {
        return colorRelleno;
    }

    public void setColorRelleno( int pRojo, int pVerde, int pAzul )
    {
        colorRelleno.setR( pRojo );
        colorRelleno.setG( pVerde );
        colorRelleno.setB( pAzul );
    }

    public Color getcolor_Lineas( )
    {
        return colorLineas;
    }

    public void setColorLineas( int pRojo, int pVerde, int pAzul )
    {
        colorLineas.setR( pRojo );
        colorLineas.setG( pVerde );
        colorLineas.setB( pAzul );
    }

    public double getPerimetro( )
    {
        // Retorna la suma de todos los lados
        return calcular_Lado1( ) + calcular_Lado2( ) + calcular_Lado3( );
    }

    public double getArea( )
    {
        // Calcula el valor S para la formula
        double perimetro = getPerimetro( );
        double s = perimetro / 2;

        // Calcula las restas para cada uno de los lados
        double valorLado1 = s - calcular_Lado1( );
        double valorLado2 = s - calcular_Lado2( );
        double valorLado3 = s - calcular_Lado3( );

        // Calcula y devuelve el área
        double area = Math.sqrt( s * valorLado1 * valorLado2 * valorLado3 );
        return area;
    }

    public double getAltura( )
    {
        double area = getArea( );
        double base = calcular_Lado1( );
        double altura = ( area / base ) * 2;
        return altura;
    }

    //Métodos
    private double calcular_Lado1( )
    {
        // Calcula las restas
        double valorX = Math.pow( punto1.getX( ) - punto2.getX( ), 2 );
        double valorY = Math.pow( punto1.getY( ) - punto2.getY( ), 2 );

        // calcula la distancia
        double distancia = Math.sqrt( valorX + valorY );
        return distancia;
    }

    private double calcular_Lado2( )
    {
        // Calcula las restas
        double valorX = Math.pow( punto2.getX( ) - punto3.getX( ), 2 );
        double valorY = Math.pow( punto2.getY( ) - punto3.getY( ), 2 );

        // calcula la distancia
        double distancia = Math.sqrt( valorX + valorY );
        return distancia;
    }

    private double calcular_Lado3( )
    {
        // Calcula las restas
        double valorX = Math.pow( punto3.getX( ) - punto1.getX( ), 2 );
        double valorY = Math.pow( punto3.getY( ) - punto1.getY( ), 2 );

        // calcula la distancia
        double distancia = Math.sqrt( valorX + valorY );
        return distancia;
    }

}