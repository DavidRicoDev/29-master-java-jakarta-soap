package es.davidrico.jakarta.soap.cliente.soap.servicios;

import es.davidrico.jakarta.soap.cliente.soap.modelos.Curso;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public interface CursoServicioWs {
    List<Curso> listar();
    Curso guardar(Curso curso);
}
