package Seguros;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Cliente> clientes;
    private ArrayList<Vendedor> vendedores;

    public Empresa() {
        this.clientes = new ArrayList<>();
        this.vendedores = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void agregarVendedor(Vendedor vendedor) {
        this.vendedores.add(vendedor);
    }

    public Cliente buscarCliente(String rut) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getRut().equals(rut)) {
                return cliente;
            }
        }
        return null;
    }

    public void despedirVendedor(String rut) {
        Vendedor vendedorParaDespedir = null;
        for (Vendedor vendedor : this.vendedores) {
            if (vendedor.getRut().equals(rut)) {
                vendedorParaDespedir = vendedor;
                break;
            }
        }
        if (vendedorParaDespedir != null) {
            this.vendedores.remove(vendedorParaDespedir);
        }
    }

    public Seguro asegurarCliente(Cliente cliente, Vendedor vendedor, String fechaInicio, String fechaTermino) {
        return new Seguro(cliente, vendedor, fechaInicio, fechaTermino);
    }

    public ArrayList<Cliente> buscarClientesTerceraEdad() {
        ArrayList<Cliente> clientesTerceraEdad = new ArrayList<>();
        // Implementación
        return clientesTerceraEdad;
    }
}
