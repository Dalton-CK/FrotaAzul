public class Lugar
{
    private String numeroLugar; // "A1"
    private boolean isOcupado;
    private String autocarro;
    
    public Lugar()
    {
        
    }
    
    public Lugar(String numeroLugar)
    {
        this.numeroLugar = numeroLugar;
        this.isOcupado = false;
        this.autocarro = null;
    }
    
    //get e set do Numero de lugar
    public String getnumeroLugar()
    {
        return this.numeroLugar;
    }
    
    public void setnumeroLugar(String nL)
    {
        this.numeroLugar = nL;
    }
    
    //get e set do lugar ocupado
    public boolean getisOcupado()
    {
        return this.isOcupado;
    }
    
    public void setisOcupado(boolean ocupado)
    {
        this.isOcupado = ocupado;
    }
    
    //get e set do lugar do auto carro
    public String getautocarro()
    {
        return this.autocarro;
    }
    
    public void setautocarro(String auto)
    {
        this.autocarro = auto;
    }
    
}