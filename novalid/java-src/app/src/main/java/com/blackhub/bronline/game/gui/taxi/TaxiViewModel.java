package com.blackhub.bronline.game.gui.taxi;

import android.text.SpannedString;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TaxiViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0018J\u0006\u0010\u001c\u001a\u00020\u0018J\u0006\u0010\u001d\u001a\u00020\u0018J\u0006\u0010\u001e\u001a\u00020\u0018J\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/taxi/TaxiViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/taxi/TaxiUiState;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/taxi/TaxiActionWithJSON;", "(Lcom/blackhub/bronline/game/common/LocalNotification;Lcom/blackhub/bronline/game/core/resources/StringResource;Lcom/blackhub/bronline/game/gui/taxi/TaxiActionWithJSON;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "getStringResource", "()Lcom/blackhub/bronline/game/core/resources/StringResource;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "initJson", "", "json", "Lorg/json/JSONObject;", "sendAccept", "sendCloseScreen", "sendNext", "sendPrew", "setCommentVisible", "isVisible", "", "showErrorMessage", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "updateJson", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTaxiViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiViewModel.kt\ncom/blackhub/bronline/game/gui/taxi/TaxiViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,132:1\n230#2,5:133\n230#2,5:138\n*S KotlinDebug\n*F\n+ 1 TaxiViewModel.kt\ncom/blackhub/bronline/game/gui/taxi/TaxiViewModel\n*L\n39#1:133,5\n112#1:138,5\n*E\n"})
/* loaded from: classes2.dex */
public final class TaxiViewModel extends BaseViewModel<TaxiUiState> implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<TaxiUiState> _uiState;

    @NotNull
    public final TaxiActionWithJSON actionWithJSON;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<TaxiUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public TaxiViewModel(@NotNull LocalNotification localNotification, @NotNull StringResource stringResource, @NotNull TaxiActionWithJSON actionWithJSON) {
        TaxiUiState value;
        TaxiUiState taxiUiState;
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.localNotification = localNotification;
        this.stringResource = stringResource;
        this.actionWithJSON = actionWithJSON;
        this._uiState = StateFlowKt.MutableStateFlow(new TaxiUiState(null, null, null, null, null, null, null, null, null, null, false, false, false, 8191, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
        MutableStateFlow<TaxiUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            taxiUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, taxiUiState.copy((7295 & 1) != 0 ? taxiUiState.brTaxiStart : getStringResource().taxiStartPoint(AnyExtensionKt.empty(this)), (7295 & 2) != 0 ? taxiUiState.brTaxiEnd : getStringResource().taxiEndPoint(AnyExtensionKt.empty(this)), (7295 & 4) != 0 ? taxiUiState.brTaxiDist : getStringResource().taxiDistance(AnyExtensionKt.empty(this)), (7295 & 8) != 0 ? taxiUiState.brTaxiTime : getStringResource().taxiTime(AnyExtensionKt.empty(this)), (7295 & 16) != 0 ? taxiUiState.comment : null, (7295 & 32) != 0 ? taxiUiState.brTaxiPrice : null, (7295 & 64) != 0 ? taxiUiState.brTaxiTypeText : null, (7295 & 128) != 0 ? taxiUiState.brTaxiRating : null, (7295 & 256) != 0 ? taxiUiState.brTaxiCountOrders : null, (7295 & 512) != 0 ? taxiUiState.brTaxiCash : null, (7295 & 1024) != 0 ? taxiUiState.isHasComment : false, (7295 & 2048) != 0 ? taxiUiState.isCommentVisible : false, (7295 & 4096) != 0 ? taxiUiState.isNeedClose : false)));
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<TaxiUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<TaxiUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: TaxiViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.taxi.TaxiViewModel$initJson$1", m7120f = "TaxiViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nTaxiViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiViewModel.kt\ncom/blackhub/bronline/game/gui/taxi/TaxiViewModel$initJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,132:1\n230#2,5:133\n*S KotlinDebug\n*F\n+ 1 TaxiViewModel.kt\ncom/blackhub/bronline/game/gui/taxi/TaxiViewModel$initJson$1\n*L\n54#1:133,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.taxi.TaxiViewModel$initJson$1 */
    /* loaded from: classes3.dex */
    public static final class C45221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ TaxiViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45221(JSONObject jSONObject, TaxiViewModel taxiViewModel, Continuation<? super C45221> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = taxiViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C45221(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            TaxiUiState value;
            TaxiUiState taxiUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            double dOptDouble = this.$json.optDouble("r", 0.0d);
            int iOptInt = this.$json.optInt("n", 0);
            int iOptInt2 = this.$json.optInt("m", 0);
            MutableStateFlow<TaxiUiState> mutableStateFlow = this.this$0.get_uiState();
            TaxiViewModel taxiViewModel = this.this$0;
            do {
                value = mutableStateFlow.getValue();
                taxiUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, taxiUiState.copy((7295 & 1) != 0 ? taxiUiState.brTaxiStart : null, (7295 & 2) != 0 ? taxiUiState.brTaxiEnd : null, (7295 & 4) != 0 ? taxiUiState.brTaxiDist : null, (7295 & 8) != 0 ? taxiUiState.brTaxiTime : null, (7295 & 16) != 0 ? taxiUiState.comment : null, (7295 & 32) != 0 ? taxiUiState.brTaxiPrice : null, (7295 & 64) != 0 ? taxiUiState.brTaxiTypeText : null, (7295 & 128) != 0 ? taxiUiState.brTaxiRating : taxiViewModel.getStringResource().taxiRating(dOptDouble), (7295 & 256) != 0 ? taxiUiState.brTaxiCountOrders : taxiViewModel.getStringResource().taxiCountOrders(iOptInt), (7295 & 512) != 0 ? taxiUiState.brTaxiCash : taxiViewModel.getStringResource().taxiTotalCash(iOptInt2), (7295 & 1024) != 0 ? taxiUiState.isHasComment : false, (7295 & 2048) != 0 ? taxiUiState.isCommentVisible : false, (7295 & 4096) != 0 ? taxiUiState.isNeedClose : false)));
            return Unit.INSTANCE;
        }
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C45221(json, this, null), 1, null);
    }

    /* compiled from: TaxiViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.taxi.TaxiViewModel$updateJson$1", m7120f = "TaxiViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nTaxiViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiViewModel.kt\ncom/blackhub/bronline/game/gui/taxi/TaxiViewModel$updateJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,132:1\n230#2,5:133\n*S KotlinDebug\n*F\n+ 1 TaxiViewModel.kt\ncom/blackhub/bronline/game/gui/taxi/TaxiViewModel$updateJson$1\n*L\n77#1:133,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.taxi.TaxiViewModel$updateJson$1 */
    /* loaded from: classes3.dex */
    public static final class C45271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ TaxiViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45271(JSONObject jSONObject, TaxiViewModel taxiViewModel, Continuation<? super C45271> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = taxiViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C45271 c45271 = new C45271(this.$json, this.this$0, continuation);
            c45271.L$0 = obj;
            return c45271;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            String strOptString = this.$json.optString("t", AnyExtensionKt.empty(coroutineScope));
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            if (strOptString.length() == 0) {
                return Unit.INSTANCE;
            }
            String strOptString2 = this.$json.optString("s", AnyExtensionKt.empty(coroutineScope));
            String strOptString3 = this.$json.optString("e", AnyExtensionKt.empty(coroutineScope));
            String strOptString4 = this.$json.optString("d", AnyExtensionKt.empty(coroutineScope));
            String strOptString5 = this.$json.optString("ti", AnyExtensionKt.empty(coroutineScope));
            String strOptString6 = this.$json.optString("m", AnyExtensionKt.empty(coroutineScope));
            String strOptString7 = this.$json.optString("ty", AnyExtensionKt.empty(coroutineScope));
            String strOptString8 = this.$json.optString("co", AnyExtensionKt.empty(coroutineScope));
            Intrinsics.checkNotNull(strOptString8);
            boolean z = strOptString8.length() > 0;
            MutableStateFlow<TaxiUiState> mutableStateFlow = this.this$0.get_uiState();
            TaxiViewModel taxiViewModel = this.this$0;
            while (true) {
                TaxiUiState value = mutableStateFlow.getValue();
                TaxiUiState taxiUiState = value;
                StringResource stringResource = taxiViewModel.getStringResource();
                Intrinsics.checkNotNull(strOptString2);
                SpannedString spannedStringTaxiStartPoint = stringResource.taxiStartPoint(strOptString2);
                StringResource stringResource2 = taxiViewModel.getStringResource();
                Intrinsics.checkNotNull(strOptString3);
                SpannedString spannedStringTaxiEndPoint = stringResource2.taxiEndPoint(strOptString3);
                StringResource stringResource3 = taxiViewModel.getStringResource();
                Intrinsics.checkNotNull(strOptString4);
                SpannedString spannedStringTaxiDistance = stringResource3.taxiDistance(strOptString4);
                StringResource stringResource4 = taxiViewModel.getStringResource();
                Intrinsics.checkNotNull(strOptString5);
                SpannedString spannedStringTaxiTime = stringResource4.taxiTime(strOptString5);
                String str = strOptString2;
                StringResource stringResource5 = taxiViewModel.getStringResource();
                Intrinsics.checkNotNull(strOptString6);
                String strTaxiPrice = stringResource5.taxiPrice(strOptString6);
                Intrinsics.checkNotNull(strOptString7);
                TaxiViewModel taxiViewModel2 = taxiViewModel;
                if (mutableStateFlow.compareAndSet(value, taxiUiState.copy((7295 & 1) != 0 ? taxiUiState.brTaxiStart : spannedStringTaxiStartPoint, (7295 & 2) != 0 ? taxiUiState.brTaxiEnd : spannedStringTaxiEndPoint, (7295 & 4) != 0 ? taxiUiState.brTaxiDist : spannedStringTaxiDistance, (7295 & 8) != 0 ? taxiUiState.brTaxiTime : spannedStringTaxiTime, (7295 & 16) != 0 ? taxiUiState.comment : strOptString8, (7295 & 32) != 0 ? taxiUiState.brTaxiPrice : strTaxiPrice, (7295 & 64) != 0 ? taxiUiState.brTaxiTypeText : strOptString7, (7295 & 128) != 0 ? taxiUiState.brTaxiRating : null, (7295 & 256) != 0 ? taxiUiState.brTaxiCountOrders : null, (7295 & 512) != 0 ? taxiUiState.brTaxiCash : null, (7295 & 1024) != 0 ? taxiUiState.isHasComment : z, (7295 & 2048) != 0 ? taxiUiState.isCommentVisible : false, (7295 & 4096) != 0 ? taxiUiState.isNeedClose : false))) {
                    return Unit.INSTANCE;
                }
                strOptString2 = str;
                taxiViewModel = taxiViewModel2;
            }
        }
    }

    public final void updateJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C45271(json, this, null), 1, null);
    }

    /* compiled from: TaxiViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.taxi.TaxiViewModel$sendNext$1", m7120f = "TaxiViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.taxi.TaxiViewModel$sendNext$1 */
    /* loaded from: classes3.dex */
    public static final class C45251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C45251(Continuation<? super C45251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TaxiViewModel.this.new C45251(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                TaxiViewModel.this.actionWithJSON.sendNext();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendNext() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C45251(null), 1, null);
    }

    /* compiled from: TaxiViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.taxi.TaxiViewModel$sendPrew$1", m7120f = "TaxiViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.taxi.TaxiViewModel$sendPrew$1 */
    /* loaded from: classes3.dex */
    public static final class C45261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C45261(Continuation<? super C45261> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TaxiViewModel.this.new C45261(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                TaxiViewModel.this.actionWithJSON.sendPrew();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendPrew() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C45261(null), 1, null);
    }

    /* compiled from: TaxiViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.taxi.TaxiViewModel$sendAccept$1", m7120f = "TaxiViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.taxi.TaxiViewModel$sendAccept$1 */
    /* loaded from: classes3.dex */
    public static final class C45231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C45231(Continuation<? super C45231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TaxiViewModel.this.new C45231(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                TaxiViewModel.this.actionWithJSON.sendAccept();
                TaxiViewModel.this.sendCloseScreen();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendAccept() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C45231(null), 1, null);
    }

    public final void setCommentVisible(boolean isVisible) {
        TaxiUiState value;
        TaxiUiState taxiUiState;
        MutableStateFlow<TaxiUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            taxiUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, taxiUiState.copy((7295 & 1) != 0 ? taxiUiState.brTaxiStart : null, (7295 & 2) != 0 ? taxiUiState.brTaxiEnd : null, (7295 & 4) != 0 ? taxiUiState.brTaxiDist : null, (7295 & 8) != 0 ? taxiUiState.brTaxiTime : null, (7295 & 16) != 0 ? taxiUiState.comment : null, (7295 & 32) != 0 ? taxiUiState.brTaxiPrice : null, (7295 & 64) != 0 ? taxiUiState.brTaxiTypeText : null, (7295 & 128) != 0 ? taxiUiState.brTaxiRating : null, (7295 & 256) != 0 ? taxiUiState.brTaxiCountOrders : null, (7295 & 512) != 0 ? taxiUiState.brTaxiCash : null, (7295 & 1024) != 0 ? taxiUiState.isHasComment : false, (7295 & 2048) != 0 ? taxiUiState.isCommentVisible : isVisible, (7295 & 4096) != 0 ? taxiUiState.isNeedClose : false)));
    }

    /* compiled from: TaxiViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.taxi.TaxiViewModel$sendCloseScreen$1", m7120f = "TaxiViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nTaxiViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiViewModel.kt\ncom/blackhub/bronline/game/gui/taxi/TaxiViewModel$sendCloseScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,132:1\n230#2,5:133\n*S KotlinDebug\n*F\n+ 1 TaxiViewModel.kt\ncom/blackhub/bronline/game/gui/taxi/TaxiViewModel$sendCloseScreen$1\n*L\n122#1:133,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.taxi.TaxiViewModel$sendCloseScreen$1 */
    /* loaded from: classes3.dex */
    public static final class C45241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C45241(Continuation<? super C45241> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TaxiViewModel.this.new C45241(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            TaxiUiState value;
            TaxiUiState taxiUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                TaxiViewModel.this.actionWithJSON.sendCloseScreen();
                MutableStateFlow<TaxiUiState> mutableStateFlow = TaxiViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    taxiUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, taxiUiState.copy((7295 & 1) != 0 ? taxiUiState.brTaxiStart : null, (7295 & 2) != 0 ? taxiUiState.brTaxiEnd : null, (7295 & 4) != 0 ? taxiUiState.brTaxiDist : null, (7295 & 8) != 0 ? taxiUiState.brTaxiTime : null, (7295 & 16) != 0 ? taxiUiState.comment : null, (7295 & 32) != 0 ? taxiUiState.brTaxiPrice : null, (7295 & 64) != 0 ? taxiUiState.brTaxiTypeText : null, (7295 & 128) != 0 ? taxiUiState.brTaxiRating : null, (7295 & 256) != 0 ? taxiUiState.brTaxiCountOrders : null, (7295 & 512) != 0 ? taxiUiState.brTaxiCash : null, (7295 & 1024) != 0 ? taxiUiState.isHasComment : false, (7295 & 2048) != 0 ? taxiUiState.isCommentVisible : false, (7295 & 4096) != 0 ? taxiUiState.isNeedClose : true)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendCloseScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C45241(null), 1, null);
    }

    public final void showErrorMessage(@NotNull String message) throws JSONException {
        Intrinsics.checkNotNullParameter(message, "message");
        getLocalNotification().showErrorNotification(message);
        sendCloseScreen();
    }
}
