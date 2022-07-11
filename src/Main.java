package src;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {

    String NombreArchivo;







        String user;
        static String usur1="Kevin";
        static String usur2="Jose";
        static String usur3="Jorge";

        int contra;
        static int contra1=5002;
        static int contra2=1234;
        static int contra3=5006;

        int op;

         double dinero1=100;
         double dinero2=100;
         double dinero3=100;

        double deposito;
        double retiro;


        public void main(String args[]) {

            try{

                String filePath= "registro.txt";
                FileWriter fw=new FileWriter(filePath, true);
                String lineToAppend ="";
                fw.write(lineToAppend);


            Scanner teclado = new Scanner(System.in);

            Usuarios usuario = new Usuarios(usur1, usur2, usur3);
            Contraseña contraseña = new Contraseña(contra1, contra2, contra3);

            System.out.println("Ingrese su nombre de usuario: ");
            String user = teclado.next();

            if (user == usur1) {

                System.out.println("Ingrese su contraseña: ");
                int contra = teclado.nextInt();

                if (contra == contra1) {

                    System.out.println("1.- Retirar");
                    System.out.println("2.- Depositar");
                    System.out.println("3.- Salir");

                    System.out.printf("Seleccione una opcion:");
                    int op = teclado.nextInt();

                    switch (op) {
                        case 1:
                            System.out.println("Cuanto desea retirar? ");
                            double retiro = teclado.nextDouble();

                            System.out.println("Su retiro fue hecho con exito");
                            fw.write("Se retiro dinero de la cuenta 1: "+ retiro);



                            break;
                        case 2:
                            System.out.println("Cuanto desea depositar: ");
                            double deposito = teclado.nextDouble();

                            System.out.println("Su deposito fue hecho con exito");
                            fw.write("Se deposito dinero en la cuenta 1: "+deposito);
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Solo numeros del 1 al 3");


                    }


                } else {
                    System.out.printf("Ingreso mal de contraseña, verifique el archivo readme");
                }


            } else if (user == usur2) {


                System.out.println("Ingrese su contraseña: ");
                int contra = teclado.nextInt();

                if (contra == contra2) {

                    System.out.println("1.- Retirar");
                    System.out.println("2.- Depositar");
                    System.out.println("3.- Salir");

                    System.out.printf("Seleccione una opcion:");
                    int op = teclado.nextInt();

                    switch (op) {
                        case 1:
                            System.out.println("Cuanto desea retirar? ");
                            double retiro = teclado.nextDouble();

                            System.out.println("Su retiro fue hecho con exito");
                            fw.write("Se retiro dinero de la cuenta 2: "+ retiro);

                            break;
                        case 2:
                            System.out.println("Cuanto desea depositar: ");
                            double deposito = teclado.nextDouble();

                            System.out.println("Su deposito fue hecho con exito");
                            fw.write("Se deposito dinero en la cuenta 2: "+deposito);
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Solo numeros del 1 al 3");


                    }


                } else {
                    System.out.printf("Ingreso mal de contraseña, verifique el archivo readme");
                }


            } else if (user == usur3) {

                System.out.println("Ingrese su contraseña: ");
                int contra = teclado.nextInt();

                if (contra == contra3) {

                    System.out.println("1.- Retirar");
                    System.out.println("2.- Depositar");
                    System.out.println("3.- Salir");

                    System.out.printf("Seleccione una opcion:");
                    int op = teclado.nextInt();

                    switch (op) {
                        case 1:
                            System.out.println("Cuanto desea retirar? ");
                            double retiro = teclado.nextDouble();

                            System.out.println("Su retiro fue hecho con exito");
                            fw.write("Se retiro dinero de la cuenta 3: "+ retiro);

                            break;
                        case 2:
                            System.out.println("Cuanto desea depositar: ");
                            double deposito = teclado.nextDouble();

                            System.out.println("Su deposito fue hecho con exito");
                            fw.write("Se deposito dinero en la cuenta 3: "+deposito);
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Solo numeros del 1 al 3");


                    }


                } else {
                    System.out.printf("Ingreso mal de contraseña, verifique el archivo readme");
                }


            } else {
                System.out.println("Ingreso mal el usuario, verifique el archivo readme");
            }

        } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }

}
