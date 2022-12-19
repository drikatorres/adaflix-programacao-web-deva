package br.com.ada.adaflix.service;

import br.com.ada.adaflix.model.Evento;
import br.com.ada.adaflix.repository.EventoRepository;
import org.springframework.stereotype.Service;

@Service
public class EventoService {
    private final EventoRepository eventoRepository;

    public EventoService(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    public Evento salvar (Evento evento) {
        //Realizar validações
        return eventoRepository.save(evento);
    }

}
