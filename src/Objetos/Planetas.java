
package Objetos;

public class Planetas {
        private String nombre;
    private Integer satelite;
    private Double masa;
    private Double volumen;
    private Integer diametro;
    private Integer distancia;
    private String tipo;
    private Boolean visible;
    private Double densidad;
    private Boolean exterior;
            
    //Metodos
    public void masa(){
        //masa = g*radio^2/cG
        masa = (9.81 * Math.pow(6371000, 2)) / 6.674;
    }
   
    public void volumen(){
        //volumen = (4/3)*pi*radio^3
        volumen = (4.0 / 3.0) * Math.PI * Math.pow(6371000, 3);
    }
    
    public void diametro(){
        //diametro = 2*r 
        diametro = (2 * 6371000) / 1000;
    }
    
    public void distancia(){
        //distancia(km) = distancia(UA)*149600000  
        distancia = (int)(1.0 * 149600000);
    }
    
    public void tipo(){
        if (diametro > 50000) {
            tipo = "GASEOSO";
        } else if (diametro >= 5000 && diametro <= 50000) {
            tipo = "TERRESTRE";
        } else {
            tipo = "ENANO";
        }
    }
   
    public void densidad(){
        densidad = masa / volumen;
    }
    
    public void exterior(){
        if (distancia > Math.pow(149600000, 2)) {
            exterior = true;
        } else {
            exterior = false;
        }
    }
    
    //Construtor
    public Planetas(String nombre, Integer satelite, Double masa, Double volumen,
            Integer diametro, Integer distancia, String tipo, Boolean visible,
            Double densidad, Boolean exterior) {
        this.nombre = nombre;
        this.satelite = satelite;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distancia = distancia;
        this.tipo = tipo;
        this.visible = visible;
        this.densidad = densidad;
        this.exterior = exterior;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---------[Planetas]---------\n");
        sb.append("Nombre del planeta = ").append(nombre);
        sb.append("\nCantidad del satelites = ").append(satelite);
        sb.append("\nMasa del planeta = ").append(masa).append(" Kg");
        sb.append("\nVolumen del planeta = ").append(volumen).append(" Km^3");
        sb.append("\nDiametro del planeta = ").append(diametro).append(" km");
        sb.append("\nDistancia al sol = ").append(distancia).append(" Km");
        sb.append("\nTipo de planeta = ").append(tipo);
        sb.append("\nEs observable = ").append(visible);
        sb.append("\nDensidad del planeta = ").append(densidad).append(" Cm^3");
        sb.append("\nEs planeta exterior = ").append(exterior);
        sb.append("\n----------------------------");
        return sb.toString();
    }    
    
}
