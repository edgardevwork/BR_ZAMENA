package com.blackhub.bronline.game.p019ui.widget.timer;

import androidx.compose.p003ui.text.intl.Locale;
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
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CountdownTimerWithSecondsToEnd.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.timer.CountdownTimerWithSecondsToEndKt$CountdownTimerWithSecondsToEnd$1$1", m7120f = "CountdownTimerWithSecondsToEnd.kt", m7121i = {}, m7122l = {38}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* renamed from: com.blackhub.bronline.game.ui.widget.timer.CountdownTimerWithSecondsToEndKt$CountdownTimerWithSecondsToEnd$1$1 */
/* loaded from: classes8.dex */
public final class C6487xabe12a35 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableState<String> $formattedText$delegate;
    public final /* synthetic */ MutableIntState $timeLeft$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6487xabe12a35(MutableIntState mutableIntState, MutableState<String> mutableState, Continuation<? super C6487xabe12a35> continuation) {
        super(2, continuation);
        this.$timeLeft$delegate = mutableIntState;
        this.$formattedText$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C6487xabe12a35(this.$timeLeft$delegate, this.$formattedText$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((C6487xabe12a35) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        while (this.$timeLeft$delegate.getIntValue() >= 0) {
            MutableIntState mutableIntState = this.$timeLeft$delegate;
            mutableIntState.setIntValue(mutableIntState.getIntValue() - 1);
            mutableIntState.setIntValue(this.$timeLeft$delegate.getIntValue());
            if (this.$timeLeft$delegate.getIntValue() >= 0) {
                this.$formattedText$delegate.setValue(IntExtensionKt.formatDurationNoSecondsWithHoursWithLocale(this.$timeLeft$delegate.getIntValue(), Locale.INSTANCE.getCurrent()));
            }
            this.label = 1;
            if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}

