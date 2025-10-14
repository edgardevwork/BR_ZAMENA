package com.blackhub.bronline.game.gui.cases;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.C2732C;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.constants.resources.PngConstantsId73;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.game.core.extension.FloatExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.core.extension.LongExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.DateFormatter;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.cases.model.BonusRewardWithStatus;
import com.blackhub.bronline.game.gui.cases.model.Case;
import com.blackhub.bronline.game.gui.cases.model.CaseBonus;
import com.blackhub.bronline.game.gui.cases.model.CasePricesModel;
import com.blackhub.bronline.game.gui.cases.model.CaseRenderAttachment;
import com.blackhub.bronline.game.gui.cases.model.CaseReward;
import com.blackhub.bronline.game.gui.cases.model.CaseSprayedInfoAttachment;
import com.blackhub.bronline.game.gui.cases.model.CaseWithStatusModel;
import com.blackhub.bronline.game.gui.cases.model.CasesBannerAttachment;
import com.blackhub.bronline.game.gui.cases.model.CasesBannerSelectedCase;
import com.blackhub.bronline.game.gui.cases.model.CasesBonusHintAttachment;
import com.blackhub.bronline.game.gui.cases.model.CasesSortedListWithScrolledPos;
import com.blackhub.bronline.game.gui.cases.model.CasesText;
import com.blackhub.bronline.game.gui.cases.network.CasesActionWithJSON;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.cases.CasesAwardDto;
import com.blackhub.bronline.game.model.remote.response.cases.CasesBonusDto;
import com.blackhub.bronline.game.model.remote.response.cases.CasesCaseTypeDto;
import com.blackhub.bronline.game.model.remote.response.cases.CasesResponse;
import com.bless.client.R;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CasesViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1945:1\n230#2,5:1946\n230#2,5:1951\n230#2,5:1956\n230#2,5:1961\n230#2,5:1966\n230#2,5:1971\n230#2,5:1976\n230#2,5:1981\n230#2,5:1986\n230#2,5:1991\n230#2,5:1996\n1864#3,3:2001\n1855#3:2004\n1549#3:2005\n1620#3,3:2006\n1549#3:2009\n1620#3,3:2010\n1856#3:2013\n1549#3:2015\n1620#3,3:2016\n1549#3:2019\n1620#3,3:2020\n1549#3:2023\n1620#3,3:2024\n1045#3:2027\n766#3:2028\n857#3,2:2029\n766#3:2031\n857#3,2:2032\n766#3:2034\n857#3,2:2035\n766#3:2037\n857#3,2:2038\n766#3:2040\n857#3,2:2041\n1#4:2014\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel\n*L\n681#1:1946,5\n694#1:1951,5\n745#1:1956,5\n753#1:1961,5\n889#1:1966,5\n907#1:1971,5\n915#1:1976,5\n1032#1:1981,5\n1087#1:1986,5\n1122#1:1991,5\n1168#1:1996,5\n1264#1:2001,3\n1307#1:2004\n1320#1:2005\n1320#1:2006,3\n1329#1:2009\n1329#1:2010,3\n1307#1:2013\n1690#1:2015\n1690#1:2016,3\n1732#1:2019\n1732#1:2020,3\n1802#1:2023\n1802#1:2024,3\n1865#1:2027\n1867#1:2028\n1867#1:2029,2\n1870#1:2031\n1870#1:2032,2\n1873#1:2034\n1873#1:2035,2\n1876#1:2037\n1876#1:2038,2\n1879#1:2040\n1879#1:2041,2\n*E\n"})
/* loaded from: classes3.dex */
public final class CasesViewModel extends BaseViewModel<CasesUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<CasesUiState> _uiState;

    @NotNull
    public final CasesActionWithJSON actionWithJSON;

    @NotNull
    public final Application application;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StringResource stringResources;

    /* compiled from: CasesViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommonRarityEnum.values().length];
            try {
                iArr[CommonRarityEnum.LEGENDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonRarityEnum.EPIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommonRarityEnum.RARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommonRarityEnum.UNCOMMON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public CasesViewModel(@NotNull CasesActionWithJSON actionWithJSON, @NotNull LocalNotification localNotification, @NotNull StringResource stringResources, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(stringResources, "stringResources");
        Intrinsics.checkNotNullParameter(application, "application");
        this.actionWithJSON = actionWithJSON;
        this.localNotification = localNotification;
        this.stringResources = stringResources;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new CasesUiState(0, null, 0, 0, null, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, false, null, null, null, null, 0, 0, false, false, 0, 0, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, 0, false, null, 0, null, 0, 0, 0, false, null, null, 0, false, false, false, false, -1, Integer.MAX_VALUE, null));
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<CasesUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<CasesUiState> getUiState() {
        return FlowKt.asStateFlow(get_uiState());
    }

    /* compiled from: CasesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$initInterface$1", m7120f = "CasesViewModel.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, m7122l = {351}, m7123m = "invokeSuspend", m7124n = {"prizesBgPattern", "casesStrings", "casesBonusHintAttachment", "images", "bgImage", "valueOfMaxDust", "legendaryCaseId", "dailyCaseId", "bcAmountString", "valueOfBc", "valueOfCurrentDust", "isShowingTutorial", "valueOfOpenedCases", "selectedCaseId", "casesList", "selectedCase", "selectedCasePos", "selectedBonuses", "casePrices", "casePricesForGuide", "dpProgress"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20"})
    @SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$initInterface$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1945:1\n230#2,5:1946\n230#2,5:1951\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$initInterface$1\n*L\n360#1:1946,5\n437#1:1951,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.cases.CasesViewModel$initInterface$1 */
    /* loaded from: classes.dex */
    public static final class C37951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<BpRewardsAwardsDto> $awards;
        public final /* synthetic */ CasesResponse $casesResponse;
        public final /* synthetic */ int $heightOfImage;
        public final /* synthetic */ List<InvItems> $inventoryList;
        public final /* synthetic */ JSONObject $json;
        public final /* synthetic */ int $widthOfImage;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
        public Object L$16;
        public Object L$17;
        public Object L$18;
        public Object L$19;
        public Object L$2;
        public Object L$20;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37951(CasesResponse casesResponse, List<BpRewardsAwardsDto> list, JSONObject jSONObject, List<InvItems> list2, int i, int i2, Continuation<? super C37951> continuation) {
            super(2, continuation);
            this.$casesResponse = casesResponse;
            this.$awards = list;
            this.$json = jSONObject;
            this.$inventoryList = list2;
            this.$widthOfImage = i;
            this.$heightOfImage = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C37951 c37951 = CasesViewModel.this.new C37951(this.$casesResponse, this.$awards, this.$json, this.$inventoryList, this.$widthOfImage, this.$heightOfImage, continuation);
            c37951.L$0 = obj;
            return c37951;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v15, types: [T, com.blackhub.bronline.game.gui.cases.model.CasesText] */
        /* JADX WARN: Type inference failed for: r4v16, types: [T, com.blackhub.bronline.game.gui.cases.model.CasesBonusHintAttachment] */
        /* JADX WARN: Type inference failed for: r4v17, types: [T, java.util.Map] */
        /* JADX WARN: Type inference failed for: r4v18, types: [T, androidx.compose.ui.text.AnnotatedString] */
        /* JADX WARN: Type inference failed for: r4v20, types: [T, java.util.List] */
        /* JADX WARN: Type inference failed for: r4v22, types: [T, java.util.List] */
        /* JADX WARN: Type inference failed for: r4v24, types: [T, com.blackhub.bronline.game.gui.cases.model.CasePricesModel] */
        /* JADX WARN: Type inference failed for: r5v4, types: [T, com.blackhub.bronline.game.gui.cases.model.Case] */
        /* JADX WARN: Type inference failed for: r5v7, types: [T, com.blackhub.bronline.game.gui.cases.model.CasePricesModel] */
        /* JADX WARN: Type inference failed for: r5v9, types: [T, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            Ref.ObjectRef objectRef3;
            Ref.IntRef intRef;
            Ref.ObjectRef objectRef4;
            Ref.ObjectRef objectRef5;
            Ref.IntRef intRef2;
            Ref.IntRef intRef3;
            Ref.IntRef intRef4;
            Ref.ObjectRef objectRef6;
            Ref.IntRef intRef5;
            Bitmap bitmap;
            Ref.ObjectRef objectRef7;
            Ref.ObjectRef objectRef8;
            Ref.IntRef intRef6;
            Ref.IntRef intRef7;
            Ref.BooleanRef booleanRef;
            Ref.IntRef intRef8;
            Ref.ObjectRef objectRef9;
            Ref.ObjectRef objectRef10;
            Ref.ObjectRef objectRef11;
            CasesUiState value;
            CasesUiState casesUiState;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Bitmap bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(CasesViewModel.this.application, R.drawable.reward_card_bg_pattern);
                if ((!this.$casesResponse.getCases().isEmpty()) && (!this.$awards.isEmpty())) {
                    int iOptInt = this.$json.optInt("t");
                    if (iOptInt == 1) {
                        objectRef = new Ref.ObjectRef();
                        objectRef.element = new CasesText(null, null, null, null, null, null, null, 127, null);
                        Ref.ObjectRef objectRef12 = new Ref.ObjectRef();
                        objectRef12.element = new CasesBonusHintAttachment(null, null, null, null, null, null, 63, null);
                        objectRef2 = new Ref.ObjectRef();
                        objectRef2.element = MapsKt__MapsKt.emptyMap();
                        objectRef3 = new Ref.ObjectRef();
                        intRef = new Ref.IntRef();
                        Ref.IntRef intRef9 = new Ref.IntRef();
                        Ref.IntRef intRef10 = new Ref.IntRef();
                        Ref.ObjectRef objectRef13 = new Ref.ObjectRef();
                        objectRef13.element = new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null);
                        Ref.IntRef intRef11 = new Ref.IntRef();
                        Ref.IntRef intRef12 = new Ref.IntRef();
                        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                        Ref.IntRef intRef13 = new Ref.IntRef();
                        Ref.IntRef intRef14 = new Ref.IntRef();
                        Ref.ObjectRef objectRef14 = new Ref.ObjectRef();
                        Ref.ObjectRef objectRef15 = new Ref.ObjectRef();
                        Ref.ObjectRef objectRef16 = new Ref.ObjectRef();
                        objectRef16.element = CollectionsKt__CollectionsKt.emptyList();
                        Ref.ObjectRef objectRef17 = new Ref.ObjectRef();
                        objectRef17.element = new Case(0, null, null, null, 0, false, 0, null, null, null, 0, false, null, null, 0, null, 65535, null);
                        Ref.IntRef intRef15 = new Ref.IntRef();
                        Ref.IntRef intRef16 = new Ref.IntRef();
                        Ref.ObjectRef objectRef18 = new Ref.ObjectRef();
                        objectRef18.element = CollectionsKt__CollectionsKt.emptyList();
                        Ref.ObjectRef objectRef19 = new Ref.ObjectRef();
                        objectRef19.element = new CasePricesModel(null, null, 0, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 16383, null);
                        Ref.ObjectRef objectRef20 = new Ref.ObjectRef();
                        objectRef20.element = new CasePricesModel(null, null, 0, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 16383, null);
                        Ref.ObjectRef objectRef21 = new Ref.ObjectRef();
                        objectRef21.element = CollectionsKt__CollectionsKt.emptyList();
                        objectRef4 = objectRef21;
                        objectRef5 = objectRef19;
                        intRef2 = intRef16;
                        intRef3 = intRef9;
                        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Deferred[]{BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CasesViewModel$initInterface$1$deferredTasks$1(objectRef2, CasesViewModel.this, objectRef3, objectRef, objectRef12, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CasesViewModel$initInterface$1$deferredTasks$2(intRef, this.$casesResponse, intRef9, intRef10, intRef11, this.$json, objectRef13, CasesViewModel.this, intRef12, booleanRef2, intRef13, intRef14, objectRef14, objectRef15, objectRef16, this.$awards, this.$inventoryList, objectRef17, intRef15, intRef16, objectRef18, objectRef19, objectRef20, objectRef21, null), 3, null)});
                        this.L$0 = bitmapDrawableToBitmap;
                        this.L$1 = objectRef;
                        this.L$2 = objectRef12;
                        this.L$3 = objectRef2;
                        this.L$4 = objectRef3;
                        this.L$5 = intRef;
                        this.L$6 = intRef3;
                        this.L$7 = intRef10;
                        this.L$8 = objectRef13;
                        this.L$9 = intRef11;
                        this.L$10 = intRef12;
                        this.L$11 = booleanRef2;
                        this.L$12 = intRef13;
                        this.L$13 = intRef14;
                        this.L$14 = objectRef16;
                        this.L$15 = objectRef17;
                        this.L$16 = intRef2;
                        this.L$17 = objectRef18;
                        this.L$18 = objectRef5;
                        this.L$19 = objectRef20;
                        this.L$20 = objectRef4;
                        this.label = 1;
                        if (AwaitKt.awaitAll(listListOf, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        intRef4 = intRef13;
                        objectRef6 = objectRef13;
                        intRef5 = intRef11;
                        bitmap = bitmapDrawableToBitmap;
                        objectRef7 = objectRef12;
                        objectRef8 = objectRef18;
                        intRef6 = intRef10;
                        intRef7 = intRef12;
                        booleanRef = booleanRef2;
                        intRef8 = intRef14;
                        objectRef9 = objectRef17;
                        objectRef10 = objectRef20;
                        objectRef11 = objectRef16;
                    } else if (iOptInt == 2) {
                        CasesBannerSelectedCase selectedCaseForBanner = CasesViewModel.this.getSelectedCaseForBanner(this.$casesResponse.getBanner().getCaseRewardsPreviewId(), this.$casesResponse, this.$awards, this.$inventoryList);
                        Application application = CasesViewModel.this.application;
                        ImageTypePathInCDNEnum imageTypePathInCDNEnum = ImageTypePathInCDNEnum.IMAGE;
                        CasesBannerAttachment casesBannerAttachment = new CasesBannerAttachment(BitmapUtilsKt.getBitmapFromZip$default(CasesViewModel.this.application, PngConstantsId73.BG_CASES_BANNER, ImageTypePathInCDNEnum.BACKGROUND, 0.0f, 0.0f, 24, null), BitmapUtilsKt.getPngBitmapFromZip(CasesViewModel.this.application, selectedCaseForBanner.getCaseImage(), imageTypePathInCDNEnum), BitmapUtilsKt.getBitmapFromZip$default(application, PngConstantsId73.IMG_BANNER_RIGHT_IMAGE, imageTypePathInCDNEnum, 0.0f, 0.0f, 24, null), CasesViewModel.this.stringResources.getString(R.string.cases_current_event_case), CasesViewModel.this.stringResources.getString(R.string.cases_congratulation), CasesViewModel.this.stringResources.getString(R.string.cases_current_prizes_of_event), StringExtensionKt.htmlTextToAnnotatedString(this.$casesResponse.getBanner().getBackGroundTitle()), StringExtensionKt.htmlTextToAnnotatedString(this.$casesResponse.getBanner().getBackGroundDescription()), StringExtensionKt.htmlTextToAnnotatedString(CasesViewModel.this.stringResources.getString(R.string.cases_instruction_two)), CasesViewModel.this.stringResources.getString(R.string.common_open), selectedCaseForBanner);
                        MutableStateFlow<CasesUiState> mutableStateFlow = CasesViewModel.this.get_uiState();
                        do {
                            value = mutableStateFlow.getValue();
                            casesUiState = value;
                        } while (!mutableStateFlow.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 5, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : casesBannerAttachment, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : bitmapDrawableToBitmap, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false)));
                    }
                } else {
                    CasesViewModel casesViewModel = CasesViewModel.this;
                    casesViewModel.showErrorNotification(casesViewModel.stringResources.getString(R.string.common_error_with_key, Boxing.boxInt(73)));
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.ObjectRef objectRef22 = (Ref.ObjectRef) this.L$20;
            Ref.ObjectRef objectRef23 = (Ref.ObjectRef) this.L$19;
            Ref.ObjectRef objectRef24 = (Ref.ObjectRef) this.L$18;
            Ref.ObjectRef objectRef25 = (Ref.ObjectRef) this.L$17;
            Ref.IntRef intRef17 = (Ref.IntRef) this.L$16;
            Ref.ObjectRef objectRef26 = (Ref.ObjectRef) this.L$15;
            Ref.ObjectRef objectRef27 = (Ref.ObjectRef) this.L$14;
            Ref.IntRef intRef18 = (Ref.IntRef) this.L$13;
            Ref.IntRef intRef19 = (Ref.IntRef) this.L$12;
            Ref.BooleanRef booleanRef3 = (Ref.BooleanRef) this.L$11;
            Ref.IntRef intRef20 = (Ref.IntRef) this.L$10;
            Ref.IntRef intRef21 = (Ref.IntRef) this.L$9;
            Ref.ObjectRef objectRef28 = (Ref.ObjectRef) this.L$8;
            Ref.IntRef intRef22 = (Ref.IntRef) this.L$7;
            Ref.IntRef intRef23 = (Ref.IntRef) this.L$6;
            Ref.IntRef intRef24 = (Ref.IntRef) this.L$5;
            Ref.ObjectRef objectRef29 = (Ref.ObjectRef) this.L$4;
            Ref.ObjectRef objectRef30 = (Ref.ObjectRef) this.L$3;
            Ref.ObjectRef objectRef31 = (Ref.ObjectRef) this.L$2;
            Ref.ObjectRef objectRef32 = (Ref.ObjectRef) this.L$1;
            Bitmap bitmap2 = (Bitmap) this.L$0;
            ResultKt.throwOnFailure(obj);
            bitmap = bitmap2;
            objectRef10 = objectRef23;
            objectRef5 = objectRef24;
            objectRef8 = objectRef25;
            intRef2 = intRef17;
            intRef4 = intRef19;
            intRef7 = intRef20;
            intRef5 = intRef21;
            intRef6 = intRef22;
            objectRef4 = objectRef22;
            intRef = intRef24;
            objectRef2 = objectRef30;
            objectRef7 = objectRef31;
            intRef3 = intRef23;
            intRef8 = intRef18;
            booleanRef = booleanRef3;
            objectRef6 = objectRef28;
            objectRef3 = objectRef29;
            objectRef = objectRef32;
            objectRef11 = objectRef27;
            objectRef9 = objectRef26;
            Ref.IntRef intRef25 = intRef8;
            int i2 = CasesViewModel.this.get_uiState().getValue().getCurrentScreen() == 4 ? 4 : 1;
            MutableStateFlow<CasesUiState> mutableStateFlow2 = CasesViewModel.this.get_uiState();
            int i3 = this.$widthOfImage;
            int i4 = this.$heightOfImage;
            CasesResponse casesResponse = this.$casesResponse;
            while (true) {
                CasesUiState value2 = mutableStateFlow2.getValue();
                CasesUiState casesUiState2 = value2;
                int i5 = intRef3.element;
                Ref.IntRef intRef26 = intRef3;
                int i6 = intRef6.element;
                Ref.IntRef intRef27 = intRef6;
                CasesText casesText = (CasesText) objectRef.element;
                Bitmap bitmap3 = (Bitmap) objectRef3.element;
                Map map = (Map) objectRef2.element;
                AnnotatedString annotatedString = (AnnotatedString) objectRef6.element;
                int i7 = intRef5.element;
                Ref.ObjectRef objectRef33 = objectRef6;
                int i8 = intRef7.element;
                Ref.IntRef intRef28 = intRef7;
                int i9 = intRef.element;
                Ref.IntRef intRef29 = intRef5;
                boolean z = booleanRef.element;
                Ref.ObjectRef objectRef34 = objectRef;
                int i10 = intRef4.element;
                Ref.IntRef intRef30 = intRef4;
                List list = (List) objectRef11.element;
                T t = objectRef9.element;
                Case r32 = (Case) t;
                Ref.ObjectRef objectRef35 = objectRef11;
                Ref.IntRef intRef31 = intRef25;
                Ref.BooleanRef booleanRef4 = booleanRef;
                int i11 = intRef31.element;
                Ref.IntRef intRef32 = intRef2;
                Ref.ObjectRef objectRef36 = objectRef2;
                int i12 = intRef32.element;
                CaseReward scrolledReward = ((Case) t).getScrolledReward();
                Ref.ObjectRef objectRef37 = objectRef8;
                List list2 = (List) objectRef37.element;
                Ref.ObjectRef objectRef38 = objectRef4;
                List list3 = (List) objectRef38.element;
                List<CaseReward> caseRewardList = ((Case) objectRef9.element).getCaseRewardList();
                int scrolledPosition = ((Case) objectRef9.element).getScrolledPosition();
                Ref.ObjectRef objectRef39 = objectRef5;
                Ref.ObjectRef objectRef40 = objectRef9;
                CasePricesModel casePricesModel = (CasePricesModel) objectRef39.element;
                Ref.ObjectRef objectRef41 = objectRef10;
                Ref.ObjectRef objectRef42 = objectRef7;
                if (mutableStateFlow2.compareAndSet(value2, casesUiState2.copy(((-1) & 1) != 0 ? casesUiState2.currentScreen : i2, ((-1) & 2) != 0 ? casesUiState2.casesStrings : casesText, ((-1) & 4) != 0 ? casesUiState2.legendaryCaseId : i5, ((-1) & 8) != 0 ? casesUiState2.dailyCaseId : i6, ((-1) & 16) != 0 ? casesUiState2.bcAmount : annotatedString, ((-1) & 32) != 0 ? casesUiState2.valueOfBc : i7, ((-1) & 64) != 0 ? casesUiState2.widthOfImage : i3, ((-1) & 128) != 0 ? casesUiState2.heightOfImage : i4, ((-1) & 256) != 0 ? casesUiState2.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState2.selectedReward : scrolledReward, ((-1) & 1024) != 0 ? casesUiState2.selectedRewardPos : scrolledPosition, ((-1) & 2048) != 0 ? casesUiState2.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState2.selectedCaseId : i11, ((-1) & 8192) != 0 ? casesUiState2.goToCasePos : i12, ((-1) & 16384) != 0 ? casesUiState2.selectedCase : r32, ((-1) & 32768) != 0 ? casesUiState2.currentReward : null, ((-1) & 65536) != 0 ? casesUiState2.casesList : list, ((-1) & 131072) != 0 ? casesUiState2.selectedBonuses : list2, ((-1) & 262144) != 0 ? casesUiState2.progressBarBonusPercentList : list3, ((-1) & 524288) != 0 ? casesUiState2.selectedRewards : caseRewardList, ((-1) & 1048576) != 0 ? casesUiState2.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState2.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState2.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState2.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState2.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState2.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState2.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState2.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState2.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState2.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState2.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState2.openingsCount : i10, (2055208943 & 1) != 0 ? casesUiState2.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState2.casePrices : casePricesModel, (2055208943 & 4) != 0 ? casesUiState2.casePricesForGuide : (CasePricesModel) objectRef41.element, (2055208943 & 8) != 0 ? casesUiState2.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState2.valueOfCurrentDust : i8, (2055208943 & 32) != 0 ? casesUiState2.valueOfMaxDust : i9, (2055208943 & 64) != 0 ? casesUiState2.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState2.isMainHintDialogOpened : z, (2055208943 & 256) != 0 ? casesUiState2.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState2.casesBonusHintAttachment : (CasesBonusHintAttachment) objectRef42.element, (2055208943 & 1024) != 0 ? casesUiState2.casesResponse : casesResponse, (2055208943 & 2048) != 0 ? casesUiState2.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState2.bgImage : bitmap3, (2055208943 & 8192) != 0 ? casesUiState2.bitmapMap : map, (2055208943 & 16384) != 0 ? casesUiState2.prizesBgPattern : bitmap, (2055208943 & 32768) != 0 ? casesUiState2.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState2.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState2.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState2.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState2.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState2.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState2.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState2.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState2.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState2.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState2.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState2.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState2.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState2.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState2.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState2.isShowingShimmer : false))) {
                    break;
                }
                objectRef9 = objectRef40;
                objectRef2 = objectRef36;
                booleanRef = booleanRef4;
                intRef3 = intRef26;
                intRef6 = intRef27;
                objectRef6 = objectRef33;
                intRef7 = intRef28;
                intRef5 = intRef29;
                objectRef = objectRef34;
                intRef25 = intRef31;
                objectRef5 = objectRef39;
                intRef2 = intRef32;
                objectRef10 = objectRef41;
                objectRef8 = objectRef37;
                objectRef7 = objectRef42;
                objectRef4 = objectRef38;
                intRef4 = intRef30;
                objectRef11 = objectRef35;
            }
            return Unit.INSTANCE;
        }
    }

    public final void initInterface(@NotNull JSONObject json, @NotNull CasesResponse casesResponse, @NotNull List<BpRewardsAwardsDto> awards, @NotNull List<InvItems> inventoryList, int widthOfImage, int heightOfImage) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(casesResponse, "casesResponse");
        Intrinsics.checkNotNullParameter(awards, "awards");
        Intrinsics.checkNotNullParameter(inventoryList, "inventoryList");
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37951(casesResponse, awards, json, inventoryList, widthOfImage, heightOfImage, null), 1, null);
    }

    /* compiled from: CasesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$onPacketIncoming$1", m7120f = "CasesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onPacketIncoming$1\n+ 2 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 3 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1945:1\n51#2,5:1946\n56#2,11:1960\n51#2,5:1986\n56#2,11:2000\n51#2,5:2011\n56#2,11:2025\n8#3,9:1951\n8#3,9:1991\n8#3,9:2016\n230#4,5:1971\n230#4,5:1976\n230#4,5:1981\n230#4,5:2036\n230#4,5:2041\n230#4,5:2050\n1549#5:2046\n1620#5,3:2047\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onPacketIncoming$1\n*L\n468#1:1946,5\n468#1:1960,11\n576#1:1986,5\n576#1:2000,11\n579#1:2011,5\n579#1:2025,11\n468#1:1951,9\n576#1:1991,9\n579#1:2016,9\n492#1:1971,5\n527#1:1976,5\n555#1:1981,5\n608#1:2036,5\n640#1:2041,5\n662#1:2050,5\n654#1:2046\n654#1:2047,3\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.cases.CasesViewModel$onPacketIncoming$1 */
    /* loaded from: classes.dex */
    public static final class C38071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ CasesViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38071(JSONObject jSONObject, CasesViewModel casesViewModel, Continuation<? super C38071> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = casesViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C38071(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:135:0x064e  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x06b7  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x027c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:169:0x076c A[EDGE_INSN: B:169:0x076c->B:145:0x076c BREAK  A[LOOP:3: B:88:0x0378->B:91:0x0411], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0272  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x02d7  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x02da  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x036a  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0411 A[LOOP:3: B:88:0x0378->B:91:0x0411, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            List listEmptyList;
            Object objFromJson;
            int iOptInt;
            Case selectedCase;
            CasePricesModel casePricesModelInitCasePricesModel;
            List listUpdateBonusStatus;
            List progressBarValues;
            MutableStateFlow<CasesUiState> mutableStateFlow;
            CasesUiState value;
            CasesUiState casesUiState;
            CasesUiState value2;
            CasesUiState casesUiState2;
            List<Integer> listEmptyList2;
            CasesUiState value3;
            CasesUiState casesUiState3;
            List arrayList;
            Object objFromJson2;
            JSONArray jSONArrayOptJSONArray;
            List listEmptyList3;
            Object objFromJson3;
            List listUpdateBonusStatus2;
            List listUpdateCasesValue;
            List progressBarValues2;
            Case caseFindSelectedCase;
            CasePricesModel casePricesModelInitCasePricesModel2;
            MutableStateFlow<CasesUiState> mutableStateFlow2;
            CasesUiState value4;
            CasesUiState casesUiState4;
            int i;
            CasesUiState value5;
            CasesUiState casesUiState5;
            CasesUiState value6;
            CasesUiState casesUiState6;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            JSONObject jSONObject = this.$json;
            if (jSONObject != null) {
                CasesViewModel casesViewModel = this.this$0;
                int iOptInt2 = jSONObject.optInt("t");
                int iOptInt3 = jSONObject.optInt("s");
                if (iOptInt2 == 1) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(CasesKeys.ARRAY_BONUS_REWARDS_KEY);
                    if (jSONArrayOptJSONArray2 == null) {
                        listEmptyList = null;
                        if (listEmptyList == null) {
                        }
                        List list = listEmptyList;
                        iOptInt = jSONObject.optInt("bcc");
                        selectedCase = casesViewModel.get_uiState().getValue().getSelectedCase();
                        if (selectedCase.isUsedSale()) {
                            casePricesModelInitCasePricesModel = casesViewModel.initCasePricesModel(IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(selectedCase.getPrice(), 0)), IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(selectedCase.getDiscount(), 0)), IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(selectedCase.getPrice(), 1)), IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(selectedCase.getDiscount(), 1)), selectedCase.getCount(), !selectedCase.isUsedSale() && IntExtensionKt.isZero(Boxing.boxInt(selectedCase.getDiscountType())), selectedCase.isSale());
                            List<CaseBonus> caseBonusList = selectedCase.getCaseBonusList();
                            listUpdateBonusStatus = casesViewModel.updateBonusStatus(caseBonusList, list);
                            progressBarValues = casesViewModel.getProgressBarValues(caseBonusList, iOptInt);
                            mutableStateFlow = casesViewModel.get_uiState();
                            do {
                                value = mutableStateFlow.getValue();
                                casesUiState = value;
                            } while (!mutableStateFlow.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : selectedCase.getScrolledReward(), ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : selectedCase.getScrolledPosition(), ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : selectedCase, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : listUpdateBonusStatus, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : progressBarValues, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : selectedCase.getCaseRewardList(), ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : iOptInt, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : casePricesModelInitCasePricesModel, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false)));
                        }
                    } else {
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = jSONArrayOptJSONArray2.length();
                            for (int i2 = 0; i2 < length; i2++) {
                                JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i2);
                                Intrinsics.checkNotNull(jSONObject2);
                                try {
                                    Gson gson = new Gson();
                                    String string = jSONObject2.toString();
                                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                    objFromJson = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) string).toString(), (Class<Object>) BonusRewardWithStatus.class);
                                } catch (Exception e) {
                                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                                    firebaseCrashlytics.log(e.toString());
                                    firebaseCrashlytics.recordException(e);
                                    objFromJson = null;
                                }
                                if (objFromJson != null) {
                                    Boxing.boxBoolean(arrayList2.add(objFromJson));
                                }
                            }
                            listEmptyList = arrayList2;
                        } catch (Exception e2) {
                            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                            firebaseCrashlytics2.log(e2.toString());
                            firebaseCrashlytics2.recordException(e2);
                        }
                        if (listEmptyList == null) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        }
                        List list2 = listEmptyList;
                        iOptInt = jSONObject.optInt("bcc");
                        selectedCase = casesViewModel.get_uiState().getValue().getSelectedCase();
                        casePricesModelInitCasePricesModel = casesViewModel.initCasePricesModel(IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(selectedCase.getPrice(), 0)), IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(selectedCase.getDiscount(), 0)), IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(selectedCase.getPrice(), 1)), IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(selectedCase.getDiscount(), 1)), selectedCase.getCount(), !selectedCase.isUsedSale() && IntExtensionKt.isZero(Boxing.boxInt(selectedCase.getDiscountType())), selectedCase.isSale());
                        List<CaseBonus> caseBonusList2 = selectedCase.getCaseBonusList();
                        listUpdateBonusStatus = casesViewModel.updateBonusStatus(caseBonusList2, list2);
                        progressBarValues = casesViewModel.getProgressBarValues(caseBonusList2, iOptInt);
                        mutableStateFlow = casesViewModel.get_uiState();
                        do {
                            value = mutableStateFlow.getValue();
                            casesUiState = value;
                        } while (!mutableStateFlow.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : selectedCase.getScrolledReward(), ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : selectedCase.getScrolledPosition(), ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : selectedCase, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : listUpdateBonusStatus, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : progressBarValues, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : selectedCase.getCaseRewardList(), ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : iOptInt, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : casePricesModelInitCasePricesModel, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false)));
                    }
                } else if (iOptInt2 != 2) {
                    if (iOptInt2 != 3) {
                        if (iOptInt2 == 5) {
                            boolean z = jSONObject.optInt("s") != 1;
                            int valueOfCurrentDust = casesViewModel.get_uiState().getValue().getValueOfCurrentDust();
                            int valueOfMaxDust = casesViewModel.get_uiState().getValue().getValueOfMaxDust();
                            if (valueOfCurrentDust >= valueOfMaxDust) {
                                valueOfCurrentDust -= valueOfMaxDust;
                            }
                            int i3 = valueOfCurrentDust;
                            MutableStateFlow<CasesUiState> mutableStateFlow3 = casesViewModel.get_uiState();
                            do {
                                value5 = mutableStateFlow3.getValue();
                                casesUiState5 = value5;
                            } while (!mutableStateFlow3.compareAndSet(value5, casesUiState5.copy(((-1) & 1) != 0 ? casesUiState5.currentScreen : 4, ((-1) & 2) != 0 ? casesUiState5.casesStrings : null, ((-1) & 4) != 0 ? casesUiState5.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState5.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState5.bcAmount : null, ((-1) & 32) != 0 ? casesUiState5.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState5.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState5.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState5.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState5.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState5.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState5.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState5.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState5.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState5.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState5.currentReward : null, ((-1) & 65536) != 0 ? casesUiState5.casesList : null, ((-1) & 131072) != 0 ? casesUiState5.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState5.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState5.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState5.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState5.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState5.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState5.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState5.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState5.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState5.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState5.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState5.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState5.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState5.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState5.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState5.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState5.casePrices : null, (2055208943 & 4) != 0 ? casesUiState5.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState5.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState5.valueOfCurrentDust : i3, (2055208943 & 32) != 0 ? casesUiState5.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState5.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState5.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState5.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState5.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState5.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState5.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState5.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState5.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState5.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState5.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState5.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState5.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState5.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState5.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState5.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState5.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState5.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState5.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState5.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState5.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState5.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState5.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState5.isNeedAddCountSuperCase : z, (2055208943 & 536870912) != 0 ? casesUiState5.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState5.isShowingShimmer : false)));
                        } else if (iOptInt2 == 7 && iOptInt3 == 1) {
                            int selectedBonusRewardId = casesViewModel.get_uiState().getValue().getSelectedBonusRewardId();
                            List<CaseBonus> selectedBonuses = casesViewModel.get_uiState().getValue().getSelectedBonuses();
                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(selectedBonuses, 10));
                            for (CaseBonus caseBonusCopy : selectedBonuses) {
                                if (caseBonusCopy.getId() == selectedBonusRewardId) {
                                    caseBonusCopy = caseBonusCopy.copy((4079 & 1) != 0 ? caseBonusCopy.id : 0, (4079 & 2) != 0 ? caseBonusCopy.typeCasesBonusDto : 0, (4079 & 4) != 0 ? caseBonusCopy.name : null, (4079 & 8) != 0 ? caseBonusCopy.imageBitmap : null, (4079 & 16) != 0 ? caseBonusCopy.state : 3, (4079 & 32) != 0 ? caseBonusCopy.openingsCountRequired : 0, (4079 & 64) != 0 ? caseBonusCopy.rarity : null, (4079 & 128) != 0 ? caseBonusCopy.count : 0, (4079 & 256) != 0 ? caseBonusCopy.isRender : false, (4079 & 512) != 0 ? caseBonusCopy.renderAttachment : null, (4079 & 1024) != 0 ? caseBonusCopy.imageName : null, (4079 & 2048) != 0 ? caseBonusCopy.internalId : 0);
                                }
                                arrayList3.add(caseBonusCopy);
                            }
                            MutableStateFlow<CasesUiState> mutableStateFlow4 = casesViewModel.get_uiState();
                            do {
                                value6 = mutableStateFlow4.getValue();
                                casesUiState6 = value6;
                            } while (!mutableStateFlow4.compareAndSet(value6, casesUiState6.copy(((-1) & 1) != 0 ? casesUiState6.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState6.casesStrings : null, ((-1) & 4) != 0 ? casesUiState6.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState6.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState6.bcAmount : null, ((-1) & 32) != 0 ? casesUiState6.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState6.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState6.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState6.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState6.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState6.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState6.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState6.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState6.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState6.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState6.currentReward : null, ((-1) & 65536) != 0 ? casesUiState6.casesList : null, ((-1) & 131072) != 0 ? casesUiState6.selectedBonuses : arrayList3, ((-1) & 262144) != 0 ? casesUiState6.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState6.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState6.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState6.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState6.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState6.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState6.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState6.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState6.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState6.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState6.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState6.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState6.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState6.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState6.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState6.casePrices : null, (2055208943 & 4) != 0 ? casesUiState6.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState6.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState6.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState6.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState6.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState6.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState6.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState6.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState6.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState6.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState6.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState6.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState6.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState6.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState6.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState6.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState6.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState6.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState6.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState6.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState6.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState6.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState6.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState6.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState6.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState6.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState6.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState6.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState6.isShowingShimmer : false)));
                        }
                    } else if (iOptInt3 == 1) {
                        int iOptInt4 = jSONObject.optInt("pc");
                        int iOptInt5 = jSONObject.optInt("bcc");
                        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("cc");
                        if (jSONArrayOptJSONArray3 == null) {
                            arrayList = null;
                            if (arrayList == null) {
                            }
                            jSONArrayOptJSONArray = jSONObject.optJSONArray(CasesKeys.ARRAY_BONUS_REWARDS_KEY);
                            if (jSONArrayOptJSONArray != null) {
                            }
                        } else {
                            try {
                                arrayList = new ArrayList();
                                int length2 = jSONArrayOptJSONArray3.length();
                                for (int i4 = 0; i4 < length2; i4++) {
                                    JSONObject jSONObject3 = jSONArrayOptJSONArray3.getJSONObject(i4);
                                    Intrinsics.checkNotNull(jSONObject3);
                                    try {
                                        Gson gson2 = new Gson();
                                        String string2 = jSONObject3.toString();
                                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                        objFromJson2 = gson2.fromJson(StringsKt__StringsKt.trim((CharSequence) string2).toString(), (Class<Object>) CaseWithStatusModel.class);
                                    } catch (Exception e3) {
                                        FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                                        firebaseCrashlytics3.log(e3.toString());
                                        firebaseCrashlytics3.recordException(e3);
                                        objFromJson2 = null;
                                    }
                                    if (objFromJson2 != null) {
                                        Boxing.boxBoolean(arrayList.add(objFromJson2));
                                    }
                                }
                            } catch (Exception e4) {
                                FirebaseCrashlytics firebaseCrashlytics4 = FirebaseCrashlytics.getInstance();
                                firebaseCrashlytics4.log(e4.toString());
                                firebaseCrashlytics4.recordException(e4);
                            }
                            if (arrayList == null) {
                                arrayList = CollectionsKt__CollectionsKt.emptyList();
                            }
                            jSONArrayOptJSONArray = jSONObject.optJSONArray(CasesKeys.ARRAY_BONUS_REWARDS_KEY);
                            if (jSONArrayOptJSONArray != null) {
                                listEmptyList3 = null;
                                if (listEmptyList3 == null) {
                                }
                                listUpdateBonusStatus2 = casesViewModel.updateBonusStatus(casesViewModel.get_uiState().getValue().getSelectedBonuses(), listEmptyList3);
                                listUpdateCasesValue = casesViewModel.updateCasesValue(casesViewModel.get_uiState().getValue().getCasesList(), arrayList);
                                progressBarValues2 = casesViewModel.getProgressBarValues(listUpdateBonusStatus2, iOptInt5);
                                caseFindSelectedCase = casesViewModel.findSelectedCase(casesViewModel.get_uiState().getValue().getSelectedCaseId(), listUpdateCasesValue);
                                if (caseFindSelectedCase.isUsedSale()) {
                                    casePricesModelInitCasePricesModel2 = casesViewModel.initCasePricesModel(IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(caseFindSelectedCase.getPrice(), 0)), IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(caseFindSelectedCase.getDiscount(), 0)), IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(caseFindSelectedCase.getPrice(), 1)), IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(caseFindSelectedCase.getDiscount(), 1)), caseFindSelectedCase.getCount(), !caseFindSelectedCase.isUsedSale() && IntExtensionKt.isZero(Boxing.boxInt(caseFindSelectedCase.getDiscountType())), caseFindSelectedCase.isSale());
                                    mutableStateFlow2 = casesViewModel.get_uiState();
                                    while (true) {
                                        value4 = mutableStateFlow2.getValue();
                                        casesUiState4 = value4;
                                        i = iOptInt5;
                                        if (!mutableStateFlow2.compareAndSet(value4, casesUiState4.copy(((-1) & 1) != 0 ? casesUiState4.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState4.casesStrings : null, ((-1) & 4) != 0 ? casesUiState4.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState4.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState4.bcAmount : null, ((-1) & 32) != 0 ? casesUiState4.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState4.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState4.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState4.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState4.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState4.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState4.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState4.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState4.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState4.selectedCase : caseFindSelectedCase, ((-1) & 32768) != 0 ? casesUiState4.currentReward : null, ((-1) & 65536) != 0 ? casesUiState4.casesList : listUpdateCasesValue, ((-1) & 131072) != 0 ? casesUiState4.selectedBonuses : listUpdateBonusStatus2, ((-1) & 262144) != 0 ? casesUiState4.progressBarBonusPercentList : progressBarValues2, ((-1) & 524288) != 0 ? casesUiState4.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState4.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState4.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState4.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState4.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState4.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState4.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState4.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState4.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState4.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState4.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState4.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState4.openingsCount : i, (2055208943 & 1) != 0 ? casesUiState4.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState4.casePrices : casePricesModelInitCasePricesModel2, (2055208943 & 4) != 0 ? casesUiState4.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState4.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState4.valueOfCurrentDust : iOptInt4, (2055208943 & 32) != 0 ? casesUiState4.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState4.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState4.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState4.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState4.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState4.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState4.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState4.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState4.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState4.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState4.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState4.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState4.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState4.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState4.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState4.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState4.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState4.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState4.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState4.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState4.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState4.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState4.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState4.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState4.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState4.isShowingShimmer : false))) {
                                        }
                                        iOptInt5 = i;
                                    }
                                }
                            } else {
                                try {
                                    ArrayList arrayList4 = new ArrayList();
                                    int length3 = jSONArrayOptJSONArray.length();
                                    for (int i5 = 0; i5 < length3; i5++) {
                                        JSONObject jSONObject4 = jSONArrayOptJSONArray.getJSONObject(i5);
                                        Intrinsics.checkNotNull(jSONObject4);
                                        try {
                                            Gson gson3 = new Gson();
                                            String string3 = jSONObject4.toString();
                                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                            objFromJson3 = gson3.fromJson(StringsKt__StringsKt.trim((CharSequence) string3).toString(), (Class<Object>) BonusRewardWithStatus.class);
                                        } catch (Exception e5) {
                                            FirebaseCrashlytics firebaseCrashlytics5 = FirebaseCrashlytics.getInstance();
                                            firebaseCrashlytics5.log(e5.toString());
                                            firebaseCrashlytics5.recordException(e5);
                                            objFromJson3 = null;
                                        }
                                        if (objFromJson3 != null) {
                                            Boxing.boxBoolean(arrayList4.add(objFromJson3));
                                        }
                                    }
                                    listEmptyList3 = arrayList4;
                                } catch (Exception e6) {
                                    FirebaseCrashlytics firebaseCrashlytics6 = FirebaseCrashlytics.getInstance();
                                    firebaseCrashlytics6.log(e6.toString());
                                    firebaseCrashlytics6.recordException(e6);
                                }
                                if (listEmptyList3 == null) {
                                    listEmptyList3 = CollectionsKt__CollectionsKt.emptyList();
                                }
                                listUpdateBonusStatus2 = casesViewModel.updateBonusStatus(casesViewModel.get_uiState().getValue().getSelectedBonuses(), listEmptyList3);
                                listUpdateCasesValue = casesViewModel.updateCasesValue(casesViewModel.get_uiState().getValue().getCasesList(), arrayList);
                                progressBarValues2 = casesViewModel.getProgressBarValues(listUpdateBonusStatus2, iOptInt5);
                                caseFindSelectedCase = casesViewModel.findSelectedCase(casesViewModel.get_uiState().getValue().getSelectedCaseId(), listUpdateCasesValue);
                                casePricesModelInitCasePricesModel2 = casesViewModel.initCasePricesModel(IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(caseFindSelectedCase.getPrice(), 0)), IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(caseFindSelectedCase.getDiscount(), 0)), IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(caseFindSelectedCase.getPrice(), 1)), IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(caseFindSelectedCase.getDiscount(), 1)), caseFindSelectedCase.getCount(), !caseFindSelectedCase.isUsedSale() && IntExtensionKt.isZero(Boxing.boxInt(caseFindSelectedCase.getDiscountType())), caseFindSelectedCase.isSale());
                                mutableStateFlow2 = casesViewModel.get_uiState();
                                while (true) {
                                    value4 = mutableStateFlow2.getValue();
                                    casesUiState4 = value4;
                                    i = iOptInt5;
                                    if (!mutableStateFlow2.compareAndSet(value4, casesUiState4.copy(((-1) & 1) != 0 ? casesUiState4.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState4.casesStrings : null, ((-1) & 4) != 0 ? casesUiState4.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState4.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState4.bcAmount : null, ((-1) & 32) != 0 ? casesUiState4.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState4.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState4.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState4.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState4.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState4.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState4.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState4.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState4.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState4.selectedCase : caseFindSelectedCase, ((-1) & 32768) != 0 ? casesUiState4.currentReward : null, ((-1) & 65536) != 0 ? casesUiState4.casesList : listUpdateCasesValue, ((-1) & 131072) != 0 ? casesUiState4.selectedBonuses : listUpdateBonusStatus2, ((-1) & 262144) != 0 ? casesUiState4.progressBarBonusPercentList : progressBarValues2, ((-1) & 524288) != 0 ? casesUiState4.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState4.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState4.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState4.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState4.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState4.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState4.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState4.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState4.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState4.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState4.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState4.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState4.openingsCount : i, (2055208943 & 1) != 0 ? casesUiState4.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState4.casePrices : casePricesModelInitCasePricesModel2, (2055208943 & 4) != 0 ? casesUiState4.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState4.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState4.valueOfCurrentDust : iOptInt4, (2055208943 & 32) != 0 ? casesUiState4.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState4.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState4.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState4.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState4.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState4.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState4.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState4.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState4.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState4.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState4.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState4.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState4.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState4.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState4.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState4.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState4.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState4.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState4.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState4.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState4.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState4.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState4.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState4.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState4.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState4.isShowingShimmer : false))) {
                                        break;
                                    }
                                    iOptInt5 = i;
                                }
                            }
                        }
                    }
                } else if (iOptInt3 != -1) {
                    if (iOptInt3 == 1) {
                        int iOptInt6 = jSONObject.optInt("bc");
                        AnnotatedString bCAmountString = casesViewModel.getBCAmountString(iOptInt6);
                        List<CaseReward> selectedRewards = casesViewModel.get_uiState().getValue().getSelectedRewards();
                        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("pr");
                        if (jSONArrayOptJSONArray4 != null) {
                            Intrinsics.checkNotNull(jSONArrayOptJSONArray4);
                            listEmptyList2 = JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray4);
                        } else {
                            listEmptyList2 = null;
                        }
                        if (listEmptyList2 == null) {
                            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                        }
                        List openingRewards = casesViewModel.getOpeningRewards(selectedRewards, listEmptyList2);
                        boolean zFindSprayRewards = casesViewModel.findSprayRewards(selectedRewards);
                        int i6 = openingRewards.size() != 1 ? 2 : 3;
                        CaseReward caseReward = (CaseReward) openingRewards.get(0);
                        MutableStateFlow<CasesUiState> mutableStateFlow5 = casesViewModel.get_uiState();
                        do {
                            value3 = mutableStateFlow5.getValue();
                            casesUiState3 = value3;
                        } while (!mutableStateFlow5.compareAndSet(value3, casesUiState3.copy(((-1) & 1) != 0 ? casesUiState3.currentScreen : i6, ((-1) & 2) != 0 ? casesUiState3.casesStrings : null, ((-1) & 4) != 0 ? casesUiState3.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState3.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState3.bcAmount : bCAmountString, ((-1) & 32) != 0 ? casesUiState3.valueOfBc : iOptInt6, ((-1) & 64) != 0 ? casesUiState3.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState3.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState3.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState3.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState3.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState3.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState3.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState3.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState3.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState3.currentReward : caseReward, ((-1) & 65536) != 0 ? casesUiState3.casesList : null, ((-1) & 131072) != 0 ? casesUiState3.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState3.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState3.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState3.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState3.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState3.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState3.gettingTenRewardsList : openingRewards, ((-1) & 16777216) != 0 ? casesUiState3.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState3.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState3.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState3.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState3.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState3.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState3.isNeedShowButtonSpray : zFindSprayRewards, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState3.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState3.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState3.casePrices : null, (2055208943 & 4) != 0 ? casesUiState3.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState3.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState3.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState3.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState3.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState3.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState3.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState3.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState3.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState3.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState3.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState3.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState3.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState3.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState3.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState3.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState3.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState3.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState3.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState3.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState3.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState3.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState3.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState3.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState3.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState3.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState3.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState3.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState3.isShowingShimmer : false)));
                    }
                } else if (jSONObject.optInt("d") == 1) {
                    CasesText casesTextCopy$default = CasesText.copy$default(casesViewModel.get_uiState().getValue().getCasesStrings(), null, null, null, null, StringExtensionKt.htmlTextToAnnotatedString(casesViewModel.stringResources.getString(R.string.common_not_enough_bc)), new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null), null, 79, null);
                    MutableStateFlow<CasesUiState> mutableStateFlow6 = casesViewModel.get_uiState();
                    do {
                        value2 = mutableStateFlow6.getValue();
                        casesUiState2 = value2;
                    } while (!mutableStateFlow6.compareAndSet(value2, casesUiState2.copy(((-1) & 1) != 0 ? casesUiState2.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState2.casesStrings : casesTextCopy$default, ((-1) & 4) != 0 ? casesUiState2.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState2.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState2.bcAmount : null, ((-1) & 32) != 0 ? casesUiState2.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState2.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState2.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState2.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState2.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState2.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState2.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState2.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState2.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState2.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState2.currentReward : null, ((-1) & 65536) != 0 ? casesUiState2.casesList : null, ((-1) & 131072) != 0 ? casesUiState2.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState2.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState2.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState2.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState2.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState2.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState2.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState2.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState2.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState2.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState2.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState2.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState2.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState2.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState2.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState2.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState2.casePrices : null, (2055208943 & 4) != 0 ? casesUiState2.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState2.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState2.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState2.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState2.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState2.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState2.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState2.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState2.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState2.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState2.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState2.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState2.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState2.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState2.isShowDialogConfirmation : true, (2055208943 & 131072) != 0 ? casesUiState2.buttonApplyText : casesViewModel.stringResources.getString(R.string.common_apply), (2055208943 & 262144) != 0 ? casesUiState2.dialogConfirmationContextType : 3, (2055208943 & 524288) != 0 ? casesUiState2.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState2.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState2.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState2.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState2.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState2.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState2.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState2.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState2.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState2.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState2.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState2.isShowingShimmer : false)));
                }
                Unit unit = Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    public final void onPacketIncoming(@Nullable JSONObject json) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38071(json, this, null), 1, null);
    }

    public final void onCloseClick() {
        CasesUiState value;
        CasesUiState casesUiState;
        if (get_uiState().getValue().isHintsOpened()) {
            MutableStateFlow<CasesUiState> mutableStateFlow = get_uiState();
            do {
                value = mutableStateFlow.getValue();
                casesUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false)));
            return;
        }
        ViewModelExtensionKt.launchOnIO$default(this, null, new C38062(null), 1, null);
    }

    /* compiled from: CasesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$onCloseClick$2", m7120f = "CasesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.cases.CasesViewModel$onCloseClick$2 */
    /* loaded from: classes.dex */
    public static final class C38062 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38062(Continuation<? super C38062> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CasesViewModel.this.new C38062(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38062) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CasesViewModel.this.actionWithJSON.backToDonate();
                CasesViewModel.this.closeInterface();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void closeHint() {
        CasesUiState value;
        CasesUiState casesUiState;
        MutableStateFlow<CasesUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            casesUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false)));
    }

    /* compiled from: CasesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$onBonusClick$1", m7120f = "CasesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onBonusClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1945:1\n230#2,5:1946\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onBonusClick$1\n*L\n705#1:1946,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.cases.CasesViewModel$onBonusClick$1 */
    /* loaded from: classes.dex */
    public static final class C37971 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ CaseBonus $bonus;
        public final /* synthetic */ Bitmap $rewardImage;
        public int label;
        public final /* synthetic */ CasesViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37971(CaseBonus caseBonus, CasesViewModel casesViewModel, Bitmap bitmap, Continuation<? super C37971> continuation) {
            super(2, continuation);
            this.$bonus = caseBonus;
            this.this$0 = casesViewModel;
            this.$rewardImage = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C37971(this.$bonus, this.this$0, this.$rewardImage, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = this.$bonus.getState() == 2;
            MutableStateFlow<CasesUiState> mutableStateFlow = this.this$0.get_uiState();
            CaseBonus caseBonus = this.$bonus;
            Bitmap bitmap = this.$rewardImage;
            while (true) {
                CasesUiState value = mutableStateFlow.getValue();
                CasesUiState casesUiState = value;
                Bitmap bitmap2 = bitmap;
                CaseBonus caseBonus2 = caseBonus;
                MutableStateFlow<CasesUiState> mutableStateFlow2 = mutableStateFlow;
                if (mutableStateFlow2.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : true, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : caseBonus2, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : bitmap2, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : z, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false))) {
                    return Unit.INSTANCE;
                }
                mutableStateFlow = mutableStateFlow2;
                bitmap = bitmap2;
                caseBonus = caseBonus2;
            }
        }
    }

    public final void onBonusClick(@NotNull CaseBonus bonus, @Nullable Bitmap rewardImage) {
        Intrinsics.checkNotNullParameter(bonus, "bonus");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C37971(bonus, this, rewardImage, null), 1, null);
    }

    /* compiled from: CasesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$closeDialogPreview$1", m7120f = "CasesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$closeDialogPreview$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1945:1\n230#2,5:1946\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$closeDialogPreview$1\n*L\n733#1:1946,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.cases.CasesViewModel$closeDialogPreview$1 */
    /* loaded from: classes.dex */
    public static final class C37941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37941(Continuation<? super C37941> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CasesViewModel.this.new C37941(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean zIsGettingBonusReward = CasesViewModel.this.get_uiState().getValue().isGettingBonusReward();
            final int id = CasesViewModel.this.get_uiState().getValue().getSelectedBonusReward().getId();
            final int typeCasesBonusDto = CasesViewModel.this.get_uiState().getValue().getSelectedBonusReward().getTypeCasesBonusDto();
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = CasesViewModel.this.get_uiState().getValue().getValueOfCurrentDust();
            Boolean boolBoxBoolean = Boxing.boxBoolean(zIsGettingBonusReward);
            final CasesViewModel casesViewModel = CasesViewModel.this;
            BooleanExtensionKt.ifTrue(boolBoxBoolean, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.cases.CasesViewModel.closeDialogPreview.1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    if (typeCasesBonusDto == 21) {
                        intRef.element += IntExtensionKt.getOrZero(Integer.valueOf(casesViewModel.get_uiState().getValue().getSelectedBonusReward().getCount()));
                    }
                    CasesViewModel casesViewModel2 = casesViewModel;
                    ViewModelExtensionKt.launchOnIO$default(casesViewModel2, null, new C118781(casesViewModel2, id, null), 1, null);
                }

                /* compiled from: CasesViewModel.kt */
                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$closeDialogPreview$1$1$1", m7120f = "CasesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                /* renamed from: com.blackhub.bronline.game.gui.cases.CasesViewModel$closeDialogPreview$1$1$1, reason: invalid class name and collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C118781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ int $bonusId;
                    public int label;
                    public final /* synthetic */ CasesViewModel this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C118781(CasesViewModel casesViewModel, int i, Continuation<? super C118781> continuation) {
                        super(2, continuation);
                        this.this$0 = casesViewModel;
                        this.$bonusId = i;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new C118781(this.this$0, this.$bonusId, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                        return ((C118781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.this$0.actionWithJSON.getBonus(this.$bonusId);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            });
            MutableStateFlow<CasesUiState> mutableStateFlow = CasesViewModel.this.get_uiState();
            while (true) {
                CasesUiState value = mutableStateFlow.getValue();
                CasesUiState casesUiState = value;
                Ref.IntRef intRef2 = intRef;
                if (mutableStateFlow.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : intRef.element, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : new CaseBonus(0, 0, null, null, 0, 0, null, 0, false, null, null, 0, UnixStat.PERM_MASK, null), (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : id, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false))) {
                    return Unit.INSTANCE;
                }
                intRef = intRef2;
            }
        }
    }

    public final void closeDialogPreview() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C37941(null), 1, null);
    }

    public final void onBonusInfoClick() {
        CasesUiState value;
        CasesUiState casesUiState;
        MutableStateFlow<CasesUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            casesUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : true, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false)));
    }

    public final void onBonusInfoClose() {
        CasesUiState value;
        CasesUiState casesUiState;
        MutableStateFlow<CasesUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            casesUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false)));
    }

    /* compiled from: CasesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$selectCase$1", m7120f = "CasesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$selectCase$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1945:1\n230#2,5:1946\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$selectCase$1\n*L\n764#1:1946,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.cases.CasesViewModel$selectCase$1 */
    /* loaded from: classes.dex */
    public static final class C38121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Case $case;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38121(Case r2, Continuation<? super C38121> continuation) {
            super(2, continuation);
            this.$case = r2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CasesViewModel.this.new C38121(this.$case, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CasesViewModel.this.actionWithJSON.selectCase(this.$case.getId());
                MutableStateFlow<CasesUiState> mutableStateFlow = CasesViewModel.this.get_uiState();
                Case r14 = this.$case;
                while (true) {
                    CasesUiState value = mutableStateFlow.getValue();
                    CasesUiState casesUiState = value;
                    Case r70 = r14;
                    if (mutableStateFlow.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : r14.getId(), ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : r70, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false))) {
                        return Unit.INSTANCE;
                    }
                    r14 = r70;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void selectCase(@NotNull Case r3) {
        Intrinsics.checkNotNullParameter(r3, "case");
        ViewModelExtensionKt.launchOnIO$default(this, null, new C38121(r3, null), 1, null);
    }

    /* compiled from: CasesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$onBcButtonClick$1", m7120f = "CasesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.cases.CasesViewModel$onBcButtonClick$1 */
    /* loaded from: classes.dex */
    public static final class C37961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37961(Continuation<? super C37961> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CasesViewModel.this.new C37961(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CasesViewModel.this.actionWithJSON.bcButtonClick();
                CasesViewModel.this.closeInterface();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onBcButtonClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37961(null), 1, null);
    }

    /* compiled from: CasesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$showErrorNotification$1", m7120f = "CasesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.cases.CasesViewModel$showErrorNotification$1 */
    /* loaded from: classes.dex */
    public static final class C38131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $message;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38131(String str, Continuation<? super C38131> continuation) {
            super(2, continuation);
            this.$message = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CasesViewModel.this.new C38131(this.$message, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CasesViewModel.this.actionWithJSON.isClosedWithError();
                CasesViewModel.this.getLocalNotification().showErrorNotification(this.$message);
                CasesViewModel.this.closeInterface();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void showErrorNotification(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ViewModelExtensionKt.launchOnIO$default(this, null, new C38131(message, null), 1, null);
    }

    /* compiled from: CasesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$openCaseWithDialog$1", m7120f = "CasesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$openCaseWithDialog$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1945:1\n230#2,5:1946\n230#2,5:1951\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$openCaseWithDialog$1\n*L\n838#1:1946,5\n875#1:1951,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.cases.CasesViewModel$openCaseWithDialog$1 */
    /* loaded from: classes.dex */
    public static final class C38101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ float $btnWidth;
        public final /* synthetic */ int $buttonType;
        public int label;
        public final /* synthetic */ CasesViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38101(float f, CasesViewModel casesViewModel, int i, Continuation<? super C38101> continuation) {
            super(2, continuation);
            this.$btnWidth = f;
            this.this$0 = casesViewModel;
            this.$buttonType = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C38101(this.$btnWidth, this.this$0, this.$buttonType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            float count;
            int priceTenCases;
            Integer numBoxInt;
            AnnotatedString annotatedStringHtmlTextToAnnotatedString;
            AnnotatedString annotatedString;
            CasesUiState value;
            CasesUiState casesUiState;
            CasesUiState value2;
            CasesUiState casesUiState2;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = 0;
            boolean z = this.$btnWidth == 0.5f;
            CasePricesModel casePrices = this.this$0.get_uiState().getValue().getCasePrices();
            String name = this.this$0.get_uiState().getValue().getSelectedCase().getName();
            int i2 = this.$buttonType;
            int i3 = i2 == 1 ? 1 : 10;
            if (i2 == 1) {
                int typeOpenOneCaseButton = this.this$0.get_uiState().getValue().getCasePrices().getTypeOpenOneCaseButton();
                if (typeOpenOneCaseButton == 1) {
                    numBoxInt = Boxing.boxInt(this.this$0.get_uiState().getValue().getCasePrices().getPriceOneCase());
                } else if (typeOpenOneCaseButton == 2) {
                    numBoxInt = this.this$0.get_uiState().getValue().getCasePrices().getSalePriceOneCase();
                } else {
                    numBoxInt = Boxing.boxInt(0);
                }
            } else {
                int typeOpenTenCaseButton = this.this$0.get_uiState().getValue().getCasePrices().getTypeOpenTenCaseButton();
                if (typeOpenTenCaseButton == 1) {
                    count = (10 - r5.getCount()) / 10.0f;
                    priceTenCases = casePrices.getPriceTenCases();
                } else {
                    if (typeOpenTenCaseButton == 2) {
                        count = (10 - r5.getCount()) / 10.0f;
                        priceTenCases = IntExtensionKt.getOrOne(casePrices.getSalePriceTenCases());
                    }
                    numBoxInt = Boxing.boxInt(i);
                }
                i = (int) (count * priceTenCases);
                numBoxInt = Boxing.boxInt(i);
            }
            int orZero = IntExtensionKt.getOrZero(numBoxInt);
            if (orZero > this.this$0.get_uiState().getValue().getValueOfBc()) {
                CasesText casesTextCopy$default = CasesText.copy$default(this.this$0.get_uiState().getValue().getCasesStrings(), null, null, null, null, StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.common_not_enough_bc)), new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null), null, 79, null);
                MutableStateFlow<CasesUiState> mutableStateFlow = this.this$0.get_uiState();
                CasesViewModel casesViewModel = this.this$0;
                do {
                    value2 = mutableStateFlow.getValue();
                    casesUiState2 = value2;
                } while (!mutableStateFlow.compareAndSet(value2, casesUiState2.copy(((-1) & 1) != 0 ? casesUiState2.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState2.casesStrings : casesTextCopy$default, ((-1) & 4) != 0 ? casesUiState2.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState2.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState2.bcAmount : null, ((-1) & 32) != 0 ? casesUiState2.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState2.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState2.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState2.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState2.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState2.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState2.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState2.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState2.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState2.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState2.currentReward : null, ((-1) & 65536) != 0 ? casesUiState2.casesList : null, ((-1) & 131072) != 0 ? casesUiState2.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState2.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState2.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState2.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState2.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState2.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState2.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState2.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState2.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState2.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState2.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState2.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState2.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState2.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState2.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState2.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState2.casePrices : null, (2055208943 & 4) != 0 ? casesUiState2.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState2.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState2.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState2.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState2.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState2.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState2.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState2.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState2.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState2.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState2.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState2.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState2.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState2.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState2.isShowDialogConfirmation : true, (2055208943 & 131072) != 0 ? casesUiState2.buttonApplyText : casesViewModel.stringResources.getString(R.string.common_yes), (2055208943 & 262144) != 0 ? casesUiState2.dialogConfirmationContextType : 3, (2055208943 & 524288) != 0 ? casesUiState2.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState2.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState2.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState2.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState2.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState2.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState2.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState2.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState2.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState2.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState2.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState2.isShowingShimmer : false)));
            } else {
                if (z) {
                    annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.casesPurchaseCase(name, i3, orZero));
                } else {
                    annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.casesOpenCase(name, i3));
                }
                AnnotatedString annotatedString2 = annotatedStringHtmlTextToAnnotatedString;
                if (z) {
                    annotatedString = StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.cases_opening_case_info));
                } else {
                    annotatedString = new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null);
                }
                CasesText casesTextCopy$default2 = CasesText.copy$default(this.this$0.get_uiState().getValue().getCasesStrings(), null, null, null, null, annotatedString2, annotatedString, null, 79, null);
                int i4 = z ? 1 : 2;
                MutableStateFlow<CasesUiState> mutableStateFlow2 = this.this$0.get_uiState();
                CasesViewModel casesViewModel2 = this.this$0;
                int i5 = this.$buttonType;
                do {
                    value = mutableStateFlow2.getValue();
                    casesUiState = value;
                } while (!mutableStateFlow2.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState.casesStrings : casesTextCopy$default2, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : i5, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : true, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : casesViewModel2.stringResources.getString(R.string.common_apply), (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : i4, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false)));
            }
            return Unit.INSTANCE;
        }
    }

    public final void openCaseWithDialog(int buttonType, float btnWidth) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38101(btnWidth, this, buttonType, null), 1, null);
    }

    public final void onInfoClick() {
        CasesUiState value;
        CasesUiState casesUiState;
        MutableStateFlow<CasesUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            casesUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : true, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false)));
    }

    /* compiled from: CasesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$onBpRewardsClick$1", m7120f = "CasesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.cases.CasesViewModel$onBpRewardsClick$1 */
    /* loaded from: classes.dex */
    public static final class C37981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37981(Continuation<? super C37981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CasesViewModel.this.new C37981(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CasesViewModel.this.actionWithJSON.openBpRewards();
                CasesViewModel.this.closeInterface();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onBpRewardsClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37981(null), 1, null);
    }

    public final void selectReward(int rewardIndex) {
        CaseReward caseReward = (CaseReward) CollectionsKt___CollectionsKt.getOrNull(get_uiState().getValue().getSelectedRewards(), rewardIndex);
        MutableStateFlow<CasesUiState> mutableStateFlow = get_uiState();
        while (true) {
            CasesUiState value = mutableStateFlow.getValue();
            CasesUiState casesUiState = value;
            MutableStateFlow<CasesUiState> mutableStateFlow2 = mutableStateFlow;
            if (mutableStateFlow2.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : caseReward, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false))) {
                return;
            } else {
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public final void onClickBottomItem(int rewardPos) {
        CasesUiState value;
        CasesUiState casesUiState;
        MutableStateFlow<CasesUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            casesUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : rewardPos, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false)));
    }

    /* compiled from: CasesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$onSelectOpeningReward$1", m7120f = "CasesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onSelectOpeningReward$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1945:1\n1559#2:1946\n1590#2,4:1947\n230#3,5:1951\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onSelectOpeningReward$1\n*L\n929#1:1946\n929#1:1947,4\n951#1:1951,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.cases.CasesViewModel$onSelectOpeningReward$1 */
    /* loaded from: classes.dex */
    public static final class C38081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ CaseReward $reward;
        public final /* synthetic */ int $rewardIndex;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38081(int i, CaseReward caseReward, Continuation<? super C38081> continuation) {
            super(2, continuation);
            this.$rewardIndex = i;
            this.$reward = caseReward;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CasesViewModel.this.new C38081(this.$rewardIndex, this.$reward, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = CasesViewModel.this.get_uiState().getValue().getTotalSprayedDust();
            Ref.IntRef intRef2 = new Ref.IntRef();
            intRef2.element = CasesViewModel.this.get_uiState().getValue().getSelectedSprayedDust();
            List<Integer> gettingSelectedRewardIdList = CasesViewModel.this.get_uiState().getValue().getGettingSelectedRewardIdList();
            List<CaseReward> gettingTenRewardsList = CasesViewModel.this.get_uiState().getValue().getGettingTenRewardsList();
            int i = this.$rewardIndex;
            CaseReward caseReward = this.$reward;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(gettingTenRewardsList, 10));
            int i2 = 0;
            for (Object obj2 : gettingTenRewardsList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                CaseReward caseRewardCopy = (CaseReward) obj2;
                if (i2 == i && caseRewardCopy.getRewardId() == caseReward.getRewardId()) {
                    boolean z = !caseRewardCopy.isSelected();
                    if (z) {
                        intRef.element += caseRewardCopy.getDustValue();
                        intRef2.element += caseRewardCopy.getDustValue();
                        gettingSelectedRewardIdList.add(Boxing.boxInt(caseRewardCopy.getRewardId()));
                    } else {
                        intRef.element -= caseRewardCopy.getDustValue();
                        intRef2.element -= caseRewardCopy.getDustValue();
                        gettingSelectedRewardIdList.remove(Boxing.boxInt(caseRewardCopy.getRewardId()));
                    }
                    caseRewardCopy = caseRewardCopy.copy((127739 & 1) != 0 ? caseRewardCopy.rewardId : 0, (127739 & 2) != 0 ? caseRewardCopy.rewardType : 0, (127739 & 4) != 0 ? caseRewardCopy.rewardName : null, (127739 & 8) != 0 ? caseRewardCopy.rewardNameStore : null, (127739 & 16) != 0 ? caseRewardCopy.dustCountText : null, (127739 & 32) != 0 ? caseRewardCopy.dustSprayedText : null, (127739 & 64) != 0 ? caseRewardCopy.dustValue : 0, (127739 & 128) != 0 ? caseRewardCopy.imageBitmap : null, (127739 & 256) != 0 ? caseRewardCopy.rarity : null, (127739 & 512) != 0 ? caseRewardCopy.sprayed : false, (127739 & 1024) != 0 ? caseRewardCopy.alreadySprayed : false, (127739 & 2048) != 0 ? caseRewardCopy.isSelected : z, (127739 & 4096) != 0 ? caseRewardCopy.count : 0, (127739 & 8192) != 0 ? caseRewardCopy.isRender : false, (127739 & 16384) != 0 ? caseRewardCopy.renderAttachment : null, (127739 & 32768) != 0 ? caseRewardCopy.imageName : null, (127739 & 65536) != 0 ? caseRewardCopy.internalId : 0);
                }
                arrayList.add(caseRewardCopy);
                i2 = i3;
            }
            MutableStateFlow<CasesUiState> mutableStateFlow = CasesViewModel.this.get_uiState();
            while (true) {
                CasesUiState value = mutableStateFlow.getValue();
                CasesUiState casesUiState = value;
                MutableStateFlow<CasesUiState> mutableStateFlow2 = mutableStateFlow;
                ArrayList arrayList2 = arrayList;
                if (mutableStateFlow2.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : arrayList2, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : gettingSelectedRewardIdList, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : intRef.element, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : intRef2.element, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false))) {
                    return Unit.INSTANCE;
                }
                mutableStateFlow = mutableStateFlow2;
                arrayList = arrayList2;
            }
        }
    }

    public final void onSelectOpeningReward(@NotNull CaseReward reward, int rewardIndex) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38081(rewardIndex, reward, null), 1, null);
    }

    /* compiled from: CasesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$onClickToSprayRewardsWithDialog$1", m7120f = "CasesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onClickToSprayRewardsWithDialog$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1945:1\n230#2,5:1946\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onClickToSprayRewardsWithDialog$1\n*L\n986#1:1946,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.cases.CasesViewModel$onClickToSprayRewardsWithDialog$1 */
    /* loaded from: classes.dex */
    public static final class C38051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38051(Continuation<? super C38051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CasesViewModel.this.new C38051(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CasesUiState value;
            CasesUiState casesUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<Integer> gettingSelectedRewardIdList = CasesViewModel.this.get_uiState().getValue().getGettingSelectedRewardIdList();
            int currentScreen = CasesViewModel.this.get_uiState().getValue().getCurrentScreen();
            CasesUiState value2 = CasesViewModel.this.get_uiState().getValue();
            int dustValue = currentScreen == 3 ? value2.getSingleFirstReward().getDustValue() : value2.getSelectedSprayedDust();
            if (currentScreen != 3 && !(!gettingSelectedRewardIdList.isEmpty())) {
                CasesViewModel.this.getLocalNotification().showErrorNotification(CasesViewModel.this.stringResources.getString(R.string.cases_spray_message_if_not_selected_items));
            } else {
                CasesText casesTextCopy$default = CasesText.copy$default(CasesViewModel.this.get_uiState().getValue().getCasesStrings(), null, null, null, null, StringExtensionKt.htmlTextToAnnotatedString(CasesViewModel.this.stringResources.getString(R.string.cases_spray_request)), StringExtensionKt.htmlTextToAnnotatedString(CasesViewModel.this.stringResources.casesSprayRewards(dustValue)), null, 79, null);
                int i = currentScreen == 3 ? 6 : 5;
                MutableStateFlow<CasesUiState> mutableStateFlow = CasesViewModel.this.get_uiState();
                CasesViewModel casesViewModel = CasesViewModel.this;
                do {
                    value = mutableStateFlow.getValue();
                    casesUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState.casesStrings : casesTextCopy$default, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : true, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : casesViewModel.stringResources.getString(R.string.common_yes), (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : i, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false)));
            }
            return Unit.INSTANCE;
        }
    }

    public final void onClickToSprayRewardsWithDialog() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38051(null), 1, null);
    }

    public final void dialogConfirmationApply() {
        int dialogConfirmationContextType = get_uiState().getValue().getDialogConfirmationContextType();
        if (dialogConfirmationContextType == 1) {
            openCase(get_uiState().getValue().getButtonPurchaseType());
            return;
        }
        if (dialogConfirmationContextType == 2) {
            openCase(get_uiState().getValue().getButtonPurchaseType());
            return;
        }
        if (dialogConfirmationContextType == 3) {
            onBcButtonClick();
            return;
        }
        if (dialogConfirmationContextType == 5) {
            onClickToSprayRewards();
            return;
        }
        if (dialogConfirmationContextType == 6) {
            onClickToSprayOneReward();
            return;
        }
        UtilsKt.crashlyticsRecordNewException("dialogConfirmationApply, _uiState.value.dialogConfirmationContextType=" + get_uiState().getValue().getDialogConfirmationContextType());
        closeDialogConfirmation();
    }

    public final void closeDialogConfirmation() {
        CasesUiState value;
        CasesUiState casesUiState;
        MutableStateFlow<CasesUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            casesUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false)));
    }

    /* compiled from: CasesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$openSuperCase$1", m7120f = "CasesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$openSuperCase$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1945:1\n1549#2:1946\n1620#2,3:1947\n230#3,5:1950\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$openSuperCase$1\n*L\n1047#1:1946\n1047#1:1947,3\n1058#1:1950,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.cases.CasesViewModel$openSuperCase$1 */
    /* loaded from: classes.dex */
    public static final class C38111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38111(Continuation<? super C38111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CasesViewModel.this.new C38111(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int legendaryCaseId = CasesViewModel.this.get_uiState().getValue().getLegendaryCaseId();
            CasesViewModel.this.actionWithJSON.openSuperCase();
            CasesViewModel.this.actionWithJSON.selectCase(legendaryCaseId);
            List<Case> casesList = CasesViewModel.this.get_uiState().getValue().getCasesList();
            CasesViewModel casesViewModel = CasesViewModel.this;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(casesList, 10));
            for (Case caseCopy : casesList) {
                if (caseCopy.getId() == legendaryCaseId && casesViewModel.get_uiState().getValue().isNeedAddCountSuperCase()) {
                    caseCopy = caseCopy.copy((65519 & 1) != 0 ? caseCopy.id : 0, (65519 & 2) != 0 ? caseCopy.name : null, (65519 & 4) != 0 ? caseCopy.imageBitmap : null, (65519 & 8) != 0 ? caseCopy.bgImageBitmap : null, (65519 & 16) != 0 ? caseCopy.count : caseCopy.getCount() + 1, (65519 & 32) != 0 ? caseCopy.isUsedSale : false, (65519 & 64) != 0 ? caseCopy.type : 0, (65519 & 128) != 0 ? caseCopy.dates : null, (65519 & 256) != 0 ? caseCopy.price : null, (65519 & 512) != 0 ? caseCopy.discount : null, (65519 & 1024) != 0 ? caseCopy.discountType : 0, (65519 & 2048) != 0 ? caseCopy.isSale : false, (65519 & 4096) != 0 ? caseCopy.caseRewardList : null, (65519 & 8192) != 0 ? caseCopy.scrolledReward : null, (65519 & 16384) != 0 ? caseCopy.scrolledPosition : 0, (65519 & 32768) != 0 ? caseCopy.caseBonusList : null);
                }
                arrayList.add(caseCopy);
            }
            Case caseFindSelectedCase = CasesViewModel.this.findSelectedCase(legendaryCaseId, arrayList);
            int iIndexOf = arrayList.indexOf(caseFindSelectedCase);
            if (iIndexOf < 0) {
                iIndexOf = 0;
            }
            int i = iIndexOf;
            MutableStateFlow<CasesUiState> mutableStateFlow = CasesViewModel.this.get_uiState();
            while (true) {
                CasesUiState value = mutableStateFlow.getValue();
                CasesUiState casesUiState = value;
                MutableStateFlow<CasesUiState> mutableStateFlow2 = mutableStateFlow;
                Case r72 = caseFindSelectedCase;
                ArrayList arrayList2 = arrayList;
                if (mutableStateFlow2.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 1, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : legendaryCaseId, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : i, ((-1) & 16384) != 0 ? casesUiState.selectedCase : r72, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : arrayList2, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false))) {
                    return Unit.INSTANCE;
                }
                mutableStateFlow = mutableStateFlow2;
                caseFindSelectedCase = r72;
                arrayList = arrayList2;
            }
        }
    }

    public final void openSuperCase() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C38111(null), 1, null);
    }

    /* compiled from: CasesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$onClickCloseBanner$1", m7120f = "CasesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.cases.CasesViewModel$onClickCloseBanner$1 */
    /* loaded from: classes.dex */
    public static final class C37991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37991(Continuation<? super C37991> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CasesViewModel.this.new C37991(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CasesViewModel.this.actionWithJSON.closeBanner();
                CasesViewModel.this.closeInterface();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onClickCloseBanner() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37991(null), 1, null);
    }

    /* compiled from: CasesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$onClickOpenCasesFromBanner$1", m7120f = "CasesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.cases.CasesViewModel$onClickOpenCasesFromBanner$1 */
    /* loaded from: classes.dex */
    public static final class C38011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38011(Continuation<? super C38011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CasesViewModel.this.new C38011(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CasesViewModel.this.actionWithJSON.openCasesFromBanner();
                CasesViewModel.this.closeInterface();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onClickOpenCasesFromBanner() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C38011(null), 1, null);
    }

    public final void updateAnimationState(boolean newState) {
        CasesUiState value;
        CasesUiState casesUiState;
        MutableStateFlow<CasesUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            casesUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : newState, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false)));
    }

    /* compiled from: CasesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$onClickNextReward$1", m7120f = "CasesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onClickNextReward$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1945:1\n230#2,5:1946\n230#2,5:1951\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onClickNextReward$1\n*L\n1097#1:1946,5\n1110#1:1951,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.cases.CasesViewModel$onClickNextReward$1 */
    /* loaded from: classes.dex */
    public static final class C38001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38001(Continuation<? super C38001> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CasesViewModel.this.new C38001(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CasesUiState value;
            CasesUiState casesUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (CasesViewModel.this.get_uiState().getValue().getCurrentRewardNumberForUi() == 10) {
                MutableStateFlow<CasesUiState> mutableStateFlow = CasesViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    casesUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 1, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : true, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false)));
            } else {
                int currentRewardIndex = CasesViewModel.this.get_uiState().getValue().getCurrentRewardIndex() + 1;
                int currentRewardNumberForUi = CasesViewModel.this.get_uiState().getValue().getCurrentRewardNumberForUi() + 1;
                CaseReward caseReward = CasesViewModel.this.getUiState().getValue().getGettingTenRewardsList().get(currentRewardIndex);
                MutableStateFlow<CasesUiState> mutableStateFlow2 = CasesViewModel.this.get_uiState();
                while (true) {
                    CasesUiState value2 = mutableStateFlow2.getValue();
                    CasesUiState casesUiState2 = value2;
                    MutableStateFlow<CasesUiState> mutableStateFlow3 = mutableStateFlow2;
                    if (mutableStateFlow3.compareAndSet(value2, casesUiState2.copy(((-1) & 1) != 0 ? casesUiState2.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState2.casesStrings : null, ((-1) & 4) != 0 ? casesUiState2.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState2.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState2.bcAmount : null, ((-1) & 32) != 0 ? casesUiState2.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState2.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState2.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState2.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState2.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState2.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState2.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState2.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState2.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState2.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState2.currentReward : caseReward, ((-1) & 65536) != 0 ? casesUiState2.casesList : null, ((-1) & 131072) != 0 ? casesUiState2.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState2.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState2.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState2.currentRewardIndex : currentRewardIndex, ((-1) & 2097152) != 0 ? casesUiState2.currentRewardNumberForUi : currentRewardNumberForUi, ((-1) & 4194304) != 0 ? casesUiState2.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState2.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState2.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState2.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState2.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState2.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState2.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState2.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState2.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState2.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState2.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState2.casePrices : null, (2055208943 & 4) != 0 ? casesUiState2.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState2.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState2.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState2.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState2.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState2.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState2.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState2.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState2.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState2.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState2.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState2.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState2.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState2.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState2.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState2.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState2.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState2.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState2.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState2.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState2.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState2.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState2.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState2.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState2.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState2.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState2.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState2.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState2.isShowingShimmer : false))) {
                        break;
                    }
                    mutableStateFlow2 = mutableStateFlow3;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void onClickNextReward() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38001(null), 1, null);
    }

    public final void onClickSkipAnim() {
        CasesUiState value;
        CasesUiState casesUiState;
        MutableStateFlow<CasesUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            casesUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 1, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : true, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false)));
    }

    /* compiled from: CasesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$onClickTakeRewards$1", m7120f = "CasesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onClickTakeRewards$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1945:1\n1#2:1946\n230#3,5:1947\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onClickTakeRewards$1\n*L\n1149#1:1947,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.cases.CasesViewModel$onClickTakeRewards$1 */
    /* loaded from: classes.dex */
    public static final class C38021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<CaseReward> $rewardListIsAllRewardsSprayed;
        public int label;
        public final /* synthetic */ CasesViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38021(List<CaseReward> list, CasesViewModel casesViewModel, Continuation<? super C38021> continuation) {
            super(2, continuation);
            this.$rewardListIsAllRewardsSprayed = list;
            this.this$0 = casesViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C38021(this.$rewardListIsAllRewardsSprayed, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CasesUiState value;
            CasesUiState casesUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<CaseReward> gettingTenRewardsList = this.$rewardListIsAllRewardsSprayed;
            if (gettingTenRewardsList == null) {
                gettingTenRewardsList = this.this$0.get_uiState().getValue().getGettingTenRewardsList();
            }
            CaseSprayedInfoAttachment caseSprayedInfoAttachmentFindNotSprayedRewards = this.this$0.findNotSprayedRewards(gettingTenRewardsList);
            List<Integer> notSprayedRewardIdList = caseSprayedInfoAttachmentFindNotSprayedRewards.getNotSprayedRewardIdList();
            if (notSprayedRewardIdList.isEmpty()) {
                notSprayedRewardIdList = null;
            }
            List<Integer> list = notSprayedRewardIdList;
            List<Integer> sprayedRewardIdList = caseSprayedInfoAttachmentFindNotSprayedRewards.getSprayedRewardIdList();
            if (sprayedRewardIdList.isEmpty()) {
                sprayedRewardIdList = null;
            }
            this.this$0.actionWithJSON.takeRewards(list, sprayedRewardIdList);
            MutableStateFlow<CasesUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                casesUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 1, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 1, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : CollectionsKt__CollectionsKt.emptyList(), ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : new ArrayList(), ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : new CaseSprayedInfoAttachment(null, null, 3, null), ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false)));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onClickTakeRewards$default(CasesViewModel casesViewModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        casesViewModel.onClickTakeRewards(list);
    }

    public final void onClickTakeRewards(@Nullable List<CaseReward> rewardListIsAllRewardsSprayed) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C38021(rewardListIsAllRewardsSprayed, this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeInterface() {
        CasesUiState value;
        CasesUiState casesUiState;
        MutableStateFlow<CasesUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            casesUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : true, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false)));
    }

    /* compiled from: CasesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$openCase$1", m7120f = "CasesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$openCase$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1945:1\n230#2,5:1946\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$openCase$1\n*L\n1181#1:1946,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.cases.CasesViewModel$openCase$1 */
    /* loaded from: classes.dex */
    public static final class C38091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $buttonType;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38091(int i, Continuation<? super C38091> continuation) {
            super(2, continuation);
            this.$buttonType = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CasesViewModel.this.new C38091(this.$buttonType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CasesUiState value;
            CasesUiState casesUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CasesViewModel.this.actionWithJSON.openCases(CasesViewModel.this.get_uiState().getValue().getSelectedCaseId(), this.$buttonType);
            MutableStateFlow<CasesUiState> mutableStateFlow = CasesViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                casesUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : null, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : null, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false)));
            return Unit.INSTANCE;
        }
    }

    public final void openCase(int buttonType) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C38091(buttonType, null), 1, null);
    }

    /* compiled from: CasesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$onClickToSprayRewards$1", m7120f = "CasesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onClickToSprayRewards$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1945:1\n1549#2:1946\n1620#2,3:1947\n230#3,5:1950\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onClickToSprayRewards$1\n*L\n1197#1:1946\n1197#1:1947,3\n1218#1:1950,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.cases.CasesViewModel$onClickToSprayRewards$1 */
    /* loaded from: classes.dex */
    public static final class C38041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38041(Continuation<? super C38041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CasesViewModel.this.new C38041(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Ref.IntRef intRef = new Ref.IntRef();
            List<Integer> gettingSelectedRewardIdList = CasesViewModel.this.get_uiState().getValue().getGettingSelectedRewardIdList();
            List<Integer> sprayedRewardIdList = CasesViewModel.this.get_uiState().getValue().getSprayedRewardIdList();
            sprayedRewardIdList.addAll(gettingSelectedRewardIdList);
            List<CaseReward> gettingTenRewardsList = CasesViewModel.this.get_uiState().getValue().getGettingTenRewardsList();
            CasesViewModel casesViewModel = CasesViewModel.this;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(gettingTenRewardsList, 10));
            for (CaseReward caseRewardCopy : gettingTenRewardsList) {
                if (caseRewardCopy.getAlreadySprayed() || caseRewardCopy.isSelected()) {
                    intRef.element++;
                }
                if (caseRewardCopy.isSelected()) {
                    caseRewardCopy = caseRewardCopy.copy((127739 & 1) != 0 ? caseRewardCopy.rewardId : 0, (127739 & 2) != 0 ? caseRewardCopy.rewardType : 0, (127739 & 4) != 0 ? caseRewardCopy.rewardName : casesViewModel.stringResources.getString(R.string.cases_sprayed), (127739 & 8) != 0 ? caseRewardCopy.rewardNameStore : null, (127739 & 16) != 0 ? caseRewardCopy.dustCountText : null, (127739 & 32) != 0 ? caseRewardCopy.dustSprayedText : null, (127739 & 64) != 0 ? caseRewardCopy.dustValue : 0, (127739 & 128) != 0 ? caseRewardCopy.imageBitmap : null, (127739 & 256) != 0 ? caseRewardCopy.rarity : CommonRarityEnum.SPRAYED, (127739 & 512) != 0 ? caseRewardCopy.sprayed : false, (127739 & 1024) != 0 ? caseRewardCopy.alreadySprayed : true, (127739 & 2048) != 0 ? caseRewardCopy.isSelected : false, (127739 & 4096) != 0 ? caseRewardCopy.count : 0, (127739 & 8192) != 0 ? caseRewardCopy.isRender : false, (127739 & 16384) != 0 ? caseRewardCopy.renderAttachment : null, (127739 & 32768) != 0 ? caseRewardCopy.imageName : null, (127739 & 65536) != 0 ? caseRewardCopy.internalId : 0);
                }
                arrayList.add(caseRewardCopy);
            }
            CasesViewModel.this.getLocalNotification().showPositiveNotification(CasesViewModel.this.stringResources.getString(R.string.cases_main_notification_rewards_sprayed));
            if (intRef.element == arrayList.size()) {
                CasesViewModel.this.onClickTakeRewards(arrayList);
            } else {
                MutableStateFlow<CasesUiState> mutableStateFlow = CasesViewModel.this.get_uiState();
                CasesViewModel casesViewModel2 = CasesViewModel.this;
                while (true) {
                    CasesUiState value = mutableStateFlow.getValue();
                    CasesUiState casesUiState = value;
                    ArrayList arrayList2 = arrayList;
                    if (mutableStateFlow.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 0, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : arrayList2, ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : new ArrayList(), ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : sprayedRewardIdList, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : true, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : casesViewModel2.get_uiState().getValue().getGetValueOfPreviewDust(), (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false))) {
                        break;
                    }
                    arrayList = arrayList2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void onClickToSprayRewards() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38041(null), 1, null);
    }

    /* compiled from: CasesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$onClickToSprayOneReward$1", m7120f = "CasesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onClickToSprayOneReward$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1945:1\n230#2,5:1946\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$onClickToSprayOneReward$1\n*L\n1244#1:1946,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.cases.CasesViewModel$onClickToSprayOneReward$1 */
    /* loaded from: classes.dex */
    public static final class C38031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38031(Continuation<? super C38031> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CasesViewModel.this.new C38031(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CasesUiState value;
            CasesUiState casesUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CasesViewModel.this.actionWithJSON.takeRewards(null, CollectionsKt__CollectionsJVMKt.listOf(Boxing.boxInt(CasesViewModel.this.get_uiState().getValue().getSingleFirstReward().getRewardId())));
            CasesViewModel.this.getLocalNotification().showPositiveNotification(CasesViewModel.this.stringResources.getString(R.string.cases_main_notification_reward_sprayed));
            MutableStateFlow<CasesUiState> mutableStateFlow = CasesViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                casesUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, casesUiState.copy(((-1) & 1) != 0 ? casesUiState.currentScreen : 1, ((-1) & 2) != 0 ? casesUiState.casesStrings : null, ((-1) & 4) != 0 ? casesUiState.legendaryCaseId : 0, ((-1) & 8) != 0 ? casesUiState.dailyCaseId : 0, ((-1) & 16) != 0 ? casesUiState.bcAmount : null, ((-1) & 32) != 0 ? casesUiState.valueOfBc : 0, ((-1) & 64) != 0 ? casesUiState.widthOfImage : 0, ((-1) & 128) != 0 ? casesUiState.heightOfImage : 0, ((-1) & 256) != 0 ? casesUiState.bannerAttachment : null, ((-1) & 512) != 0 ? casesUiState.selectedReward : null, ((-1) & 1024) != 0 ? casesUiState.selectedRewardPos : 0, ((-1) & 2048) != 0 ? casesUiState.caseCount : 0, ((-1) & 4096) != 0 ? casesUiState.selectedCaseId : 0, ((-1) & 8192) != 0 ? casesUiState.goToCasePos : 0, ((-1) & 16384) != 0 ? casesUiState.selectedCase : null, ((-1) & 32768) != 0 ? casesUiState.currentReward : null, ((-1) & 65536) != 0 ? casesUiState.casesList : null, ((-1) & 131072) != 0 ? casesUiState.selectedBonuses : null, ((-1) & 262144) != 0 ? casesUiState.progressBarBonusPercentList : null, ((-1) & 524288) != 0 ? casesUiState.selectedRewards : null, ((-1) & 1048576) != 0 ? casesUiState.currentRewardIndex : 0, ((-1) & 2097152) != 0 ? casesUiState.currentRewardNumberForUi : 0, ((-1) & 4194304) != 0 ? casesUiState.allRewardsOpened : false, ((-1) & 8388608) != 0 ? casesUiState.gettingTenRewardsList : CollectionsKt__CollectionsKt.emptyList(), ((-1) & 16777216) != 0 ? casesUiState.gettingSelectedRewardIdList : new ArrayList(), ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.sprayedRewardIdList : null, ((-1) & 67108864) != 0 ? casesUiState.attachmentForServer : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.totalSprayedDust : 0, ((-1) & 268435456) != 0 ? casesUiState.selectedSprayedDust : 0, ((-1) & 536870912) != 0 ? casesUiState.isSprayed : false, ((-1) & 1073741824) != 0 ? casesUiState.isNeedShowButtonSpray : false, ((-1) & Integer.MIN_VALUE) != 0 ? casesUiState.openingsCount : 0, (2055208943 & 1) != 0 ? casesUiState.openingsProgressBarState : 0, (2055208943 & 2) != 0 ? casesUiState.casePrices : null, (2055208943 & 4) != 0 ? casesUiState.casePricesForGuide : null, (2055208943 & 8) != 0 ? casesUiState.isNeedClose : false, (2055208943 & 16) != 0 ? casesUiState.valueOfCurrentDust : 0, (2055208943 & 32) != 0 ? casesUiState.valueOfMaxDust : 0, (2055208943 & 64) != 0 ? casesUiState.isHintsOpened : false, (2055208943 & 128) != 0 ? casesUiState.isMainHintDialogOpened : false, (2055208943 & 256) != 0 ? casesUiState.isHintsBonusInfoOpened : false, (2055208943 & 512) != 0 ? casesUiState.casesBonusHintAttachment : null, (2055208943 & 1024) != 0 ? casesUiState.casesResponse : null, (2055208943 & 2048) != 0 ? casesUiState.awardResponse : null, (2055208943 & 4096) != 0 ? casesUiState.bgImage : null, (2055208943 & 8192) != 0 ? casesUiState.bitmapMap : null, (2055208943 & 16384) != 0 ? casesUiState.prizesBgPattern : null, (2055208943 & 32768) != 0 ? casesUiState.buttonPurchaseType : 0, (2055208943 & 65536) != 0 ? casesUiState.isShowDialogConfirmation : false, (2055208943 & 131072) != 0 ? casesUiState.buttonApplyText : null, (2055208943 & 262144) != 0 ? casesUiState.dialogConfirmationContextType : 0, (2055208943 & 524288) != 0 ? casesUiState.titleOpeningCase : null, (2055208943 & 1048576) != 0 ? casesUiState.valueOfOpenedCases : 0, (2055208943 & 2097152) != 0 ? casesUiState.priceBcOpeningCases : 0, (2055208943 & 4194304) != 0 ? casesUiState.getValueOfDust : 0, (2055208943 & 8388608) != 0 ? casesUiState.isShowDialogPreviewReward : false, (2055208943 & 16777216) != 0 ? casesUiState.selectedBonusReward : null, (2055208943 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? casesUiState.rewardImage : null, (2055208943 & 67108864) != 0 ? casesUiState.selectedBonusRewardId : 0, (2055208943 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? casesUiState.isGettingBonusReward : false, (2055208943 & 268435456) != 0 ? casesUiState.isNeedAddCountSuperCase : false, (2055208943 & 536870912) != 0 ? casesUiState.isAnimationNeed : false, (2055208943 & 1073741824) != 0 ? casesUiState.isShowingShimmer : false)));
            return Unit.INSTANCE;
        }
    }

    public final void onClickToSprayOneReward() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C38031(null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Float> getProgressBarValues(List<CaseBonus> caseBonusList, int openingsCount) {
        ArrayList arrayList = new ArrayList();
        int size = caseBonusList.size() - 1;
        int i = 0;
        for (Object obj : caseBonusList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            float openingsCountRequired = 1.0f;
            if (openingsCount < ((CaseBonus) obj).getOpeningsCountRequired()) {
                if (i != size) {
                    int openingsCountRequired2 = caseBonusList.get(i2).getOpeningsCountRequired();
                    openingsCountRequired = (openingsCountRequired2 == openingsCount || openingsCountRequired2 > openingsCount) ? 0.0f : 1.0f / ((r4.getOpeningsCountRequired() - openingsCountRequired2) / (openingsCount - openingsCountRequired2));
                } else if (openingsCount != 0) {
                    openingsCountRequired = 1.0f / (r4.getOpeningsCountRequired() / openingsCount);
                }
            }
            arrayList.add(Float.valueOf(openingsCountRequired));
            i = i2;
        }
        return arrayList;
    }

    public final AnnotatedString getBCAmountString(int bcAmount) {
        return StringExtensionKt.htmlTextToAnnotatedString(this.stringResources.getString(R.string.cases_bc, UsefulKt.getPriceWithSpaces(Integer.valueOf(bcAmount))));
    }

    public final List<Case> mapArrayToCaseList(List<CaseWithStatusModel> caseStatus, CasesResponse caseResponse, List<BpRewardsAwardsDto> awardList, List<InvItems> inventoryList) {
        String string;
        Object next;
        int i;
        boolean zIsOne;
        Long l;
        int i2;
        ArrayList arrayList = new ArrayList();
        for (CasesCaseTypeDto casesCaseTypeDto : caseResponse.getCases()) {
            int i3 = 1;
            boolean zIfTimeHasPassed = ifTimeHasPassed(LongExtensionKt.getOrZero((Long) CollectionsKt___CollectionsKt.getOrNull(casesCaseTypeDto.getDates(), 1)));
            Iterator<T> it = caseStatus.iterator();
            while (true) {
                string = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((CaseWithStatusModel) next).getIdCase() == casesCaseTypeDto.getId()) {
                    break;
                }
            }
            CaseWithStatusModel caseWithStatusModel = (CaseWithStatusModel) next;
            if (caseWithStatusModel != null) {
                int valueOfCases = caseWithStatusModel.getValueOfCases();
                zIsOne = IntExtensionKt.isOne(Integer.valueOf(caseWithStatusModel.isUsedSale()));
                i = valueOfCases;
            } else {
                i = 0;
                zIsOne = false;
            }
            if ((zIfTimeHasPassed && i > 0) || !zIfTimeHasPassed) {
                List<CasesAwardDto> awards = casesCaseTypeDto.getAwards();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(awards, 10));
                Iterator<T> it2 = awards.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(toCaseReward((CasesAwardDto) it2.next(), awardList, inventoryList));
                }
                CasesSortedListWithScrolledPos casesSortedListWithScrolledPosSortingRewards = sortingRewards(arrayList2);
                int iFindSelectedRewardPos = findSelectedRewardPos(casesSortedListWithScrolledPosSortingRewards.getSortedRewards(), casesSortedListWithScrolledPosSortingRewards.getScrolledReward());
                List<CasesBonusDto> bonus = casesCaseTypeDto.getBonus();
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(bonus, 10));
                Iterator<T> it3 = bonus.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(toCaseBonus((CasesBonusDto) it3.next(), awardList, inventoryList));
                }
                Bitmap pngBitmapFromZip = BitmapUtilsKt.getPngBitmapFromZip(this.application, casesCaseTypeDto.getImage(), ImageTypePathInCDNEnum.IMAGE);
                Bitmap pngBitmapFromZip2 = BitmapUtilsKt.getPngBitmapFromZip(this.application, casesCaseTypeDto.getBgImage(), ImageTypePathInCDNEnum.BACKGROUND);
                Long l2 = (Long) CollectionsKt___CollectionsKt.getOrNull(casesCaseTypeDto.getDates(), 0);
                if ((l2 == null || l2.longValue() != 0) && ((l = (Long) CollectionsKt___CollectionsKt.getOrNull(casesCaseTypeDto.getDates(), 1)) == null || l.longValue() != 0)) {
                    DateFormatter dateFormatter = DateFormatter.INSTANCE;
                    string = this.stringResources.getString(R.string.cases_format_date, dateFormatter.formatToDate(LongExtensionKt.getOrZero((Long) CollectionsKt___CollectionsKt.getOrNull(casesCaseTypeDto.getDates(), 0)) * 1000, DateFormatter.DD_MM_YYYY), dateFormatter.formatToDate(LongExtensionKt.getOrZero((Long) CollectionsKt___CollectionsKt.getOrNull(casesCaseTypeDto.getDates(), 1)) * 1000, "dd.MM.yyyy HH:mm"));
                }
                String str = string;
                boolean z = IntExtensionKt.isNotZero(Integer.valueOf(IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(casesCaseTypeDto.getDiscount(), 0)))) || IntExtensionKt.isNotZero(Integer.valueOf(IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(casesCaseTypeDto.getDiscount(), 1))));
                if (((IntExtensionKt.isZero(Integer.valueOf(casesCaseTypeDto.getDiscountType())) && z && !zIsOne) || (IntExtensionKt.isOne(Integer.valueOf(casesCaseTypeDto.getDiscountType())) && z)) && AnyExtensionKt.isNotNull(str)) {
                    i3 = 3;
                } else if (AnyExtensionKt.isNotNull(str)) {
                    i3 = 2;
                } else {
                    if ((!IntExtensionKt.isZero(Integer.valueOf(casesCaseTypeDto.getDiscountType())) || zIsOne || !z) && (!IntExtensionKt.isOne(Integer.valueOf(casesCaseTypeDto.getDiscountType())) || !z)) {
                        i2 = 0;
                    }
                    arrayList.add(new Case(casesCaseTypeDto.getId(), casesCaseTypeDto.getName(), pngBitmapFromZip, pngBitmapFromZip2, i, zIsOne, i2, str, casesCaseTypeDto.getPrice(), casesCaseTypeDto.getDiscount(), casesCaseTypeDto.getDiscountType(), IntExtensionKt.isOne(Integer.valueOf(casesCaseTypeDto.getSale())), casesSortedListWithScrolledPosSortingRewards.getSortedRewards(), casesSortedListWithScrolledPosSortingRewards.getScrolledReward(), iFindSelectedRewardPos, arrayList3));
                }
                i2 = i3;
                arrayList.add(new Case(casesCaseTypeDto.getId(), casesCaseTypeDto.getName(), pngBitmapFromZip, pngBitmapFromZip2, i, zIsOne, i2, str, casesCaseTypeDto.getPrice(), casesCaseTypeDto.getDiscount(), casesCaseTypeDto.getDiscountType(), IntExtensionKt.isOne(Integer.valueOf(casesCaseTypeDto.getSale())), casesSortedListWithScrolledPosSortingRewards.getSortedRewards(), casesSortedListWithScrolledPosSortingRewards.getScrolledReward(), iFindSelectedRewardPos, arrayList3));
            }
        }
        return arrayList;
    }

    public final CaseReward toCaseReward(CasesAwardDto casesAwardDto, List<BpRewardsAwardsDto> list, List<InvItems> list2) {
        String renderId;
        String str;
        boolean z;
        String str2;
        Object next;
        List<String> imageList;
        CaseRenderAttachment caseRenderAttachment = new CaseRenderAttachment(0, 0, 0, 0.0f, null, null, null, null, null, null, 1023, null);
        String strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        if (casesAwardDto.getType() == 5 || casesAwardDto.getType() == 11) {
            if (casesAwardDto.getRenderId() == null) {
                caseRenderAttachment = getCaseRenderAttachment(casesAwardDto.getType(), casesAwardDto.getInternalId(), list2, casesAwardDto.getCount());
                str = strEmpty;
                z = true;
                return new CaseReward(casesAwardDto.getId(), casesAwardDto.getType(), casesAwardDto.getName(), casesAwardDto.getNameStore(), this.stringResources.getString(R.string.common_plus_value, Integer.valueOf(casesAwardDto.getPriceSprayed())), String.valueOf(casesAwardDto.getPriceSprayed()), casesAwardDto.getPriceSprayed(), null, CommonRarityEnum.INSTANCE.fromInt(casesAwardDto.getRarity()), IntExtensionKt.isNotZero(Integer.valueOf(casesAwardDto.getPriceSprayed())), false, false, casesAwardDto.getCount(), z, caseRenderAttachment, str, casesAwardDto.getInternalId(), 128, null);
            }
            renderId = casesAwardDto.getRenderId();
        } else {
            renderId = casesAwardDto.getRenderId();
            if (renderId == null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    str2 = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((BpRewardsAwardsDto) next).getId() == casesAwardDto.getType()) {
                        break;
                    }
                }
                BpRewardsAwardsDto bpRewardsAwardsDto = (BpRewardsAwardsDto) next;
                if (bpRewardsAwardsDto != null && (imageList = bpRewardsAwardsDto.getImageList()) != null) {
                    str2 = (String) CollectionsKt___CollectionsKt.getOrNull(imageList, casesAwardDto.getInternalId() - 1);
                }
                renderId = str2 == null ? "" : str2;
            }
        }
        str = renderId;
        z = false;
        return new CaseReward(casesAwardDto.getId(), casesAwardDto.getType(), casesAwardDto.getName(), casesAwardDto.getNameStore(), this.stringResources.getString(R.string.common_plus_value, Integer.valueOf(casesAwardDto.getPriceSprayed())), String.valueOf(casesAwardDto.getPriceSprayed()), casesAwardDto.getPriceSprayed(), null, CommonRarityEnum.INSTANCE.fromInt(casesAwardDto.getRarity()), IntExtensionKt.isNotZero(Integer.valueOf(casesAwardDto.getPriceSprayed())), false, false, casesAwardDto.getCount(), z, caseRenderAttachment, str, casesAwardDto.getInternalId(), 128, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CaseBonus toCaseBonus(CasesBonusDto casesBonusDto, List<BpRewardsAwardsDto> list, List<InvItems> list2) {
        String renderId;
        String str;
        boolean z;
        String str2;
        Object next;
        List<String> imageList;
        CaseRenderAttachment caseRenderAttachment = new CaseRenderAttachment(0, 0, 0, 0.0f, null, null, null, null, null, null, 1023, null);
        String strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        if (casesBonusDto.getType() == 5 || casesBonusDto.getType() == 11) {
            if (casesBonusDto.getRenderId() == null) {
                caseRenderAttachment = getCaseRenderAttachment(casesBonusDto.getType(), casesBonusDto.getInternalId(), list2, casesBonusDto.getCount());
                str = strEmpty;
                z = true;
                CaseRenderAttachment caseRenderAttachment2 = caseRenderAttachment;
                int id = casesBonusDto.getId();
                int type = casesBonusDto.getType();
                String str3 = (String) UtilsKt.buildTypeMerge(casesBonusDto.getName(), casesBonusDto.getNameStore());
                return new CaseBonus(id, type, str3 != null ? "" : str3, null, 0, casesBonusDto.getNumberOpen(), CommonRarityEnum.INSTANCE.fromInt(IntExtensionKt.getOrOne(Integer.valueOf(casesBonusDto.getRarity()))), casesBonusDto.getCount(), z, caseRenderAttachment2, str, casesBonusDto.getInternalId(), 24, null);
            }
            renderId = casesBonusDto.getRenderId();
        } else {
            renderId = casesBonusDto.getRenderId();
            if (renderId == null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    str2 = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((BpRewardsAwardsDto) next).getId() == casesBonusDto.getType()) {
                        break;
                    }
                }
                BpRewardsAwardsDto bpRewardsAwardsDto = (BpRewardsAwardsDto) next;
                if (bpRewardsAwardsDto != null && (imageList = bpRewardsAwardsDto.getImageList()) != null) {
                    str2 = (String) CollectionsKt___CollectionsKt.getOrNull(imageList, casesBonusDto.getInternalId() - 1);
                }
                renderId = str2 == null ? "" : str2;
            }
        }
        str = renderId;
        z = false;
        CaseRenderAttachment caseRenderAttachment22 = caseRenderAttachment;
        int id2 = casesBonusDto.getId();
        int type2 = casesBonusDto.getType();
        String str32 = (String) UtilsKt.buildTypeMerge(casesBonusDto.getName(), casesBonusDto.getNameStore());
        return new CaseBonus(id2, type2, str32 != null ? "" : str32, null, 0, casesBonusDto.getNumberOpen(), CommonRarityEnum.INSTANCE.fromInt(IntExtensionKt.getOrOne(Integer.valueOf(casesBonusDto.getRarity()))), casesBonusDto.getCount(), z, caseRenderAttachment22, str, casesBonusDto.getInternalId(), 24, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CaseRenderAttachment getCaseRenderAttachment(int type, int internalId, List<InvItems> inventoryList, int count) {
        InvItems invItems;
        float orOne;
        float orOne2;
        int i;
        float f;
        float f2;
        int i2;
        float f3;
        Object next;
        int orZero = internalId;
        int i3 = type == 11 ? orZero == 134 ? 2 : 0 : 7;
        if (i3 == 0) {
            Iterator<T> it = inventoryList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((InvItems) next).getId() == orZero) {
                    break;
                }
            }
            invItems = (InvItems) next;
        } else {
            invItems = null;
        }
        if (i3 == 0) {
            orZero = IntExtensionKt.getOrZero(invItems != null ? Integer.valueOf(invItems.getModelid()) : null);
        } else if (i3 == 2) {
            orZero = count;
        }
        if (i3 != 0) {
            i = 1;
            if (i3 == 2) {
                f3 = 1.0f;
            } else {
                if (i3 != 7) {
                    f = 0.78f;
                    f2 = 0.0f;
                    orOne2 = 0.0f;
                    i2 = 0;
                    orOne = 0.0f;
                    return new CaseRenderAttachment(i3, orZero, i2, f, invItems == null ? invItems.get_x() : null, invItems == null ? invItems.get_y() : null, invItems != null ? invItems.get_z() : null, Float.valueOf(f2), Float.valueOf(orOne), Float.valueOf(orOne2));
                }
                f3 = 0.85f;
            }
            f = f3;
            f2 = 0.0f;
            orOne = 0.0f;
            orOne2 = 0.0f;
        } else {
            float orOne3 = FloatExtensionKt.getOrOne(invItems != null ? Float.valueOf(invItems.getZoom()) : null);
            float orOne4 = FloatExtensionKt.getOrOne(invItems != null ? invItems.get_shiftX() : null);
            orOne = FloatExtensionKt.getOrOne(invItems != null ? invItems.get_shiftY() : null);
            orOne2 = FloatExtensionKt.getOrOne(invItems != null ? invItems.get_shiftZ() : null);
            i = 3;
            f = orOne3;
            f2 = orOne4;
        }
        i2 = i;
        return new CaseRenderAttachment(i3, orZero, i2, f, invItems == null ? invItems.get_x() : null, invItems == null ? invItems.get_y() : null, invItems != null ? invItems.get_z() : null, Float.valueOf(f2), Float.valueOf(orOne), Float.valueOf(orOne2));
    }

    public final Case findSelectedCase(int caseId, List<Case> cases) {
        Object next;
        Iterator<T> it = cases.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Case) next).getId() == caseId) {
                break;
            }
        }
        Case r1 = (Case) next;
        return r1 == null ? new Case(0, null, null, null, 0, false, 0, null, null, null, 0, false, null, null, 0, null, 65535, null) : r1;
    }

    public final int findSelectedRewardPos(List<CaseReward> rewardList, CaseReward reward) {
        Integer numValueOf = rewardList != null ? Integer.valueOf(CollectionsKt___CollectionsKt.indexOf((List<? extends CaseReward>) rewardList, reward)) : null;
        if (numValueOf != null && numValueOf.intValue() == -1) {
            numValueOf = 0;
        }
        return IntExtensionKt.getOrZero(numValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CasePricesModel initCasePricesModel(int priceOne, int discountOne, int priceTen, int discountTen, int caseValue, boolean isUsedSale, boolean isSale) {
        String str;
        Integer num;
        int i;
        Integer num2;
        String string = this.stringResources.getString(R.string.common_string_with_bc);
        int i2 = isUsedSale ? 0 : discountOne;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(priceOne)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        String str3 = null;
        Integer numValueOf = (caseValue < 1 && IntExtensionKt.isNotZero(Integer.valueOf(i2))) ? Integer.valueOf(i2) : null;
        if (numValueOf != null) {
            Integer numValueOf2 = Integer.valueOf(priceOne - (priceOne / numValueOf.intValue()));
            str = String.format(string, Arrays.copyOf(new Object[]{numValueOf2}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            num = numValueOf2;
        } else {
            str = null;
            num = null;
        }
        float f = (isSale || caseValue != 0) ? 1.0f : 0.5f;
        int i3 = 2;
        if (isSale && caseValue < 1) {
            if (AnyExtensionKt.isNotNull(numValueOf) && AnyExtensionKt.isNotNull(str)) {
                i = 2;
            } else {
                i = (AnyExtensionKt.isNull(numValueOf) && AnyExtensionKt.isNull(str)) ? 1 : 0;
            }
        }
        int i4 = isUsedSale ? 0 : discountTen;
        String str4 = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(priceTen)}, 1));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        Integer numValueOf3 = (caseValue < 10 && IntExtensionKt.isNotZero(Integer.valueOf(i4))) ? Integer.valueOf(i4) : null;
        if (numValueOf3 != null) {
            Integer numValueOf4 = Integer.valueOf(priceTen - FloatExtensionKt.roundToIntSafely(priceTen * (numValueOf3.intValue() * 0.01f)));
            String str5 = String.format(string, Arrays.copyOf(new Object[]{numValueOf4}, 1));
            Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
            num2 = numValueOf4;
            str3 = str5;
        } else {
            num2 = null;
        }
        float f2 = (isSale || caseValue >= 10) ? 1.0f : 0.5f;
        if (isSale && caseValue < 10) {
            if (!AnyExtensionKt.isNotNull(numValueOf3) || !AnyExtensionKt.isNotNull(str3)) {
                i3 = (AnyExtensionKt.isNull(numValueOf3) && AnyExtensionKt.isNull(str3)) ? 1 : 0;
            }
        }
        return new CasePricesModel(str2, str4, priceOne, priceTen, numValueOf, numValueOf3, str, str3, num, num2, f, f2, i, i3);
    }

    public final List<Case> updateCasesValue(List<Case> oldCaseList, List<CaseWithStatusModel> newCaseCountList) {
        Object next;
        int i;
        boolean zIsOne;
        int i2;
        List<Case> list = oldCaseList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Case r3 : list) {
            Iterator<T> it = newCaseCountList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((CaseWithStatusModel) next).getIdCase() == r3.getId()) {
                    break;
                }
            }
            CaseWithStatusModel caseWithStatusModel = (CaseWithStatusModel) next;
            int i3 = 0;
            if (caseWithStatusModel != null) {
                int valueOfCases = caseWithStatusModel.getValueOfCases();
                zIsOne = IntExtensionKt.isOne(Integer.valueOf(caseWithStatusModel.isUsedSale()));
                i = valueOfCases;
            } else {
                i = 0;
                zIsOne = false;
            }
            boolean z = IntExtensionKt.isNotZero(Integer.valueOf(IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(r3.getDiscount(), 0)))) || IntExtensionKt.isNotZero(Integer.valueOf(IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(r3.getDiscount(), 1))));
            if (((IntExtensionKt.isZero(Integer.valueOf(r3.getDiscountType())) && z && !zIsOne) || (IntExtensionKt.isOne(Integer.valueOf(r3.getDiscountType())) && z)) && AnyExtensionKt.isNotNull(r3.getDates())) {
                i3 = 3;
            } else if (AnyExtensionKt.isNotNull(r3.getDates())) {
                i3 = 2;
            } else {
                if ((IntExtensionKt.isZero(Integer.valueOf(r3.getDiscountType())) && !zIsOne && z) || (IntExtensionKt.isOne(Integer.valueOf(r3.getDiscountType())) && z)) {
                    i2 = 1;
                }
                arrayList.add(r3.copy((65519 & 1) != 0 ? r3.id : 0, (65519 & 2) != 0 ? r3.name : null, (65519 & 4) != 0 ? r3.imageBitmap : null, (65519 & 8) != 0 ? r3.bgImageBitmap : null, (65519 & 16) != 0 ? r3.count : i, (65519 & 32) != 0 ? r3.isUsedSale : zIsOne, (65519 & 64) != 0 ? r3.type : i2, (65519 & 128) != 0 ? r3.dates : null, (65519 & 256) != 0 ? r3.price : null, (65519 & 512) != 0 ? r3.discount : null, (65519 & 1024) != 0 ? r3.discountType : 0, (65519 & 2048) != 0 ? r3.isSale : false, (65519 & 4096) != 0 ? r3.caseRewardList : null, (65519 & 8192) != 0 ? r3.scrolledReward : null, (65519 & 16384) != 0 ? r3.scrolledPosition : 0, (65519 & 32768) != 0 ? r3.caseBonusList : null));
            }
            i2 = i3;
            arrayList.add(r3.copy((65519 & 1) != 0 ? r3.id : 0, (65519 & 2) != 0 ? r3.name : null, (65519 & 4) != 0 ? r3.imageBitmap : null, (65519 & 8) != 0 ? r3.bgImageBitmap : null, (65519 & 16) != 0 ? r3.count : i, (65519 & 32) != 0 ? r3.isUsedSale : zIsOne, (65519 & 64) != 0 ? r3.type : i2, (65519 & 128) != 0 ? r3.dates : null, (65519 & 256) != 0 ? r3.price : null, (65519 & 512) != 0 ? r3.discount : null, (65519 & 1024) != 0 ? r3.discountType : 0, (65519 & 2048) != 0 ? r3.isSale : false, (65519 & 4096) != 0 ? r3.caseRewardList : null, (65519 & 8192) != 0 ? r3.scrolledReward : null, (65519 & 16384) != 0 ? r3.scrolledPosition : 0, (65519 & 32768) != 0 ? r3.caseBonusList : null));
        }
        return arrayList;
    }

    public final List<CaseBonus> updateBonusStatus(List<CaseBonus> oldBonusList, List<BonusRewardWithStatus> newBonusStatusList) {
        Integer numValueOf;
        Object next;
        List<CaseBonus> list = oldBonusList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (CaseBonus caseBonus : list) {
            Iterator<T> it = newBonusStatusList.iterator();
            while (true) {
                numValueOf = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((BonusRewardWithStatus) next).getIdReward() == caseBonus.getId()) {
                    break;
                }
            }
            BonusRewardWithStatus bonusRewardWithStatus = (BonusRewardWithStatus) next;
            if (bonusRewardWithStatus != null) {
                numValueOf = Integer.valueOf(bonusRewardWithStatus.getStateReward());
            }
            arrayList.add(caseBonus.copy((4079 & 1) != 0 ? caseBonus.id : 0, (4079 & 2) != 0 ? caseBonus.typeCasesBonusDto : 0, (4079 & 4) != 0 ? caseBonus.name : null, (4079 & 8) != 0 ? caseBonus.imageBitmap : null, (4079 & 16) != 0 ? caseBonus.state : IntExtensionKt.getOrZero(numValueOf), (4079 & 32) != 0 ? caseBonus.openingsCountRequired : 0, (4079 & 64) != 0 ? caseBonus.rarity : null, (4079 & 128) != 0 ? caseBonus.count : 0, (4079 & 256) != 0 ? caseBonus.isRender : false, (4079 & 512) != 0 ? caseBonus.renderAttachment : null, (4079 & 1024) != 0 ? caseBonus.imageName : null, (4079 & 2048) != 0 ? caseBonus.internalId : 0));
        }
        return arrayList;
    }

    public final List<CaseReward> getOpeningRewards(List<CaseReward> allRewardsList, List<Integer> arrayRewardIdList) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = arrayRewardIdList.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            Iterator<T> it2 = allRewardsList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((CaseReward) next).getRewardId() == iIntValue) {
                    break;
                }
            }
            CaseReward caseReward = (CaseReward) next;
            if (caseReward != null) {
                arrayList.add(caseReward);
            }
        }
        return arrayList;
    }

    public final boolean findSprayRewards(List<CaseReward> allRewards) {
        Object next;
        Iterator<T> it = allRewards.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CaseReward) next).getSprayed()) {
                break;
            }
        }
        return AnyExtensionKt.isNotNull(next);
    }

    public final CaseSprayedInfoAttachment findNotSprayedRewards(List<CaseReward> allRewardsList) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (CaseReward caseReward : allRewardsList) {
            if (caseReward.isSprayedReward()) {
                arrayList2.add(Integer.valueOf(caseReward.getRewardId()));
            } else {
                arrayList.add(Integer.valueOf(caseReward.getRewardId()));
            }
        }
        return new CaseSprayedInfoAttachment(arrayList, arrayList2);
    }

    public final CasesBannerSelectedCase getSelectedCaseForBanner(int caseId, CasesResponse caseResponse, List<BpRewardsAwardsDto> awards, List<InvItems> inventoryList) {
        Object next;
        boolean zAdd;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strEmpty = AnyExtensionKt.empty(stringCompanionObject);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        String strEmpty2 = AnyExtensionKt.empty(stringCompanionObject);
        Iterator<T> it = caseResponse.getCases().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CasesCaseTypeDto) next).getId() == caseId) {
                break;
            }
        }
        CasesCaseTypeDto casesCaseTypeDto = (CasesCaseTypeDto) next;
        if (casesCaseTypeDto != null) {
            strEmpty = casesCaseTypeDto.getName();
            strEmpty2 = casesCaseTypeDto.getImage();
            List<CasesAwardDto> awards2 = casesCaseTypeDto.getAwards();
            ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(awards2, 10));
            for (CasesAwardDto casesAwardDto : awards2) {
                int i = WhenMappings.$EnumSwitchMapping$0[casesAwardDto.getRarityFromEnum().ordinal()];
                if (i == 1) {
                    zAdd = arrayList5.add(toCaseReward(casesAwardDto, awards, inventoryList));
                } else if (i == 2) {
                    zAdd = arrayList4.add(toCaseReward(casesAwardDto, awards, inventoryList));
                } else if (i == 3) {
                    zAdd = arrayList3.add(toCaseReward(casesAwardDto, awards, inventoryList));
                } else if (i == 4) {
                    zAdd = arrayList2.add(toCaseReward(casesAwardDto, awards, inventoryList));
                } else {
                    zAdd = arrayList.add(toCaseReward(casesAwardDto, awards, inventoryList));
                }
                arrayList6.add(Boolean.valueOf(zAdd));
            }
        }
        String str = strEmpty2;
        String str2 = strEmpty;
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList5);
        arrayList7.addAll(arrayList4);
        arrayList7.addAll(arrayList3);
        arrayList7.addAll(arrayList2);
        arrayList7.addAll(arrayList);
        ArrayList arrayList8 = new ArrayList();
        for (int i2 = 0; i2 < 6; i2++) {
            CaseReward caseReward = (CaseReward) CollectionsKt___CollectionsKt.getOrNull(arrayList7, i2);
            if (caseReward != null) {
                arrayList8.add(caseReward);
            }
        }
        return new CasesBannerSelectedCase(arrayList8, str, null, str2, 4, null);
    }

    public final CasesSortedListWithScrolledPos sortingRewards(List<CaseReward> allRewards) {
        CaseReward caseReward;
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(allRewards, new Comparator() { // from class: com.blackhub.bronline.game.gui.cases.CasesViewModel$sortingRewards$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(((CaseReward) t).getRarity(), ((CaseReward) t2).getRarity());
            }
        });
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSortedWith) {
            if (((CaseReward) obj).getRarity() == CommonRarityEnum.LEGENDARY) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listSortedWith) {
            if (((CaseReward) obj2).getRarity() == CommonRarityEnum.EPIC) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listSortedWith) {
            if (((CaseReward) obj3).getRarity() == CommonRarityEnum.RARE) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : listSortedWith) {
            if (((CaseReward) obj4).getRarity() == CommonRarityEnum.UNCOMMON) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : listSortedWith) {
            if (((CaseReward) obj5).getRarity() == CommonRarityEnum.COMMON) {
                arrayList5.add(obj5);
            }
        }
        int size = arrayList5.size() / 2;
        int size2 = arrayList4.size() / 2;
        int size3 = arrayList3.size() / 2;
        int size4 = arrayList2.size() / 2;
        if (!arrayList.isEmpty()) {
            caseReward = (CaseReward) CollectionsKt___CollectionsKt.getOrNull(arrayList, arrayList.size() / 2);
            if (caseReward == null) {
                caseReward = new CaseReward(0, 0, null, null, null, null, 0, null, null, false, false, false, 0, false, null, null, 0, 131071, null);
            }
        } else if (!arrayList2.isEmpty()) {
            caseReward = (CaseReward) CollectionsKt___CollectionsKt.getOrNull(arrayList2, size4);
            if (caseReward == null) {
                caseReward = new CaseReward(0, 0, null, null, null, null, 0, null, null, false, false, false, 0, false, null, null, 0, 131071, null);
            }
        } else if (!arrayList3.isEmpty()) {
            caseReward = (CaseReward) CollectionsKt___CollectionsKt.getOrNull(arrayList3, size3);
            if (caseReward == null) {
                caseReward = new CaseReward(0, 0, null, null, null, null, 0, null, null, false, false, false, 0, false, null, null, 0, 131071, null);
            }
        } else if (!arrayList4.isEmpty()) {
            caseReward = (CaseReward) CollectionsKt___CollectionsKt.getOrNull(arrayList4, size2);
            if (caseReward == null) {
                caseReward = new CaseReward(0, 0, null, null, null, null, 0, null, null, false, false, false, 0, false, null, null, 0, 131071, null);
            }
        } else if (!arrayList5.isEmpty()) {
            caseReward = (CaseReward) CollectionsKt___CollectionsKt.getOrNull(arrayList5, size);
            if (caseReward == null) {
                caseReward = new CaseReward(0, 0, null, null, null, null, 0, null, null, false, false, false, 0, false, null, null, 0, 131071, null);
            }
        } else {
            caseReward = new CaseReward(0, 0, null, null, null, null, 0, null, null, false, false, false, 0, false, null, null, 0, 131071, null);
        }
        ArrayList arrayList6 = new ArrayList();
        arrayList6.addAll(CollectionsKt___CollectionsKt.take(arrayList5, size));
        arrayList6.addAll(CollectionsKt___CollectionsKt.take(arrayList4, size2));
        arrayList6.addAll(CollectionsKt___CollectionsKt.take(arrayList3, size3));
        arrayList6.addAll(CollectionsKt___CollectionsKt.take(arrayList2, size4));
        arrayList6.addAll(arrayList);
        arrayList6.addAll(CollectionsKt___CollectionsKt.drop(arrayList2, size4));
        arrayList6.addAll(CollectionsKt___CollectionsKt.drop(arrayList3, size3));
        arrayList6.addAll(CollectionsKt___CollectionsKt.drop(arrayList4, size2));
        arrayList6.addAll(CollectionsKt___CollectionsKt.drop(arrayList5, size));
        return new CasesSortedListWithScrolledPos(arrayList6, caseReward);
    }

    public final boolean ifTimeHasPassed(long unixTimeStamp) {
        return unixTimeStamp != 0 && unixTimeStamp < System.currentTimeMillis() / 1000;
    }
}

