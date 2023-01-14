package com.example.crudop.Model;

import jakarta.persistence.*;

@Entity//decorator che indica che questa classe deve essere mappata in tabella SQL
@Table(name = "persona")
public class Persona {


    public Persona() {

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public void setCognome(String cognome) {
        Cognome = cognome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSesso() {
        return Sesso;
    }

    public void setSesso(String sesso) {
        Sesso = sesso;
    }

    public String getAvatar() {
        return Avatar;
    }

    public void setAvatar(String avatar) {
        Avatar = avatar;
    }

    public String getMestiere() {
        return Mestiere;
    }

    public void setMestiere(String mestiere) {
        Mestiere = mestiere;
    }

    public long getId() {
        return Id;
    }

    public void setId (long id) {
        Id = id;
    }

    public Persona (long id, String nome, String cognome, String email, String sesso, String avatar, String mestiere) {
        Id = id;
        Nome = nome;
        Cognome = cognome;
        Email = email;
        Sesso = sesso;
        Avatar = avatar;
        Mestiere = mestiere;
    }
  @jakarta.persistence.Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)//indica che id deve essere autoincrement
    private long Id;
    private String Nome;
    private String Cognome;
    private String Email;
    private String Sesso;

    private String Avatar;

    private String Mestiere;

}
