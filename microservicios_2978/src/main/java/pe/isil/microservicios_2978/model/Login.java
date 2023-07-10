package pe.isil.microservicios_2978.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="login")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String contrasena;
}
