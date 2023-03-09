package probleme;
import java.util.*;
public class Camera {

    private double suprafata;
    private List<Animal> animale;

    public Camera()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Suprafata camera: ");
        suprafata=in.nextDouble();
        //in.close();
        animale= new ArrayList<>();
    }
    public double getSuprafata()
    {
        return suprafata;
    }
    public void adaugaAnimal(Animal animal) throws Exception
    {
        if(suprafata-animal.getSuprafataMin()>0)
        {
            suprafata-=animal.getSuprafataMin();
            animale.add(animal);
        }
        else
        {
            throw new Exception("Nu mai exista suficient loc!");
        }
    }
    public void pleacaAnimal(Animal animal)
    {
        animale.remove(animal);
        suprafata+=animal.getSuprafataMin();
    }
    public List<Animal> getAnimale() {
        return animale;
    }



}
