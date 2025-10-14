package com.blackhub.bronline.game.p019ui.widget.utils;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AutoSizeText.kt */
@Immutable
/* loaded from: classes3.dex */
public final /* data */ class ImmutableWrapper<T> {
    public static final int $stable = 0;
    public final T value;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImmutableWrapper copy$default(ImmutableWrapper immutableWrapper, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = immutableWrapper.value;
        }
        return immutableWrapper.copy(obj);
    }

    public final T component1() {
        return this.value;
    }

    @NotNull
    public final ImmutableWrapper<T> copy(T value) {
        return new ImmutableWrapper<>(value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ImmutableWrapper) && Intrinsics.areEqual(this.value, ((ImmutableWrapper) other).value);
    }

    public int hashCode() {
        T t = this.value;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    @NotNull
    public String toString() {
        return "ImmutableWrapper(value=" + this.value + ")";
    }

    public ImmutableWrapper(T t) {
        this.value = t;
    }

    public final T getValue() {
        return this.value;
    }
}

