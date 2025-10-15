package androidx.compose.foundation;

import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Clickable.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", m7120f = "Clickable.kt", m7121i = {0, 1, 2}, m7122l = {307, 309, TypedValues.AttributesType.TYPE_PATH_ROTATE, TypedValues.AttributesType.TYPE_EASING, 326}, m7123m = "invokeSuspend", m7124n = {"delayJob", FirebaseAnalytics.Param.SUCCESS, "release"}, m7125s = {"L$0", "Z$0", "L$0"})
/* loaded from: classes4.dex */
public final class ClickableKt$handlePressInteraction$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Function0<Boolean> $delayPressInteraction;
    public final /* synthetic */ AbstractClickableNode.InteractionData $interactionData;
    public final /* synthetic */ MutableInteractionSource $interactionSource;
    public final /* synthetic */ long $pressPoint;
    public final /* synthetic */ PressGestureScope $this_handlePressInteraction;
    public /* synthetic */ Object L$0;
    public boolean Z$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$handlePressInteraction$2(PressGestureScope pressGestureScope, long j, MutableInteractionSource mutableInteractionSource, AbstractClickableNode.InteractionData interactionData, Function0<Boolean> function0, Continuation<? super ClickableKt$handlePressInteraction$2> continuation) {
        super(2, continuation);
        this.$this_handlePressInteraction = pressGestureScope;
        this.$pressPoint = j;
        this.$interactionSource = mutableInteractionSource;
        this.$interactionData = interactionData;
        this.$delayPressInteraction = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ClickableKt$handlePressInteraction$2 clickableKt$handlePressInteraction$2 = new ClickableKt$handlePressInteraction$2(this.$this_handlePressInteraction, this.$pressPoint, this.$interactionSource, this.$interactionData, this.$delayPressInteraction, continuation);
        clickableKt$handlePressInteraction$2.L$0 = obj;
        return clickableKt$handlePressInteraction$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ClickableKt$handlePressInteraction$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Job jobLaunch$default;
        Object objTryAwaitRelease;
        Interaction cancel;
        boolean z;
        PressInteraction.Release release;
        MutableInteractionSource mutableInteractionSource;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            jobLaunch$default = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new ClickableKt$handlePressInteraction$2$delayJob$1(this.$delayPressInteraction, this.$pressPoint, this.$interactionSource, this.$interactionData, null), 3, null);
            PressGestureScope pressGestureScope = this.$this_handlePressInteraction;
            this.L$0 = jobLaunch$default;
            this.label = 1;
            objTryAwaitRelease = pressGestureScope.tryAwaitRelease(this);
            if (objTryAwaitRelease == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4 && i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        this.$interactionData.setPressInteraction(null);
                        return Unit.INSTANCE;
                    }
                    release = (PressInteraction.Release) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutableInteractionSource = this.$interactionSource;
                    this.L$0 = null;
                    this.label = 4;
                    if (mutableInteractionSource.emit(release, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.$interactionData.setPressInteraction(null);
                    return Unit.INSTANCE;
                }
                z = this.Z$0;
                ResultKt.throwOnFailure(obj);
                if (z) {
                    PressInteraction.Press press = new PressInteraction.Press(this.$pressPoint, null);
                    PressInteraction.Release release2 = new PressInteraction.Release(press);
                    MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
                    this.L$0 = release2;
                    this.label = 3;
                    if (mutableInteractionSource2.emit(press, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    release = release2;
                    mutableInteractionSource = this.$interactionSource;
                    this.L$0 = null;
                    this.label = 4;
                    if (mutableInteractionSource.emit(release, this) == coroutine_suspended) {
                    }
                }
                this.$interactionData.setPressInteraction(null);
                return Unit.INSTANCE;
            }
            jobLaunch$default = (Job) this.L$0;
            ResultKt.throwOnFailure(obj);
            objTryAwaitRelease = obj;
        }
        boolean zBooleanValue = ((Boolean) objTryAwaitRelease).booleanValue();
        if (jobLaunch$default.isActive()) {
            this.L$0 = null;
            this.Z$0 = zBooleanValue;
            this.label = 2;
            if (JobKt.cancelAndJoin(jobLaunch$default, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = zBooleanValue;
            if (z) {
            }
            this.$interactionData.setPressInteraction(null);
            return Unit.INSTANCE;
        }
        PressInteraction.Press pressInteraction = this.$interactionData.getPressInteraction();
        if (pressInteraction != null) {
            MutableInteractionSource mutableInteractionSource3 = this.$interactionSource;
            if (zBooleanValue) {
                cancel = new PressInteraction.Release(pressInteraction);
            } else {
                cancel = new PressInteraction.Cancel(pressInteraction);
            }
            this.L$0 = null;
            this.label = 5;
            if (mutableInteractionSource3.emit(cancel, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.$interactionData.setPressInteraction(null);
        return Unit.INSTANCE;
    }
}
