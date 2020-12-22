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
public class CicloCompleto_Aula09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p[] = new Pessoa[3];
        Livro l[] = new Livro[4];
        
        p[0] = new Pessoa("Maria", 14, "F");
        p[1] = new Pessoa("João", 18, "M");
        p[2] = new Pessoa(" Ana", 11, "F");
        
        l[0] = new Livro("Pequeno Principe", "Antoine de Saint-Exupéry", 120, p[0]);
        l[1] = new Livro("Caixa de passáros", "Josh Malerman", 340, p[1]);
        l[2] = new Livro("Para todos que ja amei", "Jenny Han", 250, p[2]);
        
        l[0].abrir();
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
    }   
    
}
