package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Drawer.kt */
@Stable
@Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J$\u0010\"\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0%H\u0087@¢\u0006\u0002\u0010&J\u000e\u0010'\u001a\u00020#H\u0086@¢\u0006\u0002\u0010(J\u000e\u0010)\u001a\u00020#H\u0086@¢\u0006\u0002\u0010(J\b\u0010*\u001a\u00020\u0010H\u0002J\r\u0010+\u001a\u00020\u001aH\u0000¢\u0006\u0002\b,J\u0016\u0010-\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u0003H\u0086@¢\u0006\u0002\u0010.R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u001a8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u00038GX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u000e¨\u00060"}, m7105d2 = {"Landroidx/compose/material/DrawerState;", "", "initialValue", "Landroidx/compose/material/DrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "(Landroidx/compose/material/DrawerValue;Lkotlin/jvm/functions/Function1;)V", "anchoredDraggableState", "Landroidx/compose/material/AnchoredDraggableState;", "getAnchoredDraggableState$material_release", "()Landroidx/compose/material/AnchoredDraggableState;", "currentValue", "getCurrentValue", "()Landroidx/compose/material/DrawerValue;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$material_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material_release", "(Landroidx/compose/ui/unit/Density;)V", "isAnimationRunning", "()Z", "isClosed", "isOpen", TypedValues.CycleType.S_WAVE_OFFSET, "", "getOffset$annotations", "()V", "getOffset", "()F", "targetValue", "getTargetValue$annotations", "getTargetValue", "animateTo", "", "anim", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/material/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "open", "requireDensity", "requireOffset", "requireOffset$material_release", "snapTo", "(Landroidx/compose/material/DrawerValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "material_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class DrawerState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AnchoredDraggableState<DrawerValue> anchoredDraggableState;

    @Nullable
    private Density density;

    @ExperimentalMaterialApi
    public static /* synthetic */ void getOffset$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getTargetValue$annotations() {
    }

    public DrawerState(@NotNull DrawerValue drawerValue, @NotNull Function1<? super DrawerValue, Boolean> function1) {
        this.anchoredDraggableState = new AnchoredDraggableState<>(drawerValue, new Function1<Float, Float>() { // from class: androidx.compose.material.DrawerState$anchoredDraggableState$1
            {
                super(1);
            }

            @NotNull
            public final Float invoke(float f) {
                return Float.valueOf(this.this$0.requireDensity().mo7874toPx0680j_4(DrawerKt.DrawerPositionalThreshold));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f) {
                return invoke(f.floatValue());
            }
        }, new Function0<Float>() { // from class: androidx.compose.material.DrawerState$anchoredDraggableState$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                return Float.valueOf(this.this$0.requireDensity().mo7874toPx0680j_4(DrawerKt.DrawerVelocityThreshold));
            }
        }, DrawerKt.AnimationSpec, function1);
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawerValue, (i & 2) != 0 ? new Function1<DrawerValue, Boolean>() { // from class: androidx.compose.material.DrawerState.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DrawerValue drawerValue2) {
                return Boolean.TRUE;
            }
        } : function1);
    }

    @NotNull
    public final AnchoredDraggableState<DrawerValue> getAnchoredDraggableState$material_release() {
        return this.anchoredDraggableState;
    }

    public final boolean isOpen() {
        return getCurrentValue() == DrawerValue.Open;
    }

    public final boolean isClosed() {
        return getCurrentValue() == DrawerValue.Closed;
    }

    @NotNull
    public final DrawerValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final boolean isAnimationRunning() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    @Nullable
    public final Object open(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, DrawerValue.Open, 0.0f, continuation, 2, null);
        return objAnimateTo$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    @Nullable
    public final Object close(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, DrawerValue.Closed, 0.0f, continuation, 2, null);
        return objAnimateTo$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This method has been replaced by the open and close methods. The animation spec is now an implementation detail of ModalDrawer.")
    @ExperimentalMaterialApi
    @Nullable
    public final Object animateTo(@NotNull DrawerValue drawerValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, drawerValue, 0.0f, continuation, 2, null);
        return objAnimateTo$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    @Nullable
    public final Object snapTo(@NotNull DrawerValue drawerValue, @NotNull Continuation<? super Unit> continuation) {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, drawerValue, continuation);
        return objSnapTo == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSnapTo : Unit.INSTANCE;
    }

    @ExperimentalMaterialApi
    @NotNull
    public final DrawerValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    @ExperimentalMaterialApi
    public final float getOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    public final float requireOffset$material_release() {
        return this.anchoredDraggableState.requireOffset();
    }

    @Nullable
    /* renamed from: getDensity$material_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    public final void setDensity$material_release(@Nullable Density density) {
        this.density = density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Density requireDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }

    /* compiled from: Drawer.kt */
    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, m7105d2 = {"Landroidx/compose/material/DrawerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/DrawerState;", "Landroidx/compose/material/DrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "material_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Saver<DrawerState, DrawerValue> Saver(@NotNull final Function1<? super DrawerValue, Boolean> confirmStateChange) {
            return SaverKt.Saver(new Function2<SaverScope, DrawerState, DrawerValue>() { // from class: androidx.compose.material.DrawerState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final DrawerValue invoke(@NotNull SaverScope saverScope, @NotNull DrawerState drawerState) {
                    return drawerState.getCurrentValue();
                }
            }, new Function1<DrawerValue, DrawerState>() { // from class: androidx.compose.material.DrawerState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final DrawerState invoke(@NotNull DrawerValue drawerValue) {
                    return new DrawerState(drawerValue, confirmStateChange);
                }
            });
        }
    }
}
