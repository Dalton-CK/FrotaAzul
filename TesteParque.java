public class TesteParque
{
    public static void main(String[] args)
    {
        Parque p1 = new Parque("DK", "Av 23", 5);

        String Objeto = p1.toString();
        System.out.println(Objeto);
        
        String par = p1.getNome();
        if(par.equals("DK"))
        {
            System.out.println("O nome do parque antes de alterar passou: " + p1.getNome());
        }
        else
        {
            System.out.println("O nome do parque antes de alterar não passou: " + p1.getNome());
        }
        
        p1.setNome("Kenay");
        
        String par2 = p1.getNome();
        if(par2.equals("Kenay"))
        {
            System.out.println("O nome do parque depois de alterar passou: " + p1.getNome());
        }
        else
        {
            System.out.println("O nome do parque depois de alterar não passou: " + p1.getNome());
        }
        
        // get morada e set morada
        String mor = p1.getMorada();
        if(mor.equals("Av 23"))
        {
            System.out.println("A morada do parque antes de alterar passou: " + p1.getMorada());
        }
        else
        {
            System.out.println("A morada do parque antes de alterar não passou: " + p1.getMorada());
        }
        
        p1.setMorada("Av 25");
        
        String mor1 = p1.getMorada();
        if(mor1.equals("Av 25"))
        {
            System.out.println("A morada do parque depois de alterar passou: " + p1.getMorada());
        }
        else
        {
            System.out.println("A morada do parque depois de alterar não passou: " + p1.getMorada());
        }
        
        // Testar estacionamento do autocarro
        Autocarro a2 = new Autocarro("AA-11-BB", "Azul", 102, true, 12.0);

        boolean estacionado = p1.estacionar(a2);
        if(estacionado)
        {
            System.out.println("O autocarro foi estacionado com sucesso.");
        }
        else
        {
            System.out.println("Não foi possível estacionar o autocarro.");
        }
        
        // Estado final
        System.out.println("\nEstado final:");
        System.out.println(p1.toString());
    }
}