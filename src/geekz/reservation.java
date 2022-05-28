/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geekz;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author bouss
 */
public class reservation {

    private int idClient;
    //club
    //terrain
    private int idReservation;
    private String DateReservation;
    private int nombredeParticipant;
    private int prix;
    private Promotion prom;

    public reservation() {
    }

    public reservation(String DateReservation, int nombredeParticipant, int prix, Promotion prom) {

        this.DateReservation = DateReservation;
        this.nombredeParticipant = nombredeParticipant;
        this.prix = prix;
        this.prom = prom;
    }

    public Promotion getProm() {
        return prom;
    }

    public void setProm(Promotion prom) {
        this.prom = prom;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdClient() {
        return idClient;
    }

    public int getIdReservation() {
        return idReservation;
    }

    public int getNombredeParticipant() {
        return nombredeParticipant;
    }

    public int getPrix() {
        return prix;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public void setDateReservation(String DateReservation) {
        this.DateReservation = DateReservation;
    }

    public String getDateReservation() {
        return DateReservation;
    }

    public void setNombredeParticipant(int nombredeParticipant) {
        this.nombredeParticipant = nombredeParticipant;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "reservation{" + "idReservation=" + idReservation + ", DateReservation=" + DateReservation + ", nombredeParticipant=" + nombredeParticipant + ", prix=" + prix + '}';
    }

    public static int resTotalPrix(reservation r) {
        return r.getPrix()*r.getNombredeParticipant();
    }

}
