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
public class Persoa {
    String nome,direccion;

    public Persoa(String nome, String direccion) {
        this.nome = nome;
        this.direccion = direccion;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNome() {
        return nome;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return  "nome: " + nome + ", direccion: " + direccion ;
    }
    
    
}
