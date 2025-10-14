package com.blackhub.bronline.game.gui.blackpass.viewmodel;

import android.app.Application;
import android.graphics.Bitmap;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.model.remote.response.blackpass.BlackPassProperties;
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
@DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$initInterface$1$1$deferredTasks$1", m7120f = "BlackPassMainViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})

public final class BlackPassMainViewModel$initInterface$1$1$deferredTasks$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ BlackPassProperties $properties;
    public final /* synthetic */ Ref.ObjectRef<Bitmap> $seasonBitmapImage;
    public int label;
    public final /* synthetic */ BlackPassMainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackPassMainViewModel$initInterface$1$1$deferredTasks$1(Ref.ObjectRef<Bitmap> objectRef, BlackPassMainViewModel blackPassMainViewModel, BlackPassProperties blackPassProperties, Continuation<? super BlackPassMainViewModel$initInterface$1$1$deferredTasks$1> continuation) {
        super(2, continuation);
        this.$seasonBitmapImage = objectRef;
        this.this$0 = blackPassMainViewModel;
        this.$properties = blackPassProperties;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BlackPassMainViewModel$initInterface$1$1$deferredTasks$1(this.$seasonBitmapImage, this.this$0, this.$properties, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BlackPassMainViewModel$initInterface$1$1$deferredTasks$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Ref.ObjectRef<Bitmap> objectRef = this.$seasonBitmapImage;
        Bitmap seasonBitmapImage = this.this$0.getUiState().getValue().getSeasonBitmapImage();
        T bitmapFromZip$default = seasonBitmapImage;
        if (seasonBitmapImage == null) {
            Application application = this.this$0.application;
            String bpSeasonIcon = this.$properties.getBpSeasonIcon();
            if (bpSeasonIcon == null) {
                bpSeasonIcon = "";
            }
            bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(application, bpSeasonIcon, ImageTypePathInCDNEnum.ICON, 0.0f, 0.0f, 24, null);
        }
        objectRef.element = bitmapFromZip$default;
        return Unit.INSTANCE;
    }
}

