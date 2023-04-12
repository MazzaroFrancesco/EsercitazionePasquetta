public class Main {
    public static Cliente creaProdotto(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dai il nome prodotto quantita e prezzo al kg");
        String nome=sc.nextLine();
        int quantita=sc.nextInt();
        int prezzoalKG=sc.nextInt();
        
        return new Prodotto(nome,quantita,prezzoalKG);
    }
     public static Cliente creaPartecipante(Prodotti lista){
        Scanner sc=new Scanner(System.in);
        Prodotto lista[] = lista.getarray();
        System.out.println("Dai il nome,cognome e il prodotto che porta");
        String nome=sc.nextLine();
        String cognome=sc.nextLine();
        System.out.println("quanti prodotti deve portare"+nome); 
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
        String Pr=sc.nextLine();    
        if(Pr==lista[i]){
            Prodotto prodotto[i]=Pr;
        }
        }
        return new Partecipante(nome,cognome,prodotto[]);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int scelta;
        do{
            System.out.println("Premi 0 per uscire,     ");
            scelta=sc.nextInt();
            if(scelta==1){
                
                int numero=sc.nextInt();
            
            }else if(scelta==2){
                System.out.println("quanti  partecipanti vuoi aggiungere "); 
               int n=sc.nextInt();
               listapartecipanti P=new listapartecipanti(n);
               for(int i=0;n>=i;i++){
                    P[i]=creaPartecipante();
               }

            }else if(scelta==3){
                              
            }else if(scelta==4){
                             
            }
        }while(scelta!=0);
    }
}