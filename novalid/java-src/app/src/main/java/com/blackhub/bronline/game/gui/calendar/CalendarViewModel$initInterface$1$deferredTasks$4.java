package com.blackhub.bronline.game.gui.calendar;

import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.calendar.CalendarRewardsDto;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CalendarViewModel.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.calendar.CalendarViewModel$initInterface$1$deferredTasks$4", m7120f = "CalendarViewModel.kt", m7121i = {}, m7122l = {206}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes.dex */
public final class CalendarViewModel$initInterface$1$deferredTasks$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ List<CalendarRewardsDto> $bonusDaysRewards;
    public final /* synthetic */ Ref.ObjectRef<List<CommonRewardModel>> $bonusRewards;
    public final /* synthetic */ JSONObject $json;
    public final /* synthetic */ Ref.IntRef $lastOpenedBonusReward;
    public final /* synthetic */ List<BpRewardsAwardsDto> $listOfAwardsTypes;
    public final /* synthetic */ int $minLevel;
    public final /* synthetic */ List<SkinsDTO> $skinsList;
    public final /* synthetic */ List<VehiclesDTO> $vehiclesList;
    public Object L$0;
    public int label;
    public final /* synthetic */ CalendarViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarViewModel$initInterface$1$deferredTasks$4(Ref.ObjectRef<List<CommonRewardModel>> objectRef, CalendarViewModel calendarViewModel, int i, JSONObject jSONObject, List<CalendarRewardsDto> list, List<VehiclesDTO> list2, List<SkinsDTO> list3, List<BpRewardsAwardsDto> list4, Ref.IntRef intRef, Continuation<? super CalendarViewModel$initInterface$1$deferredTasks$4> continuation) {
        super(2, continuation);
        this.$bonusRewards = objectRef;
        this.this$0 = calendarViewModel;
        this.$minLevel = i;
        this.$json = jSONObject;
        this.$bonusDaysRewards = list;
        this.$vehiclesList = list2;
        this.$skinsList = list3;
        this.$listOfAwardsTypes = list4;
        this.$lastOpenedBonusReward = intRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CalendarViewModel$initInterface$1$deferredTasks$4(this.$bonusRewards, this.this$0, this.$minLevel, this.$json, this.$bonusDaysRewards, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes, this.$lastOpenedBonusReward, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CalendarViewModel$initInterface$1$deferredTasks$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Ref.ObjectRef<List<CommonRewardModel>> objectRef2 = this.$bonusRewards;
            CalendarViewModel calendarViewModel = this.this$0;
            int i2 = this.$minLevel;
            JSONArray jSONArrayOptJSONArray = this.$json.optJSONArray("bl");
            List<Integer> mutableIntList = jSONArrayOptJSONArray != null ? JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray) : null;
            if (mutableIntList == null) {
                mutableIntList = CollectionsKt__CollectionsKt.emptyList();
            }
            List<CalendarRewardsDto> list = this.$bonusDaysRewards;
            List<VehiclesDTO> list2 = this.$vehiclesList;
            List<SkinsDTO> list3 = this.$skinsList;
            List<BpRewardsAwardsDto> list4 = this.$listOfAwardsTypes;
            this.L$0 = objectRef2;
            this.label = 1;
            Object objConvertJsonArrayToRewards = calendarViewModel.convertJsonArrayToRewards(i2, false, mutableIntList, list, list2, list3, list4, this);
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
        this.$lastOpenedBonusReward.element = this.this$0.getLastScrollIndexAndFindLastOpenedReward(this.$bonusRewards.element, false);
        return Unit.INSTANCE;
    }
}
