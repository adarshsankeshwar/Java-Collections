//Collections :::>

//a) List Interfaces

//1)ArrayList

import java.util.*;
public class ArrayList {
        public static void main(String[] args) {
            ArrayList<String> students = new ArrayList<>();

            //Adding
            students.add("Arava");
            students.add("Diya");
            students.add("Kabir");

            for(String student:students){
                System.out.println(student);
            }

            students.add("Abhi");
            System.out.println(students);

            //Remove
            students.remove("Diya");
            System.out.println(students);

            //get
            System.out.println(students.get(1));

            //sort
            Collections.sort(students);
            System.out.println(students);
        }
}


//Example
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {

        // 1. Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // 2. Add elements
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(20);
        list.add(40);

        System.out.println("Original List: " + list);

        // 3. Sort (ascending)
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // 4. Reverse
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        // 5. Shuffle (random order)
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);

        // 6. Find max and min
        System.out.println("Max: " + Collections.max(list));
        System.out.println("Min: " + Collections.min(list));

        // 7. Binary search (list must be sorted)
        Collections.sort(list);
        int index = Collections.binarySearch(list, 30);
        System.out.println("Index of 30: " + index);

        // 8. Frequency (count occurrences)
        list.add(30);
        System.out.println("Frequency of 30: " + Collections.frequency(list, 30));

        // 9. Replace all occurrences
        Collections.replaceAll(list, 30, 99);
        System.out.println("After Replace: " + list);

        // 10. Fill (replace all elements)
        Collections.fill(list, 5);
        System.out.println("After Fill: " + list);

        // 11. Copy (need same size list)
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(0);
        newList.add(0);
        newList.add(0);
        newList.add(0);
        newList.add(0);

        Collections.copy(newList, list);
        System.out.println("Copied List: " + newList);

        // 12. Swap elements
        Collections.swap(newList, 0, 4);
        System.out.println("After Swap: " + newList);

        // 13. Check disjoint
        boolean disjoint = Collections.disjoint(list, newList);
        System.out.println("Disjoint: " + disjoint);
    }
}



//Iterable Interface

import java.util.*;
public class Iterable {
        public static void main(String[] args) {
            ArrayList<Integer> al = new ArrayList<>();
            al.add(1);
            al.add(2);
            al.add(3);
            al.add(4);

            for(Integer num : al){
                System.out.println(num);
            }
        }
}


//Using Iterator Manually 
import java.util.*;
public class Iterator {
        public static void main(String[] args) {
            ArrayList<Integer> al = new ArrayList<>();
            al.add(1);
            al.add(2);
            al.add(3);
            al.add(4);

            Iterator<Integer> num = al.iterator();
            while(num.hasNext()) {
                System.out.println(num.next());
            }
        }
}



//2) LinkedList

import java.util.*;
public class LinkedList {
        public static void main(String[] args){
                LinkedList<Integer> ll = new LinkedList<>();
                ll.add(1);
                ll.add(3);
                ll.add(5);
                ll.add(2);
                ll.add(2);
                
                for(Integer res : ll){
                        System.out.println(res);
                }

                ll.addFirst(7);
                ll.addLast(9);
                ll.add(3,11);
                System.out.println(ll);

                ll.removeFirst();
                ll.removeLast();
                ll.remove(2);
                System.out.println(ll);

                System.out.println(ll.getFirst());
                System.out.println(ll.getLast());
                System.out.println(ll.get(2));

                System.out.println(ll.size());
                System.out.println(ll.isEmpty());
        }
}


//Generics --->

//1) Generic Class

public class Win{
        public static void main(String[] args) {
            
                Box<Integer> intBox = new Box<>();
                intBox.set(1);
                System.out.println(intBox.get());

                Box<String> strBox = new Box<>();
                strBox.set("Rama");
                System.out.println(strBox.get());
        }
}
class Box<T> {
        T value;
        void set(T value){
                this.value = value;
        }
        T get() {
                return value;
        }
}



