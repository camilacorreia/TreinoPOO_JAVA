/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclocompleto_aula09;

/**
 *
 * @author camic
 */
public class Pessoa {

    //metodo construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    private String nome;
    private int idade;
    private String sexo;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        if(sexo == "F"){
            this.sexo = "Feminino";
        }else if(sexo == "M"){
            this.sexo = "Maculino";
        }
    }
    
    //metodo
    public void fazerAniversario(){
        
    }
    
}
