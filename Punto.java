
public class Punto
{
    private int x;
    private int y;

    /**
     * Constructor for objects of class Coordenada
     */
    public Punto()
    {
        this.x = 0;
        this.y = 0;
    }
    
    public Punto(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return this.x;
    }

    public void setX(int x){
        this.x = x;
    }


    public int getY(){
        return this.y;
    }

    public void setY(int y){
        this.y = y;
    }

}