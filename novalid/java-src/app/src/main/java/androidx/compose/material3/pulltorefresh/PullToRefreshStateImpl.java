package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PullToRefresh.kt */
@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 82\u00020\u0001:\u00018B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010-J\u0006\u0010.\u001a\u00020\u0005J\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u000200ø\u0001\u0000¢\u0006\u0004\b2\u00103J\b\u00104\u001a\u00020+H\u0016J\u0016\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010-J\b\u00107\u001a\u00020+H\u0016R+\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R+\u0010\u001a\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u001f\u001a\u00020 X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0013R\u0014\u0010&\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0013R\u0014\u0010(\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, m7105d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "initialRefreshing", "", "positionalThreshold", "", "enabled", "Lkotlin/Function0;", "(ZFLkotlin/jvm/functions/Function0;)V", "<set-?>", "_refreshing", "get_refreshing", "()Z", "set_refreshing", "(Z)V", "_refreshing$delegate", "Landroidx/compose/runtime/MutableState;", "_verticalOffset", "get_verticalOffset", "()F", "set_verticalOffset", "(F)V", "_verticalOffset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "adjustedDistancePulled", "getAdjustedDistancePulled", "distancePulled", "getDistancePulled$material3_release", "setDistancePulled$material3_release", "distancePulled$delegate", "isRefreshing", "nestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setNestedScrollConnection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "getPositionalThreshold", "progress", "getProgress", "verticalOffset", "getVerticalOffset", "animateTo", "", TypedValues.CycleType.S_WAVE_OFFSET, "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateVerticalOffset", "consumeAvailableOffset", "Landroidx/compose/ui/geometry/Offset;", "available", "consumeAvailableOffset-MK-Hz9U", "(J)J", "endRefresh", "onRelease", "velocity", "startRefresh", "Companion", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,558:1\n76#2:559\n109#2,2:560\n76#2:562\n109#2,2:563\n81#3:565\n107#3,2:566\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl\n*L\n417#1:559\n417#1:560,2\n419#1:562\n419#1:563,2\n420#1:565\n420#1:566,2\n*E\n"})
/* loaded from: classes2.dex */
public final class PullToRefreshStateImpl implements PullToRefreshState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: _refreshing$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState _refreshing;

    @NotNull
    private NestedScrollConnection nestedScrollConnection;
    private final float positionalThreshold;

    /* renamed from: distancePulled$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState distancePulled = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    /* renamed from: _verticalOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState _verticalOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    /* compiled from: PullToRefresh.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl", m7120f = "PullToRefresh.kt", m7121i = {0, 0}, m7122l = {364}, m7123m = "onRelease", m7124n = {"this", "velocity"}, m7125s = {"L$0", "F$0"})
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$onRelease$1 */
    /* loaded from: classes3.dex */
    public static final class C17351 extends ContinuationImpl {
        public float F$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C17351(Continuation<? super C17351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PullToRefreshStateImpl.this.onRelease(0.0f, this);
        }
    }

    public PullToRefreshStateImpl(boolean z, float f, @NotNull Function0<Boolean> function0) {
        this.positionalThreshold = f;
        this.nestedScrollConnection = new PullToRefreshStateImpl$nestedScrollConnection$1(function0, this);
        this._refreshing = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public float getPositionalThreshold() {
        return this.positionalThreshold;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public float getProgress() {
        return getAdjustedDistancePulled() / getPositionalThreshold();
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public float getVerticalOffset() {
        return get_verticalOffset();
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public boolean isRefreshing() {
        return get_refreshing();
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public void startRefresh() {
        set_refreshing(true);
        set_verticalOffset(getPositionalThreshold());
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public void endRefresh() {
        set_verticalOffset(0.0f);
        set_refreshing(false);
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    @NotNull
    public NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public void setNestedScrollConnection(@NotNull NestedScrollConnection nestedScrollConnection) {
        this.nestedScrollConnection = nestedScrollConnection;
    }

    /* renamed from: consumeAvailableOffset-MK-Hz9U */
    public final long m10199consumeAvailableOffsetMKHz9U(long available) {
        float distancePulled$material3_release;
        if (isRefreshing()) {
            distancePulled$material3_release = 0.0f;
        } else {
            float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(getDistancePulled$material3_release() + Offset.m11100getYimpl(available), 0.0f);
            distancePulled$material3_release = fCoerceAtLeast - getDistancePulled$material3_release();
            setDistancePulled$material3_release(fCoerceAtLeast);
            set_verticalOffset(calculateVerticalOffset());
        }
        return OffsetKt.Offset(0.0f, distancePulled$material3_release);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onRelease(float f, @NotNull Continuation<? super Float> continuation) throws Throwable {
        C17351 c17351;
        PullToRefreshStateImpl pullToRefreshStateImpl;
        if (continuation instanceof C17351) {
            c17351 = (C17351) continuation;
            int i = c17351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17351.label = i - Integer.MIN_VALUE;
            } else {
                c17351 = new C17351(continuation);
            }
        }
        Object obj = c17351.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17351.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (isRefreshing()) {
                return Boxing.boxFloat(0.0f);
            }
            if (getAdjustedDistancePulled() > getPositionalThreshold()) {
                startRefresh();
            } else {
                c17351.L$0 = this;
                c17351.F$0 = f;
                c17351.label = 1;
                if (animateTo(0.0f, c17351) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            pullToRefreshStateImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = c17351.F$0;
            pullToRefreshStateImpl = (PullToRefreshStateImpl) c17351.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (pullToRefreshStateImpl.getDistancePulled$material3_release() == 0.0f || f < 0.0f) {
            f = 0.0f;
        }
        pullToRefreshStateImpl.setDistancePulled$material3_release(0.0f);
        return Boxing.boxFloat(f);
    }

    /* compiled from: PullToRefresh.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", "value", "", "<anonymous parameter 1>", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$animateTo$2 */
    /* loaded from: classes3.dex */
    public static final class C17342 extends Lambda implements Function2<Float, Float, Unit> {
        public C17342() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Float f, Float f2) {
            invoke(f.floatValue(), f2.floatValue());
            return Unit.INSTANCE;
        }

        public final void invoke(float f, float f2) {
            PullToRefreshStateImpl.this.set_verticalOffset(f);
        }
    }

    @Nullable
    public final Object animateTo(float f, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimate$default = SuspendAnimationKt.animate$default(get_verticalOffset(), f, 0.0f, null, new Function2<Float, Float, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl.animateTo.2
            public C17342() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Float f2, Float f22) {
                invoke(f2.floatValue(), f22.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float f2, float f22) {
                PullToRefreshStateImpl.this.set_verticalOffset(f2);
            }
        }, continuation, 12, null);
        return objAnimate$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimate$default : Unit.INSTANCE;
    }

    public final float calculateVerticalOffset() {
        if (getAdjustedDistancePulled() <= getPositionalThreshold()) {
            return getAdjustedDistancePulled();
        }
        float fCoerceIn = RangesKt___RangesKt.coerceIn(Math.abs(getProgress()) - 1.0f, 0.0f, 2.0f);
        return getPositionalThreshold() + (getPositionalThreshold() * (fCoerceIn - (((float) Math.pow(fCoerceIn, 2)) / 4)));
    }

    /* compiled from: PullToRefresh.kt */
    @Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¨\u0006\u000b"}, m7105d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "", "positionalThreshold", "", "enabled", "Lkotlin/Function0;", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Saver<PullToRefreshState, Boolean> Saver(final float positionalThreshold, @NotNull final Function0<Boolean> enabled) {
            return SaverKt.Saver(new Function2<SaverScope, PullToRefreshState, Boolean>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Boolean invoke(@NotNull SaverScope saverScope, @NotNull PullToRefreshState pullToRefreshState) {
                    return Boolean.valueOf(pullToRefreshState.isRefreshing());
                }
            }, new Function1<Boolean, PullToRefreshState>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ PullToRefreshState invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }

                @Nullable
                public final PullToRefreshState invoke(boolean z) {
                    return new PullToRefreshStateImpl(z, positionalThreshold, enabled);
                }
            });
        }
    }

    public final float getDistancePulled$material3_release() {
        return this.distancePulled.getFloatValue();
    }

    public final void setDistancePulled$material3_release(float f) {
        this.distancePulled.setFloatValue(f);
    }

    private final float getAdjustedDistancePulled() {
        return getDistancePulled$material3_release() * 0.5f;
    }

    private final float get_verticalOffset() {
        return this._verticalOffset.getFloatValue();
    }

    public final void set_verticalOffset(float f) {
        this._verticalOffset.setFloatValue(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean get_refreshing() {
        return ((Boolean) this._refreshing.getValue()).booleanValue();
    }

    private final void set_refreshing(boolean z) {
        this._refreshing.setValue(Boolean.valueOf(z));
    }
}
