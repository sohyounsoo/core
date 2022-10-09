package hello.core.Singletion;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    // 객체 인스터스가 필요하면 이 static 메서드를 통해서만 조회되도록
    public static SingletonService getInstance() {
        return instance;
    }

    //private로 외부에서 new 키워드를 쓰지 못하게 막는다.
    private SingletonService() {

    }

    private void logic() {
        System.out.println("객체 출력");
    }
}
