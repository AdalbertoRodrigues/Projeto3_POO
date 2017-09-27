/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.oo;


/**
 *
 * @author Bruno
 */
public class Cliente {
    private String nome;
    private int cpf;
    private String rg;
    private String email;
    private int telefone;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public boolean validarCPF(){
        String cpf = Long.toString(this.cpf);
        int j=0,  dig1 = 0, dig2 =0;
        int[] n = new int[11];        
        try{
        
            if(cpf.equals("11111111111") || cpf.equals("22222222222")
            || cpf.equals("33333333333") || cpf.equals("44444444444")|| cpf.equals("55555555555")
            || cpf.equals("66666666666") || cpf.equals("77777777777")|| cpf.equals("88888888888")
            || cpf.equals("99999999999")){

                System.out.println("CPF inválido");
                return false;
                
            }else{
                //segmentando os digitos do cpf
                for(int i =0;i<cpf.length();i++){
                    n[i] = Integer.parseInt(cpf.substring(i, i+1));
                }

                //validar o primeiro digito do cpf

                for(int i =10;i>=2;i--){
                    dig1 = dig1+ (n[j] *i);
                    j = j+1;
                }
                dig1 = dig1*10 % 11;
                if(dig1 == 10) dig1=0; //regra de validação

                System.out.println("Primeiro digito: "+dig1);
                dig2=0;
                j=0;
                
                //validar segundo dígito
                for(int i =11;i>=2;i--){
                    dig2 = dig2+ (n[j] *i);
                    j = j+1;
                }
                dig2 = dig2*10 % 11;
                System.out.println("Segundo dígito: " + dig2);

                if(dig1 == n[9] && dig2 == n[10]){
                    System.out.println("CPF válido");
                    return true;
                    
                }else{
                    System.out.println("CPF inválido");
                    return false;
                }
            }
            }catch(Exception ex){
            System.out.println("Houve um erro durante a validação");
            return false;
        }
    }
}
