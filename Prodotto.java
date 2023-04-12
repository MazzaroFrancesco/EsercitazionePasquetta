/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author studente
 */
public class Prodotto {
        private String nome;
        private float quantità;
        private float prezzoalKg;
        
           public Prodotto(String nome,float quantita,float prezzoalKg){
        setNome(nome);
        setQuantita(quantità);
        setPrezzoalKg(prezzoalKg);
        
    }
    public Prodotto(Prodotto p){
        setNome(p.getNome());
        setQuantita(p.getQuantità());
        setPrezzoalKg(p.getPrezzoalKg());
        
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public float getQuantità(){
        return quantità;
    }
     public void setQuantita(float quantità){
        this.quantità=quantità;
    }
    public float getPrezzoalKg(){
        return prezzoalKg;
    }
     public void setPrezzoalKg(float prezzoalKg){

        this.prezzoalKg=prezzoalKg;
    }
   
    
}