public class Pisica extends Animal {
    private String culoareOchi;

    public Pisica(String rasa, String numeProprietar, int suprafataMinima, String culoareOchi) {
        super(rasa, numeProprietar, suprafataMinima);
        this.culoareOchi = culoareOchi;
    }

    public String getCuloareOchi() {
        return culoareOchi;
    }

    public void setCuloareOchi(String culoareOchi) {
        this.culoareOchi = culoareOchi;
    }

    @Override
    public String toString() {
        return "Pisica{" +
                "culoareOchi='" + culoareOchi + '\'' +
                '}';
    }
}
