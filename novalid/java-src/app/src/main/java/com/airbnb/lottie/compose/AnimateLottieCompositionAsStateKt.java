package com.airbnb.lottie.compose;

import android.content.Context;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimatable;
import com.airbnb.lottie.utils.Utils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: animateLottieCompositionAsState.kt */
@Metadata(m7104d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001as\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0005X\u008a\u008e\u0002"}, m7105d2 = {"animateLottieCompositionAsState", "Lcom/airbnb/lottie/compose/LottieAnimationState;", "composition", "Lcom/airbnb/lottie/LottieComposition;", "isPlaying", "", "restartOnPlay", "reverseOnRepeat", "clipSpec", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "speed", "", "iterations", "", "cancellationBehavior", "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "ignoreSystemAnimatorScale", "useCompositionFrameRate", "(Lcom/airbnb/lottie/LottieComposition;ZZZLcom/airbnb/lottie/compose/LottieClipSpec;FILcom/airbnb/lottie/compose/LottieCancellationBehavior;ZZLandroidx/compose/runtime/Composer;II)Lcom/airbnb/lottie/compose/LottieAnimationState;", "lottie-compose_release", "wasPlaying"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nanimateLottieCompositionAsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 animateLottieCompositionAsState.kt\ncom/airbnb/lottie/compose/AnimateLottieCompositionAsStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,93:1\n1#2:94\n1116#3,6:95\n74#4:101\n81#5:102\n107#5,2:103\n*S KotlinDebug\n*F\n+ 1 animateLottieCompositionAsState.kt\ncom/airbnb/lottie/compose/AnimateLottieCompositionAsStateKt\n*L\n60#1:95,6\n63#1:101\n60#1:102\n60#1:103,2\n*E\n"})
/* loaded from: classes.dex */
public final class AnimateLottieCompositionAsStateKt {
    @Composable
    @NotNull
    public static final LottieAnimationState animateLottieCompositionAsState(@Nullable LottieComposition lottieComposition, boolean z, boolean z2, boolean z3, @Nullable LottieClipSpec lottieClipSpec, float f, int i, @Nullable LottieCancellationBehavior lottieCancellationBehavior, boolean z4, boolean z5, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(683659508);
        boolean z6 = (i3 & 2) != 0 ? true : z;
        boolean z7 = (i3 & 4) != 0 ? true : z2;
        boolean z8 = (i3 & 8) != 0 ? false : z3;
        LottieClipSpec lottieClipSpec2 = (i3 & 16) != 0 ? null : lottieClipSpec;
        float animationScale = (i3 & 32) != 0 ? 1.0f : f;
        int i4 = (i3 & 64) != 0 ? 1 : i;
        LottieCancellationBehavior lottieCancellationBehavior2 = (i3 & 128) != 0 ? LottieCancellationBehavior.Immediately : lottieCancellationBehavior;
        boolean z9 = (i3 & 256) != 0 ? false : z4;
        boolean z10 = (i3 & 512) != 0 ? false : z5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(683659508, i2, -1, "com.airbnb.lottie.compose.animateLottieCompositionAsState (animateLottieCompositionAsState.kt:54)");
        }
        if (i4 <= 0) {
            throw new IllegalArgumentException(("Iterations must be a positive number (" + i4 + ").").toString());
        }
        if (Float.isInfinite(animationScale) || Float.isNaN(animationScale)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + animationScale + ".").toString());
        }
        LottieAnimatable lottieAnimatableRememberLottieAnimatable = LottieAnimatableKt.rememberLottieAnimatable(composer, 0);
        composer.startReplaceableGroup(-180606964);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z6), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-180606834);
        if (!z9) {
            animationScale /= Utils.getAnimationScale((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        }
        float f2 = animationScale;
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(new Object[]{lottieComposition, Boolean.valueOf(z6), lottieClipSpec2, Float.valueOf(f2), Integer.valueOf(i4)}, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new C34413(z6, z7, lottieAnimatableRememberLottieAnimatable, lottieComposition, i4, z8, f2, lottieClipSpec2, lottieCancellationBehavior2, z10, mutableState, null), composer, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lottieAnimatableRememberLottieAnimatable;
    }

    public static final void animateLottieCompositionAsState$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: animateLottieCompositionAsState.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", m7120f = "animateLottieCompositionAsState.kt", m7121i = {}, m7122l = {73, 78}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3 */
    public static final class C34413 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ float $actualSpeed;
        public final /* synthetic */ LottieAnimatable $animatable;
        public final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
        public final /* synthetic */ LottieClipSpec $clipSpec;
        public final /* synthetic */ LottieComposition $composition;
        public final /* synthetic */ boolean $isPlaying;
        public final /* synthetic */ int $iterations;
        public final /* synthetic */ boolean $restartOnPlay;
        public final /* synthetic */ boolean $reverseOnRepeat;
        public final /* synthetic */ boolean $useCompositionFrameRate;
        public final /* synthetic */ MutableState<Boolean> $wasPlaying$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34413(boolean z, boolean z2, LottieAnimatable lottieAnimatable, LottieComposition lottieComposition, int i, boolean z3, float f, LottieClipSpec lottieClipSpec, LottieCancellationBehavior lottieCancellationBehavior, boolean z4, MutableState<Boolean> mutableState, Continuation<? super C34413> continuation) {
            super(2, continuation);
            this.$isPlaying = z;
            this.$restartOnPlay = z2;
            this.$animatable = lottieAnimatable;
            this.$composition = lottieComposition;
            this.$iterations = i;
            this.$reverseOnRepeat = z3;
            this.$actualSpeed = f;
            this.$clipSpec = lottieClipSpec;
            this.$cancellationBehavior = lottieCancellationBehavior;
            this.$useCompositionFrameRate = z4;
            this.$wasPlaying$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C34413(this.$isPlaying, this.$restartOnPlay, this.$animatable, this.$composition, this.$iterations, this.$reverseOnRepeat, this.$actualSpeed, this.$clipSpec, this.$cancellationBehavior, this.$useCompositionFrameRate, this.$wasPlaying$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C34413) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$isPlaying && !AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState$lambda$3(this.$wasPlaying$delegate) && this.$restartOnPlay) {
                    LottieAnimatable lottieAnimatable = this.$animatable;
                    this.label = 1;
                    if (LottieAnimatableKt.resetToBeginning(lottieAnimatable, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState$lambda$4(this.$wasPlaying$delegate, this.$isPlaying);
            if (!this.$isPlaying) {
                return Unit.INSTANCE;
            }
            LottieAnimatable lottieAnimatable2 = this.$animatable;
            LottieComposition lottieComposition = this.$composition;
            int i2 = this.$iterations;
            boolean z = this.$reverseOnRepeat;
            float f = this.$actualSpeed;
            LottieClipSpec lottieClipSpec = this.$clipSpec;
            float progress = lottieAnimatable2.getProgress();
            LottieCancellationBehavior lottieCancellationBehavior = this.$cancellationBehavior;
            boolean z2 = this.$useCompositionFrameRate;
            this.label = 2;
            if (LottieAnimatable.DefaultImpls.animate$default(lottieAnimatable2, lottieComposition, 0, i2, z, f, lottieClipSpec, progress, false, lottieCancellationBehavior, false, z2, this, 514, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final boolean animateLottieCompositionAsState$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }
}
