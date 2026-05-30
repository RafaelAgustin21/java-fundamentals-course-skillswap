public class Main {
    public static void main(String[] args) {
        
        //Valores enteros
        int n1 = 10;
        int n2 = 5;

        //Operaciones con los valores numericos
        int suma = n1 + n2;
        int resta = n1 - n2;
        int multiplicacion = n1 * n2;
        int division = n1 / n2;
        int resto = n1 % n2;

        //Comparaciones booleanas entre valores numericos
        boolean mismoValor = suma == multiplicacion;
        boolean laSumeEs15 = suma == 15;
        boolean laRestaNoEs5 = resta != 5;
        boolean laSumaEs15YLaRestaNoEs5 = laSumeEs15 && laRestaNoEs5;
        boolean laSumaEs15OLaRestaNoEs5 = laSumeEs15 || laRestaNoEs5;
        boolean multiMayorQueSuma = multiplicacion > suma; //Tambien exitse >=
        boolean multiMenorQueSuma = multiplicacion < suma; //Tambien existe <=

        //Aplicación en Strings
        String s1 = "Prueba con";
        String s2 = "los strings";
        
        String testStrings = s1 + ' ' + s2;

        //Depuración en el sistema
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
        System.out.println(resto);
        System.out.println(testStrings);
        System.out.println(mismoValor);
        System.out.println(laSumeEs15);
        System.out.println(laRestaNoEs5);
        System.out.println(laSumaEs15YLaRestaNoEs5);
        System.out.println(laSumaEs15OLaRestaNoEs5);
        System.out.println(multiMayorQueSuma);
        System.out.println(multiMenorQueSuma);
    }
}
