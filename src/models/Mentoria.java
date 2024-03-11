package models;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;
    
    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public Double calcularXP() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return String.format("""
            Mentoria:{
                Título: %s
                Descrição: %s
                data: %d/%d/%d
            }
        """,
        this.getTitulo(),
        this.getDescricao(),
        this.data.getDayOfMonth(),
        this.data.getMonth().getValue(),
        this.data.getYear());
    }

    
}
