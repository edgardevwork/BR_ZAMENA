package com.airbnb.lottie.compose;

import androidx.compose.animation.core.InfiniteAnimationPolicyKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonCancellable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LottieAnimatable.kt */
@Stable
@Metadata(m7104d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002Jj\u0010P\u001a\u00020Q2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010%\u001a\u00020$2\u0006\u0010+\u001a\u00020$2\u0006\u0010A\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010R\u001a\u00020\u00142\u0006\u0010S\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020\u001dH\u0096@¢\u0006\u0002\u0010WJ\u0016\u0010X\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020$H\u0082@¢\u0006\u0002\u0010YJ\u0018\u0010Z\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020$2\u0006\u0010[\u001a\u00020/H\u0002J0\u0010\\\u001a\u00020Q2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u00108\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$2\u0006\u0010]\u001a\u00020\u001dH\u0096@¢\u0006\u0002\u0010^J\u0010\u0010_\u001a\u00020Q2\u0006\u00108\u001a\u00020\u0014H\u0002J\u0016\u0010`\u001a\u00020\u0014*\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002R/\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR/\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\f8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001c\u0010\u001eR+\u0010 \u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u000b\u001a\u0004\b \u0010\u001e\"\u0004\b!\u0010\"R+\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020$8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u000b\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u0010+\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020$8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u000b\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R+\u00100\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020/8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u000b\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R+\u00108\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00148V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010\u000b\u001a\u0004\b9\u0010\u0016\"\u0004\b:\u0010;R+\u0010=\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010\u000b\u001a\u0004\b>\u0010\u0016\"\u0004\b?\u0010;R+\u0010A\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010\u000b\u001a\u0004\bB\u0010\u001e\"\u0004\bC\u0010\"R+\u0010E\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00148V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010\u000b\u001a\u0004\bF\u0010\u0016\"\u0004\bG\u0010;R+\u0010I\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010\u000b\u001a\u0004\bJ\u0010\u001e\"\u0004\bK\u0010\"R\u0014\u0010M\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006a"}, m7105d2 = {"Lcom/airbnb/lottie/compose/LottieAnimatableImpl;", "Lcom/airbnb/lottie/compose/LottieAnimatable;", "()V", "<set-?>", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "clipSpec", "getClipSpec", "()Lcom/airbnb/lottie/compose/LottieClipSpec;", "setClipSpec", "(Lcom/airbnb/lottie/compose/LottieClipSpec;)V", "clipSpec$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/airbnb/lottie/LottieComposition;", "composition", "getComposition", "()Lcom/airbnb/lottie/LottieComposition;", "setComposition", "(Lcom/airbnb/lottie/LottieComposition;)V", "composition$delegate", "endProgress", "", "getEndProgress", "()F", "endProgress$delegate", "Landroidx/compose/runtime/State;", "frameSpeed", "getFrameSpeed", "frameSpeed$delegate", "isAtEnd", "", "()Z", "isAtEnd$delegate", "isPlaying", "setPlaying", "(Z)V", "isPlaying$delegate", "", "iteration", "getIteration", "()I", "setIteration", "(I)V", "iteration$delegate", "iterations", "getIterations", "setIterations", "iterations$delegate", "", "lastFrameNanos", "getLastFrameNanos", "()J", "setLastFrameNanos", "(J)V", "lastFrameNanos$delegate", "mutex", "Landroidx/compose/foundation/MutatorMutex;", "progress", "getProgress", "setProgress", "(F)V", "progress$delegate", "progressRaw", "getProgressRaw", "setProgressRaw", "progressRaw$delegate", "reverseOnRepeat", "getReverseOnRepeat", "setReverseOnRepeat", "reverseOnRepeat$delegate", "speed", "getSpeed", "setSpeed", "speed$delegate", "useCompositionFrameRate", "getUseCompositionFrameRate", "setUseCompositionFrameRate", "useCompositionFrameRate$delegate", "value", "getValue", "()Ljava/lang/Float;", "animate", "", "initialProgress", "continueFromPreviousAnimate", "cancellationBehavior", "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "ignoreSystemAnimationsDisabled", "(Lcom/airbnb/lottie/LottieComposition;IIZFLcom/airbnb/lottie/compose/LottieClipSpec;FZLcom/airbnb/lottie/compose/LottieCancellationBehavior;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doFrame", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onFrame", "frameNanos", "snapTo", "resetLastFrameNanos", "(Lcom/airbnb/lottie/LottieComposition;FIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProgress", "roundToCompositionFrameRate", "lottie-compose_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLottieAnimatable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottieAnimatable.kt\ncom/airbnb/lottie/compose/LottieAnimatableImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,359:1\n81#2:360\n107#2,2:361\n81#2:363\n107#2,2:364\n81#2:366\n107#2,2:367\n81#2:369\n107#2,2:370\n81#2:372\n107#2,2:373\n81#2:375\n107#2,2:376\n81#2:378\n107#2,2:379\n81#2:381\n81#2:382\n107#2,2:383\n81#2:385\n107#2,2:386\n81#2:388\n107#2,2:389\n81#2:391\n107#2,2:392\n81#2:394\n81#2:395\n*S KotlinDebug\n*F\n+ 1 LottieAnimatable.kt\ncom/airbnb/lottie/compose/LottieAnimatableImpl\n*L\n157#1:360\n157#1:361,2\n163#1:363\n163#1:364,2\n166#1:366\n166#1:367,2\n169#1:369\n169#1:370,2\n172#1:372\n172#1:373,2\n175#1:375\n175#1:376,2\n178#1:378\n178#1:379,2\n184#1:381\n188#1:382\n188#1:383,2\n191#1:385\n191#1:386,2\n193#1:388\n193#1:389,2\n196#1:391\n196#1:392,2\n199#1:394\n208#1:395\n*E\n"})
/* loaded from: classes.dex */
public final class LottieAnimatableImpl implements LottieAnimatable {

    /* renamed from: clipSpec$delegate, reason: from kotlin metadata */
    @NotNull
    public final MutableState clipSpec;

    /* renamed from: composition$delegate, reason: from kotlin metadata */
    @NotNull
    public final MutableState composition;

    /* renamed from: endProgress$delegate, reason: from kotlin metadata */
    @NotNull
    public final State endProgress;

    /* renamed from: frameSpeed$delegate, reason: from kotlin metadata */
    @NotNull
    public final State frameSpeed;

    /* renamed from: isAtEnd$delegate, reason: from kotlin metadata */
    @NotNull
    public final State isAtEnd;

    /* renamed from: isPlaying$delegate, reason: from kotlin metadata */
    @NotNull
    public final MutableState isPlaying;

    /* renamed from: iteration$delegate, reason: from kotlin metadata */
    @NotNull
    public final MutableState iteration;

    /* renamed from: iterations$delegate, reason: from kotlin metadata */
    @NotNull
    public final MutableState iterations;

    /* renamed from: lastFrameNanos$delegate, reason: from kotlin metadata */
    @NotNull
    public final MutableState lastFrameNanos;

    @NotNull
    public final MutatorMutex mutex;

    /* renamed from: progress$delegate, reason: from kotlin metadata */
    @NotNull
    public final MutableState progress;

    /* renamed from: progressRaw$delegate, reason: from kotlin metadata */
    @NotNull
    public final MutableState progressRaw;

    /* renamed from: reverseOnRepeat$delegate, reason: from kotlin metadata */
    @NotNull
    public final MutableState reverseOnRepeat;

    /* renamed from: speed$delegate, reason: from kotlin metadata */
    @NotNull
    public final MutableState speed;

    /* renamed from: useCompositionFrameRate$delegate, reason: from kotlin metadata */
    @NotNull
    public final MutableState useCompositionFrameRate;

    public LottieAnimatableImpl() {
        Boolean bool = Boolean.FALSE;
        this.isPlaying = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.iteration = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);
        this.iterations = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);
        this.reverseOnRepeat = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.clipSpec = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.speed = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
        this.useCompositionFrameRate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.frameSpeed = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$frameSpeed$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                return Float.valueOf((this.this$0.getReverseOnRepeat() && this.this$0.getIteration() % 2 == 0) ? -this.this$0.getSpeed() : this.this$0.getSpeed());
            }
        });
        this.composition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        Float fValueOf = Float.valueOf(0.0f);
        this.progressRaw = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
        this.progress = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
        this.lastFrameNanos = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.MIN_VALUE, null, 2, null);
        this.endProgress = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$endProgress$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                LottieComposition composition = this.this$0.getComposition();
                float maxProgress$lottie_compose_release = 0.0f;
                if (composition != null) {
                    if (this.this$0.getSpeed() < 0.0f) {
                        LottieClipSpec clipSpec = this.this$0.getClipSpec();
                        if (clipSpec != null) {
                            maxProgress$lottie_compose_release = clipSpec.getMinProgress$lottie_compose_release(composition);
                        }
                    } else {
                        LottieClipSpec clipSpec2 = this.this$0.getClipSpec();
                        maxProgress$lottie_compose_release = clipSpec2 != null ? clipSpec2.getMaxProgress$lottie_compose_release(composition) : 1.0f;
                    }
                }
                return Float.valueOf(maxProgress$lottie_compose_release);
            }
        });
        this.isAtEnd = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl.isAtEnd.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(LottieAnimatableImpl.this.getIteration() == LottieAnimatableImpl.this.getIterations() && LottieAnimatableImpl.this.getProgress() == LottieAnimatableImpl.this.getEndProgress());
            }
        });
        this.mutex = new MutatorMutex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean isPlaying() {
        return ((Boolean) this.isPlaying.getValue()).booleanValue();
    }

    public final void setPlaying(boolean z) {
        this.isPlaying.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    @NotNull
    public Float getValue() {
        return Float.valueOf(getProgress());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public int getIteration() {
        return ((Number) this.iteration.getValue()).intValue();
    }

    public final void setIteration(int i) {
        this.iteration.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public int getIterations() {
        return ((Number) this.iterations.getValue()).intValue();
    }

    public final void setIterations(int i) {
        this.iterations.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean getReverseOnRepeat() {
        return ((Boolean) this.reverseOnRepeat.getValue()).booleanValue();
    }

    public final void setReverseOnRepeat(boolean z) {
        this.reverseOnRepeat.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    @Nullable
    public LottieClipSpec getClipSpec() {
        return (LottieClipSpec) this.clipSpec.getValue();
    }

    public final void setClipSpec(LottieClipSpec lottieClipSpec) {
        this.clipSpec.setValue(lottieClipSpec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeed(float f) {
        this.speed.setValue(Float.valueOf(f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public float getSpeed() {
        return ((Number) this.speed.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseCompositionFrameRate(boolean z) {
        this.useCompositionFrameRate.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean getUseCompositionFrameRate() {
        return ((Boolean) this.useCompositionFrameRate.getValue()).booleanValue();
    }

    public final float getFrameSpeed() {
        return ((Number) this.frameSpeed.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComposition(LottieComposition lottieComposition) {
        this.composition.setValue(lottieComposition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    @Nullable
    public LottieComposition getComposition() {
        return (LottieComposition) this.composition.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getProgressRaw() {
        return ((Number) this.progressRaw.getValue()).floatValue();
    }

    public final void setProgressRaw(float f) {
        this.progressRaw.setValue(Float.valueOf(f));
    }

    private void setProgress(float f) {
        this.progress.setValue(Float.valueOf(f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public float getProgress() {
        return ((Number) this.progress.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public long getLastFrameNanos() {
        return ((Number) this.lastFrameNanos.getValue()).longValue();
    }

    public final void setLastFrameNanos(long j) {
        this.lastFrameNanos.setValue(Long.valueOf(j));
    }

    public final float getEndProgress() {
        return ((Number) this.endProgress.getValue()).floatValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean isAtEnd() {
        return ((Boolean) this.isAtEnd.getValue()).booleanValue();
    }

    /* compiled from: LottieAnimatable.kt */
    @Metadata(m7104d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", ""}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", m7120f = "LottieAnimatable.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2 */
    public static final class C34462 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public final /* synthetic */ LottieComposition $composition;
        public final /* synthetic */ int $iteration;
        public final /* synthetic */ float $progress;
        public final /* synthetic */ boolean $resetLastFrameNanos;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34462(LottieComposition lottieComposition, float f, int i, boolean z, Continuation<? super C34462> continuation) {
            super(1, continuation);
            this.$composition = lottieComposition;
            this.$progress = f;
            this.$iteration = i;
            this.$resetLastFrameNanos = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return LottieAnimatableImpl.this.new C34462(this.$composition, this.$progress, this.$iteration, this.$resetLastFrameNanos, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
            return ((C34462) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                LottieAnimatableImpl.this.setComposition(this.$composition);
                LottieAnimatableImpl.this.updateProgress(this.$progress);
                LottieAnimatableImpl.this.setIteration(this.$iteration);
                LottieAnimatableImpl.this.setPlaying(false);
                if (this.$resetLastFrameNanos) {
                    LottieAnimatableImpl.this.setLastFrameNanos(Long.MIN_VALUE);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable
    @Nullable
    public Object snapTo(@Nullable LottieComposition lottieComposition, float f, int i, boolean z, @NotNull Continuation<? super Unit> continuation) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutex, null, new C34462(lottieComposition, f, i, z, null), continuation, 1, null);
        return objMutate$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate$default : Unit.INSTANCE;
    }

    /* compiled from: LottieAnimatable.kt */
    @Metadata(m7104d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", ""}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", m7120f = "LottieAnimatable.kt", m7121i = {}, m7122l = {269}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2 */
    public static final class C34422 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
        public final /* synthetic */ LottieClipSpec $clipSpec;
        public final /* synthetic */ LottieComposition $composition;
        public final /* synthetic */ boolean $continueFromPreviousAnimate;
        public final /* synthetic */ float $initialProgress;
        public final /* synthetic */ int $iteration;
        public final /* synthetic */ int $iterations;
        public final /* synthetic */ boolean $reverseOnRepeat;
        public final /* synthetic */ float $speed;
        public final /* synthetic */ boolean $useCompositionFrameRate;
        public int label;

        /* compiled from: LottieAnimatable.kt */
        @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LottieCancellationBehavior.values().length];
                try {
                    iArr[LottieCancellationBehavior.OnIterationFinish.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LottieCancellationBehavior.Immediately.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34422(int i, int i2, boolean z, float f, LottieClipSpec lottieClipSpec, LottieComposition lottieComposition, float f2, boolean z2, boolean z3, LottieCancellationBehavior lottieCancellationBehavior, Continuation<? super C34422> continuation) {
            super(1, continuation);
            this.$iteration = i;
            this.$iterations = i2;
            this.$reverseOnRepeat = z;
            this.$speed = f;
            this.$clipSpec = lottieClipSpec;
            this.$composition = lottieComposition;
            this.$initialProgress = f2;
            this.$useCompositionFrameRate = z2;
            this.$continueFromPreviousAnimate = z3;
            this.$cancellationBehavior = lottieCancellationBehavior;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return LottieAnimatableImpl.this.new C34422(this.$iteration, this.$iterations, this.$reverseOnRepeat, this.$speed, this.$clipSpec, this.$composition, this.$initialProgress, this.$useCompositionFrameRate, this.$continueFromPreviousAnimate, this.$cancellationBehavior, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
            return ((C34422) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Finally extract failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CoroutineContext coroutineContext;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    LottieAnimatableImpl.this.setIteration(this.$iteration);
                    LottieAnimatableImpl.this.setIterations(this.$iterations);
                    LottieAnimatableImpl.this.setReverseOnRepeat(this.$reverseOnRepeat);
                    LottieAnimatableImpl.this.setSpeed(this.$speed);
                    LottieAnimatableImpl.this.setClipSpec(this.$clipSpec);
                    LottieAnimatableImpl.this.setComposition(this.$composition);
                    LottieAnimatableImpl.this.updateProgress(this.$initialProgress);
                    LottieAnimatableImpl.this.setUseCompositionFrameRate(this.$useCompositionFrameRate);
                    if (!this.$continueFromPreviousAnimate) {
                        LottieAnimatableImpl.this.setLastFrameNanos(Long.MIN_VALUE);
                    }
                    if (this.$composition == null) {
                        LottieAnimatableImpl.this.setPlaying(false);
                        return Unit.INSTANCE;
                    }
                    if (!Float.isInfinite(this.$speed)) {
                        LottieAnimatableImpl.this.setPlaying(true);
                        int i2 = WhenMappings.$EnumSwitchMapping$0[this.$cancellationBehavior.ordinal()];
                        if (i2 == 1) {
                            coroutineContext = NonCancellable.INSTANCE;
                        } else {
                            if (i2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            coroutineContext = EmptyCoroutineContext.INSTANCE;
                        }
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$cancellationBehavior, JobKt.getJob(getContext()), this.$iterations, this.$iteration, LottieAnimatableImpl.this, null);
                        this.label = 1;
                        if (BuildersKt.withContext(coroutineContext, anonymousClass1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        LottieAnimatableImpl lottieAnimatableImpl = LottieAnimatableImpl.this;
                        lottieAnimatableImpl.updateProgress(lottieAnimatableImpl.getEndProgress());
                        LottieAnimatableImpl.this.setPlaying(false);
                        LottieAnimatableImpl.this.setIteration(this.$iterations);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                JobKt.ensureActive(getContext());
                LottieAnimatableImpl.this.setPlaying(false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                LottieAnimatableImpl.this.setPlaying(false);
                throw th;
            }
        }

        /* compiled from: LottieAnimatable.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1", m7120f = "LottieAnimatable.kt", m7121i = {}, m7122l = {277}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
            public final /* synthetic */ int $iteration;
            public final /* synthetic */ int $iterations;
            public final /* synthetic */ Job $parentJob;
            public int label;
            public final /* synthetic */ LottieAnimatableImpl this$0;

            /* compiled from: LottieAnimatable.kt */
            @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LottieCancellationBehavior.values().length];
                    try {
                        iArr[LottieCancellationBehavior.OnIterationFinish.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LottieCancellationBehavior lottieCancellationBehavior, Job job, int i, int i2, LottieAnimatableImpl lottieAnimatableImpl, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$cancellationBehavior = lottieCancellationBehavior;
                this.$parentJob = job;
                this.$iterations = i;
                this.$iteration = i2;
                this.this$0 = lottieAnimatableImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$cancellationBehavior, this.$parentJob, this.$iterations, this.$iteration, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[ADDED_TO_REGION, REMOVE] */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003e -> B:19:0x0041). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r3.label
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    kotlin.ResultKt.throwOnFailure(r4)
                    goto L41
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    kotlin.ResultKt.throwOnFailure(r4)
                L1a:
                    com.airbnb.lottie.compose.LottieCancellationBehavior r4 = r3.$cancellationBehavior
                    int[] r1 = com.airbnb.lottie.compose.LottieAnimatableImpl.C34422.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0
                    int r4 = r4.ordinal()
                    r4 = r1[r4]
                    if (r4 != r2) goto L34
                    kotlinx.coroutines.Job r4 = r3.$parentJob
                    boolean r4 = r4.isActive()
                    if (r4 == 0) goto L31
                    int r4 = r3.$iterations
                    goto L36
                L31:
                    int r4 = r3.$iteration
                    goto L36
                L34:
                    int r4 = r3.$iterations
                L36:
                    com.airbnb.lottie.compose.LottieAnimatableImpl r1 = r3.this$0
                    r3.label = r2
                    java.lang.Object r4 = com.airbnb.lottie.compose.LottieAnimatableImpl.access$doFrame(r1, r4, r3)
                    if (r4 != r0) goto L41
                    return r0
                L41:
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    if (r4 != 0) goto L1a
                    kotlin.Unit r4 = kotlin.Unit.INSTANCE
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.LottieAnimatableImpl.C34422.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable
    @Nullable
    public Object animate(@Nullable LottieComposition lottieComposition, int i, int i2, boolean z, float f, @Nullable LottieClipSpec lottieClipSpec, float f2, boolean z2, @NotNull LottieCancellationBehavior lottieCancellationBehavior, boolean z3, boolean z4, @NotNull Continuation<? super Unit> continuation) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutex, null, new C34422(i, i2, z, f, lottieClipSpec, lottieComposition, f2, z4, z2, lottieCancellationBehavior, null), continuation, 1, null);
        return objMutate$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate$default : Unit.INSTANCE;
    }

    public final Object doFrame(final int i, Continuation<? super Boolean> continuation) {
        if (i == Integer.MAX_VALUE) {
            return InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(new Function1<Long, Boolean>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl.doFrame.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Long l) {
                    return invoke(l.longValue());
                }

                @NotNull
                public final Boolean invoke(long j) {
                    return Boolean.valueOf(LottieAnimatableImpl.this.onFrame(i, j));
                }
            }, continuation);
        }
        return MonotonicFrameClockKt.withFrameNanos(new Function1<Long, Boolean>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl.doFrame.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Long l) {
                return invoke(l.longValue());
            }

            @NotNull
            public final Boolean invoke(long j) {
                return Boolean.valueOf(LottieAnimatableImpl.this.onFrame(i, j));
            }
        }, continuation);
    }

    public final boolean onFrame(int iterations, long frameNanos) {
        LottieComposition composition = getComposition();
        if (composition == null) {
            return true;
        }
        long lastFrameNanos = getLastFrameNanos() == Long.MIN_VALUE ? 0L : frameNanos - getLastFrameNanos();
        setLastFrameNanos(frameNanos);
        LottieClipSpec clipSpec = getClipSpec();
        float minProgress$lottie_compose_release = clipSpec != null ? clipSpec.getMinProgress$lottie_compose_release(composition) : 0.0f;
        LottieClipSpec clipSpec2 = getClipSpec();
        float maxProgress$lottie_compose_release = clipSpec2 != null ? clipSpec2.getMaxProgress$lottie_compose_release(composition) : 1.0f;
        float duration = ((lastFrameNanos / 1000000) / composition.getDuration()) * getFrameSpeed();
        float progressRaw = getFrameSpeed() < 0.0f ? minProgress$lottie_compose_release - (getProgressRaw() + duration) : (getProgressRaw() + duration) - maxProgress$lottie_compose_release;
        if (progressRaw < 0.0f) {
            updateProgress(RangesKt___RangesKt.coerceIn(getProgressRaw(), minProgress$lottie_compose_release, maxProgress$lottie_compose_release) + duration);
        } else {
            float f = maxProgress$lottie_compose_release - minProgress$lottie_compose_release;
            int i = (int) (progressRaw / f);
            int i2 = i + 1;
            if (getIteration() + i2 > iterations) {
                updateProgress(getEndProgress());
                setIteration(iterations);
                return false;
            }
            setIteration(getIteration() + i2);
            float f2 = progressRaw - (i * f);
            updateProgress(getFrameSpeed() < 0.0f ? maxProgress$lottie_compose_release - f2 : minProgress$lottie_compose_release + f2);
        }
        return true;
    }

    public final float roundToCompositionFrameRate(float f, LottieComposition lottieComposition) {
        if (lottieComposition == null) {
            return f;
        }
        return f - (f % (1 / lottieComposition.getFrameRate()));
    }

    public final void updateProgress(float progress) {
        setProgressRaw(progress);
        if (getUseCompositionFrameRate()) {
            progress = roundToCompositionFrameRate(progress, getComposition());
        }
        setProgress(progress);
    }
}
