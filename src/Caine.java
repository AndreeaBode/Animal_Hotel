public class Caine extends Animal{
    private boolean esteAgresiv;
    public Caine(String rasa, String numeProprietar, int suprafataMinima, boolean esteAgresiv)
    {
    super(rasa, numeProprietar,suprafataMinima);
    this.esteAgresiv=esteAgresiv;
    }

    public boolean isEsteAgresiv() {
        return esteAgresiv;
    }

    public void setEsteAgresiv(boolean esteAgresiv) {
        this.esteAgresiv = esteAgresiv;
    }

    @Override
    public String toString() {
        return "Caine{" +
                "esteAgresiv=" + esteAgresiv +
                '}';
    }
}
