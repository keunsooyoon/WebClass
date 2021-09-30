public class tiger extends animal implements predator, bark{
    public String getFood(){
        return "apple";
    }

    public void barkable() {
        System.out.println("어흥");
    }
}
