public class housedog extends dog{

    public housedog(String name) {
        this.setName(name);
    }
    //생성자 1 클래스명과 동일 2. 리턴없다. 

    public void sleep() {  //매서드 오버라이딩
        System.out.println(this.name+" zzz in house");
    }

    public void sleep(int hour) {  //매서드 오버로딩
        System.out.println(this.name+" zzz in house for "+ hour + "hour(s)");
    }

    public static void main(String[] args) {
        housedog housedog1 = new housedog("happy");
      //housedog1.setName("happy");  //할아버지
        housedog1.sleep(3); //부모 -> 자신
    }
    
}
