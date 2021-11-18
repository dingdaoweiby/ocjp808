import java.io.IOError;
import java.io.IOException;

public class Test {

    //private static Object Person;

    public static void main(String[] args) {
        //QA1
        // 10 hello world
        // ++a means calculate first, then compare, a++ means compare first, then calculate
        /*int aVar = 9;
        if (aVar++ < 10) {
            System.out.println(aVar + " hello world");
        } else {
            System.out.println(aVar + "hello universe");
        }*/

        //QA2
        //An exception is thrown at runtime
        // exception throws at runtime
        /*String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);*/

        //QA3
        //Compilation fails at line n2(String s4 = (String) (s3 * s2);)
        //can not cast long to string, use String.valueOf(s4)
        /*Short s1 =200;
        Integer s2 = 400;
        Long s3 = (long)s1 + s2;
        String s4 = (String) (s3 * s2);
        System.out.println("sum is " + s4);*/

        //QA4
        //What is the name of the Java concept that uses access modifiers to protect variables and hide them within
        //a class?
        //   Encapsulation
        //A. Encapsulation    This is correct one!!!!!!!!!!!!!
        //B. Inheritance
        //C. Abstraction
        //D. Instantiation
        //E. Polymorphism

        //QA5
        //make the method at line n3 public/protected
        /*abstract class Planet {
            protected void revole() {}
            abstract void rotate();
        }
        class Earth extends Planet {
            void revole(){}         //make either public or protected, as parent class is in protected, must be weaker
            protected void rotate(){}
        }*/

        //QA6
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

        //QA7
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

        //QA8
        //A B C C
        /*String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C','D');
        ta = ta.concat(tb);
        System.out.println(ta);*/

        //QA9
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

        //QA10
        //for(int e = 0; e < 5; e += 2)
        // print 1,3,5. starting from 0
        /*int a[] = {1, 2, 3, 4, 5};
        for (int e = 0; e < 5; e += 2) {
            System.out.println(a[e]);
        }*/

        //QA11
        // key words: ONLY Certain fiels and method are accessible from other objects
        //Which statement best describes encapsulation?
        //A. Encapsulation ensures that classes can be designed so that only certain fields and methods of an
        //object are accessible from other objects.
        //B. Encapsulation ensures that classes can be designed so that their methods are inheritable.
        //C. Encapsulation ensures that classes can be designed with some fields and methods declared as
        //abstract.
        //D. Encapsulation ensures that classes can be designed so that if a method has an argument MyType x,
        //any subclass of MyType can be passed to that method.

        //QA12
        //SalesMan.java product.java
        //import sales.*;
        //import sales.product.*;

        //QA13
        //D. acct.changeAmount(0)
        //G. acct.changeAmount(-acct.Amount)
        //H. acct.changeAmount(-acct.getAmount)

        //QA14
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

        //QA15
        //Compliation failed only at line n3 (ex.readCard(cardNo); add exception to method signature.
        /*Test ex = new Test();
        int cardNo = 12344;
        ex.checkCard(cardNo);
        ex.readCard(cardNo);*/

        //QA16
        //Can't use --x, otherwise will be 4321, not 54321
        /*int x = 5;
        while (isAvailable(x)) {
            System.out.println(x);
            x--;
        }*/

        //QA17
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

        //QA18
        // Ans: 5, only loop once, num == 0 always false
        /*int num = 5;
        do {
            System.out.println(num-- + " ");
        } while (num == 0);*/

        //QA19
        // E: Compliation Failed. () ? : tri-factor
        /*int x = 100;
        int a = x++;
        int b = ++x;
        int c = x++;
        int d = (a < b) ? (a <c )? a : (b < c) ? b : c;
        System.out.println(d);*/

        //QA20
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

        //QA21
        //Ans CA: OK to initiate at constructor level
        /*Emp e = new Emp();
        e.salary = 100;
        e.name = "joe";
        e.contract = true;
        System.out.println(e);*/

        //QA22
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

        //QA23
        // Compliation error, needs to add return type like void or something,
        // Compilation fails at line n1 and line n2
        //C c = new C();

        //QA25
        // Ans: int[] array = new int[2]
        /*int[] array = new int[2];
        array[0] = 10;
        array[1] = 20;
        System.out.println(array[0] + " : " + array[1]);*/

        //QA26
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

        //QA27
        //Ans ACE: key words: handlding separated, choose where to handle, tailerod to particular
        //Which three are advantages of the Java exception mechanism?
        // A. Improves the program structure because the error handling code is separated from the normal program
        // function
        //B. Provides a set of standard exceptions that covers all the possible errors
        //C. Improves the program structure because the programmer can choose where to handle exceptions
        //D. Improves the program structure because exceptions must be handled in the method in which they occurred
        //E. Allows the creation of new exceptions that are tailored to the particular program being created

        //QA28
        // Ans: javac to .java file!!!!!
        // javac Greeting.java
        // java Greeting Duke

        //QA30
        // Ans: 0 2 4, just read the code!!!!
        /*int ii = 0;
        int jj = 7;
        for (ii = 0; ii < jj - 1; ii = ii + 2) {
            System.out.println(ii + " ");
        }*/

        //QA31
        // parse needs to pass in !!!, ISO_DATE is ok!
        /*LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2014, 6, 20);
        LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("date3 = " + date3);*/

        //QA32
        // only str1 = str2 can make == true, if new, then still false, NO toString, No "Duke"!!!!!
        /*StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();
        String str2 = "Duke";
        //String str2 = str1; // only str1 = str2 can make == true, if new, then still false
        System.out.println(str1 == str2);*/

        //QA33
        // Ans: A. 10, 10
        // All make 10, as long as static varable, should be same, and finally is the last number;

        //QA34
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

        //QA35
        // it is javac .java and pass in "Hello", so condition is false, then go to print Failure, all is correct,
        // needs to go to the corret place.
        /*if (args[0].equals("Hello") ? false : true) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }*/

        //QA36
        //Ans: BCF???? E, ALL class not all "other" class!!!!
        //Which three statements describe the object-oriented features of the Java language?
        //A. Objects cannot be reused.
        //B. A subclass can inherit from a superclass.
        //C. Objects can share behaviors with other objects.
        //D. A package must contain more than one class.
        //E. Object is the root class of all other objects.
        //F. A main method must be declared in every class.

        //QA37
        //Ans: 4, 5
        /*String[] planet = {"Mercury", "Venus", "Earth", "Mars"};
        System.out.println(planet.length);
        System.out.println(planet[1].length());*/

        //QA38
        //Ans: in outer package, only public variable can be access: Only s is accessible by obj
        /*class Acc{
               int p;
               private int q;
               protected int r;
               public int s;
        }*/


        //QA39
        // Ans : DerivedB DerivedB, child cast to parent, no change, still child
        /*Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        b1 = (Base) b3;
        Base b4 = (DerivedA) b3;
        b1.test();
        b4.test();*/

        //QA40
        // 3 + 4 means string, but (3+4) means int
        //System.out.println("5 + 2 = " + 3 + 4);
        //System.out.println("5 + 2 = " + (3 + 4));

        //QA41
        //checkAge(iList, p-> p.getAge()>40); lambda express!!!!

        //QA42
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

        //QA43
        // false and false, trim() does change any thing, it has some return value, if not, then original doesn't
        // change...
        /*String str = " ";
        str.trim();
        System.out.println(str.equals("") + " and " + str.isEmpty());*/

        //QA44
        // needs to ignore case
        /*String str1 = "Java";
        String str2 = new String("java");
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }*/

        //QA45
        //default int double!!!!
        /*doSum(10, 20);
        doSum(10.0,20.0);*/

        //QA46
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

        //QA47
        // StringBuilder/StringBuffer has internal toString method, customized doesn't, nees to rewrite
        //System.out.println("Hello " + new StringBuilder("Java SE 8"));
        //System.out.println("Hello " + new MyString("Java SE 8"));

        //QA48
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

        //QA49
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

        //QA50
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

        //QA52
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

        //QA53,
        // 15, 30, 75, 60, 90 you are correct!!!
        /*int[] intArr = {15, 30, 45, 60, 75};
        intArr[2] = intArr[4];
        intArr[4] = 90;
        System.out.println(Arrays.toString(intArr));*/

        //QA54
        // two way to write interation. one is use i : intArr, the other is i = 0 to intArr[i]
        /*int[] intArr = {8, 16, 32, 64, 128};
        for (int i : intArr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }*/

        //QA55
        // Ans:
        // 1 can be implemented by using enhanced for loop
        // 3 can NOT be implemented by either the enhanced for loop or standard for loop
        //int[] array = {1, 2, 3, 4, 5};
        //And given the requirements:
        //1. Process all the elements of the array in the order of entry.
        //2. Process all the elements of the array in the reverse order of entry.
        //3. Process alternating elements of the array in the order of entry.

        //QA56
        // 400 200, this static is only for method, not for results, so var don't change, and results is 400 and var
        // is 200
        /*int var = 200;
        System.out.println(doCal(var));
        System.out.println(var);*/

        //QA57
        // Small type can NOT contain big type. Interface can be a type.
        //Given the following class declarations:
        //public abstract class Animal{}
        //public interface Hunter
        //public class Cat extends Animal implements Hunter
        //public class Tiger extends Cat
        //This would fail:
        // ArrayList<Tiger> myList = new ArrayList<>();
        // myList.add(new Cat());

        //QA58
        //java bytecode: it can run on any platform as long as this platform has a java compiler, NO NEED JRE.
        // Then run on JVM or its implementation.

        //QA59
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

        //QA61
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

        //QA62
        // A boolean can NOT be null but Boolean can be null!!!! small boolean no, big Boolean yes. and Boolean is
        // null mean the value is false;
        /*Boolean[] bool = new Boolean[2];
        bool[0] = new Boolean(Boolean.parseBoolean("true"));
        bool[1] = new Boolean(null);

        System.out.println(bool[0] + " " + bool[1]);*/

        //QA63
        // B. B small is in big but big is not small

        //QA64
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

        //QA65 : Efficient / flexible
        //Which two are benefits of polymorphism?
        //B. More efficient code at runtime
        //D. More flexible and reusable code

        //QA66
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

        //QA67
        // == ONLY IF two variable refer to same object, then true. equals() as long as value same, true;

        //QA68
        //employee can't budget, manager can't option hahhah small can't go to big, big can go to small

        //QA69
        //Read carefully, psvm, string[] args

        //QA70
       /* int[][] n = {{1, 3}, {2, 4}};
        for (int i = n.length - 1; i >= 0; i--) {
            for (int j : n[i]) {
                System.out.print(j);
            }
        }*/

        //QA71
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

        //QA72
        //Repeat QA1, 10 Hello World

        //QA73
        //Ans: 9   java space duke, totally 9 character
        /*String s = "JAVA DUKE";
        int len = s.trim().length();
        System.out.println(len);*/

        //QA74
        // command1 : javac Test.java
        // command2 : java Test TRUE null
        //Ans: true, false: null is false by default
        /*boolean a = new Boolean(Boolean.valueOf(args[0]));
        boolean b = new Boolean(args[1]);
        System.out.println(a + " " + b);*/

        //QA75
        // Ans: a: replace n1 with p1.A replace n2 with p1.A and p1.p2.B
        //need to import with specified class, better not use * or total package

        //QA76
        //Ans: sb.delete(int start, int end) sb.delete, sb.replace, sb.append. no remove no deleteAll...
        /*StringBuilder sb = new StringBuilder("abc");
        sb.toString();
        System.out.println(sb + " : " + sb.length());
        sb.delete(0, sb.length());
        System.out.println(sb + " : " + sb.length());*/

        //QA77
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

        //QA78
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

        //QA79
        //Ans: D. expression should be single value. A, no need default, B, no need break, C, can NOT change a runtime
        //Which statement is true about the switch statement?
        //A. It must contain the default section.
        //B. The break statement, at the end of each case block, is mandatory.
        //C. Its case label literals can be changed at runtime.
        //D. Its expression must evaluate to a single value.

        //QA80
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

        //QA81
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

        //QA82
        //Duplicate with QA75, needs to import with specified class, no * better

        //QA83
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

        //QA84
        //Ans: B. int 30, double 30.0.
        //duplicate with QA45. Remember, int/double is default to choose unless other mentioned.

        //QA85
        //Ans: C. A01, B12. Still no calcaulat, then just String
        /*System.out.println("RESULT A" + 0 + 1);
        System.out.println("RESULT B" + (1) + (2));*/

        //QA86
        //Ans: B 10 : 10
        //Duplicate with QA33, static variable only count the last number, 10, 10

        //QA87
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

        //QA88
        //Ans: [0, 0, 30, 40]
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

        //QA89
        //Ans: D. double y1 = 203.22, float flt = y1; is NOT acceptable as this is big to small, overflow;
        //float flt = 100;
        //Float fltA= 100;
        //float flt = (float) 1_11.0;
        //System.out.println(flt);

        //QA90
        // char defalut value is '' (nothing, but it is there), float default value is 0.0, boolean default value is false
        /*Test t = new Test();
        t.printAll();*/

        //QA91
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

        //QA92
        //Ans: C. 5; count carefully, the space is also a character;
        /*String str = "Hello world";
        str.trim();
        int il = str.indexOf(" ");
        System.out.println(il);*/

        //QA93
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

        //QA94
        //Ans: B. Error is extendable, E. Error is a Throwable.
        //Which two statements are true?
        //A. Error class is unextendable.
        //B. Error class is extendable.
        //C. Error is a RuntimeException.
        //D. Error is an Exception.
        //E. Error is a Throwable.

        //QA95
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

        //QA96
        //Ans: C. 2014-7-31
        //1. LocalDateTime(int year, int month, int dayofMonth, int hour, int min)
        //2. method plusXXX only change after, do NOT change original, create new object but original do NOT change!!!!!!!!
        /*LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
        dt.plusDays(30);
        dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));*/

        //QA97
        // Ans: B. "JAVA EE". args.lengths is 0, so false, --> java EE;
        /*int x = args.length;
        if (checkLimit(x)) {
            System.out.println("JAVA SE");
        } else {
            System.out.println("JAVA EE");
        }

        System.out.println(x);*/

        //QA98
        // Ans : C. 13480.0 if everything correct, then just simple add it. underscore usage!!!! as normal!!! just easy to read, nothing else
        /*float var1 = (12_345.01 >= 12_345.00) ? 12_456 : 124_56.02f;
        float var2 = var1 + 1024;
        System.out.println(var2);*/

        //QA99
        //Ans: B. 300 : 100, 200 : 300. simple assign value, won't change anything!!!!!
        /*Test t1 = new Test();
        t1.var = 300;
        System.out.println(t1);
        Test t2 = new Test();
        t2.stVar = 300;
        System.out.println(t2);*/

        //QA101
        //Ans: After line 11, one object is eligible for GC. s2 pointed to s3 and s2 = null, so s2 is the target.

        //QA102
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

        //QA103
        // Ans: runtime exception, compilation no error
        /*LocalDate date = LocalDate.of(2012, 01, 32);
        date.plusDays(10);
        System.out.println(date);*/

        //QA104
        //Ans: B. 10, 22, 22
        /*int i = 10;
        int j = 20;
        int k = j += i / 5;
        System.out.println("i : " + i + " j : " + j + " k : " + k );*/

        //QA105
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

        //QA106
        //Ans: B. 3 5. only initiated, no calling method. so 3 5....
        /*int x = 3, y = 5;
        Test obj = new Test(x, y);
        System.out.println(x + " "+ y);*/

        //QA107
        //Ans: B 10 Hello Hello 11
        /*Test item = new Test();
        item.a1 = 11;
        StringBuilder sb = new StringBuilder("Hello");
        Integer i = 10;
        doProudct(i);
        doString(sb);
        doProudct(item.a1);
        System.out.println(i + " " + sb + " " + item.a1);*/

        //QA108
        //Ans: A compliation failed. lambda expression. no such use
        /*String[] arr = {"hi", "how", "are", "you"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if (arrList.removeIf((String s) -> (return; s.length < =2;))) {
            System.out.println(s + " removed");
        }*/

        //QA109
        //Ans: final vairable must be initilized, final can NOT use with abstract, final means no extendable,
        //     abstract means needs to extend!!!!
        //       D.class A4{
        //            protected static final int i;
        //            private void doStuff(){}
        //        }
        //      E. final abstract class A5{
        //              protected static int i
        //              void doStuff(){}
        //              abstract void doIt();
        //          }

        /*final class A1 {
            public A1() {}
        }*/

        //QA110
        //Ans: A NullPointerException is thrown at runtime;
        //code is ok, but class Studnet doesn't have default constructor, hence no students[0] is generated, cause
        // NullPointerException.
        // Add Student[0] = new Student(null) --> A. null Richar Don. means already initilized.
        /*class Student {

            String name;

            public Student(String name) {
                this.name = name;
            }
        }

        Student[] students = new Student[3];
        students[1] = new Student("Richar");
        students[2] = new Student("Don");
        for (Student s : students) {
            System.out.println(" " + s.name);
        }*/

        //QA111
        //Ans: D. grid[2][0] = 'X' makes three consecutive X in grid. C? grid[0][2] not sure......

        //QA112
        //Ans: C. Welcome Log : 2 1. check ++x and x++, compare first x++, cal first ++x. finally all caled.
        /*int x = 1;
        int y = 0;
        if (x++ > ++y) {
            System.out.println("Hello");
        } else {
            System.out.println("Welcome");
        }
        System.out.println("Log : " + x + " " + y );*/

        //QA113
        //Ans: A. java MyFile 1 3 2 2. needs "Arg is 2", so ar3 value should be 2, the 4th one equals 2.
        //Remeber!!! default pass in args is String!!!!!!!!!
        /*String ar1 = args[1];
        String ar2 = args[2];
        String ar3 = args[3];
        System.out.println("Arg is " + ar3);*/

        //QA114
        //Ans: B. 1 2 3. Carefully count. arr.length = 4, 4-1 = 3, i < 3 so i can only be 0 , 1, 2 which convert to
        // index is arr[0], arr[1], arr[2]. ans is 1 2 3
        /*int[] arr = {1, 2, 3, 4};
        int i = 0;
        do{
            System.out.println(arr[i] + " ");
            i++;
        } while (i < arr.length - 1);*/

        //QA115
        //Ans: B. false, true. read the code....that's it.
        /*Test ts = new Test();
        System.out.print(isAvailable + " ");
        ts.isAvailable = doStuff();
        System.out.print(isAvailable);*/

        //QB1
        //Ans: A. 10 : 10;
        // Duplicated with QA33, QA86. static needs to check the last number

        //QB2
        //Ans: B.D. Keywords: B. return statement must be corrected. D. setRadius method to be protected.
        //A. Remove the area field.
        //B. Change the getArea( ) method as follows:
        //public double getArea ( ) { return Math.PI * radius * radius; }
        //C. Add the following method:
        //public double getArea ( ) { area = Math.PI * radius * radius; }
        //D. Change the cases modifier of the SetRadius ( ) method to be protected.

        //QB3
        //Ans: B.Replacing line 5 with public static void main (String [] args) throws Exception {
        // All exception throws out by needs some one to take care of ,so main method needs throws Exception
        /*class Candidate {
            private final Exception MissingInfoException = new Exception();
            private final Exception AgeOutofBoundException = new Exception();
            String name;
            int age;
            Candidate(String name, int age) throws Exception {
                if (name == null) {
                    throw MissingInfoException;
                } else if (age <= 10 || age > 150) {
                    throw AgeOutofBoundException;
                } else {
                    this.name = name;
                    this.age = age;
                }
            }

            @Override
            public String toString() {
                return "Candidate{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }

        Candidate c = new Candidate("James", 20);
        Candidate c1 = new Candidate("William", 32);
        System.out.println(c);
        System.out.println(c1);*/

        //QB4
        //Ans: E. the loop execute infinite times; while loop never come out, that is the issue part.
        /*int[] arr = {1, 2, 3};
        for (int var : arr) {
            int i = 1;
            while(1 <= var);
            System.out.println(i++);
        }*/

        //QB5
        //Ans:  A: Replace line 8 with : public static void main(String[] args) throws Exception {
        //      C: Replace line 2 with : public void printFileContent() throws IOException {
        //AC, two throws!!!! needs someone to take care the throw out, so throws and throws. AC.

        //QB6
        //Ans: AD, change modifier from public to private. make a copy of content instead of a direct reference.
        //Which two actions will improve the encapsulation of a class?
        //A. Changing the access modifier of a field from public to private
        //B. Removing the public modifier from a class declaration
        //C. Changing the return type of a method to void
        //D. Returning a copy of the contents of an array or ArrayList instead of a direct reference

        //QB7
        // Ans: BE. for abstract class, only use extends, interface use implements. if extends, needs to have method
        // body for the inherited abstract class.
        /*abstract class Shape {
            private int x;
            private int y;
            public abstract void draw();
            public void setAnchor(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }

        abstract class Circle extends Shape {
            private int radius;
        }

        class Circle1 extends Shape {
            private int radius;
            public void draw() {*//*code goes here*//*};
        }*/

        //QB8
        //Ans: D. Compliation failed ONLY at line n3, ex.readCard(CardNo). read define early come late and read use
        // parent. Needs to add exception to method signature.
        /*Test ex = new Test();
        int cardNo = 12344;
        ex.checkCard(cardNo);
        ex.readCard(cardNo);*/

        //QB9
        //Ans: D. Caught java.lang.RuntimeException: Exception
        // check the order of the method to be called, if new RuntimeException is first, the go to catch and
        // everything normal, if error first, then java.lang.Error, Error as Error is not Exception, they are same
        // level inherted from Throwable.
        /*Test t = new Test();
        try {
            t.doPrint();
            t.doList();
        } catch (Exception e) {
            System.out.println("Caught " + e);
        }*/

        //QB10
        //Ans:  A: Replacing <code1> with index > 0 and replacing <code2> with index--;
        //      B. Replacing <code1> with index > 0 and replacing <code2> with --index;
        // AB all ok, so in here there is no difference of --index and index--, just make sure index is > 0
        /*boolean isChecked = false;
        int[] array = {1, 3, 5, 7, 8, 9};
        int index = array.length;
        while (index > 0) {
            if (array[index - 1] % 2 == 0) {
                isChecked = true;
            }
            --index;
        }
        System.out.println(array[index] + " " +isChecked);*/

        //QB11
        //Ans: A: SecurityException C: IllegalArgumentException
        // There is no DuplicatePathException!!!!

        //QB12
        // A method is declared to take three arguments. A program calls this method and passes
        //only two arguments. What is the results?
        //Ans: A. Compilation fails. there will be a red metioning needs more parameter
        //int ans = doSum(5);

        //QB13
        //Ans: A
        //Which statement best describes encapsulation?
        //A. Encapsulation ensures that classes can be designed so that only certain fields and
        //methods of an object are accessible from other objects.

        //QB14
        //Ans: A. sb.insert(0, "Hello ");
        //StringBuilder has insert and append method, but append is simply append to the end and can either take 1
        // parameter or 3 parameter, insert can take from beginning, insert(int index, String s)
        /*StringBuilder sb = new StringBuilder();
        sb.append("world");
        sb.insert(0,"hello ");
        System.out.println(sb);*/

        //QB15
        //The protected modifier on a Field declaration within a public class means that the field
        //Ans: D. Can be read and written from this class and its subclass defined in any package.
        //Though with protected modifier, it is still in public class, thus any package!!!! read the whole sentence!!!

        //QB16
        //Ans: E. compilation failed. internal while condition needs a true or false, not some definition
        /*while(int i = 0; i < 2) {
            i++;
            System.out.println("i = " + i);
        }*/

        //QB17
        //Ans: A. public abstract class Toy {
        //          public abstract class calculate(Toy t);
        //          public void printToy(Toy t) {}
        //      }
        // in abstract class, either declare with abstract, or must have method body, like {}. no final!!!! if use
        // abstract, then no body!!!!
        /*abstract class Toy{
            public abstract int calcuat(Toy t);
            public void printToy(Toy t) {};

        }*/

        //QB18
        //Ans: E. compilation failed at line 8>             System.out.println(number); this line.
        // 1. in try block the variable is local variable, can not use outside the block, must be printed insdie.
        // the scope of the variable number is limited to that block, so trying to access it outside causes a compile
        // time error.
        // 2. Double.valueOf("120D) =====> IS 120.0, NOT 120d
        /*try {
            Double number = Double.valueOf("120D");
        } catch (Exception e) {

        }
        System.out.println(number);*/

        //QB19
        //Ans: C: An exception is thrown at run time:
        // if int[] xx = {}, then no exception, but no print.
        /*int[] xx = null;
        for (int i : xx) {
            System.out.println(i);
        }*/

        //QB20
        //Ans: C. Null 0.0.
        //It is static variable, so at load time this will be initilized with default value
        /*System.out.println(dValue);
        System.out.println(ref);*/

        //QB21
        //Ans: C. compilation fail.
        // remove break, go through all loop and finally reach to "red"; remove continue, when count to 4, simple print out colors[4] maroon
        /*String[] colors = {"red", "blue", "green", "yellow", "maroon", "cyan"};
        int count = 0;
        for (String c : colors) {
            if (count >= 4) {
                break;
            } else {
                continue;
            }
            if (c.length() >= 4) {
                colors[count] = c.substring(0, 3);
            }
            count++;
        }
        System.out.println(colors[count]);*/

        //QB22
        //Ans: B. abstract class Z extends X implements Y {
        //          public void methodZ(){};
        //       }
        //     D. abstract class Z extends X implements Y{ }
        // 1. extends abstract class, implements interface
        // 2. if extends from abstract class, either write all method body, or make it abstract, so that interface is also no need to impletments
        // 3. in abstract class, either make method abstract, or add method body {},  but must write it all
        /*abstract class X {
            public abstract void methodX();
        }
        abstract class Z extends X implements Runnable {
            public void methodZ(){
                System.out.println("do something");
            };
        }*/

        //QB23
        //Ans: C. Replace the code fragment at line n3 with
        //          abstract class Ebook extends Book
        //     D. At line n4 insert
        //          public void setBookMakr(){}
        // 1. extends from super class, then the interface from superclass also come in, so implementation is a must, insert is good.
        // 2. sub class as abstract, with body or without method, all ok
        // 3. in abstract class, if no abstract in method, then body is still needed!!!!!!!!!!
        /*abstract class Book implements Readable {
            public void readBook() {

            }
        }

         class Ebook1 extends Book{
            public void readBook(){}
             public void setBookMark(){}
        }

        abstract class Ebook2 extends Book{
            public void readBook() {

            }
        }*/

        //QB24
        //javac Palidrome.java
        //java palidrome wow mom
        //Ans: B. The code compile, but does not execute.
        /*System.out.println(args[1]);
        return 0;*/

        //QB25
        // Ans: C. 400.0 100.0
        // prd.price needs to change as the object has been instantiation. but newPrice is still there, so there is no change, 400 100;
        /*Product prd = new Product();
        prd.price = 200;
        double newPrice = 100;

        Test t = new Test();
        t.updatePrice(prd, newPrice);
        System.out.println(prd.price + " " + newPrice);*/

        //QB26
        //Duplicate with QB5
        //Ans: A. Replace line 8 with public static void main(String[] args) throws Exception {
        //     C. Replace line 2 with public void printFileContent() throws IOException{
        // AC, adds two throws, needs to take care by someone.

        //QB27
        //Ans: AC
        //A. public void addKwh(double kwh){this.kwh+=kwh; this.bill = this.bill * this.rate;}
        //C. private void addKwh(doubel kwh){if(kwh > 0){this.kwh+=kwh; this.bill = this.bill * this.rate}}
        //private needs compare, public no compare, that's it. simple as it is.

        //QB28
        //Duplicate with QB23
        //Ans: C. Replace the code fragment at line 3 with
        //          abstract class Ebook extends Book {
        //     D. At line 4 insert :
        //          public void setBookMark() {}

        //QB29
        //Ans: B. return x + creditCard.substring(15, 19)
        //     C. Stringbuilder sb = new StirngBuilder(x);
        //        sb.append(creditCard, 15, 19);
        //        return sb.toString();
        // 1. simple return x + substring something, 2. append can take 3 parameter, string s, int start, int end


        //QB30
        //Ans: C. A runtime Error is thrown in the thread "main"
        // 1. yes, it is a infiinte loop cause outofmemeory Error; 2. runtime is just an adj, Error is the correct one. 3. String[] is nothing
        /*ArrayList myList = new ArrayList();
        String[] myArray;
        try {
            while (true) {
                myList.add("My String");
            }
        } catch (RuntimeException e1) {
            System.out.println("Caught a RuntimeException " + e1);
        } catch (Exception e2) {
            System.out.println("Caught an Exception " + e2 );
        }
        System.out.println("Ready to use");*/

        //QB31
        //Ans: D. Compilation failed at line n2 (this(20)),
        // 1. this(), super() needs to be the first line of constructor, can NOT be together!!!
        // 2. However, super(), this.y = y can be in the sample constrctor, still super() needs to be at the first line.
        /*class Vechicle {
            int x;
            Vechicle(){
                this(10);
            }

            Vechicle(int x) {
                this.x = x;
            }
        }

        class Car extends Vechicle {
            int y;
            Car() {
                super();
                //this(20);
            }

            Car(int y) {
                this.y = y;
            }

            public String toString() {
                return super.x + " " + this.y;
            }
        }
        Vechicle y = new Car();
        System.out.println(y);*/

        //QB32
        //Ans: A: public abstract class Toy {
        //              public abstract int calculat(Toy t);
        //              public void printDetails(Toy t) {/*code goes here*/}
        //        }
        //Duplicate with QB17.
        // 1. either abstract method, no method body; or non abstract method with method body
        // 2. in abstrct class there can be method with body.

        //QB33
        //Ans: A. Only A.java compiles successfully.
        // 1. in class B. can NOT declare variable with access modifier within a method. this is for class, method, attributes.
        //    the scope of method is only within the method, so no need to add access modifier within a method body.
        /*class A {
            public void a(){}
            int a;
        }

        class B {
            private int doStuff() {
                private int x = 100;
                return x++;
            }
        }

        class C {
            public void main(String fileName) throws IOException{}
        }*/

        //QB34
        //Ans: D. compilation failed, see class TestCaller

        //QB35
        //Ans: E. Compilation fails both at line n1 and n2. (ans = 0) (System.out.println("Answer = " + ans);*/)
        // Again, check that if out of try{} catch{} block, the variable's scope is only in the block, so ans can not be resolved.
        /*try {
            int num = 10;
            int div = 0;
            int ans = num / div;
        } catch (ArithmeticException ae) {
            ans = 0;
        } catch (Exception e) {
            System.out.println("Invalid calculation");
        }
        System.out.println("Answer = " + ans);*/

        //QB36
        //Ans: D. 100 200 100 0
        // y = this.y ....this only works for confusing people...but int defalut is 0, remember.
        /*class Field {
            int x;
            int y;

            public void doStuff(int x, int y) {
                this.x = x;
                y = this.y;
            }

            public void display(){
                System.out.print(x + " " + y + " ");
            }
        }

        Field m1 = new Field();
        m1.x = 100;
        m1.y = 200;
        Field m2 = new Field();
        m2.doStuff(m1.x, m1.y);
        m1.display();
        m2.display();*/

        //QB37
        //Ans: A. Replace line n1 with :
        //        super();
        //        this.bounds = bounds;
        //     E. Replace line n2 with;
        //        super(type, maxSpeed);
        //        this.bounds = bounds;
        /*class Animal {
            String type = "Canine";
            int maxSpeed = 60;
            Animal (){};

            Animal(String type, int maxSpeed) {
                this.type = type;
                this.maxSpeed = maxSpeed;
            }
        }

        class WildAnimal extends Animal{
            String bounds;

            WildAnimal(String bounds) {
                super();
                this.bounds = bounds;
            }

            WildAnimal(String type, int maxSpeed, String bounds){
                super(type, maxSpeed);
                this.bounds = bounds;
            }
        }
        WildAnimal wolf = new WildAnimal("Long");
        WildAnimal tiger = new WildAnimal("Feline", 80, "Short");
        System.out.println(wolf.type + " " + wolf.maxSpeed + " " + wolf.bounds);
        System.out.println(tiger.type + " " + tiger.maxSpeed + " " + tiger.bounds);*/

        //QB38
        //Duplicated with QB5 and QB26,
        //Ans: A Replace line 2 with public void printFileContent() throws IOExpection {
        //     C Replace line 8 with public static void main(String[] args) throws Exception{

        //QB39
        //Ans. D. static int findMax(int[] num)
        // 1. directly call method, use static, 2. notice the parameter is array, not single number
        /*int[] num = {12, 13, 42, 32, 15, 156, 23};
        int max = findMax(num);
        System.out.println(max);*/

        //QB40
        //Ans: CDF
        // C. A method can have the same name as the field
        // D. A class can have overloaded static method
        // F. The fields needs not to be initialized before use

        //QB41
        //Ans: B. Compilation failed at line n1 and n2
        //Non-static field 'count' cannot be referenced from a static context. Non to static== ok, static to non NO!!
        //Test.displayMsg();
        //Test.displayMsg();

        //QB42
        //Ans: A. Compilation failed at both line n1 and line n2
        // See class Person

        //QB43
        //Which three statements are true about exception handling?
        //Ans: B. All subclasses of RuntimeException class are recoverable.
        //     C. The parameter in a catch block is of Throwable type.
        //     E. All subclasses of the Exception class except RuntimeException class are checked exceptions.
        //Keywords: B. subclasses of runtimeException recoverable
        //          C. parameter in catch Throwable
        //          E. Exception except RuntimeException is checked Exceptions
        // A. Only unchecked exceptions can be rethrown.
        // B. All subclasses of the RuntimeException class are recoverable.
        // C. The parameter in a catch block is of Throwable type.
        // D. All subclasses of the RuntimeException class must be caught or declared to be thrown.
        // E. All subclasses of the Exception class except the RuntimeException class are checked exceptions.
        // F. All subclasses of the Error class are checked exceptions and are recoverable.

        //QB44
        //Ans: D. At line 4 insert public void setBookMark(){}
        // if A, then an abstract class can't be instiatated, so no way to be A
        // ?? NOT sure, but as per test, should be D.
        /*abstract class Book implements Readable {
            public void readBook(){}
        }

        class Ebook extends Book {
            public void readBook(){}
            public void setBookMark(){}

        }

        Book b1 = new Ebook();
        b1.readBook();*/

        //QB45
        //Ans: CDE. either directly assignment the value, or use constructor.
        // Remember, can NOT make default constructor disappear, otherwise the instatiate of object may fail.
        /*CheckingAccount acct = new CheckingAccount();
        //acct.amount = 100;
        System.out.println(acct.amount);*/

        //QB46
        //Ans: E. Compilation fails at both line n1 and line n2.

        //QB47
        //Ans: A. at line1 import clothes.Shirt,
        //        at line2 String color = getColor();

        //QB48
        //Ans: B. Read book????

        //QB49
        //Ans: A. Call the setArea method at the end of setHeight method.
        //     E. change the setArea to private.
        // 1. go through the method and make it the end of last set method.
        // 2. setArea method needs to be private to make more encapsulation.

        //QB50
        //Ans: C. public void printToy() {}
        //     D. public int calculatePrice() {return price}
        //     E. public abstract int computeDiscount()
        //1. in abstract class, method either use abstract without method body, or no abstract with body.
        //2. there can't be any static keyword in abstract class as the static refer to object while abstract class can NOT instaticated.

        //QB51
        //Ans: AE, read carefully and do NOT always trust the docs.
        /*int[] array = {10, 20, 30};
        int x = array.length;*/
        //Option A. correct
        /*while (x > 0) {
            x--;
            System.out.println(array[x]);
        }*/

        //Option B. incorrect
        /*do {
            x--;
            System.out.println(array[x]);
        } while (x >= 0);*/

        //Option E. correct
        /*while (x > 0) {
            System.out.println(array[--x]);
        }*/
    }

