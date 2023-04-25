package control.stock.api.resources;

import control.stock.api.entities.EntradaProduto;
import control.stock.api.entities.Produto;
import control.stock.api.repository.EntradaProdutoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class EntradaProdutoResource {

    private EntradaProdutoRepository repository;
    @PostMapping
    public EntradaProduto inserirProduto(@RequestBody EntradaProduto produto){
        EntradaProduto inserir = repository.save(produto);
        return inserir;
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public EntradaProduto finById(@PathVariable Long id){
        EntradaProduto buscarProdutoPorId = repository.findById(id).get();
        return buscarProdutoPorId;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarProduto(@PathVariable Long id) {
        return repository.findById(id)
                .map(record -> {
                    repository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
