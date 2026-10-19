public class TesteParque
{
    public static void main(String[] args)
    {
        String testeNome = "DK";
        String testeMorada = "Av 23";
        int numLugar = 1;
        
        Parque p1 = new Parque(testeNome, testeMorada, numLugar);
        Mensagem msg = new Mensagem();
        
        String nomeP = p1.getNome();
        String nomeTeste1 = "Get nome";
        msg.iniciarTeste(nomeTeste1);
        if(nomeP.equals(testeNome)){
            msg.mensagemDoValidarTeste(nomeTeste1, true);    
        } else{
            msg.mensagemDoValidarTeste(nomeTeste1, false);
        }
        msg.fimTeste(nomeTeste1);
        
        String nomeTeste2 = "Get morada";
        msg.iniciarTeste(nomeTeste2);
        String moradaP = p1.getMorada();
        if(moradaP.equals(testeMorada)){
            msg.mensagemDoValidarTeste(nomeTeste2, true);    
        } else{
            msg.mensagemDoValidarTeste(nomeTeste2, false);
        }
        msg.fimTeste(nomeTeste2);
       
       
        String nomeTeste3 = "Get lugares";
        msg.iniciarTeste(nomeTeste3);
        int lugares = p1.getNumDeLugares();
        if(lugares == numLugar ){
            msg.mensagemDoValidarTeste(nomeTeste3, true);    
        } else{
            msg.mensagemDoValidarTeste(nomeTeste3, false);
        }
        msg.fimTeste(nomeTeste3);
        
        //3.Teste ao metodo estacionarAutocarro
        Autocarro a1 = new Autocarro("AA-11-BB", "Azul", 102, true, 12.0);
        
        int lugaresAntesEstacionar = p1.LugarAvalible();
        p1.estacionar(a1);
        int lugaresDepoisEstacionar = p1.LugarAvalible();
        
        String nomeTeste4 = "estacionar";
        msg.iniciarTeste(nomeTeste4);

        if(lugaresAntesEstacionar > lugaresDepoisEstacionar){
           msg.mensagemDoValidarTeste(nomeTeste4, true);    
        } else{
           msg.mensagemDoValidarTeste(nomeTeste4, false);
        }
        msg.fimTeste(nomeTeste4);
        
        //4.Teste ao metodo removerAutocarro
        int lugarAntesremover = p1.LugarAvalible();
        p1.retirarAutocarro(a1);
        int lugarDepoisremover = p1.LugarAvalible();
        
        String nomeTeste5 = "Remover autocarro";
        msg.iniciarTeste(nomeTeste5);

        if(lugarAntesremover < lugarDepoisremover){
           msg.mensagemDoValidarTeste(nomeTeste5, true);    
        } else{
           msg.mensagemDoValidarTeste(nomeTeste5, false);
        }
        msg.fimTeste(nomeTeste5);
    }
}