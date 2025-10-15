package com.blackhub.bronline.game.p019ui.clicker;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ClickerContent.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.clicker.ClickerContentKt$ClickerContent$3$1", m7120f = "ClickerContent.kt", m7121i = {}, m7122l = {114}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes7.dex */
public final class ClickerContentKt$ClickerContent$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableState<String> $currentTimerText$delegate;
    public final /* synthetic */ MutableIntState $currentTimerValue$delegate;
    public final /* synthetic */ MutableState<Boolean> $isStartTimer$delegate;
    public final /* synthetic */ Function0<Unit> $onFinishTimer;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickerContentKt$ClickerContent$3$1(Function0<Unit> function0, MutableState<Boolean> mutableState, MutableIntState mutableIntState, MutableState<String> mutableState2, Continuation<? super ClickerContentKt$ClickerContent$3$1> continuation) {
        super(2, continuation);
        this.$onFinishTimer = function0;
        this.$isStartTimer$delegate = mutableState;
        this.$currentTimerValue$delegate = mutableIntState;
        this.$currentTimerText$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ClickerContentKt$ClickerContent$3$1(this.$onFinishTimer, this.$isStartTimer$delegate, this.$currentTimerValue$delegate, this.$currentTimerText$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ClickerContentKt$ClickerContent$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004c -> B:15:0x004f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (ClickerContentKt.ClickerContent$lambda$4(this.$isStartTimer$delegate)) {
                this.$currentTimerValue$delegate.setIntValue(r6.getIntValue() - 1);
                if (this.$currentTimerValue$delegate.getIntValue() >= 0) {
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$currentTimerValue$delegate.getIntValue() <= 0) {
            this.$onFinishTimer.invoke();
        }
        this.$currentTimerValue$delegate.setIntValue(r6.getIntValue() - 1);
        if (this.$currentTimerValue$delegate.getIntValue() >= 0) {
            this.$currentTimerText$delegate.setValue(IntExtensionKt.parseTimeToStringWithFormat(this.$currentTimerValue$delegate.getIntValue()));
            this.label = 1;
            if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (this.$currentTimerValue$delegate.getIntValue() <= 0) {
            }
            this.$currentTimerValue$delegate.setIntValue(r6.getIntValue() - 1);
            if (this.$currentTimerValue$delegate.getIntValue() >= 0) {
            }
        }
        return Unit.INSTANCE;
    }
}
