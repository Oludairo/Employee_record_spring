package chapterNine;

public class Vertebrate extends Animal {

    public Vertebrate(){
        System.out.println("new vertebrate");
    }
    @Override
    public void die(){
        System.out.println("Shall not die");
    }

    @Override
    public void move() {
        System.out.println("go placidly");
    }
    //    public void parentMove() {
//        super.move();
//    }
}
