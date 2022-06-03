package classes.pedidos;

import classes.lanches.*;

public class Pedido {

    private Lanche[] lanches = new Lanche[10];

    public void imprimirComanda(){


        for(Lanche l : this.getLanches()){ // for it
            if(l != null){

                if (l instanceof MiniPizza){
                    MiniPizza mp = (MiniPizza)l; // variavel para guardar a conversão em mini pizza
                    System.out.println("......................................");
                    System.out.println("==="+mp.getTipo()+" - " +mp.getSabor() + "===");
                    if (mp.isBordaRecheada()){
                        System.out.println("-- COM BORDA RECHEADA: " +mp.getSaborBorda().toUpperCase()+ " --");

                    }
                    if(l instanceof Pizza){
                        System.out.println("Tamanho: " + ((Pizza)l).getTamanho());
                    }
                }
                else{
                    System.out.println("......................................");
                    System.out.println("==="+l.getTipo()+"===");
                }
                if (l instanceof XBurguer){
                    if (((XBurguer)l).isAberto()){
                        System.out.println("-- LANCHE ABERTO --");
                    }
                }
                System.out.printf("Valor: R$%.2f\n" , l.getValor());
                System.out.println("INGREDIENTES--------------");
                for (String ingrediente : l.getIngredientes()){
                    if(ingrediente != null){
                        System.out.println(ingrediente);
                    }
                }
                if (l instanceof Sanduiche){
                    Sanduiche s = (Sanduiche)l;
                    if(s.getAdicionais()[0] != null){
                        System.out.println("-ADICIONAIS-");
                        for (String adicional : s.getAdicionais()){ // percorre a matriz  sem levar em consideração a posição
                            if(adicional != null){
                                System.out.println(adicional);
                            }
                        }
                    }
                }
            }
        }
        System.out.println("---------------------------------");
        System.out.printf("Valor total do pedido: R$%.2f\n" , this.calcularValorTotal());
        System.out.println("---------------------------------");
    }
    public double calcularValorTotal(){
        double vlrtotal = 0;
      for (Lanche l : this.getLanches()){
          if(l != null) {
              vlrtotal += l.getValor();
          }
      }
        return vlrtotal;
    }

    public void adicionarLanche(Lanche lanche){
        for (int i = 0;i < 10; i++){
            if (this.lanches[i] == null){
                this.lanches[i] = lanche;
                break;
            }
        }
    }
    public Lanche[] getLanches(){
        return this.lanches;
    }
}
// Agregação - relacionamento tem um. e o objeto composto apenas usa ou tem conhecimento da existência do(s)
//objeto(s) componente(s) os objetos componentes podem existir sem o agregado e vice-versa.

// Composição - relacionamento é parte. Forma de associação em que o objeto composto é responsável pela existência dos componentes
//O componente não tem sentido fora da composição.

// Herança - é um

// métodos ficam dentro da classe, não dentro de outros métodos