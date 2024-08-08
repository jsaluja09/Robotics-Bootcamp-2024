public class person {
    public int age = 16;

    String name = "Carter";
    public void print_age() {
        System.out.println("Age: " + age);
    }
    
    public  void make_older() {
        age++;
    }

    public void make_younger() {
        age--;
    }

    public void new_attributes (int new_age, String new_name)
    {
        age = new_age;
        name = new_name;
    }

    public int get_age () {
        return age;
    }
}
