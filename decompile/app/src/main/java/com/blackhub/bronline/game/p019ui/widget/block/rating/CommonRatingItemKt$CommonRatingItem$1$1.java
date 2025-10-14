package com.blackhub.bronline.game.p019ui.widget.block.rating;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.ImageModel;
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
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonRatingItem.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.block.rating.CommonRatingItemKt$CommonRatingItem$1$1", m7120f = "CommonRatingItem.kt", m7121i = {}, m7122l = {84}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes8.dex */
public final class CommonRatingItemKt$CommonRatingItem$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ float $imageSize;
    public final /* synthetic */ ImageModel $model;
    public final /* synthetic */ MutableState<Bitmap> $prizeImageBitmap$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonRatingItemKt$CommonRatingItem$1$1(ImageModel imageModel, Context context, float f, MutableState<Bitmap> mutableState, Continuation<? super CommonRatingItemKt$CommonRatingItem$1$1> continuation) {
        super(2, continuation);
        this.$model = imageModel;
        this.$context = context;
        this.$imageSize = f;
        this.$prizeImageBitmap$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CommonRatingItemKt$CommonRatingItem$1$1(this.$model, this.$context, this.$imageSize, this.$prizeImageBitmap$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CommonRatingItemKt$CommonRatingItem$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: CommonRatingItem.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.widget.block.rating.CommonRatingItemKt$CommonRatingItem$1$1$1", m7120f = "CommonRatingItem.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.widget.block.rating.CommonRatingItemKt$CommonRatingItem$1$1$1 */
    public static final class C63311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ float $imageSize;
        public final /* synthetic */ ImageModel $model;
        public final /* synthetic */ MutableState<Bitmap> $prizeImageBitmap$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C63311(ImageModel imageModel, Context context, float f, MutableState<Bitmap> mutableState, Continuation<? super C63311> continuation) {
            super(2, continuation);
            this.$model = imageModel;
            this.$context = context;
            this.$imageSize = f;
            this.$prizeImageBitmap$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C63311(this.$model, this.$context, this.$imageSize, this.$prizeImageBitmap$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C63311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Bitmap bitmapDrawableToBitmap;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.$model.getRender() != null) {
                GameRender gameRender = GameRender.getInstance();
                int type = this.$model.getRender().getType();
                int id = this.$model.getRender().getId();
                int modelId = this.$model.getRender().getModelId();
                int color = this.$model.getRender().getColor();
                int color2 = this.$model.getRender().getColor();
                float rotationX = this.$model.getRender().getRotationX();
                float rotationY = this.$model.getRender().getRotationY();
                float rotationZ = this.$model.getRender().getRotationZ();
                float zoom = this.$model.getRender().getZoom();
                final MutableState<Bitmap> mutableState = this.$prizeImageBitmap$delegate;
                gameRender.RequestRender(type, id, modelId, color, color2, rotationX, rotationY, rotationZ, zoom, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.ui.widget.block.rating.CommonRatingItemKt$CommonRatingItem$1$1$1$$ExternalSyntheticLambda0
                    @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
                    public final void OnRenderComplete(int i, Bitmap bitmap) {
                        CommonRatingItemKt.access$CommonRatingItem$lambda$2(mutableState, bitmap);
                    }
                });
            } else {
                MutableState<Bitmap> mutableState2 = this.$prizeImageBitmap$delegate;
                if (this.$model.getImageName().length() > 0) {
                    String imageName = this.$model.getImageName();
                    ImageTypePathInCDNEnum imageType = this.$model.getImageType();
                    Context context = this.$context;
                    float f = this.$imageSize;
                    bitmapDrawableToBitmap = BitmapUtilsKt.getBitmapFromZip(context, imageName, imageType, f, f);
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
            C63311 c63311 = new C63311(this.$model, this.$context, this.$imageSize, this.$prizeImageBitmap$delegate, null);
            this.label = 1;
            if (BuildersKt.withContext(io2, c63311, this) == coroutine_suspended) {
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
