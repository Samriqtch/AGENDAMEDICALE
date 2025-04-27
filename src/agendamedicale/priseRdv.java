/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendamedicale;

/**
 *
 * @author kloug
 */
import java.time.LocalDateTime;

public class priseRdv {
    private Patient patient;
    private Medecin medecin;
    private LocalDateTime dateHeure;

    public priseRdv(Patient patient, Medecin medecin, LocalDateTime dateHeure) {
        this.patient = patient;
        this.medecin = medecin;
        this.dateHeure = dateHeure;
    }

    public Patient getPatient() { return patient; }
    public Medecin getMedecin() { return medecin; }
    public LocalDateTime getDateHeure() { return dateHeure; }

    @Override
    public String toString() {
        return "RDV de " + patient + " avec " + medecin + " à " + dateHeure;
    }
}

