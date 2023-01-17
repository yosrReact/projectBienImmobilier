public class Classe_standard {

    private int code_classe;
    private int type_bien;
    private int prix_maximum;

    public Classe_standard(int code_classe, int type_bien, int prix_maximum) {  
        this.code_classe = code_classe;
        this.type_bien = type_bien;
        this.prix_maximum = prix_maximum;
    }
    
    public  void set_code_classe(int code_classe) {  
        this.code_classe = code_classe ;
    }

    public  void set_type_bien(int type_bien) {  
        this.type_bien = type_bien ;
    }

    public  void set_prix_maximum(int prix_maximum) {  
        this.prix_maximum = prix_maximum ;
    } 

    public int code_classe() {  
        return  this.code_classe;
    } 

    public int type_bien() {  
        return  this.type_bien;
    } 

    public int prix_maximum() {  
        return  this.prix_maximum;
    } 
  
}