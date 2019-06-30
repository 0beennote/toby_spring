# 4장 예외

## 초난감 예외처리

* 모든 예외는 적절하게 복구되든지 아니면 작업을 중단시키고 운영자 또는 개발자에게 분명하게 통보돼야 한다.
* 긴 예외들을 처리하는 코드를 매번 thorws로 선언하기도 귀찮아져서 메소드 선언에 throws Exception을 기계적으로 붙이는 경우는 지양해야한다.

## 예외의 종류와 특징

#### Error
* java.lang.Error 클래스의 서브클래스들.
* 자바 VM에서 발생시키는 시스템 에러이므로 catch 블록으로 잡아봤자 아무런 대응 방법이 없다.

#### Exception과 체크 예외
* java.lang.Exception 클래스와 그 서브클래스들.
* 개발자들이 만든 애플리케이션 코드의 작업 중에 예외상황이 발생했을 경우에 사용.
* 체크 예외: Exception 클래스의 서브클래스이면서 RuntimeException 클래스를 상속하지 않은 것들.
* 언체크 예외: RuntimeException을 상속한 클래스들.
* RuntimeException은 Exception의 서브클래스이고 자바는 RuntimeException과 그 서브클래스를 특별하게 다룬다.
* 일반적으로 예외라고 하면 체크 예외라고 생각해도 된다.

#### RuntimeException과 언체크/런타임 예외
* java.lang.RuntimeException 클래스를 상속한 예외들.
* 명시적인 예외처리를 강제하지 않기 때문에 언체크 예외라고 불리거나 런타임 예외라고 불린다.
* 에러와 마찬가지로 catch 문으로 잡거나 throws를 선언하지 않아도 된다.
* 주로 프로그램의 오류가 있을 때 발생하도록 의도된 것들이다. ex) NullPointerException, IllegalArgumentException 등

#### 예외처리의 현실?
* 체크 예외가 예외처리를 강제하는 것 때문에 예외 블랙홀이나 무책임한 throws 같은 코드가 남발하며 비난의 대상이 되기도 했다.

