public class Autocarro
{
    // variáveis de instância
    private String matricula;        // "XX-XX-XX" ou "xxxxxxxx"
    private String cor;              // "#xxxxxx"
    private int numLugar;            // "x" ou "XX"
    private boolean arCondicinado;   // "true" ou "false"
    private double Kms;              // "xx.xx" ou "x.x"
    
    // o construtor
    public Autocarro()
    {
        Autocarro a1 = new Autocarro();
        System.out.println(a1.tostring());
    }
    
    public Autocarro(String matricula, String cor, int numLugar, boolean arCondicinado, double Kms)
    {
        this.matricula = matricula;
        this.cor = cor;
        this.numLugar = numLugar;
        this.arCondicinado = arCondicinado;
        this.Kms = Kms;
    }
    
    public String getmatricula()
    {
        return this.matricula;
    }
    
    public void setmatricula(String m)
    {
        this.matricula = m;
    }
    
    public String getcor()
    {
        return this.cor;
    }
    
    public void setcor(String c)
    {
        this.cor = c;
    }
    
    public int getnumLugar()
    {
        return this.numLugar;
    }
    
    public void setnumLugar(int numL)
    {
        this.numLugar = numL;
    }
    
    public boolean getarCondicinado()
    {
        return this.arCondicinado;
    }
    
    public void setarCondicinado(boolean aC)
    {
        this.arCondicinado = aC;
    }
    
    public double getKms()
    {
        return this.Kms ;
    }
    
    public void setKms(double km)
    {
        this.Kms = km;
    }
    
    public String tostring()
    {
        String resultado = "Testar o ToString";
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("---------------------------------------------\n");
        sb.append("Matricula: " + this.matricula);
        sb.append("\nCor: " + this.cor);
        sb.append("\nNumero de lugar: " + this.numLugar);
        sb.append("\nAr-Condicionado: " + this.arCondicinado);
        sb.append("\nQuilometros: " + this.Kms);
        sb.append("\n---------------------------------------------"); 
        
        
        resultado = sb.toString();
        return resultado;
    }

}