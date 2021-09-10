package com.learning.protocoloDeVendas.controller;


import com.learning.protocoloDeVendas.model.Produto;
import com.learning.protocoloDeVendas.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping
    public Produto createProduto(@RequestBody Produto produto) {
        return produtoService.save(produto);
    }

    @GetMapping
    public List<Produto> findAll() {
        return produtoService.findAll();
    }

    @GetMapping("/{idProduto}")
    public ResponseEntity<Produto> getProdutoById(@PathVariable("idProduto") Long idProduto) throws Exception {
        return ResponseEntity.ok(produtoService.findById(idProduto).orElseThrow(() -> new Exception("Produto não encontrado")));
    }

    @PutMapping
    public Produto updateProduto(@RequestBody Produto produto) {
        return produtoService.updateProduto(produto);
    }

    @DeleteMapping("/{idProduto}")
    public void deleteProduto(@PathVariable("idProduto") Long idProduto) throws Exception {
        produtoService.deleteById(idProduto);
    }
}

