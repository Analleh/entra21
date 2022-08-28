package Classes.avaliacao;

import java.time.LocalDateTime;

public class Avalicao {

    LocalDateTime dataAvaliação = LocalDateTime .now();

    private double rating;
    private String nome;
    private String feedback;

    //getters e setters

    public void setRating(double rating) {
        this.rating = rating;
    }
    public double getRating() {
        return rating;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    public String getFeedback() {
        return feedback;
    }

    public LocalDateTime getDataAvaliação() {
        return dataAvaliação;
    }

    public void setDataAvaliação(LocalDateTime dataAvaliação) {
        this.dataAvaliação = dataAvaliação;
    }
}
