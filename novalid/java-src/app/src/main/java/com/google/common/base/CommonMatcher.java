package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class CommonMatcher {
    public abstract int end();

    public abstract boolean find();

    public abstract boolean find(int index);

    public abstract boolean matches();

    public abstract String replaceAll(String replacement);

    public abstract int start();
}
