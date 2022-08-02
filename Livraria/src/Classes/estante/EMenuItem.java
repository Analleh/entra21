package Classes.estante;

import Classes.itens.Item;

import java.util.Scanner;

public enum EMenuItem implements IMenu {
    VOLTAR(0, "Voltar"),
    AVALIAR_ITEM(1, "Avaliar Item"),
    VER_AVALIACOES(2, "Ver avaliações"),
    MOSTRAR_DETALHES(3, "Mostrar detalhes");

    private int valorOpcao;
    private String descricao;
    EMenuItem(int valor, String descricao) {
        valorOpcao = valor;
        this.descricao = descricao;
    }
    public static EMenuItem getByValorOpcao(int escolha) {
        for (EMenuItem e : EMenuItem.values()) {
            if (e.getValorOpcao() == escolha) {
                return e;
            }
        }
        throw new RuntimeException();
    }

    public int getValorOpcao() {
        return valorOpcao;
    }

    public void setValorOpcao(int valorOpcao) {
        this.valorOpcao = valorOpcao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
