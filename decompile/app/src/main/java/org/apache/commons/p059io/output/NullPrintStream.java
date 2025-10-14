package org.apache.commons.p059io.output;

import java.io.PrintStream;

/* loaded from: classes6.dex */
public class NullPrintStream extends PrintStream {
    public static final NullPrintStream NULL_PRINT_STREAM = new NullPrintStream();

    public NullPrintStream() {
        super(NullOutputStream.NULL_OUTPUT_STREAM);
    }
}
