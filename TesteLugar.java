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
        
        //  Criar um objeto lugar
        // instanciar
        
        Lugar l1 = new Lugar("A1");
        
        String Objeto = l1.tostring();
        System.out.println(Objeto);
        
        //testar set e get numero lugar
        String nl = l1.getnumeroLugar();
        if(nl.equals("A1"))
        {
            System.out.println("O teste set e get ao numero lugar passou com o valor: " + l1.getnumeroLugar());
        }else{
            System.out.println("O teste set e get ao numero lugar não passou com o valor: " + l1.getnumeroLugar());
        }
        
        l1.setnumeroLugar("A2");
        
        String nl1 = l1.getnumeroLugar();
        if(nl1.equals("A2"))
        {
            System.out.println("O teste set e get ao numero lugar passou com o valor: " + l1.getnumeroLugar());
        }else{
            System.out.println("O teste set e get ao numero lugar não passou com o valor: " + l1.getnumeroLugar());
        }
        
        //testar get e ser ocupado
        boolean op = l1.getisOcupado();
        if(op == false)
        {
            System.out.println("O teste get e set do ocupado passou com o valor: " + l1.getisOcupado());
        }else{
            System.out.println("O teste get e set do ocupado não passou com o valor: " + l1.getisOcupado());
        }
        
        l1.setisOcupado(true);
        
        boolean op1 = l1.getisOcupado();
        if(op1 != true)
        {
            System.out.println("O teste get e set do ocupado não passou com o valor: " + l1.getisOcupado());
        }else{
            System.out.println("O teste get e set do ocupado passou com o valor: " + l1.getisOcupado());
        }
        
        //get e set autocarro
        Autocarro auto = l1.getautocarro();
        if(auto == null)
        {
            System.out.println("O teste set e get ao autocarro passou com o valor: " + l1.getautocarro());
        }else{
            System.out.println("O teste set e get ao autocarro não passou com o valor: " + l1.getautocarro());
        }
        
        Autocarro a2 = new Autocarro("AA-11-BB", "Azul", 102, true, 12.0);
        l1.setautocarro(a2);
        Autocarro auto1 = l1.getautocarro();
        if(auto1 == a2)
        {
            System.out.println("O teste get e set ao autocarro passou.");
        }
        else
        {
            System.out.println("O teste get e set ao autocarro não passou.");
        }
        
        System.out.println("\nEstado final:");
        System.out.println(l1.tostring());
    }
}