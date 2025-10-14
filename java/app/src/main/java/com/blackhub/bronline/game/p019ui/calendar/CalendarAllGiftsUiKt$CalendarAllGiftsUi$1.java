package com.blackhub.bronline.game.p019ui.calendar;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
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
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CalendarAllGiftsUi.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.calendar.CalendarAllGiftsUiKt$CalendarAllGiftsUi$1", m7120f = "CalendarAllGiftsUi.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes2.dex */
public final class CalendarAllGiftsUiKt$CalendarAllGiftsUi$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<Bitmap> $icSeasonCalendarBitmap$delegate;
    public final /* synthetic */ String $icSeasonCalendarBitmapName;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarAllGiftsUiKt$CalendarAllGiftsUi$1(Context context, String str, MutableState<Bitmap> mutableState, Continuation<? super CalendarAllGiftsUiKt$CalendarAllGiftsUi$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$icSeasonCalendarBitmapName = str;
        this.$icSeasonCalendarBitmap$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CalendarAllGiftsUiKt$CalendarAllGiftsUi$1(this.$context, this.$icSeasonCalendarBitmapName, this.$icSeasonCalendarBitmap$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CalendarAllGiftsUiKt$CalendarAllGiftsUi$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$icSeasonCalendarBitmap$delegate.setValue(BitmapUtilsKt.getSvgBitmapFromZipWithSize(this.$context, this.$icSeasonCalendarBitmapName, ImageTypePathInCDNEnum.ICON, 32.0f, 32.0f));
        return Unit.INSTANCE;
    }
}

