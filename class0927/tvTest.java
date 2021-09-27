public class tvTest {
    public static void main(String[] args) {
        captiontv ctv = new captiontv();
        ctv.channel = 10;
        ctv.channelUp();

        System.out.println(ctv.channel);

        // tv 클래스로부터 상속받고 기능을 추가한 captiontv 
        // 클래스를 이용해서 ctv객체를 생성하였다. ctv를 생성한  
        // caption 클래스에는 channel 변수도 없고 channelUp이라는 
        // 매서드도 없지만 tv를 상속 받았기 때문에 tv에 있는 
        // channel 변수랑 channleUp 매서드를 사용할 수 있다. 



        // 자바는 다중상속을 지원하지 않는다. 
        // 자바는 오직 단일 상속만 지원한다. 예를들어  tv클래스와 
        // vcr클래스 동시에 상속받을 수 없다. 하나만 선택해야만 한다. 


        // class vcrtv extends tv, vcr    <- 다중상속 금지... 

        
    }
}
