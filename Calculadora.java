public class Calculadora{
    private Usuario user;
    private String login = "abc";
    private String senha = "120021";
    
    public Calculadora(Usuario user){
        this.user = user;
    }
    
    public String soma(double a, double b){
        if (this.user.login(this.login, this.senha)){
            return "A soma é: "+(a+b);
        }else{
            return "O usuario não tem acesso!";

        }
    }
    public String subtrai(double a, double b){
        if (this.user.login(this.login, this.senha)){
            return "A subtração é: "+(a-b);
        }else{
            return "O usuario não tem acesso!";

        }
    }
    public String divide(double a, double b){
        if (this.user.login(this.login, this.senha)){
            return "A divisão é: "+(a/b);
        }else{
            return "O usuario não tem acesso!";

        }
    }
    public String multi(double a, double b){
        if (this.user.login(this.login, this.senha)){
            return "A multiplicação é: "+(a*b);
        }else{
            return "O usuario não tem acesso!";

        }
    }
    public String funcao(double a, double b, double x) {
        if (this.user.login(this.login, this.senha)) {
            return "A função é: " + ((a* x) + b);
        }else{
            return "O usuário não tem acesso!";
        }
    }
    public String potencia(double a, int p) {
        if (this.user.login(this.login, this.senha)) {
            return "A potencia é: " + Math.pow(a, p);
        }else{
            return "O usuário não tem acesso!";
        }
//        if(p == 2) {
//
//            return  x * x;
//        }else{
//            double result = 1;
//            int contador = 0;
//            while (contador != p) {
//                result = result * x;
//                contador++;
//            }
//            System.out.print("A potencia é: ");
//            return result;
//
//        }
    }
}