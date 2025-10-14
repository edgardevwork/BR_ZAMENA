package com.blackhub.bronline.game.gui.blackpassbanner.viewmodel;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.BaseModel;
import com.blackhub.bronline.game.core.utils.attachment.ImageModel;
import com.blackhub.bronline.game.gui.blackpassbanner.BlackPassBannerUiState;
import com.blackhub.bronline.game.gui.blackpassbanner.network.BlackPassBannerActionsWithJson;
import com.blackhub.bronline.game.model.remote.response.blackpass.BlackPassProperties;
import com.blackhub.bronline.game.model.remote.response.blackpass.LevelsInfo;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassBannerViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nBlackPassBannerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassBannerViewModel.kt\ncom/blackhub/bronline/game/gui/blackpassbanner/viewmodel/BlackPassBannerViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n1549#2:126\n1620#2,3:127\n*S KotlinDebug\n*F\n+ 1 BlackPassBannerViewModel.kt\ncom/blackhub/bronline/game/gui/blackpassbanner/viewmodel/BlackPassBannerViewModel\n*L\n105#1:126\n105#1:127,3\n*E\n"})
/* loaded from: classes.dex */
public final class BlackPassBannerViewModel extends BaseViewModel<BlackPassBannerUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<BlackPassBannerUiState> _uiState;

    @NotNull
    public final BlackPassBannerActionsWithJson actionsWithJson;

    @NotNull
    public final Application application;

    @Inject
    public BlackPassBannerViewModel(@NotNull BlackPassBannerActionsWithJson actionsWithJson, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(actionsWithJson, "actionsWithJson");
        Intrinsics.checkNotNullParameter(application, "application");
        this.actionsWithJson = actionsWithJson;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new BlackPassBannerUiState(null, null, null, null, 0, null, false, 127, null));
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<BlackPassBannerUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<BlackPassBannerUiState> getUiState() {
        return FlowKt.asStateFlow(get_uiState());
    }

    /* compiled from: BlackPassBannerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpassbanner.viewmodel.BlackPassBannerViewModel$initRewardsAndProperties$1", m7120f = "BlackPassBannerViewModel.kt", m7121i = {1, 2, 2}, m7122l = {50, 58, 66}, m7123m = "invokeSuspend", m7124n = {"bgImage", "bgImage", "leftImage"}, m7125s = {"L$0", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nBlackPassBannerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassBannerViewModel.kt\ncom/blackhub/bronline/game/gui/blackpassbanner/viewmodel/BlackPassBannerViewModel$initRewardsAndProperties$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,125:1\n230#2,5:126\n*S KotlinDebug\n*F\n+ 1 BlackPassBannerViewModel.kt\ncom/blackhub/bronline/game/gui/blackpassbanner/viewmodel/BlackPassBannerViewModel$initRewardsAndProperties$1\n*L\n76#1:126,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.blackpassbanner.viewmodel.BlackPassBannerViewModel$initRewardsAndProperties$1 */
    /* loaded from: classes2.dex */
    public static final class C37501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<LevelsInfo> $deluxeRewards;
        public final /* synthetic */ List<BpRewardsAwardsDto> $listOfAwardsTypes;
        public final /* synthetic */ BlackPassProperties $properties;
        public final /* synthetic */ List<SkinsDTO> $skinsList;
        public final /* synthetic */ List<VehiclesDTO> $vehiclesList;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37501(BlackPassProperties blackPassProperties, List<LevelsInfo> list, List<VehiclesDTO> list2, List<SkinsDTO> list3, List<BpRewardsAwardsDto> list4, Continuation<? super C37501> continuation) {
            super(2, continuation);
            this.$properties = blackPassProperties;
            this.$deluxeRewards = list;
            this.$vehiclesList = list2;
            this.$skinsList = list3;
            this.$listOfAwardsTypes = list4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlackPassBannerViewModel.this.new C37501(this.$properties, this.$deluxeRewards, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00e8 A[LOOP:0: B:27:0x00b0->B:37:0x00e8, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00e5 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objAwait;
            Bitmap bitmap;
            Object objAwait2;
            Object objAwait3;
            Bitmap bitmap2;
            Bitmap bitmap3;
            int color;
            List listMapDeluxeRewardsToRenderAttachment;
            MutableStateFlow<BlackPassBannerUiState> mutableStateFlow;
            BlackPassProperties blackPassProperties;
            BlackPassBannerUiState value;
            BlackPassBannerUiState blackPassBannerUiState;
            String seasonName;
            MutableStateFlow<BlackPassBannerUiState> mutableStateFlow2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            String str = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BlackPassBannerViewModel blackPassBannerViewModel = BlackPassBannerViewModel.this;
                Deferred deferredAsyncOnIO$default = ViewModelExtensionKt.asyncOnIO$default(blackPassBannerViewModel, null, new BlackPassBannerViewModel$initRewardsAndProperties$1$bgImage$1(blackPassBannerViewModel, this.$properties, null), 1, null);
                this.label = 1;
                objAwait = deferredAsyncOnIO$default.await(this);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                objAwait = obj;
            } else if (i == 2) {
                bitmap = (Bitmap) this.L$0;
                ResultKt.throwOnFailure(obj);
                objAwait2 = obj;
                Bitmap bitmap4 = (Bitmap) objAwait2;
                BlackPassBannerViewModel blackPassBannerViewModel2 = BlackPassBannerViewModel.this;
                Deferred deferredAsyncOnIO$default2 = ViewModelExtensionKt.asyncOnIO$default(blackPassBannerViewModel2, null, new BlackPassBannerViewModel$initRewardsAndProperties$1$rightImage$1(blackPassBannerViewModel2, this.$properties, null), 1, null);
                this.L$0 = bitmap;
                this.L$1 = bitmap4;
                this.label = 3;
                objAwait3 = deferredAsyncOnIO$default2.await(this);
                if (objAwait3 != coroutine_suspended) {
                    return coroutine_suspended;
                }
                bitmap2 = bitmap4;
                bitmap3 = (Bitmap) objAwait3;
                BlackPassProperties blackPassProperties2 = this.$properties;
                color = Color.parseColor(blackPassProperties2 == null ? blackPassProperties2.getSeasonColor() : null);
                listMapDeluxeRewardsToRenderAttachment = BlackPassBannerViewModel.this.mapDeluxeRewardsToRenderAttachment(this.$deluxeRewards, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes);
                mutableStateFlow = BlackPassBannerViewModel.this.get_uiState();
                blackPassProperties = this.$properties;
                while (true) {
                    value = mutableStateFlow.getValue();
                    blackPassBannerUiState = value;
                    if (blackPassProperties == null) {
                    }
                    if (seasonName == null) {
                    }
                    BlackPassProperties blackPassProperties3 = blackPassProperties;
                    mutableStateFlow2 = mutableStateFlow;
                    if (!mutableStateFlow2.compareAndSet(value, BlackPassBannerUiState.copy$default(blackPassBannerUiState, seasonName, bitmap, bitmap3, bitmap2, color, listMapDeluxeRewardsToRenderAttachment, false, 64, null))) {
                    }
                    mutableStateFlow = mutableStateFlow2;
                    blackPassProperties = blackPassProperties3;
                    str = null;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bitmap2 = (Bitmap) this.L$1;
                bitmap = (Bitmap) this.L$0;
                ResultKt.throwOnFailure(obj);
                objAwait3 = obj;
                bitmap3 = (Bitmap) objAwait3;
                BlackPassProperties blackPassProperties22 = this.$properties;
                color = Color.parseColor(blackPassProperties22 == null ? blackPassProperties22.getSeasonColor() : null);
                listMapDeluxeRewardsToRenderAttachment = BlackPassBannerViewModel.this.mapDeluxeRewardsToRenderAttachment(this.$deluxeRewards, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes);
                mutableStateFlow = BlackPassBannerViewModel.this.get_uiState();
                blackPassProperties = this.$properties;
                while (true) {
                    value = mutableStateFlow.getValue();
                    blackPassBannerUiState = value;
                    seasonName = blackPassProperties == null ? blackPassProperties.getSeasonName() : str;
                    if (seasonName == null) {
                        seasonName = "";
                    }
                    BlackPassProperties blackPassProperties32 = blackPassProperties;
                    mutableStateFlow2 = mutableStateFlow;
                    if (!mutableStateFlow2.compareAndSet(value, BlackPassBannerUiState.copy$default(blackPassBannerUiState, seasonName, bitmap, bitmap3, bitmap2, color, listMapDeluxeRewardsToRenderAttachment, false, 64, null))) {
                        return Unit.INSTANCE;
                    }
                    mutableStateFlow = mutableStateFlow2;
                    blackPassProperties = blackPassProperties32;
                    str = null;
                }
            }
            bitmap = (Bitmap) objAwait;
            BlackPassBannerViewModel blackPassBannerViewModel3 = BlackPassBannerViewModel.this;
            Deferred deferredAsyncOnIO$default3 = ViewModelExtensionKt.asyncOnIO$default(blackPassBannerViewModel3, null, new BlackPassBannerViewModel$initRewardsAndProperties$1$leftImage$1(blackPassBannerViewModel3, this.$properties, null), 1, null);
            this.L$0 = bitmap;
            this.label = 2;
            objAwait2 = deferredAsyncOnIO$default3.await(this);
            if (objAwait2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            Bitmap bitmap42 = (Bitmap) objAwait2;
            BlackPassBannerViewModel blackPassBannerViewModel22 = BlackPassBannerViewModel.this;
            Deferred deferredAsyncOnIO$default22 = ViewModelExtensionKt.asyncOnIO$default(blackPassBannerViewModel22, null, new BlackPassBannerViewModel$initRewardsAndProperties$1$rightImage$1(blackPassBannerViewModel22, this.$properties, null), 1, null);
            this.L$0 = bitmap;
            this.L$1 = bitmap42;
            this.label = 3;
            objAwait3 = deferredAsyncOnIO$default22.await(this);
            if (objAwait3 != coroutine_suspended) {
            }
        }
    }

    public final void initRewardsAndProperties(@NotNull List<LevelsInfo> deluxeRewards, @Nullable BlackPassProperties properties, @NotNull List<VehiclesDTO> vehiclesList, @NotNull List<SkinsDTO> skinsList, @NotNull List<BpRewardsAwardsDto> listOfAwardsTypes) {
        Intrinsics.checkNotNullParameter(deluxeRewards, "deluxeRewards");
        Intrinsics.checkNotNullParameter(vehiclesList, "vehiclesList");
        Intrinsics.checkNotNullParameter(skinsList, "skinsList");
        Intrinsics.checkNotNullParameter(listOfAwardsTypes, "listOfAwardsTypes");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37501(properties, deluxeRewards, vehiclesList, skinsList, listOfAwardsTypes, null), 3, null);
    }

    /* compiled from: BlackPassBannerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpassbanner.viewmodel.BlackPassBannerViewModel$sendButtonClicked$1", m7120f = "BlackPassBannerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nBlackPassBannerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassBannerViewModel.kt\ncom/blackhub/bronline/game/gui/blackpassbanner/viewmodel/BlackPassBannerViewModel$sendButtonClicked$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,125:1\n230#2,5:126\n*S KotlinDebug\n*F\n+ 1 BlackPassBannerViewModel.kt\ncom/blackhub/bronline/game/gui/blackpassbanner/viewmodel/BlackPassBannerViewModel$sendButtonClicked$1\n*L\n93#1:126,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.blackpassbanner.viewmodel.BlackPassBannerViewModel$sendButtonClicked$1 */
    /* loaded from: classes2.dex */
    public static final class C37511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $action;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37511(int i, Continuation<? super C37511> continuation) {
            super(2, continuation);
            this.$action = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlackPassBannerViewModel.this.new C37511(this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            BlackPassBannerUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BlackPassBannerViewModel.this.actionsWithJson.clickOnButton(this.$action);
                MutableStateFlow<BlackPassBannerUiState> mutableStateFlow = BlackPassBannerViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, BlackPassBannerUiState.copy$default(value, null, null, null, null, 0, null, true, 63, null)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendButtonClicked(int action) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37511(action, null), 1, null);
    }

    public final List<ImageModel> mapDeluxeRewardsToRenderAttachment(List<LevelsInfo> deluxeRewards, List<VehiclesDTO> vehiclesList, List<SkinsDTO> skinsList, List<BpRewardsAwardsDto> listOfAwardsTypes) {
        ArrayList arrayList;
        if (deluxeRewards != null) {
            List<LevelsInfo> list = deluxeRewards;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (LevelsInfo levelsInfo : list) {
                arrayList.add(UtilsKt.setImageModel(new BaseModel(levelsInfo.getId(), levelsInfo.getTypeId(), levelsInfo.getAwardId(), levelsInfo.getRenderId(), levelsInfo.getName(), levelsInfo.getNameStore()), vehiclesList, skinsList, listOfAwardsTypes));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
    }
}

