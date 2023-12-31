package pooconmenu;

import java.util.Scanner;

public class Pooconmenu {

    static profesor misMaestros[] = new profesor[2];
    static int contador = 0;

    public static void main(String[] args) {

        int op = 0;

        Scanner entrada = new Scanner(System.in);

        while (op != 3) {

            System.out.println(" Menu ");

            System.out.println("1. Crear profesor");

            System.out.println("2. Ver profesores");

            System.out.println("3. ver profesor profesor");

            System.out.println("4. Salir");

            System.out.println("Ingrese el numero de opcion");

            op = entrada.nextInt();

            if (op == 1) {

                crearProfesor();

            } else if (op == 2) {

                System.out.println("-----------Los datos son----------");

            } else if (op == 3) {

                System.out.println("----------Programa finalizado----------");

            } else {

                System.out.println("Opcion incorrecta");

            }

        }

    }

    static public void crearProfesor() {

        if (contador >= 2) {

            System.out.println("---------------->la memoria esta llena");

        } else {

            Scanner teclado = new Scanner(System.in);

            System.out.println("----------Nuevo profesor-----------");

            System.out.println("Ingrese nombre del profesor");

            String nombre = teclado.nextLine();

            System.out.println("Ingrese la especialidad del profesor");

            String materia = teclado.nextLine();

            misMaestros[contador] = new profesor(nombre, materia);

            System.out.println("Dato almacenado");

            contador++;

        }

    }

    static public void verTodos() {

        for (int i = 0; i < contador; i++) {

            System.out.println("Nombre: " + misMaestros[i].verNombre());

            System.out.println("Materia:" + misMaestros[i].verMateria());

            System.out.println("#######################################");

        }

    }

}
