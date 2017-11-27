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
public class EstudanteInternacional extends Estudante {
    String pais;

    public EstudanteInternacional(String pais, String nomeCole, String nivel, String nome, String direccion) {
        super(nomeCole, nivel, nome, direccion);
        this.pais = pais;
    }

  
    public void setPais(String pais) {
        this.pais = pais;
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

    public String getPais() {
        return pais;
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
        return super.toString()+" pais: "+pais; //To change body of generated methods, choose Tools | Templates.
    }
    
}
