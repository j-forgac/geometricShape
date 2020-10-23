package shape;

public class Threedobjects {
    public static void main(String[] args){
        Torus kobliha1 = new Torus(10,1);
        System.out.println(kobliha1.getVolume() + " m^3");
        System.out.println(kobliha1.getSurface() + " m^2");

        Torus kobliha2 = new Torus(5,2);
        System.out.println(kobliha2.getVolume() + " m^3");
        System.out.println(kobliha2.getSurface() + " m^2");

        Torus kobliha3 = new Torus(4,3);
        System.out.println(kobliha3.getVolume() + " m^3");
        System.out.println(kobliha3.getSurface() + " m^2");
    }
}
