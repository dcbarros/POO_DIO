package models;

public class Curso extends Conteudo{

    private Integer cargaHoraria;

    public Curso(String titulo, String descricao, Integer cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public Double calcularXP() {
        return XP_PADRAO * this.cargaHoraria;
    }

    @Override
    public String toString() {
        return String.format("""
            Curso:{
                Título: %s
                Descrição: %s
                Carga Horária: %d horas
            }
        """,
        this.getTitulo(),
        this.getDescricao(),
        this.cargaHoraria);
    }
    
}
