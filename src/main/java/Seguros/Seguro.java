package Seguros;

public class Seguro {
    private Cliente cliente;
    private Vendedor vendedor;
    private String fechaInicio;
    private String fechaTermino;

    public Seguro(Cliente cliente, Vendedor vendedor, String fechaInicio, String fechaTermino) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(String fechaTermino) {
        this.fechaTermino = fechaTermino;
    }
}
