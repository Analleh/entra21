package Classes.estante;

import java.util.Scanner;

public enum EMenuItem {
    SAIR(0, "Voltar"),
    AVALIAR_ITEM(1, "Avaliar Item"),
    VER_AVALIACOES(2, "Ver avaliações");

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
        return null;
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
