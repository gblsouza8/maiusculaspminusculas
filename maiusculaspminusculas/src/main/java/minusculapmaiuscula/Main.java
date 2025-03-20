package minusculapmaiuscula;
import java.util.Scanner;
// programa que transforma o texto inserido pelo usuário em um texto formado completamente com letras maiusculas usando o metódo toUpperCase
public class Main {
    public static void main(String[] args) {
        // inicia o objeto input usando o scanner
        Scanner input = new Scanner(System.in);

        // pede para o usuário digitar o texto a ser convertido
        System.out.println("Digite aqui o texto para deixar inteiro em letra maiúscula: ");
        // armazena o texto na variável texto
        String texto = input.nextLine();
        // finaliza o input
        input.close();

        // converte o texto para maiusculo
        String textoMaiusculo = texto.toUpperCase();
        // exibe o resultado
        System.out.printf("Texto formatado: %s", textoMaiusculo);

    }
}