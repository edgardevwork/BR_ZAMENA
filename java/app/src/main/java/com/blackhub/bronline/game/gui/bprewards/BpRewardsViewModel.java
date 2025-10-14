package com.blackhub.bronline.game.gui.bprewards;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.FloatExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.BitmapResource;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsFilterStateEnum;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsImageModel;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsLists;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsServerItemModel;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsText;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonItemCategoryFilter;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import com.blackhub.bronline.game.p019ui.bprewards.BpRewardsFilterButtonImageItem;
import com.bless.client.R;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BpRewardsViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nBpRewardsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 4 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,736:1\n230#2,5:737\n230#2,5:742\n230#2,5:775\n51#3,5:747\n56#3,11:761\n8#4,9:752\n1855#5,2:772\n1549#5:780\n1620#5,3:781\n819#5:784\n847#5,2:785\n1#6:774\n*S KotlinDebug\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel\n*L\n401#1:737,5\n419#1:742,5\n643#1:775,5\n447#1:747,5\n447#1:761,11\n447#1:752,9\n451#1:772,2\n658#1:780\n658#1:781,3\n684#1:784\n684#1:785,2\n*E\n"})
/* loaded from: classes.dex */
public final class BpRewardsViewModel extends BaseViewModel<BpRewardsUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<BpRewardsUiState> _uiState;

    @NotNull
    public final BpRewardsActionWithJSON actionWithJSON;

    @NotNull
    public final Application application;

    @NotNull
    public final BitmapResource bitmapResource;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<BpRewardsUiState> uiState;

    /* compiled from: BpRewardsViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel", m7120f = "BpRewardsViewModel.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m7122l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE, 614}, m7123m = "parseJsonAndGetListOfItems", m7124n = {"this", "json", "listOfAwardsTypes", "invItemsFromJson", "vehiclesList", "skinsList", "listOfItems", "listOfImageModels", "sizeOfImage", "isUpdateList", "this", "json", "listOfAwardsTypes", "invItemsFromJson", "vehiclesList", "skinsList", "listOfItems", "sizeOfImage", "isUpdateList"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "Z$0"})
    /* renamed from: com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$parseJsonAndGetListOfItems$1 */
    public static final class C37581 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C37581(Continuation<? super C37581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BpRewardsViewModel.this.parseJsonAndGetListOfItems(null, null, null, null, null, 0, false, this);
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public BpRewardsViewModel(@NotNull BpRewardsActionWithJSON actionWithJSON, @NotNull StringResource stringResource, @NotNull LocalNotification localNotification, @NotNull Application application, @NotNull BitmapResource bitmapResource) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(bitmapResource, "bitmapResource");
        this.actionWithJSON = actionWithJSON;
        this.stringResource = stringResource;
        this.localNotification = localNotification;
        this.application = application;
        this.bitmapResource = bitmapResource;
        this._uiState = StateFlowKt.MutableStateFlow(new BpRewardsUiState(false, null, null, null, null, null, null, 0, false, false, null, 0, null, null, 0, false, false, false, false, false, 1048575, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<BpRewardsUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<BpRewardsUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: BpRewardsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$initJson$1", m7120f = "BpRewardsViewModel.kt", m7121i = {}, m7122l = {214}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nBpRewardsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$initJson$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,736:1\n1559#2:737\n1590#2,4:738\n230#3,5:742\n*S KotlinDebug\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$initJson$1\n*L\n158#1:737\n158#1:738,4\n203#1:742,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$initJson$1 */
    /* loaded from: classes2.dex */
    public static final class C37531 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<InvItems> $invItemsFromJson;
        public final /* synthetic */ JSONObject $json;
        public final /* synthetic */ List<BpRewardsAwardsDto> $listOfAwardsTypes;
        public final /* synthetic */ List<CraftJsonItemCategoryFilter> $marketDeliveryFilters;
        public final /* synthetic */ int $sizeOfImage;
        public final /* synthetic */ List<SkinsDTO> $skinsList;
        public final /* synthetic */ List<VehiclesDTO> $vehiclesList;
        public int label;
        public final /* synthetic */ BpRewardsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37531(JSONObject jSONObject, BpRewardsViewModel bpRewardsViewModel, List<CraftJsonItemCategoryFilter> list, List<BpRewardsAwardsDto> list2, List<InvItems> list3, List<VehiclesDTO> list4, List<SkinsDTO> list5, int i, Continuation<? super C37531> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = bpRewardsViewModel;
            this.$marketDeliveryFilters = list;
            this.$listOfAwardsTypes = list2;
            this.$invItemsFromJson = list3;
            this.$vehiclesList = list4;
            this.$skinsList = list5;
            this.$sizeOfImage = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C37531(this.$json, this.this$0, this.$marketDeliveryFilters, this.$listOfAwardsTypes, this.$invItemsFromJson, this.$vehiclesList, this.$skinsList, this.$sizeOfImage, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            List listListOf;
            List list;
            List list2;
            BpRewardsUiState value;
            BpRewardsUiState bpRewardsUiState;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                boolean zIsZero = IntExtensionKt.isZero(Boxing.boxInt(this.$json.optInt("t")));
                BpRewardsText bpRewardsText = new BpRewardsText(this.this$0.getTitleText(zIsZero), this.this$0.getTutorialOpenCasesText());
                Bitmap bitmap = this.this$0.bitmapResource.getBitmap(R.drawable.ic_refresh);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (zIsZero) {
                    int filterState = BpRewardsFilterStateEnum.ALL.getFilterState();
                    Bitmap bitmap2 = this.this$0.bitmapResource.getBitmap(R.drawable.ic_all);
                    Color.Companion companion = Color.INSTANCE;
                    listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new BpRewardsFilterButtonImageItem[]{new BpRewardsFilterButtonImageItem(filterState, bitmap2, companion.m11377getWhite0d7_KjU(), null), new BpRewardsFilterButtonImageItem(BpRewardsFilterStateEnum.SKINS.getFilterState(), this.this$0.bitmapResource.getBitmap(R.drawable.ic_skins), companion.m11377getWhite0d7_KjU(), null), new BpRewardsFilterButtonImageItem(BpRewardsFilterStateEnum.VIP.getFilterState(), this.this$0.bitmapResource.getBitmap(R.drawable.ic_vip), companion.m11377getWhite0d7_KjU(), null), new BpRewardsFilterButtonImageItem(BpRewardsFilterStateEnum.ACCESSORISES.getFilterState(), this.this$0.bitmapResource.getBitmap(R.drawable.ic_acces), companion.m11377getWhite0d7_KjU(), null), new BpRewardsFilterButtonImageItem(BpRewardsFilterStateEnum.CARS.getFilterState(), this.this$0.bitmapResource.getBitmap(R.drawable.ic_auto), companion.m11377getWhite0d7_KjU(), null), new BpRewardsFilterButtonImageItem(BpRewardsFilterStateEnum.CURRENCIES.getFilterState(), this.this$0.bitmapResource.getBitmap(R.drawable.ic_currency), companion.m11377getWhite0d7_KjU(), null), new BpRewardsFilterButtonImageItem(BpRewardsFilterStateEnum.OTHER.getFilterState(), this.this$0.bitmapResource.getBitmap(R.drawable.ic_else), companion.m11377getWhite0d7_KjU(), null)});
                } else {
                    List<CraftJsonItemCategoryFilter> list3 = this.$marketDeliveryFilters;
                    BpRewardsViewModel bpRewardsViewModel = this.this$0;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    int i2 = 0;
                    for (Object obj2 : list3) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        CraftJsonItemCategoryFilter craftJsonItemCategoryFilter = (CraftJsonItemCategoryFilter) obj2;
                        int filterId = craftJsonItemCategoryFilter.getFilterId();
                        String iconCDN = craftJsonItemCategoryFilter.getIconCDN();
                        Bitmap bitmapFromZip$default = iconCDN != null ? BitmapUtilsKt.getBitmapFromZip$default(bpRewardsViewModel.application, iconCDN, ImageTypePathInCDNEnum.ICON, 0.0f, 0.0f, 24, null) : null;
                        if (i2 % 2 != 0) {
                            arrayList.add(craftJsonItemCategoryFilter.getFilterName());
                        } else {
                            arrayList2.add(craftJsonItemCategoryFilter.getFilterName());
                        }
                        arrayList3.add(new BpRewardsFilterButtonImageItem(filterId, bitmapFromZip$default, ColorKt.Color(android.graphics.Color.parseColor(craftJsonItemCategoryFilter.getColor())), null));
                        i2 = i3;
                    }
                    listListOf = arrayList3;
                }
                if (zIsZero) {
                    list = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{this.this$0.getStringResource().getString(R.string.bp_rewards_tutorial_btn_skins), this.this$0.getStringResource().getString(R.string.common_accessories), this.this$0.getStringResource().getString(R.string.bp_rewards_tutorial_btn_currency)});
                } else {
                    list = CollectionsKt___CollectionsKt.toList(arrayList);
                }
                if (zIsZero) {
                    list2 = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{this.this$0.getStringResource().getString(R.string.bp_rewards_tutorial_btn_all), this.this$0.getStringResource().getString(R.string.bp_rewards_tutorial_btn_vip), this.this$0.getStringResource().getString(R.string.common_transport), this.this$0.getStringResource().getString(R.string.bp_rewards_tutorial_btn_else)});
                } else {
                    list2 = CollectionsKt___CollectionsKt.toList(arrayList2);
                }
                MutableStateFlow<BpRewardsUiState> mutableStateFlow = this.this$0.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    bpRewardsUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, bpRewardsUiState.copy((1048452 & 1) != 0 ? bpRewardsUiState.isBpRewardsScreen : zIsZero, (1048452 & 2) != 0 ? bpRewardsUiState.annotatedText : bpRewardsText, (1048452 & 4) != 0 ? bpRewardsUiState.bpRewardsLists : null, (1048452 & 8) != 0 ? bpRewardsUiState.imagesForFilterList : listListOf, (1048452 & 16) != 0 ? bpRewardsUiState.topHintList : list, (1048452 & 32) != 0 ? bpRewardsUiState.bottomHintList : list2, (1048452 & 64) != 0 ? bpRewardsUiState.refreshButtonBitmap : bitmap, (1048452 & 128) != 0 ? bpRewardsUiState.sizeOfImage : 0, (1048452 & 256) != 0 ? bpRewardsUiState.isNeedToShowDialog : false, (1048452 & 512) != 0 ? bpRewardsUiState.isSprayForDialog : false, (1048452 & 1024) != 0 ? bpRewardsUiState.rewardNameForDialog : null, (1048452 & 2048) != 0 ? bpRewardsUiState.idForDialog : 0, (1048452 & 4096) != 0 ? bpRewardsUiState.sprayPriceForDialog : null, (1048452 & 8192) != 0 ? bpRewardsUiState.sprayTextForDialog : null, (1048452 & 16384) != 0 ? bpRewardsUiState.filterState : 0, (1048452 & 32768) != 0 ? bpRewardsUiState.isHasTanpin : false, (1048452 & 65536) != 0 ? bpRewardsUiState.isTutorialEnabled : false, (1048452 & 131072) != 0 ? bpRewardsUiState.isButtonFilterBlocked : false, (1048452 & 262144) != 0 ? bpRewardsUiState.isScreenBlocked : false, (1048452 & 524288) != 0 ? bpRewardsUiState.isNeedClose : false)));
                BpRewardsViewModel bpRewardsViewModel2 = this.this$0;
                JSONObject jSONObject = this.$json;
                List<BpRewardsAwardsDto> list4 = this.$listOfAwardsTypes;
                List<InvItems> list5 = this.$invItemsFromJson;
                List<VehiclesDTO> list6 = this.$vehiclesList;
                List<SkinsDTO> list7 = this.$skinsList;
                int i4 = this.$sizeOfImage;
                this.label = 1;
                if (BpRewardsViewModel.parseJsonAndGetListOfItems$default(bpRewardsViewModel2, jSONObject, list4, list5, list6, list7, i4, false, this, 64, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void initJson(@NotNull JSONObject json, @NotNull List<BpRewardsAwardsDto> listOfAwardsTypes, @NotNull List<InvItems> invItemsFromJson, @NotNull List<VehiclesDTO> vehiclesList, @NotNull List<SkinsDTO> skinsList, int sizeOfImage, @NotNull List<CraftJsonItemCategoryFilter> marketDeliveryFilters) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(listOfAwardsTypes, "listOfAwardsTypes");
        Intrinsics.checkNotNullParameter(invItemsFromJson, "invItemsFromJson");
        Intrinsics.checkNotNullParameter(vehiclesList, "vehiclesList");
        Intrinsics.checkNotNullParameter(skinsList, "skinsList");
        Intrinsics.checkNotNullParameter(marketDeliveryFilters, "marketDeliveryFilters");
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37531(json, this, marketDeliveryFilters, listOfAwardsTypes, invItemsFromJson, vehiclesList, skinsList, sizeOfImage, null), 1, null);
    }

    /* compiled from: BpRewardsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$updateJson$1", m7120f = "BpRewardsViewModel.kt", m7121i = {}, m7122l = {229, 253}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nBpRewardsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$updateJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,736:1\n230#2,5:737\n*S KotlinDebug\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$updateJson$1\n*L\n247#1:737,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$updateJson$1 */
    public static final class C37631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ BpRewardsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37631(JSONObject jSONObject, BpRewardsViewModel bpRewardsViewModel, Continuation<? super C37631> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = bpRewardsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C37631(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            BpRewardsUiState value;
            BpRewardsUiState bpRewardsUiState;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int iOptInt = this.$json.optInt("t");
                if (iOptInt == 1) {
                    int sizeOfImage = this.this$0.get_uiState().getValue().getSizeOfImage();
                    List<InvItems> invItemsFromJson = this.this$0.get_uiState().getValue().getBpRewardsLists().getInvItemsFromJson();
                    List<BpRewardsAwardsDto> listOfAwardsTypes = this.this$0.get_uiState().getValue().getBpRewardsLists().getListOfAwardsTypes();
                    List<VehiclesDTO> vehiclesList = this.this$0.get_uiState().getValue().getBpRewardsLists().getVehiclesList();
                    List<SkinsDTO> skinsList = this.this$0.get_uiState().getValue().getBpRewardsLists().getSkinsList();
                    BpRewardsViewModel bpRewardsViewModel = this.this$0;
                    JSONObject jSONObject = this.$json;
                    this.label = 1;
                    if (BpRewardsViewModel.parseJsonAndGetListOfItems$default(bpRewardsViewModel, jSONObject, listOfAwardsTypes, invItemsFromJson, vehiclesList, skinsList, sizeOfImage, false, this, 64, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (iOptInt == 2) {
                    List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.this$0.get_uiState().getValue().getBpRewardsLists().getListWithItems());
                    if (this.$json.optInt("s") == -1) {
                        BpRewardsLists bpRewardsListsCopy$default = BpRewardsLists.copy$default(this.this$0.get_uiState().getValue().getBpRewardsLists(), null, this.this$0.fillListUntilNine(mutableList), null, null, null, null, null, 125, null);
                        MutableStateFlow<BpRewardsUiState> mutableStateFlow = this.this$0.get_uiState();
                        do {
                            value = mutableStateFlow.getValue();
                            bpRewardsUiState = value;
                        } while (!mutableStateFlow.compareAndSet(value, bpRewardsUiState.copy((1048452 & 1) != 0 ? bpRewardsUiState.isBpRewardsScreen : false, (1048452 & 2) != 0 ? bpRewardsUiState.annotatedText : null, (1048452 & 4) != 0 ? bpRewardsUiState.bpRewardsLists : bpRewardsListsCopy$default, (1048452 & 8) != 0 ? bpRewardsUiState.imagesForFilterList : null, (1048452 & 16) != 0 ? bpRewardsUiState.topHintList : null, (1048452 & 32) != 0 ? bpRewardsUiState.bottomHintList : null, (1048452 & 64) != 0 ? bpRewardsUiState.refreshButtonBitmap : null, (1048452 & 128) != 0 ? bpRewardsUiState.sizeOfImage : 0, (1048452 & 256) != 0 ? bpRewardsUiState.isNeedToShowDialog : false, (1048452 & 512) != 0 ? bpRewardsUiState.isSprayForDialog : false, (1048452 & 1024) != 0 ? bpRewardsUiState.rewardNameForDialog : null, (1048452 & 2048) != 0 ? bpRewardsUiState.idForDialog : 0, (1048452 & 4096) != 0 ? bpRewardsUiState.sprayPriceForDialog : null, (1048452 & 8192) != 0 ? bpRewardsUiState.sprayTextForDialog : null, (1048452 & 16384) != 0 ? bpRewardsUiState.filterState : 0, (1048452 & 32768) != 0 ? bpRewardsUiState.isHasTanpin : false, (1048452 & 65536) != 0 ? bpRewardsUiState.isTutorialEnabled : false, (1048452 & 131072) != 0 ? bpRewardsUiState.isButtonFilterBlocked : false, (1048452 & 262144) != 0 ? bpRewardsUiState.isScreenBlocked : false, (1048452 & 524288) != 0 ? bpRewardsUiState.isNeedClose : false)));
                    } else {
                        BpRewardsViewModel bpRewardsViewModel2 = this.this$0;
                        JSONObject jSONObject2 = this.$json;
                        this.label = 2;
                        if (BpRewardsViewModel.parseJsonAndGetListOfItems$default(bpRewardsViewModel2, jSONObject2, null, null, null, null, 0, true, this, 62, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (iOptInt == 4) {
                    BpRewardsViewModel bpRewardsViewModel3 = this.this$0;
                    ViewModelExtensionKt.launchOnIO$default(bpRewardsViewModel3, null, new AnonymousClass2(this.$json, bpRewardsViewModel3, null), 1, null);
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: BpRewardsViewModel.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$updateJson$1$2", m7120f = "BpRewardsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        @SourceDebugExtension({"SMAP\nBpRewardsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$updateJson$1$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,736:1\n230#2,5:737\n230#2,5:742\n230#2,5:747\n*S KotlinDebug\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$updateJson$1$2\n*L\n277#1:737,5\n287#1:742,5\n299#1:747,5\n*E\n"})
        /* renamed from: com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$updateJson$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ JSONObject $json;
            public int label;
            public final /* synthetic */ BpRewardsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(JSONObject jSONObject, BpRewardsViewModel bpRewardsViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$json = jSONObject;
                this.this$0 = bpRewardsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.$json, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                BpRewardsUiState value;
                BpRewardsUiState bpRewardsUiState;
                BpRewardsUiState value2;
                BpRewardsUiState bpRewardsUiState2;
                BpRewardsUiState value3;
                BpRewardsUiState bpRewardsUiState3;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int iOptInt = this.$json.optInt("s");
                List alarmsForFilterButtons = this.this$0.parseAlarmsForFilterButtons(this.$json);
                if (iOptInt == 1 || iOptInt == 3) {
                    List listRemoveItemFromList = this.this$0.removeItemFromList(this.$json.optInt("id"));
                    if (listRemoveItemFromList.size() < 12) {
                        this.this$0.actionWithJSON.sendRequestForNewItemsIfLessTwelve();
                        BpRewardsLists bpRewardsListsCopy$default = BpRewardsLists.copy$default(this.this$0.get_uiState().getValue().getBpRewardsLists(), null, listRemoveItemFromList, null, null, alarmsForFilterButtons, null, null, 109, null);
                        MutableStateFlow<BpRewardsUiState> mutableStateFlow = this.this$0.get_uiState();
                        do {
                            value2 = mutableStateFlow.getValue();
                            bpRewardsUiState2 = value2;
                        } while (!mutableStateFlow.compareAndSet(value2, bpRewardsUiState2.copy((1048452 & 1) != 0 ? bpRewardsUiState2.isBpRewardsScreen : false, (1048452 & 2) != 0 ? bpRewardsUiState2.annotatedText : null, (1048452 & 4) != 0 ? bpRewardsUiState2.bpRewardsLists : bpRewardsListsCopy$default, (1048452 & 8) != 0 ? bpRewardsUiState2.imagesForFilterList : null, (1048452 & 16) != 0 ? bpRewardsUiState2.topHintList : null, (1048452 & 32) != 0 ? bpRewardsUiState2.bottomHintList : null, (1048452 & 64) != 0 ? bpRewardsUiState2.refreshButtonBitmap : null, (1048452 & 128) != 0 ? bpRewardsUiState2.sizeOfImage : 0, (1048452 & 256) != 0 ? bpRewardsUiState2.isNeedToShowDialog : false, (1048452 & 512) != 0 ? bpRewardsUiState2.isSprayForDialog : false, (1048452 & 1024) != 0 ? bpRewardsUiState2.rewardNameForDialog : null, (1048452 & 2048) != 0 ? bpRewardsUiState2.idForDialog : 0, (1048452 & 4096) != 0 ? bpRewardsUiState2.sprayPriceForDialog : null, (1048452 & 8192) != 0 ? bpRewardsUiState2.sprayTextForDialog : null, (1048452 & 16384) != 0 ? bpRewardsUiState2.filterState : 0, (1048452 & 32768) != 0 ? bpRewardsUiState2.isHasTanpin : false, (1048452 & 65536) != 0 ? bpRewardsUiState2.isTutorialEnabled : false, (1048452 & 131072) != 0 ? bpRewardsUiState2.isButtonFilterBlocked : false, (1048452 & 262144) != 0 ? bpRewardsUiState2.isScreenBlocked : false, (1048452 & 524288) != 0 ? bpRewardsUiState2.isNeedClose : false)));
                    } else {
                        BpRewardsLists bpRewardsListsCopy$default2 = BpRewardsLists.copy$default(this.this$0.get_uiState().getValue().getBpRewardsLists(), null, listRemoveItemFromList, null, null, alarmsForFilterButtons, null, null, 109, null);
                        MutableStateFlow<BpRewardsUiState> mutableStateFlow2 = this.this$0.get_uiState();
                        do {
                            value = mutableStateFlow2.getValue();
                            bpRewardsUiState = value;
                        } while (!mutableStateFlow2.compareAndSet(value, bpRewardsUiState.copy((1048452 & 1) != 0 ? bpRewardsUiState.isBpRewardsScreen : false, (1048452 & 2) != 0 ? bpRewardsUiState.annotatedText : null, (1048452 & 4) != 0 ? bpRewardsUiState.bpRewardsLists : bpRewardsListsCopy$default2, (1048452 & 8) != 0 ? bpRewardsUiState.imagesForFilterList : null, (1048452 & 16) != 0 ? bpRewardsUiState.topHintList : null, (1048452 & 32) != 0 ? bpRewardsUiState.bottomHintList : null, (1048452 & 64) != 0 ? bpRewardsUiState.refreshButtonBitmap : null, (1048452 & 128) != 0 ? bpRewardsUiState.sizeOfImage : 0, (1048452 & 256) != 0 ? bpRewardsUiState.isNeedToShowDialog : false, (1048452 & 512) != 0 ? bpRewardsUiState.isSprayForDialog : false, (1048452 & 1024) != 0 ? bpRewardsUiState.rewardNameForDialog : null, (1048452 & 2048) != 0 ? bpRewardsUiState.idForDialog : 0, (1048452 & 4096) != 0 ? bpRewardsUiState.sprayPriceForDialog : null, (1048452 & 8192) != 0 ? bpRewardsUiState.sprayTextForDialog : null, (1048452 & 16384) != 0 ? bpRewardsUiState.filterState : 0, (1048452 & 32768) != 0 ? bpRewardsUiState.isHasTanpin : false, (1048452 & 65536) != 0 ? bpRewardsUiState.isTutorialEnabled : false, (1048452 & 131072) != 0 ? bpRewardsUiState.isButtonFilterBlocked : false, (1048452 & 262144) != 0 ? bpRewardsUiState.isScreenBlocked : false, (1048452 & 524288) != 0 ? bpRewardsUiState.isNeedClose : false)));
                    }
                } else {
                    BpRewardsLists bpRewardsListsCopy$default3 = BpRewardsLists.copy$default(this.this$0.get_uiState().getValue().getBpRewardsLists(), null, null, null, null, alarmsForFilterButtons, null, null, 111, null);
                    MutableStateFlow<BpRewardsUiState> mutableStateFlow3 = this.this$0.get_uiState();
                    do {
                        value3 = mutableStateFlow3.getValue();
                        bpRewardsUiState3 = value3;
                    } while (!mutableStateFlow3.compareAndSet(value3, bpRewardsUiState3.copy((1048452 & 1) != 0 ? bpRewardsUiState3.isBpRewardsScreen : false, (1048452 & 2) != 0 ? bpRewardsUiState3.annotatedText : null, (1048452 & 4) != 0 ? bpRewardsUiState3.bpRewardsLists : bpRewardsListsCopy$default3, (1048452 & 8) != 0 ? bpRewardsUiState3.imagesForFilterList : null, (1048452 & 16) != 0 ? bpRewardsUiState3.topHintList : null, (1048452 & 32) != 0 ? bpRewardsUiState3.bottomHintList : null, (1048452 & 64) != 0 ? bpRewardsUiState3.refreshButtonBitmap : null, (1048452 & 128) != 0 ? bpRewardsUiState3.sizeOfImage : 0, (1048452 & 256) != 0 ? bpRewardsUiState3.isNeedToShowDialog : false, (1048452 & 512) != 0 ? bpRewardsUiState3.isSprayForDialog : false, (1048452 & 1024) != 0 ? bpRewardsUiState3.rewardNameForDialog : null, (1048452 & 2048) != 0 ? bpRewardsUiState3.idForDialog : 0, (1048452 & 4096) != 0 ? bpRewardsUiState3.sprayPriceForDialog : null, (1048452 & 8192) != 0 ? bpRewardsUiState3.sprayTextForDialog : null, (1048452 & 16384) != 0 ? bpRewardsUiState3.filterState : 0, (1048452 & 32768) != 0 ? bpRewardsUiState3.isHasTanpin : false, (1048452 & 65536) != 0 ? bpRewardsUiState3.isTutorialEnabled : false, (1048452 & 131072) != 0 ? bpRewardsUiState3.isButtonFilterBlocked : false, (1048452 & 262144) != 0 ? bpRewardsUiState3.isScreenBlocked : false, (1048452 & 524288) != 0 ? bpRewardsUiState3.isNeedClose : false)));
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final void updateJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C37631(json, this, null), 1, null);
    }

    /* compiled from: BpRewardsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$onItemClick$1", m7120f = "BpRewardsViewModel.kt", m7121i = {0, 0}, m7122l = {327}, m7123m = "invokeSuspend", m7124n = {"rewardNameForDialog", "newListWithItems"}, m7125s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nBpRewardsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$onItemClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,736:1\n230#2,5:737\n230#2,5:742\n*S KotlinDebug\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$onItemClick$1\n*L\n335#1:737,5\n348#1:742,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$onItemClick$1 */
    /* loaded from: classes2.dex */
    public static final class C37551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $id;
        public final /* synthetic */ String $itemNameForDialog;
        public final /* synthetic */ Integer $sprayPriceForDialog;
        public final /* synthetic */ int $typeOfClickedButton;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ BpRewardsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37551(String str, int i, BpRewardsViewModel bpRewardsViewModel, int i2, Integer num, Continuation<? super C37551> continuation) {
            super(2, continuation);
            this.$itemNameForDialog = str;
            this.$typeOfClickedButton = i;
            this.this$0 = bpRewardsViewModel;
            this.$id = i2;
            this.$sprayPriceForDialog = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C37551(this.$itemNameForDialog, this.$typeOfClickedButton, this.this$0, this.$id, this.$sprayPriceForDialog, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            String str;
            List list;
            BpRewardsUiState value;
            BpRewardsUiState bpRewardsUiState;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str2 = this.$itemNameForDialog;
                String string = str2 != null ? this.this$0.getStringResource().getString(R.string.bp_rewards_dialog_item_name_question_mark, str2) : null;
                if (this.$typeOfClickedButton == 2) {
                    BpRewardsViewModel bpRewardsViewModel = this.this$0;
                    List listRemoveAlarmFromItem = bpRewardsViewModel.removeAlarmFromItem(this.$id, CollectionsKt___CollectionsKt.toMutableList((Collection) bpRewardsViewModel.get_uiState().getValue().getBpRewardsLists().getListWithItems()));
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$id, this.$typeOfClickedButton, null);
                    this.L$0 = string;
                    this.L$1 = listRemoveAlarmFromItem;
                    this.label = 1;
                    if (ViewModelExtensionKt.doOnIO$default(null, anonymousClass1, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = string;
                    list = listRemoveAlarmFromItem;
                } else {
                    AnnotatedString annotatedStringHtmlTextToAnnotatedString = this.$sprayPriceForDialog != null ? StringExtensionKt.htmlTextToAnnotatedString(this.this$0.getStringResource().getString(R.string.bp_rewards_u_will_have_n_spray, this.$sprayPriceForDialog)) : null;
                    MutableStateFlow<BpRewardsUiState> mutableStateFlow = this.this$0.get_uiState();
                    int i2 = this.$typeOfClickedButton;
                    int i3 = this.$id;
                    while (true) {
                        BpRewardsUiState value2 = mutableStateFlow.getValue();
                        BpRewardsUiState bpRewardsUiState2 = value2;
                        int i4 = i3;
                        int i5 = i2;
                        if (mutableStateFlow.compareAndSet(value2, bpRewardsUiState2.copy((1048452 & 1) != 0 ? bpRewardsUiState2.isBpRewardsScreen : false, (1048452 & 2) != 0 ? bpRewardsUiState2.annotatedText : null, (1048452 & 4) != 0 ? bpRewardsUiState2.bpRewardsLists : null, (1048452 & 8) != 0 ? bpRewardsUiState2.imagesForFilterList : null, (1048452 & 16) != 0 ? bpRewardsUiState2.topHintList : null, (1048452 & 32) != 0 ? bpRewardsUiState2.bottomHintList : null, (1048452 & 64) != 0 ? bpRewardsUiState2.refreshButtonBitmap : null, (1048452 & 128) != 0 ? bpRewardsUiState2.sizeOfImage : 0, (1048452 & 256) != 0 ? bpRewardsUiState2.isNeedToShowDialog : true, (1048452 & 512) != 0 ? bpRewardsUiState2.isSprayForDialog : i2 == 3 ? z : false, (1048452 & 1024) != 0 ? bpRewardsUiState2.rewardNameForDialog : string, (1048452 & 2048) != 0 ? bpRewardsUiState2.idForDialog : i4, (1048452 & 4096) != 0 ? bpRewardsUiState2.sprayPriceForDialog : null, (1048452 & 8192) != 0 ? bpRewardsUiState2.sprayTextForDialog : annotatedStringHtmlTextToAnnotatedString, (1048452 & 16384) != 0 ? bpRewardsUiState2.filterState : 0, (1048452 & 32768) != 0 ? bpRewardsUiState2.isHasTanpin : false, (1048452 & 65536) != 0 ? bpRewardsUiState2.isTutorialEnabled : false, (1048452 & 131072) != 0 ? bpRewardsUiState2.isButtonFilterBlocked : false, (1048452 & 262144) != 0 ? bpRewardsUiState2.isScreenBlocked : false, (1048452 & 524288) != 0 ? bpRewardsUiState2.isNeedClose : false))) {
                            break;
                        }
                        i3 = i4;
                        i2 = i5;
                        z = true;
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list2 = (List) this.L$1;
                String str3 = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                list = list2;
                str = str3;
            }
            BpRewardsLists bpRewardsListsCopy$default = BpRewardsLists.copy$default(this.this$0.get_uiState().getValue().getBpRewardsLists(), null, list, null, null, null, null, null, 125, null);
            MutableStateFlow<BpRewardsUiState> mutableStateFlow2 = this.this$0.get_uiState();
            do {
                value = mutableStateFlow2.getValue();
                bpRewardsUiState = value;
            } while (!mutableStateFlow2.compareAndSet(value, bpRewardsUiState.copy((1048452 & 1) != 0 ? bpRewardsUiState.isBpRewardsScreen : false, (1048452 & 2) != 0 ? bpRewardsUiState.annotatedText : null, (1048452 & 4) != 0 ? bpRewardsUiState.bpRewardsLists : bpRewardsListsCopy$default, (1048452 & 8) != 0 ? bpRewardsUiState.imagesForFilterList : null, (1048452 & 16) != 0 ? bpRewardsUiState.topHintList : null, (1048452 & 32) != 0 ? bpRewardsUiState.bottomHintList : null, (1048452 & 64) != 0 ? bpRewardsUiState.refreshButtonBitmap : null, (1048452 & 128) != 0 ? bpRewardsUiState.sizeOfImage : 0, (1048452 & 256) != 0 ? bpRewardsUiState.isNeedToShowDialog : false, (1048452 & 512) != 0 ? bpRewardsUiState.isSprayForDialog : false, (1048452 & 1024) != 0 ? bpRewardsUiState.rewardNameForDialog : str, (1048452 & 2048) != 0 ? bpRewardsUiState.idForDialog : 0, (1048452 & 4096) != 0 ? bpRewardsUiState.sprayPriceForDialog : null, (1048452 & 8192) != 0 ? bpRewardsUiState.sprayTextForDialog : null, (1048452 & 16384) != 0 ? bpRewardsUiState.filterState : 0, (1048452 & 32768) != 0 ? bpRewardsUiState.isHasTanpin : false, (1048452 & 65536) != 0 ? bpRewardsUiState.isTutorialEnabled : false, (1048452 & 131072) != 0 ? bpRewardsUiState.isButtonFilterBlocked : false, (1048452 & 262144) != 0 ? bpRewardsUiState.isScreenBlocked : false, (1048452 & 524288) != 0 ? bpRewardsUiState.isNeedClose : false)));
            return Unit.INSTANCE;
        }

        /* compiled from: BpRewardsViewModel.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$onItemClick$1$1", m7120f = "BpRewardsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$onItemClick$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ int $id;
            public final /* synthetic */ int $typeOfClickedButton;
            public int label;
            public final /* synthetic */ BpRewardsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BpRewardsViewModel bpRewardsViewModel, int i, int i2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = bpRewardsViewModel;
                this.$id = i;
                this.$typeOfClickedButton = i2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$id, this.$typeOfClickedButton, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.actionWithJSON.sendOnItemPressed(this.$id, this.$typeOfClickedButton);
                return Unit.INSTANCE;
            }
        }
    }

    public final void onItemClick(int id, int typeOfClickedButton, @Nullable String itemNameForDialog, @Nullable Integer sprayPriceForDialog) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C37551(itemNameForDialog, typeOfClickedButton, this, id, sprayPriceForDialog, null), 1, null);
    }

    /* compiled from: BpRewardsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$onItemsRequested$1", m7120f = "BpRewardsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$onItemsRequested$1 */
    /* loaded from: classes2.dex */
    public static final class C37561 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37561(Continuation<? super C37561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BpRewardsViewModel.this.new C37561(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BpRewardsViewModel.this.actionWithJSON.sendRequestForNewItems();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onItemsRequested() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37561(null), 1, null);
    }

    /* compiled from: BpRewardsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$onStartFilterButtonPressed$1", m7120f = "BpRewardsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nBpRewardsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$onStartFilterButtonPressed$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,736:1\n230#2,5:737\n*S KotlinDebug\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$onStartFilterButtonPressed$1\n*L\n371#1:737,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$onStartFilterButtonPressed$1 */
    public static final class C37571 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $filterState;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37571(int i, Continuation<? super C37571> continuation) {
            super(2, continuation);
            this.$filterState = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BpRewardsViewModel.this.new C37571(this.$filterState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BpRewardsViewModel.this.actionWithJSON.sendButtonFilterPressed(this.$filterState);
                MutableStateFlow<BpRewardsUiState> mutableStateFlow = BpRewardsViewModel.this.get_uiState();
                int i = this.$filterState;
                while (true) {
                    BpRewardsUiState value = mutableStateFlow.getValue();
                    BpRewardsUiState bpRewardsUiState = value;
                    int i2 = i;
                    if (mutableStateFlow.compareAndSet(value, bpRewardsUiState.copy((1048452 & 1) != 0 ? bpRewardsUiState.isBpRewardsScreen : false, (1048452 & 2) != 0 ? bpRewardsUiState.annotatedText : null, (1048452 & 4) != 0 ? bpRewardsUiState.bpRewardsLists : null, (1048452 & 8) != 0 ? bpRewardsUiState.imagesForFilterList : null, (1048452 & 16) != 0 ? bpRewardsUiState.topHintList : null, (1048452 & 32) != 0 ? bpRewardsUiState.bottomHintList : null, (1048452 & 64) != 0 ? bpRewardsUiState.refreshButtonBitmap : null, (1048452 & 128) != 0 ? bpRewardsUiState.sizeOfImage : 0, (1048452 & 256) != 0 ? bpRewardsUiState.isNeedToShowDialog : false, (1048452 & 512) != 0 ? bpRewardsUiState.isSprayForDialog : false, (1048452 & 1024) != 0 ? bpRewardsUiState.rewardNameForDialog : null, (1048452 & 2048) != 0 ? bpRewardsUiState.idForDialog : 0, (1048452 & 4096) != 0 ? bpRewardsUiState.sprayPriceForDialog : null, (1048452 & 8192) != 0 ? bpRewardsUiState.sprayTextForDialog : null, (1048452 & 16384) != 0 ? bpRewardsUiState.filterState : i2, (1048452 & 32768) != 0 ? bpRewardsUiState.isHasTanpin : false, (1048452 & 65536) != 0 ? bpRewardsUiState.isTutorialEnabled : false, (1048452 & 131072) != 0 ? bpRewardsUiState.isButtonFilterBlocked : true, (1048452 & 262144) != 0 ? bpRewardsUiState.isScreenBlocked : false, (1048452 & 524288) != 0 ? bpRewardsUiState.isNeedClose : false))) {
                        return Unit.INSTANCE;
                    }
                    i = i2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void onStartFilterButtonPressed(int filterState) {
        if (filterState != get_uiState().getValue().getFilterState()) {
            ViewModelExtensionKt.launchOnIO$default(this, null, new C37571(filterState, null), 1, null);
        }
    }

    /* compiled from: BpRewardsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$onDialogButtonYesClick$1", m7120f = "BpRewardsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nBpRewardsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$onDialogButtonYesClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,736:1\n230#2,5:737\n*S KotlinDebug\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$onDialogButtonYesClick$1\n*L\n393#1:737,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$onDialogButtonYesClick$1 */
    /* loaded from: classes2.dex */
    public static final class C37541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37541(Continuation<? super C37541> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BpRewardsViewModel.this.new C37541(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            BpRewardsUiState value;
            BpRewardsUiState bpRewardsUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BpRewardsViewModel.this.actionWithJSON.sendOnItemPressed(BpRewardsViewModel.this.get_uiState().getValue().getIdForDialog(), BpRewardsViewModel.this.get_uiState().getValue().isSprayForDialog() ? 3 : 1);
            MutableStateFlow<BpRewardsUiState> mutableStateFlow = BpRewardsViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                bpRewardsUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, bpRewardsUiState.copy((1048452 & 1) != 0 ? bpRewardsUiState.isBpRewardsScreen : false, (1048452 & 2) != 0 ? bpRewardsUiState.annotatedText : null, (1048452 & 4) != 0 ? bpRewardsUiState.bpRewardsLists : null, (1048452 & 8) != 0 ? bpRewardsUiState.imagesForFilterList : null, (1048452 & 16) != 0 ? bpRewardsUiState.topHintList : null, (1048452 & 32) != 0 ? bpRewardsUiState.bottomHintList : null, (1048452 & 64) != 0 ? bpRewardsUiState.refreshButtonBitmap : null, (1048452 & 128) != 0 ? bpRewardsUiState.sizeOfImage : 0, (1048452 & 256) != 0 ? bpRewardsUiState.isNeedToShowDialog : false, (1048452 & 512) != 0 ? bpRewardsUiState.isSprayForDialog : false, (1048452 & 1024) != 0 ? bpRewardsUiState.rewardNameForDialog : null, (1048452 & 2048) != 0 ? bpRewardsUiState.idForDialog : 0, (1048452 & 4096) != 0 ? bpRewardsUiState.sprayPriceForDialog : null, (1048452 & 8192) != 0 ? bpRewardsUiState.sprayTextForDialog : null, (1048452 & 16384) != 0 ? bpRewardsUiState.filterState : 0, (1048452 & 32768) != 0 ? bpRewardsUiState.isHasTanpin : false, (1048452 & 65536) != 0 ? bpRewardsUiState.isTutorialEnabled : false, (1048452 & 131072) != 0 ? bpRewardsUiState.isButtonFilterBlocked : false, (1048452 & 262144) != 0 ? bpRewardsUiState.isScreenBlocked : false, (1048452 & 524288) != 0 ? bpRewardsUiState.isNeedClose : false)));
            return Unit.INSTANCE;
        }
    }

    public final void onDialogButtonYesClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37541(null), 1, null);
    }

    public final void onDialogButtonNoClick() {
        BpRewardsUiState value;
        BpRewardsUiState bpRewardsUiState;
        MutableStateFlow<BpRewardsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            bpRewardsUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, bpRewardsUiState.copy((1048452 & 1) != 0 ? bpRewardsUiState.isBpRewardsScreen : false, (1048452 & 2) != 0 ? bpRewardsUiState.annotatedText : null, (1048452 & 4) != 0 ? bpRewardsUiState.bpRewardsLists : null, (1048452 & 8) != 0 ? bpRewardsUiState.imagesForFilterList : null, (1048452 & 16) != 0 ? bpRewardsUiState.topHintList : null, (1048452 & 32) != 0 ? bpRewardsUiState.bottomHintList : null, (1048452 & 64) != 0 ? bpRewardsUiState.refreshButtonBitmap : null, (1048452 & 128) != 0 ? bpRewardsUiState.sizeOfImage : 0, (1048452 & 256) != 0 ? bpRewardsUiState.isNeedToShowDialog : false, (1048452 & 512) != 0 ? bpRewardsUiState.isSprayForDialog : false, (1048452 & 1024) != 0 ? bpRewardsUiState.rewardNameForDialog : null, (1048452 & 2048) != 0 ? bpRewardsUiState.idForDialog : 0, (1048452 & 4096) != 0 ? bpRewardsUiState.sprayPriceForDialog : null, (1048452 & 8192) != 0 ? bpRewardsUiState.sprayTextForDialog : null, (1048452 & 16384) != 0 ? bpRewardsUiState.filterState : 0, (1048452 & 32768) != 0 ? bpRewardsUiState.isHasTanpin : false, (1048452 & 65536) != 0 ? bpRewardsUiState.isTutorialEnabled : false, (1048452 & 131072) != 0 ? bpRewardsUiState.isButtonFilterBlocked : false, (1048452 & 262144) != 0 ? bpRewardsUiState.isScreenBlocked : false, (1048452 & 524288) != 0 ? bpRewardsUiState.isNeedClose : false)));
    }

    /* compiled from: BpRewardsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$sendButtonCasesPressed$1", m7120f = "BpRewardsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$sendButtonCasesPressed$1 */
    public static final class C37601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37601(Continuation<? super C37601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BpRewardsViewModel.this.new C37601(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BpRewardsViewModel.this.actionWithJSON.sendButtonCasesPressed();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendButtonCasesPressed() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37601(null), 1, null);
    }

    /* compiled from: BpRewardsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$sendUpdateTanpin$1", m7120f = "BpRewardsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$sendUpdateTanpin$1 */
    public static final class C37621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37621(Continuation<? super C37621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BpRewardsViewModel.this.new C37621(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BpRewardsViewModel.this.actionWithJSON.sendUpdateTanpin();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendUpdateTanpin() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37621(null), 1, null);
    }

    public final void showTutorial(boolean isNeedShowTutorial) {
        BpRewardsUiState value;
        BpRewardsUiState bpRewardsUiState;
        MutableStateFlow<BpRewardsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            bpRewardsUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, bpRewardsUiState.copy((1048452 & 1) != 0 ? bpRewardsUiState.isBpRewardsScreen : false, (1048452 & 2) != 0 ? bpRewardsUiState.annotatedText : null, (1048452 & 4) != 0 ? bpRewardsUiState.bpRewardsLists : null, (1048452 & 8) != 0 ? bpRewardsUiState.imagesForFilterList : null, (1048452 & 16) != 0 ? bpRewardsUiState.topHintList : null, (1048452 & 32) != 0 ? bpRewardsUiState.bottomHintList : null, (1048452 & 64) != 0 ? bpRewardsUiState.refreshButtonBitmap : null, (1048452 & 128) != 0 ? bpRewardsUiState.sizeOfImage : 0, (1048452 & 256) != 0 ? bpRewardsUiState.isNeedToShowDialog : false, (1048452 & 512) != 0 ? bpRewardsUiState.isSprayForDialog : false, (1048452 & 1024) != 0 ? bpRewardsUiState.rewardNameForDialog : null, (1048452 & 2048) != 0 ? bpRewardsUiState.idForDialog : 0, (1048452 & 4096) != 0 ? bpRewardsUiState.sprayPriceForDialog : null, (1048452 & 8192) != 0 ? bpRewardsUiState.sprayTextForDialog : null, (1048452 & 16384) != 0 ? bpRewardsUiState.filterState : 0, (1048452 & 32768) != 0 ? bpRewardsUiState.isHasTanpin : false, (1048452 & 65536) != 0 ? bpRewardsUiState.isTutorialEnabled : isNeedShowTutorial, (1048452 & 131072) != 0 ? bpRewardsUiState.isButtonFilterBlocked : false, (1048452 & 262144) != 0 ? bpRewardsUiState.isScreenBlocked : false, (1048452 & 524288) != 0 ? bpRewardsUiState.isNeedClose : false)));
    }

    /* compiled from: BpRewardsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$sendCloseScreen$1", m7120f = "BpRewardsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nBpRewardsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$sendCloseScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,736:1\n230#2,5:737\n*S KotlinDebug\n*F\n+ 1 BpRewardsViewModel.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsViewModel$sendCloseScreen$1\n*L\n427#1:737,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel$sendCloseScreen$1 */
    public static final class C37611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37611(Continuation<? super C37611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BpRewardsViewModel.this.new C37611(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            BpRewardsUiState value;
            BpRewardsUiState bpRewardsUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BpRewardsViewModel.this.actionWithJSON.sendCloseScreen();
                MutableStateFlow<BpRewardsUiState> mutableStateFlow = BpRewardsViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    bpRewardsUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, bpRewardsUiState.copy((1048452 & 1) != 0 ? bpRewardsUiState.isBpRewardsScreen : false, (1048452 & 2) != 0 ? bpRewardsUiState.annotatedText : null, (1048452 & 4) != 0 ? bpRewardsUiState.bpRewardsLists : null, (1048452 & 8) != 0 ? bpRewardsUiState.imagesForFilterList : null, (1048452 & 16) != 0 ? bpRewardsUiState.topHintList : null, (1048452 & 32) != 0 ? bpRewardsUiState.bottomHintList : null, (1048452 & 64) != 0 ? bpRewardsUiState.refreshButtonBitmap : null, (1048452 & 128) != 0 ? bpRewardsUiState.sizeOfImage : 0, (1048452 & 256) != 0 ? bpRewardsUiState.isNeedToShowDialog : false, (1048452 & 512) != 0 ? bpRewardsUiState.isSprayForDialog : false, (1048452 & 1024) != 0 ? bpRewardsUiState.rewardNameForDialog : null, (1048452 & 2048) != 0 ? bpRewardsUiState.idForDialog : 0, (1048452 & 4096) != 0 ? bpRewardsUiState.sprayPriceForDialog : null, (1048452 & 8192) != 0 ? bpRewardsUiState.sprayTextForDialog : null, (1048452 & 16384) != 0 ? bpRewardsUiState.filterState : 0, (1048452 & 32768) != 0 ? bpRewardsUiState.isHasTanpin : false, (1048452 & 65536) != 0 ? bpRewardsUiState.isTutorialEnabled : false, (1048452 & 131072) != 0 ? bpRewardsUiState.isButtonFilterBlocked : false, (1048452 & 262144) != 0 ? bpRewardsUiState.isScreenBlocked : false, (1048452 & 524288) != 0 ? bpRewardsUiState.isNeedClose : true)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendCloseScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37611(null), 1, null);
    }

    public final void showErrorMessage(@NotNull String message) throws JSONException {
        Intrinsics.checkNotNullParameter(message, "message");
        getLocalNotification().showErrorNotification(message);
    }

    /* JADX WARN: Path cross not found for [B:62:0x00b3, B:32:0x0111], limit reached: 68 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x01a5 -> B:42:0x01b0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object parseJsonAndGetListOfItems(JSONObject jSONObject, List<BpRewardsAwardsDto> list, List<InvItems> list2, List<VehiclesDTO> list3, List<SkinsDTO> list4, int i, boolean z, Continuation<? super Unit> continuation) throws Throwable {
        C37581 c37581;
        BpRewardsViewModel bpRewardsViewModel;
        JSONObject jSONObject2;
        List arrayList;
        Object objFromJson;
        List<VehiclesDTO> list5;
        List<SkinsDTO> list6;
        int i2;
        boolean z2;
        Collection arrayList2;
        C37581 c375812;
        BpRewardsViewModel bpRewardsViewModel2;
        Iterator it;
        List list7;
        List<BpRewardsAwardsDto> list8;
        List<InvItems> list9;
        boolean z3;
        List<BpRewardsAwardsDto> list10;
        List<InvItems> list11;
        List list12;
        BpRewardsViewModel bpRewardsViewModel3;
        List<VehiclesDTO> list13;
        List<SkinsDTO> list14;
        JSONObject jSONObject3;
        int i3;
        BpRewardsLists bpRewardsLists;
        int iOptInt;
        boolean zIsHasTanpin;
        MutableStateFlow<BpRewardsUiState> mutableStateFlow;
        BpRewardsUiState value;
        BpRewardsUiState bpRewardsUiState;
        if (continuation instanceof C37581) {
            c37581 = (C37581) continuation;
            int i4 = c37581.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c37581.label = i4 - Integer.MIN_VALUE;
                bpRewardsViewModel = this;
            } else {
                bpRewardsViewModel = this;
                c37581 = bpRewardsViewModel.new C37581(continuation);
            }
        }
        Object obj = c37581.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = c37581.label;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            jSONObject2 = jSONObject;
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("pr");
            if (jSONArrayOptJSONArray != null) {
                try {
                    arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i6 = 0; i6 < length; i6++) {
                        JSONObject jSONObject4 = jSONArrayOptJSONArray.getJSONObject(i6);
                        Intrinsics.checkNotNull(jSONObject4);
                        try {
                            Gson gson = new Gson();
                            String string = jSONObject4.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            objFromJson = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) string).toString(), (Class<Object>) BpRewardsServerItemModel.class);
                        } catch (Exception e) {
                            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                            firebaseCrashlytics.log(e.toString());
                            firebaseCrashlytics.recordException(e);
                            objFromJson = null;
                        }
                        if (objFromJson != null) {
                            Boxing.boxBoolean(arrayList.add(objFromJson));
                        }
                    }
                } catch (Exception e2) {
                    FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                    firebaseCrashlytics2.log(e2.toString());
                    firebaseCrashlytics2.recordException(e2);
                }
                if (arrayList == null) {
                    arrayList = CollectionsKt__CollectionsKt.emptyList();
                }
                list5 = list3;
                list6 = list4;
                i2 = i;
                z2 = z;
                arrayList2 = new ArrayList();
                c375812 = c37581;
                bpRewardsViewModel2 = bpRewardsViewModel;
                it = arrayList.iterator();
                list7 = arrayList;
                list8 = list;
                list9 = list2;
                if (!it.hasNext()) {
                }
            }
            arrayList = null;
            if (arrayList == null) {
            }
            list5 = list3;
            list6 = list4;
            i2 = i;
            z2 = z;
            arrayList2 = new ArrayList();
            c375812 = c37581;
            bpRewardsViewModel2 = bpRewardsViewModel;
            it = arrayList.iterator();
            list7 = arrayList;
            list8 = list;
            list9 = list2;
            if (!it.hasNext()) {
            }
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = c37581.Z$0;
                i3 = c37581.I$0;
                list12 = (List) c37581.L$6;
                List<SkinsDTO> list15 = (List) c37581.L$5;
                List<VehiclesDTO> list16 = (List) c37581.L$4;
                List<InvItems> list17 = (List) c37581.L$3;
                List<BpRewardsAwardsDto> list18 = (List) c37581.L$2;
                jSONObject3 = (JSONObject) c37581.L$1;
                bpRewardsViewModel3 = (BpRewardsViewModel) c37581.L$0;
                ResultKt.throwOnFailure(obj);
                list14 = list15;
                list13 = list16;
                list11 = list17;
                list10 = list18;
                List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) obj);
                mutableList.addAll(bpRewardsViewModel3.get_uiState().getValue().getBpRewardsLists().getListWithImageModels());
                if (z3) {
                    List mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) bpRewardsViewModel3.get_uiState().getValue().getBpRewardsLists().getListWithItems());
                    mutableList2.addAll(list12);
                    list12 = mutableList2;
                }
                bpRewardsLists = new BpRewardsLists(list11, bpRewardsViewModel3.fillListUntilNine(CollectionsKt___CollectionsKt.toMutableList((Collection) list12)), mutableList, list10, bpRewardsViewModel3.parseAlarmsForFilterButtons(jSONObject3), list13, list14);
                iOptInt = jSONObject3.optInt("tn");
                if (iOptInt == 1) {
                    zIsHasTanpin = iOptInt != 2 ? bpRewardsViewModel3.getUiState().getValue().isHasTanpin() : true;
                } else {
                    zIsHasTanpin = false;
                }
                mutableStateFlow = bpRewardsViewModel3.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    bpRewardsUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, bpRewardsUiState.copy((1048452 & 1) != 0 ? bpRewardsUiState.isBpRewardsScreen : false, (1048452 & 2) != 0 ? bpRewardsUiState.annotatedText : null, (1048452 & 4) != 0 ? bpRewardsUiState.bpRewardsLists : bpRewardsLists, (1048452 & 8) != 0 ? bpRewardsUiState.imagesForFilterList : null, (1048452 & 16) != 0 ? bpRewardsUiState.topHintList : null, (1048452 & 32) != 0 ? bpRewardsUiState.bottomHintList : null, (1048452 & 64) != 0 ? bpRewardsUiState.refreshButtonBitmap : null, (1048452 & 128) != 0 ? bpRewardsUiState.sizeOfImage : i3, (1048452 & 256) != 0 ? bpRewardsUiState.isNeedToShowDialog : false, (1048452 & 512) != 0 ? bpRewardsUiState.isSprayForDialog : false, (1048452 & 1024) != 0 ? bpRewardsUiState.rewardNameForDialog : null, (1048452 & 2048) != 0 ? bpRewardsUiState.idForDialog : 0, (1048452 & 4096) != 0 ? bpRewardsUiState.sprayPriceForDialog : null, (1048452 & 8192) != 0 ? bpRewardsUiState.sprayTextForDialog : null, (1048452 & 16384) != 0 ? bpRewardsUiState.filterState : 0, (1048452 & 32768) != 0 ? bpRewardsUiState.isHasTanpin : zIsHasTanpin, (1048452 & 65536) != 0 ? bpRewardsUiState.isTutorialEnabled : false, (1048452 & 131072) != 0 ? bpRewardsUiState.isButtonFilterBlocked : false, (1048452 & 262144) != 0 ? bpRewardsUiState.isScreenBlocked : false, (1048452 & 524288) != 0 ? bpRewardsUiState.isNeedClose : false)));
                return Unit.INSTANCE;
            }
            boolean z4 = c37581.Z$0;
            int i7 = c37581.I$0;
            BpRewardsServerItemModel bpRewardsServerItemModel = (BpRewardsServerItemModel) c37581.L$9;
            Iterator it2 = (Iterator) c37581.L$8;
            Collection collection = (List) c37581.L$7;
            List list19 = (List) c37581.L$6;
            list6 = (List) c37581.L$5;
            List<VehiclesDTO> list20 = (List) c37581.L$4;
            List<InvItems> list21 = (List) c37581.L$3;
            List<BpRewardsAwardsDto> list22 = (List) c37581.L$2;
            JSONObject jSONObject5 = (JSONObject) c37581.L$1;
            BpRewardsViewModel bpRewardsViewModel4 = (BpRewardsViewModel) c37581.L$0;
            ResultKt.throwOnFailure(obj);
            BpRewardsViewModel bpRewardsViewModel5 = bpRewardsViewModel4;
            it = it2;
            Object obj2 = coroutine_suspended;
            C37581 c375813 = c37581;
            list9 = list21;
            z2 = z4;
            jSONObject2 = jSONObject5;
            arrayList2 = collection;
            i2 = i7;
            list7 = list19;
            list5 = list20;
            bpRewardsServerItemModel.setImageModel((BpRewardsImageModel) obj);
            bpRewardsViewModel2 = bpRewardsViewModel5;
            list8 = list22;
            Object obj3 = obj2;
            c375812 = c375813;
            coroutine_suspended = obj3;
            if (!it.hasNext()) {
                BpRewardsServerItemModel bpRewardsServerItemModel2 = (BpRewardsServerItemModel) it.next();
                bpRewardsServerItemModel2.setRewardDays(bpRewardsViewModel2.getDaysTextInItem(bpRewardsViewModel2.calculateDaysLeft(bpRewardsServerItemModel2.getDaysLeft())));
                Collection collection2 = arrayList2;
                Iterator it3 = it;
                List list23 = list7;
                BpRewardsViewModel bpRewardsViewModel6 = bpRewardsViewModel2;
                C37581 c375814 = c375812;
                Object obj4 = coroutine_suspended;
                boolean z5 = z2;
                Deferred deferredAsyncOnDefault$default = ViewModelExtensionKt.asyncOnDefault$default(bpRewardsViewModel6, null, new C3759x2579f149(bpRewardsServerItemModel2, list5, bpRewardsViewModel2, list6, list9, list8, null), 1, null);
                c375814.L$0 = bpRewardsViewModel6;
                c375814.L$1 = jSONObject2;
                c375814.L$2 = list8;
                c375814.L$3 = list9;
                c375814.L$4 = list5;
                c375814.L$5 = list6;
                c375814.L$6 = list23;
                c375814.L$7 = collection2;
                c375814.L$8 = it3;
                bpRewardsServerItemModel = bpRewardsServerItemModel2;
                c375814.L$9 = bpRewardsServerItemModel;
                c375814.I$0 = i2;
                c375814.Z$0 = z5;
                c375814.label = 1;
                Object objAwait = deferredAsyncOnDefault$default.await(c375814);
                obj2 = obj4;
                if (objAwait == obj2) {
                    return obj2;
                }
                z2 = z5;
                c375813 = c375814;
                bpRewardsViewModel5 = bpRewardsViewModel6;
                arrayList2 = collection2;
                list22 = list8;
                obj = objAwait;
                it = it3;
                list7 = list23;
                bpRewardsServerItemModel.setImageModel((BpRewardsImageModel) obj);
                bpRewardsViewModel2 = bpRewardsViewModel5;
                list8 = list22;
                Object obj32 = obj2;
                c375812 = c375813;
                coroutine_suspended = obj32;
                if (!it.hasNext()) {
                    Collection collection3 = arrayList2;
                    List list24 = list7;
                    BpRewardsViewModel bpRewardsViewModel7 = bpRewardsViewModel2;
                    C37581 c375815 = c375812;
                    Object obj5 = coroutine_suspended;
                    z3 = z2;
                    c375815.L$0 = bpRewardsViewModel7;
                    c375815.L$1 = jSONObject2;
                    c375815.L$2 = list8;
                    c375815.L$3 = list9;
                    c375815.L$4 = list5;
                    c375815.L$5 = list6;
                    c375815.L$6 = list24;
                    c375815.L$7 = null;
                    c375815.L$8 = null;
                    c375815.L$9 = null;
                    c375815.I$0 = i2;
                    c375815.Z$0 = z3;
                    c375815.label = 2;
                    Object objAwaitAll = AwaitKt.awaitAll(collection3, c375815);
                    if (objAwaitAll == obj5) {
                        return obj5;
                    }
                    list10 = list8;
                    list11 = list9;
                    obj = objAwaitAll;
                    list12 = list24;
                    bpRewardsViewModel3 = bpRewardsViewModel7;
                    list13 = list5;
                    list14 = list6;
                    jSONObject3 = jSONObject2;
                    i3 = i2;
                    List mutableList3 = CollectionsKt___CollectionsKt.toMutableList((Collection) obj);
                    mutableList3.addAll(bpRewardsViewModel3.get_uiState().getValue().getBpRewardsLists().getListWithImageModels());
                    if (z3) {
                    }
                    bpRewardsLists = new BpRewardsLists(list11, bpRewardsViewModel3.fillListUntilNine(CollectionsKt___CollectionsKt.toMutableList((Collection) list12)), mutableList3, list10, bpRewardsViewModel3.parseAlarmsForFilterButtons(jSONObject3), list13, list14);
                    iOptInt = jSONObject3.optInt("tn");
                    if (iOptInt == 1) {
                    }
                    mutableStateFlow = bpRewardsViewModel3.get_uiState();
                    do {
                        value = mutableStateFlow.getValue();
                        bpRewardsUiState = value;
                    } while (!mutableStateFlow.compareAndSet(value, bpRewardsUiState.copy((1048452 & 1) != 0 ? bpRewardsUiState.isBpRewardsScreen : false, (1048452 & 2) != 0 ? bpRewardsUiState.annotatedText : null, (1048452 & 4) != 0 ? bpRewardsUiState.bpRewardsLists : bpRewardsLists, (1048452 & 8) != 0 ? bpRewardsUiState.imagesForFilterList : null, (1048452 & 16) != 0 ? bpRewardsUiState.topHintList : null, (1048452 & 32) != 0 ? bpRewardsUiState.bottomHintList : null, (1048452 & 64) != 0 ? bpRewardsUiState.refreshButtonBitmap : null, (1048452 & 128) != 0 ? bpRewardsUiState.sizeOfImage : i3, (1048452 & 256) != 0 ? bpRewardsUiState.isNeedToShowDialog : false, (1048452 & 512) != 0 ? bpRewardsUiState.isSprayForDialog : false, (1048452 & 1024) != 0 ? bpRewardsUiState.rewardNameForDialog : null, (1048452 & 2048) != 0 ? bpRewardsUiState.idForDialog : 0, (1048452 & 4096) != 0 ? bpRewardsUiState.sprayPriceForDialog : null, (1048452 & 8192) != 0 ? bpRewardsUiState.sprayTextForDialog : null, (1048452 & 16384) != 0 ? bpRewardsUiState.filterState : 0, (1048452 & 32768) != 0 ? bpRewardsUiState.isHasTanpin : zIsHasTanpin, (1048452 & 65536) != 0 ? bpRewardsUiState.isTutorialEnabled : false, (1048452 & 131072) != 0 ? bpRewardsUiState.isButtonFilterBlocked : false, (1048452 & 262144) != 0 ? bpRewardsUiState.isScreenBlocked : false, (1048452 & 524288) != 0 ? bpRewardsUiState.isNeedClose : false)));
                    return Unit.INSTANCE;
                }
            }
        }
    }

    public static /* synthetic */ Object parseJsonAndGetListOfItems$default(BpRewardsViewModel bpRewardsViewModel, JSONObject jSONObject, List list, List list2, List list3, List list4, int i, boolean z, Continuation continuation, int i2, Object obj) {
        return bpRewardsViewModel.parseJsonAndGetListOfItems(jSONObject, (i2 & 2) != 0 ? bpRewardsViewModel.get_uiState().getValue().getBpRewardsLists().getListOfAwardsTypes() : list, (i2 & 4) != 0 ? bpRewardsViewModel.get_uiState().getValue().getBpRewardsLists().getInvItemsFromJson() : list2, (i2 & 8) != 0 ? bpRewardsViewModel.get_uiState().getValue().getBpRewardsLists().getVehiclesList() : list3, (i2 & 16) != 0 ? bpRewardsViewModel.get_uiState().getValue().getBpRewardsLists().getSkinsList() : list4, (i2 & 32) != 0 ? bpRewardsViewModel.get_uiState().getValue().getSizeOfImage() : i, (i2 & 64) != 0 ? false : z, continuation);
    }

    public final List<BpRewardsServerItemModel> removeAlarmFromItem(int id, List<BpRewardsServerItemModel> list) {
        List<BpRewardsServerItemModel> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (BpRewardsServerItemModel bpRewardsServerItemModelCopy : list2) {
            if (bpRewardsServerItemModelCopy.getItemIdOnServer() == id && bpRewardsServerItemModelCopy.isHaveAlarm() > 0) {
                bpRewardsServerItemModelCopy = bpRewardsServerItemModelCopy.copy((32759 & 1) != 0 ? bpRewardsServerItemModelCopy.itemIdOnServer : 0, (32759 & 2) != 0 ? bpRewardsServerItemModelCopy.itemName : null, (32759 & 4) != 0 ? bpRewardsServerItemModelCopy.prizeType : 0, (32759 & 8) != 0 ? bpRewardsServerItemModelCopy.isHaveAlarm : 0, (32759 & 16) != 0 ? bpRewardsServerItemModelCopy.idForImages : null, (32759 & 32) != 0 ? bpRewardsServerItemModelCopy.skinModelId : null, (32759 & 64) != 0 ? bpRewardsServerItemModelCopy.daysLeft : 0, (32759 & 128) != 0 ? bpRewardsServerItemModelCopy.sprayPrice : 0, (32759 & 256) != 0 ? bpRewardsServerItemModelCopy.plateText : null, (32759 & 512) != 0 ? bpRewardsServerItemModelCopy.rarity : 0, (32759 & 1024) != 0 ? bpRewardsServerItemModelCopy.quantity : 0, (32759 & 2048) != 0 ? bpRewardsServerItemModelCopy.isEmptyItem : false, (32759 & 4096) != 0 ? bpRewardsServerItemModelCopy.rewardDays : null, (32759 & 8192) != 0 ? bpRewardsServerItemModelCopy.imageModel : null, (32759 & 16384) != 0 ? bpRewardsServerItemModelCopy.itemNameForPreview : null);
            }
            arrayList.add(bpRewardsServerItemModelCopy);
        }
        return arrayList;
    }

    public final List<Integer> parseAlarmsForFilterButtons(JSONObject json) {
        JSONArray jSONArrayOptJSONArray = json.optJSONArray(BpRewardsKeys.LIST_OF_ALARMS_FOR_BUTTONS_KEY);
        List mutableList = jSONArrayOptJSONArray != null ? JsonArrayExtensionKt.toMutableList(jSONArrayOptJSONArray) : null;
        if (mutableList != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(CollectionsKt___CollectionsKt.sumOfInt(mutableList)));
            arrayList.addAll(mutableList);
            return arrayList;
        }
        return get_uiState().getValue().getBpRewardsLists().getListOfAlarmsForButtons();
    }

    public final List<BpRewardsServerItemModel> removeItemFromList(int id) {
        List list = CollectionsKt___CollectionsKt.toList(get_uiState().getValue().getBpRewardsLists().getListWithItems());
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((BpRewardsServerItemModel) obj).getItemIdOnServer() != id) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final String getDaysTextInItem(int days) {
        if (days > 0) {
            return getStringResource().getQuantityString(R.plurals.bp_rewards_days, days);
        }
        return getStringResource().getString(R.string.bp_rewards_unlimited);
    }

    public final int calculateDaysLeft(int timeFromServer) {
        if (timeFromServer == 0) {
            return 0;
        }
        int iRoundToIntSafely = FloatExtensionKt.roundToIntSafely(timeFromServer / 86400.0f);
        if (iRoundToIntSafely < 0 || iRoundToIntSafely >= 1) {
            return iRoundToIntSafely;
        }
        return 1;
    }

    public final List<BpRewardsServerItemModel> fillListUntilNine(List<BpRewardsServerItemModel> list) {
        while (list.size() < 9) {
            list.add(new BpRewardsServerItemModel(0, null, 0, 0, null, null, 0, 0, null, 0, 0, true, null, null, null, 30719, null));
        }
        return list;
    }

    public final AnnotatedString getTitleText(boolean isBpRewardsScreen) {
        if (isBpRewardsScreen) {
            String upperCase = getStringResource().getString(R.string.bp_rewards_title_text).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return StringExtensionKt.htmlTextToAnnotatedString(upperCase);
        }
        String upperCase2 = getStringResource().getString(R.string.marketplace_delivery_title_text).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        return StringExtensionKt.htmlTextToAnnotatedString(upperCase2);
    }

    public final AnnotatedString getTutorialOpenCasesText() {
        return StringExtensionKt.htmlTextToAnnotatedString(getStringResource().getString(R.string.bp_rewards_tutorial_btn_cases));
    }
}

