package com.blackhub.bronline.game.p019ui.widget.timer;

import androidx.compose.runtime.MutableState;
import java.text.SimpleDateFormat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DataWithTimer.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.timer.DataWithTimerKt$DataWithTimer$1$1", m7120f = "DataWithTimer.kt", m7121i = {}, m7122l = {41}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes8.dex */
public final class DataWithTimerKt$DataWithTimer$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableState<String> $formattedText$delegate;
    public final /* synthetic */ MutableState<SimpleDateFormat> $simpleDateFormat$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataWithTimerKt$DataWithTimer$1$1(MutableState<SimpleDateFormat> mutableState, MutableState<String> mutableState2, Continuation<? super DataWithTimerKt$DataWithTimer$1$1> continuation) {
        super(2, continuation);
        this.$simpleDateFormat$delegate = mutableState;
        this.$formattedText$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DataWithTimerKt$DataWithTimer$1$1(this.$simpleDateFormat$delegate, this.$formattedText$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DataWithTimerKt$DataWithTimer$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:12:0x0025). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r6)
            goto L25
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
        L1a:
            r5.label = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r5)
            if (r6 != r0) goto L25
            return r0
        L25:
            androidx.compose.runtime.MutableState<java.lang.String> r6 = r5.$formattedText$delegate
            androidx.compose.runtime.MutableState<java.text.SimpleDateFormat> r1 = r5.$simpleDateFormat$delegate
            java.text.SimpleDateFormat r1 = com.blackhub.bronline.game.p019ui.widget.timer.DataWithTimerKt.access$DataWithTimer$lambda$4(r1)
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            java.util.Date r3 = r3.getTime()
            java.lang.String r1 = r1.format(r3)
            java.lang.String r3 = "format(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            com.blackhub.bronline.game.p019ui.widget.timer.DataWithTimerKt.access$DataWithTimer$lambda$2(r6, r1)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.p019ui.widget.timer.DataWithTimerKt$DataWithTimer$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
