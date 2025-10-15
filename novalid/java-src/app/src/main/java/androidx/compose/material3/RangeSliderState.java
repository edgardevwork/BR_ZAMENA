package androidx.compose.material3;

import androidx.annotation.IntRange;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt__RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Slider.kt */
@ExperimentalMaterial3Api
@Metadata(m7104d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0014\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\u0010\fJ\u001d\u0010_\u001a\u00020\t2\u0006\u0010`\u001a\u00020+2\u0006\u0010a\u001a\u00020\u0003H\u0000¢\u0006\u0002\bbJ \u0010c\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00032\u0006\u0010d\u001a\u00020\u0003H\u0002J*\u0010e\u001a\u00020>2\u0006\u00109\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00032\u0006\u0010a\u001a\u00020>H\u0002ø\u0001\u0000¢\u0006\u0004\bf\u0010gJ\r\u0010h\u001a\u00020\tH\u0000¢\u0006\u0002\biR$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R+\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000fR\u0014\u0010 \u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u000fR\u0014\u0010\"\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R+\u0010%\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0017\u001a\u0004\b&\u0010\u000f\"\u0004\b'\u0010\u0011R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\t0*X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R+\u0010.\u001a\u00020+2\u0006\u0010\u0012\u001a\u00020+8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b/\u00100\"\u0004\b1\u00102R+\u00105\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010\u0017\u001a\u0004\b6\u0010\u000f\"\u0004\b7\u0010\u0011R+\u00109\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010\u0017\u001a\u0004\b:\u0010\u000f\"\u0004\b;\u0010\u0011R(\u0010=\u001a\u0010\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\t\u0018\u00010*X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010-\"\u0004\b@\u0010AR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR+\u0010D\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010\u0017\u001a\u0004\bE\u0010\u000f\"\u0004\bF\u0010\u0011R+\u0010H\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010\u0017\u001a\u0004\bI\u0010\u000f\"\u0004\bJ\u0010\u0011R\u0014\u0010L\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bM\u0010$R+\u0010N\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010\u0017\u001a\u0004\bO\u0010\u000f\"\u0004\bP\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bR\u0010$R\u0014\u0010S\u001a\u00020TX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR+\u0010W\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\bX\u0010$\"\u0004\bY\u0010ZR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006j"}, m7105d2 = {"Landroidx/compose/material3/RangeSliderState;", "", "activeRangeStart", "", "activeRangeEnd", "steps", "", "onValueChangeFinished", "Lkotlin/Function0;", "", "valueRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "(FFILkotlin/jvm/functions/Function0;Lkotlin/ranges/ClosedFloatingPointRange;)V", "newVal", "getActiveRangeEnd", "()F", "setActiveRangeEnd", "(F)V", "<set-?>", "activeRangeEndState", "getActiveRangeEndState", "setActiveRangeEndState", "activeRangeEndState$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getActiveRangeStart", "setActiveRangeStart", "activeRangeStartState", "getActiveRangeStartState", "setActiveRangeStartState", "activeRangeStartState$delegate", "coercedActiveRangeEndAsFraction", "getCoercedActiveRangeEndAsFraction$material3_release", "coercedActiveRangeStartAsFraction", "getCoercedActiveRangeStartAsFraction$material3_release", "endSteps", "getEndSteps$material3_release", "()I", "endThumbWidth", "getEndThumbWidth$material3_release", "setEndThumbWidth$material3_release", "endThumbWidth$delegate", "gestureEndAction", "Lkotlin/Function1;", "", "getGestureEndAction$material3_release", "()Lkotlin/jvm/functions/Function1;", "isRtl", "isRtl$material3_release", "()Z", "setRtl$material3_release", "(Z)V", "isRtl$delegate", "Landroidx/compose/runtime/MutableState;", "maxPx", "getMaxPx", "setMaxPx", "maxPx$delegate", "minPx", "getMinPx", "setMinPx", "minPx$delegate", "onValueChange", "Landroidx/compose/material3/SliderRange;", "getOnValueChange$material3_release", "setOnValueChange$material3_release", "(Lkotlin/jvm/functions/Function1;)V", "getOnValueChangeFinished", "()Lkotlin/jvm/functions/Function0;", "rawOffsetEnd", "getRawOffsetEnd$material3_release", "setRawOffsetEnd$material3_release", "rawOffsetEnd$delegate", "rawOffsetStart", "getRawOffsetStart$material3_release", "setRawOffsetStart$material3_release", "rawOffsetStart$delegate", "startSteps", "getStartSteps$material3_release", "startThumbWidth", "getStartThumbWidth$material3_release", "setStartThumbWidth$material3_release", "startThumbWidth$delegate", "getSteps", "tickFractions", "", "getTickFractions$material3_release", "()[F", "totalWidth", "getTotalWidth$material3_release", "setTotalWidth$material3_release", "(I)V", "totalWidth$delegate", "Landroidx/compose/runtime/MutableIntState;", "getValueRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", "onDrag", "isStart", TypedValues.CycleType.S_WAVE_OFFSET, "onDrag$material3_release", "scaleToOffset", "userValue", "scaleToUserValue", "scaleToUserValue-owVgs5E", "(FFJ)J", "updateMinMaxPx", "updateMinMaxPx$material3_release", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/RangeSliderState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2151:1\n76#2:2152\n109#2,2:2153\n76#2:2155\n109#2,2:2156\n76#2:2158\n109#2,2:2159\n76#2:2161\n109#2,2:2162\n76#2:2167\n109#2,2:2168\n76#2:2170\n109#2,2:2171\n76#2:2176\n109#2,2:2177\n76#2:2179\n109#2,2:2180\n75#3:2164\n108#3,2:2165\n81#4:2173\n107#4,2:2174\n1#5:2182\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/RangeSliderState\n*L\n1923#1:2152\n1923#1:2153,2\n1924#1:2155\n1924#1:2156,2\n1962#1:2158\n1962#1:2159,2\n1963#1:2161\n1963#1:2162,2\n1965#1:2167\n1965#1:2168,2\n1966#1:2170\n1966#1:2171,2\n1974#1:2176\n1974#1:2177,2\n1975#1:2179\n1975#1:2180,2\n1964#1:2164\n1964#1:2165,2\n1968#1:2173\n1968#1:2174,2\n*E\n"})
/* loaded from: classes2.dex */
public final class RangeSliderState {
    public static final int $stable = 0;

    /* renamed from: activeRangeEndState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState activeRangeEndState;

    /* renamed from: activeRangeStartState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState activeRangeStartState;

    /* renamed from: endThumbWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState endThumbWidth;

    @NotNull
    private final Function1<Boolean, Unit> gestureEndAction;

    /* renamed from: isRtl$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isRtl;

    /* renamed from: maxPx$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState maxPx;

    /* renamed from: minPx$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState minPx;

    @Nullable
    private Function1<? super SliderRange, Unit> onValueChange;

    @Nullable
    private final Function0<Unit> onValueChangeFinished;

    /* renamed from: rawOffsetEnd$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState rawOffsetEnd;

    /* renamed from: rawOffsetStart$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState rawOffsetStart;

    /* renamed from: startThumbWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState startThumbWidth;
    private final int steps;

    @NotNull
    private final float[] tickFractions;

    /* renamed from: totalWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableIntState totalWidth;

    @NotNull
    private final ClosedFloatingPointRange<Float> valueRange;

    public RangeSliderState() {
        this(0.0f, 0.0f, 0, null, null, 31, null);
    }

    public RangeSliderState(float f, float f2, @IntRange(from = 0) int i, @Nullable Function0<Unit> function0, @NotNull ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        this.steps = i;
        this.onValueChangeFinished = function0;
        this.valueRange = closedFloatingPointRange;
        this.activeRangeStartState = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.activeRangeEndState = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
        this.tickFractions = SliderKt.stepsToTickFractions(i);
        this.startThumbWidth = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.endThumbWidth = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.totalWidth = SnapshotIntStateKt.mutableIntStateOf(0);
        this.rawOffsetStart = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.rawOffsetEnd = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.isRtl = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.gestureEndAction = new Function1<Boolean, Unit>() { // from class: androidx.compose.material3.RangeSliderState$gestureEndAction$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                Function0<Unit> onValueChangeFinished = this.this$0.getOnValueChangeFinished();
                if (onValueChangeFinished != null) {
                    onValueChangeFinished.invoke();
                }
            }
        };
        this.maxPx = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.minPx = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }

    public final int getSteps() {
        return this.steps;
    }

    @Nullable
    public final Function0<Unit> getOnValueChangeFinished() {
        return this.onValueChangeFinished;
    }

    public /* synthetic */ RangeSliderState(float f, float f2, int i, Function0 function0, ClosedFloatingPointRange closedFloatingPointRange, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 1.0f : f2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : function0, (i2 & 16) != 0 ? RangesKt__RangesKt.rangeTo(0.0f, 1.0f) : closedFloatingPointRange);
    }

    @NotNull
    public final ClosedFloatingPointRange<Float> getValueRange() {
        return this.valueRange;
    }

    private final float getActiveRangeStartState() {
        return this.activeRangeStartState.getFloatValue();
    }

    private final void setActiveRangeStartState(float f) {
        this.activeRangeStartState.setFloatValue(f);
    }

    private final float getActiveRangeEndState() {
        return this.activeRangeEndState.getFloatValue();
    }

    private final void setActiveRangeEndState(float f) {
        this.activeRangeEndState.setFloatValue(f);
    }

    public final void setActiveRangeStart(float f) {
        setActiveRangeStartState(SliderKt.snapValueToTick(RangesKt___RangesKt.coerceIn(f, this.valueRange.getStart().floatValue(), getActiveRangeEnd()), this.tickFractions, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue()));
    }

    public final float getActiveRangeStart() {
        return getActiveRangeStartState();
    }

    public final void setActiveRangeEnd(float f) {
        setActiveRangeEndState(SliderKt.snapValueToTick(RangesKt___RangesKt.coerceIn(f, getActiveRangeStart(), this.valueRange.getEndInclusive().floatValue()), this.tickFractions, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue()));
    }

    public final float getActiveRangeEnd() {
        return getActiveRangeEndState();
    }

    @Nullable
    public final Function1<SliderRange, Unit> getOnValueChange$material3_release() {
        return this.onValueChange;
    }

    public final void setOnValueChange$material3_release(@Nullable Function1<? super SliderRange, Unit> function1) {
        this.onValueChange = function1;
    }

    @NotNull
    /* renamed from: getTickFractions$material3_release, reason: from getter */
    public final float[] getTickFractions() {
        return this.tickFractions;
    }

    public final float getStartThumbWidth$material3_release() {
        return this.startThumbWidth.getFloatValue();
    }

    public final void setStartThumbWidth$material3_release(float f) {
        this.startThumbWidth.setFloatValue(f);
    }

    public final float getEndThumbWidth$material3_release() {
        return this.endThumbWidth.getFloatValue();
    }

    public final void setEndThumbWidth$material3_release(float f) {
        this.endThumbWidth.setFloatValue(f);
    }

    public final int getTotalWidth$material3_release() {
        return this.totalWidth.getIntValue();
    }

    public final void setTotalWidth$material3_release(int i) {
        this.totalWidth.setIntValue(i);
    }

    public final float getRawOffsetStart$material3_release() {
        return this.rawOffsetStart.getFloatValue();
    }

    public final void setRawOffsetStart$material3_release(float f) {
        this.rawOffsetStart.setFloatValue(f);
    }

    public final float getRawOffsetEnd$material3_release() {
        return this.rawOffsetEnd.getFloatValue();
    }

    public final void setRawOffsetEnd$material3_release(float f) {
        this.rawOffsetEnd.setFloatValue(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isRtl$material3_release() {
        return ((Boolean) this.isRtl.getValue()).booleanValue();
    }

    public final void setRtl$material3_release(boolean z) {
        this.isRtl.setValue(Boolean.valueOf(z));
    }

    @NotNull
    public final Function1<Boolean, Unit> getGestureEndAction$material3_release() {
        return this.gestureEndAction;
    }

    private final float getMaxPx() {
        return this.maxPx.getFloatValue();
    }

    private final void setMaxPx(float f) {
        this.maxPx.setFloatValue(f);
    }

    private final float getMinPx() {
        return this.minPx.getFloatValue();
    }

    private final void setMinPx(float f) {
        this.minPx.setFloatValue(f);
    }

    public final void onDrag$material3_release(boolean isStart, float offset) {
        long jSliderRange;
        if (isStart) {
            setRawOffsetStart$material3_release(getRawOffsetStart$material3_release() + offset);
            setRawOffsetEnd$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeEnd()));
            float rawOffsetEnd$material3_release = getRawOffsetEnd$material3_release();
            jSliderRange = SliderKt.SliderRange(SliderKt.snapValueToTick(RangesKt___RangesKt.coerceIn(getRawOffsetStart$material3_release(), getMinPx(), rawOffsetEnd$material3_release), this.tickFractions, getMinPx(), getMaxPx()), rawOffsetEnd$material3_release);
        } else {
            setRawOffsetEnd$material3_release(getRawOffsetEnd$material3_release() + offset);
            setRawOffsetStart$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeStart()));
            float rawOffsetStart$material3_release = getRawOffsetStart$material3_release();
            jSliderRange = SliderKt.SliderRange(rawOffsetStart$material3_release, SliderKt.snapValueToTick(RangesKt___RangesKt.coerceIn(getRawOffsetEnd$material3_release(), rawOffsetStart$material3_release, getMaxPx()), this.tickFractions, getMinPx(), getMaxPx()));
        }
        long jM9671scaleToUserValueowVgs5E = m9671scaleToUserValueowVgs5E(getMinPx(), getMaxPx(), jSliderRange);
        if (SliderRange.m9781equalsimpl0(jM9671scaleToUserValueowVgs5E, SliderKt.SliderRange(getActiveRangeStart(), getActiveRangeEnd()))) {
            return;
        }
        Function1<? super SliderRange, Unit> function1 = this.onValueChange;
        if (function1 == null) {
            setActiveRangeStart(SliderRange.m9783getStartimpl(jM9671scaleToUserValueowVgs5E));
            setActiveRangeEnd(SliderRange.m9782getEndInclusiveimpl(jM9671scaleToUserValueowVgs5E));
        } else if (function1 != null) {
            function1.invoke(SliderRange.m9778boximpl(jM9671scaleToUserValueowVgs5E));
        }
    }

    public final float getCoercedActiveRangeStartAsFraction$material3_release() {
        return SliderKt.calcFraction(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), getActiveRangeStart());
    }

    public final float getCoercedActiveRangeEndAsFraction$material3_release() {
        return SliderKt.calcFraction(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), getActiveRangeEnd());
    }

    public final int getStartSteps$material3_release() {
        return (int) Math.floor(this.steps * getCoercedActiveRangeEndAsFraction$material3_release());
    }

    public final int getEndSteps$material3_release() {
        return (int) Math.floor(this.steps * (1.0f - getCoercedActiveRangeStartAsFraction$material3_release()));
    }

    /* renamed from: scaleToUserValue-owVgs5E, reason: not valid java name */
    private final long m9671scaleToUserValueowVgs5E(float minPx, float maxPx, long offset) {
        return SliderKt.m9774scaleziovWd0(minPx, maxPx, offset, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue());
    }

    private final float scaleToOffset(float minPx, float maxPx, float userValue) {
        return SliderKt.scale(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), userValue, minPx, maxPx);
    }

    public final void updateMinMaxPx$material3_release() {
        float f = 2;
        float fMax = Math.max(getTotalWidth$material3_release() - (getEndThumbWidth$material3_release() / f), 0.0f);
        float fMin = Math.min(getStartThumbWidth$material3_release() / f, fMax);
        if (getMinPx() == fMin && getMaxPx() == fMax) {
            return;
        }
        setMinPx(fMin);
        setMaxPx(fMax);
        setRawOffsetStart$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeStart()));
        setRawOffsetEnd$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeEnd()));
    }
}
