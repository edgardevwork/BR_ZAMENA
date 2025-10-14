package com.blackhub.bronline.game.gui.blackpass.viewmodel;

import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.gui.blackpass.data.RewardModel;
import com.blackhub.bronline.game.gui.blackpass.enums.VIPStateEnum;
import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassKeys;
import com.blackhub.bronline.game.model.remote.response.blackpass.LevelsInfo;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: BlackPassMainViewModel.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$initInterface$1$1$deferredTasks$8", m7120f = "BlackPassMainViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})

public final class BlackPassMainViewModel$initInterface$1$1$deferredTasks$8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ JSONObject $json;
    public final /* synthetic */ int $level;
    public final /* synthetic */ List<BpRewardsAwardsDto> $listOfAwardsTypes;
    public final /* synthetic */ Ref.ObjectRef<List<RewardModel>> $rewardsList;
    public final /* synthetic */ List<SkinsDTO> $skinsList;
    public final /* synthetic */ List<VehiclesDTO> $vehiclesList;
    public final /* synthetic */ VIPStateEnum $vipState;
    public int label;
    public final /* synthetic */ BlackPassMainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackPassMainViewModel$initInterface$1$1$deferredTasks$8(Ref.ObjectRef<List<RewardModel>> objectRef, BlackPassMainViewModel blackPassMainViewModel, VIPStateEnum vIPStateEnum, int i, JSONObject jSONObject, List<VehiclesDTO> list, List<SkinsDTO> list2, List<BpRewardsAwardsDto> list3, Continuation<? super BlackPassMainViewModel$initInterface$1$1$deferredTasks$8> continuation) {
        super(2, continuation);
        this.$rewardsList = objectRef;
        this.this$0 = blackPassMainViewModel;
        this.$vipState = vIPStateEnum;
        this.$level = i;
        this.$json = jSONObject;
        this.$vehiclesList = list;
        this.$skinsList = list2;
        this.$listOfAwardsTypes = list3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BlackPassMainViewModel$initInterface$1$1$deferredTasks$8(this.$rewardsList, this.this$0, this.$vipState, this.$level, this.$json, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BlackPassMainViewModel$initInterface$1$1$deferredTasks$8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Ref.ObjectRef<List<RewardModel>> objectRef = this.$rewardsList;
        BlackPassMainViewModel blackPassMainViewModel = this.this$0;
        ArrayList<LevelsInfo> standardLevelArray = blackPassMainViewModel.get_uiState().getValue().getStandardLevelArray();
        if (standardLevelArray == null) {
            standardLevelArray = new ArrayList<>();
        }
        ArrayList<LevelsInfo> premiumLevelArray = this.this$0.get_uiState().getValue().getPremiumLevelArray();
        if (premiumLevelArray == null) {
            premiumLevelArray = new ArrayList<>();
        }
        objectRef.element = blackPassMainViewModel.mapRewardsListFromJson(standardLevelArray, premiumLevelArray, VIPStateEnum.INSTANCE.isWithVip(this.$vipState.getType()), this.$level, IntExtensionKt.isOne(Boxing.boxInt(this.$json.optInt(BlackPassKeys.IS_IS_REWARD_STANDART))), IntExtensionKt.isOne(Boxing.boxInt(this.$json.optInt("ps"))), this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes);
        return Unit.INSTANCE;
    }
}

