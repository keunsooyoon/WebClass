public class ExceptExam {
    /*
     예외 처리 : 오류처리 에러처리
     프로그램을 실행 중 어떤 원인에 의해서 오작동을 하거나 비정상적으로 종료되는 경우가 발생한다. 이것을 오류 그리고 예외라고 한다. 
     발생 시점에 따라 '컴파일 에러'와 '런타임 에러'가 있다. 말 그대로 컴파일 에러는 컴파일할 발생하여 프로그램이 시작조차 되지 않은 에러이다. 
     런타임에러는 프로그램이 시작 되고 사용하다가 실행 도중에 발생하는 에러이다. 

            - 컴파일에러는 컴파일시 발생하는 에러
            - 런타임에러는 실행중 발생하는 에러

           (- 논리적에러는 실행은 되지만 의도와 다르게 동작하는 에러 )

    Try-catch 구문    

    Try {
        //예외가 발생할 가능성이 있는 구문 
    } catch {
        //예외 발생 시 처리
    }

    Try {
        //예외가 발생할 가능성이 있는 구문 
    } catch {
        //예외 발생 시 처리
    } finally {
        //예외 발생 여부와는 상관없이 항상 실행
    }


    Try {
        //예외가 발생할 가능성이 있는 구문 
    } catch {
        //예외 발생 시 처리
    } catch {
        //예외 발생 시 처리
    } finally {
        //예외 발생 여부와는 상관없이 항상 실행
    }



    */

    public static void main(String[] args) {
        int c = 4 / 0;
        System.out.println(c);
    }
}