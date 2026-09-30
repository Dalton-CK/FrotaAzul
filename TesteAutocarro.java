/**
 * Escreva uma descrição da classe Teste aqui.
 * 
 * @author (Dalton Castro) 
 * @version (30/09/2026)
 */
public class TesteAutocarro
{
    public static void main(String[] args)
    {
        System.out.println("A classe teste autocarro esta a funcionar");
        /**
           Funcionalidade para testar o construtor da classe autocarro
        */
        //  Criar um objeto autocarro
        // instanciar
        Autocarro a1 = new Autocarro("XX-XX-XX", "#xxxxxx", 101, false, 11.0);
        
        String propsDoObjeto = a1.tostring();
        System.out.println(propsDoObjeto);
        
        // testar getmatricula e setmatricula
        String m1 = a1.getmatricula();
        if(m1 == "XX-XX-XX")
        {
            System.out.println("O teste ao matricula pasou passou com o valor: " + a1.getmatricula());
        }else{
            System.out.println("O teste ao matricula não pasou");
        }
        
        a1.setmatricula("AE-23-FC");
        String m2 = a1.getmatricula();
        
        if(m2 != "AE-23-FC")
        {
            System.out.println("O teste ao matricula não  pasou");
        }else{
            System.out.println("O teste ao matricula pasou");
        }
        
        //testar getcor e setcor
        String c = a1.getcor();
        if(c == "#xxxxxx")
        {
            System.out.println("O teste ao cor pasou com o valor: " + a1.getcor());
        }else{
            System.out.println("O teste ao cor não pasou");
        }
        
        a1.setcor("#yyyyyy");
        String c1 = a1.getcor();
        
        if(c1 != "#yyyyyy")
        {
            System.out.println("O teste ao cor não pasou");
        }else{
            System.out.println("O teste ao cor pasou");
        }
        
        //testar getnumLugar e setnumLugar
        int numL = a1.getnumLugar();
        if(numL == 101)
        {
            System.out.println("O teste ao numero de lugar");
        }else{
            System.out.println("O teste ao cor não pasou");
        }
        
        a1.setnumLugar(102);
        int numL1 = a1.getnumLugar();
        
        if(numL != 102)
        {
            System.out.println("O teste ao cor não pasou");
        }else{
            System.out.println("O teste ao cor pasou");
        }
    }
}