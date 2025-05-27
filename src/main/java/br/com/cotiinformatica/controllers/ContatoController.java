
package br.com.cotiinformatica.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.entities.Contato;
import br.com.cotiinformatica.repositories.ContatosRepository;

@RestController
@RequestMapping("/api/contatos") 
public class ContatoController {

    @Autowired
    private ContatosRepository contatoRepository;

  
    @PostMapping
    public ResponseEntity<Contato> criar(@RequestBody Contato contato) {
        Contato novo = contatoRepository.save(contato);
        return ResponseEntity.ok(novo);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Contato> buscarPorId(@PathVariable("id") Integer id) {
        Optional<Contato> contato = contatoRepository.findById(id);
        return contato.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contato> atualizar(@PathVariable("id") Integer id, @RequestBody Contato contato) {
        if (!contatoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        contato.setIdContato(id);
        Contato atualizado = contatoRepository.save(contato);
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable("id") Integer id) {
        if (!contatoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        contatoRepository.deleteById(id);	
        return ResponseEntity.noContent().build();
    }
}
