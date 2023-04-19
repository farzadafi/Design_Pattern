abstract public class AbstractDecorator extends Component {
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
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

class ConcreteDecoratorEx_2 extends AbstractDecorator {
    public void doJob() {

        System.out.println("Start Ex_2");

        super.doJob();

        // add additional responsibilities
        System.out.println("I am explicitly from Ex_2");
        System.out.println("End Ex_2");
    }
}
