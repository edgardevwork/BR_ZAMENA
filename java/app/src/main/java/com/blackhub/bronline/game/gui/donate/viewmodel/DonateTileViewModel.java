package com.blackhub.bronline.game.gui.donate.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.p007ts.UserDataReader;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.donate.data.DonateItem;
import com.blackhub.bronline.game.gui.donate.data.DonateTileObj;
import com.blackhub.bronline.game.gui.donate.network.DonateActionWithJSON;
import com.blackhub.bronline.game.gui.donate.utils.DonateConstants;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.apache.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DonateTileViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nDonateTileViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DonateTileViewModel.kt\ncom/blackhub/bronline/game/gui/donate/viewmodel/DonateTileViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,582:1\n1#2:583\n230#3,5:584\n230#3,5:589\n230#3,5:594\n230#3,5:599\n230#3,5:604\n230#3,5:609\n230#3,5:614\n230#3,5:619\n230#3,5:624\n*S KotlinDebug\n*F\n+ 1 DonateTileViewModel.kt\ncom/blackhub/bronline/game/gui/donate/viewmodel/DonateTileViewModel\n*L\n477#1:584,5\n478#1:589,5\n479#1:594,5\n480#1:599,5\n481#1:604,5\n482#1:609,5\n483#1:614,5\n484#1:619,5\n485#1:624,5\n*E\n"})
/* loaded from: classes.dex */
public final class DonateTileViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final DonateActionWithJSON actionWithJson;

    @NotNull
    public final MutableStateFlow<List<DonateItem>> mutableAccessories;

    @NotNull
    public final MutableStateFlow<List<DonateItem>> mutableCarPacks;

    @NotNull
    public final MutableStateFlow<List<DonateItem>> mutableCars;

    @NotNull
    public final MutableSharedFlow<DonateTileObj> mutableCurrentItems;

    @NotNull
    public final MutableStateFlow<List<DonateItem>> mutableDonateItemsFromJSON;

    @NotNull
    public final MutableStateFlow<List<DonateItem>> mutableMoneyPacks;

    @NotNull
    public final MutableStateFlow<List<DonateItem>> mutablePacks;

    @NotNull
    public final MutableStateFlow<List<DonateItem>> mutableSaleItems;

    @NotNull
    public final MutableStateFlow<List<DonateItem>> mutableSkins;

    @NotNull
    public final MutableStateFlow<List<Integer>> mutableValueOfLimits;

    @NotNull
    public final MutableStateFlow<List<DonateItem>> mutableVipPacks;

    @NotNull
    public final MutableStateFlow<List<DonateItem>> mutableVips;

    @NotNull
    public final SharedFlow<DonateTileObj> newCurrentItems;

    /* compiled from: DonateTileViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel", m7120f = "DonateTileViewModel.kt", m7121i = {0, 0}, m7122l = {507, 511}, m7123m = "checkAndUpdateCurrentItems", m7124n = {"this", "saleItems"}, m7125s = {"L$0", "L$1"})
    /* renamed from: com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$checkAndUpdateCurrentItems$1 */
    /* loaded from: classes2.dex */
    public static final class C39241 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C39241(Continuation<? super C39241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DonateTileViewModel.this.checkAndUpdateCurrentItems(null, this);
        }
    }

    /* compiled from: DonateTileViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel", m7120f = "DonateTileViewModel.kt", m7121i = {0, 0, 1, 1}, m7122l = {HttpStatus.SC_LENGTH_REQUIRED, 418}, m7123m = "lRemoveSaleItemInfo", m7124n = {"this", "itemId", "this", "itemId"}, m7125s = {"L$0", "I$0", "L$0", "I$0"})
    /* renamed from: com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$lRemoveSaleItemInfo$1 */
    /* loaded from: classes2.dex */
    public static final class C39281 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C39281(Continuation<? super C39281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DonateTileViewModel.this.lRemoveSaleItemInfo(0, this);
        }
    }

    /* compiled from: DonateTileViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel", m7120f = "DonateTileViewModel.kt", m7121i = {0, 0, 0}, m7122l = {UserDataReader.USER_DATA_START_CODE}, m7123m = "updateValueOfLimitForCurrentItem", m7124n = {"this", "valueOfLimits", "itemId"}, m7125s = {"L$0", "L$1", "I$0"})
    /* renamed from: com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$updateValueOfLimitForCurrentItem$1 */
    /* loaded from: classes2.dex */
    public static final class C39341 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C39341(Continuation<? super C39341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DonateTileViewModel.this.updateValueOfLimitForCurrentItem(0, this);
        }
    }

    @Inject
    public DonateTileViewModel(@NotNull DonateActionWithJSON actionWithJson) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        this.actionWithJson = actionWithJson;
        this.mutableDonateItemsFromJSON = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableSaleItems = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableCars = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableSkins = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutablePacks = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableVips = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableMoneyPacks = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableVipPacks = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableCarPacks = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableAccessories = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        MutableSharedFlow<DonateTileObj> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableCurrentItems = mutableSharedFlowMutableSharedFlow$default;
        this.newCurrentItems = mutableSharedFlowMutableSharedFlow$default;
        this.mutableValueOfLimits = StateFlowKt.MutableStateFlow(new ArrayList());
    }

    @NotNull
    public final SharedFlow<DonateTileObj> getNewCurrentItems() {
        return this.newCurrentItems;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        clearData();
        super.onCleared();
    }

    public final void initDonateItemsFromJSON(@NotNull List<DonateItem> allItems, @Nullable JSONObject json) {
        Intrinsics.checkNotNullParameter(allItems, "allItems");
        this.mutableDonateItemsFromJSON.setValue(allItems);
        lInitAllItems(allItems, json);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void lInitAllItems(List<DonateItem> allItems, JSONObject json) {
        List<Integer> mutableIntList;
        Integer closed;
        if (json != null) {
            try {
                JSONArray jSONArrayOptJSONArray = json.optJSONArray("i");
                mutableIntList = jSONArrayOptJSONArray != null ? JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray) : null;
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        for (DonateItem donateItem : allItems) {
            if (donateItem.getClosed() == null || ((closed = donateItem.getClosed()) != null && closed.intValue() == 0)) {
                whiteUpTag(mutableIntList, donateItem);
                Integer type = donateItem.getType();
                if (type != null && type.intValue() == 1) {
                    writeObjToCollection(donateItem, arrayList);
                } else if (type != null && type.intValue() == 2) {
                    writeObjToCollection(donateItem, arrayList2);
                } else if (type != null && type.intValue() == 3) {
                    writeObjToCollection(donateItem, arrayList3);
                } else if (type != null && type.intValue() == 4) {
                    writeObjToCollection(donateItem, arrayList4);
                } else if (type != null && type.intValue() == 6) {
                    writeObjToCollection(donateItem, arrayList5);
                } else if (type != null && type.intValue() == 9) {
                    writeObjToCollection(donateItem, arrayList6);
                } else if (type != null && type.intValue() == 7) {
                    writeObjToCollection(donateItem, arrayList7);
                } else if (type != null && type.intValue() == 11) {
                    writeObjToCollection(donateItem, arrayList8);
                }
            }
        }
        this.mutableCars.setValue(arrayList);
        this.mutableSkins.setValue(arrayList2);
        this.mutablePacks.setValue(arrayList3);
        this.mutableVips.setValue(arrayList4);
        initOtherMoneyPack(arrayList5);
        this.mutableMoneyPacks.setValue(arrayList5);
        this.mutableVipPacks.setValue(arrayList6);
        this.mutableCarPacks.setValue(arrayList7);
        this.mutableAccessories.setValue(arrayList8);
    }

    public final void whiteUpTag(List<Integer> allTags, DonateItem obj) {
        if (allTags != null) {
            int i = 0;
            int i2 = 1;
            while (i < allTags.size()) {
                int iIntValue = allTags.get(i).intValue();
                Integer internalId = obj.getInternalId();
                if (internalId != null && iIntValue == internalId.intValue()) {
                    obj.setUpTag(allTags.get(i2).intValue());
                }
                i += 2;
                i2 += 2;
            }
            Unit unit = Unit.INSTANCE;
            return;
        }
        new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel.whiteUpTag.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                DonateTileViewModel.this.setCurrentPage(2);
                DonateTileViewModel.this.setCurrentPage(4);
            }
        };
    }

    public final void writeObjToCollection(DonateItem obj, List<DonateItem> currentCollection) {
        obj.setAssignedId(currentCollection.size() + 1);
        currentCollection.add(obj);
    }

    public final void initOtherMoneyPack(List<DonateItem> moneyPacks) {
        DonateItem donateItem = new DonateItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, false, -1, null);
        donateItem.setUpTag(200);
        Unit unit = Unit.INSTANCE;
        moneyPacks.add(0, donateItem);
    }

    public final void setCurrentPage(int newPage) {
        try {
            lSetCurrentPage(newPage);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void lSetCurrentPage(int newPage) {
        List<DonateItem> value;
        if (newPage == 0) {
            value = this.mutableSaleItems.getValue();
        } else if (newPage == 1) {
            value = this.mutableCars.getValue();
        } else if (newPage == 2) {
            value = this.mutableSkins.getValue();
        } else if (newPage == 3) {
            value = this.mutablePacks.getValue();
        } else if (newPage == 4) {
            value = this.mutableVips.getValue();
        } else if (newPage == 6) {
            value = this.mutableMoneyPacks.getValue();
        } else if (newPage == 7) {
            value = this.mutableCarPacks.getValue();
        } else if (newPage == 9) {
            value = this.mutableVipPacks.getValue();
        } else if (newPage == 11) {
            value = this.mutableAccessories.getValue();
        } else {
            value = CollectionsKt__CollectionsKt.emptyList();
        }
        lUpdateCurrentCollection(this.mutableValueOfLimits.getValue(), new DonateTileObj(value, newPage));
    }

    public final void initSaleItems(@Nullable JSONObject jsonObject) {
        List<Integer> mutableIntList;
        if (jsonObject != null) {
            try {
                JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("s");
                if (jSONArrayOptJSONArray != null) {
                    Intrinsics.checkNotNull(jSONArrayOptJSONArray);
                    mutableIntList = JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray);
                } else {
                    mutableIntList = null;
                }
                if (mutableIntList != null) {
                    List<DonateItem> listLInitSalesItems = lInitSalesItems(mutableIntList, true);
                    lInitSurpriseItem(listLInitSalesItems, jsonObject.optInt("p"));
                    this.mutableSaleItems.setValue(listLInitSalesItems);
                    lSetCurrentPage(0);
                }
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
        }
    }

    public final List<DonateItem> lInitSalesItems(List<Integer> sales, boolean ifGoodVersion) {
        MutableStateFlow<List<DonateItem>> mutableStateFlow = this.mutableDonateItemsFromJSON;
        ArrayList arrayList = new ArrayList();
        int i = ifGoodVersion ? 1 : 2;
        int i2 = ifGoodVersion ? 2 : 1;
        int i3 = 0;
        while (i3 < sales.size()) {
            Iterator<DonateItem> it = mutableStateFlow.getValue().iterator();
            while (true) {
                if (it.hasNext()) {
                    DonateItem next = it.next();
                    if (next.getInternalId() != null) {
                        Integer internalId = next.getInternalId();
                        int iIntValue = sales.get(i3).intValue();
                        if (internalId != null && internalId.intValue() == iIntValue) {
                            next.setInternalId(sales.get(i3));
                            next.setSaleTime(sales.get(i).intValue());
                            next.setSalePercent(sales.get(i2).intValue());
                            arrayList.add(next);
                            break;
                        }
                    }
                }
            }
            i3 += 3;
            i += 3;
            i2 += 3;
        }
        return arrayList;
    }

    public final void lInitSurpriseItem(List<DonateItem> saleItems, int timeForOpening) {
        DonateItem donateItem = new DonateItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, false, -1, null);
        donateItem.setUpTag(100);
        donateItem.setSaleTime(timeForOpening);
        saleItems.add(0, donateItem);
    }

    /* compiled from: DonateTileViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$updateValueOfLimit$1", m7120f = "DonateTileViewModel.kt", m7121i = {}, m7122l = {282}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$updateValueOfLimit$1 */
    /* loaded from: classes3.dex */
    public static final class C39331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONArray $jsonArray;
        public Object L$0;
        public int label;
        public final /* synthetic */ DonateTileViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39331(JSONArray jSONArray, DonateTileViewModel donateTileViewModel, Continuation<? super C39331> continuation) {
            super(2, continuation);
            this.$jsonArray = jSONArray;
            this.this$0 = donateTileViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C39331(this.$jsonArray, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            DonateTileViewModel donateTileViewModel;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                JSONArray jSONArray = this.$jsonArray;
                if (jSONArray != null) {
                    DonateTileViewModel donateTileViewModel2 = this.this$0;
                    List<Integer> mutableIntList = JsonArrayExtensionKt.toMutableIntList(jSONArray);
                    List list = (List) donateTileViewModel2.mutableValueOfLimits.getValue();
                    if (list.isEmpty()) {
                        donateTileViewModel2.mutableValueOfLimits.setValue(mutableIntList);
                    } else {
                        donateTileViewModel2.updateOldLimits(list, mutableIntList);
                        donateTileViewModel2.mutableValueOfLimits.setValue(list);
                    }
                    MutableSharedFlow mutableSharedFlow = donateTileViewModel2.mutableCurrentItems;
                    this.L$0 = donateTileViewModel2;
                    this.label = 1;
                    obj = FlowKt.first(mutableSharedFlow, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    donateTileViewModel = donateTileViewModel2;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            donateTileViewModel = (DonateTileViewModel) this.L$0;
            ResultKt.throwOnFailure(obj);
            donateTileViewModel.lUpdateCurrentCollection((List) donateTileViewModel.mutableValueOfLimits.getValue(), (DonateTileObj) obj);
            return Unit.INSTANCE;
        }
    }

    public final void updateValueOfLimit(@Nullable JSONArray jsonArray) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C39331(jsonArray, this, null), 2, null);
    }

    public final void updateOldLimits(List<Integer> oldLimit, List<Integer> newLimit) {
        int i = 0;
        int i2 = 1;
        while (i < oldLimit.size()) {
            int i3 = 0;
            int i4 = 1;
            while (i3 < newLimit.size()) {
                if (oldLimit.get(i).intValue() == newLimit.get(i3).intValue()) {
                    oldLimit.set(i2, newLimit.get(i4));
                }
                i3 += 2;
                i4 += 2;
            }
            i += 2;
            i2 += 2;
        }
    }

    public final void lUpdateCurrentCollection(List<Integer> valueOfLimit, DonateTileObj currentCollection) {
        int i = 1;
        if (!valueOfLimit.isEmpty()) {
            int i2 = 0;
            while (i2 < valueOfLimit.size()) {
                updateLimitForObj(currentCollection, valueOfLimit.get(i2).intValue(), valueOfLimit.get(i).intValue());
                i2 += 2;
                i += 2;
            }
        }
        this.mutableCurrentItems.tryEmit(currentCollection);
    }

    public final void updateLimitForObj(DonateTileObj currentCollection, int currentId, int newLimit) {
        Object next;
        Iterator<T> it = currentCollection.getItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer internalId = ((DonateItem) next).getInternalId();
            if (internalId != null && internalId.intValue() == currentId) {
                break;
            }
        }
        DonateItem donateItem = (DonateItem) next;
        if (donateItem != null) {
            donateItem.setLimit(newLimit);
        }
    }

    public final void openingSurprise() throws JSONException {
        this.actionWithJson.openingSurprise();
    }

    /* compiled from: DonateTileViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$showVIPPlatinumItems$1", m7120f = "DonateTileViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$showVIPPlatinumItems$1 */
    /* loaded from: classes3.dex */
    public static final class C39301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39301(Continuation<? super C39301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DonateTileViewModel.this.new C39301(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object next;
            Integer internalId;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    Iterator it = ((Iterable) DonateTileViewModel.this.mutableDonateItemsFromJSON.getValue()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        DonateItem donateItem = (DonateItem) next;
                        if (Intrinsics.areEqual(UtilsKt.buildTypeMerge(donateItem.getHeader(), donateItem.getHeaderStore()), DonateConstants.HEADER_VIP_PLATINUM)) {
                            break;
                        }
                    }
                    DonateItem donateItem2 = (DonateItem) next;
                    if (donateItem2 != null && (internalId = donateItem2.getInternalId()) != null) {
                        DonateTileViewModel.this.showCurrentCategory(Boxing.boxInt(internalId.intValue()), -1);
                    }
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void showVIPPlatinumItems() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C39301(null), 2, null);
    }

    /* compiled from: DonateTileViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$getCarsOrVIPFromCurrentCategory$1", m7120f = "DonateTileViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$getCarsOrVIPFromCurrentCategory$1 */
    /* loaded from: classes3.dex */
    public static final class C39271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Integer $categoryId;
        public final /* synthetic */ int $oldPage;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39271(Integer num, int i, Continuation<? super C39271> continuation) {
            super(2, continuation);
            this.$categoryId = num;
            this.$oldPage = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DonateTileViewModel.this.new C39271(this.$categoryId, this.$oldPage, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    DonateTileViewModel.this.showCurrentCategory(this.$categoryId, this.$oldPage);
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void getCarsOrVIPFromCurrentCategory(@Nullable Integer categoryId, int oldPage) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C39271(categoryId, oldPage, null), 2, null);
    }

    public final void showCurrentCategory(Integer categoryId, int oldPage) {
        Object next;
        List<Integer> contains;
        Object next2;
        Iterator<T> it = this.mutableDonateItemsFromJSON.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.areEqual(((DonateItem) next).getInternalId(), categoryId)) {
                    break;
                }
            }
        }
        DonateItem donateItem = (DonateItem) next;
        if (donateItem == null || (contains = donateItem.getContains()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it2 = contains.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            Iterator<T> it3 = this.mutableDonateItemsFromJSON.getValue().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
                Integer internalId = ((DonateItem) next2).getInternalId();
                if (internalId != null && internalId.intValue() == iIntValue) {
                    break;
                }
            }
            DonateItem donateItem2 = (DonateItem) next2;
            if (donateItem2 != null) {
                arrayList.add(donateItem2);
            }
        }
        lUpdateCurrentCollection(this.mutableValueOfLimits.getValue(), new DonateTileObj(arrayList, oldPage));
    }

    /* compiled from: DonateTileViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$clickButtonBack$1", m7120f = "DonateTileViewModel.kt", m7121i = {}, m7122l = {398}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$clickButtonBack$1 */
    /* loaded from: classes3.dex */
    public static final class C39261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39261(Continuation<? super C39261> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DonateTileViewModel.this.new C39261(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = DonateTileViewModel.this.mutableCurrentItems;
                this.label = 1;
                obj = FlowKt.first(mutableSharedFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            DonateTileViewModel.this.lSetCurrentPage(((DonateTileObj) obj).getPage());
            return Unit.INSTANCE;
        }
    }

    public final void clickButtonBack() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39261(null), 3, null);
    }

    /* compiled from: DonateTileViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$removeSaleItemInfoAndUpdateLimit$1", m7120f = "DonateTileViewModel.kt", m7121i = {}, m7122l = {405, HttpStatus.SC_NOT_ACCEPTABLE}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$removeSaleItemInfoAndUpdateLimit$1 */
    /* loaded from: classes3.dex */
    public static final class C39291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $jsonObject;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39291(JSONObject jSONObject, Continuation<? super C39291> continuation) {
            super(2, continuation);
            this.$jsonObject = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DonateTileViewModel.this.new C39291(this.$jsonObject, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DonateTileViewModel donateTileViewModel = DonateTileViewModel.this;
                int iOptInt = this.$jsonObject.optInt("g");
                this.label = 1;
                if (donateTileViewModel.lRemoveSaleItemInfo(iOptInt, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            DonateTileViewModel donateTileViewModel2 = DonateTileViewModel.this;
            int iOptInt2 = this.$jsonObject.optInt("id");
            this.label = 2;
            if (donateTileViewModel2.updateValueOfLimitForCurrentItem(iOptInt2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public final void removeSaleItemInfoAndUpdateLimit(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C39291(jsonObject, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be A[EDGE_INSN: B:51:0x00be->B:46:0x00be BREAK  A[LOOP:0: B:38:0x00a3->B:54:0x00a3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object lRemoveSaleItemInfo(int i, Continuation<? super Unit> continuation) throws Throwable {
        C39281 c39281;
        DonateTileViewModel donateTileViewModel;
        Object next;
        DonateTileViewModel donateTileViewModel2;
        Iterator<T> it;
        DonateItem donateItem;
        if (continuation instanceof C39281) {
            c39281 = (C39281) continuation;
            int i2 = c39281.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c39281.label = i2 - Integer.MIN_VALUE;
            } else {
                c39281 = new C39281(continuation);
            }
        }
        Object objFirst = c39281.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c39281.label;
        Object obj = null;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objFirst);
            MutableSharedFlow<DonateTileObj> mutableSharedFlow = this.mutableCurrentItems;
            c39281.L$0 = this;
            c39281.I$0 = i;
            c39281.label = 1;
            objFirst = FlowKt.first(mutableSharedFlow, c39281);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
            donateTileViewModel = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = c39281.I$0;
                donateTileViewModel2 = (DonateTileViewModel) c39281.L$0;
                ResultKt.throwOnFailure(objFirst);
                it = donateTileViewModel2.mutableSaleItems.getValue().iterator();
                while (true) {
                    if (it.hasNext()) {
                        break;
                    }
                    Object next2 = it.next();
                    Integer internalId = ((DonateItem) next2).getInternalId();
                    if (internalId != null && internalId.intValue() == i) {
                        obj = next2;
                        break;
                    }
                }
                donateItem = (DonateItem) obj;
                if (donateItem != null) {
                    donateTileViewModel2.changeSaleInfo(donateItem);
                }
                return Unit.INSTANCE;
            }
            i = c39281.I$0;
            donateTileViewModel = (DonateTileViewModel) c39281.L$0;
            ResultKt.throwOnFailure(objFirst);
        }
        DonateTileObj donateTileObj = (DonateTileObj) objFirst;
        Iterator<T> it2 = donateTileObj.getItems().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            Integer internalId2 = ((DonateItem) next).getInternalId();
            if (internalId2 != null && internalId2.intValue() == i) {
                break;
            }
        }
        DonateItem donateItem2 = (DonateItem) next;
        if (donateItem2 != null) {
            donateTileViewModel.changeSaleInfo(donateItem2);
        }
        MutableSharedFlow<DonateTileObj> mutableSharedFlow2 = donateTileViewModel.mutableCurrentItems;
        c39281.L$0 = donateTileViewModel;
        c39281.I$0 = i;
        c39281.label = 2;
        if (mutableSharedFlow2.emit(donateTileObj, c39281) == coroutine_suspended) {
            return coroutine_suspended;
        }
        donateTileViewModel2 = donateTileViewModel;
        it = donateTileViewModel2.mutableSaleItems.getValue().iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        donateItem = (DonateItem) obj;
        if (donateItem != null) {
        }
        return Unit.INSTANCE;
    }

    public final void changeSaleInfo(DonateItem currentItem) {
        currentItem.setSalePercent(0);
        currentItem.setSaleTime(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateValueOfLimitForCurrentItem(int i, Continuation<? super Unit> continuation) throws Throwable {
        C39341 c39341;
        List<Integer> list;
        DonateTileViewModel donateTileViewModel;
        if (continuation instanceof C39341) {
            c39341 = (C39341) continuation;
            int i2 = c39341.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c39341.label = i2 - Integer.MIN_VALUE;
            } else {
                c39341 = new C39341(continuation);
            }
        }
        Object obj = c39341.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c39341.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            List<Integer> value = this.mutableValueOfLimits.getValue();
            MutableSharedFlow<DonateTileObj> mutableSharedFlow = this.mutableCurrentItems;
            c39341.L$0 = this;
            c39341.L$1 = value;
            c39341.I$0 = i;
            c39341.label = 1;
            Object objFirst = FlowKt.first(mutableSharedFlow, c39341);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = value;
            obj = objFirst;
            donateTileViewModel = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c39341.I$0;
            list = (List) c39341.L$1;
            donateTileViewModel = (DonateTileViewModel) c39341.L$0;
            ResultKt.throwOnFailure(obj);
        }
        DonateTileObj donateTileObj = (DonateTileObj) obj;
        int i4 = 0;
        int i5 = 1;
        while (true) {
            if (i4 >= list.size()) {
                break;
            }
            if (list.get(i4).intValue() == i) {
                list.set(i5, Boxing.boxInt(list.get(i5).intValue() - 1));
                break;
            }
            i4 += 2;
            i5 += 2;
        }
        donateTileViewModel.lUpdateCurrentCollection(list, donateTileObj);
        return Unit.INSTANCE;
    }

    /* compiled from: DonateTileViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$updateSurpriseAndSalesEveryMinute$1", m7120f = "DonateTileViewModel.kt", m7121i = {0}, m7122l = {466}, m7123m = "invokeSuspend", m7124n = {"saleItems"}, m7125s = {"L$0"})
    /* renamed from: com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$updateSurpriseAndSalesEveryMinute$1 */
    /* loaded from: classes3.dex */
    public static final class C39321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $jsonObject;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39321(JSONObject jSONObject, Continuation<? super C39321> continuation) {
            super(2, continuation);
            this.$jsonObject = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DonateTileViewModel.this.new C39321(this.$jsonObject, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            List list;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List list2 = (List) DonateTileViewModel.this.mutableSaleItems.getValue();
                if (!list2.isEmpty()) {
                    ((DonateItem) list2.get(0)).setSaleTime(this.$jsonObject.optInt("p"));
                    JSONArray jSONArrayOptJSONArray = this.$jsonObject.optJSONArray("s");
                    DonateTileViewModel.this.lUpdateSaleTime(jSONArrayOptJSONArray != null ? JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray) : null, list2);
                    DonateTileViewModel donateTileViewModel = DonateTileViewModel.this;
                    this.L$0 = list2;
                    this.label = 1;
                    if (donateTileViewModel.checkAndUpdateCurrentItems(list2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = list2;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
            DonateTileViewModel.this.mutableSaleItems.setValue(list);
            return Unit.INSTANCE;
        }
    }

    public final void updateSurpriseAndSalesEveryMinute(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C39321(jsonObject, null), 2, null);
    }

    public final void clearData() {
        MutableStateFlow<List<DonateItem>> mutableStateFlow = this.mutableDonateItemsFromJSON;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), CollectionsKt__CollectionsKt.emptyList())) {
        }
        MutableStateFlow<List<DonateItem>> mutableStateFlow2 = this.mutableSaleItems;
        while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), CollectionsKt__CollectionsKt.emptyList())) {
        }
        MutableStateFlow<List<DonateItem>> mutableStateFlow3 = this.mutableVips;
        while (!mutableStateFlow3.compareAndSet(mutableStateFlow3.getValue(), CollectionsKt__CollectionsKt.emptyList())) {
        }
        MutableStateFlow<List<DonateItem>> mutableStateFlow4 = this.mutablePacks;
        while (!mutableStateFlow4.compareAndSet(mutableStateFlow4.getValue(), CollectionsKt__CollectionsKt.emptyList())) {
        }
        MutableStateFlow<List<DonateItem>> mutableStateFlow5 = this.mutableSkins;
        while (!mutableStateFlow5.compareAndSet(mutableStateFlow5.getValue(), CollectionsKt__CollectionsKt.emptyList())) {
        }
        MutableStateFlow<List<DonateItem>> mutableStateFlow6 = this.mutableCarPacks;
        while (!mutableStateFlow6.compareAndSet(mutableStateFlow6.getValue(), CollectionsKt__CollectionsKt.emptyList())) {
        }
        MutableStateFlow<List<DonateItem>> mutableStateFlow7 = this.mutableCars;
        while (!mutableStateFlow7.compareAndSet(mutableStateFlow7.getValue(), CollectionsKt__CollectionsKt.emptyList())) {
        }
        MutableStateFlow<List<DonateItem>> mutableStateFlow8 = this.mutableMoneyPacks;
        while (!mutableStateFlow8.compareAndSet(mutableStateFlow8.getValue(), CollectionsKt__CollectionsKt.emptyList())) {
        }
        MutableStateFlow<List<DonateItem>> mutableStateFlow9 = this.mutableAccessories;
        while (!mutableStateFlow9.compareAndSet(mutableStateFlow9.getValue(), CollectionsKt__CollectionsKt.emptyList())) {
        }
    }

    public final void lUpdateSaleTime(List<Integer> newSaleInfo, List<DonateItem> saleItems) {
        Object next;
        List<Integer> list = newSaleInfo;
        if (list == null || list.isEmpty()) {
            return;
        }
        int i = 0;
        int i2 = 1;
        while (i < newSaleInfo.size()) {
            Iterator<T> it = saleItems.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer internalId = ((DonateItem) next).getInternalId();
                int iIntValue = newSaleInfo.get(i).intValue();
                if (internalId != null && internalId.intValue() == iIntValue) {
                    break;
                }
            }
            DonateItem donateItem = (DonateItem) next;
            if (donateItem != null) {
                donateItem.setSaleTime(newSaleInfo.get(i2).intValue());
            }
            i += 2;
            i2 += 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkAndUpdateCurrentItems(List<DonateItem> list, Continuation<? super Unit> continuation) throws Throwable {
        C39241 c39241;
        DonateTileViewModel donateTileViewModel;
        if (continuation instanceof C39241) {
            c39241 = (C39241) continuation;
            int i = c39241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c39241.label = i - Integer.MIN_VALUE;
            } else {
                c39241 = new C39241(continuation);
            }
        }
        Object objFirst = c39241.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c39241.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            MutableSharedFlow<DonateTileObj> mutableSharedFlow = this.mutableCurrentItems;
            c39241.L$0 = this;
            c39241.L$1 = list;
            c39241.label = 1;
            objFirst = FlowKt.first(mutableSharedFlow, c39241);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
            donateTileViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFirst);
                return Unit.INSTANCE;
            }
            list = (List) c39241.L$1;
            donateTileViewModel = (DonateTileViewModel) c39241.L$0;
            ResultKt.throwOnFailure(objFirst);
        }
        DonateTileObj donateTileObj = (DonateTileObj) objFirst;
        if (donateTileObj.getPage() != 0) {
            return Unit.INSTANCE;
        }
        donateTileObj.setItems(list);
        MutableSharedFlow<DonateTileObj> mutableSharedFlow2 = donateTileViewModel.mutableCurrentItems;
        c39241.L$0 = null;
        c39241.L$1 = null;
        c39241.label = 2;
        if (mutableSharedFlow2.emit(donateTileObj, c39241) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: DonateTileViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$clearLimit$1", m7120f = "DonateTileViewModel.kt", m7121i = {0}, m7122l = {519}, m7123m = "invokeSuspend", m7124n = {"allLimits"}, m7125s = {"L$0"})
    /* renamed from: com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$clearLimit$1 */
    /* loaded from: classes3.dex */
    public static final class C39251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $itemId;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39251(int i, Continuation<? super C39251> continuation) {
            super(2, continuation);
            this.$itemId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DonateTileViewModel.this.new C39251(this.$itemId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            List list;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            int i2 = 1;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    List list2 = (List) DonateTileViewModel.this.mutableValueOfLimits.getValue();
                    MutableSharedFlow mutableSharedFlow = DonateTileViewModel.this.mutableCurrentItems;
                    this.L$0 = list2;
                    this.label = 1;
                    Object objFirst = FlowKt.first(mutableSharedFlow, this);
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = list2;
                    obj = objFirst;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                DonateTileObj donateTileObj = (DonateTileObj) obj;
                int i3 = 0;
                while (true) {
                    if (i3 >= list.size()) {
                        break;
                    }
                    if (((Number) list.get(i3)).intValue() == this.$itemId) {
                        list.set(i2, Boxing.boxInt(0));
                        break;
                    }
                    i3 += 2;
                    i2 += 2;
                }
                DonateTileViewModel.this.mutableValueOfLimits.setValue(list);
                if (donateTileObj.getPage() == 0) {
                    DonateTileViewModel.this.lSetCurrentPage(0);
                }
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void clearLimit(int itemId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C39251(itemId, null), 2, null);
    }

    /* compiled from: DonateTileViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$updateNewSaleItems$1", m7120f = "DonateTileViewModel.kt", m7121i = {}, m7122l = {549, 567}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel$updateNewSaleItems$1 */
    /* loaded from: classes3.dex */
    public static final class C39311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $jsonObject;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39311(JSONObject jSONObject, Continuation<? super C39311> continuation) {
            super(2, continuation);
            this.$jsonObject = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DonateTileViewModel.this.new C39311(this.$jsonObject, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = DonateTileViewModel.this.mutableCurrentItems;
                this.label = 1;
                obj = FlowKt.first(mutableSharedFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            DonateTileObj donateTileObj = (DonateTileObj) obj;
            List list = (List) DonateTileViewModel.this.mutableSaleItems.getValue();
            JSONArray jSONArrayOptJSONArray = this.$jsonObject.optJSONArray("s");
            List<Integer> mutableIntList = jSONArrayOptJSONArray != null ? JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray) : null;
            if (mutableIntList != null) {
                DonateTileViewModel donateTileViewModel = DonateTileViewModel.this;
                List listLInitSalesItems = donateTileViewModel.lInitSalesItems(mutableIntList, false);
                if (true ^ list.isEmpty()) {
                    listLInitSalesItems.add(0, list.get(0));
                }
                donateTileViewModel.mutableSaleItems.setValue(listLInitSalesItems);
                if (donateTileObj.getPage() == 0) {
                    donateTileObj.setItems(listLInitSalesItems);
                    MutableSharedFlow mutableSharedFlow2 = donateTileViewModel.mutableCurrentItems;
                    this.label = 2;
                    if (mutableSharedFlow2.emit(donateTileObj, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void updateNewSaleItems(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C39311(jsonObject, null), 2, null);
    }

    public final void showPackGee() {
        showCurrentCategory(6, -1);
    }
}

