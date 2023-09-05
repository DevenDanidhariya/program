package Prectical.Encapsulation;


class Employ {
    private String employName;
    private int age;
    private  int salary;

    public String getEmployName() {
        return employName;
    }

    public void setEmployName(String employName) {
        this.employName = employName;
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
}


public class DataEncapsulation {
    public static void main(String[] args) {
        Employ ref = new Employ();

        ref.setEmployName("Deven");
        ref.setAge(21);
        ref.setSalary(5000);

        ref.getEmployName();
        ref.getAge();
        ref.getSalary();

        System.out.println("Employ Name:"+ref.getEmployName());
        System.out.println("age of Employ:"+ ref.getAge()+"years");
        System.out.println("Salary of Employ:"+ ref.getSalary()+"RS");
    }
}
