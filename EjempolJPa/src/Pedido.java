import java.awt.List;

@Entity
public class Pedido<Cliente> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "cliente_id", nullable = false)
	private  String cliente;
	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
	private List items;
	
	public Cliente getCliente() {
	    return cliente;
	}

	public void setCliente(Cliente cliente) {
	    this.cliente = cliente;
	}

	public List<Item> getItems() {
	    return items;
	}

	public void setItems(List<Item> items) {
	    this.items = items;
	}
	EntityManager em = emf.createEntityManager();
	EntityTransaction tx = em.getTransaction();
	tx.begin();
	try {
	Usuario usuario = new Usuario();
	usuario.setNombre("Pedro");
	usuario.setEmail("pedro@mail.com");
	em.persist(usuario);
	tx.commit();
	} catch (Exception e) {
	tx.rollback();
	} finally {
	em.close();
	}
}
