package com.blackhub.bronline.game.gui.blackpass.viewmodel;

import android.graphics.Bitmap;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassMainViewModel.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$initInterface$1$1$deferredTasks$4", m7120f = "BlackPassMainViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})

public final class BlackPassMainViewModel$initInterface$1$1$deferredTasks$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Ref.ObjectRef<Bitmap> $premiumBitmapImage;
    public int label;
    public final /* synthetic */ BlackPassMainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackPassMainViewModel$initInterface$1$1$deferredTasks$4(Ref.ObjectRef<Bitmap> objectRef, BlackPassMainViewModel blackPassMainViewModel, Continuation<? super BlackPassMainViewModel$initInterface$1$1$deferredTasks$4> continuation) {
        super(2, continuation);
        this.$premiumBitmapImage = objectRef;
        this.this$0 = blackPassMainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BlackPassMainViewModel$initInterface$1$1$deferredTasks$4(this.$premiumBitmapImage, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BlackPassMainViewModel$initInterface$1$1$deferredTasks$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Ref.ObjectRef<Bitmap> objectRef = this.$premiumBitmapImage;
        Bitmap premiumBitmapImage = this.this$0.getUiState().getValue().getPremiumBitmapImage();
        T bitmapFromZip$default = premiumBitmapImage;
        if (premiumBitmapImage == null) {
            bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(this.this$0.application, "img_bp_premium.png", ImageTypePathInCDNEnum.IMAGE, 0.0f, 0.0f, 24, null);
        }
        objectRef.element = bitmapFromZip$default;
        return Unit.INSTANCE;
    }
}

