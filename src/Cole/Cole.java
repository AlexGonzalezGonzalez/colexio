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
public class Cole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*codifica un programa e fai o correspondente diagrama de clases
        do feito seguinte:
        1º: Temos unha clase estudante cos atributos nome, direccion,nomeCole e nivel.
        2º: clase ensinante: con nome direccion e materia.
        3º clase estudanteInternacional con nome direccion, nomeCole, nivel e pais.
        En cada clase debe levar constructor, getter e setter e toString.
        Na clase principal crea un obxecto de tipo estudante, ensinante e estudante internacional e visualiza
        todos os atributos.
        Cambialle o nivel ao estudante e cambialle a materia ao ensinante.Visualizao.
         */

        Estudante est = new Estudante("Daniel Castelao", "Ciclo superior", "Alex", "Vigo");
        Ensinante ens = new Ensinante("Mate", "Paco", "Vigo");
        EstudanteInternacional estint = new EstudanteInternacional("Alemania", "Daniel Castelao", "Ciclo Superior", "Javier", "Vigo");
        Persoa p = new Persoa("Lalo", "Vigo");

        System.out.println(est.toString());
        System.out.println(estint.toString());
        System.out.println(ens.toString());


    }
}
