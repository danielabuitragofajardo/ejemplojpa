@Entity
@Table (name = "usuario" )
public class Usuario {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	@column (name ="nombre",nullable= false)
	private String nombre;
	@Column(name = "email", unique = true, nullable = false)
	private String email;
	
	public String getNombre() {
	    return nombre;
	}

	public void setNombre(String nombre) {
	    this.nombre = nombre;
	}

	public String getEmail() {
	    return email;
	}

	public void setEmail(String email) {
	    this.email = email;
	}
	

}
