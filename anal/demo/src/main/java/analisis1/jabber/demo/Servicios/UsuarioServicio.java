package analisis1.jabber.demo.Servicios;

import java.util.List;

import analisis1.jabber.demo.Entidades.Usuario;
import analisis1.jabber.demo.Repositorios.UsuarioRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("serviciousuario")
public class UsuarioServicio{
    @Autowired
    @Qualifier("repositoriousuario")
    private UsuarioRepositorio repositorio;

    public boolean crear(Usuario user){
        try{
            repositorio.save(user);
            return true;
        } catch (Exception e){  
            return false;
        }
    }

    public boolean actualizar(Usuario user){
        try{
            repositorio.save(user);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean borrar(long id){
        try{
            Usuario usuario = repositorio.findById(id);
            repositorio.delete(usuario);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public Usuario obtenerporId(long id){
        return repositorio.findById(id);
    }

    public List<Usuario> obtenerAll(){
        return repositorio.findAll();
    }

}
