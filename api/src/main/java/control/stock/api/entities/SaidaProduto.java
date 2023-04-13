package control.stock.api.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_saidaProdutos")
public class SaidaProduto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Produto produto;
    @Column(nullable = false)
    private Integer quantidade;
    @Column(nullable = false)
    private LocalDateTime dataSaida;

    public SaidaProduto(){
    }

    public SaidaProduto(Long id, Produto produto, Integer quantidade, LocalDateTime dataSaida) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.dataSaida = dataSaida;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDateTime getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDateTime dataSaida) {
        this.dataSaida = dataSaida;
    }
}
