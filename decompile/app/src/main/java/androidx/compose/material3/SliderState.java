package androidx.compose.material3;

import androidx.annotation.IntRange;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt__RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Slider.kt */
@ExperimentalMaterial3Api
@Metadata(m7104d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\u0003H\u0016J?\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020P2'\u0010Q\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0S\u0012\u0006\u0012\u0004\u0018\u00010T0R¢\u0006\u0002\bUH\u0096@¢\u0006\u0002\u0010VJ\u001a\u0010W\u001a\u00020\b2\u0006\u0010X\u001a\u00020YH\u0000ø\u0001\u0000¢\u0006\u0004\bZ\u0010[J \u0010\\\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\u00032\u0006\u0010^\u001a\u00020\u00032\u0006\u0010_\u001a\u00020\u0003H\u0002J \u0010`\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\u00032\u0006\u0010^\u001a\u00020\u00032\u0006\u0010a\u001a\u00020\u0003H\u0002J\u001d\u0010b\u001a\u00020\b2\u0006\u0010c\u001a\u00020\u00032\u0006\u0010d\u001a\u00020\u0005H\u0000¢\u0006\u0002\beR\u0014\u0010\f\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001aR(\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010!X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0013R+\u0010'\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010*R+\u0010-\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010,\u001a\u0004\b.\u0010\u000e\"\u0004\b/\u0010*R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R+\u00105\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010,\u001a\u0004\b6\u0010\u000e\"\u0004\b7\u0010*R\u0014\u00109\u001a\u00020:X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R+\u0010=\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\b>\u00104\"\u0004\b?\u0010@R$\u0010\u0002\u001a\u00020\u00032\u0006\u0010C\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010\u000e\"\u0004\bE\u0010*R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR+\u0010H\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010,\u001a\u0004\bI\u0010\u000e\"\u0004\bJ\u0010*\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006f"}, m7105d2 = {"Landroidx/compose/material3/SliderState;", "Landroidx/compose/foundation/gestures/DraggableState;", "value", "", "steps", "", "onValueChangeFinished", "Lkotlin/Function0;", "", "valueRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "(FILkotlin/jvm/functions/Function0;Lkotlin/ranges/ClosedFloatingPointRange;)V", "coercedValueAsFraction", "getCoercedValueAsFraction$material3_release", "()F", "dragScope", "Landroidx/compose/foundation/gestures/DragScope;", "gestureEndAction", "getGestureEndAction$material3_release", "()Lkotlin/jvm/functions/Function0;", "<set-?>", "", "isDragging", "isDragging$material3_release", "()Z", "setDragging", "(Z)V", "isDragging$delegate", "Landroidx/compose/runtime/MutableState;", "isRtl", "isRtl$material3_release", "setRtl$material3_release", "onValueChange", "Lkotlin/Function1;", "getOnValueChange$material3_release", "()Lkotlin/jvm/functions/Function1;", "setOnValueChange$material3_release", "(Lkotlin/jvm/functions/Function1;)V", "getOnValueChangeFinished", "pressOffset", "getPressOffset", "setPressOffset", "(F)V", "pressOffset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "rawOffset", "getRawOffset", "setRawOffset", "rawOffset$delegate", "scrollMutex", "Landroidx/compose/foundation/MutatorMutex;", "getSteps", "()I", "thumbWidth", "getThumbWidth", "setThumbWidth", "thumbWidth$delegate", "tickFractions", "", "getTickFractions$material3_release", "()[F", "totalWidth", "getTotalWidth", "setTotalWidth", "(I)V", "totalWidth$delegate", "Landroidx/compose/runtime/MutableIntState;", "newVal", "getValue", "setValue", "getValueRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", "valueState", "getValueState", "setValueState", "valueState$delegate", "dispatchRawDelta", "delta", "drag", "dragPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPress", "pos", "Landroidx/compose/ui/geometry/Offset;", "onPress-k-4lQ0M$material3_release", "(J)V", "scaleToOffset", "minPx", "maxPx", "userValue", "scaleToUserValue", TypedValues.CycleType.S_WAVE_OFFSET, "updateDimensions", "newThumbWidth", "newTotalWidth", "updateDimensions$material3_release", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2151:1\n76#2:2152\n109#2,2:2153\n76#2:2159\n109#2,2:2160\n76#2:2165\n109#2,2:2166\n76#2:2168\n109#2,2:2169\n1#3:2155\n75#4:2156\n108#4,2:2157\n81#5:2162\n107#5,2:2163\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderState\n*L\n1796#1:2152\n1796#1:2153,2\n1848#1:2159\n1848#1:2160,2\n1880#1:2165\n1880#1:2166,2\n1881#1:2168\n1881#1:2169,2\n1846#1:2156\n1846#1:2157,2\n1857#1:2162\n1857#1:2163,2\n*E\n"})
/* loaded from: classes.dex */
public final class SliderState implements DraggableState {
    public static final int $stable = 0;

    @NotNull
    private final DragScope dragScope;

    @NotNull
    private final Function0<Unit> gestureEndAction;

    /* renamed from: isDragging$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isDragging;
    private boolean isRtl;

    @Nullable
    private Function1<? super Float, Unit> onValueChange;

    @Nullable
    private final Function0<Unit> onValueChangeFinished;

    /* renamed from: pressOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState pressOffset;

    /* renamed from: rawOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState rawOffset;

    @NotNull
    private final MutatorMutex scrollMutex;
    private final int steps;

    /* renamed from: thumbWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState thumbWidth;

    @NotNull
    private final float[] tickFractions;

    /* renamed from: totalWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableIntState totalWidth;

    @NotNull
    private final ClosedFloatingPointRange<Float> valueRange;

    /* renamed from: valueState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState valueState;

    public SliderState() {
        this(0.0f, 0, null, null, 15, null);
    }

    public SliderState(float f, @IntRange(from = 0) int i, @Nullable Function0<Unit> function0, @NotNull ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        this.steps = i;
        this.onValueChangeFinished = function0;
        this.valueRange = closedFloatingPointRange;
        this.valueState = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.tickFractions = SliderKt.stepsToTickFractions(i);
        this.totalWidth = SnapshotIntStateKt.mutableIntStateOf(0);
        this.thumbWidth = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.isDragging = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.gestureEndAction = new Function0<Unit>() { // from class: androidx.compose.material3.SliderState$gestureEndAction$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Function0<Unit> onValueChangeFinished;
                if (this.this$0.isDragging$material3_release() || (onValueChangeFinished = this.this$0.getOnValueChangeFinished()) == null) {
                    return;
                }
                onValueChangeFinished.invoke();
            }
        };
        this.rawOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(scaleToOffset(0.0f, 0.0f, f));
        this.pressOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragScope = new DragScope() { // from class: androidx.compose.material3.SliderState$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float pixels) {
                this.this$0.dispatchRawDelta(pixels);
            }
        };
        this.scrollMutex = new MutatorMutex();
    }

    public final int getSteps() {
        return this.steps;
    }

    @Nullable
    public final Function0<Unit> getOnValueChangeFinished() {
        return this.onValueChangeFinished;
    }

    public /* synthetic */ SliderState(float f, int i, Function0 function0, ClosedFloatingPointRange closedFloatingPointRange, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : function0, (i2 & 8) != 0 ? RangesKt__RangesKt.rangeTo(0.0f, 1.0f) : closedFloatingPointRange);
    }

    @NotNull
    public final ClosedFloatingPointRange<Float> getValueRange() {
        return this.valueRange;
    }

    private final float getValueState() {
        return this.valueState.getFloatValue();
    }

    private final void setValueState(float f) {
        this.valueState.setFloatValue(f);
    }

    public final void setValue(float f) {
        setValueState(SliderKt.snapValueToTick(RangesKt___RangesKt.coerceIn(f, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue()), this.tickFractions, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue()));
    }

    public final float getValue() {
        return getValueState();
    }

    /* compiled from: Slider.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.material3.SliderState$drag$2", m7120f = "Slider.kt", m7121i = {}, m7122l = {1820}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.material3.SliderState$drag$2 */
    /* loaded from: classes2.dex */
    public static final class C16162 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function2<DragScope, Continuation<? super Unit>, Object> $block;
        public final /* synthetic */ MutatePriority $dragPriority;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16162(MutatePriority mutatePriority, Function2<? super DragScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C16162> continuation) {
            super(2, continuation);
            this.$dragPriority = mutatePriority;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SliderState.this.new C16162(this.$dragPriority, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C16162) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SliderState.this.setDragging(true);
                MutatorMutex mutatorMutex = SliderState.this.scrollMutex;
                DragScope dragScope = SliderState.this.dragScope;
                MutatePriority mutatePriority = this.$dragPriority;
                Function2<DragScope, Continuation<? super Unit>, Object> function2 = this.$block;
                this.label = 1;
                if (mutatorMutex.mutateWith(dragScope, mutatePriority, function2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SliderState.this.setDragging(false);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    @Nullable
    public Object drag(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super DragScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new C16162(mutatePriority, function2, null), continuation);
        return objCoroutineScope == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float delta) {
        float f = 2;
        float fMax = Math.max(getTotalWidth() - (getThumbWidth() / f), 0.0f);
        float fMin = Math.min(getThumbWidth() / f, fMax);
        setRawOffset(getRawOffset() + delta + getPressOffset());
        setPressOffset(0.0f);
        float fScaleToUserValue = scaleToUserValue(fMin, fMax, SliderKt.snapValueToTick(getRawOffset(), this.tickFractions, fMin, fMax));
        if (fScaleToUserValue == getValue()) {
            return;
        }
        Function1<? super Float, Unit> function1 = this.onValueChange;
        if (function1 == null) {
            setValue(fScaleToUserValue);
        } else if (function1 != null) {
            function1.invoke(Float.valueOf(fScaleToUserValue));
        }
    }

    @Nullable
    public final Function1<Float, Unit> getOnValueChange$material3_release() {
        return this.onValueChange;
    }

    public final void setOnValueChange$material3_release(@Nullable Function1<? super Float, Unit> function1) {
        this.onValueChange = function1;
    }

    @NotNull
    /* renamed from: getTickFractions$material3_release, reason: from getter */
    public final float[] getTickFractions() {
        return this.tickFractions;
    }

    private final int getTotalWidth() {
        return this.totalWidth.getIntValue();
    }

    private final void setTotalWidth(int i) {
        this.totalWidth.setIntValue(i);
    }

    /* renamed from: isRtl$material3_release, reason: from getter */
    public final boolean getIsRtl() {
        return this.isRtl;
    }

    public final void setRtl$material3_release(boolean z) {
        this.isRtl = z;
    }

    private final float getThumbWidth() {
        return this.thumbWidth.getFloatValue();
    }

    private final void setThumbWidth(float f) {
        this.thumbWidth.setFloatValue(f);
    }

    public final float getCoercedValueAsFraction$material3_release() {
        return SliderKt.calcFraction(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), RangesKt___RangesKt.coerceIn(getValue(), this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDragging(boolean z) {
        this.isDragging.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDragging$material3_release() {
        return ((Boolean) this.isDragging.getValue()).booleanValue();
    }

    public final void updateDimensions$material3_release(float newThumbWidth, int newTotalWidth) {
        setThumbWidth(newThumbWidth);
        setTotalWidth(newTotalWidth);
    }

    @NotNull
    public final Function0<Unit> getGestureEndAction$material3_release() {
        return this.gestureEndAction;
    }

    /* renamed from: onPress-k-4lQ0M$material3_release, reason: not valid java name */
    public final void m9789onPressk4lQ0M$material3_release(long pos) {
        setPressOffset((this.isRtl ? getTotalWidth() - Offset.m11099getXimpl(pos) : Offset.m11099getXimpl(pos)) - getRawOffset());
    }

    private final float getRawOffset() {
        return this.rawOffset.getFloatValue();
    }

    private final void setRawOffset(float f) {
        this.rawOffset.setFloatValue(f);
    }

    private final float getPressOffset() {
        return this.pressOffset.getFloatValue();
    }

    private final void setPressOffset(float f) {
        this.pressOffset.setFloatValue(f);
    }

    private final float scaleToUserValue(float minPx, float maxPx, float offset) {
        return SliderKt.scale(minPx, maxPx, offset, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue());
    }

    private final float scaleToOffset(float minPx, float maxPx, float userValue) {
        return SliderKt.scale(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), userValue, minPx, maxPx);
    }
}
