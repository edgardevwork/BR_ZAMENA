package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.mp4.MetadataUtil;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyLayoutAnimation.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 C2\u00020\u0001:\u0001CB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010=\u001a\u00020\u001cJ\u0018\u0010>\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b@\u0010%J\u0006\u0010A\u001a\u00020\u001cJ\u0006\u0010B\u001a\u00020\u001cR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\"\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\u0002\b\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u00020!X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R1\u0010'\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020!8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b*\u0010\u0015\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\u001a\u0010+\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020-0,X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010.\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\t\"\u0004\b0\u0010\u000bR\"\u00101\u001a\u00020!X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b2\u0010#\"\u0004\b3\u0010%R+\u00104\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020<0,X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, m7105d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "appearanceSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "getAppearanceSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setAppearanceSpec", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "<set-?>", "", "isAppearanceAnimationInProgress", "()Z", "setAppearanceAnimationInProgress", "(Z)V", "isAppearanceAnimationInProgress$delegate", "Landroidx/compose/runtime/MutableState;", "isPlacementAnimationInProgress", "setPlacementAnimationInProgress", "isPlacementAnimationInProgress$delegate", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "lookaheadOffset", "Landroidx/compose/ui/unit/IntOffset;", "getLookaheadOffset-nOcc-ac", "()J", "setLookaheadOffset--gyyYBs", "(J)V", "J", "placementDelta", "getPlacementDelta-nOcc-ac", "setPlacementDelta--gyyYBs", "placementDelta$delegate", "placementDeltaAnimation", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector2D;", "placementSpec", "getPlacementSpec", "setPlacementSpec", "rawOffset", "getRawOffset-nOcc-ac", "setRawOffset--gyyYBs", "visibility", "getVisibility", "()F", "setVisibility", "(F)V", "visibility$delegate", "Landroidx/compose/runtime/MutableFloatState;", "visibilityAnimation", "Landroidx/compose/animation/core/AnimationVector1D;", "animateAppearance", "animatePlacementDelta", "delta", "animatePlacementDelta--gyyYBs", "cancelPlacementAnimation", "stopAnimations", "Companion", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLazyLayoutAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,207:1\n81#2:208\n107#2,2:209\n81#2:211\n107#2,2:212\n81#2:214\n107#2,2:215\n76#3:217\n109#3,2:218\n79#4:220\n*S KotlinDebug\n*F\n+ 1 LazyLayoutAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimation\n*L\n50#1:208\n50#1:209,2\n56#1:211\n56#1:212,2\n76#1:214\n76#1:215,2\n79#1:217\n79#1:218,2\n110#1:220\n*E\n"})
/* loaded from: classes3.dex */
public final class LazyLayoutAnimation {

    @Nullable
    private FiniteAnimationSpec<Float> appearanceSpec;

    @NotNull
    private final CoroutineScope coroutineScope;

    /* renamed from: isAppearanceAnimationInProgress$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isAppearanceAnimationInProgress;

    /* renamed from: isPlacementAnimationInProgress$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isPlacementAnimationInProgress;

    @NotNull
    private final Function1<GraphicsLayerScope, Unit> layerBlock;
    private long lookaheadOffset;

    /* renamed from: placementDelta$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState placementDelta;

    @NotNull
    private final Animatable<IntOffset, AnimationVector2D> placementDeltaAnimation;

    @Nullable
    private FiniteAnimationSpec<IntOffset> placementSpec;
    private long rawOffset;

    /* renamed from: visibility$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState visibility;

    @NotNull
    private final Animatable<Float, AnimationVector1D> visibilityAnimation;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final long NotInitialized = IntOffsetKt.IntOffset(Integer.MAX_VALUE, Integer.MAX_VALUE);

    public LazyLayoutAnimation(@NotNull CoroutineScope coroutineScope) {
        this.coroutineScope = coroutineScope;
        Boolean bool = Boolean.FALSE;
        this.isPlacementAnimationInProgress = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isAppearanceAnimationInProgress = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        long j = NotInitialized;
        this.rawOffset = j;
        IntOffset.Companion companion = IntOffset.INSTANCE;
        this.placementDeltaAnimation = new Animatable<>(IntOffset.m13785boximpl(companion.m13804getZeronOccac()), VectorConvertersKt.getVectorConverter(companion), null, null, 12, null);
        this.visibilityAnimation = new Animatable<>(Float.valueOf(1.0f), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), null, null, 12, null);
        this.placementDelta = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m13785boximpl(companion.m13804getZeronOccac()), null, 2, null);
        this.visibility = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
        this.layerBlock = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$layerBlock$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.setAlpha(this.this$0.getVisibility());
            }
        };
        this.lookaheadOffset = j;
    }

    @NotNull
    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    @Nullable
    public final FiniteAnimationSpec<Float> getAppearanceSpec() {
        return this.appearanceSpec;
    }

    public final void setAppearanceSpec(@Nullable FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.appearanceSpec = finiteAnimationSpec;
    }

    @Nullable
    public final FiniteAnimationSpec<IntOffset> getPlacementSpec() {
        return this.placementSpec;
    }

    public final void setPlacementSpec(@Nullable FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        this.placementSpec = finiteAnimationSpec;
    }

    public final void setPlacementAnimationInProgress(boolean z) {
        this.isPlacementAnimationInProgress.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isPlacementAnimationInProgress() {
        return ((Boolean) this.isPlacementAnimationInProgress.getValue()).booleanValue();
    }

    public final void setAppearanceAnimationInProgress(boolean z) {
        this.isAppearanceAnimationInProgress.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAppearanceAnimationInProgress() {
        return ((Boolean) this.isAppearanceAnimationInProgress.getValue()).booleanValue();
    }

    /* renamed from: getRawOffset-nOcc-ac, reason: from getter */
    public final long getRawOffset() {
        return this.rawOffset;
    }

