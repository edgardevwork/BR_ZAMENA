package org.apache.commons.p059io.function;

import java.io.IOException;

@FunctionalInterface
/* loaded from: classes6.dex */
public interface IOSupplier<T> {
    T get() throws IOException;
}
