package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FloatingActionButton.kt */
@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0002\u0010\u0012J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014J\u000e\u0010\u0015\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0016J3\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u0003*\u0004\u0018\u00010\rH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u0003X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, m7105d2 = {"Landroidx/compose/material/FloatingActionButtonElevationAnimatable;", "", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "hoveredElevation", "focusedElevation", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "animatable", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "F", "lastTargetInteraction", "Landroidx/compose/foundation/interaction/Interaction;", "targetInteraction", "animateElevation", "", "to", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asState", "Landroidx/compose/runtime/State;", "snapElevation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateElevation", "updateElevation-lDy3nrA", "(FFFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateTarget", "calculateTarget-u2uoSUM", "(Landroidx/compose/foundation/interaction/Interaction;)F", "material_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class FloatingActionButtonElevationAnimatable {

    @NotNull
    public final Animatable<C2046Dp, AnimationVector1D> animatable;
    public float defaultElevation;
    public float focusedElevation;
    public float hoveredElevation;

    @Nullable
    public Interaction lastTargetInteraction;
    public float pressedElevation;

    @Nullable
    public Interaction targetInteraction;

    /* compiled from: FloatingActionButton.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", m7120f = "FloatingActionButton.kt", m7121i = {0, 0}, m7122l = {395}, m7123m = "animateElevation", m7124n = {"this", "to"}, m7125s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1 */
    /* loaded from: classes2.dex */
    public static final class C11081 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C11081(Continuation<? super C11081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FloatingActionButtonElevationAnimatable.this.animateElevation(null, this);
        }
    }

    /* compiled from: FloatingActionButton.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", m7120f = "FloatingActionButton.kt", m7121i = {0}, m7122l = {381}, m7123m = "snapElevation", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1 */
    /* loaded from: classes2.dex */
    public static final class C11091 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C11091(Continuation<? super C11091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FloatingActionButtonElevationAnimatable.this.snapElevation(this);
        }
    }

    public /* synthetic */ FloatingActionButtonElevationAnimatable(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    public FloatingActionButtonElevationAnimatable(float f, float f2, float f3, float f4) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.hoveredElevation = f3;
        this.focusedElevation = f4;
        this.animatable = new Animatable<>(C2046Dp.m13664boximpl(this.defaultElevation), VectorConvertersKt.getVectorConverter(C2046Dp.INSTANCE), null, null, 12, null);
    }

    /* renamed from: calculateTarget-u2uoSUM */
    public final float m8930calculateTargetu2uoSUM(Interaction interaction) {
        return interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : this.defaultElevation;
    }

    @Nullable
    /* renamed from: updateElevation-lDy3nrA */
    public final Object m8931updateElevationlDy3nrA(float f, float f2, float f3, float f4, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.hoveredElevation = f3;
        this.focusedElevation = f4;
        Object objSnapElevation = snapElevation(continuation);
        return objSnapElevation == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSnapElevation : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object snapElevation(Continuation<? super Unit> continuation) throws Throwable {
        C11091 c11091;
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable;
        if (continuation instanceof C11091) {
            c11091 = (C11091) continuation;
            int i = c11091.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11091.label = i - Integer.MIN_VALUE;
            } else {
                c11091 = new C11091(continuation);
            }
        }
        Object obj = c11091.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c11091.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            float fM8930calculateTargetu2uoSUM = m8930calculateTargetu2uoSUM(this.targetInteraction);
            if (!C2046Dp.m13671equalsimpl0(this.animatable.getTargetValue().m13680unboximpl(), fM8930calculateTargetu2uoSUM)) {
                try {
                    Animatable<C2046Dp, AnimationVector1D> animatable = this.animatable;
                    C2046Dp c2046DpM13664boximpl = C2046Dp.m13664boximpl(fM8930calculateTargetu2uoSUM);
                    c11091.L$0 = this;
                    c11091.label = 1;
                    if (animatable.snapTo(c2046DpM13664boximpl, c11091) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatingActionButtonElevationAnimatable = this;
                    floatingActionButtonElevationAnimatable.lastTargetInteraction = floatingActionButtonElevationAnimatable.targetInteraction;
                } catch (Throwable th) {
                    th = th;
                    floatingActionButtonElevationAnimatable = this;
                    floatingActionButtonElevationAnimatable.lastTargetInteraction = floatingActionButtonElevationAnimatable.targetInteraction;
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatingActionButtonElevationAnimatable = (FloatingActionButtonElevationAnimatable) c11091.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                floatingActionButtonElevationAnimatable.lastTargetInteraction = floatingActionButtonElevationAnimatable.targetInteraction;
            } catch (Throwable th2) {
                th = th2;
                floatingActionButtonElevationAnimatable.lastTargetInteraction = floatingActionButtonElevationAnimatable.targetInteraction;
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animateElevation(@Nullable Interaction interaction, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C11081 c11081;
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable;
        if (continuation instanceof C11081) {
            c11081 = (C11081) continuation;
            int i = c11081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11081.label = i - Integer.MIN_VALUE;
            } else {
                c11081 = new C11081(continuation);
            }
        }
        Object obj = c11081.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c11081.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interaction = (Interaction) c11081.L$1;
            floatingActionButtonElevationAnimatable = (FloatingActionButtonElevationAnimatable) c11081.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                floatingActionButtonElevationAnimatable.lastTargetInteraction = interaction;
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                floatingActionButtonElevationAnimatable.lastTargetInteraction = interaction;
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        float fM8930calculateTargetu2uoSUM = m8930calculateTargetu2uoSUM(interaction);
        this.targetInteraction = interaction;
        try {
            if (!C2046Dp.m13671equalsimpl0(this.animatable.getTargetValue().m13680unboximpl(), fM8930calculateTargetu2uoSUM)) {
                Animatable<C2046Dp, AnimationVector1D> animatable = this.animatable;
                Interaction interaction2 = this.lastTargetInteraction;
                c11081.L$0 = this;
                c11081.L$1 = interaction;
                c11081.label = 1;
                if (ElevationKt.m8908animateElevationrAjV9yQ(animatable, fM8930calculateTargetu2uoSUM, interaction2, interaction, c11081) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            floatingActionButtonElevationAnimatable = this;
            floatingActionButtonElevationAnimatable.lastTargetInteraction = interaction;
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            floatingActionButtonElevationAnimatable = this;
            floatingActionButtonElevationAnimatable.lastTargetInteraction = interaction;
            throw th;
        }
    }

    @NotNull
    public final State<C2046Dp> asState() {
        return this.animatable.asState();
    }
}
