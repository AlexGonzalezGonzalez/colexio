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
public class Ensinante extends Persoa {
    String materia;

    public Ensinante(String materia, String nome, String direccion) {
        super(nome, direccion);
        this.materia = materia;
    }

 
    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMateria() {
        return materia;
    }

    public String getNome() {
        return nome;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return super.toString()+" materia: "+materia; //To change body of generated methods, choose Tools | Templates.
    }

   
}
