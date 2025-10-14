package androidx.compose.material3;

import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.Stable;
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

/* compiled from: SheetDefaults.kt */
@Stable
@ExperimentalMaterial3Api
@Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001:BA\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bB9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\"\u0010(\u001a\u00020)2\u0006\u0010&\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020!H\u0080@¢\u0006\u0004\b+\u0010,J\u000e\u0010-\u001a\u00020)H\u0086@¢\u0006\u0002\u0010.J\u000e\u0010/\u001a\u00020)H\u0086@¢\u0006\u0002\u0010.J\u000e\u00100\u001a\u00020)H\u0086@¢\u0006\u0002\u0010.J\b\u00101\u001a\u00020\u0005H\u0002J\u0006\u00102\u001a\u00020!J\u0018\u00103\u001a\u00020)2\u0006\u0010*\u001a\u00020!H\u0080@¢\u0006\u0004\b4\u00105J\u000e\u00106\u001a\u00020)H\u0086@¢\u0006\u0002\u0010.J\u0018\u00107\u001a\u00020)2\u0006\u0010&\u001a\u00020\u0007H\u0080@¢\u0006\u0004\b8\u00109R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001cR\u0016\u0010 \u001a\u0004\u0018\u00010!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010&\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b'\u0010\u0015¨\u0006;"}, m7105d2 = {"Landroidx/compose/material3/SheetState;", "", "skipPartiallyExpanded", "", "density", "Landroidx/compose/ui/unit/Density;", "initialValue", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "Lkotlin/Function1;", "skipHiddenState", "(ZLandroidx/compose/ui/unit/Density;Landroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;Z)V", "(ZLandroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;Z)V", "anchoredDraggableState", "Landroidx/compose/material3/AnchoredDraggableState;", "getAnchoredDraggableState$material3_release", "()Landroidx/compose/material3/AnchoredDraggableState;", "setAnchoredDraggableState$material3_release", "(Landroidx/compose/material3/AnchoredDraggableState;)V", "currentValue", "getCurrentValue", "()Landroidx/compose/material3/SheetValue;", "getDensity$material3_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material3_release", "(Landroidx/compose/ui/unit/Density;)V", "hasExpandedState", "getHasExpandedState", "()Z", "hasPartiallyExpandedState", "getHasPartiallyExpandedState", "isVisible", TypedValues.CycleType.S_WAVE_OFFSET, "", "getOffset$material3_release", "()Ljava/lang/Float;", "getSkipHiddenState$material3_release", "getSkipPartiallyExpanded$material3_release", "targetValue", "getTargetValue", "animateTo", "", "velocity", "animateTo$material3_release", "(Landroidx/compose/material3/SheetValue;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expand", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hide", "partialExpand", "requireDensity", "requireOffset", "settle", "settle$material3_release", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "show", "snapTo", "snapTo$material3_release", "(Landroidx/compose/material3/SheetValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class SheetState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private AnchoredDraggableState<SheetValue> anchoredDraggableState;

    @Nullable
    private Density density;
    private final boolean skipHiddenState;
    private final boolean skipPartiallyExpanded;

    @Deprecated(message = "This constructor is deprecated. Please use the constructor that provides a [Density]", replaceWith = @ReplaceWith(expression = "SheetState(skipPartiallyExpanded, LocalDensity.current, initialValue, confirmValueChange, skipHiddenState)", imports = {}))
    public SheetState(boolean z, @NotNull SheetValue sheetValue, @NotNull Function1<? super SheetValue, Boolean> function1, boolean z2) {
        this.skipPartiallyExpanded = z;
        this.skipHiddenState = z2;
        if (z && sheetValue == SheetValue.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.".toString());
        }
        if (z2 && sheetValue == SheetValue.Hidden) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.".toString());
        }
        this.anchoredDraggableState = new AnchoredDraggableState<>(sheetValue, new Function1<Float, Float>() { // from class: androidx.compose.material3.SheetState$anchoredDraggableState$1
            {
                super(1);
            }

            @NotNull
            public final Float invoke(float f) {
                return Float.valueOf(this.this$0.requireDensity().mo7874toPx0680j_4(C2046Dp.m13666constructorimpl(56)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f) {
                return invoke(f.floatValue());
            }
        }, new Function0<Float>() { // from class: androidx.compose.material3.SheetState$anchoredDraggableState$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                return Float.valueOf(this.this$0.requireDensity().mo7874toPx0680j_4(C2046Dp.m13666constructorimpl(125)));
            }
        }, AnchoredDraggableDefaults.INSTANCE.getAnimationSpec(), function1);
    }

    /* renamed from: getSkipPartiallyExpanded$material3_release, reason: from getter */
    public final boolean getSkipPartiallyExpanded() {
        return this.skipPartiallyExpanded;
    }

    public /* synthetic */ SheetState(boolean z, SheetValue sheetValue, Function1 function1, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? SheetValue.Hidden : sheetValue, (i & 4) != 0 ? new Function1<SheetValue, Boolean>() { // from class: androidx.compose.material3.SheetState.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull SheetValue sheetValue2) {
                return Boolean.TRUE;
            }
        } : function1, (i & 8) != 0 ? false : z2);
    }

    /* renamed from: getSkipHiddenState$material3_release, reason: from getter */
    public final boolean getSkipHiddenState() {
        return this.skipHiddenState;
    }

    public /* synthetic */ SheetState(boolean z, Density density, SheetValue sheetValue, Function1 function1, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, density, (i & 4) != 0 ? SheetValue.Hidden : sheetValue, (i & 8) != 0 ? new Function1<SheetValue, Boolean>() { // from class: androidx.compose.material3.SheetState.2
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull SheetValue sheetValue2) {
                return Boolean.TRUE;
            }
        } : function1, (i & 16) != 0 ? false : z2);
    }

    @ExperimentalMaterial3Api
    public SheetState(boolean z, @NotNull Density density, @NotNull SheetValue sheetValue, @NotNull Function1<? super SheetValue, Boolean> function1, boolean z2) {
        this(z, sheetValue, function1, z2);
        this.density = density;
    }

    @NotNull
    public final SheetValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    @NotNull
    public final SheetValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isVisible() {
        return this.anchoredDraggableState.getCurrentValue() != SheetValue.Hidden;
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final boolean getHasExpandedState() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(SheetValue.Expanded);
    }

    public final boolean getHasPartiallyExpandedState() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(SheetValue.PartiallyExpanded);
    }

    @Nullable
    public final Object expand(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, SheetValue.Expanded, 0.0f, continuation, 2, null);
        return objAnimateTo$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    @Nullable
    public final Object partialExpand(@NotNull Continuation<? super Unit> continuation) {
        if (!(!this.skipPartiallyExpanded)) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.".toString());
        }
        Object objAnimateTo$material3_release$default = animateTo$material3_release$default(this, SheetValue.PartiallyExpanded, 0.0f, continuation, 2, null);
        return objAnimateTo$material3_release$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$material3_release$default : Unit.INSTANCE;
    }

    @Nullable
    public final Object show(@NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$material3_release$default = animateTo$material3_release$default(this, getHasPartiallyExpandedState() ? SheetValue.PartiallyExpanded : SheetValue.Expanded, 0.0f, continuation, 2, null);
        return objAnimateTo$material3_release$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$material3_release$default : Unit.INSTANCE;
    }

    @Nullable
    public final Object hide(@NotNull Continuation<? super Unit> continuation) {
        if (!(!this.skipHiddenState)) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.".toString());
        }
        Object objAnimateTo$material3_release$default = animateTo$material3_release$default(this, SheetValue.Hidden, 0.0f, continuation, 2, null);
        return objAnimateTo$material3_release$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$material3_release$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateTo$material3_release$default(SheetState sheetState, SheetValue sheetValue, float f, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            f = sheetState.anchoredDraggableState.getLastVelocity();
        }
        return sheetState.animateTo$material3_release(sheetValue, f, continuation);
    }

    @Nullable
    public final Object animateTo$material3_release(@NotNull SheetValue sheetValue, float f, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, sheetValue, f, continuation);
        return objAnimateTo == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo : Unit.INSTANCE;
    }

    @Nullable
    public final Object snapTo$material3_release(@NotNull SheetValue sheetValue, @NotNull Continuation<? super Unit> continuation) {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, sheetValue, continuation);
        return objSnapTo == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSnapTo : Unit.INSTANCE;
    }

    @Nullable
    public final Object settle$material3_release(float f, @NotNull Continuation<? super Unit> continuation) {
        Object obj = this.anchoredDraggableState.settle(f, continuation);
        return obj == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj : Unit.INSTANCE;
    }

    @NotNull
    public final AnchoredDraggableState<SheetValue> getAnchoredDraggableState$material3_release() {
        return this.anchoredDraggableState;
    }

    public final void setAnchoredDraggableState$material3_release(@NotNull AnchoredDraggableState<SheetValue> anchoredDraggableState) {
        this.anchoredDraggableState = anchoredDraggableState;
    }

    @Nullable
    public final Float getOffset$material3_release() {
        return Float.valueOf(this.anchoredDraggableState.getOffset());
    }

    @Nullable
    /* renamed from: getDensity$material3_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    public final void setDensity$material3_release(@Nullable Density density) {
        this.density = density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Density requireDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?".toString());
    }

    /* compiled from: SheetDefaults.kt */
    @Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\nH\u0007J6\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, m7105d2 = {"Landroidx/compose/material3/SheetState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/SheetState;", "Landroidx/compose/material3/SheetValue;", "skipPartiallyExpanded", "", "confirmValueChange", "Lkotlin/Function1;", "density", "Landroidx/compose/ui/unit/Density;", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Saver<SheetState, SheetValue> Saver(final boolean skipPartiallyExpanded, @NotNull final Function1<? super SheetValue, Boolean> confirmValueChange, @NotNull final Density density) {
            return SaverKt.Saver(new Function2<SaverScope, SheetState, SheetValue>() { // from class: androidx.compose.material3.SheetState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final SheetValue invoke(@NotNull SaverScope saverScope, @NotNull SheetState sheetState) {
                    return sheetState.getCurrentValue();
                }
            }, new Function1<SheetValue, SheetState>() { // from class: androidx.compose.material3.SheetState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final SheetState invoke(@NotNull SheetValue sheetValue) {
                    return new SheetState(skipPartiallyExpanded, density, sheetValue, confirmValueChange, false, 16, null);
                }
            });
        }

        @Deprecated(message = "This function is deprecated. Please use the overload where Density is provided.", replaceWith = @ReplaceWith(expression = "Saver(skipPartiallyExpanded, confirmValueChange, LocalDensity.current)", imports = {}))
        @NotNull
        public final Saver<SheetState, SheetValue> Saver(final boolean skipPartiallyExpanded, @NotNull final Function1<? super SheetValue, Boolean> confirmValueChange) {
            return SaverKt.Saver(new Function2<SaverScope, SheetState, SheetValue>() { // from class: androidx.compose.material3.SheetState$Companion$Saver$3
                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final SheetValue invoke(@NotNull SaverScope saverScope, @NotNull SheetState sheetState) {
                    return sheetState.getCurrentValue();
                }
            }, new Function1<SheetValue, SheetState>() { // from class: androidx.compose.material3.SheetState$Companion$Saver$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final SheetState invoke(@NotNull SheetValue sheetValue) {
                    return new SheetState(skipPartiallyExpanded, sheetValue, confirmValueChange, false, 8, null);
                }
            });
        }
    }
}
