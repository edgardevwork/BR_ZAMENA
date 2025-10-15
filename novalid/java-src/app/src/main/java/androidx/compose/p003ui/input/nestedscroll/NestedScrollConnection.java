package androidx.compose.p003ui.input.nestedscroll;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NestedScrollModifier.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, m7105d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public interface NestedScrollConnection {
    @Nullable
    /* renamed from: onPostFling-RZ2iAVY */
    default Object mo7960onPostFlingRZ2iAVY(long j, long j2, @NotNull Continuation<? super Velocity> continuation) {
        return m12360onPostFlingRZ2iAVY$suspendImpl(this, j, j2, continuation);
    }

    @Nullable
    /* renamed from: onPreFling-QWom1Mo */
    default Object mo8201onPreFlingQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation) {
        return m12361onPreFlingQWom1Mo$suspendImpl(this, j, continuation);
    }

    /* compiled from: NestedScrollModifier.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m12365onPreScrollOzD1aCk(@NotNull NestedScrollConnection nestedScrollConnection, long j, int i) {
            return NestedScrollConnection.super.mo7962onPreScrollOzD1aCk(j, i);
        }

        @Deprecated
        /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m12363onPostScrollDzOQY0M(@NotNull NestedScrollConnection nestedScrollConnection, long j, long j2, int i) {
            return NestedScrollConnection.super.mo7961onPostScrollDzOQY0M(j, j2, i);
        }

        @Deprecated
        @Nullable
        /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static Object m12364onPreFlingQWom1Mo(@NotNull NestedScrollConnection nestedScrollConnection, long j, @NotNull Continuation<? super Velocity> continuation) {
            return NestedScrollConnection.super.mo8201onPreFlingQWom1Mo(j, continuation);
        }

        @Deprecated
        @Nullable
        /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static Object m12362onPostFlingRZ2iAVY(@NotNull NestedScrollConnection nestedScrollConnection, long j, long j2, @NotNull Continuation<? super Velocity> continuation) {
            return NestedScrollConnection.super.mo7960onPostFlingRZ2iAVY(j, j2, continuation);
        }
    }

    /* renamed from: onPreScroll-OzD1aCk */
    default long mo7962onPreScrollOzD1aCk(long available, int source) {
        return Offset.INSTANCE.m11115getZeroF1C5BW0();
    }

    /* renamed from: onPostScroll-DzOQY0M */
    default long mo7961onPostScrollDzOQY0M(long consumed, long available, int source) {
        return Offset.INSTANCE.m11115getZeroF1C5BW0();
    }

    /* renamed from: onPreFling-QWom1Mo$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m12361onPreFlingQWom1Mo$suspendImpl(NestedScrollConnection nestedScrollConnection, long j, Continuation<? super Velocity> continuation) {
        return Velocity.m13892boximpl(Velocity.INSTANCE.m13912getZero9UxMQ8M());
    }

    /* renamed from: onPostFling-RZ2iAVY$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m12360onPostFlingRZ2iAVY$suspendImpl(NestedScrollConnection nestedScrollConnection, long j, long j2, Continuation<? super Velocity> continuation) {
        return Velocity.m13892boximpl(Velocity.INSTANCE.m13912getZero9UxMQ8M());
    }
}
