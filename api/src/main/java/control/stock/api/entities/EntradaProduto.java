package control.stock.api.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_entrada_produtos")
public class EntradaProduto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Produto produto;
    @Column(nullable = false)
    private LocalDateTime dataEntrada;
    @Column(nullable = false)
    private Double precoUnitario;
    @Column(nullable = false)
    private  Integer quantidade;

    public EntradaProduto(){
    }

    public EntradaProduto(Long id, Produto produto, LocalDateTime dataEntrada, Double precoUnitario, Integer quantidade) {
        this.id = id;
        this.produto = produto;
        this.dataEntrada = dataEntrada;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
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

    public LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDateTime dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
