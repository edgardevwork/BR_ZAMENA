package com.blackhub.bronline.game.p019ui.blackpass;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassPrizeDialogNew.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeDialogNewKt$BlackPassPrizeDialogContent$2$1", m7120f = "BlackPassPrizeDialogNew.kt", m7121i = {}, m7122l = {TarConstants.CHKSUM_OFFSET, Cea708Decoder.COMMAND_DF1, Cea708Decoder.COMMAND_DF6, 164, 170}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})

public final class BlackPassPrizeDialogNewKt$BlackPassPrizeDialogContent$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Animatable<Float, AnimationVector1D> $animatedFloat;
    public final /* synthetic */ Pair<Float, Integer> $valueForAnimateFive;
    public final /* synthetic */ Pair<Float, Integer> $valueForAnimateFour;
    public final /* synthetic */ Pair<Float, Integer> $valueForAnimateOne;
    public final /* synthetic */ Pair<Float, Integer> $valueForAnimateThree;
    public final /* synthetic */ Pair<Float, Integer> $valueForAnimateTwo;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackPassPrizeDialogNewKt$BlackPassPrizeDialogContent$2$1(Animatable<Float, AnimationVector1D> animatable, Pair<Float, Integer> pair, Pair<Float, Integer> pair2, Pair<Float, Integer> pair3, Pair<Float, Integer> pair4, Pair<Float, Integer> pair5, Continuation<? super BlackPassPrizeDialogNewKt$BlackPassPrizeDialogContent$2$1> continuation) {
        super(2, continuation);
        this.$animatedFloat = animatable;
        this.$valueForAnimateOne = pair;
        this.$valueForAnimateTwo = pair2;
        this.$valueForAnimateThree = pair3;
        this.$valueForAnimateFour = pair4;
        this.$valueForAnimateFive = pair5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BlackPassPrizeDialogNewKt$BlackPassPrizeDialogContent$2$1(this.$animatedFloat, this.$valueForAnimateOne, this.$valueForAnimateTwo, this.$valueForAnimateThree, this.$valueForAnimateFour, this.$valueForAnimateFive, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BlackPassPrizeDialogNewKt$BlackPassPrizeDialogContent$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Animatable<Float, AnimationVector1D> animatable;
        Float first;
        TweenSpec tweenSpecTween$default;
        Animatable<Float, AnimationVector1D> animatable2;
        Float first2;
        TweenSpec tweenSpecTween$default2;
        Animatable<Float, AnimationVector1D> animatable3;
        Float first3;
        TweenSpec tweenSpecTween$default3;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Animatable<Float, AnimationVector1D> animatable4 = this.$animatedFloat;
            Float first4 = this.$valueForAnimateOne.getFirst();
            TweenSpec tweenSpecTween$default4 = AnimationSpecKt.tween$default(this.$valueForAnimateOne.getSecond().intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
            this.label = 1;
            if (Animatable.animateTo$default(animatable4, first4, tweenSpecTween$default4, null, null, this, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    animatable = this.$animatedFloat;
                    first = this.$valueForAnimateThree.getFirst();
                    tweenSpecTween$default = AnimationSpecKt.tween$default(this.$valueForAnimateThree.getSecond().intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                    this.label = 3;
                    if (Animatable.animateTo$default(animatable, first, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    animatable2 = this.$animatedFloat;
                    first2 = this.$valueForAnimateFour.getFirst();
                    tweenSpecTween$default2 = AnimationSpecKt.tween$default(this.$valueForAnimateFour.getSecond().intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                    this.label = 4;
                    if (Animatable.animateTo$default(animatable2, first2, tweenSpecTween$default2, null, null, this, 12, null) == coroutine_suspended) {
                    }
                    animatable3 = this.$animatedFloat;
                    first3 = this.$valueForAnimateFive.getFirst();
                    tweenSpecTween$default3 = AnimationSpecKt.tween$default(this.$valueForAnimateFive.getSecond().intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                    this.label = 5;
                    if (Animatable.animateTo$default(animatable3, first3, tweenSpecTween$default3, null, null, this, 12, null) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    animatable3 = this.$animatedFloat;
                    first3 = this.$valueForAnimateFive.getFirst();
                    tweenSpecTween$default3 = AnimationSpecKt.tween$default(this.$valueForAnimateFive.getSecond().intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                    this.label = 5;
                    if (Animatable.animateTo$default(animatable3, first3, tweenSpecTween$default3, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                animatable2 = this.$animatedFloat;
                first2 = this.$valueForAnimateFour.getFirst();
                tweenSpecTween$default2 = AnimationSpecKt.tween$default(this.$valueForAnimateFour.getSecond().intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                this.label = 4;
                if (Animatable.animateTo$default(animatable2, first2, tweenSpecTween$default2, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                animatable3 = this.$animatedFloat;
                first3 = this.$valueForAnimateFive.getFirst();
                tweenSpecTween$default3 = AnimationSpecKt.tween$default(this.$valueForAnimateFive.getSecond().intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                this.label = 5;
                if (Animatable.animateTo$default(animatable3, first3, tweenSpecTween$default3, null, null, this, 12, null) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        Animatable<Float, AnimationVector1D> animatable5 = this.$animatedFloat;
        Float first5 = this.$valueForAnimateTwo.getFirst();
        TweenSpec tweenSpecTween$default5 = AnimationSpecKt.tween$default(this.$valueForAnimateTwo.getSecond().intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        this.label = 2;
        if (Animatable.animateTo$default(animatable5, first5, tweenSpecTween$default5, null, null, this, 12, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        animatable = this.$animatedFloat;
        first = this.$valueForAnimateThree.getFirst();
        tweenSpecTween$default = AnimationSpecKt.tween$default(this.$valueForAnimateThree.getSecond().intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        this.label = 3;
        if (Animatable.animateTo$default(animatable, first, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
        }
        animatable2 = this.$animatedFloat;
        first2 = this.$valueForAnimateFour.getFirst();
        tweenSpecTween$default2 = AnimationSpecKt.tween$default(this.$valueForAnimateFour.getSecond().intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        this.label = 4;
        if (Animatable.animateTo$default(animatable2, first2, tweenSpecTween$default2, null, null, this, 12, null) == coroutine_suspended) {
        }
        animatable3 = this.$animatedFloat;
        first3 = this.$valueForAnimateFive.getFirst();
        tweenSpecTween$default3 = AnimationSpecKt.tween$default(this.$valueForAnimateFive.getSecond().intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        this.label = 5;
        if (Animatable.animateTo$default(animatable3, first3, tweenSpecTween$default3, null, null, this, 12, null) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}

