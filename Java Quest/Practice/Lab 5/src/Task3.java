import java.util.Scanner;
abstract class Shape3D 
{
	
    abstract float calVol(float length);
    abstract float calSurfArea(float length);
    
}

class Sphere extends Shape3D 
{
	float radius = 0;
    float calVol(float rad) 
    {
    	float vol =(float)1.33*(float)3.14*(radius*radius*radius);
        return vol;
    }

    float calSurfArea(float rad) 
    {
    	float surfArea=(float)1.33*(float)3.14*(radius*radius);
        return surfArea;
    }
}

class Cube extends Shape3D 
{
	float length = 0;
    float vol = 0;
    float calVol(float len) 
    {
    vol=(length*length*length);
    return vol;
    }
    float calSurfArea(float len) 
    {
    	float surfArea=6*(length*length);
        return surfArea;
    }
}

// Main class Start
public class Task3 {
    public static void main(String[] args) 
    {
    Scanner inp = new Scanner(System.in);
    // Create a Sphere object
    Sphere sp = new Sphere();
    sp.radius = inp.nextFloat();
    System.out.println("Sphere Volume: " + sp.calVol(sp.radius));
    System.out.println("Sphere Surface Area: " + sp.calSurfArea(sp.radius));
    Cube cu = new Cube();
    cu.length = inp.nextFloat();
    System.out.println("Cube Volume: " + cu.calVol(cu.length));
    System.out.println("Cube Surface Area: " + cu.calSurfArea(cu.length));
    inp.close();
    }
}