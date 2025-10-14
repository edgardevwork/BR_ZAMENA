package com.blackhub.bronline.game.p019ui.catchstreamer;

import androidx.compose.runtime.MutableState;
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

/* compiled from: CatchStreamerBannerUi.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerUi$1$1", m7120f = "CatchStreamerBannerUi.kt", m7121i = {}, m7122l = {100}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes7.dex */
public final class CatchStreamerBannerUiKt$CatchStreamerBannerUi$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Integer> $ticks$delegate;
    public final /* synthetic */ int $timeSeconds;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchStreamerBannerUiKt$CatchStreamerBannerUi$1$1(int i, MutableState<Integer> mutableState, Continuation<? super CatchStreamerBannerUiKt$CatchStreamerBannerUi$1$1> continuation) {
        super(2, continuation);
        this.$timeSeconds = i;
        this.$ticks$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CatchStreamerBannerUiKt$CatchStreamerBannerUi$1$1(this.$timeSeconds, this.$ticks$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CatchStreamerBannerUiKt$CatchStreamerBannerUi$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0032 -> B:14:0x0035). Please report as a decompilation issue!!! */
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
            if (CatchStreamerBannerUiKt.CatchStreamerBannerUi$lambda$1(this.$ticks$delegate) < this.$timeSeconds) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CatchStreamerBannerUiKt.CatchStreamerBannerUi$lambda$2(this.$ticks$delegate, CatchStreamerBannerUiKt.CatchStreamerBannerUi$lambda$1(this.$ticks$delegate) + 1);
            if (CatchStreamerBannerUiKt.CatchStreamerBannerUi$lambda$1(this.$ticks$delegate) < this.$timeSeconds) {
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(1, DurationUnit.SECONDS);
                this.label = 1;
                if (DelayKt.m17189delayVtjQ1oo(duration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                CatchStreamerBannerUiKt.CatchStreamerBannerUi$lambda$2(this.$ticks$delegate, CatchStreamerBannerUiKt.CatchStreamerBannerUi$lambda$1(this.$ticks$delegate) + 1);
                if (CatchStreamerBannerUiKt.CatchStreamerBannerUi$lambda$1(this.$ticks$delegate) < this.$timeSeconds) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
