package cl.adasoft.departamento.gerencia.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;


@Data 
@Entity
@Table(name="users")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min = 10, max = 100, message = "The name cannot exceed 100 characters")
	@Column(name="username")
	private String username;

	@NotBlank
	@Column(name="password")
	private String password;
	
	@NotBlank
	@Column(name="type")
	private Long type;

	@NotBlank
	@Column(name="rut")
	private Long rut;

	@Column(name="direccion")
	private String direccion;
	
	@Column(name="email")
	@Email
	private String email;

	@NotBlank
	@Column(name="telefono")
	private Long telefono;

	@Column(name="nombre")
	private String nombre;

	@Column(name="apellido")
	private String apellido;

	@Column(name="estado")
	private Long estado;

	@Column(name="fecha_nacimiento")
	private String fecha_nacimiento;

	@Column(name="fecha_ingreso")
	private String fecha_ingreso;

	@Column(name="fecha_salida")
	private String fecha_salida;
	
	@Column(name="patente")
	private String patente;
}
