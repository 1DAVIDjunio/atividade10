public class NumeroController {
    private NumeroModel model;
    private NumeroView view;

    public NumeroController(NumeroModel model, NumeroView view) {
        this.model = model;
        this.view = view;
    }

    public void executarBusca(int numero) {
        int posicao = buscar(numero);
        view.mostrarResultado(posicao, numero);
    }

    private int buscar(int numero) {
        for (int i = 0; i < 10; i++) {
            if (model.getNumero(i) == numero) {
                return i;
            }
        }
        return -1;
    }
}
