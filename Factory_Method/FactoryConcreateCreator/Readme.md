#### Factory_Concrete_Creator

![Factory_method_image](https://github.com/farzadafi/Design_Pattern/blob/master/Factory_Method/FactoryConcreateCreator/Factory_method.png)

This code demonstrates the use of the Factory Method design pattern to create objects of different shapes.

The **Shape interface** defines a common method draw() that all shapes must implement.

The **Rectangle, Square, and Circle classes** are concrete implementations of the Shape interface. Each class overrides the
draw() method to provide its own implementation.

The **ShapeFactory** class is responsible for creating objects of different shapes based on the ShapeType enum passed as a
parameter to the getShape() method.
Inside the getShape() method, a Shape object is initialized as null. If the shapeType parameter is null, the method
returns null. Otherwise, a switch statement is used to determine the type of shape to create.
If the shapeType is SQUARE, a new Square object is created and assigned to the shape variable. If the shapeType is
CIRCLE, a new Circle object is created and assigned to the shape variable. If the shapeType is RECTANGLE, a new
Rectangle object is created and assigned to the shape variable.
Finally, the shape object is returned.

In the **Client** class, an instance of ShapeFactory is created.
Using the shapeFactory object, three different shapes are created: circle, rectangle, and square.
The draw() method is then called on each shape object, which prints a message specific to each shape.

we can getShape method in ShapeFactory define in static and use it without create object on ShapeFactory class.
some people use this static method

some people say this is not factory method!! :|, 
please see this example: [view_engine](https://github.com/farzadafi/Design_Pattern/tree/master/Factory_Method/view_engine)