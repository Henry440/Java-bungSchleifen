import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        //task1();
        //task2a();
        //task2b();
        //task3();
        //task4();
        task5();
    }

    private static void task5() {
        float sum = 0;
        while (true){
            System.out.print("Versicherungssumme: ");
            float data = s.nextFloat();
            if(data == 0){
                break;
            }
            sum += 50;
            sum += (data * 0.01);
        }
        System.out.println("Provision: " + sum);
    }

    private static float task4_raum(){
        float ret = 0;
        System.out.print("Länge des Raumes: ");
        float l = s.nextFloat();
        System.out.print("Breite des Raumes: ");
        float b = s.nextFloat();
        ret = l * b;
        return ret;
    }

    private static void task4() {
        float sum = 0;
        do{
            float raum = task4_raum();
            System.out.println("Der Raum ist: " + raum + "m² groß");
            sum += raum;

            System.out.println("[1] zum Beenden / 0 zum Weiter machen");
            if(s.nextInt() == 1){
                break;
            }
        }while (true);
        System.out.println("Gesamtfläche: " + sum);

    }

    private static void task3() {
        int min = 0, max = 0, sum = 0;
        int len = 0;
        int inp = 0;
        while (true){
            System.out.print("Zahl: ");
            inp = s.nextInt();
            if(inp < 0){
                break;
            }
            if(len == 0){
                min = inp;
                max = inp;
            }else{
                if(inp < min){
                    min = inp;
                }
                if(inp > max){
                    max = inp;
                }
            }
            sum += inp;
            len++;
        }
        System.out.println("Anzahl der Zahlen:" + len + " | Mittelwert: " + ((float)sum/(float)len));
        System.out.println("Min: " + min + " | Max: " + max);
    }

    private static void task2b(){
        int choice = 0;
        int summe = 0;
        int len = 0;
        while (true){
            System.out.print("Note: ");
            choice = s.nextInt();
            if(choice >= 7){
                break;
            }
            summe += choice;
            len++;
        }

        System.out.println("Notenschnitt: " + ((float)summe/(float)len));
    }

    private static void task2a(){
        System.out.print("Anzahl der Noten: ");
        float anzahl = s.nextFloat();
        float[] data = new float[(int)anzahl + 1];
        for (int i = (int)anzahl; i != 0; i--){
            System.out.print("Note: ");
            data[i] = s.nextFloat();
        }
        float summe = 0;
        for(float i : data){
            summe += i;
        }
        System.out.println("Notenschnitt: " + (summe/anzahl));
    }

    private static void task1(){
        for(int i = 7; i < 40; i = i +4){
            System.out.println(i);
        }

        int c = 169;
        while (c > 90){
            System.out.println(c);
            c = c - 13;
        }

        c = 10;
        do{
            System.out.println(c);
            c = c - 2;
        }while (c >= -10);
    }

}
