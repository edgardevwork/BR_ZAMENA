package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.p003ui.MotionDurationScale;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UpdatableAnimationState.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005JJ\u0010\u0013\u001a\u00020\u00142!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u001bH\u0086@\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m7105d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "(Landroidx/compose/animation/core/AnimationSpec;)V", "isRunning", "", "lastFrameTime", "", "lastVelocity", "Landroidx/compose/animation/core/AnimationVector1D;", "value", "getValue", "()F", "setValue", "(F)V", "vectorizedSpec", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "animateToZero", "", "beforeFrame", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "valueDelta", "afterFrame", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUpdatableAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdatableAnimationState.kt\nandroidx/compose/foundation/gestures/UpdatableAnimationState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
/* loaded from: classes2.dex */
public final class UpdatableAnimationState {

    @Deprecated
    public static final float VisibilityThreshold = 0.01f;
    private boolean isRunning;
    private long lastFrameTime = Long.MIN_VALUE;

    @NotNull
    private AnimationVector1D lastVelocity = ZeroVector;
    private float value;

    @NotNull
    private final VectorizedAnimationSpec<AnimationVector1D> vectorizedSpec;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final AnimationVector1D ZeroVector = new AnimationVector1D(0.0f);

    /* compiled from: UpdatableAnimationState.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.UpdatableAnimationState", m7120f = "UpdatableAnimationState.kt", m7121i = {0, 0, 0, 0, 1, 1}, m7122l = {101, 147}, m7123m = "animateToZero", m7124n = {"this", "beforeFrame", "afterFrame", "durationScale", "this", "afterFrame"}, m7125s = {"L$0", "L$1", "L$2", "F$0", "L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1 */
    public static final class C05121 extends ContinuationImpl {
        public float F$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C05121(Continuation<? super C05121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UpdatableAnimationState.this.animateToZero(null, null, this);
        }
    }

