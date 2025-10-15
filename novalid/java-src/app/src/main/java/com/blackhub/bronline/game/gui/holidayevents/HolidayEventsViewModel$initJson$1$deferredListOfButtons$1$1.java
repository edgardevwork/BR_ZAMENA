package com.blackhub.bronline.game.gui.holidayevents;

import android.app.Application;
import android.graphics.Bitmap;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.main.CommonButtonCategory;
import com.blackhub.bronline.game.gui.holidayevents.enums.HolidayEventsScreenEnum;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HolidayEventsViewModel.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "Lcom/blackhub/bronline/game/core/utils/attachment/main/CommonButtonCategory;", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$initJson$1$deferredListOfButtons$1$1", m7120f = "HolidayEventsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes2.dex */
public final class HolidayEventsViewModel$initJson$1$deferredListOfButtons$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CommonButtonCategory>, Object> {
    public final /* synthetic */ Ref.ObjectRef<Bitmap> $dailyCategoryImageBitmap;
    public final /* synthetic */ int $index;
    public final /* synthetic */ Ref.BooleanRef $isHasUpdates;
    public final /* synthetic */ boolean $isNeedToShowNotificationOnTasks;
    public final /* synthetic */ Ref.ObjectRef<Bitmap> $myRatingBgImage;
    public final /* synthetic */ int $rewardLevel;
    public final /* synthetic */ HolidayEventsSettings $setting;
    public final /* synthetic */ Ref.ObjectRef<Bitmap> $specialCategoryImageBitmap;
    public final /* synthetic */ Ref.ObjectRef<Bitmap> $treeImage;
    public int label;
    public final /* synthetic */ HolidayEventsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolidayEventsViewModel$initJson$1$deferredListOfButtons$1$1(HolidayEventsSettings holidayEventsSettings, Ref.ObjectRef<Bitmap> objectRef, HolidayEventsViewModel holidayEventsViewModel, int i, Ref.ObjectRef<Bitmap> objectRef2, Ref.ObjectRef<Bitmap> objectRef3, Ref.BooleanRef booleanRef, boolean z, Ref.ObjectRef<Bitmap> objectRef4, int i2, Continuation<? super HolidayEventsViewModel$initJson$1$deferredListOfButtons$1$1> continuation) {
        super(2, continuation);
        this.$setting = holidayEventsSettings;
        this.$treeImage = objectRef;
        this.this$0 = holidayEventsViewModel;
        this.$rewardLevel = i;
        this.$specialCategoryImageBitmap = objectRef2;
        this.$dailyCategoryImageBitmap = objectRef3;
        this.$isHasUpdates = booleanRef;
        this.$isNeedToShowNotificationOnTasks = z;
        this.$myRatingBgImage = objectRef4;
        this.$index = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new HolidayEventsViewModel$initJson$1$deferredListOfButtons$1$1(this.$setting, this.$treeImage, this.this$0, this.$rewardLevel, this.$specialCategoryImageBitmap, this.$dailyCategoryImageBitmap, this.$isHasUpdates, this.$isNeedToShowNotificationOnTasks, this.$myRatingBgImage, this.$index, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super CommonButtonCategory> continuation) {
        return ((HolidayEventsViewModel$initJson$1$deferredListOfButtons$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r0v27, types: [T, android.graphics.Bitmap] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int id = this.$setting.getId();
        if (id != HolidayEventsScreenEnum.MAIN.getValue()) {
            if (id == HolidayEventsScreenEnum.TASKS.getValue()) {
                this.$specialCategoryImageBitmap.element = this.this$0.getCategoryImage(this.$setting.getObjectImages(), true);
                this.$dailyCategoryImageBitmap.element = this.this$0.getCategoryImage(this.$setting.getObjectImages(), false);
                this.$isHasUpdates.element = this.$isNeedToShowNotificationOnTasks;
            } else if (id == HolidayEventsScreenEnum.RATING.getValue()) {
                Ref.ObjectRef<Bitmap> objectRef = this.$myRatingBgImage;
                Application application = this.this$0.application;
                ImageTypePathInCDNEnum imageTypePathInCDNEnum = ImageTypePathInCDNEnum.BACKGROUND;
                String str = (String) CollectionsKt___CollectionsKt.firstOrNull((List) this.$setting.getObjectImages());
                if (str == null) {
                    str = "";
                }
                objectRef.element = BitmapUtilsKt.getBitmapFromZip$default(application, str, imageTypePathInCDNEnum, 0.0f, 0.0f, 24, null);
            }
        } else {
            this.$treeImage.element = this.this$0.getTreeImage(this.$setting.getObjectGrades(), this.$rewardLevel, (4 & 4) != 0 ? null : null, this.$setting.getObjectImages(), (4 & 16) != 0 ? null : this.this$0.getUiState().getValue().getTreeImage());
        }
        return new CommonButtonCategory(this.$setting.getId(), this.$setting.getName(), BitmapUtilsKt.getBitmapFromZip$default(this.this$0.application, this.$setting.getIcImage(), ImageTypePathInCDNEnum.ICON, 0.0f, 0.0f, 24, null), this.$index == 0, this.$isHasUpdates.element, this.$setting.getObjectGrades(), this.$setting.getObjectImages());
    }
}