//2) Generic Methods
public class Win{
        public static void main(String[] args) {
            displayItem("Book");
            displayItem(123);
            displayItem(45.99);
        }
        public static <T> void displayItem(T item){
                System.out.println(item);
        }
}



//b) Queue Interfaces 
 
//1)ArrayDeque

import java.util.*;
public class ArrayDeque {
        public static void main(String[] args){
                ArrayDeque<Integer> dq = new ArrayDeque<>();
                dq.add(1);
                dq.add(2);
                dq.add(3);
                dq.add(4);
                dq.add(5);
                dq.add(6);
                System.out.println(dq);

                dq.addFirst(0);
                dq.addLast(9);
                System.out.println(dq);

                dq.removeFirst();
                dq.removeLast();
                System.out.println(dq);

                
                System.out.println(dq.peekFirst());
                System.out.println(dq.peekLast());

                dq.pop(); // remove from the front
                System.out.println(dq);

                dq.push(100); // add at front
                System.out.println(dq);

                System.out.println(dq.contains(10)); 

        }
}



//2) PriorityQueue

import java.util.*;
public class PriorityQueue {
        public static void main(String[] args) {
                PriorityQueue<Integer> pq = new PriorityQueue<>();
                pq.add(40);
                pq.add(39);
                pq.add(90);
                pq.add(10);
                pq.add(29);
                System.out.println(pq);
        }
}



//Max-Heap(Reverse Order)
import java.util.*;
public class PriorityQueue {
        public static void main(String[] args) {
                PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
                pq.add(40);
                pq.add(39);
                pq.add(90);
                pq.add(10);
                pq.add(29);
                System.out.println(pq);
        }
}


//c) Set Interfaces

 //1)HashSet ---->

import java.util.*;
public class HashSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(100);
        hs.add(50);
        hs.add(150);
        hs.add(25);
        hs.add(75);
        hs.add(125);
        hs.add(175);
        System.out.println(hs);
    }
}


//2) LinkedHashSet --->

import java.util.*;
public class LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(100);
        lhs.add(50);  
        lhs.add(150);
        lhs.add(25);
        lhs.add(75);
        lhs.add(125);
        lhs.add(175);
        System.out.println(lhs);
    }
}


//3) TreeSet--->

import java.util.*;
public class TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        System.out.println(ts);
        System.out.println(ts.contains(50));

        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.remove(100));
        System.out.println(ts);

        System.out.println(ts.last());
        System.out.println(ts.headSet(75));
        System.out.println(ts.tailSet(100));
        System.out.println(ts.ceiling(75));
        System.out.println(ts.floor(75));
        System.out.println(ts.ceiling(74));
        System.out.println(ts.floor(74));

        System.out.println(ts.higher(75));
        System.out.println(ts.lower(75));

        System.out.println(ts.subSet(75, 175));

        //System.out.println(ts.subSet(75,true));      
    }  
}



//HashCode() & equals()---->

//Basic example 1

public class Main {
        public static void main(String[] args) {
                String str = new String("Ramu");
                System.out.println(str);
                Student stu = new Student("Raju");
                System.out.println(stu);

        }
}
class Student{
        private String name;
        public Student(String name){
                this.name = name;
        }
        public String getName(){
                return name;
        }
        public void setName(){
                this.name = name;
        }
        @Override
        public String toString(){
                return name;
        }
}



//Basic example 2

public class Main {
        public static void main(String[] args) {
                Student stu1 = new Student("Raju");
                Student stu2 = new Student("Ram");
                Student stu3 = new Student("Raju");
                System.out.println((stu1 == stu2));
                System.out.println((stu1 == stu3));

                System.out.println(stu1.equals(stu2));
                System.out.println(stu1.equals(stu3));

        }
}
class Student{
        private String name;
        public Student(String name){
                this.name = name;
        }
        public String getName(){
                return name;
        }
        public void setName(){
                this.name = name;
        }
        @Override
        public String toString(){
                return name;
        }

        @Override
        public boolean equals(Object obj){
                Student ref = (Student) obj;
                if(this.name.equals(ref.name)){
                        return true;
                }else
                        return false;
        }
}


