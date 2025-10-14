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
@DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.calendar.CalendarViewModel$initInterface$1$deferredTasks$5", m7120f = "CalendarViewModel.kt", m7121i = {}, m7122l = {224}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes.dex */
public final class CalendarViewModel$initInterface$1$deferredTasks$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ List<CalendarRewardsDto> $comeBackBonusDaysRewards;
    public final /* synthetic */ Ref.ObjectRef<List<CommonRewardModel>> $comeBackBonusRewards;
    public final /* synthetic */ JSONObject $json;
    public final /* synthetic */ Ref.IntRef $lastOpenedComeBackBonusReward;
    public final /* synthetic */ List<BpRewardsAwardsDto> $listOfAwardsTypes;
    public final /* synthetic */ int $minLevel;
    public final /* synthetic */ List<SkinsDTO> $skinsList;
    public final /* synthetic */ List<VehiclesDTO> $vehiclesList;
    public Object L$0;
    public int label;
    public final /* synthetic */ CalendarViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarViewModel$initInterface$1$deferredTasks$5(Ref.ObjectRef<List<CommonRewardModel>> objectRef, JSONObject jSONObject, Ref.IntRef intRef, CalendarViewModel calendarViewModel, int i, List<CalendarRewardsDto> list, List<VehiclesDTO> list2, List<SkinsDTO> list3, List<BpRewardsAwardsDto> list4, Continuation<? super CalendarViewModel$initInterface$1$deferredTasks$5> continuation) {
        super(2, continuation);
        this.$comeBackBonusRewards = objectRef;
        this.$json = jSONObject;
        this.$lastOpenedComeBackBonusReward = intRef;
        this.this$0 = calendarViewModel;
        this.$minLevel = i;
        this.$comeBackBonusDaysRewards = list;
        this.$vehiclesList = list2;
        this.$skinsList = list3;
        this.$listOfAwardsTypes = list4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CalendarViewModel$initInterface$1$deferredTasks$5(this.$comeBackBonusRewards, this.$json, this.$lastOpenedComeBackBonusReward, this.this$0, this.$minLevel, this.$comeBackBonusDaysRewards, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CalendarViewModel$initInterface$1$deferredTasks$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [T] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Ref.ObjectRef<List<CommonRewardModel>> objectRef;
        ?? EmptyList;
        List<Integer> mutableIntList;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef<List<CommonRewardModel>> objectRef2 = this.$comeBackBonusRewards;
            JSONArray jSONArrayOptJSONArray = this.$json.optJSONArray(CalendarKeys.COME_BACK_STATUS_BONUS_REWARDS_KEY);
            if (jSONArrayOptJSONArray == null || (mutableIntList = JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray)) == null) {
                objectRef = objectRef2;
                EmptyList = 0;
                if (EmptyList == 0) {
                    EmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                objectRef.element = EmptyList;
                this.$lastOpenedComeBackBonusReward.element = this.this$0.getLastScrollIndexAndFindLastOpenedReward(this.$comeBackBonusRewards.element, false);
                return Unit.INSTANCE;
            }
            CalendarViewModel calendarViewModel = this.this$0;
            int i2 = this.$minLevel;
            List<CalendarRewardsDto> list = this.$comeBackBonusDaysRewards;
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
            obj = objConvertJsonArrayToRewards;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        EmptyList = (List) obj;
        if (EmptyList == 0) {
        }
        objectRef.element = EmptyList;
        this.$lastOpenedComeBackBonusReward.element = this.this$0.getLastScrollIndexAndFindLastOpenedReward(this.$comeBackBonusRewards.element, false);
        return Unit.INSTANCE;
    }
}

