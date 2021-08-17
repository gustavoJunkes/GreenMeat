package model.entities.users;

// Falta validar cpf // cpf é um atributo repetido na classe Funcionario e Cliente

	import java.io.Serializable;
	import java.time.LocalDate;
	import java.util.ArrayList;
	import java.util.List;
    import javax.persistence.CascadeType;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.JoinTable;
	import javax.persistence.ManyToMany;
	import javax.persistence.OneToMany;
	import javax.persistence.Table;
	import model.entities.products.Pedido;
    import model.entities.users.information.Contato;
    import model.entities.users.information.Endereco;
    import model.entities.users.information.Localidade;


	@Entity
	@Table(name = "cliente")
	public class Cliente  extends PessoaFisica implements Serializable {

	 

	    private static final long serialVersionUID = 1L;

	 

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id_cliente")
	    private Long id;

	 

	    @Column(name = "nome_cliente", length = 25, nullable = true, unique = false)
	    private String nome;

	 

	    @Column(name = "cpf_cliente", length = 14, nullable = true, unique = true)
	    private String cpf;
	    
	    @Column(name = "nascimento_cliente", length = 10, nullable = true, unique = false)
	    private LocalDate dataDeNascimento;
	    
	    
	    @OneToMany(fetch = FetchType.LAZY,mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Pedido> pedidos = new ArrayList<Pedido>();

	 

	    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	    @JoinTable(name = "cliente_endereco", joinColumns = @JoinColumn(name = "id_cliente"), inverseJoinColumns = @JoinColumn(name = "id_endereco"))
	    private List<Endereco> enderecos = new ArrayList<Endereco>();
	    
	    public Cliente() {}

	 

	    public Cliente(String nome, String cpf,LocalDate dataDeNascimento) {
	        setNome(nome);
	        setCpf(cpf);
	        setDataDeNascimento(dataDeNascimento);
	        }

	    public Cliente(Long id,Localidade endereco, String login, String senha, Contato contato, String nome, String sobrenome,
				String CPF, LocalDate dataDeNascimento) {
			super(endereco, login, senha, contato, nome, sobrenome, CPF, dataDeNascimento);
	    }

	 

	    public Long getId() {
	        return id;
	    }

	 

	    public void setId(Long id) {
	        this.id = id;
	    }

	 

	    public String getNome() {
	        return nome;
	    }

	 

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	 

	    public String getCpf() {
	        return cpf;
	    }

	 

	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }
	    
	    public void setDataDeNascimento(LocalDate dataDeNascimento) {
	        this.dataDeNascimento=dataDeNascimento;
	    }
	        
	    public List<Pedido> getPedidos() {
	        return pedidos;
	    }

	 

	    public void adicionarPedido(Pedido pedido) {
	        this.pedidos.add(pedido);
	    }

	 

	    public List<Endereco> getEnderecos() {
	        return enderecos;
	    }

	 

	    public void adicionarEndereco(Endereco endereco) {
	        this.enderecos.add(endereco);
	    }
	}


