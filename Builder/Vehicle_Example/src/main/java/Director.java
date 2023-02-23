public class Director {

    BuilderInterface builderInterface;

    public void construct (BuilderInterface builderInterface) {
        this.builderInterface = builderInterface;
        this.builderInterface.buildBody();
        this.builderInterface.insertWheels();
        this.builderInterface.addHeadlights();
    }
}
