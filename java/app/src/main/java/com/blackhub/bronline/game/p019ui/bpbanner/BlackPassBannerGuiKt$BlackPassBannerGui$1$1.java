package com.blackhub.bronline.game.p019ui.bpbanner;

import androidx.compose.runtime.MutableIntState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassBannerGui.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt$BlackPassBannerGui$1$1", m7120f = "BlackPassBannerGui.kt", m7121i = {}, m7122l = {118}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes2.dex */
public final class BlackPassBannerGuiKt$BlackPassBannerGui$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableIntState $ticks$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackPassBannerGuiKt$BlackPassBannerGui$1$1(MutableIntState mutableIntState, Continuation<? super BlackPassBannerGuiKt$BlackPassBannerGui$1$1> continuation) {
        super(2, continuation);
        this.$ticks$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BlackPassBannerGuiKt$BlackPassBannerGui$1$1(this.$ticks$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BlackPassBannerGuiKt$BlackPassBannerGui$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0031 -> B:14:0x0034). Please report as a decompilation issue!!! */
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
            if (BlackPassBannerGuiKt.BlackPassBannerGui$lambda$1(this.$ticks$delegate) < 3) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$ticks$delegate.setIntValue(BlackPassBannerGuiKt.BlackPassBannerGui$lambda$1(this.$ticks$delegate) + 1);
            if (BlackPassBannerGuiKt.BlackPassBannerGui$lambda$1(this.$ticks$delegate) < 3) {
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(1, DurationUnit.SECONDS);
                this.label = 1;
                if (DelayKt.m17189delayVtjQ1oo(duration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.$ticks$delegate.setIntValue(BlackPassBannerGuiKt.BlackPassBannerGui$lambda$1(this.$ticks$delegate) + 1);
                if (BlackPassBannerGuiKt.BlackPassBannerGui$lambda$1(this.$ticks$delegate) < 3) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}

