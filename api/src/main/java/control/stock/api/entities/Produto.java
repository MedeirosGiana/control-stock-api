package control.stock.api.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "tb_produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true)
    private String name;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private LocalDateTime criadoEm;
    @Column(nullable = false)
    private Integer quantidadeMin;
    @Column(nullable = false)
    private Integer quantidadeMax;

    public Produto(){
    }

    public Produto(Long id, String name, String descricao, LocalDateTime criadoEm, Integer quantidadeMin, Integer quantidadeMax) {
        this.id = id;
        this.name = name;
        this.descricao = descricao;
        this.criadoEm = LocalDateTime.now();
        this.quantidadeMin = quantidadeMin;
        this.quantidadeMax = quantidadeMax;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }

    public Integer getQuantidadeMin() {
        return quantidadeMin;
    }

    public void setQuantidadeMin(Integer quantidadeMin) {
        this.quantidadeMin = quantidadeMin;
    }

    public Integer getQuantidadeMax() {
        return quantidadeMax;
    }

    public void setQuantidadeMax(Integer quantidadeMax) {
        this.quantidadeMax = quantidadeMax;
    }
}
