package androidx.compose.material;

import androidx.annotation.FloatRange;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\"\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u001fH\u0080@¢\u0006\u0004\b-\u0010.J\u000e\u0010/\u001a\u00020*H\u0086@¢\u0006\u0002\u00100J\u0015\u0010\u0004\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0003H\u0000¢\u0006\u0002\b2J\u000e\u00103\u001a\u00020*H\u0086@¢\u0006\u0002\u00100J\u000e\u00104\u001a\u00020*H\u0086@¢\u0006\u0002\u00100J\b\u00105\u001a\u00020\u0010H\u0002J\r\u00106\u001a\u00020\u001fH\u0000¢\u0006\u0002\b7J\u0018\u00108\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0003H\u0080@¢\u0006\u0004\b9\u0010:R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u001bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\u00020\u001f8F¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001f8GX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u0011\u0010'\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010\u000e¨\u0006<"}, m7105d2 = {"Landroidx/compose/material/BottomDrawerState;", "", "initialValue", "Landroidx/compose/material/BottomDrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/jvm/functions/Function1;)V", "anchoredDraggableState", "Landroidx/compose/material/AnchoredDraggableState;", "getAnchoredDraggableState$material_release", "()Landroidx/compose/material/AnchoredDraggableState;", "currentValue", "getCurrentValue", "()Landroidx/compose/material/BottomDrawerValue;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$material_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material_release", "(Landroidx/compose/ui/unit/Density;)V", "isClosed", "()Z", "isExpanded", "isOpen", "isOpenEnabled", "nestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection$material_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", TypedValues.CycleType.S_WAVE_OFFSET, "", "getOffset$annotations", "()V", "getOffset", "()F", "progress", "getProgress$annotations", "getProgress", "targetValue", "getTargetValue", "animateTo", "", "target", "velocity", "animateTo$material_release", "(Landroidx/compose/material/BottomDrawerValue;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "confirmStateChange$material_release", "expand", "open", "requireDensity", "requireOffset", "requireOffset$material_release", "snapTo", "snapTo$material_release", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "material_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class BottomDrawerState {

    @NotNull
    private final AnchoredDraggableState<BottomDrawerValue> anchoredDraggableState;

    @Nullable
    private Density density;

    @NotNull
    private final NestedScrollConnection nestedScrollConnection;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ void getOffset$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }

    @Deprecated(message = "This constructor is deprecated. Density must be provided by the component. Please use the constructor that provides a [Density].", replaceWith = @ReplaceWith(expression = "\n            BottomDrawerState(\n                initialValue = initialValue,\n                density =,\n                confirmStateChange = confirmStateChange\n            )\n            ", imports = {}))
    public BottomDrawerState(@NotNull BottomDrawerValue bottomDrawerValue, @NotNull Function1<? super BottomDrawerValue, Boolean> function1) {
        AnchoredDraggableState<BottomDrawerValue> anchoredDraggableState = new AnchoredDraggableState<>(bottomDrawerValue, new Function1<Float, Float>() { // from class: androidx.compose.material.BottomDrawerState$anchoredDraggableState$1
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
        }, new Function0<Float>() { // from class: androidx.compose.material.BottomDrawerState$anchoredDraggableState$2
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
        this.anchoredDraggableState = anchoredDraggableState;
        this.nestedScrollConnection = DrawerKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(anchoredDraggableState);
    }

    public /* synthetic */ BottomDrawerState(BottomDrawerValue bottomDrawerValue, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bottomDrawerValue, (i & 2) != 0 ? new Function1<BottomDrawerValue, Boolean>() { // from class: androidx.compose.material.BottomDrawerState.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull BottomDrawerValue bottomDrawerValue2) {
                return Boolean.TRUE;
            }
        } : function1);
    }

    @NotNull
    public final AnchoredDraggableState<BottomDrawerValue> getAnchoredDraggableState$material_release() {
        return this.anchoredDraggableState;
    }

    @NotNull
    public final BottomDrawerValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final float getOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    public final float requireOffset$material_release() {
        return this.anchoredDraggableState.requireOffset();
    }

    @NotNull
    public final BottomDrawerValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    @FloatRange(from = 0.0d, m9to = 1.0d)
    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    public final boolean isOpen() {
        return this.anchoredDraggableState.getCurrentValue() != BottomDrawerValue.Closed;
    }

    public final boolean isClosed() {
        return this.anchoredDraggableState.getCurrentValue() == BottomDrawerValue.Closed;
    }

    public final boolean isExpanded() {
        return this.anchoredDraggableState.getCurrentValue() == BottomDrawerValue.Expanded;
    }

    @Nullable
    public final Object open(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, isOpenEnabled() ? BottomDrawerValue.Open : BottomDrawerValue.Expanded, 0.0f, continuation, 2, null);
        return objAnimateTo$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    @Nullable
    public final Object close(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, BottomDrawerValue.Closed, 0.0f, continuation, 2, null);
        return objAnimateTo$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    @Nullable
    public final Object expand(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, BottomDrawerValue.Expanded, 0.0f, continuation, 2, null);
        return objAnimateTo$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateTo$material_release$default(BottomDrawerState bottomDrawerState, BottomDrawerValue bottomDrawerValue, float f, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            f = bottomDrawerState.anchoredDraggableState.getLastVelocity();
        }
        return bottomDrawerState.animateTo$material_release(bottomDrawerValue, f, continuation);
    }

    @Nullable
    public final Object animateTo$material_release(@NotNull BottomDrawerValue bottomDrawerValue, float f, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, bottomDrawerValue, f, continuation);
        return objAnimateTo == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo : Unit.INSTANCE;
    }

    @Nullable
    public final Object snapTo$material_release(@NotNull BottomDrawerValue bottomDrawerValue, @NotNull Continuation<? super Unit> continuation) {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, bottomDrawerValue, continuation);
        return objSnapTo == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSnapTo : Unit.INSTANCE;
    }

    public final boolean confirmStateChange$material_release(@NotNull BottomDrawerValue value) {
        return this.anchoredDraggableState.getConfirmValueChange$material_release().invoke(value).booleanValue();
    }

    private final boolean isOpenEnabled() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(BottomDrawerValue.Open);
    }

    @NotNull
    /* renamed from: getNestedScrollConnection$material_release, reason: from getter */
    public final NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
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
        throw new IllegalArgumentException(("The density on BottomDrawerState (" + this + ") was not set. Did you use BottomDrawer with the BottomDrawer composable?").toString());
    }

    /* compiled from: Drawer.kt */
    @Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bH\u0007J.\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\f"}, m7105d2 = {"Landroidx/compose/material/BottomDrawerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/BottomDrawerState;", "Landroidx/compose/material/BottomDrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "density", "Landroidx/compose/ui/unit/Density;", "material_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Saver<BottomDrawerState, BottomDrawerValue> Saver(@NotNull final Density density, @NotNull final Function1<? super BottomDrawerValue, Boolean> confirmStateChange) {
            return SaverKt.Saver(new Function2<SaverScope, BottomDrawerState, BottomDrawerValue>() { // from class: androidx.compose.material.BottomDrawerState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final BottomDrawerValue invoke(@NotNull SaverScope saverScope, @NotNull BottomDrawerState bottomDrawerState) {
                    return bottomDrawerState.getAnchoredDraggableState$material_release().getCurrentValue();
                }
            }, new Function1<BottomDrawerValue, BottomDrawerState>() { // from class: androidx.compose.material.BottomDrawerState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final BottomDrawerState invoke(@NotNull BottomDrawerValue bottomDrawerValue) {
                    return DrawerKt.BottomDrawerState(bottomDrawerValue, density, confirmStateChange);
                }
            });
        }

        @Deprecated(message = "This function is deprecated. Please use the overload where Density is provided.", replaceWith = @ReplaceWith(expression = "Saver(density, confirmValueChange)", imports = {}))
        @NotNull
        public final Saver<BottomDrawerState, BottomDrawerValue> Saver(@NotNull final Function1<? super BottomDrawerValue, Boolean> confirmStateChange) {
            return SaverKt.Saver(new Function2<SaverScope, BottomDrawerState, BottomDrawerValue>() { // from class: androidx.compose.material.BottomDrawerState$Companion$Saver$3
                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final BottomDrawerValue invoke(@NotNull SaverScope saverScope, @NotNull BottomDrawerState bottomDrawerState) {
                    return bottomDrawerState.getAnchoredDraggableState$material_release().getCurrentValue();
                }
            }, new Function1<BottomDrawerValue, BottomDrawerState>() { // from class: androidx.compose.material.BottomDrawerState$Companion$Saver$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final BottomDrawerState invoke(@NotNull BottomDrawerValue bottomDrawerValue) {
                    return new BottomDrawerState(bottomDrawerValue, confirmStateChange);
                }
            });
        }
    }
}
