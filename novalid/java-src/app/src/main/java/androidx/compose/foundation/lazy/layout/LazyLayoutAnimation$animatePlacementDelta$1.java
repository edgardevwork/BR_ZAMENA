package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyLayoutAnimation.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animatePlacementDelta$1", m7120f = "LazyLayoutAnimation.kt", m7121i = {0}, m7122l = {127, Cea708Decoder.COMMAND_CW5}, m7123m = "invokeSuspend", m7124n = {"finalSpec"}, m7125s = {"L$0"})
@SourceDebugExtension({"SMAP\nLazyLayoutAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimation$animatePlacementDelta$1\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,207:1\n79#2:208\n*S KotlinDebug\n*F\n+ 1 LazyLayoutAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimation$animatePlacementDelta$1\n*L\n132#1:208\n*E\n"})
/* loaded from: classes3.dex */
public final class LazyLayoutAnimation$animatePlacementDelta$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ FiniteAnimationSpec<IntOffset> $spec;
    public final /* synthetic */ long $totalDelta;
    public Object L$0;
    public int label;
    public final /* synthetic */ LazyLayoutAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutAnimation$animatePlacementDelta$1(LazyLayoutAnimation lazyLayoutAnimation, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, long j, Continuation<? super LazyLayoutAnimation$animatePlacementDelta$1> continuation) {
        super(2, continuation);
        this.this$0 = lazyLayoutAnimation;
        this.$spec = finiteAnimationSpec;
        this.$totalDelta = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new LazyLayoutAnimation$animatePlacementDelta$1(this.this$0, this.$spec, this.$totalDelta, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((LazyLayoutAnimation$animatePlacementDelta$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        FiniteAnimationSpec finiteAnimationSpec;
        FiniteAnimationSpec finiteAnimationSpec2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.this$0.placementDeltaAnimation.isRunning()) {
                FiniteAnimationSpec<IntOffset> finiteAnimationSpec3 = this.$spec;
                if (!(finiteAnimationSpec3 instanceof SpringSpec)) {
                    finiteAnimationSpec = LazyLayoutAnimationKt.InterruptionSpec;
                } else {
                    finiteAnimationSpec = (SpringSpec) finiteAnimationSpec3;
                }
            } else {
                finiteAnimationSpec = this.$spec;
            }
            finiteAnimationSpec2 = finiteAnimationSpec;
            if (!this.this$0.placementDeltaAnimation.isRunning()) {
                Animatable animatable = this.this$0.placementDeltaAnimation;
                IntOffset intOffsetM13785boximpl = IntOffset.m13785boximpl(this.$totalDelta);
                this.L$0 = finiteAnimationSpec2;
                this.label = 1;
                if (animatable.snapTo(intOffsetM13785boximpl, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.setPlacementAnimationInProgress(false);
                return Unit.INSTANCE;
            }
            finiteAnimationSpec2 = (FiniteAnimationSpec) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        FiniteAnimationSpec finiteAnimationSpec4 = finiteAnimationSpec2;
        long packedValue = ((IntOffset) this.this$0.placementDeltaAnimation.getValue()).getPackedValue();
        long j = this.$totalDelta;
        final long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(packedValue) - IntOffset.m13794getXimpl(j), IntOffset.m13795getYimpl(packedValue) - IntOffset.m13795getYimpl(j));
        Animatable animatable2 = this.this$0.placementDeltaAnimation;
        IntOffset intOffsetM13785boximpl2 = IntOffset.m13785boximpl(jIntOffset);
        final LazyLayoutAnimation lazyLayoutAnimation = this.this$0;
        Function1<Animatable<IntOffset, AnimationVector2D>, Unit> function1 = new Function1<Animatable<IntOffset, AnimationVector2D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animatePlacementDelta$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Animatable<IntOffset, AnimationVector2D> animatable3) {
                invoke2(animatable3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Animatable<IntOffset, AnimationVector2D> animatable3) {
                LazyLayoutAnimation lazyLayoutAnimation2 = lazyLayoutAnimation;
                long packedValue2 = animatable3.getValue().getPackedValue();
                long j2 = jIntOffset;
                lazyLayoutAnimation2.m8270setPlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(packedValue2) - IntOffset.m13794getXimpl(j2), IntOffset.m13795getYimpl(packedValue2) - IntOffset.m13795getYimpl(j2)));
            }
        };
        this.L$0 = null;
        this.label = 2;
        if (Animatable.animateTo$default(animatable2, intOffsetM13785boximpl2, finiteAnimationSpec4, null, function1, this, 4, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.this$0.setPlacementAnimationInProgress(false);
        return Unit.INSTANCE;
    }
}