//example 1
import java.util.*;
//pojo
class Student{
        private String name;
        private int age;

        public Student(String name, int age){
            super();
            this.name=name;
            this.age=age;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age=age;
        }
        public String getName() {
            return name;
        }
        @Override  
            public boolean equals(Object obj) {
                if(this == obj) return true;
                if(obj == null || getClass() != obj.getClass())  return false;
                
                Student ref = (Student) obj;
                return age == ref.age && name.equals(ref.name);
            }
            @Override
            public int hashCode() {
                return Objects.hash(name, age);
            }

            @Override
            public String toString(){
                return name+" "+age;
            }
        }
    

public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student("Rama", 22);
        Student stu2 = new Student("Ravana", 24);
        Student stu3 = new Student("Rama", 22);

        LinkedHashSet hs = new LinkedHashSet();
        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);
        System.out.println(hs);
    }
}




//ComparaTo() ---->

//example 1

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int id;
    String name;
    int marks;
    public Student(int id, String name, int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }

    @Override
    public String toString(){
        return "(id="+id+", name=" +name+", marks=" +marks+")";
    }

    @Override
    public int compareTo(Student o){
        return this.name.compareTo(o.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(123,"Bhaskar",58);
        Student s2 = new Student(120,"Anil",55);
        Student s3 = new Student(90,"Abhi",99);

        ArrayList al = new ArrayList();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }
}


//example 2

import java.util.*;
public class Win{
        public static void main(String[] args) {
            Student s1 = new Student(11,"Ram",20);
            Student s2 = new Student(2,"Anuj",24);
            Student s3 = new Student(32, "Bharat", 34);

            ArrayList al = new ArrayList<>();
            al.add(s1);
            al.add(s2);
            al.add(s3);
            System.out.println(al);
            Collections.sort(al);
            System.out.println(al);
        }
}
class Student implements Comparable<Student> {
        int id;
        String name;
        int age;
        public Student(int id, String name, int age) {
                this.id = id;
                this.name = name;
                this.age = age;
        }
        @Override
        public String toString() {
                return "id: " + id + " Name: " + name +" Age: "+age;
        }
        @Override
        public int compareTo(Student Obj){
                return Integer.compare(this.id, Obj.id);
        }
}




//Comparator ---->

//example 1

import java.util.*;
class Student {
    int id;
    String name;
    int age;
    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + " - " + age;
    }
}
public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Ram", 20));
        list.add(new Student(2, "Anuj", 24));
        list.add(new Student(3, "Bharat", 18));

        // Sort by age
        list.sort(Comparator.comparingInt(s -> s.age));
        System.out.println("By age: " + list);

        // Sort by name
        list.sort(Comparator.comparing(s -> s.name));
        System.out.println("By name: " + list);

        // Sort by id
        list.sort(Comparator.comparingInt(s -> s.id));
        System.out.println("By id: " + list);
    }
}



//example 2

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
   int id;
   String name;
   int marks;
   public Student(int id, String name, int marks){
       this.id=id;
       this.name=name;
       this.marks=marks;
   }
   public int getId(){
       return id;
   }
   public void setId(int id){
       this.id=id;
   }
   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name=name;
   }
   public int getMarks(){
       return marks;
   }
   public void setMarks(int marks){
       this.marks=marks;
   }

   @Override
   public String toString(){
       return "(id="+id+", name=" +name+", marks=" +marks+")";
   }

}

class Sample implements Comparator<Student> {

   @Override
   public int compare(Student o1, Student o2) {
       if(o1.id > o2.id) {
           return 1;
       } 
       else if(o1.id < o2.id) {
           return -1;
       } 
       else
           return 0;
   }
}
public class Main {
   public static void main(String[] args) {
       Student s1 = new Student(123,"Bhaskar",58);
       Student s2 = new Student(120,"Anil",55);
       Student s3 = new Student(90,"Abhi",99);

       ArrayList al = new ArrayList();
       al.add(s1);
       al.add(s2);
       al.add(s3);
       System.out.println(al);
       Sample sam = new Sample();
       Collections.sort(al, sam);
       System.out.println(al);
   }
}




