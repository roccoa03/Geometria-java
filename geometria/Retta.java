package geometria; 

public class Retta { 

  private double base;
  private double altezza; 
  public double Retta (double b, double h){
    base = b; 
    altezza = h;
    return base * altezza; 
  }
  public double area() {
    return base * altezza;

  }
}
