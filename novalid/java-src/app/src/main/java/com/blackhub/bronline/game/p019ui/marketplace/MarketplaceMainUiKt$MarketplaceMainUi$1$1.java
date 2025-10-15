package com.blackhub.bronline.game.p019ui.marketplace;

import androidx.compose.runtime.MutableState;
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

/* compiled from: MarketplaceMainUi.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$1$1", m7120f = "MarketplaceMainUi.kt", m7121i = {}, m7122l = {269}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes7.dex */
public final class MarketplaceMainUiKt$MarketplaceMainUi$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ boolean $isBottomSheetBlockVisible;
    public final /* synthetic */ MutableState<Boolean> $isBottomSheetPainted$delegate;
    public final /* synthetic */ MutableState<Float> $offsetY$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceMainUiKt$MarketplaceMainUi$1$1(boolean z, MutableState<Float> mutableState, MutableState<Boolean> mutableState2, Continuation<? super MarketplaceMainUiKt$MarketplaceMainUi$1$1> continuation) {
        super(2, continuation);
        this.$isBottomSheetBlockVisible = z;
        this.$offsetY$delegate = mutableState;
        this.$isBottomSheetPainted$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MarketplaceMainUiKt$MarketplaceMainUi$1$1(this.$isBottomSheetBlockVisible, this.$offsetY$delegate, this.$isBottomSheetPainted$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MarketplaceMainUiKt$MarketplaceMainUi$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$isBottomSheetBlockVisible) {
                MarketplaceMainUiKt.MarketplaceMainUi$lambda$18(this.$offsetY$delegate, 0.0f);
                this.label = 1;
                if (DelayKt.delay(300L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                MarketplaceMainUiKt.MarketplaceMainUi$lambda$2(this.$isBottomSheetPainted$delegate, true);
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        MarketplaceMainUiKt.MarketplaceMainUi$lambda$2(this.$isBottomSheetPainted$delegate, false);
        return Unit.INSTANCE;
    }
}
