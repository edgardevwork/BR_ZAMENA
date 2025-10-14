package com.blackhub.bronline.game.p019ui.cases;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.gui.cases.model.CaseReward;
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

/* compiled from: CaseRewardCard.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.cases.CaseRewardCardKt$CaseRewardCard$2", m7120f = "CaseRewardCard.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes2.dex */
public final class CaseRewardCardKt$CaseRewardCard$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $isGreetingBanner;
    public final /* synthetic */ CaseReward $reward;
    public final /* synthetic */ MutableState<Bitmap> $rewardImage$delegate;
    public final /* synthetic */ MutableFloatState $scaleForImage$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaseRewardCardKt$CaseRewardCard$2(CaseReward caseReward, boolean z, Context context, MutableState<Bitmap> mutableState, MutableFloatState mutableFloatState, Continuation<? super CaseRewardCardKt$CaseRewardCard$2> continuation) {
        super(2, continuation);
        this.$reward = caseReward;
        this.$isGreetingBanner = z;
        this.$context = context;
        this.$rewardImage$delegate = mutableState;
        this.$scaleForImage$delegate = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CaseRewardCardKt$CaseRewardCard$2(this.$reward, this.$isGreetingBanner, this.$context, this.$rewardImage$delegate, this.$scaleForImage$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CaseRewardCardKt$CaseRewardCard$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (AnyExtensionKt.isNotNull(CaseRewardCardKt.CaseRewardCard_r0mSVAk$lambda$2(this.$rewardImage$delegate))) {
                this.$rewardImage$delegate.setValue(null);
            }
            float f = 1.0f;
            if (this.$reward.isRender()) {
                MutableFloatState mutableFloatState = this.$scaleForImage$delegate;
                if (this.$reward.getRenderAttachment().getType() != 2 && this.$reward.getRenderAttachment().getType() != 0 && !this.$isGreetingBanner) {
                    f = 1.2f;
                }
                mutableFloatState.setFloatValue(f);
                GameRender gameRender = GameRender.getInstance();
                int type = this.$reward.getRenderAttachment().getType();
                int modelId = this.$reward.getRenderAttachment().getModelId();
                int modelId2 = this.$reward.getRenderAttachment().getModelId();
                int color = this.$reward.getRenderAttachment().getColor();
                int color2 = this.$reward.getRenderAttachment().getColor();
                float zoom = this.$reward.getRenderAttachment().getZoom();
                final MutableState<Bitmap> mutableState = this.$rewardImage$delegate;
                gameRender.RequestRender(type, modelId, modelId2, color, color2, 20.0f, 180.0f, 45.0f, zoom, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.ui.cases.CaseRewardCardKt$CaseRewardCard$2$$ExternalSyntheticLambda0
                    @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
                    public final void OnRenderComplete(int i, Bitmap bitmap) {
                        CaseRewardCardKt.access$CaseRewardCard_r0mSVAk$lambda$3(mutableState, bitmap);
                    }
                });
            } else {
                this.$scaleForImage$delegate.setFloatValue(1.0f);
                this.$rewardImage$delegate.setValue(BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$reward.getImageName(), StringExtensionKt.getImageTypePathInCDN(this.$reward.getImageName(), this.$reward.getRewardType(), this.$reward.getInternalId()), 0.0f, 0.0f, 24, null));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

