package com.blackhub.bronline.game.gui.cases;

import androidx.compose.p003ui.text.AnnotatedString;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.gui.cases.model.BonusRewardWithStatus;
import com.blackhub.bronline.game.gui.cases.model.Case;
import com.blackhub.bronline.game.gui.cases.model.CaseBonus;
import com.blackhub.bronline.game.gui.cases.model.CasePricesModel;
import com.blackhub.bronline.game.gui.cases.model.CaseWithStatusModel;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.cases.CasesResponse;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CasesViewModel.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.cases.CasesViewModel$initInterface$1$deferredTasks$2", m7120f = "CasesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
@SourceDebugExtension({"SMAP\nCasesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$initInterface$1$deferredTasks$2\n+ 2 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 3 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n*L\n1#1,1945:1\n51#2,5:1946\n56#2,11:1960\n51#2,5:1971\n56#2,11:1985\n8#3,9:1951\n8#3,9:1976\n*S KotlinDebug\n*F\n+ 1 CasesViewModel.kt\ncom/blackhub/bronline/game/gui/cases/CasesViewModel$initInterface$1$deferredTasks$2\n*L\n300#1:1946,5\n300#1:1960,11\n305#1:1971,5\n305#1:1985,11\n300#1:1951,9\n305#1:1976,9\n*E\n"})
/* loaded from: classes.dex */
public final class CasesViewModel$initInterface$1$deferredTasks$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Ref.ObjectRef<List<BonusRewardWithStatus>> $arrayBonusRewardsWithStatus;
    public final /* synthetic */ Ref.ObjectRef<List<CaseWithStatusModel>> $arrayCasesWithStatus;
    public final /* synthetic */ List<BpRewardsAwardsDto> $awards;
    public final /* synthetic */ Ref.ObjectRef<AnnotatedString> $bcAmountString;
    public final /* synthetic */ Ref.ObjectRef<CasePricesModel> $casePrices;
    public final /* synthetic */ Ref.ObjectRef<CasePricesModel> $casePricesForGuide;
    public final /* synthetic */ Ref.ObjectRef<List<Case>> $casesList;
    public final /* synthetic */ CasesResponse $casesResponse;
    public final /* synthetic */ Ref.IntRef $dailyCaseId;
    public final /* synthetic */ Ref.ObjectRef<List<Float>> $dpProgress;
    public final /* synthetic */ List<InvItems> $inventoryList;
    public final /* synthetic */ Ref.BooleanRef $isShowingTutorial;
    public final /* synthetic */ JSONObject $json;
    public final /* synthetic */ Ref.IntRef $legendaryCaseId;
    public final /* synthetic */ Ref.ObjectRef<List<CaseBonus>> $selectedBonuses;
    public final /* synthetic */ Ref.ObjectRef<Case> $selectedCase;
    public final /* synthetic */ Ref.IntRef $selectedCaseId;
    public final /* synthetic */ Ref.IntRef $selectedCasePos;
    public final /* synthetic */ Ref.IntRef $selectedIndex;
    public final /* synthetic */ Ref.IntRef $valueOfBc;
    public final /* synthetic */ Ref.IntRef $valueOfCurrentDust;
    public final /* synthetic */ Ref.IntRef $valueOfMaxDust;
    public final /* synthetic */ Ref.IntRef $valueOfOpenedCases;
    public int label;
    public final /* synthetic */ CasesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CasesViewModel$initInterface$1$deferredTasks$2(Ref.IntRef intRef, CasesResponse casesResponse, Ref.IntRef intRef2, Ref.IntRef intRef3, Ref.IntRef intRef4, JSONObject jSONObject, Ref.ObjectRef<AnnotatedString> objectRef, CasesViewModel casesViewModel, Ref.IntRef intRef5, Ref.BooleanRef booleanRef, Ref.IntRef intRef6, Ref.IntRef intRef7, Ref.ObjectRef<List<CaseWithStatusModel>> objectRef2, Ref.ObjectRef<List<BonusRewardWithStatus>> objectRef3, Ref.ObjectRef<List<Case>> objectRef4, List<BpRewardsAwardsDto> list, List<InvItems> list2, Ref.ObjectRef<Case> objectRef5, Ref.IntRef intRef8, Ref.IntRef intRef9, Ref.ObjectRef<List<CaseBonus>> objectRef6, Ref.ObjectRef<CasePricesModel> objectRef7, Ref.ObjectRef<CasePricesModel> objectRef8, Ref.ObjectRef<List<Float>> objectRef9, Continuation<? super CasesViewModel$initInterface$1$deferredTasks$2> continuation) {
        super(2, continuation);
        this.$valueOfMaxDust = intRef;
        this.$casesResponse = casesResponse;
        this.$legendaryCaseId = intRef2;
        this.$dailyCaseId = intRef3;
        this.$valueOfBc = intRef4;
        this.$json = jSONObject;
        this.$bcAmountString = objectRef;
        this.this$0 = casesViewModel;
        this.$valueOfCurrentDust = intRef5;
        this.$isShowingTutorial = booleanRef;
        this.$valueOfOpenedCases = intRef6;
        this.$selectedCaseId = intRef7;
        this.$arrayCasesWithStatus = objectRef2;
        this.$arrayBonusRewardsWithStatus = objectRef3;
        this.$casesList = objectRef4;
        this.$awards = list;
        this.$inventoryList = list2;
        this.$selectedCase = objectRef5;
        this.$selectedIndex = intRef8;
        this.$selectedCasePos = intRef9;
        this.$selectedBonuses = objectRef6;
        this.$casePrices = objectRef7;
        this.$casePricesForGuide = objectRef8;
        this.$dpProgress = objectRef9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CasesViewModel$initInterface$1$deferredTasks$2(this.$valueOfMaxDust, this.$casesResponse, this.$legendaryCaseId, this.$dailyCaseId, this.$valueOfBc, this.$json, this.$bcAmountString, this.this$0, this.$valueOfCurrentDust, this.$isShowingTutorial, this.$valueOfOpenedCases, this.$selectedCaseId, this.$arrayCasesWithStatus, this.$arrayBonusRewardsWithStatus, this.$casesList, this.$awards, this.$inventoryList, this.$selectedCase, this.$selectedIndex, this.$selectedCasePos, this.$selectedBonuses, this.$casePrices, this.$casePricesForGuide, this.$dpProgress, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CasesViewModel$initInterface$1$deferredTasks$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, androidx.compose.ui.text.AnnotatedString] */
    /* JADX WARN: Type inference failed for: r0v32, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v34, types: [T, com.blackhub.bronline.game.gui.cases.model.Case] */
    /* JADX WARN: Type inference failed for: r0v43, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v78, types: [T, com.blackhub.bronline.game.gui.cases.model.CasePricesModel] */
    /* JADX WARN: Type inference failed for: r0v80, types: [T, com.blackhub.bronline.game.gui.cases.model.CasePricesModel] */
    /* JADX WARN: Type inference failed for: r0v82, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [T] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [T] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        ?? arrayList;
        Object objFromJson;
        Object objFromJson2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$valueOfMaxDust.element = this.$casesResponse.getCasesSettings().getMaxSprayedCount();
        this.$legendaryCaseId.element = this.$casesResponse.getCasesSettings().getLegendaryCaseId();
        this.$dailyCaseId.element = this.$casesResponse.getCasesSettings().getDailyCaseId();
        this.$valueOfBc.element = this.$json.optInt("bc");
        this.$bcAmountString.element = this.this$0.getBCAmountString(this.$valueOfBc.element);
        this.$valueOfCurrentDust.element = this.$json.optInt("pc");
        this.$isShowingTutorial.element = IntExtensionKt.isOne(Boxing.boxInt(this.$json.optInt("i")));
        this.$valueOfOpenedCases.element = this.$json.optInt("bcc");
        this.$selectedCaseId.element = this.$json.optInt("cs");
        Ref.ObjectRef<List<CaseWithStatusModel>> objectRef = this.$arrayCasesWithStatus;
        JSONArray jSONArrayOptJSONArray = this.$json.optJSONArray("cc");
        ?? EmptyList = 0;
        EmptyList = 0;
        if (jSONArrayOptJSONArray != null) {
            try {
                arrayList = new ArrayList();
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                    Intrinsics.checkNotNull(jSONObject);
                    try {
                        Gson gson = new Gson();
                        String string = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        objFromJson = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) string).toString(), (Class<Object>) CaseWithStatusModel.class);
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
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = CollectionsKt__CollectionsKt.emptyList();
        }
        objectRef.element = arrayList;
        Ref.ObjectRef<List<BonusRewardWithStatus>> objectRef2 = this.$arrayBonusRewardsWithStatus;
        JSONArray jSONArrayOptJSONArray2 = this.$json.optJSONArray(CasesKeys.ARRAY_BONUS_REWARDS_KEY);
        if (jSONArrayOptJSONArray2 != null) {
            try {
                ArrayList arrayList2 = new ArrayList();
                int length2 = jSONArrayOptJSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i2);
                    Intrinsics.checkNotNull(jSONObject2);
                    try {
                        Gson gson2 = new Gson();
                        String string2 = jSONObject2.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        objFromJson2 = gson2.fromJson(StringsKt__StringsKt.trim((CharSequence) string2).toString(), (Class<Object>) BonusRewardWithStatus.class);
                    } catch (Exception e3) {
                        FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                        firebaseCrashlytics3.log(e3.toString());
                        firebaseCrashlytics3.recordException(e3);
                        objFromJson2 = null;
                    }
                    if (objFromJson2 != null) {
                        Boxing.boxBoolean(arrayList2.add(objFromJson2));
                    }
                }
                EmptyList = arrayList2;
            } catch (Exception e4) {
                FirebaseCrashlytics firebaseCrashlytics4 = FirebaseCrashlytics.getInstance();
                firebaseCrashlytics4.log(e4.toString());
                firebaseCrashlytics4.recordException(e4);
            }
        }
        if (EmptyList == 0) {
            EmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        objectRef2.element = EmptyList;
        this.$casesList.element = this.this$0.mapArrayToCaseList(this.$arrayCasesWithStatus.element, this.$casesResponse, this.$awards, this.$inventoryList);
        this.$selectedCase.element = this.this$0.findSelectedCase(this.$selectedCaseId.element, this.$casesList.element);
        this.$selectedIndex.element = this.$casesList.element.indexOf(this.$selectedCase.element);
        Ref.IntRef intRef = this.$selectedCasePos;
        int i3 = this.$selectedIndex.element;
        if (i3 < 0) {
            i3 = 0;
        }
        intRef.element = i3;
        this.$selectedBonuses.element = this.this$0.updateBonusStatus(this.$selectedCase.element.getCaseBonusList(), this.$arrayBonusRewardsWithStatus.element);
        this.$casePrices.element = this.this$0.initCasePricesModel(IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(this.$selectedCase.element.getPrice(), 0)), IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(this.$selectedCase.element.getDiscount(), 0)), IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(this.$selectedCase.element.getPrice(), 1)), IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(this.$selectedCase.element.getDiscount(), 1)), this.$selectedCase.element.getCount(), this.$selectedCase.element.isUsedSale() && IntExtensionKt.isZero(Boxing.boxInt(this.$selectedCase.element.getDiscountType())), this.$selectedCase.element.isSale());
        this.$casePricesForGuide.element = this.this$0.initCasePricesModel(100, 10, 1000, 10, 10, false, true);
        this.$dpProgress.element = this.this$0.getProgressBarValues(this.$selectedBonuses.element, this.$valueOfOpenedCases.element);
        return Unit.INSTANCE;
    }
}
