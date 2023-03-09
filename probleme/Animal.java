package probleme;
import java.util.*;
public class Animal implements Comparable<Animal>{
    private String rasa;
    private String proprietar;
    private double suprafataMin;

    public Animal()
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Rasa: ");
        rasa=scanner.next();
        System.out.println("Nume proprietar: ");
        proprietar=scanner.next();
        System.out.println("Suprafata minima: ");
        suprafataMin=scanner.nextDouble();
        //scanner.close();

    }

    public double getSuprafataMin()
    {
        return suprafataMin;
    }

    @Override
    public int compareTo(Animal o) {
        Animal animal=(Animal) o;
        return -(this.proprietar.compareTo(animal.proprietar));
    }

    public String toString()
    {
        return rasa+" "+proprietar;
    }
}
