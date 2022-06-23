public class Program {
    public static void main(String[] args) {
        G_Vetor Inteiro = new G_Vetor<>(5);

        Inteiro.IElemento(0, 50);

        G_Vetor Letras = new G_Vetor<>(5);

        Letras.IElemento(1, "Result");

        G_Vetor Numeros = new G_Vetor<>(4);

        Numeros.IElemento(1, 5.5);

        Inteiro.Listar();
        Letras.Listar();
        Numeros.Listar();
    }
}
