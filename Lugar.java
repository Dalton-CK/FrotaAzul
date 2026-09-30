public class Lugar
{
    private String numeroLugar; // "A1"
    private boolean isocupado;
    private String autocarro;
    
    public Lugar()
    {
        
    }
    
    public Lugar(String numeroLugar)
    {
        this.numeroLugar = numeroLugar;
        this.isocupado = false;
        this.autocarro = null;
    }
}