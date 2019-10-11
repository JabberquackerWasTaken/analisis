package analisis1.jabber.demo.Servicios;

import java.util.List;

import analisis1.jabber.demo.Entidades.Consulta;
import analisis1.jabber.demo.Repositorios.ConsultaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("servicioConsulta")
public class ConsultaServicio{

    @Autowired
    @Qualifier("repositorioConsulta")
    private ConsultaRepositorio repositorio;

    public boolean crear(Consulta Consulta){
        try{
            repositorio.save(Consulta);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean actualizar(Consulta Consulta){
        try{
            repositorio.save(Consulta);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean borrar(long Number){
        try{
            Consulta Consulta = repositorio.findById(Number);
            repositorio.delete(Consulta);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public Consulta obtenerporId(long Number){
        return repositorio.findById(Number);
    }

    public List<Consulta> findByUser(long id){
        return repositorio.findByUser(id);
    }
}
