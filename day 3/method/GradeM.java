/* 2. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
  */
  import java.util.Scanner;

  public class Grade {
      public static String calcGrade(int mark) {
          if (mark >= 91 && mark <= 100) {
              return "AA";
          } else if (mark >= 81 && mark <= 90) {
              return "AB";
          } else if (mark >= 71 && mark <= 80) {
              return "BB";
          } else if (mark >= 61 && mark <= 70) {
              return "BC";
          } else if (mark >= 51 && mark <= 60) {
              return "CD";
          } else if (mark >= 41 && mark <= 50) {
              return "DD";
          } else {
              return "Fail";
          }
      }
      public static void main(String[] args) {
          System.out.println("Enter 5 subject's marks:");
          Scanner scanner = new Scanner(System.in);
          int[] arr = new int[5];
          String[] grades = new String[5];
          for (int i = 0; i < 5; i++) {
              arr[i] = scanner.nextInt();
              grades[i] = calcGrade(arr[i]); }
          scanner.close();
          System.out.println("Marks  Grade");
          for (int i = 0; i < 5; i++) {
              System.out.println(arr[i] + "\t\t" + grades[i]);
          }
      }
  }