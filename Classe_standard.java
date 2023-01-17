public class Classe_standard {

    private int code_classe;
    private int type_bien;
    private int prix_maximum;

    public Classe_standard(int code_classe, int type_bien, int prix_maximum) {  
        this.code_classe = code_classe;
        this.type_bien = type_bien;
        this.prix_maximum = prix_maximum;
    }
    
    public  void setCodeClasse(int code_classe) {  
        this.code_classe = code_classe ;
    }

    public  void setTypeBien(int type_bien) {  
        this.type_bien = type_bien ;
    }

    public  void setPrixMaximum(int prix_maximum) {  
        this.prix_maximum = prix_maximum ;
    } 

    public int codeClasse() {  
        return  this.code_classe;
    } 

    public int typeBien() {  
        return  this.type_bien;
    } 

    public int prixMaximum() {  
        return  this.prix_maximum;
    } 
  
}