package analisis1.jabber.demo.Entidades;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name="Usuario")
@Entity
public class Usuario{
    @Id
    @GenericGenerator(name="incrementusuario", strategy="increment")
    @GeneratedValue(generator="incrementusuario")
    @Column(name="id")
    long id;

    @Column(name="Name")
    String nombre;

    @Column(name="Mail")
    String mail;

    @Column(name="Number")
    String number;

    @OneToMany(mappedBy = "Usuario")
    private Set<Consulta> Consultas;

    public Usuario(){

    }

    public Usuario(long id, String name, String mail,String number, Set<Consulta> Consultas) {
        this.id = id;
        this.nombre = name;
        this.mail = mail;
        this.number=number;
        this.Consultas = Consultas;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.nombre;
    }

    public void setName(String name) {
        this.nombre = name;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public Set<Consulta> getConsultas() {
        return this.Consultas;
    }

    public void setConsultas(Set<Consulta> Consultas) {
        this.Consultas = Consultas;
    }

}
