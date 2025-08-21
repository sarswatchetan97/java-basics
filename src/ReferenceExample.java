import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ReferenceExample {
    public static void main(String... args) {
        //Strong Reference - Default
        Object strongRef = new Object();

        //Weak Ref - collected by the garbage collector if there are
        //no strong references to it. (Caching)
        WeakReference<Object> weakRef = new WeakReference<>(new Object());

        //Soft Ref - collected by the garbage collector if memory pressure increases(used in image caching libraries)
        SoftReference<Object> softRef = new SoftReference<>(new Object());

        //Phantom Ref - weakest type of reference and
        //are mainly used to track when an object is being
        //finalized by the garbage collector.
        ReferenceQueue<Object> phantomQueue = new ReferenceQueue<>();
        PhantomReference<Object> phantomReference = new PhantomReference<>(new Object(), phantomQueue);

        System.gc();

        System.out.println("Strong Reference: " + strongRef);
        System.out.println("Weak Reference: " + weakRef.get());
        System.out.println("Soft Reference: " + softRef.get());
        System.out.println("Phantom Reference: " + phantomReference.get());

    }
}
