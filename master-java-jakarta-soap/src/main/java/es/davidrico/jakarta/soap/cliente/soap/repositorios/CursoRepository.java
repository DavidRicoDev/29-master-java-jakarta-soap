package es.davidrico.jakarta.soap.cliente.soap.repositorios;

import es.davidrico.jakarta.soap.cliente.soap.modelos.Curso;

import java.util.List;

public interface CursoRepository {
    List<Curso> listar();
    Curso guardar(Curso curso);
}
