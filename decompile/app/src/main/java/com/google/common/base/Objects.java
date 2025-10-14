package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.Arrays;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public final class Objects extends ExtraObjectsMethodsForWeb {
    public static boolean equal(@CheckForNull Object a2, @CheckForNull Object b) {
        return a2 == b || (a2 != null && a2.equals(b));
    }

    public static int hashCode(@CheckForNull Object... objects) {
        return Arrays.hashCode(objects);
    }
}
