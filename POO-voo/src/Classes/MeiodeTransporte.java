package Classes;

public interface  MeiodeTransporte {

   boolean  verificaOcupação(String assento);
   int quantidadeLivre();
   void mostrarAssento();
   Assento getAssento (String assentos);

}
