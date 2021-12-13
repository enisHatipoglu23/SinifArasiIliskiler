public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Enis", "Hatipoğlu",
                12345, "1007", 90);
        Student st2 = new Student("Yağmur", "Hatipoğlu",
                23, "1007", 90);

        Instructor instructor1 = new Instructor("Mamut", "Lolo",
                "pc");


        //Composition, Agretation
        //Course *has a* Instructor (Course içerisinde Instructor çağırılıyor.)
        Course MAT101 = new Course("MAT101",
                "101", instructor1);
        System.out.println(MAT101.getInstructor().getName());

        //Student[] stu = {st1, st2};

        //System.out.println("Avr : " + MAT101.calcAvarage(stu));




    }
}