package com.google.common.p024io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.nio.Buffer;

@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes7.dex */
public final class Java8Compatibility {
    public static void clear(Buffer b) {
        b.clear();
    }

    public static void flip(Buffer b) {
        b.flip();
    }

    public static void limit(Buffer b, int limit) {
        b.limit(limit);
    }

    public static void mark(Buffer b) {
        b.mark();
    }

    public static void position(Buffer b, int position) {
        b.position(position);
    }

    public static void reset(Buffer b) {
        b.reset();
    }
}
