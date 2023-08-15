### Prototype Problem

please review this code
component -> circle -> rectangle -> contextMenu -> Main
what's problem of this code?
please double-check contextMenu class for find problem

1. the first problem with this implementation is that is violates the open close principle, so the open close says the
   classes should be open for extension and closed for modification, with this implementation every time we want to
   support a new kind of shape, we have to come back and modify duplicate method, we need to use another if block for a new
   kind of shape, That's number one problem,
2. the second problem, the coupling between context menu and all shape, so our context menu has to know about all kinds of
   shape, the more shapes we support, the more coupling we have between these classes
3. the problem is that at the time of writing code our context menu has to know about all shape that e support, what if
   we want to make this application extensible such that other people can build plugin for it? so they can define new
   kinds of component that can be added to a document? we cannot achieve that with this implementation, because at the
   time of writing code, or at compile time our context menu has to know about all kings of components

how to solve these problem?
add a clone method to component interface, and override this method on shape class, and use this method
in duplicate method on context menu class, this is prototype

[go to solution module](https://github.com/farzadafi/Design_Pattern/tree/master/Prototype/basic/prototype_solution)
