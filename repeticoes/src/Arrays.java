import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
        System.out.println("Informe a quantidade de palavras que serão inseridas");
        int qtd = ler.nextInt();
        String[] palavras = new String[qtd];
        for (int i = 0;i < qtd; i++){

            System.out.println("Informe a palavra:");
            palavras[i] = ler.next();
        }
        String palavraFinal = "";
        for (int i = 0;i < palavras.length; i++){
            if (i == 0){
                palavraFinal += palavras[i];
            }
            else{
                palavraFinal += " , " + palavras[i];
            }
        }
        System.out.println(palavraFinal);

    }
}
