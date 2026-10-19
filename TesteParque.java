public class TesteParque
{
    // Método para tirar as repetições
    public static boolean iniciarTeste(Object valor, Object esperado, String nomeAtributo) {
        System.out.println("Inicio do teste " + nomeAtributo);
        boolean passou = valor.equals(esperado);
        
        if (passou) {
            System.out.println("Teste do " + nomeAtributo + " passou: " + valor);
        } else {
            System.out.println("Teste do " + nomeAtributo + " não passou: " + valor);
        }
        
        System.out.println("Fim do teste " + nomeAtributo);
        
        return passou;
    }

    public static void main(String[] args)
    {
        //teste 1
        /**
           testar o construtor
        **/
        
        String testeNome = "DK";
        String testeMorada = "Av 23";
        int numLugar = 5;
        Parque p1 = new Parque(testeNome, testeMorada, numLugar);
        
        //O metudo nome 
        iniciarTeste(p1.getNome(), testeNome, "nome");
        
        String novoNome = "Estacio";
        p1.setNome(novoNome);
        iniciarTeste(p1.getNome(), novoNome, "nome");
        
        iniciarTeste(p1.getMorada(), testeMorada, "morada");
        String novaMorada = "av 34 loures";
        p1.setNome(novaMorada);
        iniciarTeste(p1.getNome(), novaMorada, "nome");
        
        iniciarTeste(p1.getNumDeLugares(), numLugar, "numero de lugares");
        String novoNumLugar = "34";
        p1.setNome(novoNumLugar);
        iniciarTeste(p1.getNome(), novoNumLugar, "nome");
        
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