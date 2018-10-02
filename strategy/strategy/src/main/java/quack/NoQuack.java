package quack;

public class NoQuack  implements IQuackBehavior{

    @Override
    public void quack() {
        System.out.println("no quack");
    }
}
