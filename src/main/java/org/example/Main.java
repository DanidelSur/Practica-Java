package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Persona{
        public String nombre;
        public float ingresos;
        public int autos;
        boolean conAntiguedadMenorA5years;
        public int inmuebles;
        public boolean embarcacion;
        public boolean aeronave;
        public boolean activoSoc;


}
public class Main {

    public static void main(String[] args) {

        List lista = new ArrayList();
        List listaPares = new ArrayList();
        List listaImpares = new ArrayList();
        List listaDescendete = new ArrayList();

        int a = 0;
        int b = 10;
        int c = 0;
        int d = 1;
        boolean parImpar = false ;
        while (a <= b) {
            //System.out.println(a);
            lista.add(a);
            a++;
        }
        System.out.println("Ejercicio A : Completado");
        System.out.println(lista);

        while (c <= b) {
            //System.out.println(a);
            listaPares.add(c);
            c = c + 2;
        }
        System.out.println("Ejercicio B : Completado");
        System.out.println(listaPares);

        while (d <= 10){
            listaImpares.add(d);
            d = d + 2;
        }

        System.out.println("Ejercicio C : Completado");
        if (parImpar){
            System.out.println(listaPares);
        }else {
            System.out.println(listaImpares);
        }

        for(var i = b ; i >= 0 ; i--){
            //System.out.println(i);
            listaDescendete.add(i);
        }

        System.out.println("Ejercicio 4 : Completado");
        System.out.println(listaDescendete);

        int ingresosMensuales = 489083;
        int maxVehiculos = 3;
        int maxInmuebles = 3;
        /*
        boolean antiguedadMenorA5 = true;
        boolean poseeEmbarcacion = true;
        boolean poseeAeronave = true;
        boolean activoSocietario = true;
        */

        Scanner tecl = new Scanner(System.in);

        Persona unaPersona = new Persona();
            //REGISTRE UNA PERSONA
           System.out.println("Ingrese un Nombre");
           unaPersona.nombre = tecl.nextLine();
           System.out.println("Ingrese Ingresos Mensuales");
           unaPersona.ingresos = tecl.nextInt();
           System.out.println("Ingrese Cantidad de Autos");
           unaPersona.autos = tecl.nextInt();
           System.out.println("Tienen una Antig??edad Menor a 5 a??os? \t Ingrese true o false");
           unaPersona.conAntiguedadMenorA5years = tecl.nextBoolean();
           System.out.println("Ingrese cantidad de Inmuebles");
           unaPersona.inmuebles = tecl.nextInt();

           System.out.println("Tiene Embarcaci??n? \t Ingrese true o False");
           unaPersona.embarcacion = tecl.nextBoolean();
           System.out.println("Tiene Aeronave? \t Ingrese true o false");
           unaPersona.aeronave = tecl.nextBoolean();
           System.out.println("Es titular de Activos Societarios?\t Ingrese true o false" );
           unaPersona.activoSoc = tecl.nextBoolean();


        if(unaPersona.ingresos>=ingresosMensuales){

            System.out.println("********************************************");

            System.out.println("Los ingresos mensuales superan la cifra de : $" + ingresosMensuales);

            System.out.println(unaPersona.nombre + " : Esta dentro del segmento de ingresos altos");

        } else if ((unaPersona.autos>=maxVehiculos)&&(unaPersona.conAntiguedadMenorA5years)){

            System.out.println("********************************************");

            System.out.println("Tiene 3 o m??s Veh??culos Modernos");

            System.out.println(unaPersona.nombre + " : Esta dentro del segmento de ingresos altos");

        } else if (unaPersona.inmuebles >= maxInmuebles){

            System.out.println("********************************************");

            System.out.println("Posee 3 o m??s inmuebles");

            System.out.println(unaPersona.nombre + " : Esta dentro del segmento de ingresos altos");

        } else if ((unaPersona.embarcacion)||(unaPersona.aeronave)||(unaPersona.activoSoc)){

            System.out.println("********************************************");

            System.out.println("Tiene embarcaci??n o Tiene aeronave o Es titular de activos societarios que demuestran una econom??a plena");

            System.out.println(unaPersona.nombre + " : Esta dentro del segmento de ingresos altos");

        } else {
            System.out.println("********************************************");

            System.out.println(unaPersona.nombre + " : Esta Fuera del Segmento de Ingresos Altos. Muchas gracias, Cu??dese! \t Siguiente...");

        }


        System.out.println("********************************************");
        System.out.println("La persona registrada se llama : " + unaPersona.nombre);
        System.out.println("Tiene ingresos mensuales de : $" + unaPersona.ingresos);
        System.out.println("Tiene : " + unaPersona.autos + " Auto/s");
        System.out.println("Tiene : " + unaPersona.inmuebles + " Inmueble/s") ;
        System.out.println("-----------");
        System.out.println("Tiene Embarcaci??n? : " + unaPersona.embarcacion);
        System.out.println("Tiene Aeronave? : " + unaPersona.aeronave);
        System.out.println("Tiene Capacidad de Econom??a Plena? : " + unaPersona.activoSoc);
        System.out.println("***************made**by**Chodilef*************");


    }
}

/*
1. Vamos a practicar operaciones b??sicas con n??meros

a. Utilizando la sentencia while, imprima todos los n??meros entre 2 variables ???a???y ???b???. Su c??digo puede arrancar (por ejemplo):int numeroInicio = 5; int numeroFin = 14;Se deber??an mostrar los n??meros:5,6,7,8,9,10,11,12,13,14
b. A lo anterior, solo muestre los n??meros pares
c. A lo anterior, con una variable extra, elija si se deben mostrar los n??meros pares o impares
d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
*/

/*
Dado el siguiente texto, vamos a atacar el siguiente problema:
???determinar si una persona pertenece al segmento de ingresos altos???. Del I al III, la idea es hacerlo en papel y l??piz y solo implementar el cuarto.

???Son hogares que declaran reunir alguna de las siguientes condiciones, considerando a todas y todos los convivientes:
??? Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
(3,5 canastas b??sicas para un hogar tipo 2 seg??n el "INDEC").
??? Tener 3 o m??s veh??culos con una antig??edad menor a 5 a??os.
??? Tener 3 o m??s inmuebles.
??? Poseer una embarcaci??n, una aeronave de lujo o ser titular de activos
societarios que demuestren capacidad econ??mica plena.???

Tengo una duda, con respecto a los ejercicios de java en el punto 2. Es necesario que se cumplan todas las condiciones o sol?? un punto basta...
estoy armando un choclo de c??digo y me pregunto si voy bien porque al armar la sentencia if estoy agregando todas las condiciones.
 Ingresos, autos, inmuebles , si posee aeronave, embarcaci??n y socio activo de econom??a plena.

Tomado de https:/ www.argentina.gob.ar/subsidios el 07/12/2022

a. Lea atentamente el texto, primero que nada piense cu??les son las variables de entrada.
b. Ordene las entradas y salidas como vimos en la tabla del ejemplo Monotributo en clase, tambi??n puede consultar este link
c. Piense en un ??rbol de decision, tambi??n como se vio en clase si puede resolver el problema, dadas las entradas 1 Clase 1 - ???Desarrollador Java inicial???
d. Finalmente, vea si puede resolver el problema utilizando c??digo Java.
Por ejemplo si estuvi??semos intentando resolver el ejemplo de monotributo
tendr??amos el c??digo que se muestra m??s abajo, y cambiando las variables
pueden cambiar estas variables para ir probando

float ingresos = 299000;
    int superficie = 20;
    int energ??a = 900;
********************************************
if ( (ingresos <= 748382.07) &&
     ( superficie <= 30) &&
     (energ??a <= 3330) ) {

        System.out.println("Categor??a A");

        } else if(
            (ingresos <= 1112459.83) &&
            (superficie <= 45) &&
            (energ??a <= 5000) ) {

                System.out.println("Categor??a B");

            }
 */

