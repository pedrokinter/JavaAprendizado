package pedro.projetojava.aulas;

public class aula005condicionaisb {
    public static void main(String[] args) {
        int idade = 17;
        String categoria;
        if(idade < 15) {
            System.out.println("O Jovem está na categoria infantil");
        
        }else if (idade >= 15 || idade < 18){
            System.out.println("O Jovem está na categoria juvenil;");

        }else{
            System.out.println("o jovem esta na categoria adulto");
        }

        // codigo mais limp e melhorado;
        if (idade < 15){
            categoria = "Categoria infantil";
        }else if (idade >= 15 || idade < 18){
            categoria =  "Categoria juvenil";
        }else{
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}

