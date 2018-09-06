package nestedClass;

public class NestedOuter {
    NestedInner innerClass = new NestedInner();//Making instance for NestedInner
    NestedInner1 innerClass1 = new NestedInner1();//Making instance for Inner class "NestedInner1", but not working

    public void outerMethodA() {
        System.out.println("This is Outer method A");
        innerClass.innerMethodA();
        innerClass.innerMethodB();
        innerClass.innerMethodB();
        innerClass1.inner1MethodC();
        innerClass1.inner1MethodD();
    }

    public void outerMethodB() {
        System.out.println("This is Outer method B");


    }

    public class NestedInner {


        public void innerMethodA() {
            System.out.println("This is Innermethod A");
        }

        public void innerMethodB() {
            System.out.println("This is Innermethod B");
        }
    }
        public class NestedInner1 {

            public void inner1MethodC() {
                System.out.println("This is Inner1method C");
            }

            public void inner1MethodD() {
                System.out.println("This is Inner1method D");
            }
        }
    }

// Can Anyone help me how can I make instance for 2nd inner class to get access in outer class??