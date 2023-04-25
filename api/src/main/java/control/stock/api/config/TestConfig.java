package control.stock.api.config;

import control.stock.api.entities.Produto;
import control.stock.api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public void run(String... args) throws Exception {
        Produto produto1 = new Produto(null,"caderno","caderno 10 materias",1,200,null);
        Produto produto2 = new Produto(null,"lapiseira","lapiseira pentel preta",1,150,null);
        Produto produto3 = new Produto(null,"cola","cola bastao",1,100,null);

        produtoRepository.saveAll(Arrays.asList(produto1,produto2,produto3));
    }
}
