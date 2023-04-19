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
