package Listas;

import Reservas.cCliente; 
import java.util.ArrayList;
import java.util.List;

public class cListaClientes {
    
    private List<cCliente> clientes;

    public cListaClientes() {
        this.clientes = new ArrayList<>();
        
        // Cliente 1
        this.clientes.add(new cCliente("Ana Torres", "78945612A", "600111222", "ana.t@email.com", "CL001", "456100001111", "anatorres", "ana123"));
        
        // Cliente 2
        this.clientes.add(new cCliente("Beto Ramirez", "74185296B", "600333444", "beto.r@email.com", "CL002", "456100002222", "betorami", "beto123"));
        
        // Cliente 3
        this.clientes.add(new cCliente("Carla Soto", "12300045C", "600555666", "carla.s@email.com", "CL003", "456100003333", "carlita", "carla123"));
        
        // Cliente 4
        this.clientes.add(new cCliente("David Lopez", "98765432D", "600777888", "david.l@email.com", "CL004", "456100004444", "davlopez", "david123"));
        
        // Cliente 5
        this.clientes.add(new cCliente("Elena Gomez", "45678912E", "600999000", "elena.g@email.com", "CL005", "456100005555", "elenago", "elena123"));
        
        // Cliente 6
        this.clientes.add(new cCliente("Felipe Cruz", "15975384F", "610111222", "felipe.c@email.com", "CL006", "456100006666", "felicruz", "felipe123"));
        
        // Cliente 7
        this.clientes.add(new cCliente("Gloria Perez", "25836914G", "610333444", "gloria.p@email.com", "CL007", "456100007777", "gloriap", "gloria123"));
        
        // Cliente 8
        this.clientes.add(new cCliente("Hector Ruiz", "36914725H", "610555666", "hector.r@email.com", "CL008", "456100008888", "hectorui", "hector123"));
        
        // Cliente 9
        this.clientes.add(new cCliente("Irene Salas", "14725836I", "610777888", "irene.s@email.com", "CL009", "456100009999", "irenes", "irene123"));
        
        // Cliente 10
        this.clientes.add(new cCliente("Javier Mena", "85296374J", "610999000", "javier.m@email.com", "CL010", "456100000000", "javierm", "javier123"));
    }

    public void agregarCliente(cCliente cliente) {
        this.clientes.add(cliente);
    }
    
    public List<cCliente> obtenerClientes() {
        return this.clientes;
    }
}