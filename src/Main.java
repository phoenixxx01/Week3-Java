import java.util.Arrays;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        List<String> wordsArray = Arrays.asList("Home", "Hello", "People", "Hope", "Hogwarts");
//             for( int i =  wordsArray.size() - 1; i > 0; i--){
//
//                 System.out.print(wordsArray.get(i) + " ");

//        List<Object> elementsArray = Arrays.asList("Home", "Hello", true, "Hope", 1);
//             for ( Object names : elementsArray){
//
//                 System.out.println(names);
//             }


//        int n = 5;
//        if (n % 2 == 0)
//            System.out.println(10);
//        else
//            System.out.println(20);
//       int m = 4;
//       int ans = 0;
//       ans = m%2 == 0 ? 10 : 20;
//        System.out.println(ans);

//        int result = 0;
//      result = n%2 ==0 ? 10 : 20;
//
//        System.out.println(result);

      //  SWITCH STATEMENT
//      String day = "May";
//      switch (day){
//              case "Monday" :
//              System.out.println("Monday");
//              break;
//              case "Tuesday" :
//              System.out.println("Tuesday");
//                  break;
//              case "Wednesday" :
//              System.out.println("Wednesday");
//                  break;
//              case "Thursday" :
//              System.out.println("Thursday");
//                  break;
//              case "Friday" :
//              System.out.println("Friday");
//                  break;
//              case "Saturday" :
//              System.out.println("Saturday");
//                  break;
//              case "Sunday" :
//              System.out.println("Sunday");
//              default:
//                  System.out.println("Not a day of the week");
   ///WHILE LOOP
//        int i = 1;
//        while ( i <= 3){
//            System.out.println( " Hello");
//            i++;
//            int j = 1;
//            while ( j < 3){
//                System.out.println(j + " My name is John.");
//                j++;
//            }
//        }

        ///DO WHILE LOOP
//        int k = 1;
//      do {
//          System.out.println(k + " Hello");
//          k++;
//      }while(k <=4);
 //     }

        //MULTI DIMENSIONAL ARRAY
//        int nums[][] = new int[3][4];
//
//        for ( int i = 0; i < 3; i ++){
//            for (int j= 0; j< 4; j++){
//                System.out.print((nums[i][j] = (int)(Math.random() * 100))+ " ");
//            }
//            System.out.println();
//        }
//
//        for ( int i = 0; i < 3; i ++){
//            for (int j= 0; j< 4; j++){
//                System.out.print(nums[i][j] + " ");
//            }
//            System.out.println();
//        }
 //JAGGED ARRAYS
//               int nums[][] = new int[3][];
//               nums[0] = new int[3];
//               nums[1] = new int[4];
//               nums[2] = new int[2];
//
//               for (int i = 0; i < nums.length; i++ ){
//                   for ( int j = 0; j < nums[i].length; j++){
//                       System.out.print((nums[i][j] = (int)(Math.random()*10)) + " ");
//                   }
//                   System.out.println();
//               }

//Student s1 = new Student();
//s1.age = 30;
//s1.marks = 12;
//s1.rollno = 1;
//
//Student s2 = new Student();
//s2.age = 30;
//s2.marks = 12;
////s2.rollno = 1;
//
//Student s3 = new Student();
//s3.age = 30;
//s3.marks = 12;
//s3.rollno = 1;
//
//Student students[] = new Student[3];
//
//students[0] = s1;
//students[1] = s2;
//students[2] = s3;
//
//for (int i =0; i< students.length; i++) {
//    System.out.println(students[i].age + " : " + students[i].rollno);
//
//   // USING FOR EACH LOOP
//
//    for (Student stud : students){
//        System.out.println(students[i].age + " : " + students[i].rollno);
//    }
//
//}
   //BUBBLE SORT On2
   int nums[] = {6,5, 2, 8,9,4 };
   int temp = 0;
   int minIndex = 0;
        System.out.println("Before sorting");
   for( int num : nums){
       System.out.print(num + " ");
   }

   for (int i = 0; i< nums.length; i++) {
       for ( int j = 0; j< nums.length; j++){
           if (nums[j] > nums[ j + 1]){
               temp = nums[j];
               nums[j] = nums[ j+ 1];
               nums[j+1] = temp;
           }


       }
   }


        System.out.println("After sorting");
   for(int num : nums){
       System.out.print(num + " ");
   }




    }
}
