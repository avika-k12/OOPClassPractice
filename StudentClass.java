public class StudentClass {
        public String name;
        public int studentID;
        public int grades;

        public StudentClass(String name, int studentID, int grade){
            this.name = name;
            this.studentID = studentID;
            this.grades = grade;
        }

        public String addGrade(int newGrade){
            this.grades = newGrade;
            return this.name + " has a new grade of " + this.grades;
        }

        public String calculateAverage(int grade1, int grade2, int grade3){
            this.grades = (grade1 + grade2 + grade3) / 3;
            return this.name + "'s average grade is: " + this.grades;
        }

        public String displayGrades(int grade1, int grade2, int grade3){
            return this.name + "'s grades are " + grade1 + ", " + grade2 + " and " + grade3;
        }

}
