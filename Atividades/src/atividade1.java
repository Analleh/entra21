import java.util.Scanner;


public class atividade1 {

    public static void main(String[] args) {
        exer18();


    }

    public static void exer1() {
        int a = 10;
        int b = 20;
        int c;
        System.out.println("A = " + a);
        System.out.println("B = " + b);


        c = b;
        b = a;
        a = c;

        System.out.println("A = " + c);
        System.out.println("B = " + b);

    }

    public static void exer2() {

        int num;
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira um número inteiro?:");
        num = ler.nextInt();
        num = --num;
        System.out.println("O antecessor do valor inserido é:" + num);


    }

    public static void exer3() {
        double a, b;
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira a altura do retângulo:");
        a = ler.nextDouble();
        System.out.println("Insira a base do Retângulo");
        b = ler.nextDouble();

        double area = a * b;
        double per = (2 * a) + (2 * b);

        System.out.println(" A área do retângulo é: " + area);
        System.out.println("O perímetro do retângulo é: " + per);

    }

    public static void exer4() {
        int idade, ano, mes, dias;
        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor insira sua idade (ano, mês e dias):");
        System.out.println("Anos:");
        ano = ler.nextInt();
        System.out.println("Meses:");
        mes = ler.nextInt();
        System.out.println("Dias:");
        dias = ler.nextInt();

        ano = ano * 365;
        mes = mes * 30;
        idade = ano + mes + dias;

        System.out.println("Sua idade em dias é:" + idade);

    }

    public static void exer5() {
        int elei, nulos, bran, vali;
        double porN, porB, porV;
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o número total de eleitores:");
        elei = ler.nextInt();
        System.out.println("Insira o número de votos nulos:");
        nulos = ler.nextInt();
        System.out.println("Insira o número de votos brancos:");
        bran = ler.nextInt();

        vali = elei - (bran + nulos);
        System.out.println("O número total de votos válidos é: " + vali);

        porN = (nulos * 100.0) / elei;
        porB = (bran * 100.0) / elei;
        porV = (vali * 100.0) / elei;

        System.out.println(porV + "% da população votou.");
        System.out.println(porN + "% dos votos foram nulos");
        System.out.println(porB + "% dos votos foram brancos");

    }

    public static void exer6() {

        double sal, per;
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o seu salário atual:");
        sal = ler.nextDouble();
        System.out.println("Insira o percentual de reajuste:");
        per = ler.nextDouble();

        per = (per * sal) / 100;
        sal = sal + per;
        System.out.printf("Seu novo salário é: R$%.2f",sal);
    }

    public static void exer7() {

        double fab, car;
        double dist = 28;
        double imp = 45;

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o custo de fábrica do carro:");
        fab = ler.nextDouble();
        dist = (dist * fab) / 100;
        imp = (imp * fab) / 100;
        car = fab + imp + dist;

        System.out.printf("Valor de fábrica: R$%.2f" , fab);
        System.out.printf("Valor de 28% do distribuidor: R$%.2f",dist);
        System.out.printf("Valor de 45% de impostos: R$%.2f",imp);
        System.out.printf("O valor final do carro para o consumidor: R$%.2f",car);
        /*

        */
    }

    public static void exer8() {
        int numCar;
        double vendas, sal, valorCar, comiCar;
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o seu salário fixo:");
        sal = ler.nextDouble();
        System.out.println("Insira o valor total de suas vendas:");
        vendas = ler.nextDouble();
        System.out.println("Insira a quantidade de carros vendidos:");
        numCar = ler.nextInt();
        System.out.println("Insira o valor recebido por carro vendido:");
        valorCar = ler.nextDouble();

        vendas = (vendas * 5) / 100;
        comiCar = numCar * valorCar;
        sal = sal + vendas + comiCar;


        System.out.printf("O salário final do vendedor é: R$%.2f" , sal);
    }

    public static void exer9() {

        double gF, gC;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a temperatura em Fahrenheit:");
        gF = ler.nextDouble();
        gC = 5 * (gF - 32) / 9;
        System.out.println("A temperatura em graus celcius é: " + gC + "º");
    }

