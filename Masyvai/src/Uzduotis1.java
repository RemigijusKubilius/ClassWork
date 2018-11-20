public class Uzduotis1 {
    public static void main(String[] args) {
        System.out.println("Masyvo vidurkio apskaiciavimas");


        double[] arr = {19, 12, 16, 200, 13};
        double total = 0;

        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }


        double average = total / arr.length;


        System.out.format("Vidurkis yra: %.0f", average);
    }
}
