class Student {
 

        String name;
        int roll;
        int age;

        Student s[] = new Student[3];

        Student s1 = new Student();

        s1.name = "Anwesha";
        s1.roll = 1;
        s1.age = 20;

        Student s2 = new Student();

        s2.name = "Avinava";
        s2.roll = 2;
        s2.age = 21;

        Student s3 = new Student();

        s3.name = "Isha";
        s3.roll = 3;
        s3.age = 21;

        for(Student stud : s)
        System.out.println("Name : "+stud.name+" age : "+stud.age+" roll : "+roll);



    
}