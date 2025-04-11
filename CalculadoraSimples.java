import java.util.Scanner;

public class CalculadoraSimples{
    public static void main(String[] args) {
        //Declaração de variáveis
        int n1, n2, total;
        
        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //apresentação
        System.out.println("\n\t\t\t -- Calculadora Simples --\n");
        //entrada
        System.out.println("Soma Simples: ");
        System.out.println("Informe N1:");
        n1 = entrada.nextInt();
        System.out.println("Informe N2:");
        n2 = entrada.nextInt();
        
        //processamento
        total = n1 + n2;

        //saída
        System.out.println(n1 + " + " + n2 + " = " + total);

    }
}