    /* renamed from: setRawOffset--gyyYBs */
    public final void m8276setRawOffsetgyyYBs(long j) {
        this.rawOffset = j;
    }

    /* renamed from: setPlacementDelta--gyyYBs */
    public final void m8270setPlacementDeltagyyYBs(long j) {
        this.placementDelta.setValue(IntOffset.m13785boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPlacementDelta-nOcc-ac */
    public final long m8273getPlacementDeltanOccac() {
        return ((IntOffset) this.placementDelta.getValue()).getPackedValue();
    }

    public final void setVisibility(float f) {
        this.visibility.setFloatValue(f);
    }

    public final float getVisibility() {
        return this.visibility.getFloatValue();
    }

    @NotNull
    public final Function1<GraphicsLayerScope, Unit> getLayerBlock() {
        return this.layerBlock;
    }

    /* compiled from: LazyLayoutAnimation.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$cancelPlacementAnimation$1", m7120f = "LazyLayoutAnimation.kt", m7121i = {}, m7122l = {92}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$cancelPlacementAnimation$1 */
    public static final class C07041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C07041(Continuation<? super C07041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LazyLayoutAnimation.this.new C07041(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C07041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable animatable = LazyLayoutAnimation.this.placementDeltaAnimation;
                IntOffset intOffsetM13785boximpl = IntOffset.m13785boximpl(IntOffset.INSTANCE.m13804getZeronOccac());
                this.label = 1;
                if (animatable.snapTo(intOffsetM13785boximpl, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            LazyLayoutAnimation.this.m8270setPlacementDeltagyyYBs(IntOffset.INSTANCE.m13804getZeronOccac());
            LazyLayoutAnimation.this.setPlacementAnimationInProgress(false);
            return Unit.INSTANCE;
        }
    }

    public final void cancelPlacementAnimation() {
        if (isPlacementAnimationInProgress()) {
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C07041(null), 3, null);
        }
    }

    /* renamed from: getLookaheadOffset-nOcc-ac, reason: from getter */
    public final long getLookaheadOffset() {
        return this.lookaheadOffset;
    }

    /* renamed from: setLookaheadOffset--gyyYBs */
    public final void m8275setLookaheadOffsetgyyYBs(long j) {
        this.lookaheadOffset = j;
    }

    /* renamed from: animatePlacementDelta--gyyYBs */
    public final void m8271animatePlacementDeltagyyYBs(long delta) {
        FiniteAnimationSpec<IntOffset> finiteAnimationSpec = this.placementSpec;
        if (finiteAnimationSpec == null) {
            return;
        }
        long jM8273getPlacementDeltanOccac = m8273getPlacementDeltanOccac();
        long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jM8273getPlacementDeltanOccac) - IntOffset.m13794getXimpl(delta), IntOffset.m13795getYimpl(jM8273getPlacementDeltanOccac) - IntOffset.m13795getYimpl(delta));
        m8270setPlacementDeltagyyYBs(jIntOffset);
        setPlacementAnimationInProgress(true);
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new LazyLayoutAnimation$animatePlacementDelta$1(this, finiteAnimationSpec, jIntOffset, null), 3, null);
    }

