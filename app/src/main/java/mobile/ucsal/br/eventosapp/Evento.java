package mobile.ucsal.br.eventosapp;

public class Evento {

    private Integer _id;
    private String nome;
    private String horario;
    private String preco;
    private String imagem;
    private String local;
    private String data;
    private String descricao;


    public Evento() {

    }

    public Evento(Integer _id, String nome, String descricao, String horario, String preco, String local, String data) {
        this._id = _id;
        this.nome = nome;
        this.descricao = descricao;
        this.horario = horario;
        this.preco = preco;
        this.local = local;
        this.data = data;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
