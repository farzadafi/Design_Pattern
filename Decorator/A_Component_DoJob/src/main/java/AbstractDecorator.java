abstract public class AbstractDecorator {
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    public void doJob() {
        if (component != null)
                component.doJob();
    }
}

class ConcreteDecoratorEx_1 extends AbstractDecorator {
    public void doJob() {
        super.doJob();

        // add additional responsibilities
        System.out.println("I am explicitly from Ex_1");
    }
}
