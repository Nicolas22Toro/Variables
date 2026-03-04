public class TallerVariables {
    public static void main(String[] args) {

        String nombre = "Andreina";
        int edad = 18;
        float estatura = 1.65f; 
        double peso = 55.5;
        char inicial = nombre.charAt(0);

        String ciudad = "Bogotá";
        long poblacion = 8000000L;

        short anio = 2026;
        float temperatura = 19.5f;

        boolean activo = true;
        byte nivel = 5;

        char letraClasificacion = 'A';

        String saludo = "Hola, " + nombre;

        System.out.println(saludo);
        boolean esMayorDeEdad = (edad >= 18);
        if (esMayorDeEdad) {
            System.out.println("El usuario es mayor de edad.");
        } else {
            System.out.println("El usuario es menor de edad.");
        }

        int numero1 = 15;
        int numero2 = 30;
        int suma = numero1 + numero2;
        System.out.println("Ejemplo de suma: " + numero1 + " + " + numero2 + " = " + suma);

        double imc = peso / (estatura * estatura);

        int copiaEdad = edad;
        edad = edad + 1;

        ciudad = "Medellín";
        poblacion = 2600000L;
        temperatura = 24.0f;

        activo = false;
        nivel = 6;


        System.out.println("\n--- RESUMEN COMPLETO DEL PERFIL ---");
        System.out.println("Nombre: " + nombre + " (Inicial: " + inicial + ")");
        System.out.println("Edad anterior: " + copiaEdad + " | Edad actual: " + edad);
        System.out.println("Ciudad: " + ciudad + " (Población aprox: " + poblacion + ")");
        System.out.println("Año del reporte: " + anio);
        System.out.println("IMC calculado: " + String.format("%.2f", imc));
        System.out.println("Temperatura ambiente: " + temperatura + "°C");
        System.out.println("Clasificación: " + letraClasificacion + " | Nivel: " + nivel);
        System.out.println("Perfil activo: " + activo);



                
            }
                






        }
    