    public UpdatableAnimationState(@NotNull AnimationSpec<Float> animationSpec) {
        this.vectorizedSpec = animationSpec.vectorize(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE));
    }

    public final float getValue() {
        return this.value;
    }

    public final void setValue(float f) {
        this.value = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084 A[Catch: all -> 0x00b0, PHI: r0 r2 r13 r14 r15
  0x0084: PHI (r0v9 kotlin.jvm.functions.Function0) = (r0v3 kotlin.jvm.functions.Function0), (r0v10 kotlin.jvm.functions.Function0) binds: [B:30:0x007d, B:38:0x00a9] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r2v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
  (r2v2 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
  (r2v5 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
 binds: [B:30:0x007d, B:38:0x00a9] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r13v6 float) = (r13v4 float), (r13v7 float) binds: [B:30:0x007d, B:38:0x00a9] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r14v8 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>) = 
  (r14v5 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
  (r14v9 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
 binds: [B:30:0x007d, B:38:0x00a9] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r15v16 androidx.compose.foundation.gestures.UpdatableAnimationState) = 
  (r15v10 androidx.compose.foundation.gestures.UpdatableAnimationState)
  (r15v17 androidx.compose.foundation.gestures.UpdatableAnimationState)
 binds: [B:30:0x007d, B:38:0x00a9] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x00b0, blocks: (B:36:0x00a4, B:31:0x0084, B:33:0x008e), top: B:55:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:36:0x00a4, B:31:0x0084, B:33:0x008e), top: B:55:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0034, B:48:0x00d3, B:42:0x00b3, B:45:0x00be), top: B:57:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a1 -> B:55:0x00a4). Please report as a decompilation issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animateToZero(@NotNull Function1<? super Float, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C05121 c05121;
        C05121 c051212;
        Function0 function02;
        final Function1<? super Float, Unit> function12;
        final float f;
        UpdatableAnimationState updatableAnimationState;
        Function0 function03;
        UpdatableAnimationState updatableAnimationState2;
        UpdatableAnimationState updatableAnimationState3;
        if (continuation instanceof C05121) {
            c05121 = (C05121) continuation;
            int i = c05121.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05121.label = i - Integer.MIN_VALUE;
            } else {
                c05121 = new C05121(continuation);
            }
        }
        Object obj = c05121.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05121.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function03 = (Function0) c05121.L$1;
                    UpdatableAnimationState updatableAnimationState4 = (UpdatableAnimationState) c05121.L$0;
                    ResultKt.throwOnFailure(obj);
                    function0 = updatableAnimationState4;
                    function03.invoke();
                    updatableAnimationState3 = function0;
                    updatableAnimationState3.lastFrameTime = Long.MIN_VALUE;
                    updatableAnimationState3.lastVelocity = ZeroVector;
                    updatableAnimationState3.isRunning = false;
                    return Unit.INSTANCE;
                }
                f = c05121.F$0;
                Function0 function04 = (Function0) c05121.L$2;
                Function1<? super Float, Unit> function13 = (Function1) c05121.L$1;
                UpdatableAnimationState updatableAnimationState5 = (UpdatableAnimationState) c05121.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    updatableAnimationState = updatableAnimationState5;
                    C05121 c051213 = c05121;
                    function02 = function04;
                    function12 = function13;
                    c051212 = c051213;
                } catch (Throwable th) {
                    th = th;
                    function0 = updatableAnimationState5;
                    function0.lastFrameTime = Long.MIN_VALUE;
                    function0.lastVelocity = ZeroVector;
                    function0.isRunning = false;
                    throw th;
                }
                try {
                    function02.invoke();
                    if (f != 0.0f) {
                        if (!Companion.isZeroish(updatableAnimationState.value)) {
                            Function1<Long, Unit> function14 = new Function1<Long, Unit>() { // from class: androidx.compose.foundation.gestures.UpdatableAnimationState.animateToZero.4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                    invoke(l.longValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(long j) {
                                    long jRoundToLong;
                                    if (UpdatableAnimationState.this.lastFrameTime == Long.MIN_VALUE) {
                                        UpdatableAnimationState.this.lastFrameTime = j;
                                    }
                                    AnimationVector1D animationVector1D = new AnimationVector1D(UpdatableAnimationState.this.getValue());
                                    if (f != 0.0f) {
                                        jRoundToLong = MathKt__MathJVMKt.roundToLong((j - UpdatableAnimationState.this.lastFrameTime) / f);
                                    } else {
                                        jRoundToLong = UpdatableAnimationState.this.vectorizedSpec.getDurationNanos(new AnimationVector1D(UpdatableAnimationState.this.getValue()), UpdatableAnimationState.Companion.getZeroVector(), UpdatableAnimationState.this.lastVelocity);
                                    }
                                    long j2 = jRoundToLong;
                                    float value = ((AnimationVector1D) UpdatableAnimationState.this.vectorizedSpec.getValueFromNanos(j2, animationVector1D, UpdatableAnimationState.Companion.getZeroVector(), UpdatableAnimationState.this.lastVelocity)).getValue();
                                    UpdatableAnimationState updatableAnimationState6 = UpdatableAnimationState.this;
                                    updatableAnimationState6.lastVelocity = (AnimationVector1D) updatableAnimationState6.vectorizedSpec.getVelocityFromNanos(j2, animationVector1D, UpdatableAnimationState.Companion.getZeroVector(), UpdatableAnimationState.this.lastVelocity);
                                    UpdatableAnimationState.this.lastFrameTime = j;
                                    float value2 = UpdatableAnimationState.this.getValue() - value;
                                    UpdatableAnimationState.this.setValue(value);
                                    function12.invoke(Float.valueOf(value2));
                                }
                            };
                            c051212.L$0 = updatableAnimationState;
                            c051212.L$1 = function12;
                            c051212.L$2 = function02;
                            c051212.F$0 = f;
                            c051212.label = 1;
                            if (MonotonicFrameClockKt.withFrameNanos(function14, c051212) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            function02.invoke();
                            if (f != 0.0f) {
                            }
                        }
                    }
                    function03 = function02;
                    UpdatableAnimationState updatableAnimationState6 = updatableAnimationState;
                    final Function1<? super Float, Unit> function15 = function12;
                    updatableAnimationState2 = updatableAnimationState6;
                    if (Math.abs(updatableAnimationState2.value) == 0.0f) {
                        Function1<Long, Unit> function16 = new Function1<Long, Unit>() { // from class: androidx.compose.foundation.gestures.UpdatableAnimationState.animateToZero.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                invoke(l.longValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(long j) {
                                float value = UpdatableAnimationState.this.getValue();
                                UpdatableAnimationState.this.setValue(0.0f);
                                function15.invoke(Float.valueOf(value));
                            }
                        };
                        c051212.L$0 = updatableAnimationState2;
                        c051212.L$1 = function03;
                        c051212.L$2 = null;
                        c051212.label = 2;
                        function0 = updatableAnimationState2;
                        if (MonotonicFrameClockKt.withFrameNanos(function16, c051212) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        function03.invoke();
                        updatableAnimationState3 = function0;
                        updatableAnimationState3.lastFrameTime = Long.MIN_VALUE;
                        updatableAnimationState3.lastVelocity = ZeroVector;
                        updatableAnimationState3.isRunning = false;
                        return Unit.INSTANCE;
                    }
                    updatableAnimationState3 = updatableAnimationState2;
                    updatableAnimationState3.lastFrameTime = Long.MIN_VALUE;
                    updatableAnimationState3.lastVelocity = ZeroVector;
                    updatableAnimationState3.isRunning = false;
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    function0 = updatableAnimationState;
                    function0.lastFrameTime = Long.MIN_VALUE;
                    function0.lastVelocity = ZeroVector;
                    function0.isRunning = false;
                    throw th;
                }
            }
            ResultKt.throwOnFailure(obj);
            if (!(!this.isRunning)) {
                throw new IllegalStateException("animateToZero called while previous animation is running".toString());
            }
            MotionDurationScale motionDurationScale = (MotionDurationScale) c05121.getContext().get(MotionDurationScale.INSTANCE);
            float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
            this.isRunning = true;
            c051212 = c05121;
            function02 = function0;
            function12 = function1;
            f = scaleFactor;
            updatableAnimationState = this;
            if (!Companion.isZeroish(updatableAnimationState.value)) {
            }
            function03 = function02;
            UpdatableAnimationState updatableAnimationState62 = updatableAnimationState;
            final Function1<? super Float, Unit> function152 = function12;
            updatableAnimationState2 = updatableAnimationState62;
            if (Math.abs(updatableAnimationState2.value) == 0.0f) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* compiled from: UpdatableAnimationState.kt */
    @Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\t\u001a\u00020\n*\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m7105d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState$Companion;", "", "()V", "VisibilityThreshold", "", "ZeroVector", "Landroidx/compose/animation/core/AnimationVector1D;", "getZeroVector", "()Landroidx/compose/animation/core/AnimationVector1D;", "isZeroish", "", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AnimationVector1D getZeroVector() {
            return UpdatableAnimationState.ZeroVector;
        }

        public final boolean isZeroish(float f) {
            return Math.abs(f) < 0.01f;
        }
    }
}
