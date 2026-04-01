class Outer {

    int x = 10;

    // Member Inner Class
    class MemberInner {

        void show() {

            System.out.println("Member Inner Class: " + x);
        }
    }

    void display() {

        // Local Inner Class
        class LocalInner {

            void show() {

                System.out.println("Local Inner Class");
            }
        }

        LocalInner li = new LocalInner();
        li.show();

        // Anonymous Inner Class
        Runnable r = new Runnable() {

            public void run() {

                System.out.println("Anonymous Inner Class");
            }
        };

        r.run();
    }
}
public class Program_7
{
    public static void main(String args[]) {

        Outer obj = new Outer();

        Outer.MemberInner mi = obj.new MemberInner();
        mi.show();

        obj.display();
    }
}