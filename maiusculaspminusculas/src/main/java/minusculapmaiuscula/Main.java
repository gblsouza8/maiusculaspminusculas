package minusculapmaiuscula;
import java.util.Scanner;
// programa que transforma o texto inserido pelo usuário em um texto formado completamente com letras maiusculas usando o metódo toUpperCase
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite aqui o texto para deixar inteiro em letra maiúscula: ");
        String texto = input.nextLine();
        input.close();

        String textoMaiusculo = texto.toUpperCase();
        System.out.printf("Texto formatado: %s", textoMaiusculo);

    }
}