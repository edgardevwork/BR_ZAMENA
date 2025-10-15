package com.blackhub.bronline.game.gui.upgradeobjectevent;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.C2732C;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.constants.resources.PngConstantsId68;
import com.blackhub.bronline.game.core.constants.resources.SvgConstantsId68;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.CommonEventTopListModel;
import com.blackhub.bronline.game.gui.upgradeobjectevent.model.GiftPrizeModel;
import com.blackhub.bronline.game.gui.upgradeobjectevent.model.UpgradeObjectEventTopListItemModel;
import com.blackhub.bronline.game.gui.upgradeobjectevent.model.UpgradeObjectEventTopListOfServersItem;
import com.blackhub.bronline.game.gui.upgradeobjectevent.model.UpgradeObjectEventTopServersItemModel;
import com.blackhub.bronline.game.model.remote.response.upgradeobjectevent.AwardsLevelDto;
import com.blackhub.bronline.game.model.remote.response.upgradeobjectevent.AwardsTopDto;
import com.blackhub.bronline.game.model.remote.response.upgradeobjectevent.UpgradeObjectAwardsResponse;
import com.blackhub.bronline.game.repository.UpgradeObjectRepository;
import com.blackhub.bronline.launcher.network.Server;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Response;

/* compiled from: UpgradeObjectEventViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0007\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001DB/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002J\u001e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020#2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u001eH\u0002J\u0010\u0010*\u001a\u0004\u0018\u00010!H\u0082@¢\u0006\u0002\u0010+J\u001c\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u001eJ\u000e\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u000201J\u000e\u00102\u001a\u00020\u001b2\u0006\u00100\u001a\u000201J\u000e\u00103\u001a\u00020\u001b2\u0006\u00100\u001a\u000201J\u0010\u00104\u001a\u00020\u001b2\b\b\u0001\u00105\u001a\u00020#J\u0006\u00106\u001a\u00020\u001bJ.\u00107\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u00108\u001a\u0002012\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u001eH\u0082@¢\u0006\u0002\u00109J\u0006\u0010:\u001a\u00020\u001bJ\u0006\u0010;\u001a\u00020\u001bJ\u0010\u0010<\u001a\u00020\u001b2\b\b\u0001\u0010=\u001a\u00020#J\u0010\u0010>\u001a\u00020\u001b2\b\b\u0001\u0010?\u001a\u00020#J\u000e\u0010@\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020&J\u0006\u0010B\u001a\u00020\u001bJ\u000e\u0010C\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006E"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventActionWithJSON;", "upgradeObjectRepository", "Lcom/blackhub/bronline/game/repository/UpgradeObjectRepository;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "application", "Landroid/app/Application;", "(Lcom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventActionWithJSON;Lcom/blackhub/bronline/game/repository/UpgradeObjectRepository;Lcom/blackhub/bronline/game/core/resources/StringResource;Lcom/blackhub/bronline/game/common/LocalNotification;Landroid/app/Application;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "getStringResource", "()Lcom/blackhub/bronline/game/core/resources/StringResource;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "closeInfoScreen", "", "closeTopListOpen", "getAwardsLevelList", "", "Lcom/blackhub/bronline/game/gui/upgradeobjectevent/model/GiftPrizeModel;", "awardsResponse", "Lcom/blackhub/bronline/game/model/remote/response/upgradeobjectevent/UpgradeObjectAwardsResponse;", "upgradeObjectLevel", "", "currentCurrency", "getServerName", "", "serverId", "servers", "Lcom/blackhub/bronline/launcher/network/Server;", "getUpgradeObjectAwardsResponse", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initJson", "json", "Lorg/json/JSONObject;", "isEnergyInfoOpen", "isOpen", "", "isGiftQuestionOpen", "isLevelUpgradeObjectOpen", "onBuyUpgradeClick", "positionUpgrade", "openInfoScreen", "parseJson", "isUpdating", "(Lorg/json/JSONObject;ZLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendCloseScreen", "sendGiftOpen", "sendOpenTypeUpgradeObject", "typeUpgradeObject", "sendTopListOpen", "typeTopList", "showErrorMessage", ThrowableDeserializer.PROP_NAME_MESSAGE, "turnBlockingLoading", "updateJson", "Companion", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUpgradeObjectEventViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpgradeObjectEventViewModel.kt\ncom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 4 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,706:1\n230#2,5:707\n230#2,5:712\n230#2,5:717\n230#2,5:722\n230#2,5:727\n230#2,5:732\n230#2,5:737\n230#2,5:742\n230#2,5:747\n230#2,5:752\n230#2,5:757\n230#2,5:762\n230#2,5:798\n230#2,5:803\n230#2,5:808\n230#2,5:813\n230#2,5:818\n230#2,5:823\n230#2,5:828\n230#2,5:867\n51#3,5:767\n56#3,11:781\n51#3,5:833\n56#3,11:847\n8#4,9:772\n8#4,9:838\n1559#5:792\n1590#5,4:793\n1559#5:858\n1590#5,4:859\n288#5,2:863\n288#5,2:865\n1559#5:872\n1590#5,4:873\n1#6:797\n*S KotlinDebug\n*F\n+ 1 UpgradeObjectEventViewModel.kt\ncom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventViewModel\n*L\n128#1:707,5\n134#1:712,5\n143#1:717,5\n158#1:722,5\n170#1:727,5\n179#1:732,5\n185#1:737,5\n191#1:742,5\n210#1:747,5\n239#1:752,5\n254#1:757,5\n315#1:762,5\n421#1:798,5\n446#1:803,5\n479#1:808,5\n500#1:813,5\n516#1:818,5\n532#1:823,5\n549#1:828,5\n597#1:867,5\n349#1:767,5\n349#1:781,11\n570#1:833,5\n570#1:847,11\n349#1:772,9\n570#1:838,9\n355#1:792\n355#1:793,4\n573#1:858\n573#1:859,4\n590#1:863,2\n593#1:865,2\n642#1:872\n642#1:873,4\n*E\n"})
/* loaded from: classes.dex */
public final class UpgradeObjectEventViewModel extends BaseViewModel<UpgradeObjectEventUiState> {
    public static final double COEFFICIENT = 1.05d;
    public static final float COEFFICIENT_DAU = 0.5f;
    public static final int COUNT_UPGRADE = 3;
    public static final float HALF_PERCENT = 0.5f;
    public static final int MATH_CONSTANT = 10;
    public static final float ONE_HUNDRED_FLOAT = 100.0f;
    public static final int ONE_HUNDRED_INT = 100;
    public static final int START_EXP = 500;

    @NotNull
    public final MutableStateFlow<UpgradeObjectEventUiState> _uiState;

    @NotNull
    public final UpgradeObjectEventActionWithJSON actionWithJSON;

    @NotNull
    public final Application application;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<UpgradeObjectEventUiState> uiState;

    @NotNull
    public final UpgradeObjectRepository upgradeObjectRepository;
    public static final int $stable = 8;

