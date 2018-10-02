import fly.IFlyBehavior;
import lombok.Data;
import quack.IQuackBehavior;

@Data
public class Duck {
    private IFlyBehavior iFlyBehavior;
    private IQuackBehavior iQuackBehavior;

    public Duck(IFlyBehavior iFlyBehavior, IQuackBehavior iQuackBehavior) {
        this.iFlyBehavior = iFlyBehavior;
        this.iQuackBehavior = iQuackBehavior;
    }
    public void fly(){
        iFlyBehavior.fly();
    }
    public void quack(){
        iQuackBehavior.quack();
    }
}
