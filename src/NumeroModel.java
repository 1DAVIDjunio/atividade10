public class NumeroModel {
    private int[] numeros;

    public NumeroModel() {
        this.numeros = new int[10];
    }

    public void setNumero(int index, int numero) {
        this.numeros[index] = numero;
    }

    public int getNumero(int index) {
        return this.numeros[index];
    }
}
