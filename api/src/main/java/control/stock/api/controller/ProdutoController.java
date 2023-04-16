package control.stock.api.controller;

import control.stock.api.entities.Produto;
import control.stock.api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> findAll(){
        List<Produto> listarProdutos = repository.findAll();
        return listarProdutos;
    }

    @PostMapping
    public Produto inserirProduto(@RequestBody Produto produto){
        Produto inserir = repository.save(produto);
        return inserir;
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Produto finById(@PathVariable Long id){
        Produto buscarProdutoPorId = repository.findById(id).get();
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
