package com.blackhub.bronline.game.gui.marketplace;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.media3.common.C2732C;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.constants.resources.PngConstantsId77;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.FormatUtilsKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.blackhub.bronline.game.gui.craft.model.response.CraftCategoryFilter;
import com.blackhub.bronline.game.gui.craft.model.response.CraftItemCategoryFilter;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonCategoryFilter;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonItemCategoryFilter;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceModalWindowStateEnum;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceNotificationEnum;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceRarityEnum;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceTypeProductCardEnum;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceBottomSheetInfo;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceLimits;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProduct;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProductKt;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProfileInfo;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceSortFilter;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceTab;
import com.blackhub.bronline.game.model.remote.response.marketplace.MarketplaceConfig;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MarketplaceViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1769:1\n230#2,5:1770\n230#2,5:1775\n230#2,5:1780\n230#2,5:1785\n230#2,5:1790\n230#2,5:1796\n230#2,5:1801\n230#2,5:1806\n230#2,5:1811\n230#2,5:1820\n230#2,5:1825\n230#2,5:1834\n230#2,5:1841\n1#3:1795\n1549#4:1816\n1620#4,3:1817\n1549#4:1830\n1620#4,3:1831\n1855#4,2:1839\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel\n*L\n1250#1:1770,5\n1401#1:1775,5\n1409#1:1780,5\n1417#1:1785,5\n1435#1:1790,5\n1500#1:1796,5\n1530#1:1801,5\n1554#1:1806,5\n1563#1:1811,5\n1599#1:1820,5\n1614#1:1825,5\n1639#1:1834,5\n1757#1:1841,5\n1590#1:1816\n1590#1:1817,3\n1634#1:1830\n1634#1:1831,3\n1728#1:1839,2\n*E\n"})
/* loaded from: classes.dex */
public final class MarketplaceViewModel extends BaseViewModel<MarketplaceUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<MarketplaceUiState> _uiState;

    @NotNull
    public final MarketplaceActionWithJson actionWithJSON;

    @NotNull
    public final Application application;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StringResource stringResources;

    @NotNull
    public final StateFlow<MarketplaceUiState> uiState;

    public final int getCountTemplate(long count) {
        return count < 1000 ? R.string.common_just_string : count < 1000000 ? R.string.common_thousand_with_dot : count < 1000000000 ? R.string.common_million_with_dot : count < 1000000000000L ? R.string.common_billion_with_dot : R.string.common_trillion_with_dot;
    }

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public MarketplaceViewModel(@NotNull MarketplaceActionWithJson actionWithJSON, @NotNull StringResource stringResources, @NotNull Application application, @NotNull LocalNotification localNotification) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(stringResources, "stringResources");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        this.actionWithJSON = actionWithJSON;
        this.stringResources = stringResources;
        this.application = application;
        this.localNotification = localNotification;
        this._uiState = StateFlowKt.MutableStateFlow(new MarketplaceUiState(null, null, null, 0, false, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, -1, 3, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<MarketplaceUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<MarketplaceUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$initJson$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$initJson$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n1549#2:1770\n1620#2,2:1771\n1549#2:1773\n1620#2,3:1774\n1622#2:1777\n230#3,5:1778\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$initJson$1\n*L\n205#1:1770\n205#1:1771,2\n206#1:1773\n206#1:1774,3\n205#1:1777\n279#1:1778,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$initJson$1 */
    public static final class C42791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<InvItems> $inventoryItems;
        public final /* synthetic */ JSONObject $json;
        public final /* synthetic */ List<CraftJsonCategoryFilter> $marketplaceCategoriesFilters;
        public final /* synthetic */ List<MarketplaceConfig> $marketplaceConfigList;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42791(JSONObject jSONObject, List<InvItems> list, List<MarketplaceConfig> list2, List<CraftJsonCategoryFilter> list3, Continuation<? super C42791> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.$inventoryItems = list;
            this.$marketplaceConfigList = list2;
            this.$marketplaceCategoriesFilters = list3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MarketplaceViewModel.this.new C42791(this.$json, this.$inventoryItems, this.$marketplaceConfigList, this.$marketplaceCategoriesFilters, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x0372 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0178 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:6:0x001d, B:8:0x0051, B:13:0x007a, B:14:0x007e, B:18:0x008c, B:21:0x0099, B:24:0x00a9, B:26:0x00bd, B:28:0x00c3, B:30:0x00cf, B:44:0x00f3, B:46:0x00f9, B:48:0x0102, B:50:0x0108, B:52:0x0111, B:54:0x0117, B:56:0x0120, B:58:0x0126, B:60:0x012f, B:66:0x0147, B:67:0x0161, B:68:0x0172, B:70:0x0178, B:71:0x0191, B:73:0x0197, B:76:0x01c3, B:79:0x01cd, B:80:0x01f8, B:84:0x0215, B:85:0x030a, B:87:0x0372), top: B:95:0x001d }] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0210  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0213  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0376 A[LOOP:2: B:85:0x030a->B:90:0x0376, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i;
            int i2;
            int i3;
            List listAddVipProductCard;
            int i4;
            int i5;
            boolean z;
            MarketplaceLimits marketplaceLimits;
            boolean z2;
            MarketplaceLimits marketplaceLimits2;
            ArrayList arrayList;
            boolean z3;
            List listListOf;
            MarketplaceTab marketplaceTab;
            Bitmap bitmapFromZip$default;
            MutableStateFlow<MarketplaceUiState> mutableStateFlow;
            MarketplaceUiState value;
            MarketplaceUiState marketplaceUiState;
            List list;
            ArrayList arrayList2;
            int i6;
            int i7;
            MutableStateFlow<MarketplaceUiState> mutableStateFlow2;
            Unit unit;
            int i8;
            boolean z4;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutableStateFlow<MarketplaceUiState> mutableStateFlow3 = MarketplaceViewModel.this.get_uiState();
            JSONObject jSONObject = this.$json;
            List<InvItems> list2 = this.$inventoryItems;
            MarketplaceViewModel marketplaceViewModel = MarketplaceViewModel.this;
            List<MarketplaceConfig> list3 = this.$marketplaceConfigList;
            List<CraftJsonCategoryFilter> list4 = this.$marketplaceCategoriesFilters;
            synchronized (mutableStateFlow3) {
                try {
                    int iOptInt = jSONObject.optInt("m");
                    int iOptInt2 = jSONObject.optInt("v");
                    int iOptInt3 = jSONObject.optInt("vm");
                    int iOptInt4 = jSONObject.optInt(MarketplaceKeys.MARKETPLACE_PUBLISHED_CARDS_KEY);
                    int iOptInt5 = jSONObject.optInt(MarketplaceKeys.MARKETPLACE_PUBLISHED_HOT_CARDS_KEY);
                    int iOptInt6 = jSONObject.optInt("tm");
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("n");
                    if (jSONArrayOptJSONArray != null) {
                        i = iOptInt6;
                        i2 = iOptInt3;
                        i3 = iOptInt2;
                        listAddVipProductCard = MarketplaceProductKt.mapToMarketplaceProducts(jSONArrayOptJSONArray, list2, (62 & 2) != 0 ? false : false, (62 & 4) == 0 ? false : false, (62 & 8) != 0 ? null : null, (62 & 16) != 0 ? null : null, (62 & 32) == 0 ? null : null);
                    } else {
                        i = iOptInt6;
                        i2 = iOptInt3;
                        i3 = iOptInt2;
                        listAddVipProductCard = null;
                    }
                    if (listAddVipProductCard == null) {
                        listAddVipProductCard = CollectionsKt__CollectionsKt.emptyList();
                    }
                    boolean z5 = listAddVipProductCard.size() > 4;
                    if (!IntExtensionKt.isNotZero(Boxing.boxInt(i)) || i3 == 3) {
                        i4 = i;
                        i5 = i2;
                    } else {
                        i4 = i;
                        i5 = i2;
                        listAddVipProductCard = marketplaceViewModel.addVipProductCard(listAddVipProductCard, i5, i4);
                    }
                    List list5 = listAddVipProductCard;
                    int iOptInt7 = jSONObject.optInt(MarketplaceKeys.MARKETPLACE_PAGES_KEY);
                    List listCalculatePaginatorPagesToShow$default = MarketplaceViewModel.calculatePaginatorPagesToShow$default(marketplaceViewModel, 0, iOptInt7, 1, null);
                    MarketplaceConfig marketplaceConfig = (MarketplaceConfig) CollectionsKt___CollectionsKt.getOrNull(list3, i3);
                    if (marketplaceConfig != null) {
                        Integer ticketsMaxTotal = marketplaceConfig.getTicketsMaxTotal();
                        if (ticketsMaxTotal != null) {
                            int iIntValue = ticketsMaxTotal.intValue() - iOptInt4;
                            Integer hotTicketsMax = marketplaceConfig.getHotTicketsMax();
                            if (hotTicketsMax != null) {
                                int iIntValue2 = hotTicketsMax.intValue() - iOptInt5;
                                int i9 = iIntValue2 < 0 ? 0 : iIntValue2;
                                if (iIntValue <= 0) {
                                    z4 = false;
                                    i8 = 0;
                                } else {
                                    i8 = iIntValue;
                                    z4 = true;
                                }
                                boolean z6 = (i3 == 0 || i3 == 1 || (i3 != 2 && i3 != 3)) ? false : true;
                                Integer hotTicketCost = marketplaceConfig.getHotTicketCost();
                                int iIntValue3 = hotTicketCost != null ? hotTicketCost.intValue() : 0;
                                Integer placementCost = marketplaceConfig.getPlacementCost();
                                int iIntValue4 = placementCost != null ? placementCost.intValue() : 0;
                                Integer sellTax = marketplaceConfig.getSellTax();
                                int iIntValue5 = sellTax != null ? sellTax.intValue() : 0;
                                Integer placementHours = marketplaceConfig.getPlacementHours();
                                boolean z7 = z4;
                                marketplaceLimits = new MarketplaceLimits(i8, i9, iIntValue4, iIntValue3, z6, iIntValue5, placementHours != null ? placementHours.intValue() : 0);
                                z = z7;
                            } else {
                                marketplaceLimits = null;
                                z = false;
                            }
                            if (marketplaceLimits == null) {
                            }
                        }
                        z2 = z;
                        marketplaceLimits2 = marketplaceLimits;
                        List<CraftJsonCategoryFilter> list6 = list4;
                        int i10 = 10;
                        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                        for (CraftJsonCategoryFilter craftJsonCategoryFilter : list6) {
                            List<CraftJsonItemCategoryFilter> filters = craftJsonCategoryFilter.getFilters();
                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(filters, i10));
                            for (Iterator it = filters.iterator(); it.hasNext(); it = it) {
                                CraftJsonItemCategoryFilter craftJsonItemCategoryFilter = (CraftJsonItemCategoryFilter) it.next();
                                int filterId = craftJsonItemCategoryFilter.getFilterId();
                                String filterName = craftJsonItemCategoryFilter.getFilterName();
                                long jColor = ColorKt.Color(Color.parseColor(craftJsonItemCategoryFilter.getColor()));
                                int categoryFilterId = craftJsonCategoryFilter.getCategoryFilterId();
                                Application application = marketplaceViewModel.application;
                                String iconCDN = craftJsonItemCategoryFilter.getIconCDN();
                                if (iconCDN == null) {
                                    iconCDN = "";
                                }
                                String str = iconCDN;
                                String iconCDN2 = craftJsonItemCategoryFilter.getIconCDN();
                                if (iconCDN2 == null) {
                                    iconCDN2 = "";
                                }
                                arrayList3.add(new CraftItemCategoryFilter(filterId, filterName, jColor, categoryFilterId, null, R.dimen._1wdp, false, BitmapUtilsKt.getBitmapFromZip$default(application, str, StringExtensionKt.getImageTypePathInCDN$default(iconCDN2, 0, 0, 3, null), 0.0f, 0.0f, 24, null), 80, null));
                            }
                            arrayList.add(new CraftCategoryFilter(craftJsonCategoryFilter.getCategoryFilterId(), craftJsonCategoryFilter.getCategoryFilterName(), arrayList3));
                            i10 = 10;
                        }
                        z3 = i3 != 3;
                        MarketplaceTab marketplaceTab2 = new MarketplaceTab(z3, 1, marketplaceViewModel.stringResources.getString(R.string.marketplace_profile_tab), R.drawable.ic_user, R.drawable.ic_user, false, false, null, 224, null);
                        MarketplaceTab marketplaceTab3 = new MarketplaceTab(z3, 2, marketplaceViewModel.stringResources.getString(R.string.marketplace_main_tab), R.drawable.ic_home, R.drawable.ic_marketplace, true, false, null, 192, null);
                        String upperCase = marketplaceViewModel.stringResources.getString(R.string.marketplace_history_tab).toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new MarketplaceTab[]{marketplaceTab2, marketplaceTab3, new MarketplaceTab(z3, 3, upperCase, R.drawable.ic_history, R.drawable.ic_history, false, false, MarketplaceSortFilter.NEW, 96, null), new MarketplaceTab(z3, 4, marketplaceViewModel.stringResources.getString(R.string.marketplace_favorites_tab), R.drawable.ic_heart, R.drawable.ic_heart, false, false, null, 224, null), new MarketplaceTab(z3, 5, marketplaceViewModel.stringResources.getString(R.string.marketplace_my_store_tab), R.drawable.ic_list, R.drawable.ic_list, false, false, null, 224, null)});
                        marketplaceTab = (MarketplaceTab) listListOf.get(1);
                        bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(marketplaceViewModel.application, PngConstantsId77.BG_MARKETPLACE, ImageTypePathInCDNEnum.BACKGROUND, 0.0f, 0.0f, 24, null);
                        mutableStateFlow = marketplaceViewModel.get_uiState();
                        while (true) {
                            value = mutableStateFlow.getValue();
                            marketplaceUiState = value;
                            list = listListOf;
                            arrayList2 = arrayList;
                            i6 = i4;
                            i7 = i5;
                            mutableStateFlow2 = mutableStateFlow;
                            List<InvItems> list7 = list2;
                            if (mutableStateFlow2.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : marketplaceLimits2, ((-1) & 8) != 0 ? marketplaceUiState.money : iOptInt, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : z3, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : list2, ((-1) & 64) != 0 ? marketplaceUiState.products : list5, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : list, ((-1) & 512) != 0 ? marketplaceUiState.filterList : arrayList2, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : marketplaceTab, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : iOptInt7, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : i7, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : i3, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : i6, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : listCalculatePaginatorPagesToShow$default, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : z5, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : z2, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : bitmapFromZip$default, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false))) {
                                mutableStateFlow = mutableStateFlow2;
                                listListOf = list;
                                arrayList = arrayList2;
                                i4 = i6;
                                i5 = i7;
                                list2 = list7;
                            } else {
                                unit = Unit.INSTANCE;
                            }
                        }
                    } else {
                        z = false;
                    }
                    marketplaceLimits = new MarketplaceLimits(0, 0, 0, 0, false, 0, 0, 127, null);
                    z2 = z;
                    marketplaceLimits2 = marketplaceLimits;
                    List<CraftJsonCategoryFilter> list62 = list4;
                    int i102 = 10;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list62, 10));
                    while (r11.hasNext()) {
                    }
                    if (i3 != 3) {
                    }
                    MarketplaceTab marketplaceTab22 = new MarketplaceTab(z3, 1, marketplaceViewModel.stringResources.getString(R.string.marketplace_profile_tab), R.drawable.ic_user, R.drawable.ic_user, false, false, null, 224, null);
                    MarketplaceTab marketplaceTab32 = new MarketplaceTab(z3, 2, marketplaceViewModel.stringResources.getString(R.string.marketplace_main_tab), R.drawable.ic_home, R.drawable.ic_marketplace, true, false, null, 192, null);
                    String upperCase2 = marketplaceViewModel.stringResources.getString(R.string.marketplace_history_tab).toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                    listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new MarketplaceTab[]{marketplaceTab22, marketplaceTab32, new MarketplaceTab(z3, 3, upperCase2, R.drawable.ic_history, R.drawable.ic_history, false, false, MarketplaceSortFilter.NEW, 96, null), new MarketplaceTab(z3, 4, marketplaceViewModel.stringResources.getString(R.string.marketplace_favorites_tab), R.drawable.ic_heart, R.drawable.ic_heart, false, false, null, 224, null), new MarketplaceTab(z3, 5, marketplaceViewModel.stringResources.getString(R.string.marketplace_my_store_tab), R.drawable.ic_list, R.drawable.ic_list, false, false, null, 224, null)});
                    marketplaceTab = (MarketplaceTab) listListOf.get(1);
                    bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(marketplaceViewModel.application, PngConstantsId77.BG_MARKETPLACE, ImageTypePathInCDNEnum.BACKGROUND, 0.0f, 0.0f, 24, null);
                    mutableStateFlow = marketplaceViewModel.get_uiState();
                    while (true) {
                        value = mutableStateFlow.getValue();
                        marketplaceUiState = value;
                        list = listListOf;
                        arrayList2 = arrayList;
                        i6 = i4;
                        i7 = i5;
                        mutableStateFlow2 = mutableStateFlow;
                        List<InvItems> list72 = list2;
                        if (mutableStateFlow2.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : marketplaceLimits2, ((-1) & 8) != 0 ? marketplaceUiState.money : iOptInt, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : z3, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : list2, ((-1) & 64) != 0 ? marketplaceUiState.products : list5, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : list, ((-1) & 512) != 0 ? marketplaceUiState.filterList : arrayList2, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : marketplaceTab, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : iOptInt7, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : i7, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : i3, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : i6, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : listCalculatePaginatorPagesToShow$default, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : z5, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : z2, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : bitmapFromZip$default, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false))) {
                        }
                        mutableStateFlow = mutableStateFlow2;
                        listListOf = list;
                        arrayList = arrayList2;
                        i4 = i6;
                        i5 = i7;
                        list2 = list72;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return unit;
        }
    }

    public final void initJson(@NotNull JSONObject json, @NotNull List<CraftJsonCategoryFilter> marketplaceCategoriesFilters, @NotNull List<InvItems> inventoryItems, @NotNull List<MarketplaceConfig> marketplaceConfigList) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(marketplaceCategoriesFilters, "marketplaceCategoriesFilters");
        Intrinsics.checkNotNullParameter(inventoryItems, "inventoryItems");
        Intrinsics.checkNotNullParameter(marketplaceConfigList, "marketplaceConfigList");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C42791(json, inventoryItems, marketplaceConfigList, marketplaceCategoriesFilters, null), 1, null);
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onPacketIncoming$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onPacketIncoming$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1769:1\n1#2:1770\n230#3,5:1771\n230#3,5:1776\n230#3,5:1783\n230#3,5:1788\n230#3,5:1793\n230#3,5:1798\n230#3,5:1803\n230#3,5:1808\n230#3,5:1813\n230#3,5:1818\n230#3,5:1823\n230#3,5:1832\n230#3,5:1841\n230#3,5:1846\n230#3,5:1851\n230#3,5:1856\n230#3,5:1861\n230#3,5:1870\n230#3,5:1875\n1855#4,2:1781\n1549#4:1828\n1620#4,3:1829\n1549#4:1837\n1620#4,3:1838\n1549#4:1866\n1620#4,3:1867\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onPacketIncoming$1\n*L\n353#1:1771,5\n380#1:1776,5\n428#1:1783,5\n483#1:1788,5\n532#1:1793,5\n559#1:1798,5\n573#1:1803,5\n585#1:1808,5\n596#1:1813,5\n609#1:1818,5\n618#1:1823,5\n637#1:1832,5\n684#1:1841,5\n714#1:1846,5\n732#1:1851,5\n771#1:1856,5\n797#1:1861,5\n828#1:1870,5\n845#1:1875,5\n412#1:1781,2\n632#1:1828\n632#1:1829,3\n675#1:1837\n675#1:1838,3\n821#1:1866\n821#1:1867,3\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onPacketIncoming$1 */
    public static final class C43021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ MarketplaceViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43021(JSONObject jSONObject, MarketplaceViewModel marketplaceViewModel, Continuation<? super C43021> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = marketplaceViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C43021(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:316:0x1019 A[PHI: r10
  0x1019: PHI (r10v8 com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceRarityEnum) = 
  (r10v5 com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceRarityEnum)
  (r10v6 com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceRarityEnum)
  (r10v7 com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceRarityEnum)
 binds: [B:315:0x1017, B:318:0x1021, B:321:0x102a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x031f A[PHI: r2
  0x031f: PHI (r2v91 com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceRarityEnum) = 
  (r2v85 com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceRarityEnum)
  (r2v86 com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceRarityEnum)
  (r2v87 com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceRarityEnum)
  (r2v88 com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceRarityEnum)
 binds: [B:87:0x031d, B:90:0x0327, B:93:0x0330, B:96:0x0339] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object next;
            MarketplaceUiState value;
            MarketplaceUiState marketplaceUiState;
            MarketplaceUiState value2;
            MarketplaceUiState marketplaceUiState2;
            List listEmptyList;
            MarketplaceUiState value3;
            MarketplaceUiState marketplaceUiState3;
            MarketplaceUiState value4;
            MarketplaceUiState marketplaceUiState4;
            MarketplaceUiState value5;
            MarketplaceUiState marketplaceUiState5;
            MarketplaceUiState value6;
            MarketplaceUiState marketplaceUiState6;
            MarketplaceUiState value7;
            MarketplaceUiState marketplaceUiState7;
            MarketplaceUiState value8;
            MarketplaceUiState marketplaceUiState8;
            MarketplaceUiState value9;
            MarketplaceUiState marketplaceUiState9;
            MarketplaceUiState value10;
            MarketplaceUiState marketplaceUiState10;
            MarketplaceUiState value11;
            MarketplaceUiState marketplaceUiState11;
            MarketplaceUiState value12;
            MarketplaceUiState marketplaceUiState12;
            MarketplaceProduct marketplaceProductCopy;
            MarketplaceUiState value13;
            MarketplaceUiState marketplaceUiState13;
            MarketplaceUiState value14;
            MarketplaceUiState marketplaceUiState14;
            MarketplaceUiState value15;
            MarketplaceUiState marketplaceUiState15;
            MarketplaceRarityEnum rarity;
            MarketplaceProduct marketplaceProductCopy2;
            MutableStateFlow<MarketplaceUiState> mutableStateFlow;
            MarketplaceUiState value16;
            MarketplaceUiState marketplaceUiState16;
            Pair pairM7112to;
            MarketplaceUiState value17;
            MarketplaceUiState marketplaceUiState17;
            MarketplaceUiState value18;
            MarketplaceUiState marketplaceUiState18;
            MarketplaceUiState value19;
            MarketplaceUiState marketplaceUiState19;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int iOptInt = this.$json.optInt("t");
            MarketplaceProduct marketplaceProduct = null;
            List listEmptyList2 = null;
            List listEmptyList3 = null;
            List listEmptyList4 = null;
            List listAddVipProductCard = null;
            List listAddVipProductCard2 = null;
            switch (iOptInt) {
                case 1:
                    String strOptString = this.$json.optString("n");
                    int iOptInt2 = this.$json.optInt("id");
                    long jOptLong = this.$json.optLong("ct");
                    long jOptLong2 = this.$json.optLong("ma") * 1000;
                    int iOptInt3 = this.$json.optInt("tm");
                    JSONObject jSONObject = this.$json;
                    int iOptInt4 = jSONObject.optInt("cs", jSONObject.optInt("ct", 1));
                    int iOptInt5 = this.$json.optInt("r");
                    MarketplaceRarityEnum marketplaceRarityEnum = MarketplaceRarityEnum.COMMON;
                    if (iOptInt5 != marketplaceRarityEnum.getValue()) {
                        MarketplaceRarityEnum marketplaceRarityEnum2 = MarketplaceRarityEnum.UNCOMMON;
                        if (iOptInt5 == marketplaceRarityEnum2.getValue()) {
                            marketplaceRarityEnum = marketplaceRarityEnum2;
                        } else {
                            marketplaceRarityEnum2 = MarketplaceRarityEnum.RARE;
                            if (iOptInt5 != marketplaceRarityEnum2.getValue()) {
                                marketplaceRarityEnum2 = MarketplaceRarityEnum.EPIC;
                                if (iOptInt5 == marketplaceRarityEnum2.getValue()) {
                                }
                            }
                        }
                    }
                    String string = this.this$0.stringResources.getString(this.this$0.getCountTemplate(jOptLong), Boxing.boxInt(this.this$0.getTrimmedCount(jOptLong)));
                    String string2 = this.this$0.stringResources.getString(R.string.common_string_with_ruble, this.this$0.stringResources.getString(this.this$0.getCountTemplate(jOptLong2), Boxing.boxInt(this.this$0.getTrimmedCount(jOptLong2))));
                    String strOptString2 = this.$json.optString(MarketplaceKeys.MARKETPLACE_PRODUCTS_NAME_KEY);
                    Iterator<T> it = this.this$0.get_uiState().getValue().getAllInventoryItems().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (((InvItems) next).getId() == iOptInt3) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    InvItems invItems = (InvItems) next;
                    if (invItems != null) {
                        Intrinsics.checkNotNull(strOptString2);
                        marketplaceProduct = MarketplaceProductKt.toMarketplaceProduct(invItems, iOptInt4, marketplaceRarityEnum, strOptString2);
                    }
                    Intrinsics.checkNotNull(strOptString);
                    MarketplaceProfileInfo marketplaceProfileInfo = new MarketplaceProfileInfo(strOptString, iOptInt2, marketplaceProduct, string, string2);
                    MutableStateFlow<MarketplaceUiState> mutableStateFlow2 = this.this$0.get_uiState();
                    do {
                        value = mutableStateFlow2.getValue();
                        marketplaceUiState = value;
                    } while (!mutableStateFlow2.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : marketplaceProfileInfo, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false)));
                case 2:
                    MutableStateFlow<MarketplaceUiState> mutableStateFlow3 = this.this$0.get_uiState();
                    JSONObject jSONObject2 = this.$json;
                    MarketplaceViewModel marketplaceViewModel = this.this$0;
                    synchronized (mutableStateFlow3) {
                        try {
                            int iOptInt6 = jSONObject2.optInt(MarketplaceKeys.MARKETPLACE_PAGES_KEY, 1);
                            List listCalculatePaginatorPagesToShow$default = MarketplaceViewModel.calculatePaginatorPagesToShow$default(marketplaceViewModel, 0, iOptInt6, 1, null);
                            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("n");
                            if (jSONArrayOptJSONArray != null) {
                                listAddVipProductCard2 = MarketplaceProductKt.mapToMarketplaceProducts(jSONArrayOptJSONArray, marketplaceViewModel.get_uiState().getValue().getAllInventoryItems(), (62 & 2) != 0 ? false : false, (62 & 4) == 0 ? false : false, (62 & 8) != 0 ? null : null, (62 & 16) != 0 ? null : null, (62 & 32) == 0 ? null : null);
                            }
                            if (listAddVipProductCard2 == null) {
                                listAddVipProductCard2 = CollectionsKt__CollectionsKt.emptyList();
                            }
                            zIsCanPublishProductCards = listAddVipProductCard2.size() > 4;
                            int iOptInt7 = jSONObject2.optInt("tm", marketplaceViewModel.getUiState().getValue().getTimeVipCard());
                            int typeVip = marketplaceViewModel.get_uiState().getValue().getTypeVip();
                            if (IntExtensionKt.isNotZero(Boxing.boxInt(iOptInt7)) && typeVip != 3) {
                                listAddVipProductCard2 = marketplaceViewModel.addVipProductCard(listAddVipProductCard2, marketplaceViewModel.get_uiState().getValue().getPriceVip(), iOptInt7);
                            }
                            MutableStateFlow<MarketplaceUiState> mutableStateFlow4 = marketplaceViewModel.get_uiState();
                            do {
                                value2 = mutableStateFlow4.getValue();
                                marketplaceUiState2 = value2;
                            } while (!mutableStateFlow4.compareAndSet(value2, marketplaceUiState2.copy(((-1) & 1) != 0 ? marketplaceUiState2.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState2.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState2.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState2.money : 0, ((-1) & 16) != 0 ? marketplaceUiState2.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState2.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState2.products : listAddVipProductCard2, ((-1) & 128) != 0 ? marketplaceUiState2.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState2.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState2.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState2.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState2.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState2.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState2.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState2.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState2.totalPages : iOptInt6, ((-1) & 65536) != 0 ? marketplaceUiState2.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState2.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState2.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState2.pagesToShow : listCalculatePaginatorPagesToShow$default, ((-1) & 1048576) != 0 ? marketplaceUiState2.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState2.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState2.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState2.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState2.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState2.isScrollBarVisible : zIsCanPublishProductCards, ((-1) & 67108864) != 0 ? marketplaceUiState2.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState2.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState2.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState2.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState2.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState2.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState2.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState2.isNeedClose : false)));
                            Unit unit = Unit.INSTANCE;
                            break;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                case 3:
                    Pair pairM7112to2 = TuplesKt.m7112to(Boxing.boxBoolean(false), Boxing.boxBoolean(false));
                    boolean zBooleanValue = ((Boolean) pairM7112to2.component1()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) pairM7112to2.component2()).booleanValue();
                    JSONArray jSONArrayOptJSONArray2 = this.$json.optJSONArray("n");
                    if (jSONArrayOptJSONArray2 != null) {
                        listEmptyList = MarketplaceProductKt.mapToMarketplaceProducts(jSONArrayOptJSONArray2, this.this$0.get_uiState().getValue().getAllInventoryItems(), (62 & 2) != 0 ? false : zBooleanValue, (62 & 4) == 0 ? zBooleanValue2 : false, (62 & 8) != 0 ? null : null, (62 & 16) != 0 ? null : null, (62 & 32) == 0 ? null : null);
                    } else {
                        listEmptyList = null;
                    }
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    }
                    boolean z = listEmptyList.size() > 8;
                    List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listEmptyList);
                    MarketplaceProduct marketplaceProduct2 = (MarketplaceProduct) CollectionsKt___CollectionsKt.firstOrNull(mutableList);
                    if (marketplaceProduct2 != null) {
                        marketplaceProduct2.setSelected(true);
                    }
                    MarketplaceProduct marketplaceProduct3 = (MarketplaceProduct) CollectionsKt___CollectionsKt.firstOrNull(listEmptyList);
                    if (marketplaceProduct3 == null) {
                        marketplaceProduct3 = new MarketplaceProduct(false, null, null, null, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, null, false, false, false, false, null, ViewCompat.MEASURED_SIZE_MASK, null);
                    }
                    MarketplaceProduct marketplaceProduct4 = marketplaceProduct3;
                    String unixTimeMarketplace = FormatUtilsKt.formatUnixTimeMarketplace(this.$json.optInt("tb"));
                    int iOptInt8 = this.$json.optInt("ct");
                    long jOptInt = this.$json.optInt("cs");
                    String strOptString3 = this.$json.optString("nm");
                    int iOptInt9 = this.$json.optInt(MarketplaceKeys.MARKETPLACE_PAGES_KEY, 1);
                    List listCalculatePaginatorPagesToShow$default2 = MarketplaceViewModel.calculatePaginatorPagesToShow$default(this.this$0, 0, iOptInt9, 1, null);
                    String strOptString4 = this.$json.optString(MarketplaceKeys.MARKETPLACE_PRODUCTS_NAME_KEY);
                    Intrinsics.checkNotNull(strOptString4);
                    Intrinsics.checkNotNull(strOptString3);
                    MarketplaceProduct marketplaceProductCopy3 = marketplaceProduct4.copy((16775167 & 1) != 0 ? marketplaceProduct4.isPlatinumVipProduct : false, (16775167 & 2) != 0 ? marketplaceProduct4.name : strOptString4, (16775167 & 4) != 0 ? marketplaceProduct4.imageName : null, (16775167 & 8) != 0 ? marketplaceProduct4.rarity : null, (16775167 & 16) != 0 ? marketplaceProduct4.typeProductCard : null, (16775167 & 32) != 0 ? marketplaceProduct4.id : 0, (16775167 & 64) != 0 ? marketplaceProduct4.notificationType : null, (16775167 & 128) != 0 ? marketplaceProduct4.timeVipCard : 0, (16775167 & 256) != 0 ? marketplaceProduct4.time : 0, (16775167 & 512) != 0 ? marketplaceProduct4.timeTemplate : 0, (16775167 & 1024) != 0 ? marketplaceProduct4.inventoryId : 0, (16775167 & 2048) != 0 ? marketplaceProduct4.price : jOptInt, (16775167 & 4096) != 0 ? marketplaceProduct4.count : iOptInt8, (16775167 & 8192) != 0 ? marketplaceProduct4.seller : strOptString3, (16775167 & 16384) != 0 ? marketplaceProduct4.description : null, (16775167 & 32768) != 0 ? marketplaceProduct4.timeText : unixTimeMarketplace, (16775167 & 65536) != 0 ? marketplaceProduct4.weight : 0.0d, (16775167 & 131072) != 0 ? marketplaceProduct4.typeTextRes : 0, (262144 & 16775167) != 0 ? marketplaceProduct4.statusForHistory : null, (16775167 & 524288) != 0 ? marketplaceProduct4.isSelected : false, (16775167 & 1048576) != 0 ? marketplaceProduct4.isUser : false, (16775167 & 2097152) != 0 ? marketplaceProduct4.isPublished : false, (16775167 & 4194304) != 0 ? marketplaceProduct4.isHaveLike : false, (16775167 & 8388608) != 0 ? marketplaceProduct4.renderInfo : null);
                    MutableStateFlow<MarketplaceUiState> mutableStateFlow5 = this.this$0.get_uiState();
                    do {
                        value3 = mutableStateFlow5.getValue();
                        marketplaceUiState3 = value3;
                    } while (!mutableStateFlow5.compareAndSet(value3, marketplaceUiState3.copy(((-1) & 1) != 0 ? marketplaceUiState3.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState3.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState3.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState3.money : 0, ((-1) & 16) != 0 ? marketplaceUiState3.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState3.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState3.products : mutableList, ((-1) & 128) != 0 ? marketplaceUiState3.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState3.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState3.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState3.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState3.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState3.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState3.selectedProduct : marketplaceProductCopy3, ((-1) & 16384) != 0 ? marketplaceUiState3.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState3.totalPages : iOptInt9, ((-1) & 65536) != 0 ? marketplaceUiState3.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState3.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState3.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState3.pagesToShow : listCalculatePaginatorPagesToShow$default2, ((-1) & 1048576) != 0 ? marketplaceUiState3.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState3.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState3.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState3.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState3.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState3.isScrollBarVisible : z, ((-1) & 67108864) != 0 ? marketplaceUiState3.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState3.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState3.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState3.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState3.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState3.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState3.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState3.isNeedClose : false)));
                case 4:
                case 8:
                case 21:
                    MutableStateFlow<MarketplaceUiState> mutableStateFlow6 = this.this$0.get_uiState();
                    JSONObject jSONObject3 = this.$json;
                    MarketplaceViewModel marketplaceViewModel2 = this.this$0;
                    synchronized (mutableStateFlow6) {
                        try {
                            int iOptInt10 = jSONObject3.optInt(MarketplaceKeys.MARKETPLACE_PAGES_KEY, 1);
                            List listCalculatePaginatorPagesToShow$default3 = MarketplaceViewModel.calculatePaginatorPagesToShow$default(marketplaceViewModel2, 0, iOptInt10, 1, null);
                            Pair pairM7112to3 = TuplesKt.m7112to(Boxing.boxBoolean(false), Boxing.boxBoolean(false));
                            boolean zBooleanValue3 = ((Boolean) pairM7112to3.component1()).booleanValue();
                            boolean zBooleanValue4 = ((Boolean) pairM7112to3.component2()).booleanValue();
                            boolean z2 = iOptInt == 4;
                            JSONArray jSONArrayOptJSONArray3 = jSONObject3.optJSONArray("n");
                            if (jSONArrayOptJSONArray3 != null) {
                                listAddVipProductCard = MarketplaceProductKt.mapToMarketplaceProducts(jSONArrayOptJSONArray3, marketplaceViewModel2.get_uiState().getValue().getAllInventoryItems(), (62 & 2) != 0 ? false : zBooleanValue3, (62 & 4) == 0 ? zBooleanValue4 : false, (62 & 8) != 0 ? null : Boxing.boxBoolean(z2), (62 & 16) != 0 ? null : null, (62 & 32) == 0 ? null : null);
                            }
                            if (listAddVipProductCard == null) {
                                listAddVipProductCard = CollectionsKt__CollectionsKt.emptyList();
                            }
                            if (marketplaceViewModel2.get_uiState().getValue().getSelectedTab().getTabValue() == 2 && iOptInt == 8) {
                                MarketplaceUiState value20 = marketplaceViewModel2.get_uiState().getValue();
                                Triple triple = new Triple(Boxing.boxInt(value20.getTimeVipCard()), Boxing.boxInt(value20.getTypeVip()), Boxing.boxInt(value20.getPriceVip()));
                                int iIntValue = ((Number) triple.component1()).intValue();
                                int iIntValue2 = ((Number) triple.component2()).intValue();
                                int iIntValue3 = ((Number) triple.component3()).intValue();
                                if (IntExtensionKt.isNotZero(Boxing.boxInt(iIntValue)) && iIntValue2 != 3) {
                                    listAddVipProductCard = marketplaceViewModel2.addVipProductCard(listAddVipProductCard, iIntValue3, iIntValue);
                                }
                            }
                            zIsCanPublishProductCards = listAddVipProductCard.size() > 4;
                            MutableStateFlow<MarketplaceUiState> mutableStateFlow7 = marketplaceViewModel2.get_uiState();
                            do {
                                value4 = mutableStateFlow7.getValue();
                                marketplaceUiState4 = value4;
                            } while (!mutableStateFlow7.compareAndSet(value4, marketplaceUiState4.copy(((-1) & 1) != 0 ? marketplaceUiState4.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState4.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState4.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState4.money : 0, ((-1) & 16) != 0 ? marketplaceUiState4.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState4.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState4.products : listAddVipProductCard, ((-1) & 128) != 0 ? marketplaceUiState4.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState4.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState4.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState4.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState4.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState4.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState4.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState4.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState4.totalPages : iOptInt10, ((-1) & 65536) != 0 ? marketplaceUiState4.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState4.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState4.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState4.pagesToShow : listCalculatePaginatorPagesToShow$default3, ((-1) & 1048576) != 0 ? marketplaceUiState4.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState4.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState4.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState4.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState4.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState4.isScrollBarVisible : zIsCanPublishProductCards, ((-1) & 67108864) != 0 ? marketplaceUiState4.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState4.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState4.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState4.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState4.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState4.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState4.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState4.isNeedClose : false)));
                            Unit unit2 = Unit.INSTANCE;
                            break;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                case 5:
                    MutableStateFlow<MarketplaceUiState> mutableStateFlow8 = this.this$0.get_uiState();
                    JSONObject jSONObject4 = this.$json;
                    MarketplaceViewModel marketplaceViewModel3 = this.this$0;
                    synchronized (mutableStateFlow8) {
                        try {
                            int iOptInt11 = jSONObject4.optInt(MarketplaceKeys.MARKETPLACE_PAGES_KEY, 1);
                            List listCalculatePaginatorPagesToShow$default4 = MarketplaceViewModel.calculatePaginatorPagesToShow$default(marketplaceViewModel3, 0, iOptInt11, 1, null);
                            List<MarketplaceTab> mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) marketplaceViewModel3.get_uiState().getValue().getTabs());
                            Pair pairM7112to4 = TuplesKt.m7112to(Boxing.boxBoolean(true), Boxing.boxBoolean(true));
                            boolean zBooleanValue5 = ((Boolean) pairM7112to4.component1()).booleanValue();
                            boolean zBooleanValue6 = ((Boolean) pairM7112to4.component2()).booleanValue();
                            MarketplaceTab selectedTab = marketplaceViewModel3.get_uiState().getValue().getSelectedTab();
                            JSONArray jSONArrayOptJSONArray4 = jSONObject4.optJSONArray("n");
                            if (jSONArrayOptJSONArray4 != null) {
                                listEmptyList4 = MarketplaceProductKt.mapToMarketplaceProducts(jSONArrayOptJSONArray4, marketplaceViewModel3.get_uiState().getValue().getAllInventoryItems(), (62 & 2) != 0 ? false : zBooleanValue5, (62 & 4) == 0 ? zBooleanValue6 : false, (62 & 8) != 0 ? null : Boxing.boxBoolean(false), (62 & 16) != 0 ? null : null, (62 & 32) == 0 ? null : null);
                            }
                            if (listEmptyList4 == null) {
                                listEmptyList4 = CollectionsKt__CollectionsKt.emptyList();
                            }
                            boolean z3 = listEmptyList4.size() > 4;
                            MarketplaceBottomSheetInfo bottomSheetInfo = marketplaceViewModel3.get_uiState().getValue().getBottomSheetInfo();
                            if (marketplaceViewModel3.get_uiState().getValue().isWaitingServerResponseForPublishing()) {
                                for (MarketplaceTab marketplaceTab : mutableList2) {
                                    if (marketplaceTab.getTabValue() == 5) {
                                        selectedTab = marketplaceTab.copy((223 & 1) != 0 ? marketplaceTab.isHasPlatinumVip : false, (223 & 2) != 0 ? marketplaceTab.tabValue : 0, (223 & 4) != 0 ? marketplaceTab.tabName : null, (223 & 8) != 0 ? marketplaceTab.icon : 0, (223 & 16) != 0 ? marketplaceTab.titleIcon : 0, (223 & 32) != 0 ? marketplaceTab.isSelected : true, (223 & 64) != 0 ? marketplaceTab.isHaveUpdates : false, (223 & 128) != 0 ? marketplaceTab.savedSortFilter : null);
                                        marketplaceTab.setSelected(true);
                                    } else {
                                        marketplaceTab.setSelected(false);
                                    }
                                }
                                MarketplaceBottomSheetInfo bottomSheetInfo2 = marketplaceViewModel3.get_uiState().getValue().getBottomSheetInfo();
                                bottomSheetInfo = bottomSheetInfo2.copy((1 & 1) != 0 ? bottomSheetInfo2.tabValue : selectedTab != null ? selectedTab.getTabValue() : 5, (1 & 2) != 0 ? bottomSheetInfo2.isCheckBoxChecked : false, (1 & 4) != 0 ? bottomSheetInfo2.productCount : 0, (1 & 8) != 0 ? bottomSheetInfo2.price : 0L, (1 & 16) != 0 ? bottomSheetInfo2.priceForAll : 0L, (1 & 32) != 0 ? bottomSheetInfo2.priceForPublish : 0, (1 & 64) != 0 ? bottomSheetInfo2.addsValue : 0);
                            }
                            MarketplaceTab marketplaceTab2 = selectedTab;
                            if (marketplaceTab2 != null) {
                                MutableStateFlow<MarketplaceUiState> mutableStateFlow9 = marketplaceViewModel3.get_uiState();
                                do {
                                    value5 = mutableStateFlow9.getValue();
                                    marketplaceUiState5 = value5;
                                } while (!mutableStateFlow9.compareAndSet(value5, marketplaceUiState5.copy(((-1) & 1) != 0 ? marketplaceUiState5.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState5.bottomSheetInfo : bottomSheetInfo, ((-1) & 4) != 0 ? marketplaceUiState5.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState5.money : 0, ((-1) & 16) != 0 ? marketplaceUiState5.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState5.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState5.products : listEmptyList4, ((-1) & 128) != 0 ? marketplaceUiState5.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState5.tabs : mutableList2, ((-1) & 512) != 0 ? marketplaceUiState5.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState5.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState5.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState5.selectedTab : marketplaceTab2, ((-1) & 8192) != 0 ? marketplaceUiState5.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState5.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState5.totalPages : iOptInt11, ((-1) & 65536) != 0 ? marketplaceUiState5.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState5.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState5.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState5.pagesToShow : listCalculatePaginatorPagesToShow$default4, ((-1) & 1048576) != 0 ? marketplaceUiState5.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState5.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState5.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState5.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState5.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState5.isScrollBarVisible : z3, ((-1) & 67108864) != 0 ? marketplaceUiState5.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState5.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState5.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState5.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState5.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState5.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState5.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState5.isNeedClose : false)));
                                Unit unit3 = Unit.INSTANCE;
                            }
                            break;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                case 9:
                    int iOptInt12 = this.$json.optInt(MarketplaceKeys.MARKETPLACE_PAGES_KEY, 1);
                    List listCalculatePaginatorPagesToShow$default5 = MarketplaceViewModel.calculatePaginatorPagesToShow$default(this.this$0, 0, iOptInt12, 1, null);
                    JSONArray jSONArrayOptJSONArray5 = this.$json.optJSONArray("n");
                    if (jSONArrayOptJSONArray5 != null) {
                        listEmptyList3 = MarketplaceProductKt.mapToMarketplaceProducts(jSONArrayOptJSONArray5, this.this$0.get_uiState().getValue().getAllInventoryItems(), (62 & 2) != 0 ? false : false, (62 & 4) == 0, (62 & 8) != 0 ? null : Boxing.boxBoolean(false), (62 & 16) != 0 ? null : Boxing.boxInt(this.this$0.get_uiState().getValue().getMarketplaceLimits().getPlacementHours()), (62 & 32) == 0 ? MarketplaceTypeProductCardEnum.COMMON : null);
                    }
                    if (listEmptyList3 == null) {
                        listEmptyList3 = CollectionsKt__CollectionsKt.emptyList();
                    }
                    List list = listEmptyList3;
                    boolean z4 = list.size() > 4;
                    MutableStateFlow<MarketplaceUiState> mutableStateFlow10 = this.this$0.get_uiState();
                    do {
                        value6 = mutableStateFlow10.getValue();
                        marketplaceUiState6 = value6;
                    } while (!mutableStateFlow10.compareAndSet(value6, marketplaceUiState6.copy(((-1) & 1) != 0 ? marketplaceUiState6.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState6.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState6.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState6.money : 0, ((-1) & 16) != 0 ? marketplaceUiState6.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState6.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState6.products : list, ((-1) & 128) != 0 ? marketplaceUiState6.inventoryProducts : list, ((-1) & 256) != 0 ? marketplaceUiState6.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState6.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState6.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState6.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState6.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState6.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState6.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState6.totalPages : iOptInt12, ((-1) & 65536) != 0 ? marketplaceUiState6.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState6.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState6.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState6.pagesToShow : listCalculatePaginatorPagesToShow$default5, ((-1) & 1048576) != 0 ? marketplaceUiState6.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState6.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState6.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState6.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState6.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState6.isScrollBarVisible : z4, ((-1) & 67108864) != 0 ? marketplaceUiState6.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState6.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState6.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState6.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState6.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState6.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState6.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState6.isNeedClose : false)));
                case 10:
                    int iOptInt13 = this.$json.optInt(MarketplaceKeys.MARKETPLACE_ADDS_COUNT_KEY);
                    MarketplaceLimits marketplaceLimitsCopy$default = MarketplaceLimits.copy$default(this.this$0.get_uiState().getValue().getMarketplaceLimits(), 0, iOptInt13, 0, 0, false, 0, 0, 125, null);
                    MarketplaceBottomSheetInfo bottomSheetInfo3 = this.this$0.get_uiState().getValue().getBottomSheetInfo();
                    MarketplaceBottomSheetInfo marketplaceBottomSheetInfoCopy = bottomSheetInfo3.copy((1 & 1) != 0 ? bottomSheetInfo3.tabValue : 0, (1 & 2) != 0 ? bottomSheetInfo3.isCheckBoxChecked : false, (1 & 4) != 0 ? bottomSheetInfo3.productCount : 0, (1 & 8) != 0 ? bottomSheetInfo3.price : 0L, (1 & 16) != 0 ? bottomSheetInfo3.priceForAll : 0L, (1 & 32) != 0 ? bottomSheetInfo3.priceForPublish : 0, (1 & 64) != 0 ? bottomSheetInfo3.addsValue : iOptInt13);
                    MutableStateFlow<MarketplaceUiState> mutableStateFlow11 = this.this$0.get_uiState();
                    do {
                        value7 = mutableStateFlow11.getValue();
                        marketplaceUiState7 = value7;
                    } while (!mutableStateFlow11.compareAndSet(value7, marketplaceUiState7.copy(((-1) & 1) != 0 ? marketplaceUiState7.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState7.bottomSheetInfo : marketplaceBottomSheetInfoCopy, ((-1) & 4) != 0 ? marketplaceUiState7.marketplaceLimits : marketplaceLimitsCopy$default, ((-1) & 8) != 0 ? marketplaceUiState7.money : 0, ((-1) & 16) != 0 ? marketplaceUiState7.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState7.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState7.products : null, ((-1) & 128) != 0 ? marketplaceUiState7.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState7.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState7.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState7.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState7.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState7.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState7.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState7.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState7.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState7.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState7.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState7.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState7.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState7.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState7.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState7.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState7.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState7.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState7.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState7.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState7.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState7.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState7.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState7.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState7.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState7.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState7.isNeedClose : false)));
                case 11:
                    if (IntExtensionKt.isNotZero(Boxing.boxInt(this.$json.optInt("err")))) {
                        MutableStateFlow<MarketplaceUiState> mutableStateFlow12 = this.this$0.get_uiState();
                        do {
                            value8 = mutableStateFlow12.getValue();
                            marketplaceUiState8 = value8;
                        } while (!mutableStateFlow12.compareAndSet(value8, marketplaceUiState8.copy(((-1) & 1) != 0 ? marketplaceUiState8.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState8.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState8.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState8.money : 0, ((-1) & 16) != 0 ? marketplaceUiState8.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState8.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState8.products : null, ((-1) & 128) != 0 ? marketplaceUiState8.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState8.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState8.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState8.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState8.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState8.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState8.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState8.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState8.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState8.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState8.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState8.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState8.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState8.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState8.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState8.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState8.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState8.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState8.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState8.isBottomSheetBlockVisible : true, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState8.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState8.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState8.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState8.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState8.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState8.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState8.isNeedClose : false)));
                    }
                    break;
                case 12:
                    MarketplaceProduct selectedProduct = this.this$0.get_uiState().getValue().getSelectedProduct();
                    MarketplaceBottomSheetInfo bottomSheetInfo4 = this.this$0.get_uiState().getValue().getBottomSheetInfo();
                    int iOptInt14 = this.$json.optInt("md", selectedProduct.getInventoryId());
                    Long lBoxLong = Boxing.boxLong(this.$json.optLong("cs", selectedProduct.getPrice()));
                    Long l = lBoxLong.longValue() > -1 ? lBoxLong : null;
                    long jLongValue = l != null ? l.longValue() : selectedProduct.getPrice();
                    String strOptString5 = this.$json.optString("sl", selectedProduct.getSeller());
                    int iOptInt15 = iOptInt14 != 134 ? this.$json.optInt("ct", selectedProduct.getCount()) : 1;
                    MarketplaceBottomSheetInfo marketplaceBottomSheetInfoCopy2 = bottomSheetInfo4.copy((1 & 1) != 0 ? bottomSheetInfo4.tabValue : 0, (1 & 2) != 0 ? bottomSheetInfo4.isCheckBoxChecked : false, (1 & 4) != 0 ? bottomSheetInfo4.productCount : iOptInt15, (1 & 8) != 0 ? bottomSheetInfo4.price : jLongValue, (1 & 16) != 0 ? bottomSheetInfo4.priceForAll : jLongValue, (1 & 32) != 0 ? bottomSheetInfo4.priceForPublish : 0, (1 & 64) != 0 ? bottomSheetInfo4.addsValue : 0);
                    List mutableList3 = CollectionsKt___CollectionsKt.toMutableList((Collection) this.this$0.get_uiState().getValue().getProducts());
                    Intrinsics.checkNotNull(strOptString5);
                    MarketplaceProduct marketplaceProductCopy4 = selectedProduct.copy((16775167 & 1) != 0 ? selectedProduct.isPlatinumVipProduct : false, (16775167 & 2) != 0 ? selectedProduct.name : null, (16775167 & 4) != 0 ? selectedProduct.imageName : null, (16775167 & 8) != 0 ? selectedProduct.rarity : null, (16775167 & 16) != 0 ? selectedProduct.typeProductCard : null, (16775167 & 32) != 0 ? selectedProduct.id : 0, (16775167 & 64) != 0 ? selectedProduct.notificationType : null, (16775167 & 128) != 0 ? selectedProduct.timeVipCard : 0, (16775167 & 256) != 0 ? selectedProduct.time : 0, (16775167 & 512) != 0 ? selectedProduct.timeTemplate : 0, (16775167 & 1024) != 0 ? selectedProduct.inventoryId : iOptInt14, (16775167 & 2048) != 0 ? selectedProduct.price : jLongValue, (16775167 & 4096) != 0 ? selectedProduct.count : iOptInt15, (16775167 & 8192) != 0 ? selectedProduct.seller : strOptString5, (16775167 & 16384) != 0 ? selectedProduct.description : null, (16775167 & 32768) != 0 ? selectedProduct.timeText : null, (16775167 & 65536) != 0 ? selectedProduct.weight : 0.0d, (16775167 & 131072) != 0 ? selectedProduct.typeTextRes : 0, (262144 & 16775167) != 0 ? selectedProduct.statusForHistory : null, (16775167 & 524288) != 0 ? selectedProduct.isSelected : false, (16775167 & 1048576) != 0 ? selectedProduct.isUser : false, (16775167 & 2097152) != 0 ? selectedProduct.isPublished : false, (16775167 & 4194304) != 0 ? selectedProduct.isHaveLike : false, (16775167 & 8388608) != 0 ? selectedProduct.renderInfo : null);
                    if (jLongValue != selectedProduct.getPrice()) {
                        List<MarketplaceProduct> list2 = mutableList3;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        for (MarketplaceProduct marketplaceProduct5 : list2) {
                            if (marketplaceProduct5.getId() == selectedProduct.getId()) {
                                marketplaceProduct5 = marketplaceProductCopy4;
                            }
                            arrayList.add(marketplaceProduct5);
                        }
                    }
                    MutableStateFlow<MarketplaceUiState> mutableStateFlow13 = this.this$0.get_uiState();
                    do {
                        value9 = mutableStateFlow13.getValue();
                        marketplaceUiState9 = value9;
                    } while (!mutableStateFlow13.compareAndSet(value9, marketplaceUiState9.copy(((-1) & 1) != 0 ? marketplaceUiState9.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState9.bottomSheetInfo : marketplaceBottomSheetInfoCopy2, ((-1) & 4) != 0 ? marketplaceUiState9.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState9.money : 0, ((-1) & 16) != 0 ? marketplaceUiState9.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState9.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState9.products : mutableList3, ((-1) & 128) != 0 ? marketplaceUiState9.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState9.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState9.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState9.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState9.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState9.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState9.selectedProduct : marketplaceProductCopy4, ((-1) & 16384) != 0 ? marketplaceUiState9.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState9.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState9.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState9.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState9.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState9.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState9.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState9.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState9.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState9.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState9.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState9.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState9.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState9.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState9.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState9.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState9.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState9.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState9.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState9.isNeedClose : false)));
                case 13:
                    if (IntExtensionKt.isNotZero(Boxing.boxInt(this.$json.optInt("err")))) {
                        int iOptInt16 = this.$json.optInt("m");
                        MutableStateFlow<MarketplaceUiState> mutableStateFlow14 = this.this$0.get_uiState();
                        do {
                            value11 = mutableStateFlow14.getValue();
                            marketplaceUiState11 = value11;
                        } while (!mutableStateFlow14.compareAndSet(value11, marketplaceUiState11.copy(((-1) & 1) != 0 ? marketplaceUiState11.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState11.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState11.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState11.money : iOptInt16, ((-1) & 16) != 0 ? marketplaceUiState11.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState11.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState11.products : null, ((-1) & 128) != 0 ? marketplaceUiState11.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState11.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState11.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState11.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState11.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState11.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState11.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState11.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState11.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState11.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState11.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState11.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState11.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState11.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState11.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState11.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState11.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState11.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState11.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState11.isBottomSheetBlockVisible : true, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState11.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState11.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState11.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState11.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState11.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState11.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState11.isNeedClose : false)));
                    } else {
                        int iOptInt17 = this.$json.optInt("m");
                        MutableStateFlow<MarketplaceUiState> mutableStateFlow15 = this.this$0.get_uiState();
                        do {
                            value10 = mutableStateFlow15.getValue();
                            marketplaceUiState10 = value10;
                        } while (!mutableStateFlow15.compareAndSet(value10, marketplaceUiState10.copy(((-1) & 1) != 0 ? marketplaceUiState10.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState10.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState10.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState10.money : iOptInt17, ((-1) & 16) != 0 ? marketplaceUiState10.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState10.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState10.products : null, ((-1) & 128) != 0 ? marketplaceUiState10.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState10.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState10.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState10.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState10.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState10.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState10.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState10.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState10.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState10.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState10.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState10.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState10.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState10.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState10.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState10.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState10.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState10.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState10.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState10.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState10.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState10.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState10.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState10.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState10.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState10.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState10.isNeedClose : false)));
                    }
                    break;
                case 14:
                    if (IntExtensionKt.isNotZero(Boxing.boxInt(this.$json.optInt("err")))) {
                        int iOptInt18 = this.$json.optInt("id");
                        List<MarketplaceProduct> products = this.this$0.get_uiState().getValue().getProducts();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(products, 10));
                        for (MarketplaceProduct marketplaceProduct6 : products) {
                            MarketplaceProduct marketplaceProduct7 = marketplaceProduct6.getId() == iOptInt18 ? marketplaceProduct6 : null;
                            if (marketplaceProduct7 != null && (marketplaceProductCopy = marketplaceProduct7.copy((16775167 & 1) != 0 ? marketplaceProduct7.isPlatinumVipProduct : false, (16775167 & 2) != 0 ? marketplaceProduct7.name : null, (16775167 & 4) != 0 ? marketplaceProduct7.imageName : null, (16775167 & 8) != 0 ? marketplaceProduct7.rarity : null, (16775167 & 16) != 0 ? marketplaceProduct7.typeProductCard : null, (16775167 & 32) != 0 ? marketplaceProduct7.id : 0, (16775167 & 64) != 0 ? marketplaceProduct7.notificationType : null, (16775167 & 128) != 0 ? marketplaceProduct7.timeVipCard : 0, (16775167 & 256) != 0 ? marketplaceProduct7.time : 0, (16775167 & 512) != 0 ? marketplaceProduct7.timeTemplate : 0, (16775167 & 1024) != 0 ? marketplaceProduct7.inventoryId : 0, (16775167 & 2048) != 0 ? marketplaceProduct7.price : 0L, (16775167 & 4096) != 0 ? marketplaceProduct7.count : 0, (16775167 & 8192) != 0 ? marketplaceProduct7.seller : null, (16775167 & 16384) != 0 ? marketplaceProduct7.description : null, (16775167 & 32768) != 0 ? marketplaceProduct7.timeText : null, (16775167 & 65536) != 0 ? marketplaceProduct7.weight : 0.0d, (16775167 & 131072) != 0 ? marketplaceProduct7.typeTextRes : 0, (262144 & 16775167) != 0 ? marketplaceProduct7.statusForHistory : null, (16775167 & 524288) != 0 ? marketplaceProduct7.isSelected : false, (16775167 & 1048576) != 0 ? marketplaceProduct7.isUser : false, (16775167 & 2097152) != 0 ? marketplaceProduct7.isPublished : false, (16775167 & 4194304) != 0 ? marketplaceProduct7.isHaveLike : false, (16775167 & 8388608) != 0 ? marketplaceProduct7.renderInfo : null)) != null) {
                                marketplaceProduct6 = marketplaceProductCopy;
                            }
                            arrayList2.add(marketplaceProduct6);
                        }
                        MutableStateFlow<MarketplaceUiState> mutableStateFlow16 = this.this$0.get_uiState();
                        do {
                            value12 = mutableStateFlow16.getValue();
                            marketplaceUiState12 = value12;
                        } while (!mutableStateFlow16.compareAndSet(value12, marketplaceUiState12.copy(((-1) & 1) != 0 ? marketplaceUiState12.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState12.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState12.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState12.money : 0, ((-1) & 16) != 0 ? marketplaceUiState12.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState12.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState12.products : arrayList2, ((-1) & 128) != 0 ? marketplaceUiState12.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState12.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState12.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState12.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState12.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState12.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState12.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState12.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState12.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState12.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState12.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState12.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState12.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState12.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState12.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState12.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState12.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState12.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState12.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState12.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState12.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState12.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState12.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState12.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState12.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState12.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState12.isNeedClose : false)));
                    }
                    break;
                case 15:
                    MarketplaceProduct selectedProduct2 = this.this$0.get_uiState().getValue().getSelectedProduct();
                    MarketplaceBottomSheetInfo bottomSheetInfo5 = this.this$0.get_uiState().getValue().getBottomSheetInfo();
                    int iOptInt19 = this.$json.optInt(MarketplaceKeys.MARKETPLACE_ADDS_COUNT_KEY);
                    int priceForPublish = this.this$0.get_uiState().getValue().getMarketplaceLimits().getPriceForPublish();
                    int hotTicketCost = this.this$0.get_uiState().getValue().getMarketplaceLimits().getHotTicketCost();
                    if (bottomSheetInfo5.isCheckBoxChecked()) {
                        priceForPublish += hotTicketCost;
                    }
                    MarketplaceBottomSheetInfo marketplaceBottomSheetInfoCopy3 = bottomSheetInfo5.copy((1 & 1) != 0 ? bottomSheetInfo5.tabValue : 0, (1 & 2) != 0 ? bottomSheetInfo5.isCheckBoxChecked : false, (1 & 4) != 0 ? bottomSheetInfo5.productCount : selectedProduct2.getCount(), (1 & 8) != 0 ? bottomSheetInfo5.price : 0L, (1 & 16) != 0 ? bottomSheetInfo5.priceForAll : 0L, (1 & 32) != 0 ? bottomSheetInfo5.priceForPublish : priceForPublish, (1 & 64) != 0 ? bottomSheetInfo5.addsValue : iOptInt19);
                    MarketplaceLimits marketplaceLimitsCopy$default2 = MarketplaceLimits.copy$default(this.this$0.get_uiState().getValue().getMarketplaceLimits(), 0, iOptInt19, 0, 0, false, 0, 0, 125, null);
                    MutableStateFlow<MarketplaceUiState> mutableStateFlow17 = this.this$0.get_uiState();
                    do {
                        value13 = mutableStateFlow17.getValue();
                        marketplaceUiState13 = value13;
                    } while (!mutableStateFlow17.compareAndSet(value13, marketplaceUiState13.copy(((-1) & 1) != 0 ? marketplaceUiState13.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState13.bottomSheetInfo : marketplaceBottomSheetInfoCopy3, ((-1) & 4) != 0 ? marketplaceUiState13.marketplaceLimits : marketplaceLimitsCopy$default2, ((-1) & 8) != 0 ? marketplaceUiState13.money : 0, ((-1) & 16) != 0 ? marketplaceUiState13.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState13.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState13.products : null, ((-1) & 128) != 0 ? marketplaceUiState13.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState13.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState13.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState13.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState13.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState13.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState13.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState13.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState13.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState13.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState13.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState13.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState13.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState13.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState13.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState13.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState13.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState13.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState13.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState13.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState13.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState13.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState13.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState13.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState13.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState13.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState13.isNeedClose : false)));
                case 16:
                    if (IntExtensionKt.isNotZero(Boxing.boxInt(this.$json.optInt("err")))) {
                        MutableStateFlow<MarketplaceUiState> mutableStateFlow18 = this.this$0.get_uiState();
                        do {
                            value14 = mutableStateFlow18.getValue();
                            marketplaceUiState14 = value14;
                        } while (!mutableStateFlow18.compareAndSet(value14, marketplaceUiState14.copy(((-1) & 1) != 0 ? marketplaceUiState14.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState14.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState14.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState14.money : 0, ((-1) & 16) != 0 ? marketplaceUiState14.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState14.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState14.products : null, ((-1) & 128) != 0 ? marketplaceUiState14.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState14.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState14.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState14.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState14.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState14.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState14.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState14.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState14.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState14.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState14.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState14.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState14.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState14.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState14.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState14.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState14.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState14.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState14.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState14.isBottomSheetBlockVisible : true, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState14.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState14.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState14.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState14.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState14.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState14.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState14.isNeedClose : false)));
                    }
                    break;
                case 17:
                    if (IntExtensionKt.isNotZero(Boxing.boxInt(this.$json.optInt("err")))) {
                        MutableStateFlow<MarketplaceUiState> mutableStateFlow19 = this.this$0.get_uiState();
                        do {
                            value15 = mutableStateFlow19.getValue();
                            marketplaceUiState15 = value15;
                        } while (!mutableStateFlow19.compareAndSet(value15, marketplaceUiState15.copy(((-1) & 1) != 0 ? marketplaceUiState15.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState15.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState15.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState15.money : 0, ((-1) & 16) != 0 ? marketplaceUiState15.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState15.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState15.products : null, ((-1) & 128) != 0 ? marketplaceUiState15.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState15.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState15.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState15.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState15.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState15.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState15.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState15.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState15.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState15.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState15.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState15.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState15.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState15.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState15.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState15.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState15.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState15.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState15.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState15.isBottomSheetBlockVisible : true, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState15.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState15.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState15.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState15.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState15.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState15.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState15.isNeedClose : false)));
                    }
                    break;
                case 18:
                    MarketplaceProduct selectedProduct3 = this.this$0.get_uiState().getValue().getSelectedProduct();
                    if (selectedProduct3.getInventoryId() == this.$json.optInt("md", selectedProduct3.getInventoryId())) {
                        String unixTimeMarketplace2 = FormatUtilsKt.formatUnixTimeMarketplace(this.$json.optInt("tb"));
                        String strOptString6 = this.$json.optString("nm", selectedProduct3.getSeller());
                        Integer numBoxInt = Boxing.boxInt(this.$json.optInt("cs", -1));
                        long jIntValue = (numBoxInt.intValue() > -1 ? numBoxInt : null) != null ? r8.intValue() : selectedProduct3.getPrice();
                        int iOptInt20 = this.$json.optInt("rt");
                        MarketplaceRarityEnum marketplaceRarityEnum3 = MarketplaceRarityEnum.COMMON;
                        if (iOptInt20 != marketplaceRarityEnum3.getValue()) {
                            marketplaceRarityEnum3 = MarketplaceRarityEnum.UNCOMMON;
                            if (iOptInt20 != marketplaceRarityEnum3.getValue()) {
                                marketplaceRarityEnum3 = MarketplaceRarityEnum.RARE;
                                if (iOptInt20 != marketplaceRarityEnum3.getValue()) {
                                    marketplaceRarityEnum3 = MarketplaceRarityEnum.EPIC;
                                    if (iOptInt20 != marketplaceRarityEnum3.getValue()) {
                                        rarity = selectedProduct3.getRarity();
                                    }
                                    Intrinsics.checkNotNull(strOptString6);
                                    marketplaceProductCopy2 = selectedProduct3.copy((16775167 & 1) != 0 ? selectedProduct3.isPlatinumVipProduct : false, (16775167 & 2) != 0 ? selectedProduct3.name : null, (16775167 & 4) != 0 ? selectedProduct3.imageName : null, (16775167 & 8) != 0 ? selectedProduct3.rarity : rarity, (16775167 & 16) != 0 ? selectedProduct3.typeProductCard : null, (16775167 & 32) != 0 ? selectedProduct3.id : 0, (16775167 & 64) != 0 ? selectedProduct3.notificationType : null, (16775167 & 128) != 0 ? selectedProduct3.timeVipCard : 0, (16775167 & 256) != 0 ? selectedProduct3.time : 0, (16775167 & 512) != 0 ? selectedProduct3.timeTemplate : 0, (16775167 & 1024) != 0 ? selectedProduct3.inventoryId : 0, (16775167 & 2048) != 0 ? selectedProduct3.price : jIntValue, (16775167 & 4096) != 0 ? selectedProduct3.count : 0, (16775167 & 8192) != 0 ? selectedProduct3.seller : strOptString6, (16775167 & 16384) != 0 ? selectedProduct3.description : null, (16775167 & 32768) != 0 ? selectedProduct3.timeText : unixTimeMarketplace2, (16775167 & 65536) != 0 ? selectedProduct3.weight : 0.0d, (16775167 & 131072) != 0 ? selectedProduct3.typeTextRes : 0, (262144 & 16775167) != 0 ? selectedProduct3.statusForHistory : null, (16775167 & 524288) != 0 ? selectedProduct3.isSelected : false, (16775167 & 1048576) != 0 ? selectedProduct3.isUser : false, (16775167 & 2097152) != 0 ? selectedProduct3.isPublished : false, (16775167 & 4194304) != 0 ? selectedProduct3.isHaveLike : false, (16775167 & 8388608) != 0 ? selectedProduct3.renderInfo : null);
                                    mutableStateFlow = this.this$0.get_uiState();
                                    do {
                                        value16 = mutableStateFlow.getValue();
                                        marketplaceUiState16 = value16;
                                    } while (!mutableStateFlow.compareAndSet(value16, marketplaceUiState16.copy(((-1) & 1) != 0 ? marketplaceUiState16.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState16.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState16.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState16.money : 0, ((-1) & 16) != 0 ? marketplaceUiState16.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState16.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState16.products : null, ((-1) & 128) != 0 ? marketplaceUiState16.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState16.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState16.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState16.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState16.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState16.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState16.selectedProduct : marketplaceProductCopy2, ((-1) & 16384) != 0 ? marketplaceUiState16.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState16.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState16.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState16.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState16.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState16.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState16.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState16.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState16.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState16.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState16.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState16.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState16.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState16.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState16.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState16.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState16.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState16.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState16.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState16.isNeedClose : false)));
                                }
                            }
                        } else {
                            rarity = marketplaceRarityEnum3;
                            Intrinsics.checkNotNull(strOptString6);
                            marketplaceProductCopy2 = selectedProduct3.copy((16775167 & 1) != 0 ? selectedProduct3.isPlatinumVipProduct : false, (16775167 & 2) != 0 ? selectedProduct3.name : null, (16775167 & 4) != 0 ? selectedProduct3.imageName : null, (16775167 & 8) != 0 ? selectedProduct3.rarity : rarity, (16775167 & 16) != 0 ? selectedProduct3.typeProductCard : null, (16775167 & 32) != 0 ? selectedProduct3.id : 0, (16775167 & 64) != 0 ? selectedProduct3.notificationType : null, (16775167 & 128) != 0 ? selectedProduct3.timeVipCard : 0, (16775167 & 256) != 0 ? selectedProduct3.time : 0, (16775167 & 512) != 0 ? selectedProduct3.timeTemplate : 0, (16775167 & 1024) != 0 ? selectedProduct3.inventoryId : 0, (16775167 & 2048) != 0 ? selectedProduct3.price : jIntValue, (16775167 & 4096) != 0 ? selectedProduct3.count : 0, (16775167 & 8192) != 0 ? selectedProduct3.seller : strOptString6, (16775167 & 16384) != 0 ? selectedProduct3.description : null, (16775167 & 32768) != 0 ? selectedProduct3.timeText : unixTimeMarketplace2, (16775167 & 65536) != 0 ? selectedProduct3.weight : 0.0d, (16775167 & 131072) != 0 ? selectedProduct3.typeTextRes : 0, (262144 & 16775167) != 0 ? selectedProduct3.statusForHistory : null, (16775167 & 524288) != 0 ? selectedProduct3.isSelected : false, (16775167 & 1048576) != 0 ? selectedProduct3.isUser : false, (16775167 & 2097152) != 0 ? selectedProduct3.isPublished : false, (16775167 & 4194304) != 0 ? selectedProduct3.isHaveLike : false, (16775167 & 8388608) != 0 ? selectedProduct3.renderInfo : null);
                            mutableStateFlow = this.this$0.get_uiState();
                            do {
                                value16 = mutableStateFlow.getValue();
                                marketplaceUiState16 = value16;
                            } while (!mutableStateFlow.compareAndSet(value16, marketplaceUiState16.copy(((-1) & 1) != 0 ? marketplaceUiState16.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState16.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState16.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState16.money : 0, ((-1) & 16) != 0 ? marketplaceUiState16.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState16.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState16.products : null, ((-1) & 128) != 0 ? marketplaceUiState16.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState16.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState16.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState16.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState16.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState16.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState16.selectedProduct : marketplaceProductCopy2, ((-1) & 16384) != 0 ? marketplaceUiState16.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState16.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState16.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState16.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState16.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState16.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState16.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState16.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState16.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState16.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState16.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState16.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState16.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState16.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState16.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState16.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState16.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState16.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState16.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState16.isNeedClose : false)));
                        }
                    }
                    break;
                case 19:
                    int iOptInt21 = this.$json.optInt(MarketplaceKeys.MARKETPLACE_PAGES_KEY, 1);
                    List listCalculatePaginatorPagesToShow$default6 = MarketplaceViewModel.calculatePaginatorPagesToShow$default(this.this$0, 0, iOptInt21, 1, null);
                    if (this.this$0.get_uiState().getValue().getSelectedTab().getTabValue() == 5) {
                        pairM7112to = TuplesKt.m7112to(Boxing.boxBoolean(true), Boxing.boxBoolean(true));
                    } else {
                        pairM7112to = TuplesKt.m7112to(Boxing.boxBoolean(false), Boxing.boxBoolean(false));
                    }
                    boolean zBooleanValue7 = ((Boolean) pairM7112to.component1()).booleanValue();
                    boolean zBooleanValue8 = ((Boolean) pairM7112to.component2()).booleanValue();
                    JSONArray jSONArrayOptJSONArray6 = this.$json.optJSONArray("n");
                    if (jSONArrayOptJSONArray6 != null) {
                        listEmptyList2 = MarketplaceProductKt.mapToMarketplaceProducts(jSONArrayOptJSONArray6, this.this$0.get_uiState().getValue().getAllInventoryItems(), (62 & 2) != 0 ? false : zBooleanValue7, (62 & 4) == 0 ? zBooleanValue8 : false, (62 & 8) != 0 ? null : null, (62 & 16) != 0 ? null : null, (62 & 32) == 0 ? null : null);
                    }
                    if (listEmptyList2 == null) {
                        listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    }
                    List list3 = listEmptyList2;
                    zIsCanPublishProductCards = list3.size() > 4;
                    MutableStateFlow<MarketplaceUiState> mutableStateFlow20 = this.this$0.get_uiState();
                    do {
                        value17 = mutableStateFlow20.getValue();
                        marketplaceUiState17 = value17;
                    } while (!mutableStateFlow20.compareAndSet(value17, marketplaceUiState17.copy(((-1) & 1) != 0 ? marketplaceUiState17.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState17.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState17.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState17.money : 0, ((-1) & 16) != 0 ? marketplaceUiState17.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState17.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState17.products : list3, ((-1) & 128) != 0 ? marketplaceUiState17.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState17.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState17.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState17.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState17.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState17.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState17.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState17.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState17.totalPages : iOptInt21, ((-1) & 65536) != 0 ? marketplaceUiState17.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState17.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState17.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState17.pagesToShow : listCalculatePaginatorPagesToShow$default6, ((-1) & 1048576) != 0 ? marketplaceUiState17.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState17.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState17.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState17.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState17.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState17.isScrollBarVisible : zIsCanPublishProductCards, ((-1) & 67108864) != 0 ? marketplaceUiState17.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState17.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState17.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState17.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState17.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState17.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState17.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState17.isNeedClose : false)));
                case 22:
                    MutableStateFlow<MarketplaceUiState> mutableStateFlow21 = this.this$0.get_uiState();
                    JSONObject jSONObject5 = this.$json;
                    MarketplaceViewModel marketplaceViewModel4 = this.this$0;
                    synchronized (mutableStateFlow21) {
                        try {
                            boolean z5 = jSONObject5.optInt(MarketplaceKeys.MARKETPLACE_LIKED_UPDATES_KEY) == 1;
                            zIsCanPublishProductCards = jSONObject5.optInt(MarketplaceKeys.MARKETPLACE_LIKED_HISTORY_KEY) == 1;
                            List<MarketplaceTab> tabs = marketplaceViewModel4.get_uiState().getValue().getTabs();
                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(tabs, 10));
                            for (MarketplaceTab marketplaceTabCopy : tabs) {
                                int tabValue = marketplaceTabCopy.getTabValue();
                                if (tabValue == 3) {
                                    marketplaceTabCopy = marketplaceTabCopy.copy((223 & 1) != 0 ? marketplaceTabCopy.isHasPlatinumVip : false, (223 & 2) != 0 ? marketplaceTabCopy.tabValue : 0, (223 & 4) != 0 ? marketplaceTabCopy.tabName : null, (223 & 8) != 0 ? marketplaceTabCopy.icon : 0, (223 & 16) != 0 ? marketplaceTabCopy.titleIcon : 0, (223 & 32) != 0 ? marketplaceTabCopy.isSelected : false, (223 & 64) != 0 ? marketplaceTabCopy.isHaveUpdates : zIsCanPublishProductCards, (223 & 128) != 0 ? marketplaceTabCopy.savedSortFilter : null);
                                } else if (tabValue == 4) {
                                    marketplaceTabCopy = marketplaceTabCopy.copy((223 & 1) != 0 ? marketplaceTabCopy.isHasPlatinumVip : false, (223 & 2) != 0 ? marketplaceTabCopy.tabValue : 0, (223 & 4) != 0 ? marketplaceTabCopy.tabName : null, (223 & 8) != 0 ? marketplaceTabCopy.icon : 0, (223 & 16) != 0 ? marketplaceTabCopy.titleIcon : 0, (223 & 32) != 0 ? marketplaceTabCopy.isSelected : false, (223 & 64) != 0 ? marketplaceTabCopy.isHaveUpdates : z5, (223 & 128) != 0 ? marketplaceTabCopy.savedSortFilter : null);
                                }
                                arrayList3.add(marketplaceTabCopy);
                            }
                            MutableStateFlow<MarketplaceUiState> mutableStateFlow22 = marketplaceViewModel4.get_uiState();
                            do {
                                value18 = mutableStateFlow22.getValue();
                                marketplaceUiState18 = value18;
                            } while (!mutableStateFlow22.compareAndSet(value18, marketplaceUiState18.copy(((-1) & 1) != 0 ? marketplaceUiState18.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState18.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState18.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState18.money : 0, ((-1) & 16) != 0 ? marketplaceUiState18.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState18.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState18.products : null, ((-1) & 128) != 0 ? marketplaceUiState18.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState18.tabs : arrayList3, ((-1) & 512) != 0 ? marketplaceUiState18.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState18.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState18.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState18.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState18.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState18.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState18.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState18.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState18.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState18.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState18.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState18.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState18.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState18.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState18.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState18.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState18.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState18.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState18.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState18.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState18.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState18.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState18.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState18.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState18.isNeedClose : false)));
                            Unit unit4 = Unit.INSTANCE;
                            break;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                case 24:
                    MutableStateFlow<MarketplaceUiState> mutableStateFlow23 = this.this$0.get_uiState();
                    JSONObject jSONObject6 = this.$json;
                    MarketplaceViewModel marketplaceViewModel5 = this.this$0;
                    synchronized (mutableStateFlow23) {
                        marketplaceViewModel5.joinLikes(jSONObject6.optJSONArray("l"));
                        Unit unit5 = Unit.INSTANCE;
                        break;
                    }
                case 26:
                    MutableStateFlow<MarketplaceUiState> mutableStateFlow24 = this.this$0.get_uiState();
                    JSONObject jSONObject7 = this.$json;
                    MarketplaceViewModel marketplaceViewModel6 = this.this$0;
                    synchronized (mutableStateFlow24) {
                        try {
                            int iOptInt22 = jSONObject7.optInt("m", marketplaceViewModel6.get_uiState().getValue().getMoney());
                            int iOptInt23 = jSONObject7.optInt(MarketplaceKeys.MARKETPLACE_PUBLISHED_CARDS_KEY, -1);
                            if (iOptInt23 == -1) {
                                zIsCanPublishProductCards = marketplaceViewModel6.get_uiState().getValue().isCanPublishProductCards();
                            } else if (iOptInt23 > 0) {
                                zIsCanPublishProductCards = true;
                            }
                            MutableStateFlow<MarketplaceUiState> mutableStateFlow25 = marketplaceViewModel6.get_uiState();
                            do {
                                value19 = mutableStateFlow25.getValue();
                                marketplaceUiState19 = value19;
                            } while (!mutableStateFlow25.compareAndSet(value19, marketplaceUiState19.copy(((-1) & 1) != 0 ? marketplaceUiState19.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState19.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState19.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState19.money : iOptInt22, ((-1) & 16) != 0 ? marketplaceUiState19.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState19.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState19.products : null, ((-1) & 128) != 0 ? marketplaceUiState19.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState19.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState19.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState19.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState19.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState19.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState19.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState19.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState19.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState19.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState19.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState19.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState19.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState19.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState19.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState19.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState19.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState19.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState19.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState19.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState19.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState19.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState19.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState19.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState19.isCanPublishProductCards : zIsCanPublishProductCards, (1 & 1) != 0 ? marketplaceUiState19.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState19.isNeedClose : false)));
                            Unit unit6 = Unit.INSTANCE;
                            break;
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
            }
            return Unit.INSTANCE;
        }
    }

    public final void onPacketIncoming(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnIO$default(this, null, new C43021(json, this, null), 1, null);
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickCheckBox$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickCheckBox$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n230#2,5:1770\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickCheckBox$1\n*L\n889#1:1770,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickCheckBox$1 */
    public static final class C42811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C42811(Continuation<? super C42811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MarketplaceViewModel.this.new C42811(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MarketplaceUiState value;
            MarketplaceUiState marketplaceUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean zIsCheckBoxChecked = MarketplaceViewModel.this.get_uiState().getValue().getBottomSheetInfo().isCheckBoxChecked();
            int hotProductCardsCanSell = MarketplaceViewModel.this.get_uiState().getValue().getMarketplaceLimits().getHotProductCardsCanSell();
            int addsValue = MarketplaceViewModel.this.get_uiState().getValue().getBottomSheetInfo().getAddsValue();
            int i = zIsCheckBoxChecked ? addsValue + 1 : addsValue - 1;
            if (hotProductCardsCanSell <= 0 && !zIsCheckBoxChecked && i < 0) {
                if (!MarketplaceViewModel.this.get_uiState().getValue().isHasPlatinumVip()) {
                    MarketplaceViewModel.this.actionWithJSON.sendNotifyBuyVip();
                } else {
                    MarketplaceViewModel.this.getLocalNotification().showErrorNotification(MarketplaceViewModel.this.stringResources.getString(R.string.marketplace_error_limits_hot_vip_text));
                }
            } else {
                int priceForPublish = MarketplaceViewModel.this.get_uiState().getValue().getMarketplaceLimits().getPriceForPublish();
                int hotTicketCost = MarketplaceViewModel.this.get_uiState().getValue().getMarketplaceLimits().getHotTicketCost();
                if (!zIsCheckBoxChecked) {
                    priceForPublish += hotTicketCost;
                }
                int i2 = priceForPublish;
                MarketplaceBottomSheetInfo bottomSheetInfo = MarketplaceViewModel.this.get_uiState().getValue().getBottomSheetInfo();
                MarketplaceBottomSheetInfo marketplaceBottomSheetInfoCopy = bottomSheetInfo.copy((1 & 1) != 0 ? bottomSheetInfo.tabValue : 0, (1 & 2) != 0 ? bottomSheetInfo.isCheckBoxChecked : !zIsCheckBoxChecked, (1 & 4) != 0 ? bottomSheetInfo.productCount : 0, (1 & 8) != 0 ? bottomSheetInfo.price : 0L, (1 & 16) != 0 ? bottomSheetInfo.priceForAll : 0L, (1 & 32) != 0 ? bottomSheetInfo.priceForPublish : i2, (1 & 64) != 0 ? bottomSheetInfo.addsValue : i);
                MutableStateFlow<MarketplaceUiState> mutableStateFlow = MarketplaceViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    marketplaceUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : marketplaceBottomSheetInfoCopy, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false)));
            }
            return Unit.INSTANCE;
        }
    }

    public final void onClickCheckBox() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C42811(null), 1, null);
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickSetPrice$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickSetPrice$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n429#2:1770\n502#2,5:1771\n230#3,5:1776\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickSetPrice$1\n*L\n900#1:1770\n900#1:1771,5\n912#1:1776,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickSetPrice$1 */
    public static final class C42941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $textPrice;
        public int label;
        public final /* synthetic */ MarketplaceViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42941(String str, MarketplaceViewModel marketplaceViewModel, Continuation<? super C42941> continuation) {
            super(2, continuation);
            this.$textPrice = str;
            this.this$0 = marketplaceViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C42941(this.$textPrice, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MarketplaceUiState value;
            MarketplaceUiState marketplaceUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = this.$textPrice;
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            long longOrZero = StringExtensionKt.toLongOrZero(string);
            int productCount = this.this$0.get_uiState().getValue().getBottomSheetInfo().getProductCount();
            MarketplaceBottomSheetInfo bottomSheetInfo = this.this$0.get_uiState().getValue().getBottomSheetInfo();
            MarketplaceBottomSheetInfo marketplaceBottomSheetInfoCopy = bottomSheetInfo.copy((1 & 1) != 0 ? bottomSheetInfo.tabValue : 0, (1 & 2) != 0 ? bottomSheetInfo.isCheckBoxChecked : false, (1 & 4) != 0 ? bottomSheetInfo.productCount : productCount, (1 & 8) != 0 ? bottomSheetInfo.price : longOrZero, (1 & 16) != 0 ? bottomSheetInfo.priceForAll : ((productCount * longOrZero) * (100 - this.this$0.get_uiState().getValue().getMarketplaceLimits().getSellTax())) / 100, (1 & 32) != 0 ? bottomSheetInfo.priceForPublish : 0, (1 & 64) != 0 ? bottomSheetInfo.addsValue : 0);
            MutableStateFlow<MarketplaceUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                marketplaceUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : marketplaceBottomSheetInfoCopy, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false)));
            return Unit.INSTANCE;
        }
    }

    public final void onClickSetPrice(@NotNull String textPrice) {
        Intrinsics.checkNotNullParameter(textPrice, "textPrice");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C42941(textPrice, this, null), 1, null);
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickDoneInPriceTextField$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickDoneInPriceTextField$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n429#2:1770\n502#2,5:1771\n230#3,5:1776\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickDoneInPriceTextField$1\n*L\n922#1:1770\n922#1:1771,5\n937#1:1776,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickDoneInPriceTextField$1 */
    public static final class C42871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $textPrice;
        public int label;
        public final /* synthetic */ MarketplaceViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42871(String str, MarketplaceViewModel marketplaceViewModel, Continuation<? super C42871> continuation) {
            super(2, continuation);
            this.$textPrice = str;
            this.this$0 = marketplaceViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C42871(this.$textPrice, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MarketplaceUiState value;
            MarketplaceUiState marketplaceUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = this.$textPrice;
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            long longOrZero = StringExtensionKt.toLongOrZero(string);
            long j = longOrZero < 100 ? 100L : longOrZero;
            int productCount = this.this$0.get_uiState().getValue().getBottomSheetInfo().getProductCount();
            MarketplaceBottomSheetInfo bottomSheetInfo = this.this$0.get_uiState().getValue().getBottomSheetInfo();
            MarketplaceBottomSheetInfo marketplaceBottomSheetInfoCopy = bottomSheetInfo.copy((1 & 1) != 0 ? bottomSheetInfo.tabValue : 0, (1 & 2) != 0 ? bottomSheetInfo.isCheckBoxChecked : false, (1 & 4) != 0 ? bottomSheetInfo.productCount : productCount, (1 & 8) != 0 ? bottomSheetInfo.price : j, (1 & 16) != 0 ? bottomSheetInfo.priceForAll : ((productCount * j) * (100 - this.this$0.get_uiState().getValue().getMarketplaceLimits().getSellTax())) / 100, (1 & 32) != 0 ? bottomSheetInfo.priceForPublish : 0, (1 & 64) != 0 ? bottomSheetInfo.addsValue : 0);
            MutableStateFlow<MarketplaceUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                marketplaceUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : marketplaceBottomSheetInfoCopy, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false)));
            return Unit.INSTANCE;
        }
    }

    public final void onClickDoneInPriceTextField(@NotNull String textPrice) {
        Intrinsics.checkNotNullParameter(textPrice, "textPrice");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C42871(textPrice, this, null), 1, null);
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickDoneInCountTextField$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickDoneInCountTextField$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n429#2:1770\n502#2,5:1771\n230#3,5:1776\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickDoneInCountTextField$1\n*L\n955#1:1770\n955#1:1771,5\n967#1:1776,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickDoneInCountTextField$1 */
    public static final class C42861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $textCount;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42861(String str, Continuation<? super C42861> continuation) {
            super(2, continuation);
            this.$textCount = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MarketplaceViewModel.this.new C42861(this.$textCount, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MarketplaceUiState value;
            MarketplaceUiState marketplaceUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            float sellTax = (MarketplaceViewModel.this.get_uiState().getValue().getSelectedTab().getTabValue() == 5 || MarketplaceViewModel.this.get_uiState().getValue().getSelectedTab().getTabValue() == 6) ? (100.0f - MarketplaceViewModel.this.get_uiState().getValue().getMarketplaceLimits().getSellTax()) / 100.0f : 1.0f;
            String str = this.$textCount;
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            int intOrZero = StringExtensionKt.toIntOrZero(string);
            int i2 = intOrZero < 1 ? 1 : intOrZero;
            MarketplaceBottomSheetInfo bottomSheetInfo = MarketplaceViewModel.this.get_uiState().getValue().getBottomSheetInfo();
            MarketplaceBottomSheetInfo marketplaceBottomSheetInfoCopy = bottomSheetInfo.copy((1 & 1) != 0 ? bottomSheetInfo.tabValue : 0, (1 & 2) != 0 ? bottomSheetInfo.isCheckBoxChecked : false, (1 & 4) != 0 ? bottomSheetInfo.productCount : i2, (1 & 8) != 0 ? bottomSheetInfo.price : 0L, (1 & 16) != 0 ? bottomSheetInfo.priceForAll : (long) (MarketplaceViewModel.this.get_uiState().getValue().getBottomSheetInfo().getPrice() * i2 * sellTax), (1 & 32) != 0 ? bottomSheetInfo.priceForPublish : 0, (1 & 64) != 0 ? bottomSheetInfo.addsValue : 0);
            MutableStateFlow<MarketplaceUiState> mutableStateFlow = MarketplaceViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                marketplaceUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : marketplaceBottomSheetInfoCopy, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false)));
            return Unit.INSTANCE;
        }
    }

    public final void onClickDoneInCountTextField(@NotNull String textCount) {
        Intrinsics.checkNotNullParameter(textCount, "textCount");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C42861(textCount, null), 1, null);
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickMinusButton$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickMinusButton$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n230#2,5:1770\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickMinusButton$1\n*L\n995#1:1770,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickMinusButton$1 */
    public static final class C42911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C42911(Continuation<? super C42911> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MarketplaceViewModel.this.new C42911(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MarketplaceUiState value;
            MarketplaceUiState marketplaceUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            float sellTax = (MarketplaceViewModel.this.get_uiState().getValue().getSelectedTab().getTabValue() == 5 || MarketplaceViewModel.this.get_uiState().getValue().getSelectedTab().getTabValue() == 6) ? (100.0f - MarketplaceViewModel.this.get_uiState().getValue().getMarketplaceLimits().getSellTax()) / 100.0f : 1.0f;
            MarketplaceBottomSheetInfo bottomSheetInfo = MarketplaceViewModel.this.get_uiState().getValue().getBottomSheetInfo();
            MarketplaceBottomSheetInfo marketplaceBottomSheetInfoCopy = bottomSheetInfo.copy((1 & 1) != 0 ? bottomSheetInfo.tabValue : 0, (1 & 2) != 0 ? bottomSheetInfo.isCheckBoxChecked : false, (1 & 4) != 0 ? bottomSheetInfo.productCount : MarketplaceViewModel.this.get_uiState().getValue().getBottomSheetInfo().getProductCount() - 1, (1 & 8) != 0 ? bottomSheetInfo.price : 0L, (1 & 16) != 0 ? bottomSheetInfo.priceForAll : (long) (r6 * MarketplaceViewModel.this.get_uiState().getValue().getBottomSheetInfo().getPrice() * sellTax), (1 & 32) != 0 ? bottomSheetInfo.priceForPublish : 0, (1 & 64) != 0 ? bottomSheetInfo.addsValue : 0);
            MutableStateFlow<MarketplaceUiState> mutableStateFlow = MarketplaceViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                marketplaceUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : marketplaceBottomSheetInfoCopy, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false)));
            return Unit.INSTANCE;
        }
    }

    public final void onClickMinusButton() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C42911(null), 1, null);
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickPlusButton$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickPlusButton$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n230#2,5:1770\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickPlusButton$1\n*L\n1023#1:1770,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickPlusButton$1 */
    public static final class C42921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C42921(Continuation<? super C42921> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MarketplaceViewModel.this.new C42921(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MarketplaceUiState value;
            MarketplaceUiState marketplaceUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            float sellTax = (MarketplaceViewModel.this.get_uiState().getValue().getSelectedTab().getTabValue() == 5 || MarketplaceViewModel.this.get_uiState().getValue().getSelectedTab().getTabValue() == 6) ? (100.0f - MarketplaceViewModel.this.get_uiState().getValue().getMarketplaceLimits().getSellTax()) / 100.0f : 1.0f;
            MarketplaceBottomSheetInfo bottomSheetInfo = MarketplaceViewModel.this.get_uiState().getValue().getBottomSheetInfo();
            MarketplaceBottomSheetInfo marketplaceBottomSheetInfoCopy = bottomSheetInfo.copy((1 & 1) != 0 ? bottomSheetInfo.tabValue : 0, (1 & 2) != 0 ? bottomSheetInfo.isCheckBoxChecked : false, (1 & 4) != 0 ? bottomSheetInfo.productCount : MarketplaceViewModel.this.get_uiState().getValue().getBottomSheetInfo().getProductCount() + 1, (1 & 8) != 0 ? bottomSheetInfo.price : 0L, (1 & 16) != 0 ? bottomSheetInfo.priceForAll : (long) (r6 * MarketplaceViewModel.this.get_uiState().getValue().getBottomSheetInfo().getPrice() * sellTax), (1 & 32) != 0 ? bottomSheetInfo.priceForPublish : 0, (1 & 64) != 0 ? bottomSheetInfo.addsValue : 0);
            MutableStateFlow<MarketplaceUiState> mutableStateFlow = MarketplaceViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                marketplaceUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : marketplaceBottomSheetInfoCopy, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false)));
            return Unit.INSTANCE;
        }
    }

    public final void onClickPlusButton() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C42921(null), 1, null);
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickSetForceCount$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickSetForceCount$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n429#2:1770\n502#2,5:1771\n230#3,5:1776\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickSetForceCount$1\n*L\n1033#1:1770\n1033#1:1771,5\n1050#1:1776,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickSetForceCount$1 */
    public static final class C42931 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $text;
        public int label;
        public final /* synthetic */ MarketplaceViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42931(String str, MarketplaceViewModel marketplaceViewModel, Continuation<? super C42931> continuation) {
            super(2, continuation);
            this.$text = str;
            this.this$0 = marketplaceViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C42931(this.$text, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MarketplaceUiState value;
            MarketplaceUiState marketplaceUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = this.$text;
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            int intOrZero = StringExtensionKt.toIntOrZero(string);
            long price = (long) (this.this$0.get_uiState().getValue().getBottomSheetInfo().getPrice() * intOrZero * ((this.this$0.get_uiState().getValue().getSelectedTab().getTabValue() == 5 || this.this$0.get_uiState().getValue().getSelectedTab().getTabValue() == 6) ? (100.0f - this.this$0.get_uiState().getValue().getMarketplaceLimits().getSellTax()) / 100.0f : 1.0f));
            MarketplaceBottomSheetInfo bottomSheetInfo = this.this$0.get_uiState().getValue().getBottomSheetInfo();
            MarketplaceBottomSheetInfo marketplaceBottomSheetInfoCopy = bottomSheetInfo.copy((1 & 1) != 0 ? bottomSheetInfo.tabValue : 0, (1 & 2) != 0 ? bottomSheetInfo.isCheckBoxChecked : false, (1 & 4) != 0 ? bottomSheetInfo.productCount : intOrZero, (1 & 8) != 0 ? bottomSheetInfo.price : 0L, (1 & 16) != 0 ? bottomSheetInfo.priceForAll : price, (1 & 32) != 0 ? bottomSheetInfo.priceForPublish : 0, (1 & 64) != 0 ? bottomSheetInfo.addsValue : 0);
            MutableStateFlow<MarketplaceUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                marketplaceUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : marketplaceBottomSheetInfoCopy, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false)));
            return Unit.INSTANCE;
        }
    }

    public final void onClickSetForceCount(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C42931(text, this, null), 1, null);
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickWithdrawFromSale$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickWithdrawFromSale$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n230#2,5:1770\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickWithdrawFromSale$1\n*L\n1063#1:1770,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickWithdrawFromSale$1 */
    public static final class C43001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C43001(Continuation<? super C43001> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MarketplaceViewModel.this.new C43001(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AnnotatedString annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(MarketplaceViewModel.this.stringResources.getString(R.string.marketplace_modal_window_edit_remove));
            MutableStateFlow<MarketplaceUiState> mutableStateFlow = MarketplaceViewModel.this.get_uiState();
            while (true) {
                MarketplaceUiState value = mutableStateFlow.getValue();
                MarketplaceUiState marketplaceUiState = value;
                MutableStateFlow<MarketplaceUiState> mutableStateFlow2 = mutableStateFlow;
                if (mutableStateFlow2.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : annotatedStringHtmlTextToAnnotatedString, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : MarketplaceModalWindowStateEnum.CONFIRM_REMOVE_CARD, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : true, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false))) {
                    return Unit.INSTANCE;
                }
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public final void onClickWithdrawFromSale() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C43001(null), 1, null);
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickGreenButtonInBottomSheet$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickGreenButtonInBottomSheet$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n230#2,5:1770\n230#2,5:1775\n230#2,5:1780\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickGreenButtonInBottomSheet$1\n*L\n1092#1:1770,5\n1107#1:1775,5\n1121#1:1780,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickGreenButtonInBottomSheet$1 */
    public static final class C42881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C42881(Continuation<? super C42881> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MarketplaceViewModel.this.new C42881(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int tabValue = MarketplaceViewModel.this.get_uiState().getValue().getSelectedTab().getTabValue();
            if (tabValue == 2 || tabValue == 4) {
                MarketplaceProduct selectedProduct = MarketplaceViewModel.this.get_uiState().getValue().getSelectedProduct();
                if (selectedProduct.isPlatinumVipProduct()) {
                    MarketplaceViewModel.this.actionWithJSON.sendBuyVip();
                } else {
                    MarketplaceBottomSheetInfo bottomSheetInfo = MarketplaceViewModel.this.get_uiState().getValue().getBottomSheetInfo();
                    AnnotatedString annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(MarketplaceViewModel.this.stringResources.getString(R.string.marketplace_modal_window_buy, selectedProduct.getName(), Boxing.boxInt(bottomSheetInfo.getProductCount()), UsefulKt.getPriceWithSpaces(Boxing.boxLong(bottomSheetInfo.getPriceForAll()))));
                    MutableStateFlow<MarketplaceUiState> mutableStateFlow = MarketplaceViewModel.this.get_uiState();
                    while (true) {
                        MarketplaceUiState value = mutableStateFlow.getValue();
                        MarketplaceUiState marketplaceUiState = value;
                        MutableStateFlow<MarketplaceUiState> mutableStateFlow2 = mutableStateFlow;
                        if (mutableStateFlow2.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : annotatedStringHtmlTextToAnnotatedString, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : MarketplaceModalWindowStateEnum.CONFIRM_BUY, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : true, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false))) {
                            break;
                        }
                        mutableStateFlow = mutableStateFlow2;
                    }
                }
            } else if (tabValue == 5) {
                AnnotatedString annotatedStringHtmlTextToAnnotatedString2 = StringExtensionKt.htmlTextToAnnotatedString(MarketplaceViewModel.this.stringResources.getString(R.string.marketplace_modal_window_edit));
                MutableStateFlow<MarketplaceUiState> mutableStateFlow3 = MarketplaceViewModel.this.get_uiState();
                while (true) {
                    MarketplaceUiState value2 = mutableStateFlow3.getValue();
                    MarketplaceUiState marketplaceUiState2 = value2;
                    MutableStateFlow<MarketplaceUiState> mutableStateFlow4 = mutableStateFlow3;
                    if (mutableStateFlow4.compareAndSet(value2, marketplaceUiState2.copy(((-1) & 1) != 0 ? marketplaceUiState2.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState2.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState2.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState2.money : 0, ((-1) & 16) != 0 ? marketplaceUiState2.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState2.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState2.products : null, ((-1) & 128) != 0 ? marketplaceUiState2.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState2.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState2.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState2.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState2.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState2.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState2.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState2.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState2.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState2.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState2.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState2.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState2.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState2.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState2.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState2.modalBottomWindowText : annotatedStringHtmlTextToAnnotatedString2, ((-1) & 8388608) != 0 ? marketplaceUiState2.modalWindowState : MarketplaceModalWindowStateEnum.CONFIRM_EDIT, ((-1) & 16777216) != 0 ? marketplaceUiState2.isModalWindowVisible : true, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState2.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState2.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState2.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState2.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState2.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState2.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState2.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState2.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState2.isNeedClose : false))) {
                        break;
                    }
                    mutableStateFlow3 = mutableStateFlow4;
                }
            } else if (tabValue == 6) {
                AnnotatedString annotatedStringHtmlTextToAnnotatedString3 = StringExtensionKt.htmlTextToAnnotatedString(MarketplaceViewModel.this.stringResources.getString(R.string.marketplace_modal_window_publish));
                MutableStateFlow<MarketplaceUiState> mutableStateFlow5 = MarketplaceViewModel.this.get_uiState();
                while (true) {
                    MarketplaceUiState value3 = mutableStateFlow5.getValue();
                    MarketplaceUiState marketplaceUiState3 = value3;
                    MutableStateFlow<MarketplaceUiState> mutableStateFlow6 = mutableStateFlow5;
                    if (mutableStateFlow6.compareAndSet(value3, marketplaceUiState3.copy(((-1) & 1) != 0 ? marketplaceUiState3.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState3.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState3.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState3.money : 0, ((-1) & 16) != 0 ? marketplaceUiState3.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState3.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState3.products : null, ((-1) & 128) != 0 ? marketplaceUiState3.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState3.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState3.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState3.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState3.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState3.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState3.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState3.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState3.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState3.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState3.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState3.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState3.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState3.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState3.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState3.modalBottomWindowText : annotatedStringHtmlTextToAnnotatedString3, ((-1) & 8388608) != 0 ? marketplaceUiState3.modalWindowState : MarketplaceModalWindowStateEnum.CONFIRM_PUBLISH_TO_SELL, ((-1) & 16777216) != 0 ? marketplaceUiState3.isModalWindowVisible : true, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState3.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState3.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState3.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState3.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState3.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState3.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState3.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState3.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState3.isNeedClose : false))) {
                        break;
                    }
                    mutableStateFlow5 = mutableStateFlow6;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void onClickGreenButtonInBottomSheet() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C42881(null), 1, null);
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickHistoryProduct$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickHistoryProduct$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n1864#2,3:1770\n230#3,5:1773\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickHistoryProduct$1\n*L\n1138#1:1770,3\n1157#1:1773,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickHistoryProduct$1 */
    public static final class C42891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $indexElement;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42891(int i, Continuation<? super C42891> continuation) {
            super(2, continuation);
            this.$indexElement = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MarketplaceViewModel.this.new C42891(this.$indexElement, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProduct] */
        /* JADX WARN: Type inference failed for: r6v3, types: [T, com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProduct] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) MarketplaceViewModel.this.get_uiState().getValue().getProducts());
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new MarketplaceProduct(false, null, null, null, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, null, false, false, false, false, null, ViewCompat.MEASURED_SIZE_MASK, null);
            int i = this.$indexElement;
            int i2 = 0;
            for (Object obj2 : mutableList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                ?? r6 = (MarketplaceProduct) obj2;
                if (i2 == i) {
                    r6.setSelected(true);
                    objectRef.element = r6;
                } else if (r6.isSelected()) {
                    r6.setSelected(false);
                }
                i2 = i3;
            }
            MarketplaceViewModel.this.actionWithJSON.sendClickHistoryCard(((MarketplaceProduct) objectRef.element).getId());
            MutableStateFlow<MarketplaceUiState> mutableStateFlow = MarketplaceViewModel.this.get_uiState();
            while (true) {
                MarketplaceUiState value = mutableStateFlow.getValue();
                MarketplaceUiState marketplaceUiState = value;
                MutableStateFlow<MarketplaceUiState> mutableStateFlow2 = mutableStateFlow;
                Ref.ObjectRef objectRef2 = objectRef;
                if (mutableStateFlow2.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : mutableList, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : (MarketplaceProduct) objectRef.element, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false))) {
                    return Unit.INSTANCE;
                }
                mutableStateFlow = mutableStateFlow2;
                objectRef = objectRef2;
            }
        }
    }

    public final void onClickHistoryProduct(int indexElement) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C42891(indexElement, null), 1, null);
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickToTab$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickToTab$1 */
    public static final class C42991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $tabValue;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42991(int i, Continuation<? super C42991> continuation) {
            super(2, continuation);
            this.$tabValue = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MarketplaceViewModel.this.new C42991(this.$tabValue, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                MarketplaceViewModel.this.actionWithJSON.sendClickToTab(this.$tabValue);
                MarketplaceViewModel.this.changeTabStatus(this.$tabValue);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onClickToTab(int tabValue) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C42991(tabValue, null), 1, null);
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickCardMainButton$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickCardMainButton$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n230#2,5:1770\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickCardMainButton$1\n*L\n1216#1:1770,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickCardMainButton$1 */
    public static final class C42801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $productIndex;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42801(int i, Continuation<? super C42801> continuation) {
            super(2, continuation);
            this.$productIndex = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MarketplaceViewModel.this.new C42801(this.$productIndex, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Pair pairM7112to;
            MarketplaceUiState value;
            MarketplaceUiState marketplaceUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MarketplaceProduct marketplaceProduct = (MarketplaceProduct) CollectionsKt___CollectionsKt.getOrNull(MarketplaceViewModel.this.get_uiState().getValue().getProducts(), this.$productIndex);
            if (marketplaceProduct == null) {
                marketplaceProduct = new MarketplaceProduct(false, null, null, null, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, null, false, false, false, false, null, ViewCompat.MEASURED_SIZE_MASK, null);
            }
            float sellTax = (100.0f - MarketplaceViewModel.this.get_uiState().getValue().getMarketplaceLimits().getSellTax()) / 100.0f;
            boolean z = true;
            if (MarketplaceViewModel.this.get_uiState().getValue().getSelectedTab().getTabValue() == 5) {
                pairM7112to = TuplesKt.m7112to(Boxing.boxLong((long) (marketplaceProduct.getPrice() * marketplaceProduct.getCount() * sellTax)), Boxing.boxInt(marketplaceProduct.getCount()));
            } else {
                pairM7112to = TuplesKt.m7112to(Boxing.boxLong(marketplaceProduct.getPrice()), Boxing.boxInt(1));
            }
            long jLongValue = ((Number) pairM7112to.component1()).longValue();
            int iIntValue = ((Number) pairM7112to.component2()).intValue();
            MarketplaceBottomSheetInfo bottomSheetInfo = MarketplaceViewModel.this.get_uiState().getValue().getBottomSheetInfo();
            MarketplaceBottomSheetInfo marketplaceBottomSheetInfoCopy = bottomSheetInfo.copy((1 & 1) != 0 ? bottomSheetInfo.tabValue : 0, (1 & 2) != 0 ? bottomSheetInfo.isCheckBoxChecked : marketplaceProduct.isHot(), (1 & 4) != 0 ? bottomSheetInfo.productCount : iIntValue, (1 & 8) != 0 ? bottomSheetInfo.price : marketplaceProduct.getPrice(), (1 & 16) != 0 ? bottomSheetInfo.priceForAll : jLongValue, (1 & 32) != 0 ? bottomSheetInfo.priceForPublish : MarketplaceViewModel.this.get_uiState().getValue().getMarketplaceLimits().getPriceForPublish(), (1 & 64) != 0 ? bottomSheetInfo.addsValue : MarketplaceViewModel.this.get_uiState().getValue().getMarketplaceLimits().getHotProductCardsCanSell());
            int tabValue = MarketplaceViewModel.this.get_uiState().getValue().getSelectedTab().getTabValue();
            if (tabValue == 2 || tabValue == 4) {
                MarketplaceViewModel.this.actionWithJSON.sendClickBuy(marketplaceProduct.getId());
            } else if (tabValue == 5) {
                MarketplaceViewModel.this.actionWithJSON.sendEditProduct(marketplaceProduct.getId());
            } else if (tabValue == 6) {
                if (MarketplaceViewModel.this.get_uiState().getValue().isCanPublishProductCards()) {
                    MarketplaceViewModel.this.actionWithJSON.sendClickToSellButton(marketplaceProduct.getId());
                } else {
                    if (MarketplaceViewModel.this.get_uiState().getValue().isHasPlatinumVip()) {
                        MarketplaceViewModel.this.getLocalNotification().showErrorNotification(MarketplaceViewModel.this.stringResources.getString(R.string.marketplace_error_limits_vip_text));
                    } else {
                        MarketplaceViewModel.this.actionWithJSON.sendNotifyBuyVip();
                    }
                    z = false;
                }
            }
            MutableStateFlow<MarketplaceUiState> mutableStateFlow = MarketplaceViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                marketplaceUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : marketplaceBottomSheetInfoCopy, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : marketplaceProduct, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : z, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false)));
            return Unit.INSTANCE;
        }
    }

    public final void onClickCardMainButton(int productIndex) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C42801(productIndex, null), 1, null);
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickToPage$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickToPage$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n230#2,5:1770\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickToPage$1\n*L\n1232#1:1770,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickToPage$1 */
    public static final class C42971 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $pageValue;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42971(int i, Continuation<? super C42971> continuation) {
            super(2, continuation);
            this.$pageValue = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MarketplaceViewModel.this.new C42971(this.$pageValue, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MarketplaceUiState value;
            MarketplaceUiState marketplaceUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List listCalculatePaginatorPagesToShow$default = MarketplaceViewModel.calculatePaginatorPagesToShow$default(MarketplaceViewModel.this, this.$pageValue, 0, 2, null);
            MarketplaceViewModel.this.actionWithJSON.sendClickToPage(this.$pageValue);
            MutableStateFlow<MarketplaceUiState> mutableStateFlow = MarketplaceViewModel.this.get_uiState();
            int i = this.$pageValue;
            do {
                value = mutableStateFlow.getValue();
                marketplaceUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : CollectionsKt__CollectionsKt.emptyList(), ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : i, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : listCalculatePaginatorPagesToShow$default, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false)));
            return Unit.INSTANCE;
        }
    }

    public final void onClickToPage(int pageValue) {
        if (pageValue != get_uiState().getValue().getCurrentPage()) {
            ViewModelExtensionKt.launchOnIO$default(this, null, new C42971(pageValue, null), 1, null);
        }
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickToDonat$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickToDonat$1 */
    public static final class C42961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C42961(Continuation<? super C42961> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MarketplaceViewModel.this.new C42961(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                MarketplaceViewModel.this.actionWithJSON.sendClickToDonat();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onClickToDonat() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C42961(null), 1, null);
    }

    public final void onClickFilterButton() {
        MarketplaceUiState value;
        MarketplaceUiState marketplaceUiState;
        MutableStateFlow<MarketplaceUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            marketplaceUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : !marketplaceUiState.isNeedToShowFilter(), ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false)));
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickConfirmFilters$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickConfirmFilters$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n230#2,5:1770\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickConfirmFilters$1\n*L\n1263#1:1770,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickConfirmFilters$1 */
    public static final class C42831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C42831(Continuation<? super C42831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MarketplaceViewModel.this.new C42831(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MarketplaceUiState value;
            MarketplaceUiState marketplaceUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MarketplaceViewModel.this.actionWithJSON.sendClickFilters(MarketplaceViewModel.this.getUiState().getValue().getListOfChosenFilterIds());
            MutableStateFlow<MarketplaceUiState> mutableStateFlow = MarketplaceViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                marketplaceUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 1, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : !marketplaceUiState.isNeedToShowFilter(), ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false)));
            return Unit.INSTANCE;
        }
    }

    public final void onClickConfirmFilters() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C42831(null), 1, null);
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onFilterCheckboxClick$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onFilterCheckboxClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n230#2,5:1770\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onFilterCheckboxClick$1\n*L\n1283#1:1770,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onFilterCheckboxClick$1 */
    public static final class C43011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ CraftItemCategoryFilter $checkBox;
        public int label;
        public final /* synthetic */ MarketplaceViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43011(CraftItemCategoryFilter craftItemCategoryFilter, MarketplaceViewModel marketplaceViewModel, Continuation<? super C43011> continuation) {
            super(2, continuation);
            this.$checkBox = craftItemCategoryFilter;
            this.this$0 = marketplaceViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C43011(this.$checkBox, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Set setMinus;
            MarketplaceUiState value;
            MarketplaceUiState marketplaceUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = true;
            this.$checkBox.setStateOfCheckBox(!r1.getStateOfCheckBox());
            if (this.$checkBox.getStateOfCheckBox()) {
                setMinus = SetsKt___SetsKt.plus(this.this$0.getUiState().getValue().getListOfChosenFilterIds(), Boxing.boxInt(this.$checkBox.getFilterId()));
            } else {
                setMinus = SetsKt___SetsKt.minus(this.this$0.getUiState().getValue().getListOfChosenFilterIds(), Boxing.boxInt(this.$checkBox.getFilterId()));
            }
            if (!this.$checkBox.getStateOfCheckBox() && !(!setMinus.isEmpty())) {
                z = false;
            }
            MutableStateFlow<MarketplaceUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                marketplaceUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : setMinus, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : z, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false)));
            return Unit.INSTANCE;
        }
    }

    public final void onFilterCheckboxClick(@NotNull CraftItemCategoryFilter checkBox) {
        Intrinsics.checkNotNullParameter(checkBox, "checkBox");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C43011(checkBox, this, null), 1, null);
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onResetFilterButtonClick$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onResetFilterButtonClick$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n1549#2:1770\n1620#2,2:1771\n1549#2:1773\n1620#2,3:1774\n1622#2:1777\n230#3,5:1778\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onResetFilterButtonClick$1\n*L\n1294#1:1770\n1294#1:1771,2\n1296#1:1773\n1296#1:1774,3\n1294#1:1777\n1302#1:1778,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onResetFilterButtonClick$1 */
    public static final class C43031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C43031(Continuation<? super C43031> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MarketplaceViewModel.this.new C43031(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<CraftCategoryFilter> filterList = MarketplaceViewModel.this.getUiState().getValue().getFilterList();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(filterList, 10));
            for (CraftCategoryFilter craftCategoryFilter : filterList) {
                List<CraftItemCategoryFilter> filters = craftCategoryFilter.getFilters();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(filters, 10));
                for (CraftItemCategoryFilter craftItemCategoryFilter : filters) {
                    arrayList2.add(craftItemCategoryFilter.m14450copyT042LqI((191 & 1) != 0 ? craftItemCategoryFilter.filterId : 0, (191 & 2) != 0 ? craftItemCategoryFilter.filterName : null, (191 & 4) != 0 ? craftItemCategoryFilter.color : 0L, (191 & 8) != 0 ? craftItemCategoryFilter.categoryId : 0, (191 & 16) != 0 ? craftItemCategoryFilter.preferenceKey : null, (191 & 32) != 0 ? craftItemCategoryFilter.customEndPadding : 0, (191 & 64) != 0 ? craftItemCategoryFilter.stateOfCheckBox : false, (191 & 128) != 0 ? craftItemCategoryFilter.iconCDNBitmap : null));
                }
                arrayList.add(CraftCategoryFilter.copy$default(craftCategoryFilter, 0, null, arrayList2, 3, null));
            }
            MutableStateFlow<MarketplaceUiState> mutableStateFlow = MarketplaceViewModel.this.get_uiState();
            while (true) {
                MarketplaceUiState value = mutableStateFlow.getValue();
                MarketplaceUiState marketplaceUiState = value;
                ArrayList arrayList3 = arrayList;
                if (mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : arrayList, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : SetsKt__SetsKt.emptySet(), ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false))) {
                    return Unit.INSTANCE;
                }
                arrayList = arrayList3;
            }
        }
    }

    public final void onResetFilterButtonClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C43031(null), 1, null);
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickToPlusButton$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickToPlusButton$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n1549#2:1770\n1620#2,3:1771\n230#3,5:1774\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickToPlusButton$1\n*L\n1316#1:1770\n1316#1:1771,3\n1329#1:1774,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickToPlusButton$1 */
    public static final class C42981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C42981(Continuation<? super C42981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MarketplaceViewModel.this.new C42981(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                MarketplaceViewModel.this.actionWithJSON.sendClickToCreateProductLot();
                List<MarketplaceTab> tabs = MarketplaceViewModel.this.get_uiState().getValue().getTabs();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(tabs, 10));
                for (MarketplaceTab marketplaceTab : tabs) {
                    arrayList.add(marketplaceTab.copy((223 & 1) != 0 ? marketplaceTab.isHasPlatinumVip : false, (223 & 2) != 0 ? marketplaceTab.tabValue : 0, (223 & 4) != 0 ? marketplaceTab.tabName : null, (223 & 8) != 0 ? marketplaceTab.icon : 0, (223 & 16) != 0 ? marketplaceTab.titleIcon : 0, (223 & 32) != 0 ? marketplaceTab.isSelected : false, (223 & 64) != 0 ? marketplaceTab.isHaveUpdates : false, (223 & 128) != 0 ? marketplaceTab.savedSortFilter : null));
                }
                MarketplaceTab marketplaceTab2 = new MarketplaceTab(MarketplaceViewModel.this.get_uiState().getValue().isHasPlatinumVip(), 6, MarketplaceViewModel.this.stringResources.getString(R.string.marketplace_inventory_tab), R.drawable.ic_boxes, R.drawable.ic_boxes, false, false, null, 224, null);
                MarketplaceBottomSheetInfo marketplaceBottomSheetInfo = new MarketplaceBottomSheetInfo(6, false, 0, 0L, 0L, 0, 0, 126, null);
                MutableStateFlow<MarketplaceUiState> mutableStateFlow = MarketplaceViewModel.this.get_uiState();
                while (true) {
                    MarketplaceUiState value = mutableStateFlow.getValue();
                    MarketplaceUiState marketplaceUiState = value;
                    MutableStateFlow<MarketplaceUiState> mutableStateFlow2 = mutableStateFlow;
                    ArrayList arrayList2 = arrayList;
                    if (mutableStateFlow2.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : marketplaceBottomSheetInfo, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : CollectionsKt__CollectionsKt.emptyList(), ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : arrayList, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : marketplaceTab2, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 1, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false))) {
                        return Unit.INSTANCE;
                    }
                    mutableStateFlow = mutableStateFlow2;
                    arrayList = arrayList2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void onClickToPlusButton() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C42981(null), 1, null);
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickConfirmInModalWindow$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickConfirmInModalWindow$1 */
    public static final class C42841 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        /* compiled from: MarketplaceViewModel.kt */
        @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickConfirmInModalWindow$1$WhenMappings */
        /* loaded from: classes3.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MarketplaceModalWindowStateEnum.values().length];
                try {
                    iArr[MarketplaceModalWindowStateEnum.CONFIRM_BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MarketplaceModalWindowStateEnum.CONFIRM_EDIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MarketplaceModalWindowStateEnum.CONFIRM_PUBLISH_TO_SELL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MarketplaceModalWindowStateEnum.CONFIRM_REMOVE_CARD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MarketplaceModalWindowStateEnum.CONFIRM_REMOVE_LIKE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C42841(Continuation<? super C42841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MarketplaceViewModel.this.new C42841(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = WhenMappings.$EnumSwitchMapping$0[MarketplaceViewModel.this.get_uiState().getValue().getModalWindowState().ordinal()];
            if (i == 1) {
                MarketplaceViewModel.this.onConfirmBuy();
            } else if (i == 2) {
                MarketplaceViewModel.this.onConfirmEdit();
            } else if (i == 3) {
                MarketplaceViewModel.this.onConfirmPublish();
            } else if (i == 4) {
                MarketplaceViewModel.this.onConfirmDeleteCard();
            } else if (i == 5) {
                MarketplaceViewModel.this.onConfirmSendLike();
            }
            return Unit.INSTANCE;
        }
    }

    public final void onClickConfirmInModalWindow() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C42841(null), 1, null);
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickLike$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickLike$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n1549#2:1770\n1620#2,2:1771\n1622#2:1774\n1#3:1773\n230#4,5:1775\n230#4,5:1780\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickLike$1\n*L\n1372#1:1770\n1372#1:1771,2\n1372#1:1774\n1377#1:1775,5\n1388#1:1780,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickLike$1 */
    public static final class C42901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MarketplaceProduct $likedProduct;
        public int label;
        public final /* synthetic */ MarketplaceViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42901(MarketplaceProduct marketplaceProduct, MarketplaceViewModel marketplaceViewModel, Continuation<? super C42901> continuation) {
            super(2, continuation);
            this.$likedProduct = marketplaceProduct;
            this.this$0 = marketplaceViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C42901(this.$likedProduct, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MarketplaceProduct marketplaceProductCopy;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!this.$likedProduct.isHaveLike()) {
                this.this$0.actionWithJSON.sendLike(this.$likedProduct.getId());
                List<MarketplaceProduct> products = this.this$0.get_uiState().getValue().getProducts();
                MarketplaceProduct marketplaceProduct = this.$likedProduct;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(products, 10));
                for (MarketplaceProduct marketplaceProduct2 : products) {
                    MarketplaceProduct marketplaceProduct3 = marketplaceProduct2.getId() == marketplaceProduct.getId() ? marketplaceProduct2 : null;
                    if (marketplaceProduct3 != null && (marketplaceProductCopy = marketplaceProduct3.copy((16775167 & 1) != 0 ? marketplaceProduct3.isPlatinumVipProduct : false, (16775167 & 2) != 0 ? marketplaceProduct3.name : null, (16775167 & 4) != 0 ? marketplaceProduct3.imageName : null, (16775167 & 8) != 0 ? marketplaceProduct3.rarity : null, (16775167 & 16) != 0 ? marketplaceProduct3.typeProductCard : null, (16775167 & 32) != 0 ? marketplaceProduct3.id : 0, (16775167 & 64) != 0 ? marketplaceProduct3.notificationType : null, (16775167 & 128) != 0 ? marketplaceProduct3.timeVipCard : 0, (16775167 & 256) != 0 ? marketplaceProduct3.time : 0, (16775167 & 512) != 0 ? marketplaceProduct3.timeTemplate : 0, (16775167 & 1024) != 0 ? marketplaceProduct3.inventoryId : 0, (16775167 & 2048) != 0 ? marketplaceProduct3.price : 0L, (16775167 & 4096) != 0 ? marketplaceProduct3.count : 0, (16775167 & 8192) != 0 ? marketplaceProduct3.seller : null, (16775167 & 16384) != 0 ? marketplaceProduct3.description : null, (16775167 & 32768) != 0 ? marketplaceProduct3.timeText : null, (16775167 & 65536) != 0 ? marketplaceProduct3.weight : 0.0d, (16775167 & 131072) != 0 ? marketplaceProduct3.typeTextRes : 0, (262144 & 16775167) != 0 ? marketplaceProduct3.statusForHistory : null, (16775167 & 524288) != 0 ? marketplaceProduct3.isSelected : false, (16775167 & 1048576) != 0 ? marketplaceProduct3.isUser : false, (16775167 & 2097152) != 0 ? marketplaceProduct3.isPublished : false, (16775167 & 4194304) != 0 ? marketplaceProduct3.isHaveLike : !marketplaceProduct2.isHaveLike(), (16775167 & 8388608) != 0 ? marketplaceProduct3.renderInfo : null)) != null) {
                        marketplaceProduct2 = marketplaceProductCopy;
                    }
                    arrayList.add(marketplaceProduct2);
                }
                MutableStateFlow<MarketplaceUiState> mutableStateFlow = this.this$0.get_uiState();
                while (true) {
                    MarketplaceUiState value = mutableStateFlow.getValue();
                    MarketplaceUiState marketplaceUiState = value;
                    ArrayList arrayList2 = arrayList;
                    if (mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : arrayList, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false))) {
                        break;
                    }
                    arrayList = arrayList2;
                }
            } else {
                AnnotatedString annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.marketplace_modal_window_remove_from_liked));
                MutableStateFlow<MarketplaceUiState> mutableStateFlow2 = this.this$0.get_uiState();
                MarketplaceProduct marketplaceProduct4 = this.$likedProduct;
                while (true) {
                    MarketplaceUiState value2 = mutableStateFlow2.getValue();
                    MarketplaceUiState marketplaceUiState2 = value2;
                    MarketplaceProduct marketplaceProduct5 = marketplaceProduct4;
                    MutableStateFlow<MarketplaceUiState> mutableStateFlow3 = mutableStateFlow2;
                    if (mutableStateFlow3.compareAndSet(value2, marketplaceUiState2.copy(((-1) & 1) != 0 ? marketplaceUiState2.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState2.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState2.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState2.money : 0, ((-1) & 16) != 0 ? marketplaceUiState2.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState2.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState2.products : null, ((-1) & 128) != 0 ? marketplaceUiState2.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState2.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState2.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState2.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState2.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState2.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState2.selectedProduct : marketplaceProduct5, ((-1) & 16384) != 0 ? marketplaceUiState2.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState2.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState2.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState2.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState2.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState2.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState2.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState2.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState2.modalBottomWindowText : annotatedStringHtmlTextToAnnotatedString, ((-1) & 8388608) != 0 ? marketplaceUiState2.modalWindowState : MarketplaceModalWindowStateEnum.CONFIRM_REMOVE_LIKE, ((-1) & 16777216) != 0 ? marketplaceUiState2.isModalWindowVisible : true, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState2.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState2.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState2.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState2.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState2.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState2.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState2.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState2.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState2.isNeedClose : false))) {
                        break;
                    }
                    mutableStateFlow2 = mutableStateFlow3;
                    marketplaceProduct4 = marketplaceProduct5;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void onClickLike(@NotNull MarketplaceProduct likedProduct) {
        Intrinsics.checkNotNullParameter(likedProduct, "likedProduct");
        ViewModelExtensionKt.launchOnIO$default(this, null, new C42901(likedProduct, this, null), 1, null);
    }

    public final void onInfoClick() {
        MarketplaceUiState value;
        MarketplaceUiState marketplaceUiState;
        MutableStateFlow<MarketplaceUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            marketplaceUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : true, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false)));
    }

    public final void onCloseModalWindow() {
        MarketplaceUiState value;
        MarketplaceUiState marketplaceUiState;
        MutableStateFlow<MarketplaceUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            marketplaceUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false)));
    }

    public final void onClickCloseInfo() {
        MarketplaceUiState value;
        MarketplaceUiState marketplaceUiState;
        MutableStateFlow<MarketplaceUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            marketplaceUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false)));
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickCloseBottomSheet$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickCloseBottomSheet$1 */
    public static final class C42821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C42821(Continuation<? super C42821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MarketplaceViewModel.this.new C42821(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MarketplaceProduct selectedProduct = MarketplaceViewModel.this.get_uiState().getValue().getSelectedProduct();
            MarketplaceViewModel.this.actionWithJSON.sendConfirmEdit(selectedProduct.copy((16775167 & 1) != 0 ? selectedProduct.isPlatinumVipProduct : false, (16775167 & 2) != 0 ? selectedProduct.name : null, (16775167 & 4) != 0 ? selectedProduct.imageName : null, (16775167 & 8) != 0 ? selectedProduct.rarity : null, (16775167 & 16) != 0 ? selectedProduct.typeProductCard : null, (16775167 & 32) != 0 ? selectedProduct.id : 0, (16775167 & 64) != 0 ? selectedProduct.notificationType : null, (16775167 & 128) != 0 ? selectedProduct.timeVipCard : 0, (16775167 & 256) != 0 ? selectedProduct.time : 0, (16775167 & 512) != 0 ? selectedProduct.timeTemplate : 0, (16775167 & 1024) != 0 ? selectedProduct.inventoryId : 0, (16775167 & 2048) != 0 ? selectedProduct.price : -1L, (16775167 & 4096) != 0 ? selectedProduct.count : 0, (16775167 & 8192) != 0 ? selectedProduct.seller : null, (16775167 & 16384) != 0 ? selectedProduct.description : null, (16775167 & 32768) != 0 ? selectedProduct.timeText : null, (16775167 & 65536) != 0 ? selectedProduct.weight : 0.0d, (16775167 & 131072) != 0 ? selectedProduct.typeTextRes : 0, (262144 & 16775167) != 0 ? selectedProduct.statusForHistory : null, (16775167 & 524288) != 0 ? selectedProduct.isSelected : false, (16775167 & 1048576) != 0 ? selectedProduct.isUser : false, (16775167 & 2097152) != 0 ? selectedProduct.isPublished : false, (16775167 & 4194304) != 0 ? selectedProduct.isHaveLike : false, (16775167 & 8388608) != 0 ? selectedProduct.renderInfo : null), selectedProduct.isHot());
            return Unit.INSTANCE;
        }
    }

    public final void onClickCloseBottomSheet() {
        MarketplaceUiState value;
        MarketplaceUiState marketplaceUiState;
        if (get_uiState().getValue().getSelectedTab().getTabValue() == 5) {
            ViewModelExtensionKt.launchOnIO$default(this, null, new C42821(null), 1, null);
        }
        MutableStateFlow<MarketplaceUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            marketplaceUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false)));
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$closeScreen$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$closeScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n230#2,5:1770\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$closeScreen$1\n*L\n1446#1:1770,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$closeScreen$1 */
    public static final class C42781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C42781(Continuation<? super C42781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MarketplaceViewModel.this.new C42781(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MarketplaceUiState value;
            MarketplaceUiState marketplaceUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                MarketplaceViewModel.this.actionWithJSON.sendCloseInterface();
                MutableStateFlow<MarketplaceUiState> mutableStateFlow = MarketplaceViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    marketplaceUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : true)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void closeScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C42781(null), 1, null);
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickSort$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickSort$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n230#2,5:1770\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickSort$1\n*L\n1464#1:1770,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickSort$1 */
    public static final class C42951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        /* compiled from: MarketplaceViewModel.kt */
        @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickSort$1$WhenMappings */
        /* loaded from: classes3.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MarketplaceSortFilter.values().length];
                try {
                    iArr[MarketplaceSortFilter.NEW.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MarketplaceSortFilter.OLD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MarketplaceSortFilter.DESCENDING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MarketplaceSortFilter.ASCENDING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C42951(Continuation<? super C42951> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MarketplaceViewModel.this.new C42951(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MarketplaceSortFilter marketplaceSortFilter;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = WhenMappings.$EnumSwitchMapping$0[MarketplaceViewModel.this.get_uiState().getValue().getCurrentSortFilter().ordinal()];
            if (i == 1) {
                marketplaceSortFilter = MarketplaceSortFilter.OLD;
            } else if (i == 2) {
                marketplaceSortFilter = MarketplaceSortFilter.NEW;
            } else if (i == 3) {
                marketplaceSortFilter = MarketplaceSortFilter.ASCENDING;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                marketplaceSortFilter = MarketplaceSortFilter.DESCENDING;
            }
            MarketplaceViewModel.this.actionWithJSON.sendSortFilter(marketplaceSortFilter.getValue());
            MutableStateFlow<MarketplaceUiState> mutableStateFlow = MarketplaceViewModel.this.get_uiState();
            while (true) {
                MarketplaceUiState value = mutableStateFlow.getValue();
                MarketplaceUiState marketplaceUiState = value;
                MutableStateFlow<MarketplaceUiState> mutableStateFlow2 = mutableStateFlow;
                if (mutableStateFlow2.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 1, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : marketplaceSortFilter, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false))) {
                    return Unit.INSTANCE;
                }
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public final void onClickSort() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C42951(null), 1, null);
    }

    /* compiled from: MarketplaceViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickConfirmSearch$1", m7120f = "MarketplaceViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMarketplaceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickConfirmSearch$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1769:1\n230#2,5:1770\n*S KotlinDebug\n*F\n+ 1 MarketplaceViewModel.kt\ncom/blackhub/bronline/game/gui/marketplace/MarketplaceViewModel$onClickConfirmSearch$1\n*L\n1477#1:1770,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel$onClickConfirmSearch$1 */
    public static final class C42851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $word;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42851(String str, Continuation<? super C42851> continuation) {
            super(2, continuation);
            this.$word = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MarketplaceViewModel.this.new C42851(this.$word, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C42851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MarketplaceUiState value;
            MarketplaceUiState marketplaceUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                MarketplaceViewModel.this.actionWithJSON.sendSearchWord(this.$word);
                MutableStateFlow<MarketplaceUiState> mutableStateFlow = MarketplaceViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    marketplaceUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : CollectionsKt__CollectionsKt.emptyList(), ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 1, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onClickConfirmSearch(@NotNull String word) {
        Intrinsics.checkNotNullParameter(word, "word");
        ViewModelExtensionKt.launchOnIO$default(this, null, new C42851(word, null), 1, null);
    }

    public final void joinLikes(JSONArray likedProductsIds) {
        Object next;
        if (likedProductsIds == null) {
            return;
        }
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) get_uiState().getValue().getProducts());
        ArrayList arrayList = new ArrayList();
        int length = likedProductsIds.length();
        for (int i = 0; i < length; i++) {
            int iOptInt = likedProductsIds.optInt(i);
            arrayList.add(Integer.valueOf(iOptInt));
            Iterator it = mutableList.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((MarketplaceProduct) next).getId() == iOptInt) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            MarketplaceProduct marketplaceProduct = (MarketplaceProduct) next;
            if (marketplaceProduct != null) {
                marketplaceProduct.setHaveLike(true);
            }
        }
        MutableStateFlow<MarketplaceUiState> mutableStateFlow = get_uiState();
        while (true) {
            MarketplaceUiState value = mutableStateFlow.getValue();
            MarketplaceUiState marketplaceUiState = value;
            ArrayList arrayList2 = arrayList;
            if (mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : mutableList, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : arrayList, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false))) {
                return;
            } else {
                arrayList = arrayList2;
            }
        }
    }

    public final void onConfirmPublish() throws JSONException {
        MarketplaceUiState value;
        MarketplaceUiState marketplaceUiState;
        MarketplaceBottomSheetInfo bottomSheetInfo = get_uiState().getValue().getBottomSheetInfo();
        boolean z = false;
        if (get_uiState().getValue().getMarketplaceLimits().getPriceForPublish() + (bottomSheetInfo.isCheckBoxChecked() ? get_uiState().getValue().getMarketplaceLimits().getHotTicketCost() : 0) <= get_uiState().getValue().getMoney()) {
            MarketplaceProduct selectedProduct = get_uiState().getValue().getSelectedProduct();
            this.actionWithJSON.sendConfirmPublishProductLot(selectedProduct.copy((16775167 & 1) != 0 ? selectedProduct.isPlatinumVipProduct : false, (16775167 & 2) != 0 ? selectedProduct.name : null, (16775167 & 4) != 0 ? selectedProduct.imageName : null, (16775167 & 8) != 0 ? selectedProduct.rarity : null, (16775167 & 16) != 0 ? selectedProduct.typeProductCard : null, (16775167 & 32) != 0 ? selectedProduct.id : 0, (16775167 & 64) != 0 ? selectedProduct.notificationType : null, (16775167 & 128) != 0 ? selectedProduct.timeVipCard : 0, (16775167 & 256) != 0 ? selectedProduct.time : 0, (16775167 & 512) != 0 ? selectedProduct.timeTemplate : 0, (16775167 & 1024) != 0 ? selectedProduct.inventoryId : 0, (16775167 & 2048) != 0 ? selectedProduct.price : bottomSheetInfo.getPrice(), (16775167 & 4096) != 0 ? selectedProduct.count : bottomSheetInfo.getProductCount(), (16775167 & 8192) != 0 ? selectedProduct.seller : null, (16775167 & 16384) != 0 ? selectedProduct.description : null, (16775167 & 32768) != 0 ? selectedProduct.timeText : null, (16775167 & 65536) != 0 ? selectedProduct.weight : 0.0d, (16775167 & 131072) != 0 ? selectedProduct.typeTextRes : 0, (262144 & 16775167) != 0 ? selectedProduct.statusForHistory : null, (16775167 & 524288) != 0 ? selectedProduct.isSelected : false, (16775167 & 1048576) != 0 ? selectedProduct.isUser : false, (16775167 & 2097152) != 0 ? selectedProduct.isPublished : false, (16775167 & 4194304) != 0 ? selectedProduct.isHaveLike : false, (16775167 & 8388608) != 0 ? selectedProduct.renderInfo : null), bottomSheetInfo.isCheckBoxChecked());
            z = true;
        } else {
            getLocalNotification().showErrorNotification(this.stringResources.getString(R.string.black_pass_not_enough_money));
        }
        MutableStateFlow<MarketplaceUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            marketplaceUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : z, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false)));
    }

    public final void onConfirmEdit() throws JSONException {
        MarketplaceUiState value;
        MarketplaceUiState marketplaceUiState;
        MarketplaceUiState value2;
        MarketplaceUiState marketplaceUiState2;
        MarketplaceBottomSheetInfo bottomSheetInfo = get_uiState().getValue().getBottomSheetInfo();
        if (get_uiState().getValue().getMarketplaceLimits().getPriceForPublish() + (bottomSheetInfo.isCheckBoxChecked() ? get_uiState().getValue().getMarketplaceLimits().getHotTicketCost() : 0) <= get_uiState().getValue().getMoney()) {
            MarketplaceProduct selectedProduct = get_uiState().getValue().getSelectedProduct();
            this.actionWithJSON.sendConfirmEdit(selectedProduct.copy((16775167 & 1) != 0 ? selectedProduct.isPlatinumVipProduct : false, (16775167 & 2) != 0 ? selectedProduct.name : null, (16775167 & 4) != 0 ? selectedProduct.imageName : null, (16775167 & 8) != 0 ? selectedProduct.rarity : null, (16775167 & 16) != 0 ? selectedProduct.typeProductCard : null, (16775167 & 32) != 0 ? selectedProduct.id : 0, (16775167 & 64) != 0 ? selectedProduct.notificationType : null, (16775167 & 128) != 0 ? selectedProduct.timeVipCard : 0, (16775167 & 256) != 0 ? selectedProduct.time : 0, (16775167 & 512) != 0 ? selectedProduct.timeTemplate : 0, (16775167 & 1024) != 0 ? selectedProduct.inventoryId : 0, (16775167 & 2048) != 0 ? selectedProduct.price : bottomSheetInfo.getPrice(), (16775167 & 4096) != 0 ? selectedProduct.count : 0, (16775167 & 8192) != 0 ? selectedProduct.seller : null, (16775167 & 16384) != 0 ? selectedProduct.description : null, (16775167 & 32768) != 0 ? selectedProduct.timeText : null, (16775167 & 65536) != 0 ? selectedProduct.weight : 0.0d, (16775167 & 131072) != 0 ? selectedProduct.typeTextRes : 0, (262144 & 16775167) != 0 ? selectedProduct.statusForHistory : null, (16775167 & 524288) != 0 ? selectedProduct.isSelected : false, (16775167 & 1048576) != 0 ? selectedProduct.isUser : false, (16775167 & 2097152) != 0 ? selectedProduct.isPublished : false, (16775167 & 4194304) != 0 ? selectedProduct.isHaveLike : false, (16775167 & 8388608) != 0 ? selectedProduct.renderInfo : null), bottomSheetInfo.isCheckBoxChecked());
            MutableStateFlow<MarketplaceUiState> mutableStateFlow = get_uiState();
            do {
                value2 = mutableStateFlow.getValue();
                marketplaceUiState2 = value2;
            } while (!mutableStateFlow.compareAndSet(value2, marketplaceUiState2.copy(((-1) & 1) != 0 ? marketplaceUiState2.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState2.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState2.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState2.money : 0, ((-1) & 16) != 0 ? marketplaceUiState2.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState2.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState2.products : null, ((-1) & 128) != 0 ? marketplaceUiState2.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState2.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState2.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState2.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState2.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState2.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState2.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState2.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState2.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState2.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState2.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState2.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState2.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState2.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState2.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState2.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState2.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState2.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState2.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState2.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState2.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState2.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState2.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState2.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState2.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState2.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState2.isNeedClose : false)));
            return;
        }
        getLocalNotification().showErrorNotification(this.stringResources.getString(R.string.black_pass_not_enough_money));
        MutableStateFlow<MarketplaceUiState> mutableStateFlow2 = get_uiState();
        do {
            value = mutableStateFlow2.getValue();
            marketplaceUiState = value;
        } while (!mutableStateFlow2.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : null, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false)));
    }

    public final void onConfirmBuy() throws JSONException {
        MarketplaceUiState value;
        MarketplaceUiState marketplaceUiState;
        MarketplaceProduct marketplaceProductCopy;
        long priceForAll = get_uiState().getValue().getBottomSheetInfo().getPriceForAll();
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) get_uiState().getValue().getProducts());
        MarketplaceProduct selectedProduct = get_uiState().getValue().getSelectedProduct();
        MarketplaceBottomSheetInfo bottomSheetInfo = get_uiState().getValue().getBottomSheetInfo();
        if (priceForAll <= get_uiState().getValue().getMoney()) {
            this.actionWithJSON.sendConfirmBuy(get_uiState().getValue().getSelectedProduct().getId(), bottomSheetInfo.getProductCount());
            int count = selectedProduct.getCount() - get_uiState().getValue().getBottomSheetInfo().getProductCount();
            if (IntExtensionKt.isZero(Integer.valueOf(count))) {
                mutableList.remove(selectedProduct);
            } else {
                List<MarketplaceProduct> products = get_uiState().getValue().getProducts();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(products, 10));
                for (MarketplaceProduct marketplaceProduct : products) {
                    MarketplaceProduct marketplaceProduct2 = marketplaceProduct.getId() == selectedProduct.getId() ? marketplaceProduct : null;
                    if (marketplaceProduct2 == null || (marketplaceProductCopy = marketplaceProduct2.copy((16775167 & 1) != 0 ? marketplaceProduct2.isPlatinumVipProduct : false, (16775167 & 2) != 0 ? marketplaceProduct2.name : null, (16775167 & 4) != 0 ? marketplaceProduct2.imageName : null, (16775167 & 8) != 0 ? marketplaceProduct2.rarity : null, (16775167 & 16) != 0 ? marketplaceProduct2.typeProductCard : null, (16775167 & 32) != 0 ? marketplaceProduct2.id : 0, (16775167 & 64) != 0 ? marketplaceProduct2.notificationType : null, (16775167 & 128) != 0 ? marketplaceProduct2.timeVipCard : 0, (16775167 & 256) != 0 ? marketplaceProduct2.time : 0, (16775167 & 512) != 0 ? marketplaceProduct2.timeTemplate : 0, (16775167 & 1024) != 0 ? marketplaceProduct2.inventoryId : 0, (16775167 & 2048) != 0 ? marketplaceProduct2.price : 0L, (16775167 & 4096) != 0 ? marketplaceProduct2.count : count, (16775167 & 8192) != 0 ? marketplaceProduct2.seller : null, (16775167 & 16384) != 0 ? marketplaceProduct2.description : null, (16775167 & 32768) != 0 ? marketplaceProduct2.timeText : null, (16775167 & 65536) != 0 ? marketplaceProduct2.weight : 0.0d, (16775167 & 131072) != 0 ? marketplaceProduct2.typeTextRes : 0, (262144 & 16775167) != 0 ? marketplaceProduct2.statusForHistory : null, (16775167 & 524288) != 0 ? marketplaceProduct2.isSelected : false, (16775167 & 1048576) != 0 ? marketplaceProduct2.isUser : false, (16775167 & 2097152) != 0 ? marketplaceProduct2.isPublished : false, (16775167 & 4194304) != 0 ? marketplaceProduct2.isHaveLike : false, (16775167 & 8388608) != 0 ? marketplaceProduct2.renderInfo : null)) == null) {
                        marketplaceProductCopy = marketplaceProduct;
                    }
                    arrayList.add(marketplaceProductCopy);
                }
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
            }
        } else {
            getLocalNotification().showErrorNotification(this.stringResources.getString(R.string.black_pass_not_enough_money));
        }
        MutableStateFlow<MarketplaceUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            marketplaceUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : mutableList, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false)));
    }

    public final void onConfirmDeleteCard() throws JSONException {
        this.actionWithJSON.sendDeleteProductLot();
        MarketplaceSortFilter marketplaceSortFilter = MarketplaceSortFilter.DESCENDING;
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) get_uiState().getValue().getProducts());
        mutableList.remove(get_uiState().getValue().getSelectedProduct());
        MutableStateFlow<MarketplaceUiState> mutableStateFlow = get_uiState();
        while (true) {
            MarketplaceUiState value = mutableStateFlow.getValue();
            MarketplaceUiState marketplaceUiState = value;
            MutableStateFlow<MarketplaceUiState> mutableStateFlow2 = mutableStateFlow;
            List list = mutableList;
            if (mutableStateFlow2.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : mutableList, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : marketplaceSortFilter, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false))) {
                return;
            }
            mutableStateFlow = mutableStateFlow2;
            mutableList = list;
        }
    }

    public final void onConfirmSendLike() throws JSONException {
        MarketplaceProduct marketplaceProductCopy;
        MarketplaceProduct selectedProduct = get_uiState().getValue().getSelectedProduct();
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) get_uiState().getValue().getProducts());
        this.actionWithJSON.sendLike(selectedProduct.getId());
        if (get_uiState().getValue().getSelectedTab().getTabValue() == 4) {
            mutableList.remove(selectedProduct);
        }
        List<MarketplaceProduct> list = mutableList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (MarketplaceProduct marketplaceProduct : list) {
            MarketplaceProduct marketplaceProduct2 = marketplaceProduct.getId() == selectedProduct.getId() ? marketplaceProduct : null;
            if (marketplaceProduct2 != null && (marketplaceProductCopy = marketplaceProduct2.copy((16775167 & 1) != 0 ? marketplaceProduct2.isPlatinumVipProduct : false, (16775167 & 2) != 0 ? marketplaceProduct2.name : null, (16775167 & 4) != 0 ? marketplaceProduct2.imageName : null, (16775167 & 8) != 0 ? marketplaceProduct2.rarity : null, (16775167 & 16) != 0 ? marketplaceProduct2.typeProductCard : null, (16775167 & 32) != 0 ? marketplaceProduct2.id : 0, (16775167 & 64) != 0 ? marketplaceProduct2.notificationType : null, (16775167 & 128) != 0 ? marketplaceProduct2.timeVipCard : 0, (16775167 & 256) != 0 ? marketplaceProduct2.time : 0, (16775167 & 512) != 0 ? marketplaceProduct2.timeTemplate : 0, (16775167 & 1024) != 0 ? marketplaceProduct2.inventoryId : 0, (16775167 & 2048) != 0 ? marketplaceProduct2.price : 0L, (16775167 & 4096) != 0 ? marketplaceProduct2.count : 0, (16775167 & 8192) != 0 ? marketplaceProduct2.seller : null, (16775167 & 16384) != 0 ? marketplaceProduct2.description : null, (16775167 & 32768) != 0 ? marketplaceProduct2.timeText : null, (16775167 & 65536) != 0 ? marketplaceProduct2.weight : 0.0d, (16775167 & 131072) != 0 ? marketplaceProduct2.typeTextRes : 0, (262144 & 16775167) != 0 ? marketplaceProduct2.statusForHistory : null, (16775167 & 524288) != 0 ? marketplaceProduct2.isSelected : false, (16775167 & 1048576) != 0 ? marketplaceProduct2.isUser : false, (16775167 & 2097152) != 0 ? marketplaceProduct2.isPublished : false, (16775167 & 4194304) != 0 ? marketplaceProduct2.isHaveLike : !marketplaceProduct.isHaveLike(), (16775167 & 8388608) != 0 ? marketplaceProduct2.renderInfo : null)) != null) {
                marketplaceProduct = marketplaceProductCopy;
            }
            arrayList.add(marketplaceProduct);
        }
        MutableStateFlow<MarketplaceUiState> mutableStateFlow = get_uiState();
        while (true) {
            MarketplaceUiState value = mutableStateFlow.getValue();
            MarketplaceUiState marketplaceUiState = value;
            ArrayList arrayList2 = arrayList;
            if (mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : null, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : arrayList, ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : null, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : null, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 0, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : null, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false))) {
                return;
            } else {
                arrayList = arrayList2;
            }
        }
    }

    public final int getTrimmedCount(long count) {
        if (count >= 1000) {
            if (count < 1000000) {
                count /= 1000;
            } else if (count < 1000000000) {
                count /= 1000000;
            } else {
                count /= 1000000000;
            }
        }
        return (int) count;
    }

    public static /* synthetic */ List calculatePaginatorPagesToShow$default(MarketplaceViewModel marketplaceViewModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = marketplaceViewModel.get_uiState().getValue().getCurrentPage();
        }
        if ((i3 & 2) != 0) {
            i2 = marketplaceViewModel.getUiState().getValue().getTotalPages();
        }
        return marketplaceViewModel.calculatePaginatorPagesToShow(i, i2);
    }

    public final List<Integer> calculatePaginatorPagesToShow(int currentPage, int totalPages) {
        int i = currentPage - 2;
        int i2 = 1;
        if (i <= 0) {
            i = 1;
        }
        int i3 = i + 4;
        if (i3 > totalPages) {
            int i4 = totalPages - 4;
            if (i4 > 0) {
                i2 = i4;
            }
        } else {
            i2 = i;
            totalPages = i3;
        }
        return CollectionsKt___CollectionsKt.toList(new IntRange(i2, totalPages));
    }

    public final List<MarketplaceProduct> addVipProductCard(List<MarketplaceProduct> products, int price, int timeVipCard) {
        int i = products.size() == 0 ? 0 : 1;
        List<MarketplaceProduct> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) products);
        mutableList.add(i, new MarketplaceProduct(true, this.stringResources.getString(R.string.craft_is_with_vip_platinum), null, MarketplaceRarityEnum.SPECIAL, MarketplaceTypeProductCardEnum.BEST, 0, MarketplaceNotificationEnum.THE_BEST, timeVipCard, 0, 0, 0, price, 999, this.stringResources.getString(R.string.common_black_russia), this.stringResources.getString(R.string.marketplace_vip_description), null, 0.0d, 0, null, false, false, false, false, null, 16746276, null));
        return mutableList;
    }

    public final void changeTabStatus(int tabValue) {
        MarketplaceSortFilter savedSortFilter;
        MarketplaceUiState value;
        MarketplaceUiState marketplaceUiState;
        char c;
        int tabValue2 = get_uiState().getValue().getSelectedTab().getTabValue();
        MarketplaceSortFilter currentSortFilter = get_uiState().getValue().getCurrentSortFilter();
        if (tabValue == 3) {
            savedSortFilter = MarketplaceSortFilter.NEW;
        } else {
            savedSortFilter = MarketplaceSortFilter.DESCENDING;
        }
        List<MarketplaceTab> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) get_uiState().getValue().getTabs());
        MarketplaceTab marketplaceTab = null;
        for (MarketplaceTab marketplaceTab2 : mutableList) {
            int tabValue3 = marketplaceTab2.getTabValue();
            if (tabValue3 == tabValue) {
                MarketplaceTab marketplaceTabCopy = marketplaceTab2.copy((223 & 1) != 0 ? marketplaceTab2.isHasPlatinumVip : false, (223 & 2) != 0 ? marketplaceTab2.tabValue : 0, (223 & 4) != 0 ? marketplaceTab2.tabName : null, (223 & 8) != 0 ? marketplaceTab2.icon : 0, (223 & 16) != 0 ? marketplaceTab2.titleIcon : 0, (223 & 32) != 0 ? marketplaceTab2.isSelected : true, (223 & 64) != 0 ? marketplaceTab2.isHaveUpdates : false, (223 & 128) != 0 ? marketplaceTab2.savedSortFilter : null);
                marketplaceTab2.setSelected(true);
                marketplaceTab2.setHaveUpdates(false);
                marketplaceTab = marketplaceTabCopy;
                c = 3;
                savedSortFilter = marketplaceTab2.getSavedSortFilter();
            } else if (tabValue3 == tabValue2) {
                marketplaceTab2.setSelected(false);
                c = 3;
                if (marketplaceTab2.getTabValue() == 3) {
                    marketplaceTab2.setSavedSortFilter(currentSortFilter);
                }
            } else {
                c = 3;
                marketplaceTab2.setSelected(false);
            }
        }
        MarketplaceBottomSheetInfo marketplaceBottomSheetInfo = new MarketplaceBottomSheetInfo(marketplaceTab != null ? marketplaceTab.getTabValue() : 2, false, 0, 0L, 0L, 0, 0, 126, null);
        if (marketplaceTab != null) {
            MutableStateFlow<MarketplaceUiState> mutableStateFlow = get_uiState();
            do {
                value = mutableStateFlow.getValue();
                marketplaceUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, marketplaceUiState.copy(((-1) & 1) != 0 ? marketplaceUiState.profileInfo : null, ((-1) & 2) != 0 ? marketplaceUiState.bottomSheetInfo : marketplaceBottomSheetInfo, ((-1) & 4) != 0 ? marketplaceUiState.marketplaceLimits : null, ((-1) & 8) != 0 ? marketplaceUiState.money : 0, ((-1) & 16) != 0 ? marketplaceUiState.isHasPlatinumVip : false, ((-1) & 32) != 0 ? marketplaceUiState.allInventoryItems : null, ((-1) & 64) != 0 ? marketplaceUiState.products : CollectionsKt__CollectionsKt.emptyList(), ((-1) & 128) != 0 ? marketplaceUiState.inventoryProducts : null, ((-1) & 256) != 0 ? marketplaceUiState.tabs : mutableList, ((-1) & 512) != 0 ? marketplaceUiState.filterList : null, ((-1) & 1024) != 0 ? marketplaceUiState.listOfChosenFilterIds : null, ((-1) & 2048) != 0 ? marketplaceUiState.likedList : null, ((-1) & 4096) != 0 ? marketplaceUiState.selectedTab : marketplaceTab, ((-1) & 8192) != 0 ? marketplaceUiState.selectedProduct : null, ((-1) & 16384) != 0 ? marketplaceUiState.currentPage : 1, ((-1) & 32768) != 0 ? marketplaceUiState.totalPages : 0, ((-1) & 65536) != 0 ? marketplaceUiState.priceVip : 0, ((-1) & 131072) != 0 ? marketplaceUiState.typeVip : 0, ((-1) & 262144) != 0 ? marketplaceUiState.timeVipCard : 0, ((-1) & 524288) != 0 ? marketplaceUiState.pagesToShow : null, ((-1) & 1048576) != 0 ? marketplaceUiState.currentSortFilter : savedSortFilter, ((-1) & 2097152) != 0 ? marketplaceUiState.bestMarketplaceProduct : null, ((-1) & 4194304) != 0 ? marketplaceUiState.modalBottomWindowText : null, ((-1) & 8388608) != 0 ? marketplaceUiState.modalWindowState : null, ((-1) & 16777216) != 0 ? marketplaceUiState.isModalWindowVisible : false, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? marketplaceUiState.isScrollBarVisible : false, ((-1) & 67108864) != 0 ? marketplaceUiState.isBottomSheetBlockVisible : false, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? marketplaceUiState.isNeedToShowFilter : false, ((-1) & 268435456) != 0 ? marketplaceUiState.isHintsOpened : false, ((-1) & 536870912) != 0 ? marketplaceUiState.isWithIndicationFilter : false, ((-1) & 1073741824) != 0 ? marketplaceUiState.isWaitingServerResponseForPublishing : false, ((-1) & Integer.MIN_VALUE) != 0 ? marketplaceUiState.isCanPublishProductCards : false, (1 & 1) != 0 ? marketplaceUiState.bgMarketplace : null, (1 & 2) != 0 ? marketplaceUiState.isNeedClose : false)));
        }
    }
}

