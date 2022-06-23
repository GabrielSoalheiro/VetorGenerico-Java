public class G_Vetor<T> {
    public T[] Vetor;

    public G_Vetor(int Tam) {
        Vetor = (T[]) new Object[Tam];
    }

    public void IElemento(int i, T Result) {
        Vetor[i] = Result;
    }

    public T Recuperação(int i) {
        return Vetor[i];
    }

    public void Listar() {
        for (int i = 0; i < Vetor.length; i++) {
            System.out.println(Vetor[i] + " | ");
        }
    }

}
