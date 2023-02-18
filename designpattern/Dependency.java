package designpattern;

import java.util.ArrayList;
import java.util.List;

interface Develop {

    public void develop();
}

class FrontendDeveloper implements Develop {

    @Override
    public void develop() {
        writeJavascript();
    }

    public void writeJavascript(){
        System.out.println("자바스크립트로 코딩");
    }

}

class BackendDeveloper implements Develop {

    @Override
    public void develop() {
        writeJava();
    }

    public void writeJava() {
        System.out.println("자바로 코딩");
    }

}

public class Dependency {
    private final List<Develop> developers;

    
    public Dependency(List<Develop> developers) {
        this.developers = developers;
    }

    public void implement() {
        developers.forEach(Develop::develop);
    }

    public static void main(String[] args) {
        List<Develop> dev = new ArrayList<>();
        dev.add(new FrontendDeveloper());
        dev.add(new BackendDeveloper());
        Dependency a = new Dependency(dev);
        a.implement();
    }
}
