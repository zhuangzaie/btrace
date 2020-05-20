/* BTrace Script Template */

import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.*;

@BTrace
public class TracingScript {
    /* put your code here */
    @OnMethod(
            clazz = "java.lang.System",
            method = "gc"
    )
    public static void traceExecute() {
        println("who call java.lang.System.gc :");
        jstack();
    }
}