import javafx.scene.AmbientLight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        //Q1
        // 10 hello world
        // ++a means calculate first, then compare, a++ means compare first, then calculate
        /*int aVar = 9;
        if (aVar++ < 10) {
            System.out.println(aVar + " hello world");
        } else {
            System.out.println(aVar + "hello universe");
        }*/

        //Q2
        //An exception is thrown at runtime
        // exception throws at runtime
        /*String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);*/

        //Q3
        //Compilation fails at line n2(String s4 = (String) (s3 * s2);)
        //can not cast long to string, use String.valueOf(s4)
        /*Short s1 =200;
        Integer s2 = 400;
        Long s3 = (long)s1 + s2;
        String s4 = (String) (s3 * s2);
        System.out.println("sum is " + s4);*/

        //Q4
        //What is the name of the Java concept that uses access modifiers to protect variables and hide them within
        //a class?
        //   Encapsulation
        //A. Encapsulation    This is correct one!!!!!!!!!!!!!
        //B. Inheritance
        //C. Abstraction
        //D. Instantiation
        //E. Polymorphism

        //Q5
        //make the method at line n3 public/protected
        /*abstract class Planet {
            protected void revole() {}
            abstract void rotate();
        }
        class Earth extends Planet {
            void revole(){}         //make either public or protected, as parent class is in protected, must be weaker
            protected void rotate(){}
        }*/

        //Q6
        //compile failed only at line n1 == at car(String trans){}
        /*class Vechicle {
            String type = "4w";
            int maxSpeed = 100;

            Vechicle(String type, int maxSpeed) {
                this.type = type;
                this.maxSpeed = maxSpeed;
            }

        }
        class car extends Vechicle {
            String trans;

            Car(String trans) {
                this.trans = trans;
            }

            Car(String type, int maxSpeed, String trans) {
                super(type, maxSpeed);
                this(trans);
            }
        }*/

        //Q7
        //Match 2
        //needs toString to make it same
        /*StringBuilder sb = new StringBuilder(5);
        String s = "";
        if (sb.equals(s)) {
            System.out.println("Match 1");
        } else if (sb.toString().equals(s.toString())) {
            System.out.println("Match 2");
        } else {
            System.out.println("No Match");
        }*/

        //Q8
        //A B C C
        /*String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C','D');
        ta = ta.concat(tb);
        System.out.println(ta);*/

        //Q9
        // super(r)
        // this.c = c
        /*class CD {
            int r;

            CD(int r) {
                this.r = r;
            }
        }
        class DVD extends CD {
            int c;

            DVD(int r, int c) {
                super(r);
                this.c = c;
                // to institiate the followin:
                // DVD dvd = new DVD(10, 30);
            }
        }*/

        //Q10
        //for(int e = 0; e < 5; e += 2)
        // print 1,3,5. starting from 0
        /*int a[] = {1, 2, 3, 4, 5};
        for (int e = 0; e < 5; e += 2) {
            System.out.println(a[e]);
        }*/

        //Q11
        // key words: ONLY Certain fiels and method are accessible from other objects
        //Which statement best describes encapsulation?
        //A. Encapsulation ensures that classes can be designed so that only certain fields and methods of an
        //object are accessible from other objects.
        //B. Encapsulation ensures that classes can be designed so that their methods are inheritable.
        //C. Encapsulation ensures that classes can be designed with some fields and methods declared as
        //abstract.
        //D. Encapsulation ensures that classes can be designed so that if a method has an argument MyType x,
        //any subclass of MyType can be passed to that method.

        //Q12
        //SalesMan.java product.java
        //import sales.*;
        //import sales.product.*;

        //Q13
        //D. acct.changeAmount(0)
        //G. acct.changeAmount(-acct.Amount)
        //H. acct.changeAmount(-acct.getAmount)

        //Q14
        //It is ok to put index++ out of for loop, as long as it is in the format index++ or idx++
        //start with 0, end with < 2
        //for (int index = 0; index < 2;) {
        //            for (int idx = 0; idx < 2;) {
        //                System.out.print(shirt[index][idx] + ":");
        //                idx++;
        //            }
        //            index++;
        //        }
        /*String shirt[][] = new String[2][2];
        shirt[0][0] = "red";
        shirt[0][1] = "blue";
        shirt[1][0] = "small";
        shirt[1][1] = "medium";
        for (int index = 0; index < 2;) {
            for (int idx = 0; idx < 2;) {
                System.out.print(shirt[index][idx] + ":");
                idx++;
            }
            index++;
        }*/

        //Q15
        //Compliation failed only at line n3 (ex.readCard(cardNo); add exception to method signature.
        /*Test ex = new Test();
        int cardNo = 12344;
        ex.checkCard(cardNo);
        ex.readCard(cardNo);*/

        //Q16
        //Can't use --x, otherwise will be 4321, not 54321
        /*int x = 5;
        while (isAvailable(x)) {
            System.out.println(x);
            x--;
        }*/

        //Q17
        //you can !!!!!!!!!!!NOT!!!!!!!!!!! use boolean on switch statement!!!!!!!!!!!!
        //Replace line 5 With String opt = "true";
        //Replace line 7 with case "true":
        /*String opt = "true";
        switch (opt) {
            case "true":
                System.out.print("True");
                break;
            default:
                System.out.println("*****");
        }
        System.out.print("Done");*/

        //Q18
        // Ans: 5, only loop once, num == 0 always false
        /*int num = 5;
        do {
            System.out.println(num-- + " ");
        } while (num == 0);*/

        //Q19
        // E: Compliation Failed. () ? : tri-factor
        /*int x = 100;
        int a = x++;
        int b = ++x;
        int c = x++;
        int d = (a < b) ? (a <c )? a : (b < c) ? b : c;
        System.out.println(d);*/

        //Q20
        // finally it is a 2x2 matrix, chs length is 2, no more than 2 elementary.
        /*String[][] chs = new String[2][];
        chs[0] = new String[2];
        chs[1] = new String[5];
        int i = 97;

        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs.length; b++) {
                chs[a][b] = "" + i;
                i++;
            }
        }

        for (String[] ca : chs) {
            for (String c : ca) {
                System.out.print(c + " ");
            }
            System.out.println();
        }*/

        //Q21
        //Ans CA: OK to initiate at constructor level
        /*Emp e = new Emp();
        e.salary = 100;
        e.name = "joe";
        e.contract = true;
        System.out.println(e);*/

        //Q22
        //remove return true
        /*List<String> names = new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");
        if (names.remove("Bran")) {
            names.remove("Joe");
        }
        System.out.println(names);*/

        //Q23
        // Compliation error, needs to add return type like void or something,
        // Compilation fails at line n1 and line n2
        //C c = new C();

        //Q25
        // Ans: int[] array = new int[2]
        /*int[] array = new int[2];
        array[0] = 10;
        array[1] = 20;
        System.out.println(array[0] + " : " + array[1]);*/

        //Q26
        //a work done!
        /*String[] arr = {"a", "b", "c", "d", "e"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            if (arr[i].equals("c")) {
                continue;
            }
            System.out.println("work done");
            break;
        }*/

        //Q27
        //Ans ACE: key words: handlding separated, choose where to handle, tailerod to particular
        //Which three are advantages of the Java exception mechanism?
        // A. Improves the program structure because the error handling code is separated from the normal program
        // function
        //B. Provides a set of standard exceptions that covers all the possible errors
        //C. Improves the program structure because the programmer can choose where to handle exceptions
        //D. Improves the program structure because exceptions must be handled in the method in which they occurred
        //E. Allows the creation of new exceptions that are tailored to the particular program being created

        //Q28
        // Ans: javac to .java file!!!!!
        // javac Greeting.java
        // java Greeting Duke

        //Q30
        // Ans: 0 2 4, just read the code!!!!
        /*int ii = 0;
        int jj = 7;
        for (ii = 0; ii < jj - 1; ii = ii + 2) {
            System.out.println(ii + " ");
        }*/

        //Q31
        // parse needs to pass in !!!, ISO_DATE is ok!
        /*LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2014, 6, 20);
        LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("date3 = " + date3);*/

        //Q32
        // only str1 = str2 can make == true, if new, then still false, NO toString, No "Duke"!!!!!
        /*StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();
        String str2 = "Duke";
        //String str2 = str1; // only str1 = str2 can make == true, if new, then still false
        System.out.println(str1 == str2);*/

        //Q33
        // All make 10, as long as static varable, should be same, and finally is the last number;

        //Q34
        //tri don't miss any conditons!!!, if if ok, but tri needs to consider!!!
        /*double discount = 0;
        int qty = Integer.parseInt(args[0]);

        if (qty > 90) {
            discount = 0.5;
        }
        if (qty > 80 && qty < 90) {
            discount = 0.2;
        }

        discount = qty >= 90 ? 0.5 : qty > 80 ? 0.2 : 0;*/

        //Q35
        // it is javac .java and pass in "Hello", so condition is false, then go to print Failure, all is correct,
        // needs to go to the corret place.
        /*if (args[0].equals("Hello") ? false : true) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }*/

    }


    //Q15
    /*void readCard(int cardNo) throws Exception{
        System.out.println("Reading Cards");
    }
    void checkCard(int cardNo)  throws RuntimeException{
        System.out.println("Checking Cards");
    }*/

    //Q16
    /*public static boolean isAvailable(int x) {
        return x-- > 0 ? true : false;
    }*/
    }

    //Q23
    /*class A {
        public void a() {
            System.out.println("A ");
        }
    }

    class B extends A{
        public void b() {
            System.out.println("B ");
        }
    }
    class C extends B{
        public void c() {
            System.out.println("C ");
        }
    }*/


//Q21
    /*class Emp {
    String name;
    boolean contract;
    double salary;
    Emp() {
        this.name = new String("joe");
        this.contract = new Boolean(true);
        this.salary = new Double(100);
    }
    public String toString() {
        return name + ":" + contract + ":" + salary;
    }*/



