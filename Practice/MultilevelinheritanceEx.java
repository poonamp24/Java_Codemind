class Parent {
    void Parent() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    void Child() {
        System.out.println("This is Child Class");
    }
}

class GrandChild extends Child {
    void GrandChild() {
        System.out.println("This is Grandchild class");
    }

}

public class MultilevelinheritanceEx {
    public static void main(String[] args) {
        GrandChild g = new GrandChild();
        g.Parent();
        g.Child();
        g.GrandChild();
    }
}