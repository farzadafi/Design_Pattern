## View Engine

**this is a framework for rendering a file with a different rendering engines**

### view_engine_1

the problem with the first view engine is, in class render.PageRender, in line 5:

```java
GlassViewEngine glassViewEngine = new GlassViewEngine();
```

in this line, the code connected to GlassViewEngine class, and if you want later to use another engine, you have to
change this line

### view_engine_2

in the second view engine module, create the viewEngine.ViewEngine interface and GlassViewEngine class implements from it, and pass
an object with the type viewEngine.ViewEngine to render method in render.PageRender class, for use in another view engine later without
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

and this is bad because in every method of every controller , where we call the render method, we have to pass view engine
, like GlassViewEngine or other view engine, and this is hard for client for your framework

### view_engine_3

and finally, in the third view engine, add the abstract createViewEngine method to the render.PageRender class :

```java
    public abstract viewEngine.ViewEngine createViewEngine();
```

this method returns a viewEngine.ViewEngine object, and when we want to change the view engine, create a new render.PageRender and
override the createViewEngine method and return the new view engine that we want, like MugPageRender class
