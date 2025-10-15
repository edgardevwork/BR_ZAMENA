package com.blackhub.bronline.game.gui.tanpinbanner;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.gui.cases.model.CaseReward;
import com.blackhub.bronline.game.gui.cases.model.CasesBannerAttachment;
import com.blackhub.bronline.game.gui.cases.model.CasesBannerSelectedCase;
import com.blackhub.bronline.game.model.remote.response.cases.CasesAwardDto;
import com.blackhub.bronline.game.model.remote.response.tanpin.TanpinBannerData;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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

/* compiled from: TanpinBannerViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001c\u0010\u0017\u001a\u00020\u00182\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0012J\"\u0010\u001d\u001a\u00020\u001e*\u00020\u00142\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010!0 H\u0002JH\u0010\"\u001a\u00020#*\u00020\u00162\n\b\u0002\u0010$\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010!2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010!0 2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0011H\u0002R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006'"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerActionWithJSON;", "application", "Landroid/app/Application;", "(Lcom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerActionWithJSON;Landroid/app/Application;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getFileNames", "", "", "rewards", "Lcom/blackhub/bronline/game/model/remote/response/cases/CasesAwardDto;", "bannerData", "Lcom/blackhub/bronline/game/model/remote/response/tanpin/TanpinBannerData;", "initJson", "", "onClickToClose", "onClickToOpen", "showErrorMessage", ThrowableDeserializer.PROP_NAME_MESSAGE, "toCaseReward", "Lcom/blackhub/bronline/game/gui/cases/model/CaseReward;", "images", "", "Landroid/graphics/Bitmap;", "toCasesBannerAttachment", "Lcom/blackhub/bronline/game/gui/cases/model/CasesBannerAttachment;", "bgImage", "icImage", "caseRewards", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTanpinBannerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TanpinBannerViewModel.kt\ncom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1603#2,9:130\n1855#2:139\n1856#2:141\n1612#2:142\n1#3:140\n*S KotlinDebug\n*F\n+ 1 TanpinBannerViewModel.kt\ncom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerViewModel\n*L\n97#1:130,9\n97#1:139\n97#1:141\n97#1:142\n97#1:140\n*E\n"})
/* loaded from: classes2.dex */
public final class TanpinBannerViewModel extends BaseViewModel<TanpinBannerUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<TanpinBannerUiState> _uiState;

    @NotNull
    public final TanpinBannerActionWithJSON actionWithJSON;

    @NotNull
    public final Application application;

    @NotNull
    public final StateFlow<TanpinBannerUiState> uiState;

    @Inject
    public TanpinBannerViewModel(@NotNull TanpinBannerActionWithJSON actionWithJSON, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(application, "application");
        this.actionWithJSON = actionWithJSON;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new TanpinBannerUiState(null, false, 3, 0 == true ? 1 : 0));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<TanpinBannerUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<TanpinBannerUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: TanpinBannerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tanpinbanner.TanpinBannerViewModel$initJson$1", m7120f = "TanpinBannerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nTanpinBannerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TanpinBannerViewModel.kt\ncom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerViewModel$initJson$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,129:1\n1549#2:130\n1620#2,3:131\n230#3,5:134\n*S KotlinDebug\n*F\n+ 1 TanpinBannerViewModel.kt\ncom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerViewModel$initJson$1\n*L\n49#1:130\n49#1:131,3\n57#1:134,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.tanpinbanner.TanpinBannerViewModel$initJson$1 */
    /* loaded from: classes3.dex */
    public static final class C45191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ TanpinBannerData $bannerData;
        public final /* synthetic */ List<CasesAwardDto> $rewards;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45191(List<CasesAwardDto> list, TanpinBannerData tanpinBannerData, Continuation<? super C45191> continuation) {
            super(2, continuation);
            this.$rewards = list;
            this.$bannerData = tanpinBannerData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TanpinBannerViewModel.this.new C45191(this.$rewards, this.$bannerData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            TanpinBannerUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                List fileNames = TanpinBannerViewModel.this.getFileNames(this.$rewards, this.$bannerData);
                Bitmap bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(TanpinBannerViewModel.this.application, this.$bannerData.getBannerBgImage(), ImageTypePathInCDNEnum.BACKGROUND, 0.0f, 0.0f, 24, null);
                Bitmap bitmapFromZip$default2 = BitmapUtilsKt.getBitmapFromZip$default(TanpinBannerViewModel.this.application, this.$bannerData.getBannerCaseImage(), ImageTypePathInCDNEnum.ICON, 0.0f, 0.0f, 24, null);
                Map<String, Bitmap> bitmapMapFromZip = BitmapUtilsKt.getBitmapMapFromZip(TanpinBannerViewModel.this.application, fileNames, ImageTypePathInCDNEnum.IMAGE);
                List<CasesAwardDto> list = this.$rewards;
                TanpinBannerViewModel tanpinBannerViewModel = TanpinBannerViewModel.this;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(tanpinBannerViewModel.toCaseReward((CasesAwardDto) it.next(), bitmapMapFromZip));
                }
                CasesBannerAttachment casesBannerAttachment = TanpinBannerViewModel.this.toCasesBannerAttachment(this.$bannerData, bitmapFromZip$default, bitmapFromZip$default2, bitmapMapFromZip, arrayList);
                MutableStateFlow<TanpinBannerUiState> mutableStateFlow = TanpinBannerViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, TanpinBannerUiState.copy$default(value, casesBannerAttachment, false, 2, null)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void initJson(@NotNull List<CasesAwardDto> rewards, @NotNull TanpinBannerData bannerData) {
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        Intrinsics.checkNotNullParameter(bannerData, "bannerData");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C45191(rewards, bannerData, null), 1, null);
    }

    /* compiled from: TanpinBannerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tanpinbanner.TanpinBannerViewModel$onClickToOpen$1", m7120f = "TanpinBannerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nTanpinBannerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TanpinBannerViewModel.kt\ncom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerViewModel$onClickToOpen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,129:1\n230#2,5:130\n*S KotlinDebug\n*F\n+ 1 TanpinBannerViewModel.kt\ncom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerViewModel$onClickToOpen$1\n*L\n69#1:130,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.tanpinbanner.TanpinBannerViewModel$onClickToOpen$1 */
    /* loaded from: classes3.dex */
    public static final class C45211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C45211(Continuation<? super C45211> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TanpinBannerViewModel.this.new C45211(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            TanpinBannerUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                TanpinBannerViewModel.this.actionWithJSON.sendClickToOpen();
                MutableStateFlow<TanpinBannerUiState> mutableStateFlow = TanpinBannerViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, TanpinBannerUiState.copy$default(value, null, true, 1, null)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onClickToOpen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C45211(null), 1, null);
    }

    /* compiled from: TanpinBannerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tanpinbanner.TanpinBannerViewModel$onClickToClose$1", m7120f = "TanpinBannerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nTanpinBannerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TanpinBannerViewModel.kt\ncom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerViewModel$onClickToClose$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,129:1\n230#2,5:130\n*S KotlinDebug\n*F\n+ 1 TanpinBannerViewModel.kt\ncom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerViewModel$onClickToClose$1\n*L\n81#1:130,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.tanpinbanner.TanpinBannerViewModel$onClickToClose$1 */
    /* loaded from: classes3.dex */
    public static final class C45201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C45201(Continuation<? super C45201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TanpinBannerViewModel.this.new C45201(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            TanpinBannerUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                TanpinBannerViewModel.this.actionWithJSON.sendClickToClose();
                MutableStateFlow<TanpinBannerUiState> mutableStateFlow = TanpinBannerViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, TanpinBannerUiState.copy$default(value, null, true, 1, null)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onClickToClose() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C45201(null), 1, null);
    }

    public final void showErrorMessage(@NotNull String message) throws JSONException {
        Intrinsics.checkNotNullParameter(message, "message");
        LocalNotification localNotification = getLocalNotification();
        if (localNotification != null) {
            localNotification.showErrorNotification(message);
        }
    }

    public final List<String> getFileNames(List<CasesAwardDto> rewards, TanpinBannerData bannerData) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = rewards.iterator();
        while (it.hasNext()) {
            String renderId = ((CasesAwardDto) it.next()).getRenderId();
            if (renderId != null) {
                arrayList.add(renderId);
            }
        }
        return CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{bannerData.getBannerBgImage(), bannerData.getBannerCaseImage(), bannerData.getBannerRightImage()}));
    }

    public final CaseReward toCaseReward(CasesAwardDto casesAwardDto, Map<String, Bitmap> map) {
        CommonRarityEnum rarityFromEnum = casesAwardDto.getRarityFromEnum();
        String renderId = casesAwardDto.getRenderId();
        if (renderId == null) {
            renderId = "";
        }
        return new CaseReward(0, 0, null, null, null, null, 0, null, rarityFromEnum, false, false, false, 0, false, null, renderId, 0, 98047, null);
    }

    public final CasesBannerAttachment toCasesBannerAttachment(TanpinBannerData tanpinBannerData, Bitmap bitmap, Bitmap bitmap2, Map<String, Bitmap> map, List<CaseReward> list) {
        return new CasesBannerAttachment(bitmap, bitmap2, map.get(tanpinBannerData.getBannerRightImage()), tanpinBannerData.getCurrentCaseTitle(), tanpinBannerData.getCongratulationText(), tanpinBannerData.getCurrentPrizesText(), StringExtensionKt.htmlTextToAnnotatedString(tanpinBannerData.getTitle()), StringExtensionKt.htmlTextToAnnotatedString(tanpinBannerData.getDescription()), StringExtensionKt.htmlTextToAnnotatedString(tanpinBannerData.getInstructionRight()), tanpinBannerData.getButtonText(), new CasesBannerSelectedCase(list, null, null, null, 14, null));
    }
}
