package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.AbstractMap;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes4.dex */
public final class RemovalNotification<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    public static final long serialVersionUID = 0;
    public final RemovalCause cause;

    public static <K, V> RemovalNotification<K, V> create(@CheckForNull K key, @CheckForNull V value, RemovalCause cause) {
        return new RemovalNotification<>(key, value, cause);
    }

    public RemovalNotification(@CheckForNull K key, @CheckForNull V value, RemovalCause cause) {
        super(key, value);
        this.cause = (RemovalCause) Preconditions.checkNotNull(cause);
    }

    public RemovalCause getCause() {
        return this.cause;
    }

    public boolean wasEvicted() {
        return this.cause.wasEvicted();
    }
}
