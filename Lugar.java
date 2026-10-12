public class Lugar 
{
    private int numLugar;
    private boolean isOcupado;
    private Autocarro autocarroEstacionado;

    public Lugar() {
        this.isOcupado = false;
        this.autocarroEstacionado = null;
    }

    public Lugar(int numLugar) 
    {
        this.numLugar = numLugar;
        this.isOcupado = false;
        this.autocarroEstacionado = null;
    }

    public int getNumLugar() 
    {
        return this.numLugar;
    }

    public void setNumLugar(int numLugar) 
    {
        this.numLugar = numLugar;
    }

    public boolean getIsOcupado() 
    {
        return this.isOcupado;
    }

    public void setOcupado(boolean isOcupado) 
    {
        this.isOcupado = isOcupado;
    }

    public Autocarro getAutocarro() 
    {
        return this.autocarroEstacionado;
    }

    public boolean estacionarAutocarro(Autocarro a) 
    {
        if (!this.isOcupado) {
            this.autocarroEstacionado = a;
            this.isOcupado = true;
            return true;
        }

        return false;
    }

    public boolean desocuparLugar() 
    {
        if (this.isOcupado) {
            this.isOcupado = false;
            this.autocarroEstacionado = null;
            return true;
        }

        return false;
    }

    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\n--------------------------------------------------------\n");
        sb.append("N. Lugar: " + this.numLugar);
        sb.append("\nOcupado: " + this.isOcupado);
        sb.append("\nAutocarro estacionado: " + this.autocarroEstacionado);
        sb.append("\n--------------------------------------------------------");

        return sb.toString();
    }
}