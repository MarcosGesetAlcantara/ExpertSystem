import Rule.*;

public class SistemaExperto {
    BooleanRuleBase basedereglas = new BooleanRuleBase("basedereglas");
    
    //Variables 
    RuleVariable piel;
    RuleVariable orejas;
    RuleVariable altura;
    RuleVariable pieAbil;
    RuleVariable barba;
    RuleVariable cabello;
    RuleVariable lugarDondeJuega;
    RuleVariable edad;
    RuleVariable tatuaje;
    RuleVariable posicion;
    
    RuleVariable resultadoPiel;
    RuleVariable resultadoOrejas;
    RuleVariable resultadoAltura;
    RuleVariable resultadoPieAbil;
    RuleVariable resultadoBarba;
    RuleVariable resultadoCabello;
    RuleVariable resultadoLugarDondeJuega;
    RuleVariable resultadoEdad;
    RuleVariable resultadoTatuaje;
    RuleVariable resuladoPosicion;
    
    
    String resultado="";
    
    public String ObtenerPiel(String piel) {
        basedeconocimiento();
        return resultado;
    }
    
    public String ObtenerOrejas(String resultadoCalzado, String pico) {
        basedeconocimiento();
        return resultado;
    }
    
    public String ObtenerAltura(String resultadoCalzado, String orejasRedondas) {
        basedeconocimiento();
        return resultado;
    }
     
    public String ObtenerPieAbil(String resultadoCalzado, String collar) {
        basedeconocimiento();
        return resultado;
    }
    
    public String ObtenerBarba(String resultadoCalzado, String collar) {
        basedeconocimiento();
        return resultado;
    }
    
    public String ObtenerCabello(String resultadoCalzado, String collar) {
        basedeconocimiento();
        return resultado;
    }
    
    public String ObtenerLugar(String resultadoCalzado, String collar) {
        basedeconocimiento();
        return resultado;
    }
      
    public String ObtenerEdad(String resultadoCalzado, String collar) {
        basedeconocimiento();
        return resultado;
    } 
    
    public String ObtenerTatuaje(String resultadoCalzado, String collar) {
        basedeconocimiento();
        return resultado;
    }
    
    public String ObtenerPosicion(String resultadoCalzado, String collar) {
        basedeconocimiento();
        return resultado;
    }
    
    //base del conocimiento
    public void basedeconocimiento() {
        piel = new RuleVariable(basedereglas,"");
        orejas = new RuleVariable(basedereglas,""); 
        altura = new RuleVariable(basedereglas,"");
        pieAbil = new RuleVariable(basedereglas,"");
        barba = new RuleVariable(basedereglas,"");
        cabello = new RuleVariable(basedereglas,"");
        lugarDondeJuega = new RuleVariable (basedereglas,"");
        edad = new RuleVariable (basedereglas,"");
        tatuaje = new RuleVariable (basedereglas,"");
        posicion = new RuleVariable (basedereglas,"");
        
        resultadoPiel = new RuleVariable(basedereglas,"");
        resultadoOrejas = new RuleVariable(basedereglas,"");
        resultadoAltura = new RuleVariable(basedereglas,"") ;
        resultadoPieAbil = new RuleVariable(basedereglas,"");
        resultadoBarba = new RuleVariable(basedereglas,"");
        resultadoCabello = new RuleVariable(basedereglas,"");
        resultadoLugarDondeJuega = new RuleVariable(basedereglas,"");
        resultadoEdad = new RuleVariable(basedereglas,"");
        resultadoTatuaje = new RuleVariable(basedereglas,"");
        resuladoPosicion = new RuleVariable(basedereglas,"");
        
        Condition igual = new Condition("=");
        
        
        //piel
        Rule regla1 = new Rule(basedereglas,"regla1", 
            new Clause[] {
                new Clause(piel,igual,"moreno")},
                new Clause(resultadoPiel,igual,"morena")
        );      
        
        Rule regla2 = new Rule(basedereglas,"regla2", 
            new Clause[] {
                new Clause(piel,igual,"blanco")},
                new Clause(resultadoPiel,igual,"blanca")
        );  
        
        Rule regla3 = new Rule(basedereglas,"regla3", 
            new Clause[] {
                new Clause(piel,igual,"negra")},
                new Clause(resultadoPiel,igual,"negra")
        );  
        
        ///orejas
        Rule regla4= new Rule(basedereglas,"regla4", 
            new Clause[] {
                new Clause(resultadoPiel,igual,"morena"),
                new Clause(orejas,igual,"grandes")},
                new Clause(resultadoOrejas,igual,"grandes")
        ); 
        
        Rule regla5= new Rule(basedereglas,"regla5", 
            new Clause[] {
                new Clause(resultadoPiel,igual,"morena"),
                new Clause(orejas,igual,"chicas")},
                new Clause(resultadoOrejas,igual,"chicas")
        );
        
        Rule regla6= new Rule(basedereglas,"regla6", 
            new Clause[] {
                new Clause(resultadoPiel,igual,"blanca"),
                new Clause(orejas,igual,"grandes")},
                new Clause(resultadoOrejas,igual,"grandes")
        );
        
        Rule regla7= new Rule(basedereglas,"regla7", 
            new Clause[] {
                new Clause(resultadoPiel,igual,"blanca"),
                new Clause(orejas,igual,"chicas")},
                new Clause(resultadoOrejas,igual,"chicas")
        );
        
        Rule regla8 = new Rule(basedereglas,"regla9", 
            new Clause[] {
                new Clause(resultadoPiel,igual,"negra"),
                new Clause(orejas,igual,"grandes")},
                new Clause(resultadoOrejas,igual,"grandes")
        );
        
        Rule regla9= new Rule(basedereglas,"regla9", 
            new Clause[] {
                new Clause(resultadoPiel,igual,"negra"),
                new Clause(orejas,igual,"chicas")},
                new Clause(resultadoOrejas,igual,"chicas")
        );
    }
}
