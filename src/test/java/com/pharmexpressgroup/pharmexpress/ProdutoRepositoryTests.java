package com.pharmexpressgroup.pharmexpress;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.pharmexpressgroup.pharmexpress.model.Produto;
import com.pharmexpressgroup.pharmexpress.repository.ProdutoRepository;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class ProdutoRepositoryTests {
    
    @Autowired private ProdutoRepository repo;

    @Test
    public void testAddNew() {
        Produto produto = new Produto();
        produto.setNome("Paracetamol");
        produto.setTipo("Remédio");
        produto.setDescricao("Remédio paracetamol");
        produto.setImage("/static/imagens/cardapio.png");
        produto.setPreco(100);
        produto.setCodigoBarras("LJHSKDJ25645S564A54");
        produto.setCodStatusProduto(true);

        Produto savedProduto = repo.save(produto);
        
        Assertions.assertThat(savedProduto).isNotNull();
        Assertions.assertThat(savedProduto.getId()).isGreaterThan(0);

    }

    @Test
    public void testListAll() {
        Iterable<Produto> produtos = repo.findAll();
        Assertions.assertThat(produtos).hasSizeGreaterThan(0);

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    @Test
    public void testUpdate() {
        Long produtoId = 1L;
        Optional<Produto> optionalProduto = repo.findById(produtoId);
        Produto produto = optionalProduto.get();
        produto.setNome("Benzetacil");
        repo.save(produto);

        Produto updatedProduto = repo.findById(produtoId).get();
        Assertions.assertThat(updatedProduto.getNome()).isEqualTo("Paracetamol");
    }

    @Test
    public void testGet() {
        Long produtoId = 1L;
        Optional<Produto> optionalProduto = repo.findById(produtoId);
        Assertions.assertThat(optionalProduto).isPresent();
        System.out.println(optionalProduto.get());
    }

    @Test
    public void testDelete() {
        Long produtoId = 2L;
        repo.deleteById(produtoId);
        
        Optional<Produto> optionalProduto = repo.findById(produtoId);
        Assertions.assertThat(optionalProduto).isNotPresent();
    }

}
