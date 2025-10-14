package com.blackhub.bronline.game.gui.blackpassbanner.viewmodel;

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
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassBannerViewModel.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpassbanner.viewmodel.BlackPassBannerViewModel$initRewardsAndProperties$1$bgImage$1", m7120f = "BlackPassBannerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes2.dex */
public final class BlackPassBannerViewModel$initRewardsAndProperties$1$bgImage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
    public final /* synthetic */ BlackPassProperties $properties;
    public int label;
    public final /* synthetic */ BlackPassBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackPassBannerViewModel$initRewardsAndProperties$1$bgImage$1(BlackPassBannerViewModel blackPassBannerViewModel, BlackPassProperties blackPassProperties, Continuation<? super BlackPassBannerViewModel$initRewardsAndProperties$1$bgImage$1> continuation) {
        super(2, continuation);
        this.this$0 = blackPassBannerViewModel;
        this.$properties = blackPassProperties;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BlackPassBannerViewModel$initRewardsAndProperties$1$bgImage$1(this.this$0, this.$properties, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Bitmap> continuation) {
        return ((BlackPassBannerViewModel$initRewardsAndProperties$1$bgImage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Application application = this.this$0.application;
            BlackPassProperties blackPassProperties = this.$properties;
            String bgImage = blackPassProperties != null ? blackPassProperties.getBgImage() : null;
            if (bgImage == null) {
                bgImage = "";
            }
            return BitmapUtilsKt.getBitmapFromZip$default(application, bgImage, ImageTypePathInCDNEnum.BACKGROUND, 0.0f, 0.0f, 24, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

