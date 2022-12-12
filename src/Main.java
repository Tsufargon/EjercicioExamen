import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean continuar = true;
        double volumen;
        do {
            switch (getCorrectOption()) {
                case (1):
                    areaTriangulo();
                    break;
            case(2):
                areaCirculo();
                break;
            case(3):
                volumenCono();
                break;
            case(4):
                volumen = volumenCilindro();
                System.out.println("El volumen del cilindro es " + volumen);
                break;
            case(5):
                volumen = volumenEsfera();
                System.out.println("El volumen de la esfera es " + volumen);
                break;
            case(6):
                continuar = cerrarMenú();
            }
        } while(continuar);
    }
    private static int getCorrectOption() {
        Scanner sc;
        int resp;
        do {
            sc = new Scanner(System.in);
            System.out.print("[1] Area triangulo\n" +
                    "[2] Area círculo\n" +
                    "[3] Area del cono\n" +
                    "[4] Volumen del cilindro\n" +
                    "[5] Volumen de la esfera\n" +
                    "[6] Salir\n" +
                    "> ");
            try {
                resp = sc.nextInt();
                if(resp > 0 && resp < 5) {
                    return resp;
                } else {
                    System.out.println("bad format");
                }
            } catch (Exception e) {
                System.out.println("forbidden");
            }
        } while(true);
    }
    private static void areaTriangulo() {
        double h, b, area;
        Scanner sc;
        do {
            sc = new Scanner(System.in);
            System.out.print("Introduzca la altura del triángulo: ");
            try {
                h = sc.nextDouble();
                if(h > 0) {
                    System.out.print("Introduzca la base del triángulo: ");
                    b = sc.nextDouble();
                    if(b > 0) {
                        area = (h*b) / 2;
                        System.out.println("El área del triángulo es " + area);
                    } else {
                        System.out.println("error");
                    }
                } else {
                    System.out.println("error");
                }
            } catch (Exception e) {
                System.out.println("bad format");
            }
        } while(true);
    }
    private static void areaCirculo() {
        double r, area;
        Scanner sc;
        do {
            sc = new Scanner(System.in);
            System.out.print("Introduzca el radio del círculo: ");
            try {
                r = sc.nextDouble();
                if(r > 0) {
                    area = Math.pow(r, 2)*Math.PI;
                    System.out.println("El área del círculo es " + area);
                } else {
                    System.out.println("error");
                }
            } catch (Exception e) {
                System.out.println("bad format");
            }
        } while(true);
    }
    private static void volumenCono() {
        double r, h, volumen;
        Scanner sc;
        do {
            sc = new Scanner(System.in);
            System.out.print("Introduzca el radio de la base: ");
            try {
                r = sc.nextDouble();
                if(r > 0) {
                    System.out.print("Introduzca la altura del cono: ");
                    h = sc.nextDouble();
                    if(h > 0) {
                        volumen = 1/3 * h * Math.PI * Math.pow(r, 2);
                        System.out.println("El volumen del cono es " + volumen);
                    } else {
                        System.out.println("error");
                    }
                } else {
                    System.out.println("error");
                }
            } catch (Exception e) {
                System.out.println("bad format");
            }
        } while(true);
    }
    private static double volumenCilindro() {
        double h, r, volumen;
        Scanner sc;
        do {
            sc = new Scanner(System.in);
            System.out.print("Introduzca el radio de la base: ");
            try {
                r = sc.nextDouble();
                if(r > 0) {
                    System.out.println("Introduzca la altura del cilindro: ");
                    h = sc.nextDouble();
                    if(h > 0) {
                        volumen = h * Math.pow(r, 2)*Math.PI;
                        return volumen;
                    } else {
                        System.out.println("error");
                    }
                } else {
                    System.out.println("error");
                }
            } catch (Exception e) {
                System.out.println("bad format");
            }
        } while(true);
    }
    private static double volumenEsfera() {
        double r, volumen;
        Scanner sc;
        do {
            sc = new Scanner(System.in);
            System.out.print("Introduzca el radio de la esfera: ");
            try {
                r = sc.nextDouble();
                if(r > 0) {
                    volumen = 4/3 * Math.PI * Math.pow(r, 3);
                    return volumen;
                } else {
                    System.out.println("error");
                }
            } catch (Exception e) {
                System.out.println("bad format");
            }
        } while(true);
    }
    private static boolean cerrarMenú() {
        return false;
    }
}