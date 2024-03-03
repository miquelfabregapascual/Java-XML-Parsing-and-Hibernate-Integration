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
@Table(name = "jugador")

public class jugador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Basic
    @Column(name = "nom", length = 50, nullable = true)
    private String nom;

    @Basic
    @Column(name = "copes", nullable = true)
    private int copes;

    @Basic
    @Column(name = "gemes", nullable = true)
    private int gemes;

    @Basic
    @Column(name = "clan", length = 50, nullable = true)
    private String clan;

    @Basic
    @Column(name = "nivell", nullable = true)
    private int nivell;

    @Basic
    @Column(name = "oro", nullable = true)
    private int oro;


    public jugador() {
    }

    public jugador(String nom, int copes, int gemes, String clan, int nivell, int oro) {

        this.nom = nom;
        this.copes = copes;
        this.gemes = gemes;
        this.clan = clan;
        this.nivell = nivell;
        this.oro = oro;
   
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCopes() {
        return copes;
    }

    public void setCopes(int copes) {
        this.copes = copes;
    }

    public int getGemes() {
        return gemes;
    }

    public void setGemes(int gemes) {
        this.gemes = gemes;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public int getNivell() {
        return nivell;
    }

    public void setNivell(int nivell) {
        this.nivell = nivell;
    }

    public int getOro() {
        return oro;
    }

    public void setOr(int oro) {
        this.oro = oro;
    }

    public int getidjug2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getResultat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getTipus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getidjug1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
