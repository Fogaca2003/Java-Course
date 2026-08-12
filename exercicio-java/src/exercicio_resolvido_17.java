import java.util.Locale;
import java.util.Scanner;

public class exercicio_resolvido_17 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] comida = new String[n];
        double[] custo = new double[n];
        double[] venda = new double[n];


        for (int i = 0; i < n; i++){
            comida[i] = sc.next();
            custo[i] = sc.nextDouble();
            venda[i] = sc.nextDouble();
        }
        double lucro;
        int lucroMenos10 = 0;
        int lucroEntre10e20 = 0;
        int lucroMaior20 = 0;
        double valorTotalCompra = 0;
        double valorTotalVenda = 0;
        double porcentagem;

        for (int i = 0; i < n; i++){
            lucro = (venda[i] - custo[i]);
            porcentagem = (lucro / custo[i]) * 100;
            if (porcentagem < 10.0){
                lucroMenos10 += 1;

            }else if (porcentagem >= 10 && porcentagem <= 20){
                lucroEntre10e20 += 1;

            }else{
                lucroMaior20 += 1;
            }

            valorTotalCompra += custo[i];
            valorTotalVenda += venda[i];
        }

        System.out.println("Lucro abaixo de 10%: " + lucroMenos10);
        System.out.println("Lucro entre 10% e 20%: " + lucroEntre10e20);
        System.out.println("Lucro Acima de 20%: " + lucroMaior20);

        System.out.printf("Valor total de compra: %.2f%n" , valorTotalCompra);
        System.out.printf("Valor total de venda: %.2f%n" , valorTotalVenda);
        System.out.printf("Lucro Total: %.2f" , (valorTotalVenda - valorTotalCompra));


        sc.close();
    }
}
