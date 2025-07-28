package pedro.projetojava.javacore.Kenumeracao.dominioExercicios;

public class Pedido {
    private String id;
    private String descricao;
    private StatusPedido status;

    public Pedido(String id, String descricao) {
        this.id = id;
        this.descricao = descricao;

    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id='" + id + '\'' +
                ", descricao='" + descricao + '\'' +
                ", status=" + status +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }
}
