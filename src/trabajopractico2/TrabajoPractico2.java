package trabajopractico2;

public class TrabajoPractico2 {

    public static void main(String[] args) {
        //System.out.println("Hello World");
        Avion avion;
        
        avion = new Avion();
        avion.setID(001);
        avion.setEstado("Trabajando");
        avion.setUbicacion("Aire");
        avion.setTipoAvion("Comercial");
        
        System.out.println(avion);
    }
    
}
