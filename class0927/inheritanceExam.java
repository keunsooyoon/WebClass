public class inheritanceExam {
    
    /*
    상속 inheritance
    상속은 기존의 클래스를 재사용하여 새로운 클래스 작성한다. 상속을 통해서 클래스를 작성하면
    보다 적은 양의 코드로 새로운 클래스를 만들 수 있다. 코드를 공통적으로 관리할 수 있기 때문에
    코드의 추가 및 변경 등 업그레이드가 매우 용이하다. 

    이런 특징은 코드의 재사용성을 높이고 코드의 중복을 제거하여 프로그램의 생산성과 유지보수에
    크게 기여한다. 

    class childClass extends parentClass {
        
    }
    
    parentClass 조상클래스 부모클래스 상위클래스 기반클래스
    childClass  자손클래스 자식클래스 하위클래스 파생클래스


    class parent {
        int age;
    }

    class child extends parent {

    }

    int age 는  parent 의 멤버이기도 하고 동시에 child의 멤버이기도하다. (상속)



        class parent {
            int age;
        }

        class child extends parent {
            int money;
        }

    int age 는  parent 의 멤버이기도 하고 동시에 child의 멤버이기도하지만...
    int money는 오로지 child의 멤버이다. child 클래스에 새로운 코드가 추가되어도 
    부모인  parent 클래스는 아무런 영향을 받지 않는다. 즉 가져다 쓸수 없다. 
    주소 상속을 거듭할 수록 상속 받는 자식의 기능이 늘어난다. 
    상속을 확장한다extend 라는 개념으로 해석할 수 있다. 

    - 자식 클래스의 멤버 개수는 조상 클래스보다 항상 많거나 같다. 
    - 생성자와 초기화 블럭은 상속되지 않는다. 멤머만 상속된다. (!?!)

    */
}
