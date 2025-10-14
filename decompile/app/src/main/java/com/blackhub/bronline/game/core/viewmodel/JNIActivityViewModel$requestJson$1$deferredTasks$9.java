package com.blackhub.bronline.game.core.viewmodel;

import androidx.media3.common.C2732C;
import com.blackhub.bronline.game.core.model.ConfigurationJsonModel;
import com.blackhub.bronline.game.gui.tuning.data.TuneVinylsObj;
import com.blackhub.bronline.launcher.network.Api;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* compiled from: JNIActivityViewModel.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1$deferredTasks$9", m7120f = "JNIActivityViewModel.kt", m7121i = {}, m7122l = {298}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes2.dex */
public final class JNIActivityViewModel$requestJson$1$deferredTasks$9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $countOfErrors;
    public int label;
    public final /* synthetic */ JNIActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JNIActivityViewModel$requestJson$1$deferredTasks$9(JNIActivityViewModel jNIActivityViewModel, int i, Continuation<? super JNIActivityViewModel$requestJson$1$deferredTasks$9> continuation) {
        super(2, continuation);
        this.this$0 = jNIActivityViewModel;
        this.$countOfErrors = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new JNIActivityViewModel$requestJson$1$deferredTasks$9(this.this$0, this.$countOfErrors, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((JNIActivityViewModel$requestJson$1$deferredTasks$9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            JNIActivityViewModel jNIActivityViewModel = this.this$0;
            C36841 c36841 = new C36841(jNIActivityViewModel, null);
            C36852 c36852 = new C36852(this.this$0, null);
            final JNIActivityViewModel jNIActivityViewModel2 = this.this$0;
            Function2<ArrayList<TuneVinylsObj>, Integer, Unit> function2 = new Function2<ArrayList<TuneVinylsObj>, Integer, Unit>() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1$deferredTasks$9.3
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ArrayList<TuneVinylsObj> arrayList, Integer num) {
                    invoke(arrayList, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull ArrayList<TuneVinylsObj> body, int i2) {
                    Intrinsics.checkNotNullParameter(body, "body");
                    MutableStateFlow mutableStateFlow = jNIActivityViewModel2._configurationJsons;
                    while (true) {
                        Object value = mutableStateFlow.getValue();
                        ConfigurationJsonModel configurationJsonModel = (ConfigurationJsonModel) value;
                        MutableStateFlow mutableStateFlow2 = mutableStateFlow;
                        if (mutableStateFlow2.compareAndSet(value, configurationJsonModel.copy((402653183 & 1) != 0 ? configurationJsonModel.invItemsFromJson : null, (402653183 & 2) != 0 ? configurationJsonModel.skinsFromJson : null, (402653183 & 4) != 0 ? configurationJsonModel.vehiclesFromJson : null, (402653183 & 8) != 0 ? configurationJsonModel.socialInteractionsFromJson : null, (402653183 & 16) != 0 ? configurationJsonModel.familySystemListFromJson : null, (402653183 & 32) != 0 ? configurationJsonModel.calendarModel : null, (402653183 & 64) != 0 ? configurationJsonModel.bpRewardsModel : null, (402653183 & 128) != 0 ? configurationJsonModel.craftItemsModel : null, (402653183 & 256) != 0 ? configurationJsonModel.craftCategoriesModel : null, (402653183 & 512) != 0 ? configurationJsonModel.craftCategoriesFilterModel : null, (402653183 & 1024) != 0 ? configurationJsonModel.marketplaceCategoriesFilterModel : null, (402653183 & 2048) != 0 ? configurationJsonModel.marketplaceDeliveryFilterModel : null, (402653183 & 4096) != 0 ? configurationJsonModel.tanpinBannerModel : null, (402653183 & 8192) != 0 ? configurationJsonModel.videoPlayerModel : null, (402653183 & 16384) != 0 ? configurationJsonModel.marketplaceConfigurationViewModel : null, (402653183 & 32768) != 0 ? configurationJsonModel.holidayEvents : null, (402653183 & 65536) != 0 ? configurationJsonModel.casesModel : null, (402653183 & 131072) != 0 ? configurationJsonModel.buttonConfig : null, (402653183 & 262144) != 0 ? configurationJsonModel.fractionDocuments : null, (402653183 & 524288) != 0 ? configurationJsonModel.fractionShopList : null, (402653183 & 1048576) != 0 ? configurationJsonModel.fractionQuestsObj : null, (402653183 & 2097152) != 0 ? configurationJsonModel.productDetailsState : null, (402653183 & 4194304) != 0 ? configurationJsonModel.donateItemsFromJson : null, (402653183 & 8388608) != 0 ? configurationJsonModel.carColorItems : null, (402653183 & 16777216) != 0 ? configurationJsonModel.blackPassItemsFromJson : null, (402653183 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? configurationJsonModel.smiListFromJson : null, (402653183 & 67108864) != 0 ? configurationJsonModel.smiEditorBodyFromJson : null, (402653183 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? configurationJsonModel.tuneObjItemsFromJson : null, (402653183 & 268435456) != 0 ? configurationJsonModel.tuneGuiScreensFromJsonObj : null, (402653183 & 536870912) != 0 ? configurationJsonModel.tuneVinylsObjFromJson : body))) {
                            return;
                        } else {
                            mutableStateFlow = mutableStateFlow2;
                        }
                    }
                }
            };
            final JNIActivityViewModel jNIActivityViewModel3 = this.this$0;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1$deferredTasks$9.4
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
                    jNIActivityViewModel3.showErrorDialogForRestart();
                }
            };
            int i2 = this.$countOfErrors;
            this.label = 1;
            if (JNIActivityViewModel.fetchData$default(jNIActivityViewModel, c36841, c36852, function2, function0, i2, 0, 0, 0L, this, 224, null) == coroutine_suspended) {
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

    /* compiled from: JNIActivityViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001H\u008a@"}, m7105d2 = {"<anonymous>", "Lretrofit2/Response;", "Ljava/util/ArrayList;", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneVinylsObj;", "Lkotlin/collections/ArrayList;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1$deferredTasks$9$1", m7120f = "JNIActivityViewModel.kt", m7121i = {}, m7122l = {299}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1$deferredTasks$9$1 */
    public static final class C36841 extends SuspendLambda implements Function1<Continuation<? super Response<ArrayList<TuneVinylsObj>>>, Object> {
        public int label;
        public final /* synthetic */ JNIActivityViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36841(JNIActivityViewModel jNIActivityViewModel, Continuation<? super C36841> continuation) {
            super(1, continuation);
            this.this$0 = jNIActivityViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new C36841(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super Response<ArrayList<TuneVinylsObj>>> continuation) {
            return ((C36841) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Api api = this.this$0.mainResponse;
                this.label = 1;
                obj = api.getTuneVinyls(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* compiled from: JNIActivityViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001H\u008a@"}, m7105d2 = {"<anonymous>", "Lretrofit2/Response;", "Ljava/util/ArrayList;", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneVinylsObj;", "Lkotlin/collections/ArrayList;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1$deferredTasks$9$2", m7120f = "JNIActivityViewModel.kt", m7121i = {}, m7122l = {300}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1$deferredTasks$9$2 */
    public static final class C36852 extends SuspendLambda implements Function1<Continuation<? super Response<ArrayList<TuneVinylsObj>>>, Object> {
        public int label;
        public final /* synthetic */ JNIActivityViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36852(JNIActivityViewModel jNIActivityViewModel, Continuation<? super C36852> continuation) {
            super(1, continuation);
            this.this$0 = jNIActivityViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new C36852(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super Response<ArrayList<TuneVinylsObj>>> continuation) {
            return ((C36852) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Api api = this.this$0.backupResponse;
                this.label = 1;
                obj = api.getTuneVinyls(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }
}