    public static void exer10() {

        double n1, n2, n3, media;
        Scanner ler = new Scanner(System.in);

        System.out.println("informe a primeira nota:");
        n1 = ler.nextDouble();
        System.out.println("informe a segunda nota:");
        n2 = ler.nextDouble();
        System.out.println("informe a terceira nota:");
        n3 = ler.nextDouble();

        media = (n1 * 2) + (n2 * 3) + (n3 * 5);
        media = media / 10;
        System.out.println("A média final é: " + media);
    }

    public static void exer11() {
        Scanner ler = new Scanner(System.in);
        int num;
        System.out.println("Insira um número inteiro:");
        num = ler.nextInt();
        if (num > 10) {

            System.out.println("É maior que 10!");
        } else if (num == 10) {

            System.out.println("É igual a 10!");
        } else {

            System.out.println("Não é maior que 10!");
        }

    }

    public static void exer12() {
        Scanner ler = new Scanner(System.in);
        int num;
        System.out.println("Insira um número:");
        num = ler.nextInt();
        if (num >= 0) {

            System.out.println("O número inserido é positivo");
        } else {

            System.out.println("O número inserido é negativo");
        }


    }

    public static void exer13() {

        Scanner ler = new Scanner(System.in);
        int qtd;
        double compra;
        System.out.println("Informe a quantidade de maçãs compradas: ");
        qtd = ler.nextInt();

        if (qtd >= 12) {
            compra = qtd * 1;
            System.out.println("O valor total da compra foi: R$" + qtd);

        } else {
            compra = qtd * 1.3;
            System.out.println("O valor total da compra foi: R$" + compra);
        }

    }

    public static void exer14() {

        Scanner ler = new Scanner(System.in);
        int ano, nasci, voto;

        System.out.println("Informe o ano atual:");
        ano = ler.nextInt();
        System.out.println("Informe o ano do seu nascimento");
        nasci = ler.nextInt();
        voto = ano - nasci;
        System.out.println("Sua idade: " + voto);
        if (voto >= 16) {
            System.out.println("Você poderá votar este ano!");
        } else {
            System.out.println("Você não poderá votar este ano!");
        }
    }

    public static void exer15() {
        Scanner ler = new Scanner(System.in);
        double var1, var2;
        System.out.println("Informe um número");
        var1 = ler.nextDouble();
        System.out.println("Informe um  segundo número");
        var2 = ler.nextDouble();
        if (var1 > var2) {
            System.out.println("O número " + var1 + " é maior");

        } else if (var2 > var1) {

            System.out.println("O número " + var2 + " é maior");
        } else {
            System.out.println("Os números informados são iguais");
        }

    }

    public static void exer16() {

        Scanner ler = new Scanner(System.in);
        double var1, var2;
        System.out.println("Informe um número");
        var1 = ler.nextDouble();
        System.out.println("Informe um  segundo número");
        var2 = ler.nextDouble();
        if (var1 > var2) {
            System.out.println("A ordem crescente dos números é: " + var1 + " -> " + var2);

        } else if (var2 > var1) {

            System.out.println("A ordem crescente dos números é: " + var2 + " -> " + var1);
        } else {
            System.out.println("Os números informados são iguais");
        }

    }

    public static void exer17() {

        Scanner ler = new Scanner(System.in);
        int inicio, fim, hora = 0;

        System.out.println("Insira a hora (sem os minutos) do início da partida:");
        inicio = ler.nextInt();
        System.out.println("Insira a hora (sem os minutos) do final da partida:");
        fim = ler.nextInt();
        if (fim < inicio) {

            hora = (24 - inicio) + fim;
        } else if (fim > inicio) {

                hora = fim - inicio;

        } else if (fim == inicio) {

            hora = 24;
        }

        System.out.println("O total de horas jogadas foram: " + hora);


    }