    //QB41
    /*int count;
    public static void displayMsg() {
        count++;
        System.out.println("Welcom " + " Visit count : " + count);
    }*/
    //QB39
    /*static int findMax(int[] num) {
        int max = 0;
        for (int i : num) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }*/

    //QB25
    /*public void updatePrice(Product prd,double price) {
        price = price * 2;
        prd.price = prd.price + price;
    }*/

    //QB20
    //static double dValue;
    //static Test ref;

    //QB12
    /*static int doSum(int x, int y) {
        return x + y;
    }*/

    //QB9
    /*public void doList() throws Exception {
        throw new Error("Error");
    }
    public void doPrint() throws Exception {
        throw new RuntimeException("Exception");
    }*/

    //QB8
    /*void readCard(int cardNo) throws Exception{
        System.out.println("Reading Card");
    }

    void checkCard(int cardNo) throws RuntimeException{
        System.out.println("Checking Card");
    }*/


    //QA115
    /*public static boolean doStuff() {
        return !isAvailable;
    }

    static boolean isAvailable = false;*/

    //QA107
    /*int a1;

    public static void doProudct(int a) {
        a = a * a;
    }

    public static void doString(StringBuilder sb) {
        sb.append(" " + sb);
    }*/

    //QA106
    /*int x, y;

    public Test(int x, int y) {
        init(x, y);
    }

    public void init(int x, int y) {
        this.x = x * x;
        this.y = y * y;
    }*/

    //QA100
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


    //QA99
    /*public static int stVar = 100;
    public int var = 200;
    public String toString(){
        return var + " : " + stVar;
    }*/

    //QA97
   /* public static final int MIN = 1;

    public static boolean checkLimit(int x) {
        return (x >= MIN) ? true : false;
    }*/

    //QA90
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


    //QA45
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
        //QA47
        /*class MyString{
            String msg;

            MyString(String msg) {
                this.msg = msg;
            }

        }*/
        //QA15
            /*void readCard(int cardNo) throws Exception{
                System.out.println("Reading Cards");
            }
            void checkCard(int cardNo)  throws RuntimeException{
                System.out.println("Checking Cards");
            }*/

        //QA16
            /*public static boolean isAvailable(int x) {
                return x-- > 0 ? true : false;
            }*/

        //QA39
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



//QA23
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


//QA21
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

// QA109
//final variable must be initilizaed!!!!!
/*class A4{
    protected static final int i;
    private void doStuff(){}
}*/

//QB25
/*class Product {
    double price;
}*/



