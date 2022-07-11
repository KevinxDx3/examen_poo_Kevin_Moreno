package src;
import java.util.Scanner;
public class Main {



        String user;
        static String usur1="Kevin";
        static String usur2="Jose";
        static String usur3="Jorge";
        public static void main (String args []) {

            Scanner teclado=new Scanner(System.in);

            Usuarios usuario= new Usuarios(usur1,usur2,usur3);
            Contraseña contraseña= new Contraseña(5002,1234,5006);

            System.out.println("Ingrese su nombre de usuario: ");
            String user = teclado.next();

            if (user==usur1 || user==usur2 || user==usur3){



            }else{
                System.out.println("Usuario incorrecto Revise el archivo readme");
            }












    }

}
