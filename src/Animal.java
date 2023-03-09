public abstract class Animal implements Comparable<Animal> {
private String rasa;
private String numeProprietar;
private int suprafataMinima;
public Animal(String rasa, String numeProprietar, int suprafataMinima)
{this.rasa=rasa;
    this.numeProprietar=numeProprietar;
    this.suprafataMinima=suprafataMinima;

}
 public int compareTo(Animal a)
 {
     return numeProprietar.compareTo(a.numeProprietar);
 }
    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getNumeProprietar() {
        return numeProprietar;
    }

    public void setNumeProprietar(String numeProprietar) {
        this.numeProprietar = numeProprietar;
    }

    public int getSuprafataMinima() {
        return suprafataMinima;
    }

    public void setSuprafataMinima(int suprafataMinima) {
        this.suprafataMinima = suprafataMinima;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "rasa='" + rasa + '\'' +
                ", numeProprietar='" + numeProprietar + '\'' +
                ", suprafataMinima=" + suprafataMinima +
                '}';
    }
}
