public class studentmain {
    public static void main(String[] args) {
        studentDerived s = new studentDerived("Prathmesh", 5053, 95);
        s.display();
    }
}

class student {
    String name;
    int rollno;
    int marks;

    student(String n, int r, int m) {
        name = n;
        rollno = r;
        marks = m;
    }
}

interface in {
    public void display();
}

class studentDerived extends student implements in {
    studentDerived(String na, int ro, int mr) {
        super(na, ro, mr);
    }

    public void display() {
        System.out.println("name : " + name);
        System.out.println("Roll no : " + rollno);
        System.out.println("Marks : " + marks);
    }

}
