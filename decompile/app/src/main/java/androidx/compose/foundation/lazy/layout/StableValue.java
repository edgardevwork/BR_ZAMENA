package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Stable;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyLayoutItemContentFactory.kt */
@Stable
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0003¨\u0006\u0016"}, m7105d2 = {"Landroidx/compose/foundation/lazy/layout/StableValue;", ExifInterface.GPS_DIRECTION_TRUE, "", "value", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "equals", "", "other", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/Object;)I", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@JvmInline
/* loaded from: classes3.dex */
public final class StableValue<T> {
    public final T value;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StableValue m8301boximpl(Object obj) {
        return new StableValue(obj);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m8302constructorimpl(T t) {
        return t;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8303equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof StableValue) && Intrinsics.areEqual(obj, ((StableValue) obj2).getValue());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8304equalsimpl0(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8305hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8306toStringimpl(Object obj) {
        return "StableValue(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m8303equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m8305hashCodeimpl(this.value);
    }

    public String toString() {
        return m8306toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Object getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ StableValue(Object obj) {
        this.value = obj;
    }

    public final T getValue() {
        return this.value;
    }
}
