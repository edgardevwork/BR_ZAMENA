package com.blackhub.bronline.game.p019ui.widget.block.item;

import androidx.compose.p003ui.text.intl.Locale;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import java.util.Calendar;
import java.util.TimeZone;
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

/* compiled from: CommonTaskCategoryItem.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.block.item.CommonTaskCategoryItemKt$CommonTaskCategoryItem$1$1", m7120f = "CommonTaskCategoryItem.kt", m7121i = {0, 1}, m7122l = {Cea708Decoder.COMMAND_DF1, 155}, m7123m = "invokeSuspend", m7124n = {"endTime", "endTime"}, m7125s = {"J$0", "J$0"})
/* loaded from: classes8.dex */
public final class CommonTaskCategoryItemKt$CommonTaskCategoryItem$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableLongState $currentTime$delegate;
    public final /* synthetic */ MutableState<String> $formattedDailyTimerText$delegate;
    public final /* synthetic */ String $seasonTimer;
    public final /* synthetic */ MutableLongState $timeLeft$delegate;
    public long J$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonTaskCategoryItemKt$CommonTaskCategoryItem$1$1(String str, MutableLongState mutableLongState, MutableLongState mutableLongState2, MutableState<String> mutableState, Continuation<? super CommonTaskCategoryItemKt$CommonTaskCategoryItem$1$1> continuation) {
        super(2, continuation);
        this.$seasonTimer = str;
        this.$currentTime$delegate = mutableLongState;
        this.$timeLeft$delegate = mutableLongState2;
        this.$formattedDailyTimerText$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CommonTaskCategoryItemKt$CommonTaskCategoryItem$1$1(this.$seasonTimer, this.$currentTime$delegate, this.$timeLeft$delegate, this.$formattedDailyTimerText$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CommonTaskCategoryItemKt$CommonTaskCategoryItem$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        r13 = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        r13.add(5, 1);
        r13.set(11, 2);
        r13.set(12, 0);
        r13.set(13, 0);
        r13.set(14, 0);
        r6 = r13.getTimeInMillis() / 1000;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        long timeInMillis;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$seasonTimer != null) {
                return Unit.INSTANCE;
            }
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            calendar.add(5, 1);
            calendar.set(11, 2);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            timeInMillis = calendar.getTimeInMillis() / 1000;
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            timeInMillis = this.J$0;
            ResultKt.throwOnFailure(obj);
        }
        while (true) {
            this.$currentTime$delegate.setLongValue(System.currentTimeMillis() / 1000);
            this.$timeLeft$delegate.setLongValue(timeInMillis - this.$currentTime$delegate.getLongValue());
            if (this.$timeLeft$delegate.getLongValue() < 0) {
                Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                calendar2.add(5, 1);
                calendar2.set(11, 2);
                calendar2.set(12, 0);
                calendar2.set(13, 0);
                calendar2.set(14, 0);
                timeInMillis = calendar2.getTimeInMillis() / 1000;
            } else {
                this.$formattedDailyTimerText$delegate.setValue(IntExtensionKt.formatDurationWithLocaleNoSecondsIfHoursMoreThanZero((int) this.$timeLeft$delegate.getLongValue(), Locale.INSTANCE.getCurrent()));
                if (this.$timeLeft$delegate.getLongValue() > 3660) {
                    this.J$0 = timeInMillis;
                    this.label = 1;
                    if (DelayKt.delay(60000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.J$0 = timeInMillis;
                    this.label = 2;
                    if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        }
    }
}
