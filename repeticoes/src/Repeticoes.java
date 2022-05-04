

public class Repeticoes {
    public static void main(String[] args) {
        System.out.println(forbiddenLetter(new String[]{"abc", "def", "ghi"}, 'a'));
    }

    public static boolean forbiddenLetter(String[] palavras, char letraProibida) {
        //char letraProibida ='a';
        boolean achou = false;
        for (String palavra : palavras){
            for (int i = 0; i < palavra.length(); i ++){
                achou = palavra.charAt(i) == letraProibida;
                if (achou){
                    break;
                }

            }
            if (achou){
                break;
            }
        }
        return achou;

        /*
        if (achou) {
            System.out.println("Encontrou letra proibida");
        }
        else {
            System.out.println("Não econtrou letra proibida");
        }

         */
    }

}
