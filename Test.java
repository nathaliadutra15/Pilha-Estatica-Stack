public class Test {
    public static void main(String[] args) {

        //Testing the stack
        Stack s = new Stack(5);

        s.push(10);
        s.push(21);
        System.out.println(s.pop());
        s.push(44);
        s.push(78);
        s.push(67);
        System.out.println(s.pop());

        System.out.println(s.size());
    }
    
}
