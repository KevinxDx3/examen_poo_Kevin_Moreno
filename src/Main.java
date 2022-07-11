package src;
import java.util.Scanner;
public class Main {



        String user;
        static String usur1="Kevin";
        static String usur2="Jose";
        static String usur3="Jorge";

        int contra;
        static int contra1=5002;
        static int contra2=1234;
        static int contra3=5006;


        public static void main (String args []) {

            Scanner teclado=new Scanner(System.in);

            Usuarios usuario= new Usuarios(usur1,usur2,usur3);
            Contraseña contraseña= new Contraseña(contra1,contra2,contra3);

            System.out.println("Ingrese su nombre de usuario: ");
            String user = teclado.next();

            if (user==usur1 || user==usur2 || user==usur3){

                System.out.println("Ingrese la contraseña: ");
                int contra = teclado.nextInt();

                if (contra==contra1 || contra==contra2 || contra==contra3){

                    System.out.println("Desea ingresar o retirar dinero? ");
                    

                }else {
                    System.out.println("Contraseña mal ingresada, verifique en el archivo readme");
                }


            }else{
                System.out.println("Usuario incorrecto Revise el archivo readme");
            }



    }

}
