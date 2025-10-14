package androidx.compose.material;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
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

/* compiled from: ModalBottomSheet.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nB=\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\fJ\"\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020)H\u0080@¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020)H\u0080@¢\u0006\u0004\b2\u00100J\u000e\u00103\u001a\u00020)H\u0086@¢\u0006\u0002\u00100J\b\u00104\u001a\u00020\u0017H\u0002J\r\u00105\u001a\u00020\u0006H\u0000¢\u0006\u0002\b6J\u000e\u00107\u001a\u00020)H\u0086@¢\u0006\u0002\u00100J\u0018\u00108\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0003H\u0080@¢\u0006\u0004\b9\u0010:R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010 \u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u001a\u0010!\u001a\u00020\u00068GX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b'\u0010\u0015¨\u0006<"}, m7105d2 = {"Landroidx/compose/material/ModalBottomSheetState;", "", "initialValue", "Landroidx/compose/material/ModalBottomSheetValue;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "isSkipHalfExpanded", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;)V", "anchoredDraggableState", "Landroidx/compose/material/AnchoredDraggableState;", "getAnchoredDraggableState$material_release", "()Landroidx/compose/material/AnchoredDraggableState;", "getAnimationSpec$material_release", "()Landroidx/compose/animation/core/AnimationSpec;", "currentValue", "getCurrentValue", "()Landroidx/compose/material/ModalBottomSheetValue;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$material_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material_release", "(Landroidx/compose/ui/unit/Density;)V", "hasHalfExpandedState", "getHasHalfExpandedState$material_release", "()Z", "isSkipHalfExpanded$material_release", "isVisible", "progress", "getProgress$annotations", "()V", "getProgress", "()F", "targetValue", "getTargetValue", "animateTo", "", "target", "velocity", "animateTo$material_release", "(Landroidx/compose/material/ModalBottomSheetValue;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expand", "expand$material_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "halfExpand", "halfExpand$material_release", "hide", "requireDensity", "requireOffset", "requireOffset$material_release", "show", "snapTo", "snapTo$material_release", "(Landroidx/compose/material/ModalBottomSheetValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "material_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class ModalBottomSheetState {

    @NotNull
    private final AnchoredDraggableState<ModalBottomSheetValue> anchoredDraggableState;

    @NotNull
    private final AnimationSpec<Float> animationSpec;

    @Nullable
    private Density density;
    private final boolean isSkipHalfExpanded;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }

    @Deprecated(message = "This constructor is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "ModalBottomSheetState(initialValue, animationSpec, confirmStateChange, isSkipHalfExpanded)", imports = {}))
    public ModalBottomSheetState(@NotNull ModalBottomSheetValue modalBottomSheetValue, @NotNull AnimationSpec<Float> animationSpec, boolean z, @NotNull Function1<? super ModalBottomSheetValue, Boolean> function1) {
        this.animationSpec = animationSpec;
        this.isSkipHalfExpanded = z;
        this.anchoredDraggableState = new AnchoredDraggableState<>(modalBottomSheetValue, new Function1<Float, Float>() { // from class: androidx.compose.material.ModalBottomSheetState$anchoredDraggableState$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f) {
                return invoke(f.floatValue());
            }

            @NotNull
            public final Float invoke(float f) {
                return Float.valueOf(this.this$0.requireDensity().mo7874toPx0680j_4(ModalBottomSheetKt.ModalBottomSheetPositionalThreshold));
            }
        }, new Function0<Float>() { // from class: androidx.compose.material.ModalBottomSheetState$anchoredDraggableState$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                return Float.valueOf(this.this$0.requireDensity().mo7874toPx0680j_4(ModalBottomSheetKt.ModalBottomSheetVelocityThreshold));
            }
        }, animationSpec, function1);
        if (z && modalBottomSheetValue == ModalBottomSheetValue.HalfExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.".toString());
        }
    }

    public /* synthetic */ ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec animationSpec, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(modalBottomSheetValue, (i & 2) != 0 ? AnchoredDraggableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i & 4) != 0 ? false : z, function1);
    }

    @NotNull
    public final AnimationSpec<Float> getAnimationSpec$material_release() {
        return this.animationSpec;
    }

    /* renamed from: isSkipHalfExpanded$material_release, reason: from getter */
    public final boolean getIsSkipHalfExpanded() {
        return this.isSkipHalfExpanded;
    }

    @NotNull
    public final AnchoredDraggableState<ModalBottomSheetValue> getAnchoredDraggableState$material_release() {
        return this.anchoredDraggableState;
    }

    @NotNull
    public final ModalBottomSheetValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    @NotNull
    public final ModalBottomSheetValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    @FloatRange(from = 0.0d, m9to = 1.0d)
    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    public final boolean isVisible() {
        return this.anchoredDraggableState.getCurrentValue() != ModalBottomSheetValue.Hidden;
    }

    public final boolean getHasHalfExpandedState$material_release() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(ModalBottomSheetValue.HalfExpanded);
    }

    @Deprecated(message = "This constructor is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "ModalBottomSheetState(initialValue, animationSpec, confirmStateChange, false)", imports = {}))
    public ModalBottomSheetState(@NotNull ModalBottomSheetValue modalBottomSheetValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super ModalBottomSheetValue, Boolean> function1) {
        this(modalBottomSheetValue, animationSpec, false, function1);
    }

    @Nullable
    public final Object show(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$material_release$default = animateTo$material_release$default(this, getHasHalfExpandedState$material_release() ? ModalBottomSheetValue.HalfExpanded : ModalBottomSheetValue.Expanded, 0.0f, continuation, 2, null);
        return objAnimateTo$material_release$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$material_release$default : Unit.INSTANCE;
    }

    @Nullable
    public final Object halfExpand$material_release(@NotNull Continuation<? super Unit> continuation) {
        if (!getHasHalfExpandedState$material_release()) {
            return Unit.INSTANCE;
        }
        Object objAnimateTo$material_release$default = animateTo$material_release$default(this, ModalBottomSheetValue.HalfExpanded, 0.0f, continuation, 2, null);
        return objAnimateTo$material_release$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$material_release$default : Unit.INSTANCE;
    }

    @Nullable
    public final Object expand$material_release(@NotNull Continuation<? super Unit> continuation) {
        DraggableAnchors<ModalBottomSheetValue> anchors = this.anchoredDraggableState.getAnchors();
        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Expanded;
        if (!anchors.hasAnchorFor(modalBottomSheetValue)) {
            return Unit.INSTANCE;
        }
        Object objAnimateTo$material_release$default = animateTo$material_release$default(this, modalBottomSheetValue, 0.0f, continuation, 2, null);
        return objAnimateTo$material_release$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$material_release$default : Unit.INSTANCE;
    }

    @Nullable
    public final Object hide(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$material_release$default = animateTo$material_release$default(this, ModalBottomSheetValue.Hidden, 0.0f, continuation, 2, null);
        return objAnimateTo$material_release$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$material_release$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateTo$material_release$default(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            f = modalBottomSheetState.anchoredDraggableState.getLastVelocity();
        }
        return modalBottomSheetState.animateTo$material_release(modalBottomSheetValue, f, continuation);
    }

    @Nullable
    public final Object animateTo$material_release(@NotNull ModalBottomSheetValue modalBottomSheetValue, float f, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, modalBottomSheetValue, f, continuation);
        return objAnimateTo == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo : Unit.INSTANCE;
    }

    @Nullable
    public final Object snapTo$material_release(@NotNull ModalBottomSheetValue modalBottomSheetValue, @NotNull Continuation<? super Unit> continuation) {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, modalBottomSheetValue, continuation);
        return objSnapTo == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSnapTo : Unit.INSTANCE;
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

    public final Density requireDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on ModalBottomSheetState (" + this + ") was not set. Did you use ModalBottomSheetState with the ModalBottomSheetLayout composable?").toString());
    }

    /* compiled from: ModalBottomSheet.kt */
    @Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\fH\u0007JB\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ<\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¨\u0006\u0011"}, m7105d2 = {"Landroidx/compose/material/ModalBottomSheetState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/ModalBottomSheetState;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "Lkotlin/Function1;", "Landroidx/compose/material/ModalBottomSheetValue;", "", "skipHalfExpanded", "density", "Landroidx/compose/ui/unit/Density;", "confirmStateChange", "material_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Saver<ModalBottomSheetState, ?> Saver(@NotNull final AnimationSpec<Float> animationSpec, @NotNull final Function1<? super ModalBottomSheetValue, Boolean> confirmValueChange, final boolean skipHalfExpanded, @NotNull final Density density) {
            return SaverKt.Saver(new Function2<SaverScope, ModalBottomSheetState, ModalBottomSheetValue>() { // from class: androidx.compose.material.ModalBottomSheetState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final ModalBottomSheetValue invoke(@NotNull SaverScope saverScope, @NotNull ModalBottomSheetState modalBottomSheetState) {
                    return modalBottomSheetState.getCurrentValue();
                }
            }, new Function1<ModalBottomSheetValue, ModalBottomSheetState>() { // from class: androidx.compose.material.ModalBottomSheetState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final ModalBottomSheetState invoke(@NotNull ModalBottomSheetValue modalBottomSheetValue) {
                    return ModalBottomSheetKt.ModalBottomSheetState(modalBottomSheetValue, density, animationSpec, confirmValueChange, skipHalfExpanded);
                }
            });
        }

        @Deprecated(message = "This function is deprecated. Please use the overload where Density is provided.", replaceWith = @ReplaceWith(expression = "Saver(animationSpec, confirmValueChange, density, skipHalfExpanded)", imports = {}))
        @NotNull
        public final Saver<ModalBottomSheetState, ?> Saver(@NotNull final AnimationSpec<Float> animationSpec, @NotNull final Function1<? super ModalBottomSheetValue, Boolean> confirmValueChange, final boolean skipHalfExpanded) {
            return SaverKt.Saver(new Function2<SaverScope, ModalBottomSheetState, ModalBottomSheetValue>() { // from class: androidx.compose.material.ModalBottomSheetState$Companion$Saver$3
                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final ModalBottomSheetValue invoke(@NotNull SaverScope saverScope, @NotNull ModalBottomSheetState modalBottomSheetState) {
                    return modalBottomSheetState.getCurrentValue();
                }
            }, new Function1<ModalBottomSheetValue, ModalBottomSheetState>() { // from class: androidx.compose.material.ModalBottomSheetState$Companion$Saver$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final ModalBottomSheetState invoke(@NotNull ModalBottomSheetValue modalBottomSheetValue) {
                    return ModalBottomSheetKt.ModalBottomSheetState(modalBottomSheetValue, animationSpec, confirmValueChange, skipHalfExpanded);
                }
            });
        }

        @Deprecated(message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "Saver(animationSpec, confirmStateChange, skipHalfExpanded)", imports = {}))
        @NotNull
        public final Saver<ModalBottomSheetState, ?> Saver(@NotNull AnimationSpec<Float> animationSpec, boolean skipHalfExpanded, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmStateChange) {
            return Saver(animationSpec, confirmStateChange, skipHalfExpanded);
        }
    }
}
