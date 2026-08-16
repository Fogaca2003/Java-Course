import java.util.Scanner;

public class _18_Interesting_functions_for_Strings {
    public static void main(String[] args){
        String original = "abcde FGHIJ ABC abc DEFG   ";

        String s01 = original.toLowerCase(); // letras minusculas
        String s02 = original.toUpperCase(); // letras maiusculas
        String s03 = original.trim(); // elimina espaços do lado da string
        String s04 = original.substring(2); // pega os caracteres a partida da posicao que coloquei entre parenteses
        String s05 = original.substring(2 , 9); // aqui comeca a partir do primeiro numero e termina no outro numero
        String s06 = original.replace('a' , 'x'); // troca o primeiro caracterer pelo segundo
        String s07 = original.replace("abc" , "xy"); // troca de strings

        int i = original.indexOf("bc"); // vai mostra o local/numero da posicao do primeiro bc
        int j = original.lastIndexOf("bc"); // vai mostra o local/numero da posicao do ultimo bc

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2,9): -" + s05 + "-");
        System.out.println("replace('a' , 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of : " + j);


        String s = "potato apple lemon";

        String[] vect = s.split(" "); // separador por espaco nesse caso
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];
    }
}