//Same code but Using Lambda Expressions--->

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
   int id;
   String name;
   int marks;
   public Student(int id, String name, int marks){
       this.id=id;
       this.name=name;
       this.marks=marks;
   }
   public int getId(){
       return id;
   }
   public void setId(int id){
       this.id=id;
   }
   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name=name;
   }
   public int getMarks(){
       return marks;
   }
   public void setMarks(int marks){
       this.marks=marks;
   }

   @Override
   public String toString(){
       return "(id="+id+", name=" +name+", marks=" +marks+")";
   }
}
class Sample implements Comparator<Student> {

   @Override
   public int compare(Student o1, Student o2) {
       if(o1.id > o2.id) {
           return 1;
       } 
       else if(o1.id < o2.id) {
           return -1;
       } 
       else
           return 0;
   }
}
public class Main {
   public static void main(String[] args) {
       Student s1 = new Student(123,"Bhaskar",58);
       Student s2 = new Student(120,"Anil",55);
       Student s3 = new Student(90,"Abhi",99);

       ArrayList al = new ArrayList();
       al.add(s1);
       al.add(s2);
       al.add(s3);
       System.out.println(al);
       Sample sam = new Sample();
       Collections.sort(al, (Student o1, Student o2) -> o1.name.compareTo(o2.name));
       System.out.println(al);
   }
}




//Descending Order -- String

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
   int id;
   String name;
   int marks;
   public Student(int id, String name, int marks){
       this.id=id;
       this.name=name;
       this.marks=marks;
   }
   public int getId(){
       return id;
   }
   public void setId(int id){
       this.id=id;
   }
   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name=name;
   }
   public int getMarks(){
       return marks;
   }
   public void setMarks(int marks){
       this.marks=marks;
   }

   @Override
   public String toString(){
       return "(id="+id+", name=" +name+", marks=" +marks+")";
   }
}
class Sample implements Comparator<Student> {

   @Override
   public int compare(Student o1, Student o2) {
       if(o1.name.compareTo(o2.name)>0) {
           return -1;
       } 
       else if(o1.name.compareTo(o2.name)<0) {
           return 1;
       } 
       else
           return 0;
   }
}
public class Main {
   public static void main(String[] args) {
       Student s1 = new Student(90,"Bhaskar",58);
       Student s2 = new Student(120,"Anil",55);
       Student s3 = new Student(123,"Abhi",99);

       ArrayList al = new ArrayList();
       al.add(s1);
       al.add(s2);
       al.add(s3);
       System.out.println(al);
       
       Collections.sort(al, new Sample());
       System.out.println(al);
   }
}



//Decending Order - int Integer

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
   int id;
   String name;
   int marks;
   public Student(int id, String name, int marks){
       this.id=id;
       this.name=name;
       this.marks=marks;
   }
   public int getId(){
       return id;
   }
   public void setId(int id){
       this.id=id;
   }
   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name=name;
   }
   public int getMarks(){
       return marks;
   }
   public void setMarks(int marks){
       this.marks=marks;
   }

   @Override
   public String toString(){
       return "(id="+id+", name=" +name+", marks=" +marks+")";
   }
}
public class Main {
   public static void main(String[] args) {
       Student s1 = new Student(90,"Bhaskar",58);
       Student s2 = new Student(120,"Anil",55);
       Student s3 = new Student(123,"Abhi",99);

       ArrayList al = new ArrayList();
       al.add(100);
       al.add(50);
       al.add(150);
       al.add(25);
       al.add(75);
       al.add(125);
       al.add(175);
       System.out.println(al);
       Comparator<Integer> c = Collections.reverseOrder();
       Collections.sort(al,c);
       System.out.println(al);
   }
}


//example 2

import java.util.*;
public class Winslide{
   public static void main(String[] args) {
      
       ArrayList al = new ArrayList();
       al.add(100);
       al.add(50);
       al.add(150);
       al.add(25);
       al.add(75);
       al.add(25);
       al.add(175);
       System.out.println(al);
       System.out.println(Collections.binarySearch(al, -60));
       System.out.println(Collections.min(al));
       System.out.println(Collections.max(al));
       System.out.println(Collections.frequency(al,  25));
       Collections.replaceAll(al,  25,  999);
       System.out.println(al);    
   }
}



