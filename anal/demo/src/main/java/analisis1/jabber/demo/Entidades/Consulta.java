package analisis1.jabber.demo.Entidades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name="Consultas")
@Entity
public class Consulta{
    @Id
    @GenericGenerator(name="incrementconsulta", strategy="increment")
    @GeneratedValue(generator="incrementconsulta")
    @Column(name="number")
    long number;

    @Column(name="id")
    long id;

    @Column(name="problema")
    String problema;

    @Column(name="desc")
    String desc;

    @Column(name="Date")
    Date Date;
    
    public Consulta(){

    }

    public Consulta(long number, long id, String problema, String desc, Date Date) {
        this.number= number;
        this.id = id;
        this.problema = problema;
        this.desc = desc;
        this.Date = Date;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNumber() {
        return this.number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getProblema() {
        return this.problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getDate() {
        return this.Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }


}
