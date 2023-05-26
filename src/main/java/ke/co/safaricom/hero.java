package ke.co.safaricom;

import java.util.ArrayList;

     public class hero {
         private String name;
         private int age;
         private final int id;
         private ArrayList<String> powers;
         private ArrayList<String> weaknesses;
         private static ArrayList<hero> instances = new ArrayList<hero>();
         private int squadId;

         public hero(String name, int age, ArrayList<String> powers, ArrayList<String> weaknesses, int squadId){
             this.name=name;
             this.age=age;
             this.powers=powers;
             this.weaknesses=weaknesses;
             instances.add(this);
             this.id = instances.size();
         }
         // create get methods

         public String getName(){
             return name;
         }

         public int getAge(){
             return age;
         }

         public ArrayList<String> getPowers() {
             return powers;
         }


         public ArrayList<String> getWeaknesses() {
             return weaknesses;
         }

         public int getId() {
             return id;
         }

         public static ArrayList<hero> getAll(){
             return instances;
         }
         public static void clearAll(){
             instances.clear();
         }


         public static hero findById(int id){
             return  instances.get(id-1);
         }
         public void deleteHero(){
             instances.remove(id-1);
         }
         public void update(String name, int age, ArrayList<String>  powers, ArrayList<String> weaknesses){
             this.name = name;
             this.age = age;
             this.powers = powers;
             this.weaknesses = weaknesses;
}        }