//Map Interfaces --->

//1) HashMap 

import java.util.*;
public class HasHMap {
    public static void main(String[] args){
        Map<Integer, String> restaurantMap = new HashMap<>();
        restaurantMap.put(101,"The Spicy");
        restaurantMap.put(101,"The Spicy");

        restaurantMap.put(102,"Pizza");
        restaurantMap.put(103,"Burger");

        System.out.println("Restaurant Map: "+restaurantMap);

        Retrieve A valuse
        String restaurant = restaurantMap.get(102);
        System.out.println(restaurant);

        Remove a value
        restaurantMap.remove(101);
        System.out.println(restaurantMap);

        Check contains()
        boolean hasRestorant = restaurantMap.containsKey(102);
        System.out.println(hasRestorant);

        keySet()
        Set<Integer> keys = restaurantMap.keySet();
        System.out.println(keys);

        values
        Collection<String> values = restaurantMap.values(); 
        System.out.println(values);

        
    }
}


//2) LinkedHashMap

import java.util.LinkedHashMap;

public class LinkedHashMap {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map =
                new LinkedHashMap<>();

        // Adding key-value pairs
        map.put(101, "Rahul");
        map.put(102, "Anu");
        map.put(103, "David");
        map.put(104, "Kiran");

        System.out.println(map);
    }
}




//3) TreeMap
import java.util.*;
public class TreeMap {
        public static void main(String[] args){
                Map<String, String> productMap = new TreeMap<>();
                productMap.put("Orange1","P:120");
                productMap.put("Apple","P:120");
                productMap.put("Orange","P:90");
                productMap.put("Banana","P:40");
                System.out.println(productMap);

                String price = productMap.get("Banana");
                System.out.println(price);

                productMap.remove("Apple");
                System.out.println(productMap);
        }
}



//WeakHashMap --->

import java.util.*;
public class WeakHashMap {
        public static void main(String[] args){
                String key1 = new String("100");
                String key2 = new String("50");
                String key3 = new String("150");
                String key4 = new String("25");
                String key5 = new String("75");

                HashMap<String, String> hm = new HashMap<String, String>();
                hm.put(key1, "Rama");
                hm.put(key2, "Sita");
                hm.put(key3, "Hanama");
                hm.put(key4, "Lakshmana");
                hm.put(key5, "Bharata");
                hm.put("110","Ravana");

                System.out.println(hm);

                System.gc();

                for(int i=0; i<= 50000; i++){
                        System.out.print("");
                }
                System.out.println();
                System.out.println(hm);

                WeakHashMap<String, String> whm = new WeakHashMap<String, String>();
                whm.put(key1, "Yudhistira");
                whm.put(key2, "Bheema");
                whm.put(key3, "Arjuna");
                whm.put(key4, "Nakula");
                whm.put(key5, "Sahadeva");
                whm.put(new String("110"), "Karna");
                System.out.println(whm);

                System.gc();

                for(int i=0; i<= 50000; i++){
                        System.out.print("");
                }

                System.out.println(whm);
        }
}



//IdentityHashMap

import java.util.*;
public class IdentitityHAshMap {
        public static void main(String[] args) {
            String s1 = new String("Dominos");
            String s2 = new String("Dominos");
            String s3 = new String("Papa Jones");
            String s4 = new String("Pizza Hut");

            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put(s1, "BTM");
            hm.put(s2, "Koramangala");
            hm.put(s3, "Marathalli");
            hm.put(s4, "Sarjapura");
            System.out.println(hm);

            IdentityHashMap<String, String> ihm = new IdentityHashMap<String, String>();
            ihm.put(s1, "BTM");
            ihm.put(s2, "Koramanaga");
            ihm.put(s3, "Marathalli");
            ihm.put(s4, "Sarjapura");
            System.out.println(ihm);

        }
}