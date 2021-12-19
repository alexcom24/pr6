import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        SortingStudentsByGPA d = new SortingStudentsByGPA();
        ThirdExercise e = new ThirdExercise();
        Scanner n = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        Scanner num1 = new Scanner(System.in);
       /* Student[] a = new Student[5]; // тестирование первого упражнения
        for (int i = 0; i < 5; i++) {
            a[i]=new Student();
        }
        for (int i = 0; i < 5; i++) {
            a[i].Name = n.next();
            a[i].Surname = sn.next();
            a[i].idNumber = num.nextInt();
            a[i].GPA=num1.nextInt();
        }
        for (int i = 1; i < 5; i++) {
            if (a[i].idNumber < a[i - 1].idNumber) {
                Student t = a[i];
                while (t.idNumber < a[i - 1].idNumber) {
                    a[i] = a[i - 1];
                    i = i - 1;
                    if (i == 0)
                        break;
                }
                a[i] = t;
            }
        }*/
      /*  for (int i = 0; i < 5; i++) {
            System.out.println(a[i].Name);
            System.out.println(a[i].Surname);
            System.out.println(a[i].idNumber);
        }*/
        Student[] a1 = new Student[6];
        for (int i = 0; i < 6; i++) {
            a1[i] = new Student();
        }
        for (int i = 0; i < 6; i++) {
            a1[i].Name = n.next();
            a1[i].Surname = sn.next();
            a1[i].idNumber = num.nextInt();
            a1[i].GPA = num1.nextInt();
        }
        int L=0;
        int R=5;
        d.r1(a1,L,R);
        for (int i=0;i<6;i++) {
            System.out.println(a1[i].Name);
            System.out.println(a1[i].Surname);
            System.out.println(a1[i].idNumber);
            System.out.println(a1[i].GPA);
            } // тестирование второго упражнения

       /*Student[]a2= e.sort(a1); // тестирование третьего упражнения
        for (int i = 0; i < 6; i++) {
            System.out.println(a2[i].Name);
            System.out.println(a2[i].Surname);
            System.out.println(a2[i].idNumber);
            System.out.println(a2[i].GPA);
        }*/
    }
}
