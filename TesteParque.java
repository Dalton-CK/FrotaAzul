public class TesteParque
{
    // Método para tirar as repetições
    static boolean testar(Object valor, Object esperado, String nomeAtributo) {
        System.out.println("Inicio do teste " + nomeAtributo);
        
        boolean passou = valor.equals(esperado);
        
        if (passou) {
            System.out.println("Teste do " + nomeAtributo + " passou: " + valor);
        } else {
            System.out.println("Teste do " + nomeAtributo + " não passou: " + valor);
        }
        
        System.out.println("Fim do teste " + nomeAtributo);
        System.out.println();
        
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
        testar(p1.getNome(), testeNome, "nome");
        
        String novoNome = "Estacio";
        p1.setNome(novoNome);
        testar(p1.getNome(), novoNome, "nome");
        
        testar(p1.getMorada(), testeMorada, "morada");
        String novaMorada = "av 34 loures";
        p1.setNome(novaMorada);
        testar(p1.getNome(), novaMorada, "nome");
        
        testar(p1.getNumDeLugares(), numLugar, "numero de lugares");
        String novoNumLugar = "34";
        p1.setNome(novoNumLugar);
        testar(p1.getNome(), novoNumLugar, "nome");
        
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