package Builder.complex_object.z_more_example.Vehicle_Example.src.main.java;

public class Director {

    BuilderInterface builderInterface;

    public void construct (BuilderInterface builderInterface) {
        this.builderInterface = builderInterface;
        this.builderInterface.buildBody();
        this.builderInterface.insertWheels();
        this.builderInterface.addHeadlights();
    }
}
