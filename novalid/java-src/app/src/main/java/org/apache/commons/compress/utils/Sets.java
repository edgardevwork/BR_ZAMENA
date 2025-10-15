package org.apache.commons.compress.utils;

import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes8.dex */
public class Sets {
    @SafeVarargs
    public static <E> HashSet<E> newHashSet(E... eArr) {
        HashSet<E> hashSet = new HashSet<>(eArr.length);
        Collections.addAll(hashSet, eArr);
        return hashSet;
    }
}
