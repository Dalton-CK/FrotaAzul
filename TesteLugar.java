/**
 * Escreva uma descrição da classe Teste aqui.
 * 
 * @author (Dalton Castro) 
 * @version (04/10/2026)
 */
public class TesteLugar
{
    public static void main(String[] args)
    {
        System.out.println("A classe teste teste esta a funcionar");
        
        // Criar um objeto lugar
        // instanciar
        
        Lugar l1 = new Lugar(1);
        
        String Objeto = l1.toString();
        System.out.println(Objeto);
        
        // testar set e get numero lugar
        int nl = l1.getNumLugar();
        if(nl == 1)
        {
            System.out.println("O teste set e get ao numero lugar passou com o valor: " + l1.getNumLugar());
        }else{
            System.out.println("O teste set e get ao numero lugar não passou com o valor: " + l1.getNumLugar());
        }
        
        l1.setNumLugar(2);
        
        int nl1 = l1.getNumLugar();
        if(nl1 == 2)
        {
            System.out.println("O teste set e get ao numero lugar passou com o valor: " + l1.getNumLugar());
        }else{
            System.out.println("O teste set e get ao numero lugar não passou com o valor: " + l1.getNumLugar());
        }
        
        // testar get e set ocupado
        boolean op = l1.getIsOcupado();
        if(op == false)
        {
            System.out.println("O teste get e set do ocupado passou com o valor: " + l1.getIsOcupado());
        }else{
            System.out.println("O teste get e set do ocupado não passou com o valor: " + l1.getIsOcupado());
        }
        
        l1.setOcupado(true);
        
        boolean op1 = l1.getIsOcupado();
        if(op1 != true)
        {
            System.out.println("O teste get e set do ocupado não passou com o valor: " + l1.getIsOcupado());
        }else{
            System.out.println("O teste get e set do ocupado passou com o valor: " + l1.getIsOcupado());
        }
        
        // get e set autocarro
        Autocarro auto = l1.getAutocarro();
        if(auto == null)
        {
            System.out.println("O teste set e get ao autocarro passou com o valor: " + l1.getAutocarro());
        }else{
            System.out.println("O teste set e get ao autocarro não passou com o valor: " + l1.getAutocarro());
        }
        
        Autocarro a2 = new Autocarro("AA-11-BB", "Azul", 102, true, 12.0);
        l1.estacionarAutocarro(a2);
        Autocarro auto1 = l1.getAutocarro();
        if(auto1 == a2)
        {
            System.out.println("O teste get e set ao autocarro passou.");
        }
        else
        {
            System.out.println("O teste get e set ao autocarro não passou.");
        }
        
        System.out.println("\nEstado final:");
        System.out.println(l1.toString());
    }
}