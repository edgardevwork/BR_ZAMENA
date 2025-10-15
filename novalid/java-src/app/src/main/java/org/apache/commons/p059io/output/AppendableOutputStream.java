package org.apache.commons.p059io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.Appendable;

/* loaded from: classes6.dex */
public class AppendableOutputStream<T extends Appendable> extends OutputStream {
    public final T appendable;

    public AppendableOutputStream(T t) {
        this.appendable = t;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.appendable.append((char) i);
    }

    public T getAppendable() {
        return this.appendable;
    }
}
