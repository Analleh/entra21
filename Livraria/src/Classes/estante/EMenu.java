package Classes.estante;

import org.jetbrains.annotations.Nullable;

public enum EMenu implements IMenu {
    SAIR(0, "Sair"),
    ADICIONAR_ITEM(1, "Adicionar item a estante"),
    BUSCAR_ITEM(2, "Buscar item"),
    REMOVER_ITEM(3, "Remover item da estante"),
    MOSTRAR_ITENS(4, "Mostar itens na estante"),
    ADICIONAR_ESTANTE(5,"Adicionar estante");
    //ORGANIZAR_ESTANTE(6, "Organizar estante");

    private int valorOpcao;
    private String descricao;
    EMenu(int valor, String descricao) {
        valorOpcao = valor;
        this.descricao = descricao;
    }
    /**
     * retorna uma opção de menu de acordo com o que vier no parâmetro
     * @param escolha = inteiro referente ao valor da opção do menu
     * @return A opção do menu escolhida ou null
     */

    public static @Nullable EMenu getByValorOpcao(int escolha) {
        for (EMenu e : EMenu.values()) {
            if (e.getValorOpcao() == escolha) {
                return e;
            }
        }
        return null;
    }

    public int getValorOpcao() {
        return this.valorOpcao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setValorOpcao(int valorOpcao) {
        this.valorOpcao = valorOpcao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
// javaDoc - @Override , @Nullable , @NotNull , @Contract
// para "excluir" uma annotation - @Deprecated
// Generics - private T[ ] itens - vai receber o que for informado na tipagem (tipo generico) - public class Arraylist<T> extends
