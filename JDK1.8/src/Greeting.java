public class Greeting {

    private  String name;

    public Greeting () {
    }

    public Greeting (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 인스턴스 메서드
    public  String hello(String name) {
        return "hello " + name;
    }

    //static 메서드
    public static String hi(String name) {
        return "hi " +name;
    }
}
