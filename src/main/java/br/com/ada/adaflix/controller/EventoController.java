package br.com.ada.adaflix.controller;

import br.com.ada.adaflix.model.Evento;
import br.com.ada.adaflix.repository.EventoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventoController {

    private final EventoRepository eventoRepository;

    public EventoController(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    // @RequestMapping -> GET
    @PostMapping("/eventos") // -> POST -> /eventos
    public Evento salvar (@RequestBody Evento evento) {
        return evento;
    }

}
