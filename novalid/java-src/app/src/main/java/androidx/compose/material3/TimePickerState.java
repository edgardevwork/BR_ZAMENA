package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.Selection;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.DpKt;
import androidx.compose.p003ui.unit.DpOffset;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.lifecycle.SavedStateHandle;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.internal.bind.TypeAdapters;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TimePicker.kt */
@ExperimentalMaterial3Api
@Metadata(m7104d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0007\u0018\u0000 d2\u00020\u0001:\u0001dB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010G\u001a\u00020HH\u0080@¢\u0006\u0004\bI\u0010JJ\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\u0015\u0010K\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u0003H\u0000¢\u0006\u0002\bMJ%\u0010N\u001a\u00020H2\u0006\u0010O\u001a\u00020\u00132\u0006\u0010P\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020\u0013H\u0000¢\u0006\u0002\bRJ\u0010\u0010S\u001a\u00020\u00132\u0006\u0010T\u001a\u00020\u0013H\u0002J0\u0010U\u001a\u00020H2\u0006\u0010O\u001a\u00020\u00132\u0006\u0010P\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020\u00132\u0006\u0010V\u001a\u00020\u0006H\u0080@¢\u0006\u0004\bW\u0010XJ\u0015\u0010Y\u001a\u00020H2\u0006\u0010\u0017\u001a\u00020\u0003H\u0000¢\u0006\u0002\bZJ\u0015\u0010[\u001a\u00020H2\u0006\u00101\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\\J\u000e\u0010]\u001a\u00020HH\u0086@¢\u0006\u0002\u0010JJ\"\u0010^\u001a\u00020H2\u0006\u0010L\u001a\u00020\u00132\b\b\u0002\u0010_\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b`\u0010aJ\f\u0010b\u001a\u00020\u0003*\u00020\u0013H\u0002J\f\u0010c\u001a\u00020\u0003*\u00020\u0013H\u0002R1\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R+\u0010\u001a\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0019R\u0011\u0010#\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001b\u0010%\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b%\u0010$R+\u0010(\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0010\u001a\u0004\b)\u0010$\"\u0004\b*\u0010+R+\u0010-\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u0010\u001a\u0004\b.\u0010$\"\u0004\b/\u0010+R\u0011\u00101\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b2\u0010\u0019R+\u00103\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010 \u001a\u0004\b4\u0010\u001c\"\u0004\b5\u0010\u001eR\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R1\u0010:\u001a\u0002092\u0006\u0010\b\u001a\u0002098@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b>\u0010\u0010\u001a\u0004\b;\u0010\u0019\"\u0004\b<\u0010=R!\u0010?\u001a\u00020@8@X\u0080\u0084\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bB\u0010'\u001a\u0004\bA\u0010\fR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00030D8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006e"}, m7105d2 = {"Landroidx/compose/material3/TimePickerState;", "", "initialHour", "", "initialMinute", "is24Hour", "", "(IIZ)V", "<set-?>", "Landroidx/compose/ui/unit/IntOffset;", TtmlNode.CENTER, "getCenter-nOcc-ac$material3_release", "()J", "setCenter--gyyYBs$material3_release", "(J)V", "center$delegate", "Landroidx/compose/runtime/MutableState;", "currentAngle", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "getCurrentAngle$material3_release", "()Landroidx/compose/animation/core/Animatable;", "hour", "getHour", "()I", "hourAngle", "getHourAngle$material3_release", "()F", "setHourAngle$material3_release", "(F)V", "hourAngle$delegate", "Landroidx/compose/runtime/MutableFloatState;", "hourForDisplay", "getHourForDisplay$material3_release", "is24hour", "()Z", "isAfternoon", "isAfternoon$delegate", "Landroidx/compose/runtime/State;", "isAfternoonToggle", "isAfternoonToggle$material3_release", "setAfternoonToggle$material3_release", "(Z)V", "isAfternoonToggle$delegate", "isInnerCircle", "isInnerCircle$material3_release", "setInnerCircle$material3_release", "isInnerCircle$delegate", TypeAdapters.C786626.MINUTE, "getMinute", "minuteAngle", "getMinuteAngle$material3_release", "setMinuteAngle$material3_release", "minuteAngle$delegate", "mutex", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/material3/Selection;", "selection", "getSelection-JiIwxys$material3_release", "setSelection-iHAOin8$material3_release", "(I)V", "selection$delegate", "selectorPos", "Landroidx/compose/ui/unit/DpOffset;", "getSelectorPos-RKDOV3M$material3_release", "selectorPos$delegate", SavedStateHandle.VALUES, "", "getValues$material3_release", "()Ljava/util/List;", "animateToCurrent", "", "animateToCurrent$material3_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSelected", "value", "isSelected$material3_release", "moveSelector", "x", "y", "maxDist", "moveSelector$material3_release", "offsetHour", "angle", "onTap", "autoSwitchToMinute", "onTap$material3_release", "(FFFZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setHour", "setHour$material3_release", "setMinute", "setMinute$material3_release", "settle", "update", "fromTap", "update$material3_release", "(FZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toHour", "toMinute", "Companion", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,1843:1\n1#2:1844\n81#3:1845\n81#3:1846\n107#3,2:1847\n81#3:1849\n107#3,2:1850\n81#3:1852\n107#3,2:1853\n81#3:1855\n107#3,2:1856\n81#3:1864\n76#4:1858\n109#4,2:1859\n76#4:1861\n109#4,2:1862\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerState\n*L\n621#1:1845\n637#1:1846\n637#1:1847,2\n640#1:1849\n640#1:1850,2\n641#1:1852\n641#1:1853,2\n642#1:1855\n642#1:1856,2\n652#1:1864\n644#1:1858\n644#1:1859,2\n647#1:1861\n647#1:1862,2\n*E\n"})
/* loaded from: classes2.dex */
public final class TimePickerState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: center$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState center;

    @NotNull
    private final Animatable<Float, AnimationVector1D> currentAngle;

    /* renamed from: hourAngle$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState hourAngle;
    private final boolean is24hour;

    /* renamed from: isAfternoon$delegate, reason: from kotlin metadata */
    @NotNull
    private final State isAfternoon;

    /* renamed from: isAfternoonToggle$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isAfternoonToggle;

    /* renamed from: isInnerCircle$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isInnerCircle;

    /* renamed from: minuteAngle$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState minuteAngle;

    @NotNull
    private final MutatorMutex mutex;

    /* renamed from: selection$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState selection;

    /* renamed from: selectorPos$delegate, reason: from kotlin metadata */
    @NotNull
    private final State selectorPos;

    /* compiled from: TimePicker.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.material3.TimePickerState", m7120f = "TimePicker.kt", m7121i = {0, 0}, m7122l = {733, 734}, m7123m = "settle", m7124n = {"this", "targetValue"}, m7125s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.material3.TimePickerState$settle$1 */
    /* loaded from: classes.dex */
    public static final class C17081 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C17081(Continuation<? super C17081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TimePickerState.this.settle(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float offsetHour(float angle) {
        float f = angle + 1.5707964f;
        return f < 0.0f ? f + 6.2831855f : f;
    }

    public TimePickerState(int i, int i2, final boolean z) {
        if (i < 0 || i >= 24) {
            throw new IllegalArgumentException("initialHour should in [0..23] range".toString());
        }
        if (i2 < 0 || i2 >= 60) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range".toString());
        }
        this.is24hour = z;
        this.selectorPos = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<DpOffset>() { // from class: androidx.compose.material3.TimePickerState$selectorPos$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ DpOffset invoke() {
                return DpOffset.m13721boximpl(m10076invokeRKDOV3M());
            }

            /* renamed from: invoke-RKDOV3M, reason: not valid java name */
            public final long m10076invokeRKDOV3M() {
                boolean zIsInnerCircle$material3_release = this.this$0.isInnerCircle$material3_release();
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                float f = 2;
                float fM13666constructorimpl = C2046Dp.m13666constructorimpl(timePickerTokens.m10735getClockDialSelectorHandleContainerSizeD9Ej5fM() / f);
                float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(((z && zIsInnerCircle$material3_release && Selection.m9744equalsimpl0(this.this$0.m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9748getHourJiIwxys())) ? TimePickerKt.InnerCircleRadius : TimePickerKt.OuterCircleSizeRadius) - fM13666constructorimpl) + fM13666constructorimpl);
                return DpKt.m13687DpOffsetYgX7TsA(C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(((float) Math.cos(this.this$0.getCurrentAngle$material3_release().getValue().floatValue())) * fM13666constructorimpl2) + C2046Dp.m13666constructorimpl(timePickerTokens.m10733getClockDialContainerSizeD9Ej5fM() / f)), C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(fM13666constructorimpl2 * ((float) Math.sin(this.this$0.getCurrentAngle$material3_release().getValue().floatValue()))) + C2046Dp.m13666constructorimpl(timePickerTokens.m10733getClockDialContainerSizeD9Ej5fM() / f)));
            }
        });
        this.center = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m13785boximpl(IntOffset.INSTANCE.m13804getZeronOccac()), null, 2, null);
        this.selection = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Selection.m9741boximpl(Selection.INSTANCE.m9748getHourJiIwxys()), null, 2, null);
        this.isAfternoonToggle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(i >= 12 && !z), null, 2, null);
        this.isInnerCircle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(i >= 12), null, 2, null);
        this.hourAngle = PrimitiveSnapshotStateKt.mutableFloatStateOf(((i % 12) * 0.5235988f) - 1.5707964f);
        this.minuteAngle = PrimitiveSnapshotStateKt.mutableFloatStateOf((i2 * 0.10471976f) - 1.5707964f);
        this.mutex = new MutatorMutex();
        this.isAfternoon = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.TimePickerState.isAfternoon.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf((TimePickerState.this.getIs24hour() && TimePickerState.this.isInnerCircle$material3_release()) || TimePickerState.this.isAfternoonToggle$material3_release());
            }
        });
        this.currentAngle = AnimatableKt.Animatable$default(getHourAngle$material3_release(), 0.0f, 2, null);
    }

    public final int getMinute() {
        return toMinute(getMinuteAngle$material3_release());
    }

    public final int getHour() {
        return toHour(getHourAngle$material3_release()) + (isAfternoon() ? 12 : 0);
    }

    /* renamed from: is24hour, reason: from getter */
    public final boolean getIs24hour() {
        return this.is24hour;
    }

    public final int getHourForDisplay$material3_release() {
        return hourForDisplay(getHour());
    }

    /* renamed from: getSelectorPos-RKDOV3M$material3_release, reason: not valid java name */
    public final long m10073getSelectorPosRKDOV3M$material3_release() {
        return ((DpOffset) this.selectorPos.getValue()).getPackedValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCenter-nOcc-ac$material3_release, reason: not valid java name */
    public final long m10071getCenternOccac$material3_release() {
        return ((IntOffset) this.center.getValue()).getPackedValue();
    }

    /* renamed from: setCenter--gyyYBs$material3_release, reason: not valid java name */
    public final void m10074setCentergyyYBs$material3_release(long j) {
        this.center.setValue(IntOffset.m13785boximpl(j));
    }

    @NotNull
    public final List<Integer> getValues$material3_release() {
        return Selection.m9744equalsimpl0(m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9749getMinuteJiIwxys()) ? TimePickerKt.Minutes : TimePickerKt.Hours;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSelection-JiIwxys$material3_release, reason: not valid java name */
    public final int m10072getSelectionJiIwxys$material3_release() {
        return ((Selection) this.selection.getValue()).m9747unboximpl();
    }

    /* renamed from: setSelection-iHAOin8$material3_release, reason: not valid java name */
    public final void m10075setSelectioniHAOin8$material3_release(int i) {
        this.selection.setValue(Selection.m9741boximpl(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAfternoonToggle$material3_release() {
        return ((Boolean) this.isAfternoonToggle.getValue()).booleanValue();
    }

    public final void setAfternoonToggle$material3_release(boolean z) {
        this.isAfternoonToggle.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInnerCircle$material3_release() {
        return ((Boolean) this.isInnerCircle.getValue()).booleanValue();
    }

    public final void setInnerCircle$material3_release(boolean z) {
        this.isInnerCircle.setValue(Boolean.valueOf(z));
    }

    public final float getHourAngle$material3_release() {
        return this.hourAngle.getFloatValue();
    }

    public final void setHourAngle$material3_release(float f) {
        this.hourAngle.setFloatValue(f);
    }

    public final float getMinuteAngle$material3_release() {
        return this.minuteAngle.getFloatValue();
    }

    public final void setMinuteAngle$material3_release(float f) {
        this.minuteAngle.setFloatValue(f);
    }

    private final boolean isAfternoon() {
        return ((Boolean) this.isAfternoon.getValue()).booleanValue();
    }

    @NotNull
    public final Animatable<Float, AnimationVector1D> getCurrentAngle$material3_release() {
        return this.currentAngle;
    }

    public final void setMinute$material3_release(int minute) {
        setMinuteAngle$material3_release((minute * 0.10471976f) - 1.5707964f);
    }

    public final void setHour$material3_release(int hour) {
        setInnerCircle$material3_release(hour >= 12);
        setHourAngle$material3_release(((hour % 12) * 0.5235988f) - 1.5707964f);
    }

    public final void moveSelector$material3_release(float x, float y, float maxDist) {
        if (Selection.m9744equalsimpl0(m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9748getHourJiIwxys()) && this.is24hour) {
            setInnerCircle$material3_release(TimePickerKt.dist(x, y, IntOffset.m13794getXimpl(m10071getCenternOccac$material3_release()), IntOffset.m13795getYimpl(m10071getCenternOccac$material3_release())) < maxDist);
        }
    }

    public final boolean isSelected$material3_release(int value) {
        if (Selection.m9744equalsimpl0(m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9749getMinuteJiIwxys())) {
            if (value == getMinute()) {
                return true;
            }
        } else {
            if (getHour() == value + (isAfternoon() ? 12 : 0)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ Object update$material3_release$default(TimePickerState timePickerState, float f, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return timePickerState.update$material3_release(f, z, continuation);
    }

    @Nullable
    public final Object update$material3_release(float f, boolean z, @NotNull Continuation<? super Unit> continuation) {
        Object objMutate = this.mutex.mutate(MutatePriority.UserInput, new TimePickerState$update$2(this, f, z, null), continuation);
        return objMutate == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animateToCurrent$material3_release(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        TimePickerState$animateToCurrent$1 timePickerState$animateToCurrent$1;
        TimePickerState timePickerState;
        float f;
        if (continuation instanceof TimePickerState$animateToCurrent$1) {
            timePickerState$animateToCurrent$1 = (TimePickerState$animateToCurrent$1) continuation;
            int i = timePickerState$animateToCurrent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timePickerState$animateToCurrent$1.label = i - Integer.MIN_VALUE;
            } else {
                timePickerState$animateToCurrent$1 = new TimePickerState$animateToCurrent$1(this, continuation);
            }
        }
        TimePickerState$animateToCurrent$1 timePickerState$animateToCurrent$12 = timePickerState$animateToCurrent$1;
        Object obj = timePickerState$animateToCurrent$12.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timePickerState$animateToCurrent$12.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Pair pairValuesForAnimation = Selection.m9744equalsimpl0(m10072getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m9748getHourJiIwxys()) ? TimePickerKt.valuesForAnimation(getMinuteAngle$material3_release(), getHourAngle$material3_release()) : TimePickerKt.valuesForAnimation(getHourAngle$material3_release(), getMinuteAngle$material3_release());
            float fFloatValue = ((Number) pairValuesForAnimation.component1()).floatValue();
            float fFloatValue2 = ((Number) pairValuesForAnimation.component2()).floatValue();
            Animatable<Float, AnimationVector1D> animatable = this.currentAngle;
            Float fBoxFloat = Boxing.boxFloat(fFloatValue);
            timePickerState$animateToCurrent$12.L$0 = this;
            timePickerState$animateToCurrent$12.F$0 = fFloatValue2;
            timePickerState$animateToCurrent$12.label = 1;
            if (animatable.snapTo(fBoxFloat, timePickerState$animateToCurrent$12) == coroutine_suspended) {
                return coroutine_suspended;
            }
            timePickerState = this;
            f = fFloatValue2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            f = timePickerState$animateToCurrent$12.F$0;
            timePickerState = (TimePickerState) timePickerState$animateToCurrent$12.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Animatable<Float, AnimationVector1D> animatable2 = timePickerState.currentAngle;
        Float fBoxFloat2 = Boxing.boxFloat(f);
        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
        timePickerState$animateToCurrent$12.L$0 = null;
        timePickerState$animateToCurrent$12.label = 2;
        if (Animatable.animateTo$default(animatable2, fBoxFloat2, tweenSpecTween$default, null, null, timePickerState$animateToCurrent$12, 12, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    private final int hourForDisplay(int hour) {
        if (this.is24hour) {
            return hour % 24;
        }
        if (hour % 12 == 0) {
            return 12;
        }
        return isAfternoon() ? hour - 12 : hour;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toHour(float f) {
        return ((int) ((f + (0.2617994f + 1.5707963267948966d)) / 0.5235988f)) % 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toMinute(float f) {
        return ((int) ((f + (0.05235988f + 1.5707963267948966d)) / 0.10471976f)) % 60;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object settle(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        C17081 c17081;
        Pair pairValuesForAnimation;
        TimePickerState timePickerState;
        if (continuation instanceof C17081) {
            c17081 = (C17081) continuation;
            int i = c17081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17081.label = i - Integer.MIN_VALUE;
            } else {
                c17081 = new C17081(continuation);
            }
        }
        C17081 c170812 = c17081;
        Object obj = c170812.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c170812.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            pairValuesForAnimation = TimePickerKt.valuesForAnimation(this.currentAngle.getValue().floatValue(), getMinuteAngle$material3_release());
            Animatable<Float, AnimationVector1D> animatable = this.currentAngle;
            Object first = pairValuesForAnimation.getFirst();
            c170812.L$0 = this;
            c170812.L$1 = pairValuesForAnimation;
            c170812.label = 1;
            if (animatable.snapTo(first, c170812) == coroutine_suspended) {
                return coroutine_suspended;
            }
            timePickerState = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            pairValuesForAnimation = (Pair) c170812.L$1;
            timePickerState = (TimePickerState) c170812.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Animatable<Float, AnimationVector1D> animatable2 = timePickerState.currentAngle;
        Object second = pairValuesForAnimation.getSecond();
        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
        c170812.L$0 = null;
        c170812.L$1 = null;
        c170812.label = 2;
        if (Animatable.animateTo$default(animatable2, second, tweenSpecTween$default, null, null, c170812, 12, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onTap$material3_release(float f, float f2, float f3, boolean z, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        TimePickerState$onTap$1 timePickerState$onTap$1;
        boolean z2;
        float f4;
        float f5;
        TimePickerState timePickerState;
        Pair pairValuesForAnimation;
        Animatable<Float, AnimationVector1D> animatable;
        Object second;
        TweenSpec tweenSpecTween$default;
        if (continuation instanceof TimePickerState$onTap$1) {
            timePickerState$onTap$1 = (TimePickerState$onTap$1) continuation;
            int i = timePickerState$onTap$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timePickerState$onTap$1.label = i - Integer.MIN_VALUE;
            } else {
                timePickerState$onTap$1 = new TimePickerState$onTap$1(this, continuation);
            }
        }
        TimePickerState$onTap$1 timePickerState$onTap$12 = timePickerState$onTap$1;
        Object obj = timePickerState$onTap$12.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = timePickerState$onTap$12.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            float fAtan = TimePickerKt.atan(f2 - IntOffset.m13795getYimpl(m10071getCenternOccac$material3_release()), f - IntOffset.m13794getXimpl(m10071getCenternOccac$material3_release()));
            timePickerState$onTap$12.L$0 = this;
            timePickerState$onTap$12.F$0 = f;
            timePickerState$onTap$12.F$1 = f2;
            timePickerState$onTap$12.F$2 = f3;
            timePickerState$onTap$12.Z$0 = z;
            timePickerState$onTap$12.label = 1;
            if (update$material3_release(fAtan, true, timePickerState$onTap$12) == coroutine_suspended) {
                return coroutine_suspended;
            }
            z2 = z;
            f4 = f3;
            f5 = f2;
            timePickerState = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                pairValuesForAnimation = (Pair) timePickerState$onTap$12.L$1;
                timePickerState = (TimePickerState) timePickerState$onTap$12.L$0;
                ResultKt.throwOnFailure(obj);
                animatable = timePickerState.currentAngle;
                second = pairValuesForAnimation.getSecond();
                tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
                timePickerState$onTap$12.L$0 = null;
                timePickerState$onTap$12.L$1 = null;
                timePickerState$onTap$12.label = 3;
                if (Animatable.animateTo$default(animatable, second, tweenSpecTween$default, null, null, timePickerState$onTap$12, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            boolean z3 = timePickerState$onTap$12.Z$0;
            float f6 = timePickerState$onTap$12.F$2;
            float f7 = timePickerState$onTap$12.F$1;
            f = timePickerState$onTap$12.F$0;
            TimePickerState timePickerState2 = (TimePickerState) timePickerState$onTap$12.L$0;
            ResultKt.throwOnFailure(obj);
            z2 = z3;
            f4 = f6;
            f5 = f7;
            timePickerState = timePickerState2;
        }
        timePickerState.moveSelector$material3_release(f, f5, f4);
        int iM10072getSelectionJiIwxys$material3_release = timePickerState.m10072getSelectionJiIwxys$material3_release();
        Selection.Companion companion = Selection.INSTANCE;
        if (!Selection.m9744equalsimpl0(iM10072getSelectionJiIwxys$material3_release, companion.m9748getHourJiIwxys())) {
            timePickerState$onTap$12.L$0 = null;
            timePickerState$onTap$12.label = 4;
            if (timePickerState.settle(timePickerState$onTap$12) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (!z2) {
            pairValuesForAnimation = TimePickerKt.valuesForAnimation(timePickerState.currentAngle.getValue().floatValue(), timePickerState.getHourAngle$material3_release());
            Animatable<Float, AnimationVector1D> animatable2 = timePickerState.currentAngle;
            Object first = pairValuesForAnimation.getFirst();
            timePickerState$onTap$12.L$0 = timePickerState;
            timePickerState$onTap$12.L$1 = pairValuesForAnimation;
            timePickerState$onTap$12.label = 2;
            if (animatable2.snapTo(first, timePickerState$onTap$12) == coroutine_suspended) {
                return coroutine_suspended;
            }
            animatable = timePickerState.currentAngle;
            second = pairValuesForAnimation.getSecond();
            tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
            timePickerState$onTap$12.L$0 = null;
            timePickerState$onTap$12.L$1 = null;
            timePickerState$onTap$12.label = 3;
            if (Animatable.animateTo$default(animatable, second, tweenSpecTween$default, null, null, timePickerState$onTap$12, 12, null) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        }
        timePickerState.m10075setSelectioniHAOin8$material3_release(companion.m9749getMinuteJiIwxys());
        return Unit.INSTANCE;
    }

    /* compiled from: TimePicker.kt */
    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¨\u0006\u0006"}, m7105d2 = {"Landroidx/compose/material3/TimePickerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/TimePickerState;", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Saver<TimePickerState, ?> Saver() {
            return SaverKt.Saver(new Function2<SaverScope, TimePickerState, List<? extends Object>>() { // from class: androidx.compose.material3.TimePickerState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final List<Object> invoke(@NotNull SaverScope saverScope, @NotNull TimePickerState timePickerState) {
                    return CollectionsKt__CollectionsKt.listOf(Integer.valueOf(timePickerState.getHour()), Integer.valueOf(timePickerState.getMinute()), Boolean.valueOf(timePickerState.getIs24hour()));
                }
            }, new Function1<List, TimePickerState>() { // from class: androidx.compose.material3.TimePickerState$Companion$Saver$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ TimePickerState invoke(List list) {
                    return invoke2((List<? extends Object>) list);
                }

                @Nullable
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final TimePickerState invoke2(@NotNull List<? extends Object> list) {
                    Object obj = list.get(0);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) obj).intValue();
                    Object obj2 = list.get(1);
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue2 = ((Integer) obj2).intValue();
                    Object obj3 = list.get(2);
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    return new TimePickerState(iIntValue, iIntValue2, ((Boolean) obj3).booleanValue());
                }
            });
        }
    }
}
