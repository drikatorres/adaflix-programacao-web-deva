package br.com.ada.adaflix.controller;

import br.com.ada.adaflix.model.Evento;
import br.com.ada.adaflix.repository.EventoRepository;
import br.com.ada.adaflix.service.EventoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventoController {
    private final EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    // @RequestMapping -> GET
    @PostMapping("/eventos") // -> POST -> /eventos
    public Evento salvar (@RequestBody Evento evento) {
        return evento;
    }

    @GetMapping
    public List<Evento> listar() {
        return eventoService.listar();
    }

    @GetMapping("/{id}")
    public Evento buscarPorId(@PathVariable Long id) {
        return eventoService.buscarPorId(id);
    }




}
