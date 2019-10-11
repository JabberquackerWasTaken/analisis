package analisis1.jabber.demo.Controladores;

import java.util.List;

import javax.validation.Valid;

import analisis1.jabber.demo.Entidades.Usuario;
import analisis1.jabber.demo.Servicios.UsuarioServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/Usuario")
public class UsuarioController{
    @Autowired
    @Qualifier("serviciousuario")
    UsuarioServicio servicio;

    @GetMapping("/Usuario")
    public Usuario obtenerUsuario(@RequestParam(name="id", required=true) long id){
        return servicio.obtenerporId(id);
    }

    @PostMapping("/Usuario")
    public boolean agregarUsuario(@RequestBody @Valid Usuario user){
        return servicio.crear(user);
    }

    @PutMapping("/Usuario")
    public boolean actualizarUsuario(@RequestBody @Valid Usuario user){
        return servicio.actualizar(user);
    }

    @DeleteMapping("/Usuario/{id}")
    public boolean borrarUsuario(@PathVariable("id") long id){
        return servicio.borrar(id);
    }

    @GetMapping("/getAll")
    public List<Usuario> getAllUsuario(){
        return servicio.obtenerAll();
    }

}
