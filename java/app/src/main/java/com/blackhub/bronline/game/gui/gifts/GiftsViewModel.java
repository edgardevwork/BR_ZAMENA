package com.blackhub.bronline.game.gui.gifts;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.annotation.DrawableRes;
import androidx.compose.p003ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.constants.resources.SvgConstantsId69;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.gifts.model.GiftsOpenPrizeGiftModel;
import com.blackhub.bronline.game.gui.gifts.model.GiftsOpenPrizeModel;
import com.blackhub.bronline.game.gui.gifts.model.GiftsPreviewItemModel;
import com.blackhub.bronline.game.model.remote.response.gifts.GiftLegendaryDto;
import com.blackhub.bronline.game.model.remote.response.gifts.GiftNormalDto;
import com.blackhub.bronline.game.model.remote.response.gifts.GiftsResponse;
import com.blackhub.bronline.game.repository.GiftsRepository;
import com.bless.client.R;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
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
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Response;

/* compiled from: GiftsViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGiftsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,463:1\n230#2,5:464\n230#2,5:470\n230#2,5:475\n1#3:469\n*S KotlinDebug\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel\n*L\n333#1:464,5\n450#1:470,5\n456#1:475,5\n*E\n"})
/* loaded from: classes3.dex */
public final class GiftsViewModel extends BaseViewModel<GiftsUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<GiftsUiState> _uiState;

    @NotNull
    public final GiftsActionWithJSON actionWithJSON;

    @NotNull
    public final Application application;

    @NotNull
    public final GiftsRepository giftsRepository;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StateFlow<GiftsUiState> uiState;

    /* compiled from: GiftsViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.gifts.GiftsViewModel", m7120f = "GiftsViewModel.kt", m7121i = {}, m7122l = {347}, m7123m = "getGiftResponse", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.gifts.GiftsViewModel$getGiftResponse$1 */
    public static final class C41151 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C41151(Continuation<? super C41151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GiftsViewModel.this.getGiftResponse(this);
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public GiftsViewModel(@NotNull GiftsActionWithJSON actionWithJSON, @NotNull GiftsRepository giftsRepository, @NotNull LocalNotification localNotification, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(giftsRepository, "giftsRepository");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(application, "application");
        this.actionWithJSON = actionWithJSON;
        this.giftsRepository = giftsRepository;
        this.localNotification = localNotification;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new GiftsUiState(0, 0, null, 0, 0, 0, 0, null, null, false, false, null, null, false, false, false, 0, false, false, false, false, 2097151, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<GiftsUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<GiftsUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: GiftsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.gifts.GiftsViewModel$initJson$1", m7120f = "GiftsViewModel.kt", m7121i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m7122l = {91, 97}, m7123m = "invokeSuspend", m7124n = {"bgImage", "eventId", "valueOfBc", "valueOfStandardGifts", "valueOfLegendaryGifts", "priceOfLegendaryGift", "bgImage", "standardGifts", "eventId", "valueOfBc", "valueOfStandardGifts", "valueOfLegendaryGifts", "priceOfLegendaryGift"}, m7125s = {"L$0", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "I$0", "I$1", "I$2", "I$3", "I$4"})
    @SourceDebugExtension({"SMAP\nGiftsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$initJson$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,463:1\n1549#2:464\n1620#2,3:465\n1549#2:468\n1620#2,3:469\n230#3,5:472\n*S KotlinDebug\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$initJson$1\n*L\n91#1:464\n91#1:465,3\n97#1:468\n97#1:469,3\n104#1:472,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.gifts.GiftsViewModel$initJson$1 */

    public static final class C41161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ GiftsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41161(JSONObject jSONObject, GiftsViewModel giftsViewModel, Continuation<? super C41161> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = giftsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C41161 c41161 = new C41161(this.$json, this.this$0, continuation);
            c41161.L$0 = obj;
            return c41161;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x018f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int iOptInt;
            int iOptInt2;
            String strEmpty;
            Object giftResponse;
            Bitmap bitmap;
            int i;
            int i2;
            int i3;
            ArrayList arrayList;
            Object giftResponse2;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            Bitmap bitmap2;
            List list;
            List<GiftNormalDto> giftNormalDto;
            GiftsResponse giftsResponse;
            ArrayList arrayList2;
            MutableStateFlow<GiftsUiState> mutableStateFlow;
            GiftsUiState value;
            GiftsUiState giftsUiState;
            List<GiftLegendaryDto> giftLegendaryDto;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.label;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                int iOptInt3 = this.$json.optInt("te", 1);
                iOptInt = this.$json.optInt("d");
                int iOptInt4 = this.$json.optInt(GiftsKeys.GET_VALUE_OF_STANDARD_GIFTS_KEY);
                iOptInt2 = this.$json.optInt("pc");
                int iOptInt5 = this.$json.optInt("lc");
                if (iOptInt3 == 0) {
                    strEmpty = SvgConstantsId69.BG_CHRISTMAS_TREE_PRIZES;
                } else if (iOptInt3 == 1) {
                    strEmpty = SvgConstantsId69.BG_HOST_MACHINE_PRIZES;
                } else {
                    strEmpty = AnyExtensionKt.empty(coroutineScope);
                }
                Bitmap bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(this.this$0.application, strEmpty, ImageTypePathInCDNEnum.BACKGROUND, 0.0f, 0.0f, 24, null);
                GiftsViewModel giftsViewModel = this.this$0;
                this.L$0 = bitmapFromZip$default;
                this.I$0 = iOptInt3;
                this.I$1 = iOptInt;
                this.I$2 = iOptInt4;
                this.I$3 = iOptInt2;
                this.I$4 = iOptInt5;
                this.label = 1;
                giftResponse = giftsViewModel.getGiftResponse(this);
                if (giftResponse == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bitmap = bitmapFromZip$default;
                i = iOptInt5;
                i2 = iOptInt3;
                i3 = iOptInt4;
            } else {
                if (i9 != 1) {
                    if (i9 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i4 = this.I$4;
                    i8 = this.I$3;
                    i5 = this.I$2;
                    i6 = this.I$1;
                    i7 = this.I$0;
                    list = (List) this.L$1;
                    bitmap2 = (Bitmap) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    giftResponse2 = obj;
                    giftsResponse = (GiftsResponse) giftResponse2;
                    if (giftsResponse != null || (giftLegendaryDto = giftsResponse.getGiftLegendaryDto()) == null) {
                        arrayList2 = null;
                    } else {
                        List<GiftLegendaryDto> list2 = giftLegendaryDto;
                        GiftsViewModel giftsViewModel2 = this.this$0;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        for (GiftLegendaryDto giftLegendaryDto2 : list2) {
                            int randomIcon = giftsViewModel2.getRandomIcon();
                            String str = (String) UtilsKt.buildTypeMerge(giftLegendaryDto2.getDescription(), giftLegendaryDto2.getDescriptionStore());
                            if (str == null) {
                                str = "";
                            }
                            arrayList3.add(new GiftsPreviewItemModel(null, randomIcon, str, 1, null));
                        }
                        arrayList2 = arrayList3;
                    }
                    mutableStateFlow = this.this$0.get_uiState();
                    do {
                        value = mutableStateFlow.getValue();
                        giftsUiState = value;
                    } while (!mutableStateFlow.compareAndSet(value, giftsUiState.copy((2096637 & 1) != 0 ? giftsUiState.eventId : i7, (2096637 & 2) != 0 ? giftsUiState.screen : 1, (2096637 & 4) != 0 ? giftsUiState.bgImage : bitmap2, (2096637 & 8) != 0 ? giftsUiState.valueOfBC : i6, (2096637 & 16) != 0 ? giftsUiState.valueOfStandardGifts : i5, (2096637 & 32) != 0 ? giftsUiState.valueOfLegendaryGifts : i8, (2096637 & 64) != 0 ? giftsUiState.priceOfLegendaryGift : i4, (2096637 & 128) != 0 ? giftsUiState.standardGifts : list, (2096637 & 256) != 0 ? giftsUiState.legendaryGifts : arrayList2, (2096637 & 512) != 0 ? giftsUiState.isVisibleButtonBack : false, (2096637 & 1024) != 0 ? giftsUiState.isOpeningBox : false, (2096637 & 2048) != 0 ? giftsUiState.giftFirst : null, (2096637 & 4096) != 0 ? giftsUiState.giftSecond : null, (2096637 & 8192) != 0 ? giftsUiState.isStandard : false, (2096637 & 16384) != 0 ? giftsUiState.isSecondGiftVisible : false, (2096637 & 32768) != 0 ? giftsUiState.isButtonGetVisible : false, (2096637 & 65536) != 0 ? giftsUiState.valueOfOpenedGifts : 0, (2096637 & 131072) != 0 ? giftsUiState.isHideBlockWithBC : false, (2096637 & 262144) != 0 ? giftsUiState.isNeedClose : false, (2096637 & 524288) != 0 ? giftsUiState.isBlockingLoading : false, (2096637 & 1048576) != 0 ? giftsUiState.isClickedOpenCase : false)));
                    return Unit.INSTANCE;
                }
                i = this.I$4;
                int i10 = this.I$3;
                i3 = this.I$2;
                iOptInt = this.I$1;
                i2 = this.I$0;
                Bitmap bitmap3 = (Bitmap) this.L$0;
                ResultKt.throwOnFailure(obj);
                bitmap = bitmap3;
                iOptInt2 = i10;
                giftResponse = obj;
            }
            GiftsResponse giftsResponse2 = (GiftsResponse) giftResponse;
            if (giftsResponse2 == null || (giftNormalDto = giftsResponse2.getGiftNormalDto()) == null) {
                arrayList = null;
            } else {
                List<GiftNormalDto> list3 = giftNormalDto;
                GiftsViewModel giftsViewModel3 = this.this$0;
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                for (GiftNormalDto giftNormalDto2 : list3) {
                    int randomIcon2 = giftsViewModel3.getRandomIcon();
                    String str2 = (String) UtilsKt.buildTypeMerge(giftNormalDto2.getDescription(), giftNormalDto2.getDescriptionStore());
                    arrayList.add(new GiftsPreviewItemModel(null, randomIcon2, str2 == null ? "" : str2, 1, null));
                }
            }
            GiftsViewModel giftsViewModel4 = this.this$0;
            this.L$0 = bitmap;
            this.L$1 = arrayList;
            this.I$0 = i2;
            this.I$1 = iOptInt;
            this.I$2 = i3;
            this.I$3 = iOptInt2;
            this.I$4 = i;
            this.label = 2;
            giftResponse2 = giftsViewModel4.getGiftResponse(this);
            if (giftResponse2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            i4 = i;
            i5 = i3;
            i6 = iOptInt;
            i7 = i2;
            i8 = iOptInt2;
            bitmap2 = bitmap;
            list = arrayList;
            giftsResponse = (GiftsResponse) giftResponse2;
            if (giftsResponse != null) {
                arrayList2 = null;
            }
            mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                giftsUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, giftsUiState.copy((2096637 & 1) != 0 ? giftsUiState.eventId : i7, (2096637 & 2) != 0 ? giftsUiState.screen : 1, (2096637 & 4) != 0 ? giftsUiState.bgImage : bitmap2, (2096637 & 8) != 0 ? giftsUiState.valueOfBC : i6, (2096637 & 16) != 0 ? giftsUiState.valueOfStandardGifts : i5, (2096637 & 32) != 0 ? giftsUiState.valueOfLegendaryGifts : i8, (2096637 & 64) != 0 ? giftsUiState.priceOfLegendaryGift : i4, (2096637 & 128) != 0 ? giftsUiState.standardGifts : list, (2096637 & 256) != 0 ? giftsUiState.legendaryGifts : arrayList2, (2096637 & 512) != 0 ? giftsUiState.isVisibleButtonBack : false, (2096637 & 1024) != 0 ? giftsUiState.isOpeningBox : false, (2096637 & 2048) != 0 ? giftsUiState.giftFirst : null, (2096637 & 4096) != 0 ? giftsUiState.giftSecond : null, (2096637 & 8192) != 0 ? giftsUiState.isStandard : false, (2096637 & 16384) != 0 ? giftsUiState.isSecondGiftVisible : false, (2096637 & 32768) != 0 ? giftsUiState.isButtonGetVisible : false, (2096637 & 65536) != 0 ? giftsUiState.valueOfOpenedGifts : 0, (2096637 & 131072) != 0 ? giftsUiState.isHideBlockWithBC : false, (2096637 & 262144) != 0 ? giftsUiState.isNeedClose : false, (2096637 & 524288) != 0 ? giftsUiState.isBlockingLoading : false, (2096637 & 1048576) != 0 ? giftsUiState.isClickedOpenCase : false)));
            return Unit.INSTANCE;
        }
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C41161(json, this, null), 1, null);
    }

    /* compiled from: GiftsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.gifts.GiftsViewModel$updateJson$1", m7120f = "GiftsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nGiftsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$updateJson$1\n+ 2 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,463:1\n8#2,9:464\n230#3,5:473\n230#3,5:478\n230#3,5:483\n*S KotlinDebug\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$updateJson$1\n*L\n122#1:464,9\n137#1:473,5\n161#1:478,5\n176#1:483,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.gifts.GiftsViewModel$updateJson$1 */

    public static final class C41251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ GiftsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41251(JSONObject jSONObject, GiftsViewModel giftsViewModel, Continuation<? super C41251> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = giftsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C41251(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objFromJson;
            GiftsUiState value;
            GiftsUiState giftsUiState;
            GiftsUiState value2;
            GiftsUiState giftsUiState2;
            GiftsUiState value3;
            GiftsUiState giftsUiState3;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            JSONObject jSONObject = this.$json;
            try {
                Gson gson = new Gson();
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                objFromJson = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) string).toString(), (Class<Object>) GiftsOpenPrizeModel.class);
            } catch (Exception e) {
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                firebaseCrashlytics.log(e.toString());
                firebaseCrashlytics.recordException(e);
                objFromJson = null;
            }
            GiftsOpenPrizeModel giftsOpenPrizeModel = (GiftsOpenPrizeModel) objFromJson;
            if (giftsOpenPrizeModel != null) {
                GiftsViewModel giftsViewModel = this.this$0;
                if (giftsOpenPrizeModel.getStatus() == 1) {
                    int screen = giftsOpenPrizeModel.getScreen();
                    if (screen == 2) {
                        Integer valueOfStandardGifts = giftsOpenPrizeModel.getValueOfStandardGifts();
                        int iIntValue = valueOfStandardGifts != null ? valueOfStandardGifts.intValue() : 0;
                        List<GiftsOpenPrizeGiftModel> allGifts = giftsOpenPrizeModel.getAllGifts();
                        boolean z = allGifts != null && allGifts.size() > 1;
                        if (allGifts != null) {
                            giftsViewModel.updateGifts(allGifts);
                        }
                        MutableStateFlow<GiftsUiState> mutableStateFlow = giftsViewModel.get_uiState();
                        do {
                            value2 = mutableStateFlow.getValue();
                            giftsUiState2 = value2;
                        } while (!mutableStateFlow.compareAndSet(value2, giftsUiState2.copy((2096637 & 1) != 0 ? giftsUiState2.eventId : 0, (2096637 & 2) != 0 ? giftsUiState2.screen : 0, (2096637 & 4) != 0 ? giftsUiState2.bgImage : null, (2096637 & 8) != 0 ? giftsUiState2.valueOfBC : 0, (2096637 & 16) != 0 ? giftsUiState2.valueOfStandardGifts : iIntValue, (2096637 & 32) != 0 ? giftsUiState2.valueOfLegendaryGifts : 0, (2096637 & 64) != 0 ? giftsUiState2.priceOfLegendaryGift : 0, (2096637 & 128) != 0 ? giftsUiState2.standardGifts : null, (2096637 & 256) != 0 ? giftsUiState2.legendaryGifts : null, (2096637 & 512) != 0 ? giftsUiState2.isVisibleButtonBack : false, (2096637 & 1024) != 0 ? giftsUiState2.isOpeningBox : true, (2096637 & 2048) != 0 ? giftsUiState2.giftFirst : null, (2096637 & 4096) != 0 ? giftsUiState2.giftSecond : null, (2096637 & 8192) != 0 ? giftsUiState2.isStandard : true, (2096637 & 16384) != 0 ? giftsUiState2.isSecondGiftVisible : z, (2096637 & 32768) != 0 ? giftsUiState2.isButtonGetVisible : false, (2096637 & 65536) != 0 ? giftsUiState2.valueOfOpenedGifts : 0, (2096637 & 131072) != 0 ? giftsUiState2.isHideBlockWithBC : false, (2096637 & 262144) != 0 ? giftsUiState2.isNeedClose : false, (2096637 & 524288) != 0 ? giftsUiState2.isBlockingLoading : false, (2096637 & 1048576) != 0 ? giftsUiState2.isClickedOpenCase : false)));
                    } else if (screen == 3) {
                        Integer valueOfBC = giftsOpenPrizeModel.getValueOfBC();
                        int iIntValue2 = valueOfBC != null ? valueOfBC.intValue() : 0;
                        Integer valueOfLegendaryGifts = giftsOpenPrizeModel.getValueOfLegendaryGifts();
                        int iIntValue3 = valueOfLegendaryGifts != null ? valueOfLegendaryGifts.intValue() : 0;
                        List<GiftsOpenPrizeGiftModel> allGifts2 = giftsOpenPrizeModel.getAllGifts();
                        boolean z2 = allGifts2 != null && allGifts2.size() > 1;
                        if (allGifts2 != null) {
                            giftsViewModel.updateGifts(allGifts2);
                        }
                        MutableStateFlow<GiftsUiState> mutableStateFlow2 = giftsViewModel.get_uiState();
                        do {
                            value3 = mutableStateFlow2.getValue();
                            giftsUiState3 = value3;
                        } while (!mutableStateFlow2.compareAndSet(value3, giftsUiState3.copy((2096637 & 1) != 0 ? giftsUiState3.eventId : 0, (2096637 & 2) != 0 ? giftsUiState3.screen : 0, (2096637 & 4) != 0 ? giftsUiState3.bgImage : null, (2096637 & 8) != 0 ? giftsUiState3.valueOfBC : iIntValue2, (2096637 & 16) != 0 ? giftsUiState3.valueOfStandardGifts : 0, (2096637 & 32) != 0 ? giftsUiState3.valueOfLegendaryGifts : iIntValue3, (2096637 & 64) != 0 ? giftsUiState3.priceOfLegendaryGift : 0, (2096637 & 128) != 0 ? giftsUiState3.standardGifts : null, (2096637 & 256) != 0 ? giftsUiState3.legendaryGifts : null, (2096637 & 512) != 0 ? giftsUiState3.isVisibleButtonBack : false, (2096637 & 1024) != 0 ? giftsUiState3.isOpeningBox : true, (2096637 & 2048) != 0 ? giftsUiState3.giftFirst : null, (2096637 & 4096) != 0 ? giftsUiState3.giftSecond : null, (2096637 & 8192) != 0 ? giftsUiState3.isStandard : false, (2096637 & 16384) != 0 ? giftsUiState3.isSecondGiftVisible : z2, (2096637 & 32768) != 0 ? giftsUiState3.isButtonGetVisible : false, (2096637 & 65536) != 0 ? giftsUiState3.valueOfOpenedGifts : 0, (2096637 & 131072) != 0 ? giftsUiState3.isHideBlockWithBC : false, (2096637 & 262144) != 0 ? giftsUiState3.isNeedClose : false, (2096637 & 524288) != 0 ? giftsUiState3.isBlockingLoading : false, (2096637 & 1048576) != 0 ? giftsUiState3.isClickedOpenCase : false)));
                    }
                } else {
                    MutableStateFlow<GiftsUiState> mutableStateFlow3 = giftsViewModel.get_uiState();
                    do {
                        value = mutableStateFlow3.getValue();
                        giftsUiState = value;
                    } while (!mutableStateFlow3.compareAndSet(value, giftsUiState.copy((2096637 & 1) != 0 ? giftsUiState.eventId : 0, (2096637 & 2) != 0 ? giftsUiState.screen : 0, (2096637 & 4) != 0 ? giftsUiState.bgImage : null, (2096637 & 8) != 0 ? giftsUiState.valueOfBC : 0, (2096637 & 16) != 0 ? giftsUiState.valueOfStandardGifts : 0, (2096637 & 32) != 0 ? giftsUiState.valueOfLegendaryGifts : 0, (2096637 & 64) != 0 ? giftsUiState.priceOfLegendaryGift : 0, (2096637 & 128) != 0 ? giftsUiState.standardGifts : null, (2096637 & 256) != 0 ? giftsUiState.legendaryGifts : null, (2096637 & 512) != 0 ? giftsUiState.isVisibleButtonBack : false, (2096637 & 1024) != 0 ? giftsUiState.isOpeningBox : false, (2096637 & 2048) != 0 ? giftsUiState.giftFirst : null, (2096637 & 4096) != 0 ? giftsUiState.giftSecond : null, (2096637 & 8192) != 0 ? giftsUiState.isStandard : false, (2096637 & 16384) != 0 ? giftsUiState.isSecondGiftVisible : false, (2096637 & 32768) != 0 ? giftsUiState.isButtonGetVisible : false, (2096637 & 65536) != 0 ? giftsUiState.valueOfOpenedGifts : 0, (2096637 & 131072) != 0 ? giftsUiState.isHideBlockWithBC : false, (2096637 & 262144) != 0 ? giftsUiState.isNeedClose : false, (2096637 & 524288) != 0 ? giftsUiState.isBlockingLoading : false, (2096637 & 1048576) != 0 ? giftsUiState.isClickedOpenCase : false)));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void updateJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C41251(json, this, null), 1, null);
    }

    /* compiled from: GiftsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.gifts.GiftsViewModel$sendPurchaseBc$1", m7120f = "GiftsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.gifts.GiftsViewModel$sendPurchaseBc$1 */

    public static final class C41221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C41221(Continuation<? super C41221> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GiftsViewModel.this.new C41221(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                GiftsViewModel.this.actionWithJSON.sendPurchaseBc();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendPurchaseBc() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C41221(null), 1, null);
    }

    /* compiled from: GiftsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.gifts.GiftsViewModel$sendOpenStandardGift$1", m7120f = "GiftsViewModel.kt", m7121i = {}, m7122l = {207}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nGiftsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$sendOpenStandardGift$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,463:1\n230#2,5:464\n*S KotlinDebug\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$sendOpenStandardGift$1\n*L\n196#1:464,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.gifts.GiftsViewModel$sendOpenStandardGift$1 */

    public static final class C41211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C41211(Continuation<? super C41211> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GiftsViewModel.this.new C41211(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            GiftsUiState value;
            GiftsUiState giftsUiState;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int screen = GiftsViewModel.this.get_uiState().getValue().getScreen();
                if (screen == 1) {
                    MutableStateFlow<GiftsUiState> mutableStateFlow = GiftsViewModel.this.get_uiState();
                    do {
                        value = mutableStateFlow.getValue();
                        giftsUiState = value;
                    } while (!mutableStateFlow.compareAndSet(value, giftsUiState.copy((2096637 & 1) != 0 ? giftsUiState.eventId : 0, (2096637 & 2) != 0 ? giftsUiState.screen : 2, (2096637 & 4) != 0 ? giftsUiState.bgImage : null, (2096637 & 8) != 0 ? giftsUiState.valueOfBC : 0, (2096637 & 16) != 0 ? giftsUiState.valueOfStandardGifts : 0, (2096637 & 32) != 0 ? giftsUiState.valueOfLegendaryGifts : 0, (2096637 & 64) != 0 ? giftsUiState.priceOfLegendaryGift : 0, (2096637 & 128) != 0 ? giftsUiState.standardGifts : null, (2096637 & 256) != 0 ? giftsUiState.legendaryGifts : null, (2096637 & 512) != 0 ? giftsUiState.isVisibleButtonBack : true, (2096637 & 1024) != 0 ? giftsUiState.isOpeningBox : false, (2096637 & 2048) != 0 ? giftsUiState.giftFirst : null, (2096637 & 4096) != 0 ? giftsUiState.giftSecond : null, (2096637 & 8192) != 0 ? giftsUiState.isStandard : false, (2096637 & 16384) != 0 ? giftsUiState.isSecondGiftVisible : false, (2096637 & 32768) != 0 ? giftsUiState.isButtonGetVisible : false, (2096637 & 65536) != 0 ? giftsUiState.valueOfOpenedGifts : 0, (2096637 & 131072) != 0 ? giftsUiState.isHideBlockWithBC : false, (2096637 & 262144) != 0 ? giftsUiState.isNeedClose : false, (2096637 & 524288) != 0 ? giftsUiState.isBlockingLoading : false, (2096637 & 1048576) != 0 ? giftsUiState.isClickedOpenCase : false)));
                } else if (screen == 2 && !GiftsViewModel.this.get_uiState().getValue().isClickedOpenCase()) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(GiftsViewModel.this, null);
                    this.label = 1;
                    if (ViewModelExtensionKt.doOnIO$default(null, anonymousClass2, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: GiftsViewModel.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.gifts.GiftsViewModel$sendOpenStandardGift$1$2", m7120f = "GiftsViewModel.kt", m7121i = {}, m7122l = {208}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        @SourceDebugExtension({"SMAP\nGiftsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$sendOpenStandardGift$1$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,463:1\n230#2,5:464\n*S KotlinDebug\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$sendOpenStandardGift$1$2\n*L\n211#1:464,5\n*E\n"})
        /* renamed from: com.blackhub.bronline.game.gui.gifts.GiftsViewModel$sendOpenStandardGift$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ GiftsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(GiftsViewModel giftsViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = giftsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                GiftsUiState value;
                GiftsUiState giftsUiState;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (DelayKt.delay(400L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.actionWithJSON.sendOpenGift(2);
                MutableStateFlow<GiftsUiState> mutableStateFlow = this.this$0.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    giftsUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, giftsUiState.copy((2096637 & 1) != 0 ? giftsUiState.eventId : 0, (2096637 & 2) != 0 ? giftsUiState.screen : 0, (2096637 & 4) != 0 ? giftsUiState.bgImage : null, (2096637 & 8) != 0 ? giftsUiState.valueOfBC : 0, (2096637 & 16) != 0 ? giftsUiState.valueOfStandardGifts : 0, (2096637 & 32) != 0 ? giftsUiState.valueOfLegendaryGifts : 0, (2096637 & 64) != 0 ? giftsUiState.priceOfLegendaryGift : 0, (2096637 & 128) != 0 ? giftsUiState.standardGifts : null, (2096637 & 256) != 0 ? giftsUiState.legendaryGifts : null, (2096637 & 512) != 0 ? giftsUiState.isVisibleButtonBack : false, (2096637 & 1024) != 0 ? giftsUiState.isOpeningBox : false, (2096637 & 2048) != 0 ? giftsUiState.giftFirst : null, (2096637 & 4096) != 0 ? giftsUiState.giftSecond : null, (2096637 & 8192) != 0 ? giftsUiState.isStandard : false, (2096637 & 16384) != 0 ? giftsUiState.isSecondGiftVisible : false, (2096637 & 32768) != 0 ? giftsUiState.isButtonGetVisible : false, (2096637 & 65536) != 0 ? giftsUiState.valueOfOpenedGifts : 0, (2096637 & 131072) != 0 ? giftsUiState.isHideBlockWithBC : false, (2096637 & 262144) != 0 ? giftsUiState.isNeedClose : false, (2096637 & 524288) != 0 ? giftsUiState.isBlockingLoading : false, (2096637 & 1048576) != 0 ? giftsUiState.isClickedOpenCase : true)));
                return Unit.INSTANCE;
            }
        }
    }

    public final void sendOpenStandardGift() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C41211(null), 1, null);
    }

    public final void sendOpenLegendaryGift(boolean isWithoutLoader) {
        BooleanExtensionKt.ifTrue(Boolean.valueOf(isWithoutLoader), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.gifts.GiftsViewModel.sendOpenLegendaryGift.1
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
                GiftsUiState value;
                GiftsUiState giftsUiState;
                MutableStateFlow<GiftsUiState> mutableStateFlow = GiftsViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    giftsUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, giftsUiState.copy((2096637 & 1) != 0 ? giftsUiState.eventId : 0, (2096637 & 2) != 0 ? giftsUiState.screen : 0, (2096637 & 4) != 0 ? giftsUiState.bgImage : null, (2096637 & 8) != 0 ? giftsUiState.valueOfBC : 0, (2096637 & 16) != 0 ? giftsUiState.valueOfStandardGifts : 0, (2096637 & 32) != 0 ? giftsUiState.valueOfLegendaryGifts : 0, (2096637 & 64) != 0 ? giftsUiState.priceOfLegendaryGift : 0, (2096637 & 128) != 0 ? giftsUiState.standardGifts : null, (2096637 & 256) != 0 ? giftsUiState.legendaryGifts : null, (2096637 & 512) != 0 ? giftsUiState.isVisibleButtonBack : false, (2096637 & 1024) != 0 ? giftsUiState.isOpeningBox : false, (2096637 & 2048) != 0 ? giftsUiState.giftFirst : null, (2096637 & 4096) != 0 ? giftsUiState.giftSecond : null, (2096637 & 8192) != 0 ? giftsUiState.isStandard : false, (2096637 & 16384) != 0 ? giftsUiState.isSecondGiftVisible : false, (2096637 & 32768) != 0 ? giftsUiState.isButtonGetVisible : false, (2096637 & 65536) != 0 ? giftsUiState.valueOfOpenedGifts : 0, (2096637 & 131072) != 0 ? giftsUiState.isHideBlockWithBC : false, (2096637 & 262144) != 0 ? giftsUiState.isNeedClose : false, (2096637 & 524288) != 0 ? giftsUiState.isBlockingLoading : false, (2096637 & 1048576) != 0 ? giftsUiState.isClickedOpenCase : false)));
            }
        });
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C41202(null), 1, null);
    }

    /* compiled from: GiftsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.gifts.GiftsViewModel$sendOpenLegendaryGift$2", m7120f = "GiftsViewModel.kt", m7121i = {}, m7122l = {245}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nGiftsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$sendOpenLegendaryGift$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,463:1\n230#2,5:464\n*S KotlinDebug\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$sendOpenLegendaryGift$2\n*L\n234#1:464,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.gifts.GiftsViewModel$sendOpenLegendaryGift$2 */

    public static final class C41202 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C41202(Continuation<? super C41202> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GiftsViewModel.this.new C41202(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41202) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            GiftsUiState value;
            GiftsUiState giftsUiState;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int screen = GiftsViewModel.this.get_uiState().getValue().getScreen();
                if (screen == 1) {
                    MutableStateFlow<GiftsUiState> mutableStateFlow = GiftsViewModel.this.get_uiState();
                    do {
                        value = mutableStateFlow.getValue();
                        giftsUiState = value;
                    } while (!mutableStateFlow.compareAndSet(value, giftsUiState.copy((2096637 & 1) != 0 ? giftsUiState.eventId : 0, (2096637 & 2) != 0 ? giftsUiState.screen : 3, (2096637 & 4) != 0 ? giftsUiState.bgImage : null, (2096637 & 8) != 0 ? giftsUiState.valueOfBC : 0, (2096637 & 16) != 0 ? giftsUiState.valueOfStandardGifts : 0, (2096637 & 32) != 0 ? giftsUiState.valueOfLegendaryGifts : 0, (2096637 & 64) != 0 ? giftsUiState.priceOfLegendaryGift : 0, (2096637 & 128) != 0 ? giftsUiState.standardGifts : null, (2096637 & 256) != 0 ? giftsUiState.legendaryGifts : null, (2096637 & 512) != 0 ? giftsUiState.isVisibleButtonBack : true, (2096637 & 1024) != 0 ? giftsUiState.isOpeningBox : false, (2096637 & 2048) != 0 ? giftsUiState.giftFirst : null, (2096637 & 4096) != 0 ? giftsUiState.giftSecond : null, (2096637 & 8192) != 0 ? giftsUiState.isStandard : false, (2096637 & 16384) != 0 ? giftsUiState.isSecondGiftVisible : false, (2096637 & 32768) != 0 ? giftsUiState.isButtonGetVisible : false, (2096637 & 65536) != 0 ? giftsUiState.valueOfOpenedGifts : 0, (2096637 & 131072) != 0 ? giftsUiState.isHideBlockWithBC : false, (2096637 & 262144) != 0 ? giftsUiState.isNeedClose : false, (2096637 & 524288) != 0 ? giftsUiState.isBlockingLoading : false, (2096637 & 1048576) != 0 ? giftsUiState.isClickedOpenCase : false)));
                } else if (screen == 3 && !GiftsViewModel.this.get_uiState().getValue().isClickedOpenCase()) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(GiftsViewModel.this, null);
                    this.label = 1;
                    if (ViewModelExtensionKt.doOnIO$default(null, anonymousClass2, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: GiftsViewModel.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.gifts.GiftsViewModel$sendOpenLegendaryGift$2$2", m7120f = "GiftsViewModel.kt", m7121i = {}, m7122l = {246}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        @SourceDebugExtension({"SMAP\nGiftsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$sendOpenLegendaryGift$2$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,463:1\n230#2,5:464\n*S KotlinDebug\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$sendOpenLegendaryGift$2$2\n*L\n249#1:464,5\n*E\n"})
        /* renamed from: com.blackhub.bronline.game.gui.gifts.GiftsViewModel$sendOpenLegendaryGift$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ GiftsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(GiftsViewModel giftsViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = giftsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                GiftsUiState value;
                GiftsUiState giftsUiState;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (DelayKt.delay(400L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.actionWithJSON.sendOpenGift(3);
                MutableStateFlow<GiftsUiState> mutableStateFlow = this.this$0.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    giftsUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, giftsUiState.copy((2096637 & 1) != 0 ? giftsUiState.eventId : 0, (2096637 & 2) != 0 ? giftsUiState.screen : 0, (2096637 & 4) != 0 ? giftsUiState.bgImage : null, (2096637 & 8) != 0 ? giftsUiState.valueOfBC : 0, (2096637 & 16) != 0 ? giftsUiState.valueOfStandardGifts : 0, (2096637 & 32) != 0 ? giftsUiState.valueOfLegendaryGifts : 0, (2096637 & 64) != 0 ? giftsUiState.priceOfLegendaryGift : 0, (2096637 & 128) != 0 ? giftsUiState.standardGifts : null, (2096637 & 256) != 0 ? giftsUiState.legendaryGifts : null, (2096637 & 512) != 0 ? giftsUiState.isVisibleButtonBack : false, (2096637 & 1024) != 0 ? giftsUiState.isOpeningBox : false, (2096637 & 2048) != 0 ? giftsUiState.giftFirst : null, (2096637 & 4096) != 0 ? giftsUiState.giftSecond : null, (2096637 & 8192) != 0 ? giftsUiState.isStandard : false, (2096637 & 16384) != 0 ? giftsUiState.isSecondGiftVisible : false, (2096637 & 32768) != 0 ? giftsUiState.isButtonGetVisible : false, (2096637 & 65536) != 0 ? giftsUiState.valueOfOpenedGifts : 0, (2096637 & 131072) != 0 ? giftsUiState.isHideBlockWithBC : false, (2096637 & 262144) != 0 ? giftsUiState.isNeedClose : false, (2096637 & 524288) != 0 ? giftsUiState.isBlockingLoading : false, (2096637 & 1048576) != 0 ? giftsUiState.isClickedOpenCase : true)));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: GiftsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.gifts.GiftsViewModel$sendCloseScreen$1", m7120f = "GiftsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nGiftsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$sendCloseScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,463:1\n230#2,5:464\n*S KotlinDebug\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$sendCloseScreen$1\n*L\n264#1:464,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.gifts.GiftsViewModel$sendCloseScreen$1 */

    public static final class C41181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C41181(Continuation<? super C41181> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GiftsViewModel.this.new C41181(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            GiftsUiState value;
            GiftsUiState giftsUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                GiftsViewModel.this.actionWithJSON.sendCloseScreen();
                MutableStateFlow<GiftsUiState> mutableStateFlow = GiftsViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    giftsUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, giftsUiState.copy((2096637 & 1) != 0 ? giftsUiState.eventId : 0, (2096637 & 2) != 0 ? giftsUiState.screen : 0, (2096637 & 4) != 0 ? giftsUiState.bgImage : null, (2096637 & 8) != 0 ? giftsUiState.valueOfBC : 0, (2096637 & 16) != 0 ? giftsUiState.valueOfStandardGifts : 0, (2096637 & 32) != 0 ? giftsUiState.valueOfLegendaryGifts : 0, (2096637 & 64) != 0 ? giftsUiState.priceOfLegendaryGift : 0, (2096637 & 128) != 0 ? giftsUiState.standardGifts : null, (2096637 & 256) != 0 ? giftsUiState.legendaryGifts : null, (2096637 & 512) != 0 ? giftsUiState.isVisibleButtonBack : false, (2096637 & 1024) != 0 ? giftsUiState.isOpeningBox : false, (2096637 & 2048) != 0 ? giftsUiState.giftFirst : null, (2096637 & 4096) != 0 ? giftsUiState.giftSecond : null, (2096637 & 8192) != 0 ? giftsUiState.isStandard : false, (2096637 & 16384) != 0 ? giftsUiState.isSecondGiftVisible : false, (2096637 & 32768) != 0 ? giftsUiState.isButtonGetVisible : false, (2096637 & 65536) != 0 ? giftsUiState.valueOfOpenedGifts : 0, (2096637 & 131072) != 0 ? giftsUiState.isHideBlockWithBC : false, (2096637 & 262144) != 0 ? giftsUiState.isNeedClose : true, (2096637 & 524288) != 0 ? giftsUiState.isBlockingLoading : false, (2096637 & 1048576) != 0 ? giftsUiState.isClickedOpenCase : false)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendCloseScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C41181(null), 1, null);
    }

    /* compiled from: GiftsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.gifts.GiftsViewModel$setButtonGetVisible$1", m7120f = "GiftsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nGiftsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$setButtonGetVisible$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,463:1\n230#2,5:464\n*S KotlinDebug\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$setButtonGetVisible$1\n*L\n274#1:464,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.gifts.GiftsViewModel$setButtonGetVisible$1 */

    public static final class C41231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C41231(Continuation<? super C41231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GiftsViewModel.this.new C41231(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int valueOfOpenedGifts = GiftsViewModel.this.get_uiState().getValue().getValueOfOpenedGifts() + 1;
            MutableStateFlow<GiftsUiState> mutableStateFlow = GiftsViewModel.this.get_uiState();
            GiftsViewModel giftsViewModel = GiftsViewModel.this;
            while (true) {
                GiftsUiState value = mutableStateFlow.getValue();
                GiftsUiState giftsUiState = value;
                GiftsViewModel giftsViewModel2 = giftsViewModel;
                MutableStateFlow<GiftsUiState> mutableStateFlow2 = mutableStateFlow;
                if (mutableStateFlow2.compareAndSet(value, giftsUiState.copy((2096637 & 1) != 0 ? giftsUiState.eventId : 0, (2096637 & 2) != 0 ? giftsUiState.screen : 0, (2096637 & 4) != 0 ? giftsUiState.bgImage : null, (2096637 & 8) != 0 ? giftsUiState.valueOfBC : 0, (2096637 & 16) != 0 ? giftsUiState.valueOfStandardGifts : 0, (2096637 & 32) != 0 ? giftsUiState.valueOfLegendaryGifts : 0, (2096637 & 64) != 0 ? giftsUiState.priceOfLegendaryGift : 0, (2096637 & 128) != 0 ? giftsUiState.standardGifts : null, (2096637 & 256) != 0 ? giftsUiState.legendaryGifts : null, (2096637 & 512) != 0 ? giftsUiState.isVisibleButtonBack : false, (2096637 & 1024) != 0 ? giftsUiState.isOpeningBox : false, (2096637 & 2048) != 0 ? giftsUiState.giftFirst : null, (2096637 & 4096) != 0 ? giftsUiState.giftSecond : null, (2096637 & 8192) != 0 ? giftsUiState.isStandard : false, (2096637 & 16384) != 0 ? giftsUiState.isSecondGiftVisible : false, (2096637 & 32768) != 0 ? giftsUiState.isButtonGetVisible : giftsViewModel.get_uiState().getValue().isShowingButtonGet(), (2096637 & 65536) != 0 ? giftsUiState.valueOfOpenedGifts : valueOfOpenedGifts, (2096637 & 131072) != 0 ? giftsUiState.isHideBlockWithBC : false, (2096637 & 262144) != 0 ? giftsUiState.isNeedClose : false, (2096637 & 524288) != 0 ? giftsUiState.isBlockingLoading : false, (2096637 & 1048576) != 0 ? giftsUiState.isClickedOpenCase : false))) {
                    return Unit.INSTANCE;
                }
                mutableStateFlow = mutableStateFlow2;
                giftsViewModel = giftsViewModel2;
            }
        }
    }

    public final void setButtonGetVisible() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C41231(null), 1, null);
    }

    /* compiled from: GiftsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.gifts.GiftsViewModel$sendButtonGet$1", m7120f = "GiftsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nGiftsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$sendButtonGet$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,463:1\n230#2,5:464\n230#2,5:469\n*S KotlinDebug\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$sendButtonGet$1\n*L\n287#1:464,5\n303#1:469,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.gifts.GiftsViewModel$sendButtonGet$1 */

    public static final class C41171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C41171(Continuation<? super C41171> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GiftsViewModel.this.new C41171(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            GiftsUiState value;
            GiftsUiState giftsUiState;
            GiftsUiState value2;
            GiftsUiState giftsUiState2;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (GiftsViewModel.this.get_uiState().getValue().getScreen() == 3) {
                MutableStateFlow<GiftsUiState> mutableStateFlow = GiftsViewModel.this.get_uiState();
                do {
                    value2 = mutableStateFlow.getValue();
                    giftsUiState2 = value2;
                } while (!mutableStateFlow.compareAndSet(value2, giftsUiState2.copy((2096637 & 1) != 0 ? giftsUiState2.eventId : 0, (2096637 & 2) != 0 ? giftsUiState2.screen : 3, (2096637 & 4) != 0 ? giftsUiState2.bgImage : null, (2096637 & 8) != 0 ? giftsUiState2.valueOfBC : 0, (2096637 & 16) != 0 ? giftsUiState2.valueOfStandardGifts : 0, (2096637 & 32) != 0 ? giftsUiState2.valueOfLegendaryGifts : 0, (2096637 & 64) != 0 ? giftsUiState2.priceOfLegendaryGift : 0, (2096637 & 128) != 0 ? giftsUiState2.standardGifts : null, (2096637 & 256) != 0 ? giftsUiState2.legendaryGifts : null, (2096637 & 512) != 0 ? giftsUiState2.isVisibleButtonBack : true, (2096637 & 1024) != 0 ? giftsUiState2.isOpeningBox : false, (2096637 & 2048) != 0 ? giftsUiState2.giftFirst : null, (2096637 & 4096) != 0 ? giftsUiState2.giftSecond : null, (2096637 & 8192) != 0 ? giftsUiState2.isStandard : true, (2096637 & 16384) != 0 ? giftsUiState2.isSecondGiftVisible : false, (2096637 & 32768) != 0 ? giftsUiState2.isButtonGetVisible : false, (2096637 & 65536) != 0 ? giftsUiState2.valueOfOpenedGifts : 0, (2096637 & 131072) != 0 ? giftsUiState2.isHideBlockWithBC : false, (2096637 & 262144) != 0 ? giftsUiState2.isNeedClose : false, (2096637 & 524288) != 0 ? giftsUiState2.isBlockingLoading : false, (2096637 & 1048576) != 0 ? giftsUiState2.isClickedOpenCase : false)));
            } else {
                MutableStateFlow<GiftsUiState> mutableStateFlow2 = GiftsViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow2.getValue();
                    giftsUiState = value;
                } while (!mutableStateFlow2.compareAndSet(value, giftsUiState.copy((2096637 & 1) != 0 ? giftsUiState.eventId : 0, (2096637 & 2) != 0 ? giftsUiState.screen : 1, (2096637 & 4) != 0 ? giftsUiState.bgImage : null, (2096637 & 8) != 0 ? giftsUiState.valueOfBC : 0, (2096637 & 16) != 0 ? giftsUiState.valueOfStandardGifts : 0, (2096637 & 32) != 0 ? giftsUiState.valueOfLegendaryGifts : 0, (2096637 & 64) != 0 ? giftsUiState.priceOfLegendaryGift : 0, (2096637 & 128) != 0 ? giftsUiState.standardGifts : null, (2096637 & 256) != 0 ? giftsUiState.legendaryGifts : null, (2096637 & 512) != 0 ? giftsUiState.isVisibleButtonBack : false, (2096637 & 1024) != 0 ? giftsUiState.isOpeningBox : false, (2096637 & 2048) != 0 ? giftsUiState.giftFirst : null, (2096637 & 4096) != 0 ? giftsUiState.giftSecond : null, (2096637 & 8192) != 0 ? giftsUiState.isStandard : true, (2096637 & 16384) != 0 ? giftsUiState.isSecondGiftVisible : false, (2096637 & 32768) != 0 ? giftsUiState.isButtonGetVisible : false, (2096637 & 65536) != 0 ? giftsUiState.valueOfOpenedGifts : 0, (2096637 & 131072) != 0 ? giftsUiState.isHideBlockWithBC : false, (2096637 & 262144) != 0 ? giftsUiState.isNeedClose : false, (2096637 & 524288) != 0 ? giftsUiState.isBlockingLoading : false, (2096637 & 1048576) != 0 ? giftsUiState.isClickedOpenCase : false)));
            }
            return Unit.INSTANCE;
        }
    }

    public final void sendButtonGet() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C41171(null), 1, null);
    }

    /* compiled from: GiftsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.gifts.GiftsViewModel$clickButtonBack$1", m7120f = "GiftsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nGiftsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$clickButtonBack$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,463:1\n230#2,5:464\n*S KotlinDebug\n*F\n+ 1 GiftsViewModel.kt\ncom/blackhub/bronline/game/gui/gifts/GiftsViewModel$clickButtonBack$1\n*L\n323#1:464,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.gifts.GiftsViewModel$clickButtonBack$1 */

    public static final class C41141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C41141(Continuation<? super C41141> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GiftsViewModel.this.new C41141(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            GiftsUiState value;
            GiftsUiState giftsUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutableStateFlow<GiftsUiState> mutableStateFlow = GiftsViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                giftsUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, giftsUiState.copy((2096637 & 1) != 0 ? giftsUiState.eventId : 0, (2096637 & 2) != 0 ? giftsUiState.screen : 1, (2096637 & 4) != 0 ? giftsUiState.bgImage : null, (2096637 & 8) != 0 ? giftsUiState.valueOfBC : 0, (2096637 & 16) != 0 ? giftsUiState.valueOfStandardGifts : 0, (2096637 & 32) != 0 ? giftsUiState.valueOfLegendaryGifts : 0, (2096637 & 64) != 0 ? giftsUiState.priceOfLegendaryGift : 0, (2096637 & 128) != 0 ? giftsUiState.standardGifts : null, (2096637 & 256) != 0 ? giftsUiState.legendaryGifts : null, (2096637 & 512) != 0 ? giftsUiState.isVisibleButtonBack : false, (2096637 & 1024) != 0 ? giftsUiState.isOpeningBox : false, (2096637 & 2048) != 0 ? giftsUiState.giftFirst : null, (2096637 & 4096) != 0 ? giftsUiState.giftSecond : null, (2096637 & 8192) != 0 ? giftsUiState.isStandard : false, (2096637 & 16384) != 0 ? giftsUiState.isSecondGiftVisible : false, (2096637 & 32768) != 0 ? giftsUiState.isButtonGetVisible : false, (2096637 & 65536) != 0 ? giftsUiState.valueOfOpenedGifts : 0, (2096637 & 131072) != 0 ? giftsUiState.isHideBlockWithBC : false, (2096637 & 262144) != 0 ? giftsUiState.isNeedClose : false, (2096637 & 524288) != 0 ? giftsUiState.isBlockingLoading : false, (2096637 & 1048576) != 0 ? giftsUiState.isClickedOpenCase : false)));
            return Unit.INSTANCE;
        }
    }

    public final void clickButtonBack() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C41141(null), 1, null);
    }

    public final void turnBlockingLoading() {
        GiftsUiState value;
        GiftsUiState giftsUiState;
        MutableStateFlow<GiftsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            giftsUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, giftsUiState.copy((2096637 & 1) != 0 ? giftsUiState.eventId : 0, (2096637 & 2) != 0 ? giftsUiState.screen : 0, (2096637 & 4) != 0 ? giftsUiState.bgImage : null, (2096637 & 8) != 0 ? giftsUiState.valueOfBC : 0, (2096637 & 16) != 0 ? giftsUiState.valueOfStandardGifts : 0, (2096637 & 32) != 0 ? giftsUiState.valueOfLegendaryGifts : 0, (2096637 & 64) != 0 ? giftsUiState.priceOfLegendaryGift : 0, (2096637 & 128) != 0 ? giftsUiState.standardGifts : null, (2096637 & 256) != 0 ? giftsUiState.legendaryGifts : null, (2096637 & 512) != 0 ? giftsUiState.isVisibleButtonBack : false, (2096637 & 1024) != 0 ? giftsUiState.isOpeningBox : false, (2096637 & 2048) != 0 ? giftsUiState.giftFirst : null, (2096637 & 4096) != 0 ? giftsUiState.giftSecond : null, (2096637 & 8192) != 0 ? giftsUiState.isStandard : false, (2096637 & 16384) != 0 ? giftsUiState.isSecondGiftVisible : false, (2096637 & 32768) != 0 ? giftsUiState.isButtonGetVisible : false, (2096637 & 65536) != 0 ? giftsUiState.valueOfOpenedGifts : 0, (2096637 & 131072) != 0 ? giftsUiState.isHideBlockWithBC : false, (2096637 & 262144) != 0 ? giftsUiState.isNeedClose : false, (2096637 & 524288) != 0 ? giftsUiState.isBlockingLoading : true, (2096637 & 1048576) != 0 ? giftsUiState.isClickedOpenCase : false)));
    }

    public final void showErrorMessage(@NotNull String message) throws JSONException {
        Intrinsics.checkNotNullParameter(message, "message");
        getLocalNotification().showErrorNotification(message);
    }

    @DrawableRes
    public final int getRandomIcon() {
        GiftsConstants giftsConstants = GiftsConstants.INSTANCE;
        return giftsConstants.getGiftIcons().get(RangesKt___RangesKt.random(new IntRange(0, CollectionsKt__CollectionsKt.getLastIndex(giftsConstants.getGiftIcons())), Random.INSTANCE)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getGiftResponse(Continuation<? super GiftsResponse> continuation) throws Throwable {
        C41151 c41151;
        if (continuation instanceof C41151) {
            c41151 = (C41151) continuation;
            int i = c41151.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c41151.label = i - Integer.MIN_VALUE;
            } else {
                c41151 = new C41151(continuation);
            }
        }
        Object gifts = c41151.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c41151.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(gifts);
                GiftsRepository giftsRepository = this.giftsRepository;
                c41151.label = 1;
                gifts = giftsRepository.getGifts(c41151);
                if (gifts == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(gifts);
            }
            Response response = (Response) gifts;
            GiftsResponse giftsResponse = (GiftsResponse) response.body();
            if (giftsResponse == null) {
                return null;
            }
            if (response.isSuccessful()) {
                return giftsResponse;
            }
            return null;
        } catch (Exception e) {
            UtilsKt.crashlyticsLog("getGiftResponse exception: " + e);
            return null;
        }
    }

    public final void updateGifts(List<GiftsOpenPrizeGiftModel> gifts) {
        int size = gifts.size();
        int i = 0;
        while (i < size) {
            GiftsOpenPrizeGiftModel giftsOpenPrizeGiftModel = gifts.get(i);
            boolean z = i == 0;
            int giftId = giftsOpenPrizeGiftModel.getGiftId();
            if (giftId == 0 || giftId == 2 || giftId == 7) {
                ViewModelExtensionKt.launchOnIO$default(this, null, new C41241(z, giftsOpenPrizeGiftModel, i, null), 1, null);
            } else if (giftId == 10) {
                updateStateWithNewGift(z, new GiftsPreviewItemModel(null, R.drawable.bp_money, giftsOpenPrizeGiftModel.getTextGift(), 1, null));
            } else if (giftId == 20) {
                int eventId = getUiState().getValue().getEventId();
                updateStateWithNewGift(z, new GiftsPreviewItemModel(null, (eventId == 0 || eventId != 1) ? R.drawable.ic_christmas_tree_energy : R.drawable.ic_host_machine_chip, giftsOpenPrizeGiftModel.getTextGift(), 1, null));
            }
            i++;
        }
    }

    /* compiled from: GiftsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.gifts.GiftsViewModel$updateGifts$1", m7120f = "GiftsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.gifts.GiftsViewModel$updateGifts$1 */

    public static final class C41241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ GiftsOpenPrizeGiftModel $gift;
        public final /* synthetic */ int $giftPos;
        public final /* synthetic */ boolean $isFirst;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41241(boolean z, GiftsOpenPrizeGiftModel giftsOpenPrizeGiftModel, int i, Continuation<? super C41241> continuation) {
            super(2, continuation);
            this.$isFirst = z;
            this.$gift = giftsOpenPrizeGiftModel;
            this.$giftPos = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GiftsViewModel.this.new C41241(this.$isFirst, this.$gift, this.$giftPos, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                GiftsViewModel.this.renderObjectAndUpdateState(this.$isFirst, this.$gift.getGiftId(), this.$giftPos, this.$gift.getValue(), this.$gift.getTextGift());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void renderObjectAndUpdateState(final boolean isFirst, int type, int id, int modelId, final String prizeName) {
        GameRender.getInstance().RequestRender(type, id, modelId, 3, 3, 20.0f, 180.0f, 45.0f, type != 2 ? type != 7 ? 0.78f : 0.85f : 1.0f, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.gui.gifts.GiftsViewModel$$ExternalSyntheticLambda0
            @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
            public final void OnRenderComplete(int i, Bitmap bitmap) {
                GiftsViewModel.renderObjectAndUpdateState$lambda$2(prizeName, this, isFirst, i, bitmap);
            }
        });
    }

    public static final void renderObjectAndUpdateState$lambda$2(String prizeName, GiftsViewModel this$0, boolean z, int i, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(prizeName, "$prizeName");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(bitmap);
        this$0.updateStateWithNewGift(z, new GiftsPreviewItemModel(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), 0, prizeName, 2, null));
    }

    public final void updateStateWithNewGift(boolean isFirst, GiftsPreviewItemModel gift) {
        GiftsUiState value;
        GiftsUiState giftsUiState;
        GiftsUiState value2;
        GiftsUiState giftsUiState2;
        if (isFirst) {
            MutableStateFlow<GiftsUiState> mutableStateFlow = get_uiState();
            do {
                value2 = mutableStateFlow.getValue();
                giftsUiState2 = value2;
            } while (!mutableStateFlow.compareAndSet(value2, giftsUiState2.copy((2096637 & 1) != 0 ? giftsUiState2.eventId : 0, (2096637 & 2) != 0 ? giftsUiState2.screen : 0, (2096637 & 4) != 0 ? giftsUiState2.bgImage : null, (2096637 & 8) != 0 ? giftsUiState2.valueOfBC : 0, (2096637 & 16) != 0 ? giftsUiState2.valueOfStandardGifts : 0, (2096637 & 32) != 0 ? giftsUiState2.valueOfLegendaryGifts : 0, (2096637 & 64) != 0 ? giftsUiState2.priceOfLegendaryGift : 0, (2096637 & 128) != 0 ? giftsUiState2.standardGifts : null, (2096637 & 256) != 0 ? giftsUiState2.legendaryGifts : null, (2096637 & 512) != 0 ? giftsUiState2.isVisibleButtonBack : false, (2096637 & 1024) != 0 ? giftsUiState2.isOpeningBox : false, (2096637 & 2048) != 0 ? giftsUiState2.giftFirst : gift, (2096637 & 4096) != 0 ? giftsUiState2.giftSecond : null, (2096637 & 8192) != 0 ? giftsUiState2.isStandard : false, (2096637 & 16384) != 0 ? giftsUiState2.isSecondGiftVisible : false, (2096637 & 32768) != 0 ? giftsUiState2.isButtonGetVisible : false, (2096637 & 65536) != 0 ? giftsUiState2.valueOfOpenedGifts : 0, (2096637 & 131072) != 0 ? giftsUiState2.isHideBlockWithBC : false, (2096637 & 262144) != 0 ? giftsUiState2.isNeedClose : false, (2096637 & 524288) != 0 ? giftsUiState2.isBlockingLoading : false, (2096637 & 1048576) != 0 ? giftsUiState2.isClickedOpenCase : false)));
            return;
        }
        MutableStateFlow<GiftsUiState> mutableStateFlow2 = get_uiState();
        do {
            value = mutableStateFlow2.getValue();
            giftsUiState = value;
        } while (!mutableStateFlow2.compareAndSet(value, giftsUiState.copy((2096637 & 1) != 0 ? giftsUiState.eventId : 0, (2096637 & 2) != 0 ? giftsUiState.screen : 0, (2096637 & 4) != 0 ? giftsUiState.bgImage : null, (2096637 & 8) != 0 ? giftsUiState.valueOfBC : 0, (2096637 & 16) != 0 ? giftsUiState.valueOfStandardGifts : 0, (2096637 & 32) != 0 ? giftsUiState.valueOfLegendaryGifts : 0, (2096637 & 64) != 0 ? giftsUiState.priceOfLegendaryGift : 0, (2096637 & 128) != 0 ? giftsUiState.standardGifts : null, (2096637 & 256) != 0 ? giftsUiState.legendaryGifts : null, (2096637 & 512) != 0 ? giftsUiState.isVisibleButtonBack : false, (2096637 & 1024) != 0 ? giftsUiState.isOpeningBox : false, (2096637 & 2048) != 0 ? giftsUiState.giftFirst : null, (2096637 & 4096) != 0 ? giftsUiState.giftSecond : gift, (2096637 & 8192) != 0 ? giftsUiState.isStandard : false, (2096637 & 16384) != 0 ? giftsUiState.isSecondGiftVisible : false, (2096637 & 32768) != 0 ? giftsUiState.isButtonGetVisible : false, (2096637 & 65536) != 0 ? giftsUiState.valueOfOpenedGifts : 0, (2096637 & 131072) != 0 ? giftsUiState.isHideBlockWithBC : false, (2096637 & 262144) != 0 ? giftsUiState.isNeedClose : false, (2096637 & 524288) != 0 ? giftsUiState.isBlockingLoading : false, (2096637 & 1048576) != 0 ? giftsUiState.isClickedOpenCase : false)));
    }
}

