package org.intellij.lang.annotations;

/* compiled from: PrintFormat.java */
/* loaded from: classes8.dex */
public class PrintFormatPattern {

    @Language("RegExp")
    public static final String ARG_INDEX = "(?:\\d+\\$)?";

    @Language("RegExp")
    public static final String CONVERSION = "(?:[tT])?(?:[a-zA-Z%])";

    @Language("RegExp")
    public static final String FLAGS = "(?:[-#+ 0,(<]*)?";

    @Language("RegExp")
    public static final String PRECISION = "(?:\\.\\d+)?";

    @Language("RegExp")
    public static final String PRINT_FORMAT = "(?:[^%]|%%|(?:%(?:\\d+\\$)?(?:[-#+ 0,(<]*)?(?:\\d+)?(?:\\.\\d+)?(?:[tT])?(?:[a-zA-Z%])))*";

    @Language("RegExp")
    public static final String TEXT = "[^%]|%%";

    @Language("RegExp")
    public static final String WIDTH = "(?:\\d+)?";
}