    public static void exer18() {

        Scanner ler = new Scanner(System.in);
        double  valor1, valor2, horaExtra, sal,aux;
        int hora;
        System.out.println("Informe quantas horas você trabalhou no mês:");
        hora = ler.nextInt();
        System.out.println("Informe o valor das horas: ");
        valor1 = ler.nextDouble();


        if(hora > 200){

            horaExtra = hora - 200;
            valor2 = (valor1 * 50)/100;
            valor2 = valor2 + valor1;
            aux = (hora - horaExtra) * valor1;
            horaExtra = horaExtra * valor2;
            sal = aux + horaExtra;
            System.out.printf("O salário final é: R$%.2f" , sal);

        } else  {

            aux = hora * valor1;
            sal = aux;
            System.out.printf("O salário final é: R$%.2f" , sal);

        }


    }

    public static void exer19(){

        Scanner ler = new Scanner(System.in);
        String nome;
        double altura, peso;
        String sexo;


        System.out.println("Informe seu nome: ");
        nome = ler.nextLine();
        System.out.println("Informe sua altura: ");
        altura = ler.nextDouble();
        System.out.println("Informe seu sexo (m,f)");
        ler.nextLine();
        sexo = ler.nextLine();


        if (sexo.equals("m")){

            peso = (72.7 * altura) - 58;
            System.out.println( nome + ", seu peso ideal é: " + peso);

        }
        else if (sexo.equals("f")){

            peso = (62.1 * altura) - 44.7;
            System.out.println( nome + ", seu peso ideal é: " + peso);
        }
        else {
            System.out.println("Caracter inválido!");
        }

    }

    public static void exer20(){

        Scanner ler = new Scanner(System.in);
        double salFixo,salTotal ,vendas, comi1, comi2;
        System.out.println("Informe seu salário atual: ");
        salFixo = ler.nextDouble();
        System.out.println("Informe o valor das suas vendas: ");
        vendas = ler.nextDouble();

        if(vendas <= 1500){

            comi1 = (vendas * 3)/100;
            salTotal = salFixo + comi1;
            System.out.printf("Seu salário é: R$%.2f", salTotal);

        }
        else {

           comi1 = 1500;
           comi2 = vendas - 1500;
           comi1 = (comi1 * 3)/100;
           comi2 = (comi2 * 5)/100;
           salTotal = salFixo + comi1 + comi2;
           System.out.printf("Seu salário é: R$%.2f", salTotal);
        }




    }
    public static void exer21(){
        Scanner ler = new Scanner(System.in);
        int conta;
        double saldo,saldoAtual, deb, cred;
        System.out.println("Insira o número da conta sem pontos: ");
        conta = ler.nextInt();
        System.out.println("Insira o saldo da conta: ");
        saldo = ler.nextDouble();
        System.out.println("Insira o valor do débito da conta: ");
        deb = ler.nextDouble();
        System.out.println("Insira o valor do crédito da conta: ");
        cred = ler.nextDouble();

        saldoAtual = saldo - deb + cred;
        if (saldoAtual >= 0){

            System.out.println("Saldo atual: " + saldoAtual);
            System.out.println("Saldo positivo");

        }
        else {

            System.out.println("Saldo atual: " + saldoAtual);
            System.out.println("Saldo negativo");
        }

    }

    public static void exer22(){

        Scanner ler = new Scanner(System.in);
        int qtdAtual, qtdMaxima,qtdMinima;
        double qtdMedia;
        System.out.println("Insira a quantidade atual do estoque:");
        qtdAtual = ler.nextInt();
        System.out.println("Insira a quantidade máxima do estoque:");
        qtdMaxima = ler.nextInt();
        System.out.println("Insira a quantidade mínima do estoque:");
        qtdMinima = ler.nextInt();

        qtdMedia = (qtdMaxima + qtdMinima)/2;

        if (qtdAtual >= qtdMedia){

            System.out.println("Quantidade em estoque: " + qtdAtual);
            System.out.println("Quantidade média: " + qtdMedia);
            System.out.println("Não efutuar compra");
        }
        else {

            System.out.println("Quantidade em estoque: " + qtdAtual);
            System.out.println("Quantidade média: " + qtdMedia);
            System.out.println("Efetuar compra");
        }




    }
}







