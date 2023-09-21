public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola, Pablo");
    }
}
import java.util.Scanner;
class AreaDeTrianguloRectangulo
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Introduce el lado del Triángulo:");
        double a= s.nextDouble();
        double  area=(Math.sqrt(3)/4)*(a*a);
        System.out.println("El área del triángulo es:" + area);
    }
}