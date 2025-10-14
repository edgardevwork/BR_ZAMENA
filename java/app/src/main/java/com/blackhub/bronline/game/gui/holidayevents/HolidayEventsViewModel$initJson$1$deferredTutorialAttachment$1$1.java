package com.blackhub.bronline.game.gui.holidayevents;

import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.tutorial.CommonTutorialTextsWithImage;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsTutorial;
import com.bless.client.R;
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

/* compiled from: HolidayEventsViewModel.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$initJson$1$deferredTutorialAttachment$1$1", m7120f = "HolidayEventsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes2.dex */
public final class HolidayEventsViewModel$initJson$1$deferredTutorialAttachment$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CommonTutorialTextsWithImage>, Object> {
    public final /* synthetic */ HolidayEventsTutorial $tutorialItem;
    public int label;
    public final /* synthetic */ HolidayEventsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolidayEventsViewModel$initJson$1$deferredTutorialAttachment$1$1(HolidayEventsViewModel holidayEventsViewModel, HolidayEventsTutorial holidayEventsTutorial, Continuation<? super HolidayEventsViewModel$initJson$1$deferredTutorialAttachment$1$1> continuation) {
        super(2, continuation);
        this.this$0 = holidayEventsViewModel;
        this.$tutorialItem = holidayEventsTutorial;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new HolidayEventsViewModel$initJson$1$deferredTutorialAttachment$1$1(this.this$0, this.$tutorialItem, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super CommonTutorialTextsWithImage> continuation) {
        return ((HolidayEventsViewModel$initJson$1$deferredTutorialAttachment$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new CommonTutorialTextsWithImage(BitmapUtilsKt.getBitmapFromZip$default(this.this$0.application, this.$tutorialItem.getImageName(), ImageTypePathInCDNEnum.IMAGE, 0.0f, 0.0f, 24, null), StringExtensionKt.htmlTextToAnnotatedString(this.$tutorialItem.getHeader()), StringExtensionKt.htmlTextToAnnotatedString(this.$tutorialItem.getDescription()), null, null, this.this$0.getStringResource().getString(R.string.cases_press_for_close), 24, null);
    }
}

