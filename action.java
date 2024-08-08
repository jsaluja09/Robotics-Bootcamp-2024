public class action {

    
    public static void main(String[] args) {
        person Carter = new person();
        Carter.print_age();
        Carter.make_older();
        Carter.print_age();
        Carter.make_younger();
        Carter.print_age();
        Carter.new_attributes(20, "John");
        Carter.get_age();
    }
}
