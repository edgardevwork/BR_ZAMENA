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
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ClickerContent.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.clicker.ClickerContentKt$ClickerContent$1$1", m7120f = "ClickerContent.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes7.dex */
public final class ClickerContentKt$ClickerContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableState<String> $currentTimerText$delegate;
    public final /* synthetic */ MutableIntState $currentTimerValue$delegate;
    public final /* synthetic */ int $timerInSeconds;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickerContentKt$ClickerContent$1$1(int i, MutableIntState mutableIntState, MutableState<String> mutableState, Continuation<? super ClickerContentKt$ClickerContent$1$1> continuation) {
        super(2, continuation);
        this.$timerInSeconds = i;
        this.$currentTimerValue$delegate = mutableIntState;
        this.$currentTimerText$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ClickerContentKt$ClickerContent$1$1(this.$timerInSeconds, this.$currentTimerValue$delegate, this.$currentTimerText$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ClickerContentKt$ClickerContent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$currentTimerValue$delegate.setIntValue(this.$timerInSeconds);
        this.$currentTimerText$delegate.setValue(IntExtensionKt.parseTimeToStringWithFormat(this.$currentTimerValue$delegate.getIntValue()));
        return Unit.INSTANCE;
    }
}