    public final void animateAppearance() {
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.appearanceSpec;
        if (isAppearanceAnimationInProgress() || finiteAnimationSpec == null) {
            return;
        }
        setAppearanceAnimationInProgress(true);
        setVisibility(0.0f);
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C07021(finiteAnimationSpec, null), 3, null);
    }

    /* compiled from: LazyLayoutAnimation.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animateAppearance$1", m7120f = "LazyLayoutAnimation.kt", m7121i = {}, m7122l = {155, 156}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animateAppearance$1 */
    public static final class C07021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ FiniteAnimationSpec<Float> $spec;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07021(FiniteAnimationSpec<Float> finiteAnimationSpec, Continuation<? super C07021> continuation) {
            super(2, continuation);
            this.$spec = finiteAnimationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LazyLayoutAnimation.this.new C07021(this.$spec, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C07021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Animatable animatable = LazyLayoutAnimation.this.visibilityAnimation;
                    Float fBoxFloat = Boxing.boxFloat(0.0f);
                    this.label = 1;
                    if (animatable.snapTo(fBoxFloat, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        LazyLayoutAnimation.this.setAppearanceAnimationInProgress(false);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Animatable animatable2 = LazyLayoutAnimation.this.visibilityAnimation;
                Float fBoxFloat2 = Boxing.boxFloat(1.0f);
                FiniteAnimationSpec<Float> finiteAnimationSpec = this.$spec;
                AnonymousClass1 anonymousClass1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutAnimation.animateAppearance.1.1
                    public AnonymousClass1() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable3) {
                        invoke2(animatable3);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2(@NotNull Animatable<Float, AnimationVector1D> animatable3) {
                        lazyLayoutAnimation.setVisibility(animatable3.getValue().floatValue());
                    }
                };
                this.label = 2;
                if (Animatable.animateTo$default(animatable2, fBoxFloat2, finiteAnimationSpec, null, anonymousClass1, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                LazyLayoutAnimation.this.setAppearanceAnimationInProgress(false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                LazyLayoutAnimation.this.setAppearanceAnimationInProgress(false);
                throw th;
            }
        }

        /* compiled from: LazyLayoutAnimation.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animateAppearance$1$1 */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1 extends Lambda implements Function1<Animatable<Float, AnimationVector1D>, Unit> {
            public AnonymousClass1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable3) {
                invoke2(animatable3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull Animatable<Float, AnimationVector1D> animatable3) {
                lazyLayoutAnimation.setVisibility(animatable3.getValue().floatValue());
            }
        }
    }

    public final void stopAnimations() {
        if (isPlacementAnimationInProgress()) {
            setPlacementAnimationInProgress(false);
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C07051(null), 3, null);
        }
        if (isAppearanceAnimationInProgress()) {
            setAppearanceAnimationInProgress(false);
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C07062(null), 3, null);
        }
        m8270setPlacementDeltagyyYBs(IntOffset.INSTANCE.m13804getZeronOccac());
        this.rawOffset = NotInitialized;
        setVisibility(1.0f);
    }

    /* compiled from: LazyLayoutAnimation.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$stopAnimations$1", m7120f = "LazyLayoutAnimation.kt", m7121i = {}, m7122l = {MetadataUtil.TYPE_TOP_BYTE_COPYRIGHT}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$stopAnimations$1 */
    public static final class C07051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C07051(Continuation<? super C07051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LazyLayoutAnimation.this.new C07051(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C07051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable animatable = LazyLayoutAnimation.this.placementDeltaAnimation;
                this.label = 1;
                if (animatable.stop(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: LazyLayoutAnimation.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$stopAnimations$2", m7120f = "LazyLayoutAnimation.kt", m7121i = {}, m7122l = {HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$stopAnimations$2 */
    public static final class C07062 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C07062(Continuation<? super C07062> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LazyLayoutAnimation.this.new C07062(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C07062) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable animatable = LazyLayoutAnimation.this.visibilityAnimation;
                this.label = 1;
                if (animatable.stop(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: LazyLayoutAnimation.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, m7105d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation$Companion;", "", "()V", "NotInitialized", "Landroidx/compose/ui/unit/IntOffset;", "getNotInitialized-nOcc-ac", "()J", "J", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getNotInitialized-nOcc-ac */
        public final long m8277getNotInitializednOccac() {
            return LazyLayoutAnimation.NotInitialized;
        }
    }
}
