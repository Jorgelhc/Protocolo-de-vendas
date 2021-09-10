package com.learning.protocoloDeVendas.service;


import com.learning.protocoloDeVendas.model.Produto;
import com.learning.protocoloDeVendas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public Produto save(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> findById(Long idProduto) throws Exception {
        return produtoRepository.findById(idProduto);
    }

    public Produto updateProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public void deleteById(Long idProduto) throws Exception {
        produtoRepository.deleteById(idProduto);
    }
}
