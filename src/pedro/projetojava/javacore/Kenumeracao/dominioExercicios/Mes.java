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


    private static final String verao = "Verão";
    private static final String outono = "Outono";
    private static final String inverno = "Inverno";
    private static final String primavera = "Primavera";



    public static String getVerao() {
        return verao;
    }

    public static String getOutono() {
        return outono;
    }

    public static String getInverno() {
        return inverno;
    }

    public static String getPrimavera() {
        return primavera;
    }

    public abstract String estacoes();
}
