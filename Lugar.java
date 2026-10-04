public class Lugar
{
    private String numeroLugar; // "A1"
    private boolean isOcupado; // true - false
    private Autocarro autocarro; //"XX-XX-XX"
    
    public Lugar()
    {
        
    }
    
    public Lugar(String numeroLugar)
    {
        this.numeroLugar = numeroLugar;
        this.isOcupado = false;
        this.autocarro = null;
    }

    public Lugar(String numeroLugar, Autocarro autocarro)
    {
        this.numeroLugar = numeroLugar;
        this.isOcupado = false;
        this.autocarro = autocarro;
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
    
    //get e set do lugar Autocarro
     public Autocarro getautocarro()
    {
        return this.autocarro;
    }
    public void setautocarro(Autocarro autocarro)
    {
        this.autocarro = autocarro;
    }
    public String tostring()
    {
        String resultado = "ToString";
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("---------------------------------------------\n");
        sb.append("Numero de Lugar: " + this.numeroLugar);
        sb.append("\nOcupado: " + this.isOcupado);
        
        if(this.autocarro == null)
        {
            sb.append("\nAutocarro: null\n");
        }
        else
        {
            sb.append("\nAutocarro: \n");
            sb.append(this.autocarro.tostring());
        }

        sb.append("\n---------------------------------------------"); 
        
        
        resultado = sb.toString();
        return resultado;
    }
}