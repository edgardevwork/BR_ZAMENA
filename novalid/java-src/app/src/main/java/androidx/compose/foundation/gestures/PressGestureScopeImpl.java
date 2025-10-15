package androidx.compose.foundation.gestures;

import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TapGestureDetector.kt */
@Metadata(m7104d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0015\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u0017*\u00020\u0018H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0016\u001a\u00020\u0017*\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u0018*\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\u001e\u001a\u00020\u0018*\u00020\u0005H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001a\u0010\u001e\u001a\u00020\u0018*\u00020\u0017H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010#J\u0017\u0010$\u001a\u00020%*\u00020&H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u0005*\u00020\u0018H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010\"J\u0017\u0010)\u001a\u00020\u0005*\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010 J\r\u0010,\u001a\u00020-*\u00020.H\u0097\u0001J\u0017\u0010/\u001a\u00020&*\u00020%H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010(J\u0017\u00101\u001a\u00020\u001b*\u00020\u0018H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001a\u00101\u001a\u00020\u001b*\u00020\u0005H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00103J\u001a\u00101\u001a\u00020\u001b*\u00020\u0017H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00058\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, m7105d2 = {"Landroidx/compose/foundation/gestures/PressGestureScopeImpl;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "density", "(Landroidx/compose/ui/unit/Density;)V", "", "getDensity", "()F", "fontScale", "getFontScale", "isCanceled", "", "isReleased", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "awaitRelease", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "release", "reset", "tryAwaitRelease", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class PressGestureScopeImpl implements PressGestureScope, Density {
    public final /* synthetic */ Density $$delegate_0;
    public boolean isCanceled;
    public boolean isReleased;

    @NotNull
    public final Mutex mutex = MutexKt.Mutex(false);

    /* compiled from: TapGestureDetector.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m7120f = "TapGestureDetector.kt", m7121i = {}, m7122l = {363}, m7123m = "awaitRelease", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 */
    public static final class C04821 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C04821(Continuation<? super C04821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PressGestureScopeImpl.this.awaitRelease(this);
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m7120f = "TapGestureDetector.kt", m7121i = {0}, m7122l = {357}, m7123m = "reset", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 */
    public static final class C04831 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C04831(Continuation<? super C04831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PressGestureScopeImpl.this.reset(this);
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m7120f = "TapGestureDetector.kt", m7121i = {0}, m7122l = {370}, m7123m = "tryAwaitRelease", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 */
    public static final class C04841 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C04841(Continuation<? super C04841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PressGestureScopeImpl.this.tryAwaitRelease(this);
        }
    }

    @Override // androidx.compose.p003ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.p003ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo7867roundToPxR2X_6o(long j) {
        return this.$$delegate_0.mo7867roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo7868roundToPx0680j_4(float f) {
        return this.$$delegate_0.mo7868roundToPx0680j_4(f);
    }

    @Override // androidx.compose.p003ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo7869toDpGaN1DYA(long j) {
        return this.$$delegate_0.mo7869toDpGaN1DYA(j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo7870toDpu2uoSUM(float f) {
        return this.$$delegate_0.mo7870toDpu2uoSUM(f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo7871toDpu2uoSUM(int i) {
        return this.$$delegate_0.mo7871toDpu2uoSUM(i);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo7872toDpSizekrfVVM(long j) {
        return this.$$delegate_0.mo7872toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo7873toPxR2X_6o(long j) {
        return this.$$delegate_0.mo7873toPxR2X_6o(j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo7874toPx0680j_4(float f) {
        return this.$$delegate_0.mo7874toPx0680j_4(f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo7875toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.mo7875toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.p003ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo7876toSp0xMU5do(float f) {
        return this.$$delegate_0.mo7876toSp0xMU5do(f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo7877toSpkPz2Gy4(float f) {
        return this.$$delegate_0.mo7877toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo7878toSpkPz2Gy4(int i) {
        return this.$$delegate_0.mo7878toSpkPz2Gy4(i);
    }

    public PressGestureScopeImpl(@NotNull Density density) {
        this.$$delegate_0 = density;
    }

    public final void cancel() {
        this.isCanceled = true;
        Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
    }

    public final void release() {
        this.isReleased = true;
        Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reset(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        C04831 c04831;
        PressGestureScopeImpl pressGestureScopeImpl;
        if (continuation instanceof C04831) {
            c04831 = (C04831) continuation;
            int i = c04831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04831.label = i - Integer.MIN_VALUE;
            } else {
                c04831 = new C04831(continuation);
            }
        }
        Object obj = c04831.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04831.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Mutex mutex = this.mutex;
            c04831.L$0 = this;
            c04831.label = 1;
            if (Mutex.DefaultImpls.lock$default(mutex, null, c04831, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            pressGestureScopeImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pressGestureScopeImpl = (PressGestureScopeImpl) c04831.L$0;
            ResultKt.throwOnFailure(obj);
        }
        pressGestureScopeImpl.isReleased = false;
        pressGestureScopeImpl.isCanceled = false;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object awaitRelease(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        C04821 c04821;
        if (continuation instanceof C04821) {
            c04821 = (C04821) continuation;
            int i = c04821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04821.label = i - Integer.MIN_VALUE;
            } else {
                c04821 = new C04821(continuation);
            }
        }
        Object objTryAwaitRelease = c04821.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04821.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTryAwaitRelease);
            c04821.label = 1;
            objTryAwaitRelease = tryAwaitRelease(c04821);
            if (objTryAwaitRelease == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTryAwaitRelease);
        }
        if (!((Boolean) objTryAwaitRelease).booleanValue()) {
            throw new GestureCancellationException("The press gesture was canceled.");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object tryAwaitRelease(@NotNull Continuation<? super Boolean> continuation) throws Throwable {
        C04841 c04841;
        PressGestureScopeImpl pressGestureScopeImpl;
        if (continuation instanceof C04841) {
            c04841 = (C04841) continuation;
            int i = c04841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04841.label = i - Integer.MIN_VALUE;
            } else {
                c04841 = new C04841(continuation);
            }
        }
        Object obj = c04841.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04841.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.isReleased && !this.isCanceled) {
                Mutex mutex = this.mutex;
                c04841.L$0 = this;
                c04841.label = 1;
                if (Mutex.DefaultImpls.lock$default(mutex, null, c04841, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pressGestureScopeImpl = this;
            } else {
                pressGestureScopeImpl = this;
                return Boxing.boxBoolean(pressGestureScopeImpl.isReleased);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pressGestureScopeImpl = (PressGestureScopeImpl) c04841.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Mutex.DefaultImpls.unlock$default(pressGestureScopeImpl.mutex, null, 1, null);
        return Boxing.boxBoolean(pressGestureScopeImpl.isReleased);
    }
}
