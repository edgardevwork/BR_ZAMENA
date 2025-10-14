package com.blackhub.bronline.game.gui.calendar;

import androidx.media3.extractor.p007ts.TsExtractor;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.calendar.CalendarRewardsDto;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import java.util.List;
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

/* compiled from: CalendarViewModel.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.calendar.CalendarViewModel$initInterface$1$deferredTasks$2", m7120f = "CalendarViewModel.kt", m7121i = {}, m7122l = {TsExtractor.TS_STREAM_TYPE_AC4}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes.dex */
public final class CalendarViewModel$initInterface$1$deferredTasks$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Ref.IntRef $lastOpenedMainReward;
    public final /* synthetic */ List<BpRewardsAwardsDto> $listOfAwardsTypes;
    public final /* synthetic */ List<CalendarRewardsDto> $mainDaysRewards;
    public final /* synthetic */ Ref.ObjectRef<List<CommonRewardModel>> $mainRewards;
    public final /* synthetic */ List<Integer> $mainRewardsStatus;
    public final /* synthetic */ int $minLevel;
    public final /* synthetic */ List<SkinsDTO> $skinsList;
    public final /* synthetic */ List<VehiclesDTO> $vehiclesList;
    public Object L$0;
    public int label;
    public final /* synthetic */ CalendarViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarViewModel$initInterface$1$deferredTasks$2(Ref.ObjectRef<List<CommonRewardModel>> objectRef, CalendarViewModel calendarViewModel, int i, List<Integer> list, List<CalendarRewardsDto> list2, List<VehiclesDTO> list3, List<SkinsDTO> list4, List<BpRewardsAwardsDto> list5, Ref.IntRef intRef, Continuation<? super CalendarViewModel$initInterface$1$deferredTasks$2> continuation) {
        super(2, continuation);
        this.$mainRewards = objectRef;
        this.this$0 = calendarViewModel;
        this.$minLevel = i;
        this.$mainRewardsStatus = list;
        this.$mainDaysRewards = list2;
        this.$vehiclesList = list3;
        this.$skinsList = list4;
        this.$listOfAwardsTypes = list5;
        this.$lastOpenedMainReward = intRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CalendarViewModel$initInterface$1$deferredTasks$2(this.$mainRewards, this.this$0, this.$minLevel, this.$mainRewardsStatus, this.$mainDaysRewards, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes, this.$lastOpenedMainReward, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CalendarViewModel$initInterface$1$deferredTasks$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Ref.ObjectRef<List<CommonRewardModel>> objectRef;
        T t;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef<List<CommonRewardModel>> objectRef2 = this.$mainRewards;
            CalendarViewModel calendarViewModel = this.this$0;
            int i2 = this.$minLevel;
            List<Integer> list = this.$mainRewardsStatus;
            List<CalendarRewardsDto> list2 = this.$mainDaysRewards;
            List<VehiclesDTO> list3 = this.$vehiclesList;
            List<SkinsDTO> list4 = this.$skinsList;
            List<BpRewardsAwardsDto> list5 = this.$listOfAwardsTypes;
            this.L$0 = objectRef2;
            this.label = 1;
            Object objConvertJsonArrayToRewards = calendarViewModel.convertJsonArrayToRewards(i2, true, list, list2, list3, list4, list5, this);
            if (objConvertJsonArrayToRewards == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
            t = objConvertJsonArrayToRewards;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.L$0;
            ResultKt.throwOnFailure(obj);
            t = obj;
        }
        objectRef.element = t;
        this.$lastOpenedMainReward.element = this.this$0.getLastScrollIndexAndFindLastOpenedReward(this.$mainRewards.element, true);
        return Unit.INSTANCE;
    }
}
