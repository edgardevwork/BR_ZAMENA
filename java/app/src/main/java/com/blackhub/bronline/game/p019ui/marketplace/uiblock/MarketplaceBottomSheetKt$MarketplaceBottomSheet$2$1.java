package com.blackhub.bronline.game.p019ui.marketplace.uiblock;

import androidx.compose.runtime.MutableState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceBottomSheetInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MarketplaceBottomSheet.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$2$1", m7120f = "MarketplaceBottomSheet.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes7.dex */
public final class MarketplaceBottomSheetKt$MarketplaceBottomSheet$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MarketplaceBottomSheetInfo $bottomSheetInfo;
    public final /* synthetic */ MutableState<String> $textFieldCount;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceBottomSheetKt$MarketplaceBottomSheet$2$1(MarketplaceBottomSheetInfo marketplaceBottomSheetInfo, MutableState<String> mutableState, Continuation<? super MarketplaceBottomSheetKt$MarketplaceBottomSheet$2$1> continuation) {
        super(2, continuation);
        this.$bottomSheetInfo = marketplaceBottomSheetInfo;
        this.$textFieldCount = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MarketplaceBottomSheetKt$MarketplaceBottomSheet$2$1(this.$bottomSheetInfo, this.$textFieldCount, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MarketplaceBottomSheetKt$MarketplaceBottomSheet$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$bottomSheetInfo.getProductCount() == 0) {
            this.$textFieldCount.setValue(AnyExtensionKt.empty(StringCompanionObject.INSTANCE));
        } else {
            this.$textFieldCount.setValue(String.valueOf(this.$bottomSheetInfo.getProductCount()));
        }
        return Unit.INSTANCE;
    }
}

