## View Engine

**this is a framework for rendering an HTML page with a different rendering engines**

### view_engine_1

the problem with the first view engine is, in class Controller, in line 5:

```java
        GlassViewEngine glassViewEngine=new GlassViewEngine();
```

in this line, the code connected to GlassViewEngine class, and if you want later to use another engine, you have to
change this line

### view_engine_2

in the second view engine module, create the ViewEngine interface and GlassViewEngine class implements from it, and pass
an object with the type ViewEngine to render method in Controller class, for use in another view engine later without
changing code

what's the problem with this approach?

when the user wants to use this code, should create an object from the view engine and pass it to the render method like
this:

```java
//code in ProductController class
public void listProduct(){
        render("products.html",new GlassViewEngine());
        }
```

and this is bad because your user has friction with creating the view engine and he should know all thing about the view
engine

### view_engine_3

and finally, in the third view engine, add the createViewEngine method to the Controller class :

```java
    protected ViewEngine createViewEngine(){
        return new GlassViewEngine();
        }
```

this method returns a ViewEngine object, and when we want to change the view engine, create a new controller and
override the createViewEngine method and return the new view engine that we want
