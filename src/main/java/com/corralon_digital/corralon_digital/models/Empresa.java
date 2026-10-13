public class Empresa {
    @Column (name = "id_empresa")
    @GeneratedValue (strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id_empresa;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "direccion")
    private String direccion;
    @Column (name = "telefono")
    private String telefono;
    @Column (name = "email")
    private String email;

    public Empresa() {
    }

    public Empresa(Long id_empresa, String nombre, String direccion, String telefono, String email) {
        this.id_empresa = id_empresa;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public Long getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(Long id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }