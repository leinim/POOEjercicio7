/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package pooej7;

import Entidades.Persona;

/**
 *
 * @author Mile
 */
public class POOEj7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Pepe", 17, "O", 60, 1.53);
        Persona p2 = new Persona("Mariano", 14, "M", 59, 1.53);
        Persona p3 = new Persona("Cami", 15, "F", 57, 1.53);
        Persona p4 = new Persona("Susana", 36, "O", 58, 1.53);
        
        int[] peso = new int [4]; 
        boolean[] edad = new boolean[4];
        
        int peso1 = p1.calcularIMC(p1);
        int peso2 = p2.calcularIMC(p2);
        int peso3 = p3.calcularIMC(p3);
        int peso4 = p4.calcularIMC(p4);
        
        peso[0] = peso1;
        peso[1] = peso2;
        peso[2] = peso3;
        peso[3] = peso4;
        
        boolean edad1 = p1.esMayorDeEdad(p1);
        boolean edad2 = p2.esMayorDeEdad(p2);
        boolean edad3 = p3.esMayorDeEdad(p3);
        boolean edad4 = p4.esMayorDeEdad(p4);
        
        edad[0] = edad1;
        edad[1] = edad2;
        edad[2] = edad3;
        edad[3] = edad4;
        
        
        int pesoBajo = 0;
        int pesoNormal = 0;
        int pesoAlto = 0;
        int mayor = 0;
        int menor = 0;
        
        for (int i = 0; i < 4; i++){
            switch (peso[i]){
                case 0-1:
                   pesoBajo += 1;
                   break;
                case 0:
                   pesoNormal += 1;
                   break;
                case 1:
                   pesoAlto += 1;
                   break;
            }
            System.out.println("[" + peso[i] + "]");
            if (edad[i] == true){
                mayor += 1;
            } else {
                menor += 1;
            }
        }
        System.out.println("Menores de edad: " + (menor * 100 / 4) + "%");
        System.out.println("Mayores de edad: " + (mayor * 100 / 4) + "%");
        System.out.println("IMC bajo: " + ((pesoBajo * 100) / 4) + "%");
        System.out.println("IMC normal: " + ((pesoNormal * 100) / 4) + "%");
        System.out.println("IMC alto: " + ((pesoAlto * 100) / 4) + "%");
    }
    
}
