package Objetos;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Autos")
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "modelo", nullable = false)
    private String modelo;

    @Column(name = "patente", nullable = false)
    private String patente;
    @OneToMany(mappedBy = "auto", cascade = CascadeType.ALL)
    private List<Multa> multas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public List<Multa> getMultas() {
        return multas;
    }

    public void setMultas(List<Multa> multas) {
        this.multas = multas;
    }
}
