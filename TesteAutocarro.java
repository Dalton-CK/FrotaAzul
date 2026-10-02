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
        if(m1.equals("XX-XX-XX"))
        {
            System.out.println("O teste ao matricula passou com o valor: " + a1.getmatricula());
        }else{
            System.out.println("O teste ao matricula não passou com o valor: " + a1.getmatricula());
        }
        
        a1.setmatricula("AE-23-FC");
        
        String m2 = a1.getmatricula();
        if(m2.equals("AE-23-FC"))
        {
            System.out.println("O teste ao matricula passou com o valor: " + a1.getmatricula());
        }else{
            System.out.println("O teste ao matricula não passou com o valor: " + a1.getmatricula());
        }
        
        //testar getcor e setcor
        String c = a1.getcor();
        if(c == "#xxxxxx")
        {
            System.out.println("O teste ao cor pasou com o valor: " + a1.getcor());
        }else{
            System.out.println("O teste ao cor não pasou com o valor: " + a1.getcor());
        }
        
        a1.setcor("#yyyyyy");
        
        String c1 = a1.getcor();
        if(c1 != "#yyyyyy")
        {
            System.out.println("O teste ao cor não pasou com o valor: " + a1.getcor());
        }else{
            System.out.println("O teste ao cor pasou com o valor: " + a1.getcor());
        }
        
        //testar getnumLugar e setnumLugar
        int numL = a1.getnumLugar();
        if(numL == 101)
        {
            System.out.println("O teste ao numero de lugar passou com o valor: " + a1.getnumLugar());
        }else{
            System.out.println("O teste ao numero de lugar não passou com o valor: " + a1.getnumLugar());
        }
        
        a1.setnumLugar(102);
        
        int numL1 = a1.getnumLugar();
        if(numL1 != 102)
        {
            System.out.println("O teste ao numero de lugar não passou com o valor: " + a1.getnumLugar());
        }else{
            System.out.println("O teste ao numero de lugar passou com o valor: " + a1.getnumLugar());
        }
        
        //testar getarCondicinado e setarCondicinado
        boolean aC = a1.getarCondicinado();
        if(aC == false)
        {
            System.out.println("O teste do ar condicionado passou com o valor: " + a1.getarCondicinado());
        }else{
            System.out.println("O teste do ar condicionado não passou com o valor: " + a1.getarCondicinado());
        }
        
        a1.setarCondicinado(true);
        
        boolean aC1 = a1.getarCondicinado();
        if(aC1 != true)
        {
            System.out.println("O teste do ar condicionado não passou com o valor: " + a1.getarCondicinado());
        }else{
            System.out.println("O teste do ar condicionado passou com o valor: " + a1.getarCondicinado());
        }
        
        //testar getKms e setKms
        double km = a1.getKms();
        if(km == 11.0)
        {
            System.out.println("O teste do Quilometros passou com o valor: " + a1.getKms());
        }else{
            System.out.println("O teste do Quilometros não passou com o valor: " + a1.getKms());
        }
        
        a1.setKms(12.0);
        
        double km1 = a1.getKms();
        if(km1 != 12.0)
        {
            System.out.println("O teste do Quilometros não passou com o valor: " + a1.getKms());
        }else{
            System.out.println("O teste do Quilometros passou com o valor: " + a1.getKms());
        }
        
        System.out.println("\nEstado final:");
        System.out.println(a1.tostring());
    }
}