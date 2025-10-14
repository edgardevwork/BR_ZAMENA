package com.blackhub.bronline.game.gui.blackpass.viewmodel;

import android.app.Application;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.constants.resources.PngConstantsId22;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.activetask.ActiveTaskUiState;
import com.blackhub.bronline.game.gui.blackpass.network.BlackPassActionWithJSON;
import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassKeys;
import com.blackhub.bronline.game.model.remote.response.blackpass.LevelsInfo;
import com.bless.client.R;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BlackPassActivateViewModel.kt */
@StabilityInferred(parameters = 0)
@Deprecated(message = "удалить после тестов")
@SourceDebugExtension({"SMAP\nBlackPassActivateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassActivateViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassActivateViewModel\n+ 2 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n1#1,107:1\n41#2,2:108\n115#2:110\n74#2,2:111\n87#2:113\n74#2,4:114\n76#2,2:118\n43#2:120\n*S KotlinDebug\n*F\n+ 1 BlackPassActivateViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassActivateViewModel\n*L\n84#1:108,2\n88#1:110\n88#1:111,2\n89#1:113\n89#1:114,4\n88#1:118,2\n84#1:120\n*E\n"})
/* loaded from: classes.dex */
public final class BlackPassActivateViewModel extends BaseViewModel<ActiveTaskUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<Bitmap> _imgDeluxeCar;

    @NotNull
    public final MutableStateFlow<Bitmap> _imgOfferSplit;

    @NotNull
    public final MutableStateFlow<String> _nameDeluxeCar;

    @NotNull
    public final MutableStateFlow<ActiveTaskUiState> _uiState;

    @NotNull
    public final BlackPassActionWithJSON actionWithJson;

    @NotNull
    public final Application application;

    @NotNull
    public final StateFlow<Bitmap> imgDeluxeCar;

    @NotNull
    public final StateFlow<Bitmap> imgOfferSplit;

    @NotNull
    public final StateFlow<Boolean> isCloseInterface;

    @NotNull
    public final MutableStateFlow<Boolean> mutableIsCloseInterface;

    @NotNull
    public final MutableStateFlow<Integer> mutablePremiumDeluxePrice;

    @NotNull
    public final MutableStateFlow<Integer> mutablePremiumPrice;

    @NotNull
    public final StateFlow<String> nameDeluxeCar;

    @NotNull
    public final StateFlow<Integer> premiumDeluxePrice;

    @NotNull
    public final StateFlow<Integer> premiumPrice;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<ActiveTaskUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public BlackPassActivateViewModel(@NotNull BlackPassActionWithJSON actionWithJson, @NotNull Application application, @NotNull StringResource stringResource) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        this.actionWithJson = actionWithJson;
        this.application = application;
        this.stringResource = stringResource;
        this._uiState = StateFlowKt.MutableStateFlow(new ActiveTaskUiState(0, null, null, null, null, 0, false, false, false, 511, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.mutablePremiumPrice = MutableStateFlow;
        this.premiumPrice = MutableStateFlow;
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0);
        this.mutablePremiumDeluxePrice = MutableStateFlow2;
        this.premiumDeluxePrice = MutableStateFlow2;
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.mutableIsCloseInterface = MutableStateFlow3;
        this.isCloseInterface = MutableStateFlow3;
        MutableStateFlow<Bitmap> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this._imgOfferSplit = MutableStateFlow4;
        this.imgOfferSplit = MutableStateFlow4;
        MutableStateFlow<Bitmap> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this._imgDeluxeCar = MutableStateFlow5;
        this.imgDeluxeCar = MutableStateFlow5;
        MutableStateFlow<String> MutableStateFlow6 = StateFlowKt.MutableStateFlow(AnyExtensionKt.empty(StringCompanionObject.INSTANCE));
        this._nameDeluxeCar = MutableStateFlow6;
        this.nameDeluxeCar = MutableStateFlow6;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<ActiveTaskUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<ActiveTaskUiState> getUiState() {
        return this.uiState;
    }

    @NotNull
    public final StateFlow<Integer> getPremiumPrice() {
        return this.premiumPrice;
    }

    @NotNull
    public final StateFlow<Integer> getPremiumDeluxePrice() {
        return this.premiumDeluxePrice;
    }

    @NotNull
    public final StateFlow<Boolean> isCloseInterface() {
        return this.isCloseInterface;
    }

    @NotNull
    public final StateFlow<Bitmap> getImgOfferSplit() {
        return this.imgOfferSplit;
    }

    @NotNull
    public final StateFlow<Bitmap> getImgDeluxeCar() {
        return this.imgDeluxeCar;
    }

    @NotNull
    public final StateFlow<String> getNameDeluxeCar() {
        return this.nameDeluxeCar;
    }

    /* compiled from: BlackPassActivateViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassActivateViewModel$initInterface$1", m7120f = "BlackPassActivateViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassActivateViewModel$initInterface$1 */
    /* loaded from: classes2.dex */
    public static final class C37261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public final /* synthetic */ ArrayList<LevelsInfo> $rewards;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37261(JSONObject jSONObject, ArrayList<LevelsInfo> arrayList, Continuation<? super C37261> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.$rewards = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlackPassActivateViewModel.this.new C37261(this.$json, this.$rewards, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BlackPassActivateViewModel.this.mutablePremiumPrice.setValue(Boxing.boxInt(this.$json.optInt("p")));
                BlackPassActivateViewModel.this.mutablePremiumDeluxePrice.setValue(Boxing.boxInt(this.$json.optInt(BlackPassKeys.P_PREMIUM_DELUXE_PRICE)));
                LevelsInfo levelsInfo = this.$rewards.get(0);
                Intrinsics.checkNotNullExpressionValue(levelsInfo, "get(...)");
                LevelsInfo levelsInfo2 = levelsInfo;
                String str = (String) UtilsKt.buildTypeMerge(levelsInfo2.getName(), levelsInfo2.getNameStore());
                if (str == null) {
                    str = "";
                }
                MutableStateFlow mutableStateFlow = BlackPassActivateViewModel.this._imgOfferSplit;
                Application application = BlackPassActivateViewModel.this.application;
                ImageTypePathInCDNEnum imageTypePathInCDNEnum = ImageTypePathInCDNEnum.IMAGE;
                mutableStateFlow.setValue(BitmapUtilsKt.getPngBitmapFromZip(application, PngConstantsId22.IMG_OFFER_SPLIT, imageTypePathInCDNEnum));
                BlackPassActivateViewModel.this._imgDeluxeCar.setValue(BitmapUtilsKt.getPngBitmapFromZip(BlackPassActivateViewModel.this.application, PngConstantsId22.IMG_SPLIT_DELUXE_CAR, imageTypePathInCDNEnum));
                BlackPassActivateViewModel.this._nameDeluxeCar.setValue(str);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void initInterface(@NotNull JSONObject json, @NotNull ArrayList<LevelsInfo> rewards) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37261(json, rewards, null), 1, null);
    }

    public final void closeInterface(boolean value) {
        this.mutableIsCloseInterface.setValue(Boolean.valueOf(value));
    }

    public final void purchasePremium(int premiumId) throws JSONException {
        this.actionWithJson.purchasePremium(premiumId);
    }

    public final void clearViewModel() {
        closeInterface(false);
    }

    public final SpannedString updatePrizeText() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) getStringResource().getString(R.string.banner_title_prize_1_1));
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder.append('\n'), "append(...)");
        spannableStringBuilder.append((CharSequence) getStringResource().getString(R.string.banner_title_prize_1_3));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ResourcesCompat.getColor(this.application.getResources(), R.color.red, null));
        int length = spannableStringBuilder.length();
        StyleSpan styleSpan = new StyleSpan(1);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getStringResource().getString(R.string.banner_title_prize_1_4));
        spannableStringBuilder.setSpan(styleSpan, length2, spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return new SpannedString(spannableStringBuilder);
    }
}

