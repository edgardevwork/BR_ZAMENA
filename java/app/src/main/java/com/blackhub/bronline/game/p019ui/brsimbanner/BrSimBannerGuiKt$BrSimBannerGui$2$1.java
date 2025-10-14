package com.blackhub.bronline.game.p019ui.brsimbanner;

import androidx.compose.runtime.MutableIntState;
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

/* compiled from: BrSimBannerGui.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerGui$2$1", m7120f = "BrSimBannerGui.kt", m7121i = {}, m7122l = {134}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes2.dex */
public final class BrSimBannerGuiKt$BrSimBannerGui$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $compare$delegate;
    public final /* synthetic */ MutableState<Boolean> $tickTurnOn$delegate;
    public final /* synthetic */ MutableIntState $ticksForPager$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrSimBannerGuiKt$BrSimBannerGui$2$1(MutableState<Boolean> mutableState, MutableIntState mutableIntState, MutableState<Boolean> mutableState2, Continuation<? super BrSimBannerGuiKt$BrSimBannerGui$2$1> continuation) {
        super(2, continuation);
        this.$tickTurnOn$delegate = mutableState;
        this.$ticksForPager$delegate = mutableIntState;
        this.$compare$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BrSimBannerGuiKt$BrSimBannerGui$2$1(this.$tickTurnOn$delegate, this.$ticksForPager$delegate, this.$compare$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BrSimBannerGuiKt$BrSimBannerGui$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0030 -> B:14:0x0033). Please report as a decompilation issue!!! */
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
            if (BrSimBannerGuiKt.BrSimBannerGui$lambda$7(this.$tickTurnOn$delegate)) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BrSimBannerGuiKt.BrSimBannerGui$lambda$5(this.$ticksForPager$delegate, this.$ticksForPager$delegate.getIntValue() + 1);
            if (this.$ticksForPager$delegate.getIntValue() == 4) {
                BrSimBannerGuiKt.BrSimBannerGui$lambda$5(this.$ticksForPager$delegate, 0);
                BrSimBannerGuiKt.BrSimBannerGui$lambda$22(this.$compare$delegate, !BrSimBannerGuiKt.BrSimBannerGui$lambda$21(r6));
            }
            if (BrSimBannerGuiKt.BrSimBannerGui$lambda$7(this.$tickTurnOn$delegate)) {
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(1, DurationUnit.SECONDS);
                this.label = 1;
                if (DelayKt.m17189delayVtjQ1oo(duration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                BrSimBannerGuiKt.BrSimBannerGui$lambda$5(this.$ticksForPager$delegate, this.$ticksForPager$delegate.getIntValue() + 1);
                if (this.$ticksForPager$delegate.getIntValue() == 4) {
                }
                if (BrSimBannerGuiKt.BrSimBannerGui$lambda$7(this.$tickTurnOn$delegate)) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}

