
package Main;
import Objetos.Planetas;
public class Ejecutar {
        public static void main(String[] args) {
        Planetas tierra = new Planetas("TIERRA", 1, 0.0, 0.0, 0, 0, null, true, 0.0,
                null);
        tierra.masa();
        tierra.volumen();
        tierra.diametro();
        tierra.distancia();
        tierra.tipo();
        tierra.densidad();
        tierra.exterior();
        System.out.println(tierra.toString());
        
        Planetas marte = new Planetas("MARTE", 2, 0.0, 0.0, 0, 0, null, true, 0.0,
                null);
        marte.masa();
        marte.volumen();
        marte.diametro();
        marte.distancia();
        marte.tipo();
        marte.densidad();
        marte.exterior();
        System.out.println(marte.toString());
        
    }
}

