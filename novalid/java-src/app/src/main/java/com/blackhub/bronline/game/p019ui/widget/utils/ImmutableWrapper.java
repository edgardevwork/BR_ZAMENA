package com.blackhub.bronline.game.p019ui.widget.utils;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AutoSizeText.kt */
@Immutable
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, m7105d2 = {"Lcom/blackhub/bronline/game/ui/widget/utils/ImmutableWrapper;", ExifInterface.GPS_DIRECTION_TRUE, "", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/blackhub/bronline/game/ui/widget/utils/ImmutableWrapper;", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
