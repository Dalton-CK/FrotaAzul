public class TesteParque
{
    public static void main(String[] args)
    {
        //teste 1
        /**
           testar o contrutor
        **/
        
        String testeNome = "DK";
        String testeMorada = "Av 23";
        int numLugar = 5;
        Parque p1 = new Parque(testeNome, testeMorada, numLugar);
        
        String nome = p1.getNome();
        System.out.println("Inicio do teste nome");
        if(nome == testeNome){
            System.out.println("Teste do nome parque passou: " + p1.getNome());
        }else{
            System.out.println("Teste do nome parque não passou: " + p1.getNome());
        }
        System.out.println("Fim do teste Nome");
        
        // get morada
        String morada = p1.getMorada();
        System.out.println("Inicio do teste Morada");
        
        if(morada == testeMorada){
            System.out.println("Teste do Morada parque passou: " + p1.getMorada());
        }else{
            System.out.println("Teste do Morada parque não passou: " + p1.getMorada());
        }
        System.out.println("Fim do teste Morada");
        
        int lugar = p1.getNumDeLugares();
        System.out.println("Inicio do teste numero de lugar");
        
        if(lugar == numLugar){
            System.out.println("Teste do lugar parque passou: " + p1.getMorada());
        }else{
            System.out.println("Teste do lugar parque não passou: " + p1.getMorada());
        }
        System.out.println("fim do teste numero de lugar");
        
        //teste estacionar
        Autocarro a1 = new Autocarro("AA-11-BB", "Azul", 102, true, 12.0);
        
        int lugaresAntesEstacionar = p1.LugarAvalible();
        p1.estacionar(a1);
        int lugaresDepoisEstacionar = p1.LugarAvalible();
        
        System.out.println("Inicio do teste estacionar");
        if(lugaresAntesEstacionar > lugaresDepoisEstacionar){
            System.out.println("O metodo estacionar passou: ");
        }else{
            System.out.println("O metodo estacionar não passou: ");
        }
        System.out.println("Fim do teste estacionar");
        
        //teste removerautocaro
        int lugarAntesremover = p1.LugarAvalible();
        
        p1.retirarAutocarro(a1);
        
        int lugarDepoisremover = p1.LugarAvalible();
        
        System.out.println("Inicio do teste remover");
        if(lugarAntesremover < lugarDepoisremover){
            System.out.println("O teste remover passou: ");
        }else{
            System.out.println("O teste remover não passou: ");
        }
        System.out.println("Fim do teste remover ");
        
    }
}