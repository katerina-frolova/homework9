import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[ ] arr = generateRandomArray();
        int sum=0;
        for (int i:arr) {
            sum=sum+i;
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");
       

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[ ] arr = generateRandomArray();
        int maxSalary=0;
        int minSalary=200_000;
        for(int i:arr){
            if(i>maxSalary){
                maxSalary=i;
            }
            if(i<minSalary){
                minSalary=i;
            }
        }
        System.out.println("Максимальная сумма трат за день составила "+maxSalary+" рублей");
        System.out.println("Минимальная сумма трат за день составила "+minSalary+" рублей");


    }
    public static void task3 () {
        System.out.println("Задача 3");
        int[ ] arr = generateRandomArray();
        double sum=0.0;
        for (int i:arr) {
            sum=sum+i;
        }
        double middle=sum/ arr.length;
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");
        System.out.print("Средняя сумма трат за месяц составила ");
        System.out.printf("%.2f",middle);
        System.out.print(" рублей");
        System.out.println();

    }
    public static void task4 () {
        System.out.println("Задача 4");
        int[ ] arr = generateRandomArray();
        char[] reverseFullName = {'n','a','v','I',' ','v','o','n','a','v','I'};
        for (int i = 10; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();


    }

}