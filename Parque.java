public class Parque
{
    private String nome; // "Dalton"
    private String morada; // "Av 23"
    private Autocarro autocarro; // "AA-AA-AA"
    
    public Parque()
    {
        
    }
    
    public Parque(String nome, String morada)
    {
        this.nome = nome;
        this.morada = morada;
        this.autocarro = null;
    }
    
    public Parque(String nome, String morada, Autocarro autocarro)
    {
        this.nome = nome;
        this.morada = morada;
        this.autocarro = autocarro;
    }
    
    // get e set nome
    public String getnome()
    {
        return this.nome;
    }
    
    public void setnome(String nome)
    {
        this.nome = nome;
    }
    
    // get e set morada
    public String getmorada()
    {
        return this.morada;
    }
    
    public void setmorada(String morada)
    {
        this.morada = morada;
    }
    
    // get e set autocarro
    public Autocarro getautocarro()
    {
        return this.autocarro;
    }
    
    public void setautocarro(Autocarro autocarro)
    {
        this.autocarro = autocarro;
    }
    
    //toString
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("---------------------------------------------\n");
        sb.append("Nome: " + this.nome);
        sb.append("\nMorada: " + this.morada);
        
        if(this.autocarro == null)
        {
            sb.append("\nAutocarro: null");
        }
        else
        {
            sb.append("\nAutocarro:");
            sb.append("\n" + this.autocarro.tostring());
        }
        
        sb.append("\n---------------------------------------------");
        
        return sb.toString();
    }
}