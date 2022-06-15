package br.com.etecia.mybooks;

public class Books {
    private String titulo;
    private String categorai;
    private String descrição;
    private int miniatura;

    //criando os contrutores ALT+INSERT

    public Books() {
    }

    public Books(String titulo, String categorai, String descrição, int miniatura) {
        this.titulo = titulo;
        this.categorai = categorai;
        this.descrição = descrição;
        this.miniatura = miniatura;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategorai() {
        return categorai;
    }

    public String getDescrição() {
        return descrição;
    }

    public int getMiniatura() {
        return miniatura;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public void setCategorai(String categorai) {
        this.categorai = categorai;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public void setMiniatura(int miniatura) {
        this.miniatura = miniatura;
    }
}
