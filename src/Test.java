import javafx.scene.AmbientLight;
import org.omg.CORBA.CODESET_INCOMPATIBLE;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {

    private static Object Person;

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
        // Ans: A. 10, 10
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

        //Q36
        //Ans: BCF???? E, ALL class not all "other" class!!!!
        //Which three statements describe the object-oriented features of the Java language?
        //A. Objects cannot be reused.
        //B. A subclass can inherit from a superclass.
        //C. Objects can share behaviors with other objects.
        //D. A package must contain more than one class.
        //E. Object is the root class of all other objects.
        //F. A main method must be declared in every class.

        //Q37
        //Ans: 4, 5
        /*String[] planet = {"Mercury", "Venus", "Earth", "Mars"};
        System.out.println(planet.length);
        System.out.println(planet[1].length());*/

        //Q38
        //Ans: in outer package, only public variable can be access: Only s is accessible by obj
        /*class Acc{
               int p;
               private int q;
               protected int r;
               public int s;
        }*/


        //Q39
        // Ans : DerivedB DerivedB, child cast to parent, no change, still child
        /*Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        b1 = (Base) b3;
        Base b4 = (DerivedA) b3;
        b1.test();
        b4.test();*/

        //Q40
        // 3 + 4 means string, but (3+4) means int
        //System.out.println("5 + 2 = " + 3 + 4);
        //System.out.println("5 + 2 = " + (3 + 4));

        //Q41
        //checkAge(iList, p-> p.getAge()>40); lambda express!!!!

        //Q42
        //print first,then break!!!
        /*String[][] arr = {{"A","B","C"},{"D","E"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j].equals("B")) {
                    break;
                }
            }
            continue;
        }*/

        //Q43
        // false and false, trim() does change any thing, it has some return value, if not, then original doesn't
        // change...
        /*String str = " ";
        str.trim();
        System.out.println(str.equals("") + " and " + str.isEmpty());*/

        //Q44
        // needs to ignore case
        /*String str1 = "Java";
        String str2 = new String("java");
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }*/

        //Q45
        //default int double!!!!
        /*doSum(10, 20);
        doSum(10.0,20.0);*/

        //Q46
        //concat method parameter needs to be NotNull!!!!
        /*String[] strs = new String[2];
        int idx = 0;
        for (String s : strs) {
            strs[idx].concat(" element " + idx);
            idx++;
        }
        for (idx = 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);
        }*/

        //Q47
        // StringBuilder/StringBuffer has internal toString method, customized doesn't, nees to rewrite
        //System.out.println("Hello " + new StringBuilder("Java SE 8"));
        //System.out.println("Hello " + new MyString("Java SE 8"));

        //Q48
        // int < float < double, so double cover float cover int!!!! small into big ok, big into small no!!!!
        /*int iVar = 100;
        double dVar = 100.0;
        float fVar = 100f;
        iVar = dVar;
        iVar = fVar;
        fVar = dVar;

        dVar = iVar;
        fVar = iVar;
        dVar = fVar;*/

        //Q49
        // command:
        // javac MainTest.java
        // java MainTest 1 2 3
        // Ans: String 1
        // 1. Can have multiple main method in one class, depends on args pass in.
        // 2. default is String!!!
        /*public static void main(String[] args) {
            System.out.println("String " + args[0]);
        }

        public static void main(int[] args) {
            System.out.println("int " + args[0]);
        }

        public static void main(Object[] args) {
            System.out.println("Object " + args[0]);
        }*/

        //Q50
        /*int[][] num = new int[1][3];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = 10;
            }
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.println("num[" + i + "]" + "[" + j + "] = " + num[i][j]);
            }
        }*/

        //Q52
        // only primitive type can be access without rewrite method.
        // Arrays.toString, can convert array to string, then rewrite to string method
        /*class Planet {
            public String name;
            public int moons;

            public Planet(String name, int moons) {
                this.name = name;
                this.moons = moons;
            }
        }

        Planet[] planets = {
                new Planet("Mercury",0),
                new Planet("Venus",0),
                new Planet("Earth",1),
                new Planet("Mars",2)};

        System.out.println(planets);
        System.out.println(planets[2]);
        System.out.println(planets[2].moons);*/

        //Q53,
        // 15, 30, 75, 60, 90 you are correct!!!
        /*int[] intArr = {15, 30, 45, 60, 75};
        intArr[2] = intArr[4];
        intArr[4] = 90;
        System.out.println(Arrays.toString(intArr));*/

        //Q54
        // two way to write interation. one is use i : intArr, the other is i = 0 to intArr[i]
        /*int[] intArr = {8, 16, 32, 64, 128};
        for (int i : intArr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }*/

        //Q55
        // Ans:
        // 1 can be implemented by using enhanced for loop
        // 3 can NOT be implemented by either the enhanced for loop or standard for loop
        //int[] array = {1, 2, 3, 4, 5};
        //And given the requirements:
        //1. Process all the elements of the array in the order of entry.
        //2. Process all the elements of the array in the reverse order of entry.
        //3. Process alternating elements of the array in the order of entry.

        //Q56
        // 400 200, this static is only for method, not for results, so var don't change, and results is 400 and var
        // is 200
        /*int var = 200;
        System.out.println(doCal(var));
        System.out.println(var);*/

        //Q57
        // Small type can NOT contain big type. Interface can be a type.
        //Given the following class declarations:
        //public abstract class Animal{}
        //public interface Hunter
        //public class Cat extends Animal implements Hunter
        //public class Tiger extends Cat
        //This would fail:
        // ArrayList<Tiger> myList = new ArrayList<>();
        // myList.add(new Cat());

        //Q58
        //java bytecode: it can run on any platform as long as this platform has a java compiler, NO NEED JRE.
        // Then run on JVM or its implementation.

        //Q59
        //key! null is NOT an instance in java, so anyting Object obj1 = null, there is NO object created!!!
        /*Object obj1 = new Object();
        Object obj2 = null;
        System.out.println(obj1);
        System.out.println(obj2);*/
        /*class MarkList{
            int num;

            public void graceMark(MarkList obj4) {
                obj4.num += 10;
            }
        }
        MarkList obj1 = new MarkList();
        MarkList obj2 = obj1;
        MarkList obj3 = null;
        obj2.num = 60;
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1.num);
        System.out.println(obj2.num);*/

        //Q61
        // byte short integer is ok to use 1, String, Long, Double needs : "1", 1l, 1d and so on
        /*Byte x1 = 1;
        short x2 = 1;
        Integer x3 = new Integer(1);
        String x4 = "1";
        Long x5 = 1l;
        Double x6 = 1d;

        switch (x1) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }*/

        //Q62
        // A boolean can NOT be null but Boolean can be null!!!! small boolean no, big Boolean yes. and Boolean is
        // null mean the value is false;
        /*Boolean[] bool = new Boolean[2];
        bool[0] = new Boolean(Boolean.parseBoolean("true"));
        bool[1] = new Boolean(null);

        System.out.println(bool[0] + " " + bool[1]);*/

        //Q63
        // B. B small is in big but big is not small

        //Q64
        // need to see all options,
        /*String str = "9001";
        int num = Integer.parseInt(str);
        System.out.println(num);*/
        //only naming, no meaning!!!! still in the method!!
        /*class App {
            String myStr = "7007";

            public void doStuff(String str) {
                int myNum = 0;
                try {
                    String myStr = str;
                    myNum = Integer.parseInt(myStr);
                } catch (NumberFormatException ne) {
                    System.err.println("Error");
                }
                System.out.println("myStr: " + myStr + " myNum " + myNum);
            }
        }

        App obj = new App();
        obj.doStuff("9009");*/

        //Q65 : Efficient / flexible
        //Which two are benefits of polymorphism?
        //B. More efficient code at runtime
        //D. More flexible and reusable code

        //Q66
        //overlap to the new ones
        /*int[] nums1 = new int[1];
        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(nums1);
        System.out.println(nums2);
        nums1 = nums2;
        System.out.println(nums1);
        System.out.println(nums2);
        for (int i : nums1) {
            System.out.print(i + " : ");
        }*/

        //Q67
        // == ONLY IF two variable refer to same object, then true. equals() as long as value same, true;

        //Q68
        //employee can't budget, manager can't option hahhah small can't go to big, big can go to small

        //Q69
        //Read carefully, psvm, string[] args

        //Q70
       /* int[][] n = {{1, 3}, {2, 4}};
        for (int i = n.length - 1; i >= 0; i--) {
            for (int j : n[i]) {
                System.out.print(j);
            }
        }*/

        //Q71
        //read the code: a , e and o, o
        /*class Vowel{
            private char var;
        }
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';
        Vowel obj1 = new Vowel();
        Vowel obj2 = obj1;
        obj1.var = 'i';
        obj2.var = 'o';
        System.out.println(var1 + " " + var2);
        System.out.println(obj1.var + " " + obj2.var);*/

        //Q72
        //Repeat Q1, 10 Hello World

        //Q73
        //Ans: 9   java space duke, totally 9 character
        /*String s = "JAVA DUKE";
        int len = s.trim().length();
        System.out.println(len);*/

        //Q74
        // command1 : javac Test.java
        // command2 : java Test TRUE null
        //Ans: true, false: null is false by default
        /*boolean a = new Boolean(Boolean.valueOf(args[0]));
        boolean b = new Boolean(args[1]);
        System.out.println(a + " " + b);*/

        //Q75
        // Ans: a: replace n1 with p1.A replace n2 with p1.A and p1.p2.B
        //need to import with specified class, better not use * or total package

        //Q76
        //Ans: sb.delete(int start, int end) sb.delete, sb.replace, sb.append. no remove no deleteAll...
        /*StringBuilder sb = new StringBuilder("abc");
        sb.toString();
        System.out.println(sb + " : " + sb.length());
        sb.delete(0, sb.length());
        System.out.println(sb + " : " + sb.length());*/

        //Q77
        // Tri express, good enough
        /*String stuff = "TV";
        String res = null;

        if (stuff.equals("TV")) {
            res = "Walter";
        } else if (stuff.equals("Movie")) {
            res = "White";
        } else {
            res = "No result";
        }

        res = stuff.equals("TV") ? "Walter" : stuff.equals("Movie") ? "White" : "No result";*/

        //Q78
        // index is 0, so just print f, int f = ps.indexOf(p2);
        /*class Patient{
            String name;

            public Patient(String name) {
                this.name = name;
            }
        }
        List ps = new ArrayList();
        Patient p2 = new Patient("Mike");
        ps.add(p2);
        int f = ps.indexOf(p2);
        System.out.println(f);
        if (f >= 0) {
            System.out.println("Mike found");
        }*/

        //Q79
        //Ans: D. expression should be single value. A, no need default, B, no need break, C, can NOT change a runtime
        //Which statement is true about the switch statement?
        //A. It must contain the default section.
        //B. The break statement, at the end of each case block, is mandatory.
        //C. Its case label literals can be changed at runtime.
        //D. Its expression must evaluate to a single value.

        //Q80
        // substring, left close, right open, endindex can be length, i.e, plus 1
        //Thomas substring(2,6) means 0 1 2 start with o to 0 1 2 3 4 5 end with s, even it is 6, means without 6, within 5
        //when come to peter, go to catch, so peter is null, joseph is null
        /*String[] names = {"Thomas", "Peter", "Joseph"};
        String[] pwd = new String[3];
        int index = 0;
        try {
            for (String name : names) {
                pwd[index] = name.substring(2, 6);
                index++;
            }
        } catch (Exception e) {
            System.out.println("Invalid name");
        }
        for (String name : pwd) {
            System.out.println(name);
        }*/

        //Q81
        // Ans: both Emp class and main class has compilation error:
        // 1. this must be the first line of the contructor
        // 2. if class has other constructor with parameter, then the default no parameter constructor will NO LONGER exist;
        /*class Emp {
            private String name;
            private int age;
            private int salary;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public int getSalary() {
                return salary;
            }

            public void setSalary(int salary) {
                this.salary = salary;
            }

            public Emp(String name, int age) {
                setName(name);
                setAge(age);
                setSalary(2000);
            }

            public Emp(String name, int age, int salary) {
                setSalary(salary);
                //this(name, age);
            }

            public void printDetails() {
                System.out.println(name + " , " + age + " , " + salary);
            }
        }
        //Emp e1 = new Emp();
        Emp e2 = new Emp("Jack", 50);
        Emp e3 = new Emp("Chole", 40, 5000);
        //e1.printDetails();
        e2.printDetails();
        e3.printDetails();*/

        //Q82
        //Duplicate with Q75, needs to import with specified class, no * better

        //Q83
        //Ans: D. A ClassCastException is thrown only at line n1
        // can cast to another same level class?
        /*class A {
            public void test() {
                System.out.println("A");
            }
        }

        class B extends A{
            public void test() {
                System.out.println("B");
            }
        }

        class C extends A{
            public void test() {
                System.out.println("C");
            }
        }

        A b1 = new A();
        A b2 = new C();
        b1 = (A)b2;
        A b3 = (B)b2;
        b1.test();
        b3.test();*/

        //Q84
        //Ans: B. int 30, double 30.0.
        //duplicate with Q45. Remember, int/double is default to choose unless other mentioned.

        //Q85
        //Ans: C. A01, B12. Still no calcaulat, then just String
        /*System.out.println("RESULT A" + 0 + 1);
        System.out.println("RESULT B" + (1) + (2));*/

        //Q86
        //Ans: B 10 : 10
        //Duplicate with Q33, static variable only count the last number, 10, 10

        //Q87
        //in arrayList, remove(int index), not object, but null is object, can be removed.
        // int is only index!!!!! if object, needs to specify which obj to be removed, like null.
        /*List<Integer> points = new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);
        points.remove(2);
        points.remove(null);
        System.out.println(points);*/

        //Q88
        //anytime use new keyword, a new piece of memory has be allocated for the instance, so that is actually to different thing.
        /*int[] nums;
        nums = new int[2];
        nums[0] = 10;
        nums[1] = 20;
        System.out.println(nums);
        nums = new int[4];
        nums[2] = 30;
        nums[3] = 40;
        System.out.println(nums);
        for (int i : nums) {
            System.out.print(i + " : ");
        }*/

        //Q89
        //Ans: D. double y1 = 203.22, float flt = y1; is NOT acceptable as this is big to small, overflow;
        //float flt = 100;
        //Float fltA= 100;
        //float flt = (float) 1_11.0;
        //System.out.println(flt);

        //Q90
        // char defalut value is '' (nothing, but it is there), float default value is 0.0, boolean default value is false
        /*Test t = new Test();
        t.printAll();*/

        //Q91
        //Ans: D. do{idx++} while (idx < size - 1); first do ++ then compare
        //Be very careful to do while to see who did the last calculation and use which value;
        /*int[] stack = {10, 20, 30};
        int size = 3;
        int idx = 0;
        while (idx < size) {
            idx++;
        }
        do {
            idx++;
        } while (idx < size -1);
        System.out.println("The top element is : " + stack[idx]);*/

        //Q92
        //Ans: C. 5; count carefully, the space is also a character;
        /*String str = "Hello world";
        str.trim();
        int il = str.indexOf(" ");
        System.out.println(il);*/

        //Q93
        //Ans: B. false, true
        // suprise!!!!, s = s +str, otherwise it will be reverse way in for loop!! back way to do it!!!!
        /*String str1 = "Java";
        String[] str2 = {"J", "a", "v", "a"};
        String str3 = "";
        for (String s : str2) {
            str3 = str3 + s;
        }
        boolean b1 = (str1 == str3);
        boolean b2 = (str1.equals(str3));
        System.out.println(b1 + " : " + b2);*/

        //Q94
        //Ans: B. Error is extendable, E. Error is a Throwable.
        //Which two statements are true?
        //A. Error class is unextendable.
        //B. Error class is extendable.
        //C. Error is a RuntimeException.
        //D. Error is an Exception.
        //E. Error is a Throwable.

        //Q95
        //Ans: compliation failed. or 2 found, no way to make 3 found with this.
        /*int[] data = {2010, 2013, 2014, 2015, 2014};
        int key = 2014;
        int count = 0;
        for (int e : data) {
            if (e != key) {
                continue:
                count++;
            }
        }
        System.out.println(count + " Fount");*/

        //Q96
        //Ans: C. 2014-7-31
        //1. LocalDateTime(int year, int month, int dayofMonth, int hour, int min)
        //2. method plusXXX only change after, do NOT change original, create new object but original do NOT change!!!!!!!!
        /*LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
        dt.plusDays(30);
        dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));*/

        //Q97
        // Ans: B. "JAVA EE". args.lengths is 0, so false, --> java EE;
        /*int x = args.length;
        if (checkLimit(x)) {
            System.out.println("JAVA SE");
        } else {
            System.out.println("JAVA EE");
        }

        System.out.println(x);*/

        //Q98
        // Ans : C. 13480.0 if everything correct, then just simple add it. underscore usage!!!! as normal!!! just easy to read, nothing else
        /*float var1 = (12_345.01 >= 12_345.00) ? 12_456 : 124_56.02f;
        float var2 = var1 + 1024;
        System.out.println(var2);*/

        //Q99
        //Ans: B. 300 : 100, 200 : 300. simple assign value, won't change anything!!!!!
        /*Test t1 = new Test();
        t1.var = 300;
        System.out.println(t1);
        Test t2 = new Test();
        t2.stVar = 300;
        System.out.println(t2);*/

        //Q101
        //Ans: After line 11, one object is eligible for GC. s2 pointed to s3 and s2 = null, so s2 is the target.

        //Q102
        //Ans: 3, too diao, can only memory it.....
        /*int wd = 0;
        String days[] = {"sun", "mon", "wed", "sat"};
        for (String s : days) {
            switch (s) {
                case "sat":
                case "sun":
                    wd -= 1;
                    break;
                case "mon":
                    wd++;
                case "wed":
                    wd += 2;
            }
        }
        System.out.println(wd);*/

        //Q103
        // Ans: runtime exception, compilation no error
        /*LocalDate date = LocalDate.of(2012, 01, 32);
        date.plusDays(10);
        System.out.println(date);*/

        //Q104
        //Ans: B. 10, 22, 22
        /*int i = 10;
        int j = 20;
        int k = j += i / 5;
        System.out.println("i : " + i + " j : " + j + " k : " + k );*/

        //Q105
        //Ans: [green, red, yellow, cyan] no impact,...don't know why....
        /*List<String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.remove(2);
        System.out.println(colors);
        System.out.println(colors.size());
        colors.add(3, "cyan");
        System.out.println(colors);*/



    }

    //Q100
    //Ans: D. compilation failed, again, interface and normal class can NOT polymorphism, has to be casted!!!
    //note: if change to C2 s = obj1, I t = obj2, then C1C2
    /*C2 obj1 = new C1();
    I obj2 = new C1();
    C2 s =  obj2;
    I t = obj1;

    //t.displayI();
    //s.displayC2();


    class C2 {
        public void displayC2() {
            System.out.println("C2");
        }
    }
    interface I {
        public void displayI();
    }

    class C1 extends C2 implements I{
        @Override
        public void displayI() {
            System.out.println("C1");
        }
    }*/


    //Q99
    /*public static int stVar = 100;
    public int var = 200;
    public String toString(){
        return var + " : " + stVar;
    }*/

    //Q97
   /* public static final int MIN = 1;

    public static boolean checkLimit(int x) {
        return (x >= MIN) ? true : false;
    }*/

    //Q90
    /*char c;
    boolean b;
    float f;

    void printAll() {
        System.out.println(" c default is " + c);
        System.out.println(" b default is " + b);
        System.out.println(" f default is " + f);
    }*/


    /*static int doCal(int var) {
        var = var * 2;
        return var;
    }*/


    //Q45
    /*public static void doSum(Integer x, Integer y) {
        System.out.println("Integer sum is " + (x + y));
    }
    public static void doSum(int x, int  y) {
        System.out.println("int sum is " + (x + y));
    }
    public static void doSum(double x, double y) {
        System.out.println("double sum is " + (x + y));
    }
    public static void doSum(float x, float y) {
        System.out.println("float sum is " + (x + y));
    }*/
}
        //Q47
        /*class MyString{
            String msg;

            MyString(String msg) {
                this.msg = msg;
            }

        }*/
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

        //Q39
        /*class Base {
            public void test() {
                System.out.println("Base ");
            }
        }

        class DerivedA extends Base {
            public void test() {
                System.out.println("DerivedA");
            }
        }

        class DerivedB extends DerivedA {
            public void test() {
                System.out.println("DerivedB");
            }
        }*/



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



