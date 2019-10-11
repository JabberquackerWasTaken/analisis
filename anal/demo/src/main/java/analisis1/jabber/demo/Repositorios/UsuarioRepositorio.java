package analisis1.jabber.demo.Repositorios;

import java.io.Serializable;
import java.util.List;

import analisis1.jabber.demo.Entidades.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repositoriousuario")
public interface UsuarioRepositorio extends JpaRepository<Usuario, Serializable>{

    public abstract Usuario findById(long id);

    public abstract List<Usuario> findAll();

}
