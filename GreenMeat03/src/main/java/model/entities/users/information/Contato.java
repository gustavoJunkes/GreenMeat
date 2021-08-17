package model.entities.users.information;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import model.entities.users.Cliente;
import model.exception.users.information.EmailInvalidException;
import model.exception.users.information.PhoneNumberInvalidException;

@Entity
@Table(name = "contato")
public class Contato implements Serializable {

 

    private static final long serialVersionUID = 1L;

 

    @Id
    @Column(name = "id_cliente")
    private Long id;

 

    @Column(name = "telefone_contato", length = 20, nullable = true, unique = true)
    private String telefone;

 

    @Column(name = "email_contato", length = 40, nullable = true, unique = true)
    private String email;

 

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "id_cliente")
	private Cliente cliente;





	
	public Contato(String email, String telefone) throws EmailInvalidException, PhoneNumberInvalidException {
		setEmail(email);
		setTelefone(telefone);
	}
	 public Contato(Long id, String telefone, String email) throws PhoneNumberInvalidException, EmailInvalidException {
	        setId(id);
	        setTelefone(telefone);
	        setEmail(email);
	    }

	 

	    public Long getId() {
	        return id;
	    }

	 

	    public void setId(Long id) {
	        this.id = id;
	    }
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailInvalidException {
		if (email.isEmpty())
			throw new EmailInvalidException("Campo nulo");
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) throws PhoneNumberInvalidException {
		if (telefone.isEmpty())
			throw new PhoneNumberInvalidException("Campo nulo");
		this.telefone = telefone;
	}
	 public Cliente getCliente() {
	        return cliente;
	    }

	 

	    public void setCliente(Cliente cliente) {
	        this.cliente = cliente;
	    }

}
