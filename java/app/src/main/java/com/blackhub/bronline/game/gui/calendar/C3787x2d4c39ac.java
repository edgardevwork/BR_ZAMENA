package com.blackhub.bronline.game.gui.calendar;

import com.blackhub.bronline.game.core.utils.attachment.ImageModel;
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
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CalendarViewModel.kt */
@DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.calendar.CalendarViewModel$convertJsonArrayToRewards$finalRewards$1$deferredImageModel$1", m7120f = "CalendarViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* renamed from: com.blackhub.bronline.game.gui.calendar.CalendarViewModel$convertJsonArrayToRewards$finalRewards$1$deferredImageModel$1 */
/* loaded from: classes.dex */
public final class C3787x2d4c39ac extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ImageModel>, Object> {
    public final /* synthetic */ List<BpRewardsAwardsDto> $listOfAwardsTypes;
    public final /* synthetic */ CalendarRewardsDto $reward;
    public final /* synthetic */ List<SkinsDTO> $skinsList;
    public final /* synthetic */ List<VehiclesDTO> $vehiclesList;
    public int label;
    public final /* synthetic */ CalendarViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3787x2d4c39ac(CalendarViewModel calendarViewModel, CalendarRewardsDto calendarRewardsDto, List<VehiclesDTO> list, List<SkinsDTO> list2, List<BpRewardsAwardsDto> list3, Continuation<? super C3787x2d4c39ac> continuation) {
        super(2, continuation);
        this.this$0 = calendarViewModel;
        this.$reward = calendarRewardsDto;
        this.$vehiclesList = list;
        this.$skinsList = list2;
        this.$listOfAwardsTypes = list3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C3787x2d4c39ac(this.this$0, this.$reward, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ImageModel> continuation) {
        return ((C3787x2d4c39ac) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return this.this$0.setImageModel(this.$reward, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

