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
public class Livro implements Publicacao{

    public Livro(String titulo, String autor, int TotalPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.TotalPag = TotalPag;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }
   
    private String titulo;
    private String autor;
    private int TotalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPag() {
        return TotalPag;
    }
    public void setTotalPag(int TotalPag) {
        this.TotalPag = TotalPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    
     public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    
    //metodo 
    public String detalhes() {
        return "-----Livro-----" + 
                "titulo: " + titulo +
                "\n autor:" + autor +
                "\n TotalPag: " + TotalPag +
                "\n pagAtual: " + pagAtual + 
                "\n aberto: " + aberto + 
                "\n nome do leitor: " + leitor.getNome() + 
                "\n idade: " + leitor.getIdade() + 
                "\n sexo: " + leitor.getSexo();
    }
    
    //métodos da interface
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
    
}
