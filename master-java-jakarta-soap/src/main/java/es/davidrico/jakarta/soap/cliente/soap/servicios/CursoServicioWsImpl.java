package es.davidrico.jakarta.soap.cliente.soap.servicios;

import es.davidrico.jakarta.soap.cliente.soap.modelos.Curso;
import es.davidrico.jakarta.soap.cliente.soap.repositorios.CursoRepository;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@Stateless
@WebService(endpointInterface = "org.aguzman.webapp.jaxws.services.CursoServicioWs")
public class CursoServicioWsImpl implements CursoServicioWs {

    @Inject
    private CursoRepository repository;

    @WebMethod
    @Override
    public List<Curso> listar() {
        return repository.listar();
    }

    @Override
    @WebMethod
    public Curso guardar(Curso curso) {
        return repository.guardar(curso);
    }
}
