/**
 * Escreva uma descrição da classe TesteParque aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class TesteParque
{
    public static void main(String[] args)
    {
        Parque p1 = new Parque("DK", "Av 23");

        String Objeto = p1.toString();
        System.out.println(Objeto);
        
        String par = p1.getnome();
        if(par.equals("DK"))
        {
            System.out.println("O nome do parque antes de alterar passou: " + p1.getnome());
        }
        else
        {
            System.out.println("O nome do parque antes de alterar não passou: " + p1.getnome());
        }
        
        p1.setnome("Kenay");
        
        String par2 = p1.getnome();
        if(par2.equals("Kenay"))
        {
            System.out.println("O nome do parque depois de alterar passou: " + p1.getnome());
        }
        else
        {
            System.out.println("O nome do parque depois de alterar não passou: " + p1.getnome());
        }
        
        // get morada e set morada
        String mor = p1.getmorada();
        if(mor.equals("Av 23"))
        {
            System.out.println("A morada do parque antes de alterar passou: " + p1.getmorada());
        }
        else
        {
            System.out.println("A morada do parque antes de alterar não passou: " + p1.getmorada());
        }
        
        p1.setmorada("Av 25");
        
        String mor1 = p1.getmorada();
        if(mor1.equals("Av 25"))
        {
            System.out.println("A morada do parque depois de alterar passou: " + p1.getmorada());
        }
        else
        {
            System.out.println("A morada do parque depois de alterar não passou: " + p1.getmorada());
        }
        
        // get autocarro e set autocarro
        Autocarro auto = p1.getautocarro();

        if(auto == null)
        {
            System.out.println("O teste get e set ao autocarro passou com o valor: " + p1.getautocarro());
        }
        else
        {
            System.out.println("O teste get e set ao autocarro não passou com o valor: " + p1.getautocarro());
        }
        
        Autocarro a2 = new Autocarro("AA-11-BB", "Azul", 102, true, 12.0);
        p1.setautocarro(a2);
        Autocarro auto1 = p1.getautocarro();

        if(auto1 == a2)
        {
            System.out.println("O teste get e set ao autocarro passou com o valor: ");
        }
        else
        {
            System.out.println("O teste get e set ao autocarro não passou com o valor: ");
        }
        
        // Estado final
        System.out.println("\nEstado final:");
        System.out.println(p1.toString());
    }
}