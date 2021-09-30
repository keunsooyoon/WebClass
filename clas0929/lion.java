public class lion extends animal implements predator, bark{
    public String getFood(){
        return "banana";
    }

    public void barkable() {
        System.out.println("으르렁");
    }
}
