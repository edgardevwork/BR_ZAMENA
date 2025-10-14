package com.blackhub.bronline.game.gui.brsimbanner;

import android.app.Application;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.constants.resources.PngConstantsId67;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.brsimbanner.model.BrSimBannerCarModel;
import com.blackhub.bronline.game.gui.brsimbanner.model.BrSimBannerItem;
import com.blackhub.bronline.game.gui.brsimbanner.model.BrSimBannerItemForRowStateModel;
import com.bless.client.R;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
import org.json.JSONObject;

/* compiled from: BrSimBannerViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0017J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/brsimbanner/BrSimBannerViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/brsimbanner/BrSimBannerUIState;", "actionsWithJson", "Lcom/blackhub/bronline/game/gui/brsimbanner/BrSimBannerActionsWithJson;", "application", "Landroid/app/Application;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "stringResources", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "(Lcom/blackhub/bronline/game/gui/brsimbanner/BrSimBannerActionsWithJson;Landroid/app/Application;Lcom/blackhub/bronline/game/common/LocalNotification;Lcom/blackhub/bronline/game/core/resources/StringResource;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "initJsonObject", "", "json", "Lorg/json/JSONObject;", "onClickWatchTariff", "sendButtonPressed", "action", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class BrSimBannerViewModel extends BaseViewModel<BrSimBannerUIState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<BrSimBannerUIState> _uiState;

    @NotNull
    public final BrSimBannerActionsWithJson actionsWithJson;

    @NotNull
    public final Application application;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StringResource stringResources;

    @NotNull
    public final StateFlow<BrSimBannerUIState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public BrSimBannerViewModel(@NotNull BrSimBannerActionsWithJson actionsWithJson, @NotNull Application application, @NotNull LocalNotification localNotification, @NotNull StringResource stringResources) {
        Intrinsics.checkNotNullParameter(actionsWithJson, "actionsWithJson");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(stringResources, "stringResources");
        this.actionsWithJson = actionsWithJson;
        this.application = application;
        this.localNotification = localNotification;
        this.stringResources = stringResources;
        this._uiState = StateFlowKt.MutableStateFlow(new BrSimBannerUIState(null, null, null, null, null, false, 63, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<BrSimBannerUIState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<BrSimBannerUIState> getUiState() {
        return this.uiState;
    }

    /* compiled from: BrSimBannerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.brsimbanner.BrSimBannerViewModel$initJsonObject$1", m7120f = "BrSimBannerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nBrSimBannerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrSimBannerViewModel.kt\ncom/blackhub/bronline/game/gui/brsimbanner/BrSimBannerViewModel$initJsonObject$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,222:1\n230#2,5:223\n*S KotlinDebug\n*F\n+ 1 BrSimBannerViewModel.kt\ncom/blackhub/bronline/game/gui/brsimbanner/BrSimBannerViewModel$initJsonObject$1\n*L\n188#1:223,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.brsimbanner.BrSimBannerViewModel$initJsonObject$1 */
    public static final class C37771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ BrSimBannerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37771(JSONObject jSONObject, BrSimBannerViewModel brSimBannerViewModel, Continuation<? super C37771> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = brSimBannerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C37771(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            BrSimBannerUIState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String strOptString = this.$json.optString("l");
            Application application = this.this$0.application;
            ImageTypePathInCDNEnum imageTypePathInCDNEnum = ImageTypePathInCDNEnum.IMAGE;
            Bitmap pngBitmapFromZip = BitmapUtilsKt.getPngBitmapFromZip(application, PngConstantsId67.BR_SIM_CAR_2, imageTypePathInCDNEnum);
            StringResource stringResource = this.this$0.stringResources;
            String str = (String) UtilsKt.buildTypeMerge(this.this$0.stringResources.getString(R.string.br_sim_banner_car_2_site), this.this$0.stringResources.getString(R.string.br_sim_banner_car_2_store));
            if (str == null) {
                str = "";
            }
            BrSimBannerCarModel brSimBannerCarModel = new BrSimBannerCarModel(pngBitmapFromZip, StringExtensionKt.htmlTextToAnnotatedString(stringResource.getString(R.string.br_sim_banner_car_1, str)));
            Bitmap pngBitmapFromZip2 = BitmapUtilsKt.getPngBitmapFromZip(this.this$0.application, PngConstantsId67.BR_SIM_CAR_3, imageTypePathInCDNEnum);
            StringResource stringResource2 = this.this$0.stringResources;
            String str2 = (String) UtilsKt.buildTypeMerge(this.this$0.stringResources.getString(R.string.br_sim_banner_car_3_site), this.this$0.stringResources.getString(R.string.br_sim_banner_car_3_store));
            if (str2 == null) {
                str2 = "";
            }
            BrSimBannerCarModel brSimBannerCarModel2 = new BrSimBannerCarModel(pngBitmapFromZip2, StringExtensionKt.htmlTextToAnnotatedString(stringResource2.getString(R.string.br_sim_banner_car_2, str2)));
            Bitmap pngBitmapFromZip3 = BitmapUtilsKt.getPngBitmapFromZip(this.this$0.application, PngConstantsId67.BR_SIM_CAR_4, imageTypePathInCDNEnum);
            StringResource stringResource3 = this.this$0.stringResources;
            String str3 = (String) UtilsKt.buildTypeMerge(this.this$0.stringResources.getString(R.string.br_sim_banner_car_4_site), this.this$0.stringResources.getString(R.string.br_sim_banner_car_4_store));
            if (str3 == null) {
                str3 = "";
            }
            BrSimBannerCarModel brSimBannerCarModel3 = new BrSimBannerCarModel(pngBitmapFromZip3, StringExtensionKt.htmlTextToAnnotatedString(stringResource3.getString(R.string.br_sim_banner_car_3, str3)));
            Bitmap pngBitmapFromZip4 = BitmapUtilsKt.getPngBitmapFromZip(this.this$0.application, PngConstantsId67.BR_SIM_CAR_5, imageTypePathInCDNEnum);
            StringResource stringResource4 = this.this$0.stringResources;
            String str4 = (String) UtilsKt.buildTypeMerge(this.this$0.stringResources.getString(R.string.br_sim_banner_car_5_site), this.this$0.stringResources.getString(R.string.br_sim_banner_car_5_store));
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new BrSimBannerCarModel[]{brSimBannerCarModel, brSimBannerCarModel2, brSimBannerCarModel3, new BrSimBannerCarModel(pngBitmapFromZip4, StringExtensionKt.htmlTextToAnnotatedString(stringResource4.getString(R.string.br_sim_banner_car_4, str4 != null ? str4 : "")))});
            Bitmap pngBitmapFromZip5 = BitmapUtilsKt.getPngBitmapFromZip(this.this$0.application, PngConstantsId67.BR_SIM_BG, ImageTypePathInCDNEnum.BACKGROUND);
            Bitmap pngBitmapFromZip6 = BitmapUtilsKt.getPngBitmapFromZip(this.this$0.application, PngConstantsId67.BR_SIM_IMAGE, imageTypePathInCDNEnum);
            List listListOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new BrSimBannerItem[]{new BrSimBannerItem(this.this$0.stringResources.getString(R.string.br_sim_banner_text_for_pager_1), CollectionsKt__CollectionsKt.listOf((Object[]) new BrSimBannerItemForRowStateModel[]{new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.br_sim_banner_prize_1)), R.color.gray, R.drawable.ic_br_logo_no_white, 0.8f, 0.0f, 16, null), new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.br_sim_banner_prize_2)), R.color.gray, R.drawable.ic_youtube, 0.7f, 0.0f, 16, null), new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.br_sim_banner_prize_3)), R.color.gray, R.drawable.ic_twitch, 0.7f, 0.0f, 16, null)}), CollectionsKt__CollectionsKt.listOf((Object[]) new BrSimBannerItemForRowStateModel[]{new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.br_sim_banner_prize_4)), R.color.yellow, R.drawable.vip_gold, 0.9f, 0.0f, 16, null), new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.br_sim_banner_prize_5)), R.color.light_blue, R.drawable.x2_cash, 1.5f, 0.0f, 16, null)})), new BrSimBannerItem(this.this$0.stringResources.getString(R.string.br_sim_banner_text_for_pager_2), CollectionsKt__CollectionsKt.listOf((Object[]) new BrSimBannerItemForRowStateModel[]{new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.br_sim_banner_prize_6)), R.color.yellow, R.drawable.vip_gold, 0.9f, 0.0f, 16, null), new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.br_sim_banner_prize_7)), R.color.light_blue, R.drawable.ic_br_sim_banner_skin, 0.0f, 0.8f, 8, null)}), CollectionsKt__CollectionsJVMKt.listOf(new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(this.this$0.stringResources.getString(R.string.br_sim_banner_prize_8)), R.color.dark_orange, R.drawable.ic_br_sim_banner_car_for_month, 0.0f, 1.3f, 8, null)))});
            MutableStateFlow<BrSimBannerUIState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                Intrinsics.checkNotNull(strOptString);
            } while (!mutableStateFlow.compareAndSet(value, BrSimBannerUIState.copy$default(value, pngBitmapFromZip5, pngBitmapFromZip6, listListOf, listListOf2, strOptString, false, 32, null)));
            return Unit.INSTANCE;
        }
    }

    public final void initJsonObject(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C37771(json, this, null), 1, null);
    }

    /* compiled from: BrSimBannerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.brsimbanner.BrSimBannerViewModel$onClickWatchTariff$1", m7120f = "BrSimBannerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.brsimbanner.BrSimBannerViewModel$onClickWatchTariff$1 */
    public static final class C37781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37781(Continuation<? super C37781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BrSimBannerViewModel.this.new C37781(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().build();
                customTabsIntentBuild.intent.addFlags(268435456);
                Intrinsics.checkNotNullExpressionValue(customTabsIntentBuild, "apply(...)");
                customTabsIntentBuild.launchUrl(BrSimBannerViewModel.this.application, Uri.parse(BrSimBannerViewModel.this.get_uiState().getValue().getLink()));
            } catch (Exception unused) {
                BrSimBannerViewModel.this.getLocalNotification().showErrorNotification(BrSimBannerViewModel.this.stringResources.getString(R.string.error_message_about_browser));
            }
            BrSimBannerViewModel.this.actionsWithJson.sendButtonPressed(1);
            return Unit.INSTANCE;
        }
    }

    public final void onClickWatchTariff() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37781(null), 1, null);
    }

    /* compiled from: BrSimBannerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.brsimbanner.BrSimBannerViewModel$sendButtonPressed$1", m7120f = "BrSimBannerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.brsimbanner.BrSimBannerViewModel$sendButtonPressed$1 */
    public static final class C37791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $action;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37791(int i, Continuation<? super C37791> continuation) {
            super(2, continuation);
            this.$action = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BrSimBannerViewModel.this.new C37791(this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BrSimBannerViewModel.this.actionsWithJson.sendButtonPressed(this.$action);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendButtonPressed(int action) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37791(action, null), 1, null);
    }
}
