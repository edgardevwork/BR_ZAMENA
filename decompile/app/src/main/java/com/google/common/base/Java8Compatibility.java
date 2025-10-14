package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.nio.Buffer;

@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
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

    public static void position(Buffer b, int position) {
        b.position(position);
    }
}
