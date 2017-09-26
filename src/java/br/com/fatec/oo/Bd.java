package br.com.fatec.oo;

import java.util.ArrayList;

public class Bd {
    
    //Criando lista de contatos
    private static ArrayList<Fornecedor> fornecedores;
    private static ArrayList<Cliente> clientes;
    public static ArrayList<Fornecedor> getFornecedores () {
        if (fornecedores==null) {
            fornecedores = new ArrayList<>();
        }
        return fornecedores;
    }
    public static ArrayList<Cliente> getClientes () {
        if (clientes==null) {
            clientes = new ArrayList<>();
        }
        return clientes;
    }
}