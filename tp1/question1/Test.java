package question1;

public class Test{

    public static void main(String []args){
        Circle circle=new Circle();
        Triangle triangle=new Triangle();
        Square square =new Square();
        
        circle.makeInvisible();
        circle.moveRight();
        circle.moveLeft();
        circle.moveUp();
        circle.moveDown();
        circle.moveHorizontal(5);
        circle.moveVertical(10);
        circle.slowMoveHorizontal(8);
        circle.slowMoveVertical(18);
        circle.changeSize(40);
        circle.changeColor("red");
        circle.makeVisible();
        //circle.draw(); car elle est private
        //circle.erase(); car elle est private
        
        triangle.makeInvisible();
        triangle.moveRight();
        triangle.moveLeft();
        triangle.moveUp();
        triangle.moveDown();
        triangle.moveHorizontal(5);
        triangle.moveVertical(10);
        triangle.slowMoveHorizontal(8);
        triangle.slowMoveVertical(18);
        triangle.changeSize(40,30);
        triangle.changeColor("red");
        triangle.makeVisible();
        //triangle.draw(); car elle est private
        //triangle.erase(); car elle est private
        
        square.makeInvisible();
        square.moveRight();
        square.moveLeft();
        square.moveUp();
        square.moveDown();
        square.moveHorizontal(5);
        square.moveVertical(10);
        square.slowMoveHorizontal(8);
        square.slowMoveVertical(18);
        square.changeSize(30);
        square.changeColor("red");
        square.makeVisible();
        //square.draw(); car elle est private
        //square.erase(); car elle est private
    }
}
