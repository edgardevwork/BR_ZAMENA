package com.blackhub.bronline.game.gui.rating;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.CommonEventTopListModel;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.playerslist.utils.PlayersListUtilsKt;
import com.blackhub.bronline.game.gui.rating.model.RatingPlayerWithCountModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
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
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RatingViewModel.kt */
@StabilityInferred(parameters = 0)

public final class RatingViewModel extends BaseViewModel<RatingUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<RatingUiState> _uiState;

    @NotNull
    public final RatingActionWithJson actionWithJson;

    @NotNull
    public final Application application;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<RatingUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public RatingViewModel(@NotNull RatingActionWithJson actionWithJson, @NotNull StringResource stringResource, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(application, "application");
        this.actionWithJson = actionWithJson;
        this.stringResource = stringResource;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new RatingUiState(null, null, null, null, null, null, false, 127, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
        ViewModelExtensionKt.launchOnIO$default(this, null, new C44081(null), 1, null);
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<RatingUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<RatingUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: RatingViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.rating.RatingViewModel$1", m7120f = "RatingViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nRatingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RatingViewModel.kt\ncom/blackhub/bronline/game/gui/rating/RatingViewModel$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,133:1\n230#2,5:134\n*S KotlinDebug\n*F\n+ 1 RatingViewModel.kt\ncom/blackhub/bronline/game/gui/rating/RatingViewModel$1\n*L\n53#1:134,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.rating.RatingViewModel$1 */
    /* loaded from: classes7.dex */
    public static final class C44081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C44081(Continuation<? super C44081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RatingViewModel.this.new C44081(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            RatingUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Bitmap bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(RatingViewModel.this.application, RatingConstants.COLLABORATION_AUTUMN_BG_IMAGE_NAME, ImageTypePathInCDNEnum.BACKGROUND, 0.0f, 0.0f, 24, null);
            MutableStateFlow<RatingUiState> mutableStateFlow = RatingViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, RatingUiState.copy$default(value, null, null, null, bitmapFromZip$default, null, null, false, 119, null)));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: RatingViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.rating.RatingViewModel$initInterface$1", m7120f = "RatingViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nRatingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RatingViewModel.kt\ncom/blackhub/bronline/game/gui/rating/RatingViewModel$initInterface$1\n+ 2 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 3 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,133:1\n51#2,5:134\n56#2,11:148\n8#3,9:139\n1559#4:159\n1590#4,4:160\n230#5,5:164\n*S KotlinDebug\n*F\n+ 1 RatingViewModel.kt\ncom/blackhub/bronline/game/gui/rating/RatingViewModel$initInterface$1\n*L\n70#1:134,5\n70#1:148,11\n70#1:139,9\n78#1:159\n78#1:160,4\n95#1:164,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.rating.RatingViewModel$initInterface$1 */
    /* loaded from: classes7.dex */
    public static final class C44091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ RatingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44091(JSONObject jSONObject, RatingViewModel ratingViewModel, Continuation<? super C44091> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = ratingViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C44091(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            List arrayList;
            Object objFromJson;
            JSONArray jSONArray;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String strOptString = this.$json.optString("r");
            String strOptString2 = this.$json.optString("t");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
            AnnotatedString annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(strOptString2);
            String strOptString3 = this.$json.optString("n");
            int iOptInt = this.$json.optInt("p");
            JSONArray jSONArrayOptJSONArray = this.$json.optJSONArray("pr");
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
                            objFromJson = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) string).toString(), (Class<Object>) RatingPlayerWithCountModel.class);
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
                arrayList = null;
            }
            if (arrayList == null) {
                arrayList = CollectionsKt__CollectionsKt.emptyList();
            }
            RatingViewModel ratingViewModel = this.this$0;
            Intrinsics.checkNotNull(strOptString);
            Intrinsics.checkNotNull(strOptString3);
            CommonEventTopListModel topListModel$default = RatingViewModel.getTopListModel$default(ratingViewModel, strOptString, strOptString3, UsefulKt.getPriceWithSpaces(Boxing.boxInt(iOptInt)), AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, 16, null);
            List list = arrayList;
            RatingViewModel ratingViewModel2 = this.this$0;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            int i2 = 0;
            for (Object obj2 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                RatingPlayerWithCountModel ratingPlayerWithCountModel = (RatingPlayerWithCountModel) obj2;
                arrayList2.add(ratingViewModel2.getTopListModel(String.valueOf(i3), ratingPlayerWithCountModel.getNick(), UsefulKt.getPriceWithSpaces(Boxing.boxInt(ratingPlayerWithCountModel.getCounter())), ratingPlayerWithCountModel.getReward(), String.valueOf(ratingPlayerWithCountModel.getPlayerServer())));
                i2 = i3;
            }
            JSONArray jSONArrayOptJSONArray2 = this.$json.optJSONArray("tl");
            List<String> mutableStringList = jSONArrayOptJSONArray2 != null ? JsonArrayExtensionKt.toMutableStringList(jSONArrayOptJSONArray2) : null;
            if (mutableStringList == null) {
                mutableStringList = CollectionsKt__CollectionsKt.emptyList();
            }
            JSONArray jSONArrayOptJSONArray3 = this.$json.optJSONArray("pr");
            ArrayList arrayList3 = new ArrayList();
            int orZero = IntExtensionKt.getOrZero(jSONArrayOptJSONArray3 != null ? Boxing.boxInt(jSONArrayOptJSONArray3.length()) : null);
            for (int i4 = 0; i4 < orZero; i4++) {
                List<AnnotatedString> mutableAnnotatedStringList = (jSONArrayOptJSONArray3 == null || (jSONArray = jSONArrayOptJSONArray3.getJSONArray(i4)) == null) ? null : JsonArrayExtensionKt.toMutableAnnotatedStringList(jSONArray);
                if (mutableAnnotatedStringList == null) {
                    mutableAnnotatedStringList = CollectionsKt__CollectionsKt.emptyList();
                }
                arrayList3.add(mutableAnnotatedStringList);
            }
            MutableStateFlow<RatingUiState> mutableStateFlow = this.this$0.get_uiState();
            while (true) {
                RatingUiState value = mutableStateFlow.getValue();
                ArrayList arrayList4 = arrayList3;
                if (mutableStateFlow.compareAndSet(value, RatingUiState.copy$default(value, topListModel$default, annotatedStringHtmlTextToAnnotatedString, arrayList2, null, mutableStringList, arrayList3, false, 72, null))) {
                    return Unit.INSTANCE;
                }
                arrayList3 = arrayList4;
            }
        }
    }

    public final void initInterface(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C44091(json, this, null), 1, null);
    }

    /* compiled from: RatingViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.rating.RatingViewModel$onCloseClick$1", m7120f = "RatingViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nRatingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RatingViewModel.kt\ncom/blackhub/bronline/game/gui/rating/RatingViewModel$onCloseClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,133:1\n230#2,5:134\n*S KotlinDebug\n*F\n+ 1 RatingViewModel.kt\ncom/blackhub/bronline/game/gui/rating/RatingViewModel$onCloseClick$1\n*L\n110#1:134,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.rating.RatingViewModel$onCloseClick$1 */
    /* loaded from: classes3.dex */
    public static final class C44101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C44101(Continuation<? super C44101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RatingViewModel.this.new C44101(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            RatingUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                RatingViewModel.this.actionWithJson.sendCloseInterface();
                MutableStateFlow<RatingUiState> mutableStateFlow = RatingViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, RatingUiState.copy$default(value, null, null, null, null, null, null, true, 63, null)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onCloseClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C44101(null), 1, null);
    }

    public static /* synthetic */ CommonEventTopListModel getTopListModel$default(RatingViewModel ratingViewModel, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 16) != 0) {
            str5 = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        }
        return ratingViewModel.getTopListModel(str, str2, str3, str4, str5);
    }

    public final CommonEventTopListModel getTopListModel(String posInRating, String nick, String points, String reward, String playerServer) {
        return new CommonEventTopListModel(posInRating, nick, points, reward, playerServer);
    }
}

