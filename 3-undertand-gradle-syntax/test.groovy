class GroovyBeanExample {
   private String name
}

def bean = new GroovyBeanExample()
bean.name = "this is name"
println bean.name


class Child {
    private String name
}

class Parent {
    private String age
    Child child = new Child();

    void configChild(Closure c) {
        c.delegate = child
        c.setResolveStrategy Closure.DELEGATE_FIRST
        c()
    }
}

def parent = new Parent()
parent.configChild {
    name = "child name"
    age=18
    
}

println parent.child.name
println parent.age

