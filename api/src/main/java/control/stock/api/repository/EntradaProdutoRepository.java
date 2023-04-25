package control.stock.api.repository;

import control.stock.api.entities.EntradaProduto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntradaProdutoRepository extends JpaRepository<EntradaProduto, Long> {
}
