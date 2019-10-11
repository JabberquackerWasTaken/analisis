package analisis1.jabber.demo.Repositorios;

import java.io.Serializable;
import java.util.List;

import analisis1.jabber.demo.Entidades.Consulta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repositorioConsulta")
public interface ConsultaRepositorio extends JpaRepository<Consulta, Serializable> {

    public abstract Consulta findById(long Number);

    public abstract List<Consulta> findByUser(long id);

}
