public class dog extends animal{
    public void sleep() {
        System.out.println(this.name+" zzz");
    }

    public static void main(String[] args) {
        dog dog1 = new dog();
        dog1.setName("poppy");
        System.out.println(dog1.name);
        dog1.sleep();
    }
}
