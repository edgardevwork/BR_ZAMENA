package com.blackhub.bronline.game.p019ui.widget.block.item;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonRewardItem.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.block.item.CommonRewardItemKt$CommonPrizeItem$4", m7120f = "CommonRewardItem.kt", m7121i = {}, m7122l = {Cea708Decoder.COMMAND_SPL}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes8.dex */
public final class CommonRewardItemKt$CommonPrizeItem$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<Bitmap> $prizeImage$delegate;
    public final /* synthetic */ CommonRewardModel $prizeItem;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonRewardItemKt$CommonPrizeItem$4(CommonRewardModel commonRewardModel, Context context, MutableState<Bitmap> mutableState, Continuation<? super CommonRewardItemKt$CommonPrizeItem$4> continuation) {
        super(2, continuation);
        this.$prizeItem = commonRewardModel;
        this.$context = context;
        this.$prizeImage$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CommonRewardItemKt$CommonPrizeItem$4(this.$prizeItem, this.$context, this.$prizeImage$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CommonRewardItemKt$CommonPrizeItem$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: CommonRewardItem.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.block.item.CommonRewardItemKt$CommonPrizeItem$4$1", m7120f = "CommonRewardItem.kt", m7121i = {}, m7122l = {149}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardItemKt$CommonPrizeItem$4$1 */
    public static final class C62831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ MutableState<Bitmap> $prizeImage$delegate;
        public final /* synthetic */ CommonRewardModel $prizeItem;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62831(CommonRewardModel commonRewardModel, Context context, MutableState<Bitmap> mutableState, Continuation<? super C62831> continuation) {
            super(2, continuation);
            this.$prizeItem = commonRewardModel;
            this.$context = context;
            this.$prizeImage$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C62831(this.$prizeItem, this.$context, this.$prizeImage$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C62831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Bitmap bitmapDrawableToBitmap;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (AnyExtensionKt.isNotNull(CommonRewardItemKt.CommonPrizeItem_BFw8Y_g$lambda$3(this.$prizeImage$delegate))) {
                    this.$prizeImage$delegate.setValue(null);
                    this.label = 1;
                    if (DelayKt.delay(150L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (this.$prizeItem.getImageModel().getRender() != null) {
                GameRender gameRender = GameRender.getInstance();
                int type = this.$prizeItem.getImageModel().getRender().getType();
                int id = this.$prizeItem.getImageModel().getRender().getId();
                int modelId = this.$prizeItem.getImageModel().getRender().getModelId();
                int color = this.$prizeItem.getImageModel().getRender().getColor();
                int color2 = this.$prizeItem.getImageModel().getRender().getColor();
                float rotationX = this.$prizeItem.getImageModel().getRender().getRotationX();
                float rotationY = this.$prizeItem.getImageModel().getRender().getRotationY();
                float rotationZ = this.$prizeItem.getImageModel().getRender().getRotationZ();
                float zoom = this.$prizeItem.getImageModel().getRender().getZoom();
                final MutableState<Bitmap> mutableState = this.$prizeImage$delegate;
                gameRender.RequestRender(type, id, modelId, color, color2, rotationX, rotationY, rotationZ, zoom, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardItemKt$CommonPrizeItem$4$1$$ExternalSyntheticLambda0
                    @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
                    public final void OnRenderComplete(int i2, Bitmap bitmap) {
                        CommonRewardItemKt.access$CommonPrizeItem_BFw8Y_g$lambda$4(mutableState, bitmap);
                    }
                });
            } else {
                MutableState<Bitmap> mutableState2 = this.$prizeImage$delegate;
                if (this.$prizeItem.getImageModel().getImageName().length() > 0) {
                    bitmapDrawableToBitmap = BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$prizeItem.getImageModel().getImageName(), this.$prizeItem.getImageModel().getImageType(), 0.0f, 0.0f, 24, null);
                } else {
                    bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(this.$context, R.drawable.img_not_found);
                }
                mutableState2.setValue(bitmapDrawableToBitmap);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            C62831 c62831 = new C62831(this.$prizeItem, this.$context, this.$prizeImage$delegate, null);
            this.label = 1;
            if (BuildersKt.withContext(io2, c62831, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
