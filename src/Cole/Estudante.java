/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cole;

/**
 *
 * @author agonzalezgonzalez
 */
public class Estudante extends Persoa{
    String nomeCole, nivel;

    public Estudante(String nomeCole, String nivel, String nome, String direccion) {
        super(nome, direccion);
        this.nomeCole = nomeCole;
        this.nivel = nivel;
    }


    public void setNomeCole(String nomeCole) {
        this.nomeCole = nomeCole;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNomeCole() {
        return nomeCole;
    }

    public String getNivel() {
        return nivel;
    }

    public String getNome() {
        return nome;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "estudante: "+super.toString()+" nomeCole: "+nomeCole+" nivel: "+nivel; //To change body of generated methods, choose Tools | Templates.
    }

    
   
}
