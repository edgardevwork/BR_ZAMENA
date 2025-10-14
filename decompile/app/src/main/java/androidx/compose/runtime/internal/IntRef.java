package androidx.compose.runtime.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: IntRef.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\n"}, m7105d2 = {"Landroidx/compose/runtime/internal/IntRef;", "", "element", "", "(I)V", "getElement", "()I", "setElement", "toString", "", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class IntRef {
    public static final int $stable = 8;
    private int element;

    public IntRef() {
        this(0, 1, null);
    }

    public IntRef(int i) {
        this.element = i;
    }

    public /* synthetic */ IntRef(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final int getElement() {
        return this.element;
    }

    public final void setElement(int i) {
        this.element = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IntRef(element = ");
        sb.append(this.element);
        sb.append(")@");
        String string = Integer.toString(hashCode(), CharsKt__CharJVMKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
        sb.append(string);
        return sb.toString();
    }
}
