package pedro.projetojava.javacore.Kenumeracao.dominioExercicios;

public enum Mes {
    JANEIRO{
        @Override
        public String estacoes(){
            return verao;
        }
    },
   FEVEREIRO{
       @Override
       public String estacoes(){
           return verao;
       }
   },
    MARCO{
        @Override
        public String estacoes(){
            return outono;
        }
    },
    ABRIL{
        @Override
        public String estacoes(){
            return outono;
        }
    },
    MAIO{
        @Override
        public String estacoes(){
            return outono;
        }
    },
    JUNHO{
        @Override
        public String estacoes(){
            return inverno;
        }
    },
    JULHO{
        @Override
        public String estacoes(){
            return inverno;
        }
    },
    AGOSTO{
        @Override
        public String estacoes(){
            return inverno;
        }
    },
    SETEMBRO{
        @Override
        public String estacoes(){
            return inverno;
        }
    },
    OUTUBRO{
        @Override
        public String estacoes(){
            return primavera;
        }
    },
    NOVEMBRO{
        @Override
        public String estacoes(){
            return primavera;
        }
    },
    DEZEMBRO{
        @Override
        public String estacoes(){
            return verao;
        }
    };


    private static String verao = "Verão";
    private static String outono = "Outono";
    private static String inverno = "Inverno";
    private static String primavera = "Primavera";



    public static String getVerao() {
        return verao;
    }

    public static void setVerao(String verao) {
        Mes.verao = verao;
    }

    public static String getOutono() {
        return outono;
    }

    public static void setOutono(String outono) {
        Mes.outono = outono;
    }

    public static String getInverno() {
        return inverno;
    }

    public static void setInverno(String inverno) {
        Mes.inverno = inverno;
    }

    public static String getPrimavera() {
        return primavera;
    }

    public static void setPrimavera(String primavera) {
        Mes.primavera = primavera;
    }

    public abstract String estacoes();
}
