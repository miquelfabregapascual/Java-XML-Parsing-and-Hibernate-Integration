/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Profe
 */

@Entity
@Table(name = "partida")

public class partida implements Serializable{ //Serializable es una clase ubicada en el paquete Java. io. Serializable, la cual no cuenta con ningún método, por lo que es una clase que sirve solamente para especificar que todo el estado de un objeto instanciado podrá ser escrito o enviado en la red como una trama de bytes.
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    
    @Basic
    @Column(name = "idjug1", nullable = false)        
    private int idjug1;
    
    @Basic
    @Column(name = "idjug2", nullable = false)   
    private int idjug2;
    
    @Basic
    @Column(name = "resultat")   
    private String resultat;
     
    @Basic
    @Column(name = "tipus")   
    private String tipus;

    public partida(int idjug1, int idjug2, String resultat, String tipus) {
        this.idjug1 = idjug1;
        this.idjug2 = idjug2;
        this.resultat = resultat;
        this.tipus = tipus;
    }

    
    public partida() {
    }

    public int getId() {
        return id;
    }

   

    public int getIdjug1() {
        return idjug1;
    }

    public void setIdjug1(int idjug1) {
        this.idjug1 = idjug1;
    }

    public int getIdjug2() {
        return idjug2;
    }

    public void setIdjug2(int idjug2) {
        this.idjug2 = idjug2;
    }

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }
     public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
}

