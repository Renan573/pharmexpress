package com.pharmexpressgroup.pharmexpress.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmexpressgroup.pharmexpress.repository.ProdutoRepository;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired private ProdutoRepository repo;

    public List<Produto> listAll() {
        return (List<Produto>) repo.findAll();
    }
}
