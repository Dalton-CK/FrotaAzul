public class Mensagem {
    public static void iniciarTeste(String nomeDoTeste) {
        System.out.println("O teste iniciou - " + nomeDoTeste);
    }
    public static void fimTeste(String nomeDoTeste) {
        System.out.println("Fim do teste - " + nomeDoTeste + ".\n");
    }
    public static void passou(String nomeDoTeste) {
        System.out.println("Okay: o teste - " +  nomeDoTeste + " passou.");
    }
    public static void naoPassou(String nomeDoTeste) {
        System.out.println("Okay: o teste - " +  nomeDoTeste + " não passou.");
    }
    public static void mensagemDoValidarTeste(String nomeDoTeste, boolean resultadoDoTeste) {
        if(resultadoDoTeste) {
            System.out.println("Okay: o teste - " +  nomeDoTeste + " passou.");
        } else {
            System.out.println("Okay: o teste - " +  nomeDoTeste + " não passou.");
        }
    }
}