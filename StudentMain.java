public class StudentMain {
    public static void main(String[] args){
        StudentClass Banu = new StudentClass("Banu", 2312, 9);
        StudentClass Grace = new StudentClass("Grace", 1004, 10);

        System.out.println(Banu.addGrade(12));
        System.out.println(Grace.calculateAverage(10,12,8));
        System.out.println(Banu.displayGrades(9,12,7));
    }
}
