import java.util.ArrayList;
public class Parque
{
    private String nome;
    private String morada;
    private ArrayList<Lugar> lugares;
    private int numDeLugares;
    
    public Parque(){
    }
    
    public Parque(String nome, String morada, int numDeLugares){
        this.nome = nome;
        this.morada = morada;
        this.lugares = new ArrayList<>();
        
        for(int i = 0; i < numDeLugares; i++) {
            int numLugar =  i;
            
            Lugar lTemp = new Lugar(numLugar);
            
            this.lugares.add(lTemp);
        }
    }
    
    public String getNome(){
        return this.nome;
    } 
    
    public String getMorada(){
        return morada;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setMorada(String morada){
        this.morada = morada;
    }
    
    public int getNumDeLugares(){
        return numDeLugares;
    }
    
    public void setNumDelugares(int numDeLugares){
        this.numDeLugares = numDeLugares;
    }
    
    public ArrayList<Lugar> getLugares(){
        return lugares;
    }
    
    public void adicionarLugar(Lugar novoLugar){
        if(lugares.size() < numDeLugares){
            lugares.add(novoLugar);
        } else {
            System.out.println("O parque está cheio");
        }
    }
    

    public boolean estacionar(Autocarro a){
        for( int i = 0; i < this.lugares.size(); i++)
        {
            if(! this.lugares.get(i).getIsOcupado()){
                this.lugares.get(i).estacionarAutocarro(a);

                return true;
            }
        }
        return false;
    }
    
    public boolean temLugaresDisponiveis()
    {
        for (int i = 0; i < this.lugares.size(); i++)
        {
            if (!this.lugares.get(i).getIsOcupado())
            {
                return true;
            }
        }
        return false;
    }
    
    public boolean retirarAutocarro(Autocarro a) {
        for (int i = 0; i < this.lugares.size(); i++)
        {
            if (this.lugares.get(i).getAutocarro() == a)
            {
                return this.lugares.get(i).desocuparLugar();
            }
        }
        return false;
    }
    
     public Lugar procurarLugar(Autocarro a) {
        for (int i = 0; i < this.lugares.size(); i++)
        {
            if (this.lugares.get(i).getAutocarro() == a)
            {
                return this.lugares.get(i);
            }
        }
        return null;
    }

}