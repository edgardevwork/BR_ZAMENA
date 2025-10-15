package com.blackhub.bronline.game.p019ui.calendar;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import org.apache.commons.compress.compressors.bzip2.BZip2Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CalendarMainUi.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt$CalendarMainUi$1", m7120f = "CalendarMainUi.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes2.dex */
public final class CalendarMainUiKt$CalendarMainUi$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Bitmap> $bgComeBackEventBitmap$delegate;
    public final /* synthetic */ String $bgComeBackSeasonCalendarBitmapName;
    public final /* synthetic */ MutableState<Bitmap> $bgOfEventBitmap$delegate;
    public final /* synthetic */ String $bgSeasonCalendarBitmapName;
    public final /* synthetic */ LazyListState $bonusScrollState;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<Bitmap> $icComeBackSeasonCalendarBitmap$delegate;
    public final /* synthetic */ String $icComeBackSeasonCalendarBitmapName;
    public final /* synthetic */ MutableState<Bitmap> $icSeasonCalendarBitmap$delegate;
    public final /* synthetic */ String $icSeasonCalendarBitmapName;
    public final /* synthetic */ boolean $isNeedToShowComebackButton;
    public final /* synthetic */ MutableState<Boolean> $isStartTimer$delegate;
    public final /* synthetic */ int $lastOpenedBonusReward;
    public final /* synthetic */ int $lastOpenedMainReward;
    public final /* synthetic */ LazyListState $mainScrollState;
    public final /* synthetic */ MutableIntState $secondsNewDay$delegate;
    public final /* synthetic */ MutableIntState $secondsReward$delegate;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarMainUiKt$CalendarMainUi$1(boolean z, LazyListState lazyListState, int i, LazyListState lazyListState2, int i2, MutableState<Boolean> mutableState, MutableIntState mutableIntState, MutableIntState mutableIntState2, Context context, String str, MutableState<Bitmap> mutableState2, String str2, MutableState<Bitmap> mutableState3, String str3, MutableState<Bitmap> mutableState4, String str4, MutableState<Bitmap> mutableState5, Continuation<? super CalendarMainUiKt$CalendarMainUi$1> continuation) {
        super(2, continuation);
        this.$isNeedToShowComebackButton = z;
        this.$mainScrollState = lazyListState;
        this.$lastOpenedMainReward = i;
        this.$bonusScrollState = lazyListState2;
        this.$lastOpenedBonusReward = i2;
        this.$isStartTimer$delegate = mutableState;
        this.$secondsNewDay$delegate = mutableIntState;
        this.$secondsReward$delegate = mutableIntState2;
        this.$context = context;
        this.$bgSeasonCalendarBitmapName = str;
        this.$bgOfEventBitmap$delegate = mutableState2;
        this.$icSeasonCalendarBitmapName = str2;
        this.$icSeasonCalendarBitmap$delegate = mutableState3;
        this.$bgComeBackSeasonCalendarBitmapName = str3;
        this.$bgComeBackEventBitmap$delegate = mutableState4;
        this.$icComeBackSeasonCalendarBitmapName = str4;
        this.$icComeBackSeasonCalendarBitmap$delegate = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        CalendarMainUiKt$CalendarMainUi$1 calendarMainUiKt$CalendarMainUi$1 = new CalendarMainUiKt$CalendarMainUi$1(this.$isNeedToShowComebackButton, this.$mainScrollState, this.$lastOpenedMainReward, this.$bonusScrollState, this.$lastOpenedBonusReward, this.$isStartTimer$delegate, this.$secondsNewDay$delegate, this.$secondsReward$delegate, this.$context, this.$bgSeasonCalendarBitmapName, this.$bgOfEventBitmap$delegate, this.$icSeasonCalendarBitmapName, this.$icSeasonCalendarBitmap$delegate, this.$bgComeBackSeasonCalendarBitmapName, this.$bgComeBackEventBitmap$delegate, this.$icComeBackSeasonCalendarBitmapName, this.$icComeBackSeasonCalendarBitmap$delegate, continuation);
        calendarMainUiKt$CalendarMainUi$1.L$0 = obj;
        return calendarMainUiKt$CalendarMainUi$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CalendarMainUiKt$CalendarMainUi$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: CalendarMainUi.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt$CalendarMainUi$1$1", m7120f = "CalendarMainUi.kt", m7121i = {}, m7122l = {254, 255, BZip2Constants.MAX_ALPHA_SIZE}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt$CalendarMainUi$1$1 */
    public static final class C50821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ LazyListState $bonusScrollState;
        public final /* synthetic */ MutableState<Boolean> $isStartTimer$delegate;
        public final /* synthetic */ int $lastOpenedBonusReward;
        public final /* synthetic */ int $lastOpenedMainReward;
        public final /* synthetic */ LazyListState $mainScrollState;
        public final /* synthetic */ MutableIntState $secondsNewDay$delegate;
        public final /* synthetic */ MutableIntState $secondsReward$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C50821(LazyListState lazyListState, int i, LazyListState lazyListState2, int i2, MutableState<Boolean> mutableState, MutableIntState mutableIntState, MutableIntState mutableIntState2, Continuation<? super C50821> continuation) {
            super(2, continuation);
            this.$mainScrollState = lazyListState;
            this.$lastOpenedMainReward = i;
            this.$bonusScrollState = lazyListState2;
            this.$lastOpenedBonusReward = i2;
            this.$isStartTimer$delegate = mutableState;
            this.$secondsNewDay$delegate = mutableIntState;
            this.$secondsReward$delegate = mutableIntState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C50821(this.$mainScrollState, this.$lastOpenedMainReward, this.$bonusScrollState, this.$lastOpenedBonusReward, this.$isStartTimer$delegate, this.$secondsNewDay$delegate, this.$secondsReward$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C50821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005a -> B:23:0x005d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LazyListState lazyListState = this.$mainScrollState;
                int i2 = this.$lastOpenedMainReward;
                this.label = 1;
                if (LazyListState.animateScrollToItem$default(lazyListState, i2, 0, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                if (!CalendarMainUiKt.CalendarMainUi_DgHyVOg$lambda$1(this.$isStartTimer$delegate)) {
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MutableIntState mutableIntState = this.$secondsNewDay$delegate;
                mutableIntState.setIntValue(mutableIntState.getIntValue() - 1);
                MutableIntState mutableIntState2 = this.$secondsReward$delegate;
                mutableIntState2.setIntValue(mutableIntState2.getIntValue() - 1);
                if (this.$secondsNewDay$delegate.getIntValue() <= 0) {
                    this.$secondsNewDay$delegate.setIntValue(0);
                }
                if (this.$secondsReward$delegate.getIntValue() <= 0) {
                    this.$secondsReward$delegate.setIntValue(0);
                }
                if (IntExtensionKt.isZero(Boxing.boxInt(this.$secondsNewDay$delegate.getIntValue())) && IntExtensionKt.isZero(Boxing.boxInt(this.$secondsReward$delegate.getIntValue()))) {
                    CalendarMainUiKt.CalendarMainUi_DgHyVOg$lambda$2(this.$isStartTimer$delegate, false);
                }
                if (!CalendarMainUiKt.CalendarMainUi_DgHyVOg$lambda$1(this.$isStartTimer$delegate)) {
                    this.label = 3;
                    if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    MutableIntState mutableIntState3 = this.$secondsNewDay$delegate;
                    mutableIntState3.setIntValue(mutableIntState3.getIntValue() - 1);
                    MutableIntState mutableIntState22 = this.$secondsReward$delegate;
                    mutableIntState22.setIntValue(mutableIntState22.getIntValue() - 1);
                    if (this.$secondsNewDay$delegate.getIntValue() <= 0) {
                    }
                    if (this.$secondsReward$delegate.getIntValue() <= 0) {
                    }
                    if (IntExtensionKt.isZero(Boxing.boxInt(this.$secondsNewDay$delegate.getIntValue()))) {
                        CalendarMainUiKt.CalendarMainUi_DgHyVOg$lambda$2(this.$isStartTimer$delegate, false);
                    }
                    if (!CalendarMainUiKt.CalendarMainUi_DgHyVOg$lambda$1(this.$isStartTimer$delegate)) {
                        return Unit.INSTANCE;
                    }
                }
            }
            LazyListState lazyListState2 = this.$bonusScrollState;
            int i3 = this.$lastOpenedBonusReward;
            this.label = 2;
            if (LazyListState.animateScrollToItem$default(lazyListState2, i3, 0, this, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!CalendarMainUiKt.CalendarMainUi_DgHyVOg$lambda$1(this.$isStartTimer$delegate)) {
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C50821(this.$mainScrollState, this.$lastOpenedMainReward, this.$bonusScrollState, this.$lastOpenedBonusReward, this.$isStartTimer$delegate, this.$secondsNewDay$delegate, this.$secondsReward$delegate, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new C50832(this.$context, this.$bgSeasonCalendarBitmapName, this.$bgOfEventBitmap$delegate, null), 2, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new C50843(this.$context, this.$icSeasonCalendarBitmapName, this.$icSeasonCalendarBitmap$delegate, null), 2, null);
            if (this.$isNeedToShowComebackButton) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new C50854(this.$context, this.$bgComeBackSeasonCalendarBitmapName, this.$bgComeBackEventBitmap$delegate, null), 2, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new C50865(this.$context, this.$icComeBackSeasonCalendarBitmapName, this.$icComeBackSeasonCalendarBitmap$delegate, null), 2, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* compiled from: CalendarMainUi.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt$CalendarMainUi$1$2", m7120f = "CalendarMainUi.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt$CalendarMainUi$1$2 */
    public static final class C50832 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MutableState<Bitmap> $bgOfEventBitmap$delegate;
        public final /* synthetic */ String $bgSeasonCalendarBitmapName;
        public final /* synthetic */ Context $context;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C50832(Context context, String str, MutableState<Bitmap> mutableState, Continuation<? super C50832> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$bgSeasonCalendarBitmapName = str;
            this.$bgOfEventBitmap$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C50832(this.$context, this.$bgSeasonCalendarBitmapName, this.$bgOfEventBitmap$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C50832) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$bgOfEventBitmap$delegate.setValue(BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$bgSeasonCalendarBitmapName, ImageTypePathInCDNEnum.BACKGROUND, 0.0f, 0.0f, 24, null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CalendarMainUi.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt$CalendarMainUi$1$3", m7120f = "CalendarMainUi.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt$CalendarMainUi$1$3 */
    public static final class C50843 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ MutableState<Bitmap> $icSeasonCalendarBitmap$delegate;
        public final /* synthetic */ String $icSeasonCalendarBitmapName;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C50843(Context context, String str, MutableState<Bitmap> mutableState, Continuation<? super C50843> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$icSeasonCalendarBitmapName = str;
            this.$icSeasonCalendarBitmap$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C50843(this.$context, this.$icSeasonCalendarBitmapName, this.$icSeasonCalendarBitmap$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C50843) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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

    /* compiled from: CalendarMainUi.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt$CalendarMainUi$1$4", m7120f = "CalendarMainUi.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt$CalendarMainUi$1$4 */
    public static final class C50854 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MutableState<Bitmap> $bgComeBackEventBitmap$delegate;
        public final /* synthetic */ String $bgComeBackSeasonCalendarBitmapName;
        public final /* synthetic */ Context $context;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C50854(Context context, String str, MutableState<Bitmap> mutableState, Continuation<? super C50854> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$bgComeBackSeasonCalendarBitmapName = str;
            this.$bgComeBackEventBitmap$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C50854(this.$context, this.$bgComeBackSeasonCalendarBitmapName, this.$bgComeBackEventBitmap$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C50854) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$bgComeBackEventBitmap$delegate.setValue(BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$bgComeBackSeasonCalendarBitmapName, ImageTypePathInCDNEnum.BACKGROUND, 0.0f, 0.0f, 24, null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CalendarMainUi.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt$CalendarMainUi$1$5", m7120f = "CalendarMainUi.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt$CalendarMainUi$1$5 */
    public static final class C50865 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ MutableState<Bitmap> $icComeBackSeasonCalendarBitmap$delegate;
        public final /* synthetic */ String $icComeBackSeasonCalendarBitmapName;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C50865(Context context, String str, MutableState<Bitmap> mutableState, Continuation<? super C50865> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$icComeBackSeasonCalendarBitmapName = str;
            this.$icComeBackSeasonCalendarBitmap$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C50865(this.$context, this.$icComeBackSeasonCalendarBitmapName, this.$icComeBackSeasonCalendarBitmap$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C50865) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$icComeBackSeasonCalendarBitmap$delegate.setValue(BitmapUtilsKt.getBitmapFromZip(this.$context, this.$icComeBackSeasonCalendarBitmapName, ImageTypePathInCDNEnum.ICON, 32.0f, 32.0f));
            return Unit.INSTANCE;
        }
    }
}
