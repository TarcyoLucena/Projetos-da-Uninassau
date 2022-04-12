public class App {
    public static void main(String args[]) {
        Usuario user = new Usuario("Tarcyo", "abc", "120021");
        Calculadora calc = new Calculadora(user);
        
        boolean retorno = user.login("abc", "120021");
        System.out.println(calc.soma(5,8));
        System.out.println(calc.subtrai(27,15));
        System.out.println(calc.divide(12,3));
        System.out.println(calc.multi(5,6));
        System.out.println(calc.funcao(9, 6, 3));
        System.out.println(calc.potencia(3,5));
    }
    
    
}