package quack;

public class SimpleQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("simple quack");
    }
}
