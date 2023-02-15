# Design-Patterns
This code implements a factory design pattern for creating various types of shapes.
When the program starts, the user is prompted to enter the name of the shape they want to create.
The program then creates an object of the chosen shape and calls its draw() method.

The shape class is an abstract class with a draw() method that must be implemented by its subclasses. The rectangle, square, triangle, and trapeze classes extend the shape class and implement their own draw() method.

The shapeFactory is an interface with a createAndDrawShape() method that must be implemented by its subclasses. The Star and leftRightArrow classes implement the shapeFactory interface and create their own shapes using their createAndDrawShape() method.

After drawing the shape, the program outputs the Shapes-Styling section, which creates various DrawingBuilder objects with different constructors, demonstrating the builder design pattern. The program then outputs the Shapes Generator section, which creates instances of the different shape classes and adds them to an array.
