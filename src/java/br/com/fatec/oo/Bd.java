package br.com.fatec.oo;

import java.util.ArrayList;

public class Bd {
    
    //Criando lista de contatos
    private static ArrayList<Fornecedor> fornecedores;
    public static ArrayList<Fornecedor> getFornecedores () {
        if (fornecedores==null) {
            fornecedores = new ArrayList<>();
        }
        return fornecedores;
    }
}