    /* compiled from: UpgradeObjectEventViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel", m7120f = "UpgradeObjectEventViewModel.kt", m7121i = {}, m7122l = {628}, m7123m = "getUpgradeObjectAwardsResponse", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$getUpgradeObjectAwardsResponse$1 */
    public static final class C47031 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C47031(Continuation<? super C47031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UpgradeObjectEventViewModel.this.getUpgradeObjectAwardsResponse(this);
        }
    }

    /* compiled from: UpgradeObjectEventViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel", m7120f = "UpgradeObjectEventViewModel.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, m7122l = {MatroskaExtractor.ID_TIME_CODE}, m7123m = "parseJson", m7124n = {"this", "json", "servers", "serverName", "isUpdating", "type", "upgradeObjectLevel", "currencyEvent", "currencySpent", "countGift", "serverId", "upgradePosition", "isPlayerNotThreeLevel"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "I$7"})
    /* renamed from: com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$parseJson$1 */
    public static final class C47061 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public int I$7;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C47061(Continuation<? super C47061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UpgradeObjectEventViewModel.this.parseJson(null, false, null, this);
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
    public UpgradeObjectEventViewModel(@NotNull UpgradeObjectEventActionWithJSON actionWithJSON, @NotNull UpgradeObjectRepository upgradeObjectRepository, @NotNull StringResource stringResource, @NotNull LocalNotification localNotification, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(upgradeObjectRepository, "upgradeObjectRepository");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(application, "application");
        this.actionWithJSON = actionWithJSON;
        this.upgradeObjectRepository = upgradeObjectRepository;
        this.stringResource = stringResource;
        this.localNotification = localNotification;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new UpgradeObjectEventUiState(0, null, null, 0, false, null, null, false, false, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, false, false, false, null, 0, 0, null, null, 0, null, null, null, false, false, -1, 511, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<UpgradeObjectEventUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<UpgradeObjectEventUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: UpgradeObjectEventViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$initJson$1", m7120f = "UpgradeObjectEventViewModel.kt", m7121i = {}, m7122l = {111}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$initJson$1 */
    /* loaded from: classes2.dex */
    public static final class C47041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public final /* synthetic */ List<Server> $servers;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47041(JSONObject jSONObject, List<Server> list, Continuation<? super C47041> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.$servers = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UpgradeObjectEventViewModel.this.new C47041(this.$json, this.$servers, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C47041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UpgradeObjectEventViewModel upgradeObjectEventViewModel = UpgradeObjectEventViewModel.this;
                JSONObject jSONObject = this.$json;
                List<Server> list = this.$servers;
                this.label = 1;
                if (upgradeObjectEventViewModel.parseJson(jSONObject, false, list, this) == coroutine_suspended) {
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

    public final void initJson(@NotNull JSONObject json, @NotNull List<Server> servers) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(servers, "servers");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C47041(json, servers, null), 1, null);
    }

    /* compiled from: UpgradeObjectEventViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$updateJson$1", m7120f = "UpgradeObjectEventViewModel.kt", m7121i = {}, m7122l = {117}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$updateJson$1 */
    /* loaded from: classes2.dex */
    public static final class C47121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47121(JSONObject jSONObject, Continuation<? super C47121> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UpgradeObjectEventViewModel.this.new C47121(this.$json, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C47121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UpgradeObjectEventViewModel upgradeObjectEventViewModel = UpgradeObjectEventViewModel.this;
                JSONObject jSONObject = this.$json;
                this.label = 1;
                if (UpgradeObjectEventViewModel.parseJson$default(upgradeObjectEventViewModel, jSONObject, true, null, this, 4, null) == coroutine_suspended) {
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

    public final void updateJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C47121(json, null), 1, null);
    }

    /* compiled from: UpgradeObjectEventViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$sendOpenTypeUpgradeObject$1", m7120f = "UpgradeObjectEventViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$sendOpenTypeUpgradeObject$1 */
    /* loaded from: classes2.dex */
    public static final class C47101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $typeUpgradeObject;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47101(int i, Continuation<? super C47101> continuation) {
            super(2, continuation);
            this.$typeUpgradeObject = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UpgradeObjectEventViewModel.this.new C47101(this.$typeUpgradeObject, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C47101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                UpgradeObjectEventViewModel.this.actionWithJSON.sendOpenScreen(this.$typeUpgradeObject);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendOpenTypeUpgradeObject(@IntRange(from = 1, m10to = 2) int typeUpgradeObject) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C47101(typeUpgradeObject, null), 1, null);
    }

    public final void isLevelUpgradeObjectOpen(boolean isOpen) {
        UpgradeObjectEventUiState value;
        UpgradeObjectEventUiState upgradeObjectEventUiState;
        MutableStateFlow<UpgradeObjectEventUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            upgradeObjectEventUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, upgradeObjectEventUiState.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState.eventId : 0, ((-513) & 2) != 0 ? upgradeObjectEventUiState.bgImage : null, ((-513) & 4) != 0 ? upgradeObjectEventUiState.images : null, ((-513) & 8) != 0 ? upgradeObjectEventUiState.typeScreen : 0, ((-513) & 16) != 0 ? upgradeObjectEventUiState.isUpgradeObjectPlayer : false, ((-513) & 32) != 0 ? upgradeObjectEventUiState.upgradeObjectStrings : null, ((-513) & 64) != 0 ? upgradeObjectEventUiState.upgradeObjectImages : null, ((-513) & 128) != 0 ? upgradeObjectEventUiState.isLevelUpgradeObjectOpen : isOpen, ((-513) & 256) != 0 ? upgradeObjectEventUiState.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState.isEnergyInfoOpen : false, ((-513) & 1024) != 0 ? upgradeObjectEventUiState.isGiftQuestionOpen : false, ((-513) & 2048) != 0 ? upgradeObjectEventUiState.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState.isTopListOpen : false, ((-513) & 8192) != 0 ? upgradeObjectEventUiState.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState.isInfoVisible : false, ((-513) & 65536) != 0 ? upgradeObjectEventUiState.eventLevel : 0, ((-513) & 131072) != 0 ? upgradeObjectEventUiState.currency : 0, ((-513) & 262144) != 0 ? upgradeObjectEventUiState.currencySpent : 0, ((-513) & 524288) != 0 ? upgradeObjectEventUiState.currencyProgressScorePlayer : 0, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState.currencyProgressScoreServer : 0, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState.countGift : 0, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState.serverId : 0, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState.serverName : null, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState.upgradePriceOne : 0, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState.upgradePriceTwo : 0, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState.upgradePriceThree : 0, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState.isUpgradeOneEnable : false, ((-513) & 268435456) != 0 ? upgradeObjectEventUiState.isUpgradeTwoEnable : false, ((-513) & 536870912) != 0 ? upgradeObjectEventUiState.isUpgradeThreeEnable : false, ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState.topServersList : null, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState.placeInTop : 0, (255 & 1) != 0 ? upgradeObjectEventUiState.placePLayerInTopList : 0, (255 & 2) != 0 ? upgradeObjectEventUiState.levelPLayerInTopList : null, (255 & 4) != 0 ? upgradeObjectEventUiState.namePLayerInTopList : null, (255 & 8) != 0 ? upgradeObjectEventUiState.numberServer : 0, (255 & 16) != 0 ? upgradeObjectEventUiState.topList : null, (255 & 32) != 0 ? upgradeObjectEventUiState.awardsLevelList : null, (255 & 64) != 0 ? upgradeObjectEventUiState.servers : null, (255 & 128) != 0 ? upgradeObjectEventUiState.isNeedClose : false, (255 & 256) != 0 ? upgradeObjectEventUiState.isBlockingLoading : false)));
    }

    public final void isEnergyInfoOpen(boolean isOpen) {
        UpgradeObjectEventUiState value;
        UpgradeObjectEventUiState upgradeObjectEventUiState;
        MutableStateFlow<UpgradeObjectEventUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            upgradeObjectEventUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, upgradeObjectEventUiState.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState.eventId : 0, ((-513) & 2) != 0 ? upgradeObjectEventUiState.bgImage : null, ((-513) & 4) != 0 ? upgradeObjectEventUiState.images : null, ((-513) & 8) != 0 ? upgradeObjectEventUiState.typeScreen : 0, ((-513) & 16) != 0 ? upgradeObjectEventUiState.isUpgradeObjectPlayer : false, ((-513) & 32) != 0 ? upgradeObjectEventUiState.upgradeObjectStrings : null, ((-513) & 64) != 0 ? upgradeObjectEventUiState.upgradeObjectImages : null, ((-513) & 128) != 0 ? upgradeObjectEventUiState.isLevelUpgradeObjectOpen : false, ((-513) & 256) != 0 ? upgradeObjectEventUiState.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState.isEnergyInfoOpen : isOpen, ((-513) & 1024) != 0 ? upgradeObjectEventUiState.isGiftQuestionOpen : false, ((-513) & 2048) != 0 ? upgradeObjectEventUiState.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState.isTopListOpen : false, ((-513) & 8192) != 0 ? upgradeObjectEventUiState.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState.isInfoVisible : false, ((-513) & 65536) != 0 ? upgradeObjectEventUiState.eventLevel : 0, ((-513) & 131072) != 0 ? upgradeObjectEventUiState.currency : 0, ((-513) & 262144) != 0 ? upgradeObjectEventUiState.currencySpent : 0, ((-513) & 524288) != 0 ? upgradeObjectEventUiState.currencyProgressScorePlayer : 0, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState.currencyProgressScoreServer : 0, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState.countGift : 0, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState.serverId : 0, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState.serverName : null, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState.upgradePriceOne : 0, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState.upgradePriceTwo : 0, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState.upgradePriceThree : 0, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState.isUpgradeOneEnable : false, ((-513) & 268435456) != 0 ? upgradeObjectEventUiState.isUpgradeTwoEnable : false, ((-513) & 536870912) != 0 ? upgradeObjectEventUiState.isUpgradeThreeEnable : false, ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState.topServersList : null, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState.placeInTop : 0, (255 & 1) != 0 ? upgradeObjectEventUiState.placePLayerInTopList : 0, (255 & 2) != 0 ? upgradeObjectEventUiState.levelPLayerInTopList : null, (255 & 4) != 0 ? upgradeObjectEventUiState.namePLayerInTopList : null, (255 & 8) != 0 ? upgradeObjectEventUiState.numberServer : 0, (255 & 16) != 0 ? upgradeObjectEventUiState.topList : null, (255 & 32) != 0 ? upgradeObjectEventUiState.awardsLevelList : null, (255 & 64) != 0 ? upgradeObjectEventUiState.servers : null, (255 & 128) != 0 ? upgradeObjectEventUiState.isNeedClose : false, (255 & 256) != 0 ? upgradeObjectEventUiState.isBlockingLoading : false)));
    }

    public final void onBuyUpgradeClick(@IntRange(from = 1, m10to = 3) int positionUpgrade) {
        UpgradeObjectEventUiState value;
        UpgradeObjectEventUiState upgradeObjectEventUiState;
        MutableStateFlow<UpgradeObjectEventUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            upgradeObjectEventUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, upgradeObjectEventUiState.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState.eventId : 0, ((-513) & 2) != 0 ? upgradeObjectEventUiState.bgImage : null, ((-513) & 4) != 0 ? upgradeObjectEventUiState.images : null, ((-513) & 8) != 0 ? upgradeObjectEventUiState.typeScreen : 0, ((-513) & 16) != 0 ? upgradeObjectEventUiState.isUpgradeObjectPlayer : false, ((-513) & 32) != 0 ? upgradeObjectEventUiState.upgradeObjectStrings : null, ((-513) & 64) != 0 ? upgradeObjectEventUiState.upgradeObjectImages : null, ((-513) & 128) != 0 ? upgradeObjectEventUiState.isLevelUpgradeObjectOpen : false, ((-513) & 256) != 0 ? upgradeObjectEventUiState.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState.isEnergyInfoOpen : false, ((-513) & 1024) != 0 ? upgradeObjectEventUiState.isGiftQuestionOpen : false, ((-513) & 2048) != 0 ? upgradeObjectEventUiState.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState.isTopListOpen : false, ((-513) & 8192) != 0 ? upgradeObjectEventUiState.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState.isInfoVisible : false, ((-513) & 65536) != 0 ? upgradeObjectEventUiState.eventLevel : 0, ((-513) & 131072) != 0 ? upgradeObjectEventUiState.currency : 0, ((-513) & 262144) != 0 ? upgradeObjectEventUiState.currencySpent : 0, ((-513) & 524288) != 0 ? upgradeObjectEventUiState.currencyProgressScorePlayer : 0, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState.currencyProgressScoreServer : 0, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState.countGift : 0, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState.serverId : 0, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState.serverName : null, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState.upgradePriceOne : 0, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState.upgradePriceTwo : 0, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState.upgradePriceThree : 0, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState.isUpgradeOneEnable : false, ((-513) & 268435456) != 0 ? upgradeObjectEventUiState.isUpgradeTwoEnable : false, ((-513) & 536870912) != 0 ? upgradeObjectEventUiState.isUpgradeThreeEnable : false, ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState.topServersList : null, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState.placeInTop : 0, (255 & 1) != 0 ? upgradeObjectEventUiState.placePLayerInTopList : 0, (255 & 2) != 0 ? upgradeObjectEventUiState.levelPLayerInTopList : null, (255 & 4) != 0 ? upgradeObjectEventUiState.namePLayerInTopList : null, (255 & 8) != 0 ? upgradeObjectEventUiState.numberServer : 0, (255 & 16) != 0 ? upgradeObjectEventUiState.topList : null, (255 & 32) != 0 ? upgradeObjectEventUiState.awardsLevelList : null, (255 & 64) != 0 ? upgradeObjectEventUiState.servers : null, (255 & 128) != 0 ? upgradeObjectEventUiState.isNeedClose : false, (255 & 256) != 0 ? upgradeObjectEventUiState.isBlockingLoading : true)));
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C47052(positionUpgrade, null), 1, null);
    }

    /* compiled from: UpgradeObjectEventViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$onBuyUpgradeClick$2", m7120f = "UpgradeObjectEventViewModel.kt", m7121i = {}, m7122l = {TarConstants.CHKSUM_OFFSET}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$onBuyUpgradeClick$2 */
    /* loaded from: classes2.dex */
    public static final class C47052 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $positionUpgrade;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47052(int i, Continuation<? super C47052> continuation) {
            super(2, continuation);
            this.$positionUpgrade = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UpgradeObjectEventViewModel.this.new C47052(this.$positionUpgrade, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C47052) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (UpgradeObjectEventViewModel.this.get_uiState().getValue().getCurrency() > UpgradeObjectEventViewModel.this.get_uiState().getValue().getPriceForUpgrade()) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(UpgradeObjectEventViewModel.this, this.$positionUpgrade, null);
                    this.label = 1;
                    if (ViewModelExtensionKt.doOnIO$default(null, anonymousClass1, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    UpgradeObjectEventViewModel.this.isEnergyInfoOpen(true);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: UpgradeObjectEventViewModel.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$onBuyUpgradeClick$2$1", m7120f = "UpgradeObjectEventViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$onBuyUpgradeClick$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ int $positionUpgrade;
            public int label;
            public final /* synthetic */ UpgradeObjectEventViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UpgradeObjectEventViewModel upgradeObjectEventViewModel, int i, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = upgradeObjectEventViewModel;
                this.$positionUpgrade = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$positionUpgrade, continuation);
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
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.actionWithJSON.sendUpgradeObjectUpgradeClick(this.$positionUpgrade);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void isGiftQuestionOpen(boolean isOpen) {
        UpgradeObjectEventUiState value;
        UpgradeObjectEventUiState upgradeObjectEventUiState;
        MutableStateFlow<UpgradeObjectEventUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            upgradeObjectEventUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, upgradeObjectEventUiState.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState.eventId : 0, ((-513) & 2) != 0 ? upgradeObjectEventUiState.bgImage : null, ((-513) & 4) != 0 ? upgradeObjectEventUiState.images : null, ((-513) & 8) != 0 ? upgradeObjectEventUiState.typeScreen : 0, ((-513) & 16) != 0 ? upgradeObjectEventUiState.isUpgradeObjectPlayer : false, ((-513) & 32) != 0 ? upgradeObjectEventUiState.upgradeObjectStrings : null, ((-513) & 64) != 0 ? upgradeObjectEventUiState.upgradeObjectImages : null, ((-513) & 128) != 0 ? upgradeObjectEventUiState.isLevelUpgradeObjectOpen : false, ((-513) & 256) != 0 ? upgradeObjectEventUiState.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState.isEnergyInfoOpen : false, ((-513) & 1024) != 0 ? upgradeObjectEventUiState.isGiftQuestionOpen : isOpen, ((-513) & 2048) != 0 ? upgradeObjectEventUiState.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState.isTopListOpen : false, ((-513) & 8192) != 0 ? upgradeObjectEventUiState.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState.isInfoVisible : false, ((-513) & 65536) != 0 ? upgradeObjectEventUiState.eventLevel : 0, ((-513) & 131072) != 0 ? upgradeObjectEventUiState.currency : 0, ((-513) & 262144) != 0 ? upgradeObjectEventUiState.currencySpent : 0, ((-513) & 524288) != 0 ? upgradeObjectEventUiState.currencyProgressScorePlayer : 0, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState.currencyProgressScoreServer : 0, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState.countGift : 0, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState.serverId : 0, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState.serverName : null, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState.upgradePriceOne : 0, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState.upgradePriceTwo : 0, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState.upgradePriceThree : 0, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState.isUpgradeOneEnable : false, ((-513) & 268435456) != 0 ? upgradeObjectEventUiState.isUpgradeTwoEnable : false, ((-513) & 536870912) != 0 ? upgradeObjectEventUiState.isUpgradeThreeEnable : false, ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState.topServersList : null, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState.placeInTop : 0, (255 & 1) != 0 ? upgradeObjectEventUiState.placePLayerInTopList : 0, (255 & 2) != 0 ? upgradeObjectEventUiState.levelPLayerInTopList : null, (255 & 4) != 0 ? upgradeObjectEventUiState.namePLayerInTopList : null, (255 & 8) != 0 ? upgradeObjectEventUiState.numberServer : 0, (255 & 16) != 0 ? upgradeObjectEventUiState.topList : null, (255 & 32) != 0 ? upgradeObjectEventUiState.awardsLevelList : null, (255 & 64) != 0 ? upgradeObjectEventUiState.servers : null, (255 & 128) != 0 ? upgradeObjectEventUiState.isNeedClose : false, (255 & 256) != 0 ? upgradeObjectEventUiState.isBlockingLoading : false)));
    }

    /* compiled from: UpgradeObjectEventViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$sendGiftOpen$1", m7120f = "UpgradeObjectEventViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$sendGiftOpen$1 */
    /* loaded from: classes2.dex */
    public static final class C47091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C47091(Continuation<? super C47091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UpgradeObjectEventViewModel.this.new C47091(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C47091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                UpgradeObjectEventViewModel.this.actionWithJSON.sendGiftOpen();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendGiftOpen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C47091(null), 1, null);
    }

    public final void sendTopListOpen(@IntRange(from = 4, m10to = 5) int typeTopList) {
        UpgradeObjectEventUiState value;
        UpgradeObjectEventUiState upgradeObjectEventUiState;
        MutableStateFlow<UpgradeObjectEventUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            upgradeObjectEventUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, upgradeObjectEventUiState.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState.eventId : 0, ((-513) & 2) != 0 ? upgradeObjectEventUiState.bgImage : null, ((-513) & 4) != 0 ? upgradeObjectEventUiState.images : null, ((-513) & 8) != 0 ? upgradeObjectEventUiState.typeScreen : 0, ((-513) & 16) != 0 ? upgradeObjectEventUiState.isUpgradeObjectPlayer : false, ((-513) & 32) != 0 ? upgradeObjectEventUiState.upgradeObjectStrings : null, ((-513) & 64) != 0 ? upgradeObjectEventUiState.upgradeObjectImages : null, ((-513) & 128) != 0 ? upgradeObjectEventUiState.isLevelUpgradeObjectOpen : false, ((-513) & 256) != 0 ? upgradeObjectEventUiState.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState.isEnergyInfoOpen : false, ((-513) & 1024) != 0 ? upgradeObjectEventUiState.isGiftQuestionOpen : false, ((-513) & 2048) != 0 ? upgradeObjectEventUiState.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState.isTopListOpen : false, ((-513) & 8192) != 0 ? upgradeObjectEventUiState.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState.isInfoVisible : false, ((-513) & 65536) != 0 ? upgradeObjectEventUiState.eventLevel : 0, ((-513) & 131072) != 0 ? upgradeObjectEventUiState.currency : 0, ((-513) & 262144) != 0 ? upgradeObjectEventUiState.currencySpent : 0, ((-513) & 524288) != 0 ? upgradeObjectEventUiState.currencyProgressScorePlayer : 0, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState.currencyProgressScoreServer : 0, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState.countGift : 0, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState.serverId : 0, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState.serverName : null, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState.upgradePriceOne : 0, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState.upgradePriceTwo : 0, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState.upgradePriceThree : 0, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState.isUpgradeOneEnable : false, ((-513) & 268435456) != 0 ? upgradeObjectEventUiState.isUpgradeTwoEnable : false, ((-513) & 536870912) != 0 ? upgradeObjectEventUiState.isUpgradeThreeEnable : false, ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState.topServersList : null, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState.placeInTop : 0, (255 & 1) != 0 ? upgradeObjectEventUiState.placePLayerInTopList : 0, (255 & 2) != 0 ? upgradeObjectEventUiState.levelPLayerInTopList : null, (255 & 4) != 0 ? upgradeObjectEventUiState.namePLayerInTopList : null, (255 & 8) != 0 ? upgradeObjectEventUiState.numberServer : 0, (255 & 16) != 0 ? upgradeObjectEventUiState.topList : null, (255 & 32) != 0 ? upgradeObjectEventUiState.awardsLevelList : null, (255 & 64) != 0 ? upgradeObjectEventUiState.servers : null, (255 & 128) != 0 ? upgradeObjectEventUiState.isNeedClose : false, (255 & 256) != 0 ? upgradeObjectEventUiState.isBlockingLoading : true)));
        ViewModelExtensionKt.launchOnIO$default(this, null, new C47112(typeTopList, null), 1, null);
    }

    /* compiled from: UpgradeObjectEventViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$sendTopListOpen$2", m7120f = "UpgradeObjectEventViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$sendTopListOpen$2 */
    /* loaded from: classes2.dex */
    public static final class C47112 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $typeTopList;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47112(int i, Continuation<? super C47112> continuation) {
            super(2, continuation);
            this.$typeTopList = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UpgradeObjectEventViewModel.this.new C47112(this.$typeTopList, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C47112) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                UpgradeObjectEventViewModel.this.actionWithJSON.sendTopListOpen(this.$typeTopList);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void closeTopListOpen() {
        UpgradeObjectEventUiState value;
        UpgradeObjectEventUiState upgradeObjectEventUiState;
        MutableStateFlow<UpgradeObjectEventUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            upgradeObjectEventUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, upgradeObjectEventUiState.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState.eventId : 0, ((-513) & 2) != 0 ? upgradeObjectEventUiState.bgImage : null, ((-513) & 4) != 0 ? upgradeObjectEventUiState.images : null, ((-513) & 8) != 0 ? upgradeObjectEventUiState.typeScreen : 0, ((-513) & 16) != 0 ? upgradeObjectEventUiState.isUpgradeObjectPlayer : false, ((-513) & 32) != 0 ? upgradeObjectEventUiState.upgradeObjectStrings : null, ((-513) & 64) != 0 ? upgradeObjectEventUiState.upgradeObjectImages : null, ((-513) & 128) != 0 ? upgradeObjectEventUiState.isLevelUpgradeObjectOpen : false, ((-513) & 256) != 0 ? upgradeObjectEventUiState.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState.isEnergyInfoOpen : false, ((-513) & 1024) != 0 ? upgradeObjectEventUiState.isGiftQuestionOpen : false, ((-513) & 2048) != 0 ? upgradeObjectEventUiState.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState.isTopListOpen : false, ((-513) & 8192) != 0 ? upgradeObjectEventUiState.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState.isInfoVisible : false, ((-513) & 65536) != 0 ? upgradeObjectEventUiState.eventLevel : 0, ((-513) & 131072) != 0 ? upgradeObjectEventUiState.currency : 0, ((-513) & 262144) != 0 ? upgradeObjectEventUiState.currencySpent : 0, ((-513) & 524288) != 0 ? upgradeObjectEventUiState.currencyProgressScorePlayer : 0, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState.currencyProgressScoreServer : 0, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState.countGift : 0, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState.serverId : 0, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState.serverName : null, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState.upgradePriceOne : 0, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState.upgradePriceTwo : 0, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState.upgradePriceThree : 0, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState.isUpgradeOneEnable : false, ((-513) & 268435456) != 0 ? upgradeObjectEventUiState.isUpgradeTwoEnable : false, ((-513) & 536870912) != 0 ? upgradeObjectEventUiState.isUpgradeThreeEnable : false, ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState.topServersList : null, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState.placeInTop : 0, (255 & 1) != 0 ? upgradeObjectEventUiState.placePLayerInTopList : 0, (255 & 2) != 0 ? upgradeObjectEventUiState.levelPLayerInTopList : null, (255 & 4) != 0 ? upgradeObjectEventUiState.namePLayerInTopList : null, (255 & 8) != 0 ? upgradeObjectEventUiState.numberServer : 0, (255 & 16) != 0 ? upgradeObjectEventUiState.topList : null, (255 & 32) != 0 ? upgradeObjectEventUiState.awardsLevelList : null, (255 & 64) != 0 ? upgradeObjectEventUiState.servers : null, (255 & 128) != 0 ? upgradeObjectEventUiState.isNeedClose : false, (255 & 256) != 0 ? upgradeObjectEventUiState.isBlockingLoading : false)));
    }

    public final void openInfoScreen() {
        UpgradeObjectEventUiState value;
        UpgradeObjectEventUiState upgradeObjectEventUiState;
        MutableStateFlow<UpgradeObjectEventUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            upgradeObjectEventUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, upgradeObjectEventUiState.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState.eventId : 0, ((-513) & 2) != 0 ? upgradeObjectEventUiState.bgImage : null, ((-513) & 4) != 0 ? upgradeObjectEventUiState.images : null, ((-513) & 8) != 0 ? upgradeObjectEventUiState.typeScreen : 0, ((-513) & 16) != 0 ? upgradeObjectEventUiState.isUpgradeObjectPlayer : false, ((-513) & 32) != 0 ? upgradeObjectEventUiState.upgradeObjectStrings : null, ((-513) & 64) != 0 ? upgradeObjectEventUiState.upgradeObjectImages : null, ((-513) & 128) != 0 ? upgradeObjectEventUiState.isLevelUpgradeObjectOpen : false, ((-513) & 256) != 0 ? upgradeObjectEventUiState.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState.isEnergyInfoOpen : false, ((-513) & 1024) != 0 ? upgradeObjectEventUiState.isGiftQuestionOpen : false, ((-513) & 2048) != 0 ? upgradeObjectEventUiState.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState.isTopListOpen : false, ((-513) & 8192) != 0 ? upgradeObjectEventUiState.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState.isInfoVisible : true, ((-513) & 65536) != 0 ? upgradeObjectEventUiState.eventLevel : 0, ((-513) & 131072) != 0 ? upgradeObjectEventUiState.currency : 0, ((-513) & 262144) != 0 ? upgradeObjectEventUiState.currencySpent : 0, ((-513) & 524288) != 0 ? upgradeObjectEventUiState.currencyProgressScorePlayer : 0, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState.currencyProgressScoreServer : 0, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState.countGift : 0, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState.serverId : 0, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState.serverName : null, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState.upgradePriceOne : 0, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState.upgradePriceTwo : 0, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState.upgradePriceThree : 0, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState.isUpgradeOneEnable : false, ((-513) & 268435456) != 0 ? upgradeObjectEventUiState.isUpgradeTwoEnable : false, ((-513) & 536870912) != 0 ? upgradeObjectEventUiState.isUpgradeThreeEnable : false, ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState.topServersList : null, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState.placeInTop : 0, (255 & 1) != 0 ? upgradeObjectEventUiState.placePLayerInTopList : 0, (255 & 2) != 0 ? upgradeObjectEventUiState.levelPLayerInTopList : null, (255 & 4) != 0 ? upgradeObjectEventUiState.namePLayerInTopList : null, (255 & 8) != 0 ? upgradeObjectEventUiState.numberServer : 0, (255 & 16) != 0 ? upgradeObjectEventUiState.topList : null, (255 & 32) != 0 ? upgradeObjectEventUiState.awardsLevelList : null, (255 & 64) != 0 ? upgradeObjectEventUiState.servers : null, (255 & 128) != 0 ? upgradeObjectEventUiState.isNeedClose : false, (255 & 256) != 0 ? upgradeObjectEventUiState.isBlockingLoading : false)));
    }

    public final void closeInfoScreen() {
        UpgradeObjectEventUiState value;
        UpgradeObjectEventUiState upgradeObjectEventUiState;
        MutableStateFlow<UpgradeObjectEventUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            upgradeObjectEventUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, upgradeObjectEventUiState.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState.eventId : 0, ((-513) & 2) != 0 ? upgradeObjectEventUiState.bgImage : null, ((-513) & 4) != 0 ? upgradeObjectEventUiState.images : null, ((-513) & 8) != 0 ? upgradeObjectEventUiState.typeScreen : 0, ((-513) & 16) != 0 ? upgradeObjectEventUiState.isUpgradeObjectPlayer : false, ((-513) & 32) != 0 ? upgradeObjectEventUiState.upgradeObjectStrings : null, ((-513) & 64) != 0 ? upgradeObjectEventUiState.upgradeObjectImages : null, ((-513) & 128) != 0 ? upgradeObjectEventUiState.isLevelUpgradeObjectOpen : false, ((-513) & 256) != 0 ? upgradeObjectEventUiState.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState.isEnergyInfoOpen : false, ((-513) & 1024) != 0 ? upgradeObjectEventUiState.isGiftQuestionOpen : false, ((-513) & 2048) != 0 ? upgradeObjectEventUiState.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState.isTopListOpen : false, ((-513) & 8192) != 0 ? upgradeObjectEventUiState.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState.isInfoVisible : false, ((-513) & 65536) != 0 ? upgradeObjectEventUiState.eventLevel : 0, ((-513) & 131072) != 0 ? upgradeObjectEventUiState.currency : 0, ((-513) & 262144) != 0 ? upgradeObjectEventUiState.currencySpent : 0, ((-513) & 524288) != 0 ? upgradeObjectEventUiState.currencyProgressScorePlayer : 0, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState.currencyProgressScoreServer : 0, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState.countGift : 0, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState.serverId : 0, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState.serverName : null, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState.upgradePriceOne : 0, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState.upgradePriceTwo : 0, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState.upgradePriceThree : 0, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState.isUpgradeOneEnable : false, ((-513) & 268435456) != 0 ? upgradeObjectEventUiState.isUpgradeTwoEnable : false, ((-513) & 536870912) != 0 ? upgradeObjectEventUiState.isUpgradeThreeEnable : false, ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState.topServersList : null, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState.placeInTop : 0, (255 & 1) != 0 ? upgradeObjectEventUiState.placePLayerInTopList : 0, (255 & 2) != 0 ? upgradeObjectEventUiState.levelPLayerInTopList : null, (255 & 4) != 0 ? upgradeObjectEventUiState.namePLayerInTopList : null, (255 & 8) != 0 ? upgradeObjectEventUiState.numberServer : 0, (255 & 16) != 0 ? upgradeObjectEventUiState.topList : null, (255 & 32) != 0 ? upgradeObjectEventUiState.awardsLevelList : null, (255 & 64) != 0 ? upgradeObjectEventUiState.servers : null, (255 & 128) != 0 ? upgradeObjectEventUiState.isNeedClose : false, (255 & 256) != 0 ? upgradeObjectEventUiState.isBlockingLoading : false)));
    }

    /* compiled from: UpgradeObjectEventViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$sendCloseScreen$1", m7120f = "UpgradeObjectEventViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nUpgradeObjectEventViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpgradeObjectEventViewModel.kt\ncom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventViewModel$sendCloseScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,706:1\n230#2,5:707\n*S KotlinDebug\n*F\n+ 1 UpgradeObjectEventViewModel.kt\ncom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventViewModel$sendCloseScreen$1\n*L\n199#1:707,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel$sendCloseScreen$1 */
    /* loaded from: classes2.dex */
    public static final class C47081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C47081(Continuation<? super C47081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UpgradeObjectEventViewModel.this.new C47081(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C47081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            UpgradeObjectEventUiState value;
            UpgradeObjectEventUiState upgradeObjectEventUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                UpgradeObjectEventViewModel.this.actionWithJSON.sendCloseScreen();
                MutableStateFlow<UpgradeObjectEventUiState> mutableStateFlow = UpgradeObjectEventViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    upgradeObjectEventUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, upgradeObjectEventUiState.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState.eventId : 0, ((-513) & 2) != 0 ? upgradeObjectEventUiState.bgImage : null, ((-513) & 4) != 0 ? upgradeObjectEventUiState.images : null, ((-513) & 8) != 0 ? upgradeObjectEventUiState.typeScreen : 0, ((-513) & 16) != 0 ? upgradeObjectEventUiState.isUpgradeObjectPlayer : false, ((-513) & 32) != 0 ? upgradeObjectEventUiState.upgradeObjectStrings : null, ((-513) & 64) != 0 ? upgradeObjectEventUiState.upgradeObjectImages : null, ((-513) & 128) != 0 ? upgradeObjectEventUiState.isLevelUpgradeObjectOpen : false, ((-513) & 256) != 0 ? upgradeObjectEventUiState.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState.isEnergyInfoOpen : false, ((-513) & 1024) != 0 ? upgradeObjectEventUiState.isGiftQuestionOpen : false, ((-513) & 2048) != 0 ? upgradeObjectEventUiState.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState.isTopListOpen : false, ((-513) & 8192) != 0 ? upgradeObjectEventUiState.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState.isInfoVisible : false, ((-513) & 65536) != 0 ? upgradeObjectEventUiState.eventLevel : 0, ((-513) & 131072) != 0 ? upgradeObjectEventUiState.currency : 0, ((-513) & 262144) != 0 ? upgradeObjectEventUiState.currencySpent : 0, ((-513) & 524288) != 0 ? upgradeObjectEventUiState.currencyProgressScorePlayer : 0, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState.currencyProgressScoreServer : 0, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState.countGift : 0, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState.serverId : 0, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState.serverName : null, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState.upgradePriceOne : 0, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState.upgradePriceTwo : 0, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState.upgradePriceThree : 0, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState.isUpgradeOneEnable : false, ((-513) & 268435456) != 0 ? upgradeObjectEventUiState.isUpgradeTwoEnable : false, ((-513) & 536870912) != 0 ? upgradeObjectEventUiState.isUpgradeThreeEnable : false, ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState.topServersList : null, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState.placeInTop : 0, (255 & 1) != 0 ? upgradeObjectEventUiState.placePLayerInTopList : 0, (255 & 2) != 0 ? upgradeObjectEventUiState.levelPLayerInTopList : null, (255 & 4) != 0 ? upgradeObjectEventUiState.namePLayerInTopList : null, (255 & 8) != 0 ? upgradeObjectEventUiState.numberServer : 0, (255 & 16) != 0 ? upgradeObjectEventUiState.topList : null, (255 & 32) != 0 ? upgradeObjectEventUiState.awardsLevelList : null, (255 & 64) != 0 ? upgradeObjectEventUiState.servers : null, (255 & 128) != 0 ? upgradeObjectEventUiState.isNeedClose : true, (255 & 256) != 0 ? upgradeObjectEventUiState.isBlockingLoading : false)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendCloseScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C47081(null), 1, null);
    }

    public final void showErrorMessage(@NotNull String message) throws JSONException {
        Intrinsics.checkNotNullParameter(message, "message");
        getLocalNotification().showErrorNotification(message);
    }

    public final void turnBlockingLoading() {
        UpgradeObjectEventUiState value;
        UpgradeObjectEventUiState upgradeObjectEventUiState;
        MutableStateFlow<UpgradeObjectEventUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            upgradeObjectEventUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, upgradeObjectEventUiState.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState.eventId : 0, ((-513) & 2) != 0 ? upgradeObjectEventUiState.bgImage : null, ((-513) & 4) != 0 ? upgradeObjectEventUiState.images : null, ((-513) & 8) != 0 ? upgradeObjectEventUiState.typeScreen : 0, ((-513) & 16) != 0 ? upgradeObjectEventUiState.isUpgradeObjectPlayer : false, ((-513) & 32) != 0 ? upgradeObjectEventUiState.upgradeObjectStrings : null, ((-513) & 64) != 0 ? upgradeObjectEventUiState.upgradeObjectImages : null, ((-513) & 128) != 0 ? upgradeObjectEventUiState.isLevelUpgradeObjectOpen : false, ((-513) & 256) != 0 ? upgradeObjectEventUiState.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState.isEnergyInfoOpen : false, ((-513) & 1024) != 0 ? upgradeObjectEventUiState.isGiftQuestionOpen : false, ((-513) & 2048) != 0 ? upgradeObjectEventUiState.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState.isTopListOpen : false, ((-513) & 8192) != 0 ? upgradeObjectEventUiState.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState.isInfoVisible : false, ((-513) & 65536) != 0 ? upgradeObjectEventUiState.eventLevel : 0, ((-513) & 131072) != 0 ? upgradeObjectEventUiState.currency : 0, ((-513) & 262144) != 0 ? upgradeObjectEventUiState.currencySpent : 0, ((-513) & 524288) != 0 ? upgradeObjectEventUiState.currencyProgressScorePlayer : 0, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState.currencyProgressScoreServer : 0, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState.countGift : 0, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState.serverId : 0, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState.serverName : null, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState.upgradePriceOne : 0, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState.upgradePriceTwo : 0, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState.upgradePriceThree : 0, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState.isUpgradeOneEnable : false, ((-513) & 268435456) != 0 ? upgradeObjectEventUiState.isUpgradeTwoEnable : false, ((-513) & 536870912) != 0 ? upgradeObjectEventUiState.isUpgradeThreeEnable : false, ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState.topServersList : null, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState.placeInTop : 0, (255 & 1) != 0 ? upgradeObjectEventUiState.placePLayerInTopList : 0, (255 & 2) != 0 ? upgradeObjectEventUiState.levelPLayerInTopList : null, (255 & 4) != 0 ? upgradeObjectEventUiState.namePLayerInTopList : null, (255 & 8) != 0 ? upgradeObjectEventUiState.numberServer : 0, (255 & 16) != 0 ? upgradeObjectEventUiState.topList : null, (255 & 32) != 0 ? upgradeObjectEventUiState.awardsLevelList : null, (255 & 64) != 0 ? upgradeObjectEventUiState.servers : null, (255 & 128) != 0 ? upgradeObjectEventUiState.isNeedClose : false, (255 & 256) != 0 ? upgradeObjectEventUiState.isBlockingLoading : true)));
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03ce A[LOOP:3: B:122:0x035d->B:125:0x03ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x06a1 A[Catch: Exception -> 0x06a9, TRY_LEAVE, TryCatch #3 {Exception -> 0x06a9, blocks: (B:164:0x0657, B:166:0x0664, B:178:0x06a1, B:176:0x068f), top: B:258:0x0657 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0adc A[EDGE_INSN: B:273:0x0adc->B:250:0x0adc BREAK  A[LOOP:3: B:122:0x035d->B:125:0x03ce], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x020f A[Catch: Exception -> 0x0217, TRY_LEAVE, TryCatch #5 {Exception -> 0x0217, blocks: (B:39:0x01c7, B:41:0x01d4, B:52:0x020f, B:50:0x01fd), top: B:262:0x01c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object parseJson(JSONObject jSONObject, boolean z, List<Server> list, Continuation<? super Unit> continuation) throws Throwable {
        C47061 c47061;
        String serverName;
        UpgradeObjectEventViewModel upgradeObjectEventViewModel;
        Object obj;
        List<Server> list2;
        JSONObject jSONObject2;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str;
        UpgradeObjectEventUiState value;
        UpgradeObjectEventUiState upgradeObjectEventUiState;
        UpgradeObjectEventUiState value2;
        UpgradeObjectEventUiState upgradeObjectEventUiState2;
        ArrayList arrayList;
        int i9;
        Object objFromJson;
        int iOptInt;
        String str2;
        String str3;
        ArrayList arrayList2;
        UpgradeObjectEventUiState value3;
        UpgradeObjectEventUiState upgradeObjectEventUiState3;
        String str4;
        UpgradeObjectEventTopListOfServersItem upgradeObjectEventTopListOfServersItem;
        Iterator it;
        String str5;
        UpgradeObjectEventTopListOfServersItem upgradeObjectEventTopListOfServersItem2;
        int i10;
        UpgradeObjectEventUiState value4;
        UpgradeObjectEventUiState upgradeObjectEventUiState4;
        UpgradeObjectEventUiState value5;
        UpgradeObjectEventUiState upgradeObjectEventUiState5;
        UpgradeObjectEventUiState value6;
        UpgradeObjectEventUiState upgradeObjectEventUiState6;
        UpgradeObjectEventUiState value7;
        UpgradeObjectEventUiState upgradeObjectEventUiState7;
        UpgradeObjectEventUiState value8;
        UpgradeObjectEventUiState upgradeObjectEventUiState8;
        ArrayList arrayList3;
        JSONArray jSONArray;
        Object objFromJson2;
        List mutableList;
        MutableStateFlow<UpgradeObjectEventUiState> mutableStateFlow;
        UpgradeObjectEventUiState value9;
        UpgradeObjectEventUiState upgradeObjectEventUiState9;
        int i11;
        String str6;
        List<AwardsTopDto> awardsTopDto;
        AwardsTopDto awardsTopDto2;
        List<AwardsTopDto> awardsTopDto3;
        AwardsTopDto awardsTopDto4;
        String serverName2;
        UpgradeObjectEventUiState value10;
        UpgradeObjectEventUiState upgradeObjectEventUiState10;
        if (continuation instanceof C47061) {
            c47061 = (C47061) continuation;
            int i12 = c47061.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c47061.label = i12 - Integer.MIN_VALUE;
            } else {
                c47061 = new C47061(continuation);
            }
        }
        Object obj2 = c47061.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c47061.label;
        if (i13 == 0) {
            ResultKt.throwOnFailure(obj2);
            int iOptInt2 = jSONObject.optInt("t");
            int iOptInt3 = jSONObject.optInt("lv");
            int iOptInt4 = jSONObject.optInt("e");
            int iOptInt5 = jSONObject.optInt("ee");
            int iOptInt6 = jSONObject.optInt("p");
            int iOptInt7 = jSONObject.optInt(UpgradeObjectEventKeys.EVENT_SERVER_ID_KEY, 1);
            serverName = getServerName(iOptInt7, list);
            int iOptInt8 = jSONObject.optInt(UpgradeObjectEventKeys.EVENT_UPGRADE_POSITION_KEY);
            int iOptInt9 = jSONObject.optInt("nl");
            c47061.L$0 = this;
            c47061.L$1 = jSONObject;
            c47061.L$2 = list;
            c47061.L$3 = serverName;
            c47061.Z$0 = z;
            c47061.I$0 = iOptInt2;
            c47061.I$1 = iOptInt3;
            c47061.I$2 = iOptInt4;
            c47061.I$3 = iOptInt5;
            c47061.I$4 = iOptInt6;
            c47061.I$5 = iOptInt7;
            c47061.I$6 = iOptInt8;
            c47061.I$7 = iOptInt9;
            c47061.label = 1;
            Object upgradeObjectAwardsResponse = getUpgradeObjectAwardsResponse(c47061);
            if (upgradeObjectAwardsResponse == coroutine_suspended) {
                return coroutine_suspended;
            }
            upgradeObjectEventViewModel = this;
            obj = upgradeObjectAwardsResponse;
            list2 = list;
            jSONObject2 = jSONObject;
            i = iOptInt9;
            z2 = z;
            i2 = iOptInt2;
            i3 = iOptInt3;
            i4 = iOptInt4;
            i5 = iOptInt5;
            i6 = iOptInt6;
            i7 = iOptInt7;
            i8 = iOptInt8;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c47061.I$7;
            int i14 = c47061.I$6;
            int i15 = c47061.I$5;
            int i16 = c47061.I$4;
            int i17 = c47061.I$3;
            int i18 = c47061.I$2;
            int i19 = c47061.I$1;
            int i20 = c47061.I$0;
            z2 = c47061.Z$0;
            serverName = (String) c47061.L$3;
            List<Server> list3 = (List) c47061.L$2;
            jSONObject2 = (JSONObject) c47061.L$1;
            UpgradeObjectEventViewModel upgradeObjectEventViewModel2 = (UpgradeObjectEventViewModel) c47061.L$0;
            ResultKt.throwOnFailure(obj2);
            i8 = i14;
            list2 = list3;
            i2 = i20;
            i3 = i19;
            i4 = i18;
            i5 = i17;
            i6 = i16;
            i7 = i15;
            upgradeObjectEventViewModel = upgradeObjectEventViewModel2;
            obj = obj2;
        }
        UpgradeObjectAwardsResponse upgradeObjectAwardsResponse2 = (UpgradeObjectAwardsResponse) obj;
        List<GiftPrizeModel> awardsLevelList = upgradeObjectEventViewModel.getAwardsLevelList(upgradeObjectAwardsResponse2, i3, i5);
        if (IntExtensionKt.isNegativeCommand(Boxing.boxInt(i))) {
            MutableStateFlow<UpgradeObjectEventUiState> mutableStateFlow2 = upgradeObjectEventViewModel.get_uiState();
            do {
                value10 = mutableStateFlow2.getValue();
                upgradeObjectEventUiState10 = value10;
            } while (!mutableStateFlow2.compareAndSet(value10, upgradeObjectEventUiState10.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState10.eventId : 0, ((-513) & 2) != 0 ? upgradeObjectEventUiState10.bgImage : null, ((-513) & 4) != 0 ? upgradeObjectEventUiState10.images : null, ((-513) & 8) != 0 ? upgradeObjectEventUiState10.typeScreen : 0, ((-513) & 16) != 0 ? upgradeObjectEventUiState10.isUpgradeObjectPlayer : false, ((-513) & 32) != 0 ? upgradeObjectEventUiState10.upgradeObjectStrings : null, ((-513) & 64) != 0 ? upgradeObjectEventUiState10.upgradeObjectImages : null, ((-513) & 128) != 0 ? upgradeObjectEventUiState10.isLevelUpgradeObjectOpen : false, ((-513) & 256) != 0 ? upgradeObjectEventUiState10.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState10.isEnergyInfoOpen : false, ((-513) & 1024) != 0 ? upgradeObjectEventUiState10.isGiftQuestionOpen : false, ((-513) & 2048) != 0 ? upgradeObjectEventUiState10.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState10.isTopListOpen : false, ((-513) & 8192) != 0 ? upgradeObjectEventUiState10.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState10.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState10.isInfoVisible : false, ((-513) & 65536) != 0 ? upgradeObjectEventUiState10.eventLevel : 0, ((-513) & 131072) != 0 ? upgradeObjectEventUiState10.currency : 0, ((-513) & 262144) != 0 ? upgradeObjectEventUiState10.currencySpent : 0, ((-513) & 524288) != 0 ? upgradeObjectEventUiState10.currencyProgressScorePlayer : 0, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState10.currencyProgressScoreServer : 0, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState10.countGift : 0, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState10.serverId : 0, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState10.serverName : null, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState10.upgradePriceOne : 0, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState10.upgradePriceTwo : 0, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState10.upgradePriceThree : 0, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState10.isUpgradeOneEnable : false, ((-513) & 268435456) != 0 ? upgradeObjectEventUiState10.isUpgradeTwoEnable : false, ((-513) & 536870912) != 0 ? upgradeObjectEventUiState10.isUpgradeThreeEnable : false, ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState10.topServersList : null, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState10.placeInTop : 0, (255 & 1) != 0 ? upgradeObjectEventUiState10.placePLayerInTopList : 0, (255 & 2) != 0 ? upgradeObjectEventUiState10.levelPLayerInTopList : null, (255 & 4) != 0 ? upgradeObjectEventUiState10.namePLayerInTopList : null, (255 & 8) != 0 ? upgradeObjectEventUiState10.numberServer : 0, (255 & 16) != 0 ? upgradeObjectEventUiState10.topList : null, (255 & 32) != 0 ? upgradeObjectEventUiState10.awardsLevelList : null, (255 & 64) != 0 ? upgradeObjectEventUiState10.servers : null, (255 & 128) != 0 ? upgradeObjectEventUiState10.isNeedClose : false, (255 & 256) != 0 ? upgradeObjectEventUiState10.isBlockingLoading : false)));
        } else if (IntExtensionKt.isNotZero(Boxing.boxInt(i2))) {
            boolean z3 = z2;
            int i21 = i6;
            String str7 = serverName;
            if (i2 != 1) {
                int i22 = 0;
                Object obj3 = null;
                if (i2 == 2) {
                    int i23 = i2;
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("b");
                    if (jSONArrayOptJSONArray == null) {
                        arrayList = null;
                        iOptInt = jSONObject2.optInt(UpgradeObjectEventKeys.EVENT_SERVER_PLACE_IN_TOP_KEY);
                        String str8 = PngConstantsId68.BG_HOST_MACHINE;
                        int i24 = i5;
                        double d = 10;
                        int iRint = (int) (((int) (Math.rint((500 * Math.pow(1.05d, i3 - 1)) / d) * d)) * 3 * 0.5f);
                        if (arrayList == null) {
                        }
                        if (arrayList2 != null) {
                        }
                        if (AnyExtensionKt.isNull(obj3)) {
                            upgradeObjectEventTopListOfServersItem.setPlace(String.valueOf(iOptInt));
                            upgradeObjectEventTopListOfServersItem.setServerName(str2);
                            upgradeObjectEventTopListOfServersItem.setLevel(String.valueOf(i3));
                            upgradeObjectEventTopListOfServersItem.setPlayersServer(true);
                        }
                        if (!upgradeObjectEventViewModel.getUiState().getValue().getImages().isEmpty()) {
                        }
                    } else {
                        try {
                            arrayList = new ArrayList();
                            int length = jSONArrayOptJSONArray.length();
                            int i25 = 0;
                            while (i25 < length) {
                                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i25);
                                Intrinsics.checkNotNull(jSONObject3);
                                JSONArray jSONArray2 = jSONArrayOptJSONArray;
                                try {
                                    Gson gson = new Gson();
                                    String string = jSONObject3.toString();
                                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                    i9 = length;
                                    try {
                                        objFromJson = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) string).toString(), (Class<Object>) UpgradeObjectEventTopServersItemModel.class);
                                    } catch (Exception e) {
                                        e = e;
                                        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                                        firebaseCrashlytics.log(e.toString());
                                        firebaseCrashlytics.recordException(e);
                                        objFromJson = null;
                                        if (objFromJson == null) {
                                        }
                                        i25++;
                                        jSONArrayOptJSONArray = jSONArray2;
                                        length = i9;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    i9 = length;
                                }
                                if (objFromJson == null) {
                                    Boxing.boxBoolean(arrayList.add(objFromJson));
                                }
                                i25++;
                                jSONArrayOptJSONArray = jSONArray2;
                                length = i9;
                            }
                        } catch (Exception e3) {
                            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                            firebaseCrashlytics2.log(e3.toString());
                            firebaseCrashlytics2.recordException(e3);
                        }
                        iOptInt = jSONObject2.optInt(UpgradeObjectEventKeys.EVENT_SERVER_PLACE_IN_TOP_KEY);
                        String str82 = PngConstantsId68.BG_HOST_MACHINE;
                        int i242 = i5;
                        double d2 = 10;
                        int iRint2 = (int) (((int) (Math.rint((500 * Math.pow(1.05d, i3 - 1)) / d2) * d2)) * 3 * 0.5f);
                        if (arrayList == null) {
                            arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                int i26 = i22 + 1;
                                if (i22 < 0) {
                                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                                }
                                UpgradeObjectEventTopServersItemModel upgradeObjectEventTopServersItemModel = (UpgradeObjectEventTopServersItemModel) next;
                                String serverName3 = upgradeObjectEventViewModel.getServerName(upgradeObjectEventTopServersItemModel.getServerId(), list2);
                                String str9 = str7;
                                if (Intrinsics.areEqual(str9, serverName3)) {
                                    it = it2;
                                    str5 = str82;
                                    upgradeObjectEventTopListOfServersItem2 = new UpgradeObjectEventTopListOfServersItem(String.valueOf(i26), str9, upgradeObjectEventTopServersItemModel.getServerLevel(), true);
                                } else {
                                    it = it2;
                                    str5 = str82;
                                    upgradeObjectEventTopListOfServersItem2 = new UpgradeObjectEventTopListOfServersItem(String.valueOf(i26), serverName3, upgradeObjectEventTopServersItemModel.getServerLevel(), false, 8, null);
                                }
                                arrayList2.add(upgradeObjectEventTopListOfServersItem2);
                                it2 = it;
                                i22 = i26;
                                str82 = str5;
                                str7 = str9;
                            }
                            str2 = str7;
                            str3 = str82;
                        } else {
                            str2 = str7;
                            str3 = str82;
                            arrayList2 = null;
                        }
                        if (arrayList2 != null) {
                            Iterator it3 = arrayList2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next2 = it3.next();
                                if (Intrinsics.areEqual(((UpgradeObjectEventTopListOfServersItem) next2).getServerName(), str2)) {
                                    obj3 = next2;
                                    break;
                                }
                            }
                            obj3 = (UpgradeObjectEventTopListOfServersItem) obj3;
                        }
                        if (AnyExtensionKt.isNull(obj3) && arrayList2 != null && (upgradeObjectEventTopListOfServersItem = (UpgradeObjectEventTopListOfServersItem) CollectionsKt___CollectionsKt.lastOrNull((List) arrayList2)) != null) {
                            upgradeObjectEventTopListOfServersItem.setPlace(String.valueOf(iOptInt));
                            upgradeObjectEventTopListOfServersItem.setServerName(str2);
                            upgradeObjectEventTopListOfServersItem.setLevel(String.valueOf(i3));
                            upgradeObjectEventTopListOfServersItem.setPlayersServer(true);
                        }
                        if (!upgradeObjectEventViewModel.getUiState().getValue().getImages().isEmpty()) {
                            int iOptInt10 = jSONObject2.optInt("te");
                            UpgradeObjectEventStrings upgradeObjectEventStrings = new UpgradeObjectEventStrings(iOptInt10);
                            UpgradeObjectEventImages upgradeObjectEventImages = new UpgradeObjectEventImages(iOptInt10);
                            ArrayList arrayList4 = new ArrayList();
                            String strEmpty = AnyExtensionKt.empty(upgradeObjectEventViewModel);
                            if (iOptInt10 == 0) {
                                arrayList4.add(PngConstantsId68.CHRISTMAS_TREE_ONE);
                                arrayList4.add(PngConstantsId68.CHRISTMAS_TREE_TWO);
                                arrayList4.add(PngConstantsId68.CHRISTMAS_TREE_THREE);
                                arrayList4.add(PngConstantsId68.CHRISTMAS_TREE_FOUR);
                                str4 = SvgConstantsId68.BG_CHRISTMAS_TREE;
                            } else if (iOptInt10 != 1) {
                                str4 = strEmpty;
                            } else {
                                arrayList4.add(SvgConstantsId68.HOST_MACHINE_ONE);
                                arrayList4.add(SvgConstantsId68.HOST_MACHINE_TWO);
                                arrayList4.add(SvgConstantsId68.HOST_MACHINE_THREE);
                                arrayList4.add(SvgConstantsId68.HOST_MACHINE_FOUR);
                                str4 = str3;
                            }
                            Map<String, Bitmap> bitmapMapFromZip = BitmapUtilsKt.getBitmapMapFromZip(upgradeObjectEventViewModel.application, arrayList4, ImageTypePathInCDNEnum.IMAGE);
                            Bitmap bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(upgradeObjectEventViewModel.application, str4, ImageTypePathInCDNEnum.BACKGROUND, 0.0f, 0.0f, 24, null);
                            MutableStateFlow<UpgradeObjectEventUiState> mutableStateFlow3 = upgradeObjectEventViewModel.get_uiState();
                            while (true) {
                                UpgradeObjectEventUiState value11 = mutableStateFlow3.getValue();
                                UpgradeObjectEventUiState upgradeObjectEventUiState11 = value11;
                                String str10 = str2;
                                if (mutableStateFlow3.compareAndSet(value11, upgradeObjectEventUiState11.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState11.eventId : iOptInt10, ((-513) & 2) != 0 ? upgradeObjectEventUiState11.bgImage : bitmapFromZip$default, ((-513) & 4) != 0 ? upgradeObjectEventUiState11.images : bitmapMapFromZip, ((-513) & 8) != 0 ? upgradeObjectEventUiState11.typeScreen : i23, ((-513) & 16) != 0 ? upgradeObjectEventUiState11.isUpgradeObjectPlayer : false, ((-513) & 32) != 0 ? upgradeObjectEventUiState11.upgradeObjectStrings : upgradeObjectEventStrings, ((-513) & 64) != 0 ? upgradeObjectEventUiState11.upgradeObjectImages : upgradeObjectEventImages, ((-513) & 128) != 0 ? upgradeObjectEventUiState11.isLevelUpgradeObjectOpen : false, ((-513) & 256) != 0 ? upgradeObjectEventUiState11.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState11.isEnergyInfoOpen : false, ((-513) & 1024) != 0 ? upgradeObjectEventUiState11.isGiftQuestionOpen : false, ((-513) & 2048) != 0 ? upgradeObjectEventUiState11.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState11.isTopListOpen : false, ((-513) & 8192) != 0 ? upgradeObjectEventUiState11.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState11.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState11.isInfoVisible : false, ((-513) & 65536) != 0 ? upgradeObjectEventUiState11.eventLevel : i3, ((-513) & 131072) != 0 ? upgradeObjectEventUiState11.currency : i4, ((-513) & 262144) != 0 ? upgradeObjectEventUiState11.currencySpent : i242, ((-513) & 524288) != 0 ? upgradeObjectEventUiState11.currencyProgressScorePlayer : 0, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState11.currencyProgressScoreServer : iRint2, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState11.countGift : i21, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState11.serverId : i7, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState11.serverName : str10, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState11.upgradePriceOne : 0, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState11.upgradePriceTwo : 0, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState11.upgradePriceThree : 0, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState11.isUpgradeOneEnable : false, ((-513) & 268435456) != 0 ? upgradeObjectEventUiState11.isUpgradeTwoEnable : false, ((-513) & 536870912) != 0 ? upgradeObjectEventUiState11.isUpgradeThreeEnable : false, ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState11.topServersList : arrayList2, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState11.placeInTop : iOptInt, (255 & 1) != 0 ? upgradeObjectEventUiState11.placePLayerInTopList : 0, (255 & 2) != 0 ? upgradeObjectEventUiState11.levelPLayerInTopList : null, (255 & 4) != 0 ? upgradeObjectEventUiState11.namePLayerInTopList : null, (255 & 8) != 0 ? upgradeObjectEventUiState11.numberServer : 0, (255 & 16) != 0 ? upgradeObjectEventUiState11.topList : null, (255 & 32) != 0 ? upgradeObjectEventUiState11.awardsLevelList : awardsLevelList, (255 & 64) != 0 ? upgradeObjectEventUiState11.servers : list2, (255 & 128) != 0 ? upgradeObjectEventUiState11.isNeedClose : false, (255 & 256) != 0 ? upgradeObjectEventUiState11.isBlockingLoading : false))) {
                                    break;
                                }
                                str2 = str10;
                            }
                        } else {
                            String str11 = str2;
                            MutableStateFlow<UpgradeObjectEventUiState> mutableStateFlow4 = upgradeObjectEventViewModel.get_uiState();
                            do {
                                value3 = mutableStateFlow4.getValue();
                                upgradeObjectEventUiState3 = value3;
                            } while (!mutableStateFlow4.compareAndSet(value3, upgradeObjectEventUiState3.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState3.eventId : 0, ((-513) & 2) != 0 ? upgradeObjectEventUiState3.bgImage : null, ((-513) & 4) != 0 ? upgradeObjectEventUiState3.images : null, ((-513) & 8) != 0 ? upgradeObjectEventUiState3.typeScreen : i23, ((-513) & 16) != 0 ? upgradeObjectEventUiState3.isUpgradeObjectPlayer : false, ((-513) & 32) != 0 ? upgradeObjectEventUiState3.upgradeObjectStrings : null, ((-513) & 64) != 0 ? upgradeObjectEventUiState3.upgradeObjectImages : null, ((-513) & 128) != 0 ? upgradeObjectEventUiState3.isLevelUpgradeObjectOpen : false, ((-513) & 256) != 0 ? upgradeObjectEventUiState3.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState3.isEnergyInfoOpen : false, ((-513) & 1024) != 0 ? upgradeObjectEventUiState3.isGiftQuestionOpen : false, ((-513) & 2048) != 0 ? upgradeObjectEventUiState3.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState3.isTopListOpen : false, ((-513) & 8192) != 0 ? upgradeObjectEventUiState3.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState3.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState3.isInfoVisible : false, ((-513) & 65536) != 0 ? upgradeObjectEventUiState3.eventLevel : i3, ((-513) & 131072) != 0 ? upgradeObjectEventUiState3.currency : i4, ((-513) & 262144) != 0 ? upgradeObjectEventUiState3.currencySpent : i242, ((-513) & 524288) != 0 ? upgradeObjectEventUiState3.currencyProgressScorePlayer : 0, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState3.currencyProgressScoreServer : iRint2, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState3.countGift : i21, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState3.serverId : i7, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState3.serverName : str11, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState3.upgradePriceOne : 0, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState3.upgradePriceTwo : 0, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState3.upgradePriceThree : 0, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState3.isUpgradeOneEnable : false, ((-513) & 268435456) != 0 ? upgradeObjectEventUiState3.isUpgradeTwoEnable : false, ((-513) & 536870912) != 0 ? upgradeObjectEventUiState3.isUpgradeThreeEnable : false, ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState3.topServersList : arrayList2, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState3.placeInTop : iOptInt, (255 & 1) != 0 ? upgradeObjectEventUiState3.placePLayerInTopList : 0, (255 & 2) != 0 ? upgradeObjectEventUiState3.levelPLayerInTopList : null, (255 & 4) != 0 ? upgradeObjectEventUiState3.namePLayerInTopList : null, (255 & 8) != 0 ? upgradeObjectEventUiState3.numberServer : 0, (255 & 16) != 0 ? upgradeObjectEventUiState3.topList : null, (255 & 32) != 0 ? upgradeObjectEventUiState3.awardsLevelList : awardsLevelList, (255 & 64) != 0 ? upgradeObjectEventUiState3.servers : list2, (255 & 128) != 0 ? upgradeObjectEventUiState3.isNeedClose : false, (255 & 256) != 0 ? upgradeObjectEventUiState3.isBlockingLoading : false)));
                        }
                    }
                } else if (i2 == 3) {
                    int i27 = i2;
                    int iOptInt11 = jSONObject2.optInt("b", -1);
                    int iOptInt12 = jSONObject2.optInt(UpgradeObjectEventKeys.EVENT_UPGRADE_POSITION_KEY, -1);
                    if (i3 > upgradeObjectEventViewModel.get_uiState().getValue().getEventLevel()) {
                        i10 = 500;
                        i22 = 1;
                    } else {
                        i10 = 500;
                    }
                    double d3 = 10;
                    int iRint3 = ((int) (Math.rint((i10 * Math.pow(1.05d, i3 - 1)) / d3) * d3)) * 3;
                    if (!IntExtensionKt.isNotNegativeCommand(Boxing.boxInt(iOptInt11)) || !IntExtensionKt.isNotNegativeCommand(Boxing.boxInt(iOptInt12))) {
                        MutableStateFlow<UpgradeObjectEventUiState> mutableStateFlow5 = upgradeObjectEventViewModel.get_uiState();
                        do {
                            value4 = mutableStateFlow5.getValue();
                            upgradeObjectEventUiState4 = value4;
                        } while (!mutableStateFlow5.compareAndSet(value4, upgradeObjectEventUiState4.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState4.eventId : 0, ((-513) & 2) != 0 ? upgradeObjectEventUiState4.bgImage : null, ((-513) & 4) != 0 ? upgradeObjectEventUiState4.images : null, ((-513) & 8) != 0 ? upgradeObjectEventUiState4.typeScreen : 0, ((-513) & 16) != 0 ? upgradeObjectEventUiState4.isUpgradeObjectPlayer : false, ((-513) & 32) != 0 ? upgradeObjectEventUiState4.upgradeObjectStrings : null, ((-513) & 64) != 0 ? upgradeObjectEventUiState4.upgradeObjectImages : null, ((-513) & 128) != 0 ? upgradeObjectEventUiState4.isLevelUpgradeObjectOpen : false, ((-513) & 256) != 0 ? upgradeObjectEventUiState4.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState4.isEnergyInfoOpen : true, ((-513) & 1024) != 0 ? upgradeObjectEventUiState4.isGiftQuestionOpen : false, ((-513) & 2048) != 0 ? upgradeObjectEventUiState4.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState4.isTopListOpen : false, ((-513) & 8192) != 0 ? upgradeObjectEventUiState4.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState4.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState4.isInfoVisible : false, ((-513) & 65536) != 0 ? upgradeObjectEventUiState4.eventLevel : 0, ((-513) & 131072) != 0 ? upgradeObjectEventUiState4.currency : 0, ((-513) & 262144) != 0 ? upgradeObjectEventUiState4.currencySpent : 0, ((-513) & 524288) != 0 ? upgradeObjectEventUiState4.currencyProgressScorePlayer : 0, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState4.currencyProgressScoreServer : 0, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState4.countGift : 0, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState4.serverId : 0, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState4.serverName : null, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState4.upgradePriceOne : 0, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState4.upgradePriceTwo : 0, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState4.upgradePriceThree : 0, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState4.isUpgradeOneEnable : false, ((-513) & 268435456) != 0 ? upgradeObjectEventUiState4.isUpgradeTwoEnable : false, ((-513) & 536870912) != 0 ? upgradeObjectEventUiState4.isUpgradeThreeEnable : false, ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState4.topServersList : null, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState4.placeInTop : 0, (255 & 1) != 0 ? upgradeObjectEventUiState4.placePLayerInTopList : 0, (255 & 2) != 0 ? upgradeObjectEventUiState4.levelPLayerInTopList : null, (255 & 4) != 0 ? upgradeObjectEventUiState4.namePLayerInTopList : null, (255 & 8) != 0 ? upgradeObjectEventUiState4.numberServer : 0, (255 & 16) != 0 ? upgradeObjectEventUiState4.topList : null, (255 & 32) != 0 ? upgradeObjectEventUiState4.awardsLevelList : null, (255 & 64) != 0 ? upgradeObjectEventUiState4.servers : null, (255 & 128) != 0 ? upgradeObjectEventUiState4.isNeedClose : false, (255 & 256) != 0 ? upgradeObjectEventUiState4.isBlockingLoading : false)));
                    } else if (i22 != 0) {
                        MutableStateFlow<UpgradeObjectEventUiState> mutableStateFlow6 = upgradeObjectEventViewModel.get_uiState();
                        do {
                            value8 = mutableStateFlow6.getValue();
                            upgradeObjectEventUiState8 = value8;
                        } while (!mutableStateFlow6.compareAndSet(value8, upgradeObjectEventUiState8.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState8.eventId : 0, ((-513) & 2) != 0 ? upgradeObjectEventUiState8.bgImage : null, ((-513) & 4) != 0 ? upgradeObjectEventUiState8.images : null, ((-513) & 8) != 0 ? upgradeObjectEventUiState8.typeScreen : i27, ((-513) & 16) != 0 ? upgradeObjectEventUiState8.isUpgradeObjectPlayer : false, ((-513) & 32) != 0 ? upgradeObjectEventUiState8.upgradeObjectStrings : null, ((-513) & 64) != 0 ? upgradeObjectEventUiState8.upgradeObjectImages : null, ((-513) & 128) != 0 ? upgradeObjectEventUiState8.isLevelUpgradeObjectOpen : false, ((-513) & 256) != 0 ? upgradeObjectEventUiState8.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState8.isEnergyInfoOpen : false, ((-513) & 1024) != 0 ? upgradeObjectEventUiState8.isGiftQuestionOpen : false, ((-513) & 2048) != 0 ? upgradeObjectEventUiState8.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState8.isTopListOpen : false, ((-513) & 8192) != 0 ? upgradeObjectEventUiState8.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState8.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState8.isInfoVisible : false, ((-513) & 65536) != 0 ? upgradeObjectEventUiState8.eventLevel : i3, ((-513) & 131072) != 0 ? upgradeObjectEventUiState8.currency : i4, ((-513) & 262144) != 0 ? upgradeObjectEventUiState8.currencySpent : i5, ((-513) & 524288) != 0 ? upgradeObjectEventUiState8.currencyProgressScorePlayer : iRint3, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState8.currencyProgressScoreServer : 0, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState8.countGift : 0, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState8.serverId : 0, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState8.serverName : null, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState8.upgradePriceOne : iOptInt11, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState8.upgradePriceTwo : iOptInt11, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState8.upgradePriceThree : iOptInt11, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState8.isUpgradeOneEnable : true, ((-513) & 268435456) != 0 ? upgradeObjectEventUiState8.isUpgradeTwoEnable : true, ((-513) & 536870912) != 0 ? upgradeObjectEventUiState8.isUpgradeThreeEnable : true, ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState8.topServersList : null, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState8.placeInTop : 0, (255 & 1) != 0 ? upgradeObjectEventUiState8.placePLayerInTopList : 0, (255 & 2) != 0 ? upgradeObjectEventUiState8.levelPLayerInTopList : null, (255 & 4) != 0 ? upgradeObjectEventUiState8.namePLayerInTopList : null, (255 & 8) != 0 ? upgradeObjectEventUiState8.numberServer : 0, (255 & 16) != 0 ? upgradeObjectEventUiState8.topList : null, (255 & 32) != 0 ? upgradeObjectEventUiState8.awardsLevelList : awardsLevelList, (255 & 64) != 0 ? upgradeObjectEventUiState8.servers : list2, (255 & 128) != 0 ? upgradeObjectEventUiState8.isNeedClose : false, (255 & 256) != 0 ? upgradeObjectEventUiState8.isBlockingLoading : false)));
                    } else if (iOptInt12 == 1) {
                        MutableStateFlow<UpgradeObjectEventUiState> mutableStateFlow7 = upgradeObjectEventViewModel.get_uiState();
                        do {
                            value5 = mutableStateFlow7.getValue();
                            upgradeObjectEventUiState5 = value5;
                        } while (!mutableStateFlow7.compareAndSet(value5, upgradeObjectEventUiState5.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState5.eventId : 0, ((-513) & 2) != 0 ? upgradeObjectEventUiState5.bgImage : null, ((-513) & 4) != 0 ? upgradeObjectEventUiState5.images : null, ((-513) & 8) != 0 ? upgradeObjectEventUiState5.typeScreen : i27, ((-513) & 16) != 0 ? upgradeObjectEventUiState5.isUpgradeObjectPlayer : false, ((-513) & 32) != 0 ? upgradeObjectEventUiState5.upgradeObjectStrings : null, ((-513) & 64) != 0 ? upgradeObjectEventUiState5.upgradeObjectImages : null, ((-513) & 128) != 0 ? upgradeObjectEventUiState5.isLevelUpgradeObjectOpen : false, ((-513) & 256) != 0 ? upgradeObjectEventUiState5.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState5.isEnergyInfoOpen : false, ((-513) & 1024) != 0 ? upgradeObjectEventUiState5.isGiftQuestionOpen : false, ((-513) & 2048) != 0 ? upgradeObjectEventUiState5.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState5.isTopListOpen : false, ((-513) & 8192) != 0 ? upgradeObjectEventUiState5.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState5.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState5.isInfoVisible : false, ((-513) & 65536) != 0 ? upgradeObjectEventUiState5.eventLevel : i3, ((-513) & 131072) != 0 ? upgradeObjectEventUiState5.currency : i4, ((-513) & 262144) != 0 ? upgradeObjectEventUiState5.currencySpent : i5, ((-513) & 524288) != 0 ? upgradeObjectEventUiState5.currencyProgressScorePlayer : 0, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState5.currencyProgressScoreServer : 0, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState5.countGift : 0, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState5.serverId : 0, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState5.serverName : null, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState5.upgradePriceOne : iOptInt11, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState5.upgradePriceTwo : 0, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState5.upgradePriceThree : 0, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState5.isUpgradeOneEnable : false, ((-513) & 268435456) != 0 ? upgradeObjectEventUiState5.isUpgradeTwoEnable : false, ((-513) & 536870912) != 0 ? upgradeObjectEventUiState5.isUpgradeThreeEnable : false, ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState5.topServersList : null, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState5.placeInTop : 0, (255 & 1) != 0 ? upgradeObjectEventUiState5.placePLayerInTopList : 0, (255 & 2) != 0 ? upgradeObjectEventUiState5.levelPLayerInTopList : null, (255 & 4) != 0 ? upgradeObjectEventUiState5.namePLayerInTopList : null, (255 & 8) != 0 ? upgradeObjectEventUiState5.numberServer : 0, (255 & 16) != 0 ? upgradeObjectEventUiState5.topList : null, (255 & 32) != 0 ? upgradeObjectEventUiState5.awardsLevelList : awardsLevelList, (255 & 64) != 0 ? upgradeObjectEventUiState5.servers : list2, (255 & 128) != 0 ? upgradeObjectEventUiState5.isNeedClose : false, (255 & 256) != 0 ? upgradeObjectEventUiState5.isBlockingLoading : false)));
                    } else if (iOptInt12 == 2) {
                        MutableStateFlow<UpgradeObjectEventUiState> mutableStateFlow8 = upgradeObjectEventViewModel.get_uiState();
                        do {
                            value6 = mutableStateFlow8.getValue();
                            upgradeObjectEventUiState6 = value6;
                        } while (!mutableStateFlow8.compareAndSet(value6, upgradeObjectEventUiState6.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState6.eventId : 0, ((-513) & 2) != 0 ? upgradeObjectEventUiState6.bgImage : null, ((-513) & 4) != 0 ? upgradeObjectEventUiState6.images : null, ((-513) & 8) != 0 ? upgradeObjectEventUiState6.typeScreen : i27, ((-513) & 16) != 0 ? upgradeObjectEventUiState6.isUpgradeObjectPlayer : false, ((-513) & 32) != 0 ? upgradeObjectEventUiState6.upgradeObjectStrings : null, ((-513) & 64) != 0 ? upgradeObjectEventUiState6.upgradeObjectImages : null, ((-513) & 128) != 0 ? upgradeObjectEventUiState6.isLevelUpgradeObjectOpen : false, ((-513) & 256) != 0 ? upgradeObjectEventUiState6.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState6.isEnergyInfoOpen : false, ((-513) & 1024) != 0 ? upgradeObjectEventUiState6.isGiftQuestionOpen : false, ((-513) & 2048) != 0 ? upgradeObjectEventUiState6.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState6.isTopListOpen : false, ((-513) & 8192) != 0 ? upgradeObjectEventUiState6.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState6.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState6.isInfoVisible : false, ((-513) & 65536) != 0 ? upgradeObjectEventUiState6.eventLevel : i3, ((-513) & 131072) != 0 ? upgradeObjectEventUiState6.currency : i4, ((-513) & 262144) != 0 ? upgradeObjectEventUiState6.currencySpent : i5, ((-513) & 524288) != 0 ? upgradeObjectEventUiState6.currencyProgressScorePlayer : 0, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState6.currencyProgressScoreServer : 0, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState6.countGift : 0, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState6.serverId : 0, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState6.serverName : null, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState6.upgradePriceOne : 0, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState6.upgradePriceTwo : iOptInt11, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState6.upgradePriceThree : 0, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState6.isUpgradeOneEnable : false, ((-513) & 268435456) != 0 ? upgradeObjectEventUiState6.isUpgradeTwoEnable : false, ((-513) & 536870912) != 0 ? upgradeObjectEventUiState6.isUpgradeThreeEnable : false, ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState6.topServersList : null, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState6.placeInTop : 0, (255 & 1) != 0 ? upgradeObjectEventUiState6.placePLayerInTopList : 0, (255 & 2) != 0 ? upgradeObjectEventUiState6.levelPLayerInTopList : null, (255 & 4) != 0 ? upgradeObjectEventUiState6.namePLayerInTopList : null, (255 & 8) != 0 ? upgradeObjectEventUiState6.numberServer : 0, (255 & 16) != 0 ? upgradeObjectEventUiState6.topList : null, (255 & 32) != 0 ? upgradeObjectEventUiState6.awardsLevelList : awardsLevelList, (255 & 64) != 0 ? upgradeObjectEventUiState6.servers : list2, (255 & 128) != 0 ? upgradeObjectEventUiState6.isNeedClose : false, (255 & 256) != 0 ? upgradeObjectEventUiState6.isBlockingLoading : false)));
                    } else if (iOptInt12 == 3) {
                        MutableStateFlow<UpgradeObjectEventUiState> mutableStateFlow9 = upgradeObjectEventViewModel.get_uiState();
                        do {
                            value7 = mutableStateFlow9.getValue();
                            upgradeObjectEventUiState7 = value7;
                        } while (!mutableStateFlow9.compareAndSet(value7, upgradeObjectEventUiState7.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState7.eventId : 0, ((-513) & 2) != 0 ? upgradeObjectEventUiState7.bgImage : null, ((-513) & 4) != 0 ? upgradeObjectEventUiState7.images : null, ((-513) & 8) != 0 ? upgradeObjectEventUiState7.typeScreen : i27, ((-513) & 16) != 0 ? upgradeObjectEventUiState7.isUpgradeObjectPlayer : false, ((-513) & 32) != 0 ? upgradeObjectEventUiState7.upgradeObjectStrings : null, ((-513) & 64) != 0 ? upgradeObjectEventUiState7.upgradeObjectImages : null, ((-513) & 128) != 0 ? upgradeObjectEventUiState7.isLevelUpgradeObjectOpen : false, ((-513) & 256) != 0 ? upgradeObjectEventUiState7.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState7.isEnergyInfoOpen : false, ((-513) & 1024) != 0 ? upgradeObjectEventUiState7.isGiftQuestionOpen : false, ((-513) & 2048) != 0 ? upgradeObjectEventUiState7.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState7.isTopListOpen : false, ((-513) & 8192) != 0 ? upgradeObjectEventUiState7.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState7.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState7.isInfoVisible : false, ((-513) & 65536) != 0 ? upgradeObjectEventUiState7.eventLevel : i3, ((-513) & 131072) != 0 ? upgradeObjectEventUiState7.currency : i4, ((-513) & 262144) != 0 ? upgradeObjectEventUiState7.currencySpent : i5, ((-513) & 524288) != 0 ? upgradeObjectEventUiState7.currencyProgressScorePlayer : 0, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState7.currencyProgressScoreServer : 0, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState7.countGift : 0, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState7.serverId : 0, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState7.serverName : null, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState7.upgradePriceOne : 0, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState7.upgradePriceTwo : 0, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState7.upgradePriceThree : iOptInt11, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState7.isUpgradeOneEnable : false, ((-513) & 268435456) != 0 ? upgradeObjectEventUiState7.isUpgradeTwoEnable : false, ((-513) & 536870912) != 0 ? upgradeObjectEventUiState7.isUpgradeThreeEnable : false, ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState7.topServersList : null, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState7.placeInTop : 0, (255 & 1) != 0 ? upgradeObjectEventUiState7.placePLayerInTopList : 0, (255 & 2) != 0 ? upgradeObjectEventUiState7.levelPLayerInTopList : null, (255 & 4) != 0 ? upgradeObjectEventUiState7.namePLayerInTopList : null, (255 & 8) != 0 ? upgradeObjectEventUiState7.numberServer : 0, (255 & 16) != 0 ? upgradeObjectEventUiState7.topList : null, (255 & 32) != 0 ? upgradeObjectEventUiState7.awardsLevelList : awardsLevelList, (255 & 64) != 0 ? upgradeObjectEventUiState7.servers : list2, (255 & 128) != 0 ? upgradeObjectEventUiState7.isNeedClose : false, (255 & 256) != 0 ? upgradeObjectEventUiState7.isBlockingLoading : false)));
                    }
                } else if (i2 == 4 || i2 == 5) {
                    int iOptInt13 = jSONObject2.optInt(UpgradeObjectEventKeys.EVENT_TOP_LIST_PLACE_PLAYER_KEY);
                    String strValueOf = String.valueOf(jSONObject2.optInt("ml"));
                    String strOptString = jSONObject2.optString(UpgradeObjectEventKeys.EVENT_TOP_LIST_NAME_PLAYER_KEY);
                    int iOptInt14 = jSONObject2.optInt(UpgradeObjectEventKeys.EVENT_TOP_LIST_SERVER_ID_PLAYER_KEY);
                    String serverName4 = upgradeObjectEventViewModel.getServerName(iOptInt14, list2);
                    JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("tb");
                    if (jSONArrayOptJSONArray2 == null) {
                        arrayList3 = null;
                        if (arrayList3 == null) {
                        }
                        if (upgradeObjectEventViewModel.get_uiState().getValue().getNamePLayerInTopList().length() <= 0) {
                        }
                        mutableStateFlow = upgradeObjectEventViewModel.get_uiState();
                        while (true) {
                            value9 = mutableStateFlow.getValue();
                            upgradeObjectEventUiState9 = value9;
                            Intrinsics.checkNotNull(strOptString);
                            i11 = i2;
                            if (!mutableStateFlow.compareAndSet(value9, upgradeObjectEventUiState9.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState9.eventId : 0, ((-513) & 2) != 0 ? upgradeObjectEventUiState9.bgImage : null, ((-513) & 4) != 0 ? upgradeObjectEventUiState9.images : null, ((-513) & 8) != 0 ? upgradeObjectEventUiState9.typeScreen : i11, ((-513) & 16) != 0 ? upgradeObjectEventUiState9.isUpgradeObjectPlayer : false, ((-513) & 32) != 0 ? upgradeObjectEventUiState9.upgradeObjectStrings : null, ((-513) & 64) != 0 ? upgradeObjectEventUiState9.upgradeObjectImages : null, ((-513) & 128) != 0 ? upgradeObjectEventUiState9.isLevelUpgradeObjectOpen : false, ((-513) & 256) != 0 ? upgradeObjectEventUiState9.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState9.isEnergyInfoOpen : false, ((-513) & 1024) != 0 ? upgradeObjectEventUiState9.isGiftQuestionOpen : false, ((-513) & 2048) != 0 ? upgradeObjectEventUiState9.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState9.isTopListOpen : true, ((-513) & 8192) != 0 ? upgradeObjectEventUiState9.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState9.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState9.isInfoVisible : false, ((-513) & 65536) != 0 ? upgradeObjectEventUiState9.eventLevel : 0, ((-513) & 131072) != 0 ? upgradeObjectEventUiState9.currency : 0, ((-513) & 262144) != 0 ? upgradeObjectEventUiState9.currencySpent : 0, ((-513) & 524288) != 0 ? upgradeObjectEventUiState9.currencyProgressScorePlayer : 0, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState9.currencyProgressScoreServer : 0, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState9.countGift : 0, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState9.serverId : i7, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState9.serverName : serverName4, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState9.upgradePriceOne : 0, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState9.upgradePriceTwo : 0, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState9.upgradePriceThree : 0, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState9.isUpgradeOneEnable : false, ((-513) & 268435456) != 0 ? upgradeObjectEventUiState9.isUpgradeTwoEnable : false, ((-513) & 536870912) != 0 ? upgradeObjectEventUiState9.isUpgradeThreeEnable : false, ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState9.topServersList : null, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState9.placeInTop : 0, (255 & 1) != 0 ? upgradeObjectEventUiState9.placePLayerInTopList : iOptInt13, (255 & 2) != 0 ? upgradeObjectEventUiState9.levelPLayerInTopList : strValueOf, (255 & 4) != 0 ? upgradeObjectEventUiState9.namePLayerInTopList : strOptString, (255 & 8) != 0 ? upgradeObjectEventUiState9.numberServer : iOptInt14, (255 & 16) != 0 ? upgradeObjectEventUiState9.topList : mutableList, (255 & 32) != 0 ? upgradeObjectEventUiState9.awardsLevelList : null, (255 & 64) != 0 ? upgradeObjectEventUiState9.servers : list2, (255 & 128) != 0 ? upgradeObjectEventUiState9.isNeedClose : false, (255 & 256) != 0 ? upgradeObjectEventUiState9.isBlockingLoading : false))) {
                            }
                            i2 = i11;
                        }
                    } else {
                        try {
                            arrayList3 = new ArrayList();
                            int length2 = jSONArrayOptJSONArray2.length();
                            int i28 = 0;
                            while (i28 < length2) {
                                JSONObject jSONObject4 = jSONArrayOptJSONArray2.getJSONObject(i28);
                                Intrinsics.checkNotNull(jSONObject4);
                                try {
                                    Gson gson2 = new Gson();
                                    String string2 = jSONObject4.toString();
                                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                    jSONArray = jSONArrayOptJSONArray2;
                                    try {
                                        objFromJson2 = gson2.fromJson(StringsKt__StringsKt.trim((CharSequence) string2).toString(), (Class<Object>) UpgradeObjectEventTopListItemModel.class);
                                    } catch (Exception e4) {
                                        e = e4;
                                        FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                                        firebaseCrashlytics3.log(e.toString());
                                        firebaseCrashlytics3.recordException(e);
                                        objFromJson2 = null;
                                        if (objFromJson2 == null) {
                                        }
                                        i28++;
                                        jSONArrayOptJSONArray2 = jSONArray;
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    jSONArray = jSONArrayOptJSONArray2;
                                }
                                if (objFromJson2 == null) {
                                    Boxing.boxBoolean(arrayList3.add(objFromJson2));
                                }
                                i28++;
                                jSONArrayOptJSONArray2 = jSONArray;
                            }
                        } catch (Exception e6) {
                            FirebaseCrashlytics firebaseCrashlytics4 = FirebaseCrashlytics.getInstance();
                            firebaseCrashlytics4.log(e6.toString());
                            firebaseCrashlytics4.recordException(e6);
                        }
                        if (arrayList3 == null) {
                            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                            Iterator it4 = arrayList3.iterator();
                            while (true) {
                                int i29 = i22;
                                if (!it4.hasNext()) {
                                    break;
                                }
                                Object next3 = it4.next();
                                i22 = i29 + 1;
                                if (i29 < 0) {
                                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                                }
                                UpgradeObjectEventTopListItemModel upgradeObjectEventTopListItemModel = (UpgradeObjectEventTopListItemModel) next3;
                                String strValueOf2 = String.valueOf(i22);
                                String playerName = upgradeObjectEventTopListItemModel.getPlayerName();
                                String str12 = playerName == null ? "" : playerName;
                                String strValueOf3 = String.valueOf(IntExtensionKt.getOrZero(upgradeObjectEventTopListItemModel.getPlayerLevel()));
                                if (upgradeObjectEventTopListItemModel.getServerId() == null || (serverName2 = upgradeObjectEventViewModel.getServerName(upgradeObjectEventTopListItemModel.getServerId().intValue(), list2)) == null) {
                                    String str13 = (String) UtilsKt.buildTypeMerge((upgradeObjectAwardsResponse2 == null || (awardsTopDto3 = upgradeObjectAwardsResponse2.getAwardsTopDto()) == null || (awardsTopDto4 = (AwardsTopDto) CollectionsKt___CollectionsKt.getOrNull(awardsTopDto3, i29)) == null) ? null : awardsTopDto4.getDescription(), (upgradeObjectAwardsResponse2 == null || (awardsTopDto = upgradeObjectAwardsResponse2.getAwardsTopDto()) == null || (awardsTopDto2 = (AwardsTopDto) CollectionsKt___CollectionsKt.getOrNull(awardsTopDto, i29)) == null) ? null : awardsTopDto2.getDescriptionStore());
                                    str6 = str13 == null ? "" : str13;
                                } else {
                                    str6 = serverName2;
                                }
                                arrayList5.add(new CommonEventTopListModel(strValueOf2, str12, strValueOf3, str6, serverName4));
                            }
                            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList5);
                        } else {
                            mutableList = null;
                        }
                        if (upgradeObjectEventViewModel.get_uiState().getValue().getNamePLayerInTopList().length() <= 0) {
                            if (mutableList != null) {
                                Iterator it5 = mutableList.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        break;
                                    }
                                    Object next4 = it5.next();
                                    if (Intrinsics.areEqual(((CommonEventTopListModel) next4).getPlayerName(), upgradeObjectEventViewModel.get_uiState().getValue().getNamePLayerInTopList())) {
                                        obj3 = next4;
                                        break;
                                    }
                                }
                                if (((CommonEventTopListModel) obj3) == null) {
                                    if (mutableList != null) {
                                    }
                                }
                            }
                        } else if (mutableList != null) {
                            Iterator it6 = mutableList.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    break;
                                }
                                Object next5 = it6.next();
                                if (Intrinsics.areEqual(((CommonEventTopListModel) next5).getPlayerName(), strOptString)) {
                                    obj3 = next5;
                                    break;
                                }
                            }
                            if (((CommonEventTopListModel) obj3) == null) {
                                if (mutableList != null) {
                                }
                            }
                        }
                        mutableStateFlow = upgradeObjectEventViewModel.get_uiState();
                        while (true) {
                            value9 = mutableStateFlow.getValue();
                            upgradeObjectEventUiState9 = value9;
                            Intrinsics.checkNotNull(strOptString);
                            i11 = i2;
                            if (!mutableStateFlow.compareAndSet(value9, upgradeObjectEventUiState9.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState9.eventId : 0, ((-513) & 2) != 0 ? upgradeObjectEventUiState9.bgImage : null, ((-513) & 4) != 0 ? upgradeObjectEventUiState9.images : null, ((-513) & 8) != 0 ? upgradeObjectEventUiState9.typeScreen : i11, ((-513) & 16) != 0 ? upgradeObjectEventUiState9.isUpgradeObjectPlayer : false, ((-513) & 32) != 0 ? upgradeObjectEventUiState9.upgradeObjectStrings : null, ((-513) & 64) != 0 ? upgradeObjectEventUiState9.upgradeObjectImages : null, ((-513) & 128) != 0 ? upgradeObjectEventUiState9.isLevelUpgradeObjectOpen : false, ((-513) & 256) != 0 ? upgradeObjectEventUiState9.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState9.isEnergyInfoOpen : false, ((-513) & 1024) != 0 ? upgradeObjectEventUiState9.isGiftQuestionOpen : false, ((-513) & 2048) != 0 ? upgradeObjectEventUiState9.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState9.isTopListOpen : true, ((-513) & 8192) != 0 ? upgradeObjectEventUiState9.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState9.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState9.isInfoVisible : false, ((-513) & 65536) != 0 ? upgradeObjectEventUiState9.eventLevel : 0, ((-513) & 131072) != 0 ? upgradeObjectEventUiState9.currency : 0, ((-513) & 262144) != 0 ? upgradeObjectEventUiState9.currencySpent : 0, ((-513) & 524288) != 0 ? upgradeObjectEventUiState9.currencyProgressScorePlayer : 0, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState9.currencyProgressScoreServer : 0, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState9.countGift : 0, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState9.serverId : i7, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState9.serverName : serverName4, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState9.upgradePriceOne : 0, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState9.upgradePriceTwo : 0, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState9.upgradePriceThree : 0, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState9.isUpgradeOneEnable : false, ((-513) & 268435456) != 0 ? upgradeObjectEventUiState9.isUpgradeTwoEnable : false, ((-513) & 536870912) != 0 ? upgradeObjectEventUiState9.isUpgradeThreeEnable : false, ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState9.topServersList : null, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState9.placeInTop : 0, (255 & 1) != 0 ? upgradeObjectEventUiState9.placePLayerInTopList : iOptInt13, (255 & 2) != 0 ? upgradeObjectEventUiState9.levelPLayerInTopList : strValueOf, (255 & 4) != 0 ? upgradeObjectEventUiState9.namePLayerInTopList : strOptString, (255 & 8) != 0 ? upgradeObjectEventUiState9.numberServer : iOptInt14, (255 & 16) != 0 ? upgradeObjectEventUiState9.topList : mutableList, (255 & 32) != 0 ? upgradeObjectEventUiState9.awardsLevelList : null, (255 & 64) != 0 ? upgradeObjectEventUiState9.servers : list2, (255 & 128) != 0 ? upgradeObjectEventUiState9.isNeedClose : false, (255 & 256) != 0 ? upgradeObjectEventUiState9.isBlockingLoading : false))) {
                                break;
                            }
                            i2 = i11;
                        }
                    }
                }
            } else {
                int i30 = i5;
                int i31 = i2;
                int iOptInt15 = jSONObject2.optInt("b1");
                int iOptInt16 = jSONObject2.optInt("b2");
                int iOptInt17 = jSONObject2.optInt(UpgradeObjectEventKeys.EVENT_UPGRADE_PRICE_THREE_KEY);
                JSONObject jSONObject5 = jSONObject2;
                List<Server> list4 = list2;
                double d4 = 10;
                int iRint4 = ((int) (Math.rint((500 * Math.pow(1.05d, i3 - 1)) / d4) * d4)) * 3;
                if (z3) {
                    MutableStateFlow<UpgradeObjectEventUiState> mutableStateFlow10 = upgradeObjectEventViewModel.get_uiState();
                    do {
                        value2 = mutableStateFlow10.getValue();
                        upgradeObjectEventUiState2 = value2;
                    } while (!mutableStateFlow10.compareAndSet(value2, upgradeObjectEventUiState2.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState2.eventId : 0, ((-513) & 2) != 0 ? upgradeObjectEventUiState2.bgImage : null, ((-513) & 4) != 0 ? upgradeObjectEventUiState2.images : null, ((-513) & 8) != 0 ? upgradeObjectEventUiState2.typeScreen : i31, ((-513) & 16) != 0 ? upgradeObjectEventUiState2.isUpgradeObjectPlayer : true, ((-513) & 32) != 0 ? upgradeObjectEventUiState2.upgradeObjectStrings : null, ((-513) & 64) != 0 ? upgradeObjectEventUiState2.upgradeObjectImages : null, ((-513) & 128) != 0 ? upgradeObjectEventUiState2.isLevelUpgradeObjectOpen : false, ((-513) & 256) != 0 ? upgradeObjectEventUiState2.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState2.isEnergyInfoOpen : false, ((-513) & 1024) != 0 ? upgradeObjectEventUiState2.isGiftQuestionOpen : false, ((-513) & 2048) != 0 ? upgradeObjectEventUiState2.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState2.isTopListOpen : false, ((-513) & 8192) != 0 ? upgradeObjectEventUiState2.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState2.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState2.isInfoVisible : false, ((-513) & 65536) != 0 ? upgradeObjectEventUiState2.eventLevel : i3, ((-513) & 131072) != 0 ? upgradeObjectEventUiState2.currency : i4, ((-513) & 262144) != 0 ? upgradeObjectEventUiState2.currencySpent : i30, ((-513) & 524288) != 0 ? upgradeObjectEventUiState2.currencyProgressScorePlayer : iRint4, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState2.currencyProgressScoreServer : 0, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState2.countGift : i21, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState2.serverId : i7, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState2.serverName : str7, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState2.upgradePriceOne : iOptInt15, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState2.upgradePriceTwo : iOptInt16, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState2.upgradePriceThree : iOptInt17, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState2.isUpgradeOneEnable : IntExtensionKt.isNotNegativeCommand(Boxing.boxInt(iOptInt15)), ((-513) & 268435456) != 0 ? upgradeObjectEventUiState2.isUpgradeTwoEnable : IntExtensionKt.isNotNegativeCommand(Boxing.boxInt(iOptInt16)), ((-513) & 536870912) != 0 ? upgradeObjectEventUiState2.isUpgradeThreeEnable : IntExtensionKt.isNotNegativeCommand(Boxing.boxInt(iOptInt17)), ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState2.topServersList : null, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState2.placeInTop : 0, (255 & 1) != 0 ? upgradeObjectEventUiState2.placePLayerInTopList : 0, (255 & 2) != 0 ? upgradeObjectEventUiState2.levelPLayerInTopList : null, (255 & 4) != 0 ? upgradeObjectEventUiState2.namePLayerInTopList : null, (255 & 8) != 0 ? upgradeObjectEventUiState2.numberServer : 0, (255 & 16) != 0 ? upgradeObjectEventUiState2.topList : null, (255 & 32) != 0 ? upgradeObjectEventUiState2.awardsLevelList : awardsLevelList, (255 & 64) != 0 ? upgradeObjectEventUiState2.servers : list4, (255 & 128) != 0 ? upgradeObjectEventUiState2.isNeedClose : false, (255 & 256) != 0 ? upgradeObjectEventUiState2.isBlockingLoading : false)));
                } else {
                    int iOptInt18 = jSONObject5.optInt("te");
                    UpgradeObjectEventStrings upgradeObjectEventStrings2 = new UpgradeObjectEventStrings(iOptInt18);
                    UpgradeObjectEventImages upgradeObjectEventImages2 = new UpgradeObjectEventImages(iOptInt18);
                    ArrayList arrayList6 = new ArrayList();
                    String strEmpty2 = AnyExtensionKt.empty(upgradeObjectEventViewModel);
                    if (iOptInt18 == 0) {
                        arrayList6.add(PngConstantsId68.CHRISTMAS_TREE_ONE);
                        arrayList6.add(PngConstantsId68.CHRISTMAS_TREE_TWO);
                        arrayList6.add(PngConstantsId68.CHRISTMAS_TREE_THREE);
                        arrayList6.add(PngConstantsId68.CHRISTMAS_TREE_FOUR);
                        str = SvgConstantsId68.BG_CHRISTMAS_TREE;
                    } else if (iOptInt18 != 1) {
                        str = strEmpty2;
                    } else {
                        arrayList6.add(PngConstantsId68.BG_HOST_MACHINE);
                        arrayList6.add(SvgConstantsId68.HOST_MACHINE_ONE);
                        arrayList6.add(SvgConstantsId68.HOST_MACHINE_TWO);
                        arrayList6.add(SvgConstantsId68.HOST_MACHINE_THREE);
                        arrayList6.add(SvgConstantsId68.HOST_MACHINE_FOUR);
                        str = PngConstantsId68.BG_HOST_MACHINE;
                    }
                    Map<String, Bitmap> bitmapMapFromZip2 = BitmapUtilsKt.getBitmapMapFromZip(upgradeObjectEventViewModel.application, arrayList6, ImageTypePathInCDNEnum.IMAGE);
                    Bitmap bitmapFromZip$default2 = BitmapUtilsKt.getBitmapFromZip$default(upgradeObjectEventViewModel.application, str, ImageTypePathInCDNEnum.BACKGROUND, 0.0f, 0.0f, 24, null);
                    MutableStateFlow<UpgradeObjectEventUiState> mutableStateFlow11 = upgradeObjectEventViewModel.get_uiState();
                    do {
                        value = mutableStateFlow11.getValue();
                        upgradeObjectEventUiState = value;
                    } while (!mutableStateFlow11.compareAndSet(value, upgradeObjectEventUiState.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState.eventId : iOptInt18, ((-513) & 2) != 0 ? upgradeObjectEventUiState.bgImage : bitmapFromZip$default2, ((-513) & 4) != 0 ? upgradeObjectEventUiState.images : bitmapMapFromZip2, ((-513) & 8) != 0 ? upgradeObjectEventUiState.typeScreen : i31, ((-513) & 16) != 0 ? upgradeObjectEventUiState.isUpgradeObjectPlayer : true, ((-513) & 32) != 0 ? upgradeObjectEventUiState.upgradeObjectStrings : upgradeObjectEventStrings2, ((-513) & 64) != 0 ? upgradeObjectEventUiState.upgradeObjectImages : upgradeObjectEventImages2, ((-513) & 128) != 0 ? upgradeObjectEventUiState.isLevelUpgradeObjectOpen : false, ((-513) & 256) != 0 ? upgradeObjectEventUiState.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState.isEnergyInfoOpen : false, ((-513) & 1024) != 0 ? upgradeObjectEventUiState.isGiftQuestionOpen : false, ((-513) & 2048) != 0 ? upgradeObjectEventUiState.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState.isTopListOpen : false, ((-513) & 8192) != 0 ? upgradeObjectEventUiState.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState.isInfoVisible : false, ((-513) & 65536) != 0 ? upgradeObjectEventUiState.eventLevel : i3, ((-513) & 131072) != 0 ? upgradeObjectEventUiState.currency : i4, ((-513) & 262144) != 0 ? upgradeObjectEventUiState.currencySpent : i30, ((-513) & 524288) != 0 ? upgradeObjectEventUiState.currencyProgressScorePlayer : iRint4, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState.currencyProgressScoreServer : 0, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState.countGift : i21, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState.serverId : i7, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState.serverName : str7, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState.upgradePriceOne : iOptInt15, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState.upgradePriceTwo : iOptInt16, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState.upgradePriceThree : iOptInt17, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState.isUpgradeOneEnable : IntExtensionKt.isNotNegativeCommand(Boxing.boxInt(iOptInt15)), ((-513) & 268435456) != 0 ? upgradeObjectEventUiState.isUpgradeTwoEnable : IntExtensionKt.isNotNegativeCommand(Boxing.boxInt(iOptInt16)), ((-513) & 536870912) != 0 ? upgradeObjectEventUiState.isUpgradeThreeEnable : IntExtensionKt.isNotNegativeCommand(Boxing.boxInt(iOptInt17)), ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState.topServersList : null, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState.placeInTop : 0, (255 & 1) != 0 ? upgradeObjectEventUiState.placePLayerInTopList : 0, (255 & 2) != 0 ? upgradeObjectEventUiState.levelPLayerInTopList : null, (255 & 4) != 0 ? upgradeObjectEventUiState.namePLayerInTopList : null, (255 & 8) != 0 ? upgradeObjectEventUiState.numberServer : 0, (255 & 16) != 0 ? upgradeObjectEventUiState.topList : null, (255 & 32) != 0 ? upgradeObjectEventUiState.awardsLevelList : awardsLevelList, (255 & 64) != 0 ? upgradeObjectEventUiState.servers : list4, (255 & 128) != 0 ? upgradeObjectEventUiState.isNeedClose : false, (255 & 256) != 0 ? upgradeObjectEventUiState.isBlockingLoading : false)));
                }
            }
        } else {
            BooleanExtensionKt.ifTrue(Boxing.boxBoolean(IntExtensionKt.isNegativeCommand(Boxing.boxInt(i8))), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel.parseJson.17
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
                    UpgradeObjectEventUiState value12;
                    UpgradeObjectEventUiState upgradeObjectEventUiState12;
                    MutableStateFlow<UpgradeObjectEventUiState> mutableStateFlow12 = UpgradeObjectEventViewModel.this.get_uiState();
                    do {
                        value12 = mutableStateFlow12.getValue();
                        upgradeObjectEventUiState12 = value12;
                    } while (!mutableStateFlow12.compareAndSet(value12, upgradeObjectEventUiState12.copy(((-513) & 1) != 0 ? upgradeObjectEventUiState12.eventId : 0, ((-513) & 2) != 0 ? upgradeObjectEventUiState12.bgImage : null, ((-513) & 4) != 0 ? upgradeObjectEventUiState12.images : null, ((-513) & 8) != 0 ? upgradeObjectEventUiState12.typeScreen : 0, ((-513) & 16) != 0 ? upgradeObjectEventUiState12.isUpgradeObjectPlayer : false, ((-513) & 32) != 0 ? upgradeObjectEventUiState12.upgradeObjectStrings : null, ((-513) & 64) != 0 ? upgradeObjectEventUiState12.upgradeObjectImages : null, ((-513) & 128) != 0 ? upgradeObjectEventUiState12.isLevelUpgradeObjectOpen : false, ((-513) & 256) != 0 ? upgradeObjectEventUiState12.isBuyGiftOpen : false, ((-513) & 512) != 0 ? upgradeObjectEventUiState12.isEnergyInfoOpen : true, ((-513) & 1024) != 0 ? upgradeObjectEventUiState12.isGiftQuestionOpen : false, ((-513) & 2048) != 0 ? upgradeObjectEventUiState12.isGiftOpen : false, ((-513) & 4096) != 0 ? upgradeObjectEventUiState12.isTopListOpen : false, ((-513) & 8192) != 0 ? upgradeObjectEventUiState12.isTopListServerOpen : false, ((-513) & 16384) != 0 ? upgradeObjectEventUiState12.isTopListPlayerOpen : false, ((-513) & 32768) != 0 ? upgradeObjectEventUiState12.isInfoVisible : false, ((-513) & 65536) != 0 ? upgradeObjectEventUiState12.eventLevel : 0, ((-513) & 131072) != 0 ? upgradeObjectEventUiState12.currency : 0, ((-513) & 262144) != 0 ? upgradeObjectEventUiState12.currencySpent : 0, ((-513) & 524288) != 0 ? upgradeObjectEventUiState12.currencyProgressScorePlayer : 0, ((-513) & 1048576) != 0 ? upgradeObjectEventUiState12.currencyProgressScoreServer : 0, ((-513) & 2097152) != 0 ? upgradeObjectEventUiState12.countGift : 0, ((-513) & 4194304) != 0 ? upgradeObjectEventUiState12.serverId : 0, ((-513) & 8388608) != 0 ? upgradeObjectEventUiState12.serverName : null, ((-513) & 16777216) != 0 ? upgradeObjectEventUiState12.upgradePriceOne : 0, ((-513) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? upgradeObjectEventUiState12.upgradePriceTwo : 0, ((-513) & 67108864) != 0 ? upgradeObjectEventUiState12.upgradePriceThree : 0, ((-513) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? upgradeObjectEventUiState12.isUpgradeOneEnable : false, ((-513) & 268435456) != 0 ? upgradeObjectEventUiState12.isUpgradeTwoEnable : false, ((-513) & 536870912) != 0 ? upgradeObjectEventUiState12.isUpgradeThreeEnable : false, ((-513) & 1073741824) != 0 ? upgradeObjectEventUiState12.topServersList : null, ((-513) & Integer.MIN_VALUE) != 0 ? upgradeObjectEventUiState12.placeInTop : 0, (255 & 1) != 0 ? upgradeObjectEventUiState12.placePLayerInTopList : 0, (255 & 2) != 0 ? upgradeObjectEventUiState12.levelPLayerInTopList : null, (255 & 4) != 0 ? upgradeObjectEventUiState12.namePLayerInTopList : null, (255 & 8) != 0 ? upgradeObjectEventUiState12.numberServer : 0, (255 & 16) != 0 ? upgradeObjectEventUiState12.topList : null, (255 & 32) != 0 ? upgradeObjectEventUiState12.awardsLevelList : null, (255 & 64) != 0 ? upgradeObjectEventUiState12.servers : null, (255 & 128) != 0 ? upgradeObjectEventUiState12.isNeedClose : false, (255 & 256) != 0 ? upgradeObjectEventUiState12.isBlockingLoading : false)));
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object parseJson$default(UpgradeObjectEventViewModel upgradeObjectEventViewModel, JSONObject jSONObject, boolean z, List list, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            list = upgradeObjectEventViewModel.get_uiState().getValue().getServers();
        }
        return upgradeObjectEventViewModel.parseJson(jSONObject, z, list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUpgradeObjectAwardsResponse(Continuation<? super UpgradeObjectAwardsResponse> continuation) throws Throwable {
        C47031 c47031;
        if (continuation instanceof C47031) {
            c47031 = (C47031) continuation;
            int i = c47031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c47031.label = i - Integer.MIN_VALUE;
            } else {
                c47031 = new C47031(continuation);
            }
        }
        Object newYearAwards = c47031.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c47031.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(newYearAwards);
                UpgradeObjectRepository upgradeObjectRepository = this.upgradeObjectRepository;
                c47031.label = 1;
                newYearAwards = upgradeObjectRepository.getNewYearAwards(c47031);
                if (newYearAwards == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(newYearAwards);
            }
            Response response = (Response) newYearAwards;
            UpgradeObjectAwardsResponse upgradeObjectAwardsResponse = (UpgradeObjectAwardsResponse) response.body();
            if (upgradeObjectAwardsResponse == null) {
                return null;
            }
            if (response.isSuccessful()) {
                return upgradeObjectAwardsResponse;
            }
            return null;
        } catch (Exception e) {
            UtilsKt.crashlyticsLog("getUpgradeObjectAwardsResponse exception: " + e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0094 A[PHI: r12
  0x0094: PHI (r12v2 float) = (r12v0 float), (r12v0 float), (r12v3 float) binds: [B:30:0x00a1, B:36:0x00ac, B:26:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<GiftPrizeModel> getAwardsLevelList(UpgradeObjectAwardsResponse awardsResponse, int upgradeObjectLevel, int currentCurrency) {
        List<AwardsLevelDto> awardsLevelDto;
        float f;
        if (awardsResponse == null || (awardsLevelDto = awardsResponse.getAwardsLevelDto()) == null) {
            return null;
        }
        List<AwardsLevelDto> list = awardsLevelDto;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            AwardsLevelDto awardsLevelDto2 = (AwardsLevelDto) obj;
            double d = 10;
            int iRint = ((int) (Math.rint((500 * Math.pow(1.05d, i - 1)) / d) * d)) * 3;
            if (IntExtensionKt.getOrZero(awardsLevelDto2.getPlace()) + 1 == upgradeObjectLevel) {
                iRint -= get_uiState().getValue().getCurrencySpent();
            }
            int i3 = iRint;
            float f2 = (i3 / 100 != 0 ? currentCurrency / r6 : currentCurrency) / 100.0f;
            float f3 = 1.0f;
            if (IntExtensionKt.getOrZero(awardsLevelDto2.getPlace()) + 1 > upgradeObjectLevel) {
                if (IntExtensionKt.getOrZero(awardsLevelDto2.getPlace()) != upgradeObjectLevel || f2 <= 0.5f) {
                    f = 0.0f;
                } else {
                    f3 = 1.0f - f2;
                }
            } else if (IntExtensionKt.getOrZero(awardsLevelDto2.getPlace()) + 1 >= upgradeObjectLevel) {
                f = f2 == 0.0f ? 0.5f : f2 < 0.5f ? f2 + 0.5f : f3;
            }
            int orZero = IntExtensionKt.getOrZero(awardsLevelDto2.getPlace()) + 1;
            boolean z = IntExtensionKt.getOrZero(awardsLevelDto2.getPlace()) + 1 <= upgradeObjectLevel;
            String str = (String) UtilsKt.buildTypeMerge(awardsLevelDto2.getDescription(), awardsLevelDto2.getDescriptionStore());
            if (str == null) {
                str = "";
            }
            arrayList.add(new GiftPrizeModel(orZero, z, i3, f, str));
            i = i2;
        }
        return arrayList;
    }

    public final String getServerName(int serverId, List<Server> servers) {
        String firstName;
        Server server = (Server) CollectionsKt___CollectionsKt.getOrNull(servers, serverId - 1);
        if (server != null && (firstName = server.getFirstName()) != null) {
            return firstName;
        }
        String upperCase = getStringResource().getUnknown().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
