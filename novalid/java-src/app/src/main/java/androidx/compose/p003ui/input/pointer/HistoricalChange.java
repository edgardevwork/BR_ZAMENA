package androidx.compose.p003ui.input.pointer;

import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: PointerEvent.kt */
@Immutable
@ExperimentalComposeUiApi
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R&\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, m7105d2 = {"Landroidx/compose/ui/input/pointer/HistoricalChange;", "", "uptimeMillis", "", "position", "Landroidx/compose/ui/geometry/Offset;", "originalEventPosition", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "getOriginalEventPosition-F1C5BW0$ui_release", "()J", "J", "getPosition-F1C5BW0", "getUptimeMillis", "toString", "", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class HistoricalChange {
    public static final int $stable = 0;
    private long originalEventPosition;
    private final long position;
    private final long uptimeMillis;

    public /* synthetic */ HistoricalChange(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    public /* synthetic */ HistoricalChange(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    private HistoricalChange(long j, long j2) {
        this.uptimeMillis = j;
        this.position = j2;
        this.originalEventPosition = Offset.INSTANCE.m11115getZeroF1C5BW0();
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    /* renamed from: getPosition-F1C5BW0, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0$ui_release, reason: from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    private HistoricalChange(long j, long j2, long j3) {
        this(j, j2, (DefaultConstructorMarker) null);
        this.originalEventPosition = j3;
    }

    @NotNull
    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m11107toStringimpl(this.position)) + ')';
    }
}
