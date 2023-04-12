/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author studente
 */
public class Partecipanti {
    public String nome;
    public String cognome;
    
    public Partecipanti(String nome,String cognome){
        setNome (nome);
        setCognome (cognome);
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setCognome(String cognome){
        this.cognome=cognome;
    }
    
    public String getNome (){
        return nome;
    }
    public String getCognome (){
        return cognome;
    }
}
