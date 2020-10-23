package shape;

public class Torus {
    double polomertrubice;
    double strednipolomer;
    final double pi = Math.PI;

    public Torus(float polTrubice, float stredniPol) {
        this.polomertrubice = polTrubice;
        this.strednipolomer = stredniPol;
    }

    public double getVolume() {
        double volume = 2 * Math.pow(pi, 2) * Math.pow(strednipolomer, 2) * polomertrubice;
        return volume;
    }

    public double getSurface() {
        double surface = 4 * Math.pow(pi, 2) * polomertrubice * strednipolomer;
        return surface;
    }
}
