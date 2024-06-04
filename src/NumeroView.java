import java.util.Scanner;

public class NumeroView {
    private Scanner scanner;

    public NumeroView() {
        this.scanner = new Scanner(System.in);
    }

    public int solicitarNumero() {
        System.out.print("Digite um número: ");
        return scanner.nextInt();
    }

    public void mostrarResultado(int posicao, int numero) {
        if (posicao != -1) {
            System.out.println("O número " + numero + " foi encontrado na posição " + posicao + ".");
        } else {
            System.out.println("O número não foi encontrado.");
        }
    }
}
