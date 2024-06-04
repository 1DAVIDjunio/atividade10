public class Main {
    public static void main(String[] args) {
        NumeroModel model = new NumeroModel();
        NumeroView view = new NumeroView();
        NumeroController controller = new NumeroController(model, view);

        // Populando o modelo com alguns números
        model.setNumero(0, 10);
        model.setNumero(1, 20);
        model.setNumero(2, 30);
        model.setNumero(3, 40);
        model.setNumero(4, 50);
        model.setNumero(5, 60);
        model.setNumero(6, 70);
        model.setNumero(7, 80);
        model.setNumero(8, 90);
        model.setNumero(9, 100);

        int numero = view.solicitarNumero();
        controller.executarBusca(numero);
    }
}
