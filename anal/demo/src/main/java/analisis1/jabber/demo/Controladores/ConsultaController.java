package analisis1.jabber.demo.Controladores;

import java.util.List;

import javax.validation.Valid;

import analisis1.jabber.demo.Entidades.Consulta;
import analisis1.jabber.demo.Servicios.ConsultaServicio;

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
@RequestMapping("/v1/consulta")
public class ConsultaController{
    @Autowired
    @Qualifier("servicioconsulta")
    ConsultaServicio servicio;

    @GetMapping("/Consulta")
    public Consulta obtenerConsulta(@RequestParam(name="Number", required=true) long id){
        return servicio.obtenerporId(id);
    }

    @PostMapping("/Consulta")
    public boolean agregarConsulta(@RequestBody @Valid Consulta Consulta){
        return servicio.crear(Consulta);
    }

    @PutMapping("/Consulta")
    public boolean actualizarConsulta(@RequestBody @Valid Consulta Consulta){
        return servicio.actualizar(Consulta);
    }

    @DeleteMapping("/Consulta/{Number}")
    public boolean borrarConsulta(@PathVariable("Number") long id){
        return servicio.borrar(id);
    }

    @GetMapping("/Consulta")
    public List<Consulta> findByUser(@RequestParam(name="id", required = true) long id){
        return servicio.findByUser(id);
    }

}
