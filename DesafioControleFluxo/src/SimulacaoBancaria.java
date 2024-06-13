import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 0;
        boolean continuar = true;
        
        System.out.print("\n1. Depositar\n2. Sacar\n3. Consultar Saldo\n4. Encerrar\n\n");

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nValor do depósito: ");
                    saldo += scanner.nextDouble();
                    exibirSaldo(saldo);
                    break;
                case 2:
                    System.out.print("\nValor do saque: ");
                    Double saque = scanner.nextDouble();

                    if(saque > saldo)
                        System.out.println("\nSaldo insuficiente!\n");
                    else
                        saldo -= saque;
                    
                    exibirSaldo(saldo);
                    break;
                case 3:
                    exibirSaldo(saldo);
                    break;
                case 4:
                    System.out.println("\nPrograma encerrado.\n");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.\n");
            }
        }
        scanner.close();
    }

    static void exibirSaldo(Double saldo)
    {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(Locale.UK);
        decimalFormat.applyPattern("0.0");

        System.out.println("\nSaldo atual: " + decimalFormat.format(saldo) + "\n");
    }
}