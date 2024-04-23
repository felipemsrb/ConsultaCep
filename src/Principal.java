import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ConsultaCep consulta = new ConsultaCep();
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o cep");
        var cep = leitura.nextLine();
        try {
            Endereco novoEndereco =  consulta.buscarEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }

    }
}
