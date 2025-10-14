package com.blackhub.bronline.game.gui.tuning.viewmodel;

import android.support.v4.media.session.MediaSessionCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.tuning.CostCalculation;
import com.blackhub.bronline.game.gui.tuning.TuningConstants;
import com.blackhub.bronline.game.gui.tuning.data.TuneGuiNodeObj;
import com.blackhub.bronline.game.gui.tuning.data.TuneObj;
import com.blackhub.bronline.game.gui.tuning.data.TuneVinylsObj;
import com.blackhub.bronline.game.gui.tuning.data.TuningBoxItemObj;
import com.blackhub.bronline.game.gui.tuning.network.TuningActionWithJSON;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.apache.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TuningDetailsListViewModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class TuningDetailsListViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final TuningActionWithJSON actionWithJson;

    @NotNull
    public final CostCalculation costCalculation;
    public boolean ifInitSelectors;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final MutableSharedFlow<List<TuneGuiNodeObj>> mutableAllItemsForSubmenu;

    @NotNull
    public final MutableStateFlow<List<Integer>> mutableAllSelectors;

    @NotNull
    public final MutableStateFlow<TuneObj> mutableCurrentBox;

    @NotNull
    public final MutableSharedFlow<List<TuneObj>> mutableDetailsList;

    @NotNull
    public final MutableSharedFlow<List<Integer>> mutableDetailsWithIdAndStatus;

    @NotNull
    public final MutableStateFlow<Integer> mutableGosCost;

    @NotNull
    public final MutableStateFlow<List<TuningBoxItemObj>> mutableItemsForBox;

    @NotNull
    public final MutableStateFlow<List<String>> mutableNamePresent;

    @NotNull
    public final MutableStateFlow<List<Integer>> mutableNewAndOldDetails;

    @NotNull
    public final MutableStateFlow<List<Integer>> mutableNewAndOldVinyls;

    @NotNull
    public final MutableStateFlow<List<TuneObj>> mutableTuneItems;

    @NotNull
    public final MutableStateFlow<Integer> mutableVinylCost;

    @NotNull
    public final MutableSharedFlow<List<TuneVinylsObj>> mutableVinylsList;

    @NotNull
    public final MutableStateFlow<Boolean> mutableVisibleDialogBox;

    @NotNull
    public final SharedFlow<List<TuneGuiNodeObj>> newAllItemsForSubmenu;

    @NotNull
    public final StateFlow<TuneObj> newCurrentBox;

    @NotNull
    public final SharedFlow<List<TuneObj>> newDetailsList;

    @NotNull
    public final StateFlow<List<TuningBoxItemObj>> newItemsForBox;

    @NotNull
    public final StateFlow<List<String>> newNamePresent;

    @NotNull
    public final StateFlow<List<Integer>> newNewAndOldDetails;

    @NotNull
    public final StateFlow<List<Integer>> newNewAndOldVinyls;

    @NotNull
    public final SharedFlow<Integer> newVinylCost;

    @NotNull
    public final SharedFlow<List<TuneVinylsObj>> newVinylsList;

    @NotNull
    public final StateFlow<Boolean> newVisibleDialogBox;

    @NotNull
    public final StringResource stringResources;

    /* compiled from: TuningDetailsListViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel", m7120f = "TuningDetailsListViewModel.kt", m7121i = {0}, m7122l = {708}, m7123m = "getCurrentSelectors", m7124n = {"tuneItemsFromJSON"}, m7125s = {"L$0"})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$getCurrentSelectors$1 */
    /* loaded from: classes.dex */
    public static final class C46571 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C46571(Continuation<? super C46571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TuningDetailsListViewModel.this.getCurrentSelectors(null, this);
        }
    }

    /* compiled from: TuningDetailsListViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel", m7120f = "TuningDetailsListViewModel.kt", m7121i = {0, 0}, m7122l = {682}, m7123m = "initCurrentSelectors", m7124n = {"this", "selectorsFromJson"}, m7125s = {"L$0", "L$1"})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$initCurrentSelectors$1 */
    /* loaded from: classes.dex */
    public static final class C46581 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C46581(Continuation<? super C46581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TuningDetailsListViewModel.this.initCurrentSelectors(this);
        }
    }

    /* compiled from: TuningDetailsListViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel", m7120f = "TuningDetailsListViewModel.kt", m7121i = {1, 1, 1}, m7122l = {597, 600, 601}, m7123m = "initItemsForSubmenu", m7124n = {"this", "tuningType", "carId"}, m7125s = {"L$0", "L$1", "I$0"})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$initItemsForSubmenu$1 */
    /* loaded from: classes.dex */
    public static final class C46601 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C46601(Continuation<? super C46601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TuningDetailsListViewModel.this.initItemsForSubmenu(null, 0, this);
        }
    }

    /* compiled from: TuningDetailsListViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel", m7120f = "TuningDetailsListViewModel.kt", m7121i = {0, 0}, m7122l = {118, 123}, m7123m = "newInitDetailsList", m7124n = {"this", "currentSelector"}, m7125s = {"L$0", "I$0"})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$newInitDetailsList$1 */
    /* loaded from: classes.dex */
    public static final class C46631 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C46631(Continuation<? super C46631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TuningDetailsListViewModel.this.newInitDetailsList(0, this);
        }
    }

    /* compiled from: TuningDetailsListViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel", m7120f = "TuningDetailsListViewModel.kt", m7121i = {0, 0, 0, 0, 1, 1, 1}, m7122l = {306, MediaSessionCompat.MAX_BITMAP_SIZE_IN_DP}, m7123m = "updateCurrentDetails", m7124n = {"this", "newId", "oldId", "newCurrentStatus", "this", "newId", "oldId"}, m7125s = {"L$0", "I$0", "I$1", "I$2", "L$0", "I$0", "I$1"})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$updateCurrentDetails$1 */
    /* loaded from: classes.dex */
    public static final class C46721 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C46721(Continuation<? super C46721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TuningDetailsListViewModel.this.updateCurrentDetails(0, 0, 0, this);
        }
    }

    /* compiled from: TuningDetailsListViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel", m7120f = "TuningDetailsListViewModel.kt", m7121i = {0, 0, 0, 0}, m7122l = {325, 348}, m7123m = "updateDetailInfo", m7124n = {"this", "newId", "oldId", "newCurrentStatus"}, m7125s = {"L$0", "I$0", "I$1", "I$2"})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$updateDetailInfo$1 */
    /* loaded from: classes.dex */
    public static final class C46731 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C46731(Continuation<? super C46731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TuningDetailsListViewModel.this.updateDetailInfo(0, 0, 0, this);
        }
    }

    /* compiled from: TuningDetailsListViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel", m7120f = "TuningDetailsListViewModel.kt", m7121i = {0, 0, 0, 0}, m7122l = {293, 298}, m7123m = "updateItemStatus", m7124n = {"this", "newCurrentStatus", "newId", "oldId"}, m7125s = {"L$0", "I$0", "I$1", "I$2"})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$updateItemStatus$1 */
    /* loaded from: classes.dex */
    public static final class C46741 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C46741(Continuation<? super C46741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TuningDetailsListViewModel.this.updateItemStatus(null, 0, this);
        }
    }

    @Inject
    public TuningDetailsListViewModel(@NotNull TuningActionWithJSON actionWithJson, @NotNull CostCalculation costCalculation, @NotNull StringResource stringResources, @NotNull LocalNotification localNotification) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        Intrinsics.checkNotNullParameter(costCalculation, "costCalculation");
        Intrinsics.checkNotNullParameter(stringResources, "stringResources");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        this.actionWithJson = actionWithJson;
        this.costCalculation = costCalculation;
        this.stringResources = stringResources;
        this.localNotification = localNotification;
        this.mutableTuneItems = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableGosCost = StateFlowKt.MutableStateFlow(0);
        this.mutableDetailsWithIdAndStatus = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        MutableSharedFlow<List<TuneObj>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableDetailsList = mutableSharedFlowMutableSharedFlow$default;
        this.newDetailsList = mutableSharedFlowMutableSharedFlow$default;
        MutableStateFlow<List<Integer>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableNewAndOldDetails = MutableStateFlow;
        this.newNewAndOldDetails = MutableStateFlow;
        MutableSharedFlow<List<TuneVinylsObj>> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableVinylsList = mutableSharedFlowMutableSharedFlow$default2;
        this.newVinylsList = mutableSharedFlowMutableSharedFlow$default2;
        MutableStateFlow<List<Integer>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableNewAndOldVinyls = MutableStateFlow2;
        this.newNewAndOldVinyls = MutableStateFlow2;
        MutableStateFlow<Integer> MutableStateFlow3 = StateFlowKt.MutableStateFlow(0);
        this.mutableVinylCost = MutableStateFlow3;
        this.newVinylCost = MutableStateFlow3;
        MutableStateFlow<TuneObj> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.mutableCurrentBox = MutableStateFlow4;
        this.newCurrentBox = MutableStateFlow4;
        MutableStateFlow<List<TuningBoxItemObj>> MutableStateFlow5 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableItemsForBox = MutableStateFlow5;
        this.newItemsForBox = MutableStateFlow5;
        MutableStateFlow<Boolean> MutableStateFlow6 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.mutableVisibleDialogBox = MutableStateFlow6;
        this.newVisibleDialogBox = MutableStateFlow6;
        MutableStateFlow<List<String>> MutableStateFlow7 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableNamePresent = MutableStateFlow7;
        this.newNamePresent = MutableStateFlow7;
        this.mutableAllSelectors = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        MutableSharedFlow<List<TuneGuiNodeObj>> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableAllItemsForSubmenu = mutableSharedFlowMutableSharedFlow$default3;
        this.newAllItemsForSubmenu = mutableSharedFlowMutableSharedFlow$default3;
    }

    @NotNull
    public final SharedFlow<List<TuneObj>> getNewDetailsList() {
        return this.newDetailsList;
    }

    @NotNull
    public final StateFlow<List<Integer>> getNewNewAndOldDetails() {
        return this.newNewAndOldDetails;
    }

    @NotNull
    public final SharedFlow<List<TuneVinylsObj>> getNewVinylsList() {
        return this.newVinylsList;
    }

    @NotNull
    public final StateFlow<List<Integer>> getNewNewAndOldVinyls() {
        return this.newNewAndOldVinyls;
    }

    @NotNull
    public final SharedFlow<Integer> getNewVinylCost() {
        return this.newVinylCost;
    }

    @NotNull
    public final StateFlow<TuneObj> getNewCurrentBox() {
        return this.newCurrentBox;
    }

    @NotNull
    public final StateFlow<List<TuningBoxItemObj>> getNewItemsForBox() {
        return this.newItemsForBox;
    }

    @NotNull
    public final StateFlow<Boolean> getNewVisibleDialogBox() {
        return this.newVisibleDialogBox;
    }

    @NotNull
    public final StateFlow<List<String>> getNewNamePresent() {
        return this.newNamePresent;
    }

    @NotNull
    public final SharedFlow<List<TuneGuiNodeObj>> getNewAllItemsForSubmenu() {
        return this.newAllItemsForSubmenu;
    }

    /* compiled from: TuningDetailsListViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$setCurrentSelector$1", m7120f = "TuningDetailsListViewModel.kt", m7121i = {}, m7122l = {107}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$setCurrentSelector$1 */
    /* loaded from: classes2.dex */
    public static final class C46671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $selector;
        public int label;
        public final /* synthetic */ TuningDetailsListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46671(int i, TuningDetailsListViewModel tuningDetailsListViewModel, Continuation<? super C46671> continuation) {
            super(2, continuation);
            this.$selector = i;
            this.this$0 = tuningDetailsListViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C46671(this.$selector, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    int i2 = this.$selector;
                    if (i2 != 2) {
                        TuningDetailsListViewModel tuningDetailsListViewModel = this.this$0;
                        this.label = 1;
                        if (tuningDetailsListViewModel.newInitDetailsList(i2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void setCurrentSelector(int selector) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new C46671(selector, this, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object newInitDetailsList(int i, Continuation<? super Unit> continuation) throws Throwable {
        C46631 c46631;
        TuningDetailsListViewModel tuningDetailsListViewModel;
        if (continuation instanceof C46631) {
            c46631 = (C46631) continuation;
            int i2 = c46631.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c46631.label = i2 - Integer.MIN_VALUE;
            } else {
                c46631 = new C46631(continuation);
            }
        }
        Object objFirst = c46631.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c46631.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objFirst);
            MutableSharedFlow<List<Integer>> mutableSharedFlow = this.mutableDetailsWithIdAndStatus;
            c46631.L$0 = this;
            c46631.I$0 = i;
            c46631.label = 1;
            objFirst = FlowKt.first(mutableSharedFlow, c46631);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
            tuningDetailsListViewModel = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFirst);
                return Unit.INSTANCE;
            }
            i = c46631.I$0;
            tuningDetailsListViewModel = (TuningDetailsListViewModel) c46631.L$0;
            ResultKt.throwOnFailure(objFirst);
        }
        List<TuneObj> correctDetailsListFormatTune = tuningDetailsListViewModel.setCorrectDetailsListFormatTune((List) objFirst, tuningDetailsListViewModel.getTuneItemsForCurrentSelector(i));
        MutableSharedFlow<List<TuneObj>> mutableSharedFlow2 = tuningDetailsListViewModel.mutableDetailsList;
        c46631.L$0 = null;
        c46631.label = 2;
        if (mutableSharedFlow2.emit(correctDetailsListFormatTune, c46631) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: TuningDetailsListViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$initTuneItemsFromJson$1", m7120f = "TuningDetailsListViewModel.kt", m7121i = {}, m7122l = {131, 132}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$initTuneItemsFromJson$1 */
    /* loaded from: classes2.dex */
    public static final class C46611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<TuneObj> $items;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46611(List<TuneObj> list, Continuation<? super C46611> continuation) {
            super(2, continuation);
            this.$items = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TuningDetailsListViewModel.this.new C46611(this.$items, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            TuningDetailsListViewModel tuningDetailsListViewModel;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TuningDetailsListViewModel.this.mutableTuneItems.setValue(this.$items);
                    if (!((Collection) TuningDetailsListViewModel.this.mutableTuneItems.getValue()).isEmpty()) {
                        MutableSharedFlow mutableSharedFlow = TuningDetailsListViewModel.this.mutableDetailsWithIdAndStatus;
                        this.label = 1;
                        obj = FlowKt.first(mutableSharedFlow, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (!((Collection) obj).isEmpty()) {
                            tuningDetailsListViewModel = TuningDetailsListViewModel.this;
                            this.label = 2;
                            if (tuningDetailsListViewModel.initCurrentSelectors(this) == coroutine_suspended) {
                            }
                        }
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    if ((!((Collection) obj).isEmpty()) && !TuningDetailsListViewModel.this.ifInitSelectors) {
                        tuningDetailsListViewModel = TuningDetailsListViewModel.this;
                        this.label = 2;
                        if (tuningDetailsListViewModel.initCurrentSelectors(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void initTuneItemsFromJson(@NotNull List<TuneObj> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new C46611(items, null), 2, null);
    }

    /* compiled from: TuningDetailsListViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$setGosCost$1", m7120f = "TuningDetailsListViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$setGosCost$1 */
    /* loaded from: classes2.dex */
    public static final class C46691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $jsonObject;
        public int label;
        public final /* synthetic */ TuningDetailsListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46691(JSONObject jSONObject, TuningDetailsListViewModel tuningDetailsListViewModel, Continuation<? super C46691> continuation) {
            super(2, continuation);
            this.$jsonObject = jSONObject;
            this.this$0 = tuningDetailsListViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C46691(this.$jsonObject, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                int iOptInt = this.$jsonObject.optInt("j");
                this.this$0.mutableGosCost.setValue(Boxing.boxInt(iOptInt));
                this.this$0.mutableVinylCost.setValue(Boxing.boxInt(this.this$0.costCalculation.setCost(2, iOptInt)));
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void setGosCost(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C46691(jsonObject, this, null), 2, null);
    }

    /* compiled from: TuningDetailsListViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$setDetailsWithIdAndStatus$1", m7120f = "TuningDetailsListViewModel.kt", m7121i = {}, m7122l = {159, MatroskaExtractor.ID_BLOCK, 164, MatroskaExtractor.ID_BLOCK_ADDITIONAL}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$setDetailsWithIdAndStatus$1 */
    /* loaded from: classes2.dex */
    public static final class C46681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONArray $jsonArray;
        public int label;
        public final /* synthetic */ TuningDetailsListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46681(JSONArray jSONArray, TuningDetailsListViewModel tuningDetailsListViewModel, Continuation<? super C46681> continuation) {
            super(2, continuation);
            this.$jsonArray = jSONArray;
            this.this$0 = tuningDetailsListViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C46681(this.$jsonArray, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00a5 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            TuningDetailsListViewModel tuningDetailsListViewModel;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$jsonArray != null) {
                    MutableSharedFlow mutableSharedFlow = this.this$0.mutableDetailsWithIdAndStatus;
                    List<Integer> mutableIntList = JsonArrayExtensionKt.toMutableIntList(this.$jsonArray);
                    this.label = 1;
                    if (mutableSharedFlow.emit(mutableIntList, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    MutableSharedFlow mutableSharedFlow2 = this.this$0.mutableDetailsWithIdAndStatus;
                    List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(Boxing.boxInt(-1), Boxing.boxInt(-1));
                    this.label = 2;
                    if (mutableSharedFlow2.emit(listMutableListOf, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    if ((!((Collection) obj).isEmpty()) && !this.this$0.ifInitSelectors) {
                        tuningDetailsListViewModel = this.this$0;
                        this.label = 4;
                        if (tuningDetailsListViewModel.initCurrentSelectors(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!((Collection) this.this$0.mutableTuneItems.getValue()).isEmpty()) {
                MutableSharedFlow mutableSharedFlow3 = this.this$0.mutableDetailsWithIdAndStatus;
                this.label = 3;
                obj = FlowKt.first(mutableSharedFlow3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (!((Collection) obj).isEmpty()) {
                    tuningDetailsListViewModel = this.this$0;
                    this.label = 4;
                    if (tuningDetailsListViewModel.initCurrentSelectors(this) == coroutine_suspended) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void setDetailsWithIdAndStatus(@Nullable JSONArray jsonArray) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C46681(jsonArray, this, null), 2, null);
    }

    public final List<TuneObj> setCorrectDetailsListFormatTune(List<Integer> listCorrectDetailsWithCostAndStatus, List<TuneObj> detailsItems) {
        ArrayList arrayList = new ArrayList();
        int size = detailsItems.size();
        for (int i = 0; i < size; i++) {
            int id = detailsItems.get(i).getId();
            int i2 = 1;
            if (detailsItems.get(i).getDef() == 1) {
                int i3 = 0;
                while (i3 < listCorrectDetailsWithCostAndStatus.size()) {
                    if (id == listCorrectDetailsWithCostAndStatus.get(i3).intValue()) {
                        if (i2 < listCorrectDetailsWithCostAndStatus.size()) {
                            detailsItems.get(i).setThisLocation(listCorrectDetailsWithCostAndStatus.get(i2).intValue());
                        } else {
                            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                            firebaseCrashlytics.log("idFromList = " + id + ", listCorrectDetailsWithCostAndStatus.size = " + listCorrectDetailsWithCostAndStatus.size() + ", locationPosition = " + i2);
                            firebaseCrashlytics.recordException(new Throwable());
                        }
                    }
                    i3 += 2;
                    i2 += 2;
                }
                detailsItems.get(i).setChecked(false);
                arrayList.add(detailsItems.get(i));
            } else {
                int i4 = 0;
                while (i4 < listCorrectDetailsWithCostAndStatus.size()) {
                    int iIntValue = listCorrectDetailsWithCostAndStatus.get(i4).intValue();
                    int iIntValue2 = listCorrectDetailsWithCostAndStatus.get(i2).intValue();
                    if (id == iIntValue) {
                        detailsItems.get(i).setThisLocation(iIntValue2);
                        detailsItems.get(i).setChecked(false);
                        arrayList.add(detailsItems.get(i));
                    }
                    i4 += 2;
                    i2 += 2;
                }
            }
        }
        return arrayList;
    }

    public final List<TuneObj> getTuneItemsForCurrentSelector(int selector) {
        ArrayList arrayList = new ArrayList();
        List<TuneObj> value = this.mutableTuneItems.getValue();
        if (!value.isEmpty()) {
            int iIntValue = this.mutableGosCost.getValue().intValue();
            int size = value.size();
            for (int i = 0; i < size; i++) {
                if (value.get(i).getSelector() == selector) {
                    arrayList.add(value.get(i));
                }
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((TuneObj) arrayList.get(i2)).setCost(this.costCalculation.getDetailPrice(((TuneObj) arrayList.get(i2)).getType(), iIntValue, ((TuneObj) arrayList.get(i2)).getTuneId()));
            }
        }
        return arrayList;
    }

    public final void sendBuyNewDetail(int detailId) throws JSONException {
        this.actionWithJson.putIntegerDataToServer(7, detailId);
    }

    public final void sendSetDetail(int detailId) throws JSONException {
        if (detailId != -1) {
            this.actionWithJson.putIntegerDataToServer(10, detailId);
            return;
        }
        this.localNotification.showErrorNotification(this.stringResources.tuningError());
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        firebaseCrashlytics.log("sendSetDetail, t = 10, detailId(d) = -1");
        firebaseCrashlytics.recordException(new Throwable());
    }

    /* compiled from: TuningDetailsListViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$updateItemsAfterPurchaseOrSet$1", m7120f = "TuningDetailsListViewModel.kt", m7121i = {}, m7122l = {283}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$updateItemsAfterPurchaseOrSet$1 */
    /* loaded from: classes2.dex */
    public static final class C46751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public final /* synthetic */ int $newCurrentStatus;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46751(JSONObject jSONObject, int i, Continuation<? super C46751> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.$newCurrentStatus = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TuningDetailsListViewModel.this.new C46751(this.$json, this.$newCurrentStatus, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TuningDetailsListViewModel tuningDetailsListViewModel = TuningDetailsListViewModel.this;
                    JSONObject jSONObject = this.$json;
                    int i2 = this.$newCurrentStatus;
                    this.label = 1;
                    if (tuningDetailsListViewModel.updateItemStatus(jSONObject, i2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void updateItemsAfterPurchaseOrSet(@NotNull JSONObject json, int newCurrentStatus) {
        Intrinsics.checkNotNullParameter(json, "json");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C46751(json, newCurrentStatus, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateItemStatus(JSONObject jSONObject, int i, Continuation<? super Unit> continuation) throws Throwable {
        C46741 c46741;
        int iOptInt;
        TuningDetailsListViewModel tuningDetailsListViewModel;
        int i2;
        int i3;
        if (continuation instanceof C46741) {
            c46741 = (C46741) continuation;
            int i4 = c46741.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c46741.label = i4 - Integer.MIN_VALUE;
            } else {
                c46741 = new C46741(continuation);
            }
        }
        Object obj = c46741.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = c46741.label;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            int iOptInt2 = jSONObject.optInt("p");
            iOptInt = jSONObject.optInt("r");
            c46741.L$0 = this;
            c46741.I$0 = i;
            c46741.I$1 = iOptInt2;
            c46741.I$2 = iOptInt;
            c46741.label = 1;
            if (updateCurrentDetails(iOptInt2, iOptInt, i, c46741) == coroutine_suspended) {
                return coroutine_suspended;
            }
            tuningDetailsListViewModel = this;
            i2 = i;
            i3 = iOptInt2;
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            iOptInt = c46741.I$2;
            i3 = c46741.I$1;
            i2 = c46741.I$0;
            tuningDetailsListViewModel = (TuningDetailsListViewModel) c46741.L$0;
            ResultKt.throwOnFailure(obj);
        }
        c46741.L$0 = null;
        c46741.label = 2;
        if (tuningDetailsListViewModel.updateDetailInfo(i3, iOptInt, i2, c46741) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateCurrentDetails(int i, int i2, int i3, Continuation<? super Unit> continuation) throws Throwable {
        C46721 c46721;
        TuningDetailsListViewModel tuningDetailsListViewModel;
        Object obj;
        Object next;
        TuningDetailsListViewModel tuningDetailsListViewModel2;
        int i4;
        int i5;
        if (continuation instanceof C46721) {
            c46721 = (C46721) continuation;
            int i6 = c46721.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c46721.label = i6 - Integer.MIN_VALUE;
            } else {
                c46721 = new C46721(continuation);
            }
        }
        Object objFirst = c46721.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = c46721.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(objFirst);
            MutableSharedFlow<List<TuneObj>> mutableSharedFlow = this.mutableDetailsList;
            c46721.L$0 = this;
            c46721.I$0 = i;
            c46721.I$1 = i2;
            c46721.I$2 = i3;
            c46721.label = 1;
            objFirst = FlowKt.first(mutableSharedFlow, c46721);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
            tuningDetailsListViewModel = this;
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5 = c46721.I$1;
                i4 = c46721.I$0;
                tuningDetailsListViewModel2 = (TuningDetailsListViewModel) c46721.L$0;
                ResultKt.throwOnFailure(objFirst);
                tuningDetailsListViewModel2.mutableNewAndOldDetails.setValue(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(i4), Boxing.boxInt(i5)}));
                return Unit.INSTANCE;
            }
            i3 = c46721.I$2;
            i2 = c46721.I$1;
            i = c46721.I$0;
            tuningDetailsListViewModel = (TuningDetailsListViewModel) c46721.L$0;
            ResultKt.throwOnFailure(objFirst);
        }
        List<TuneObj> list = (List) objFirst;
        List<TuneObj> list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((TuneObj) next).getId() == i) {
                break;
            }
        }
        TuneObj tuneObj = (TuneObj) next;
        if (tuneObj != null) {
            tuneObj.setThisLocation(i3);
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((TuneObj) next2).getId() == i2) {
                obj = next2;
                break;
            }
        }
        TuneObj tuneObj2 = (TuneObj) obj;
        if (tuneObj2 != null && tuneObj2.getThisLocation() == 2) {
            tuneObj2.setThisLocation(1);
        }
        MutableSharedFlow<List<TuneObj>> mutableSharedFlow2 = tuningDetailsListViewModel.mutableDetailsList;
        c46721.L$0 = tuningDetailsListViewModel;
        c46721.I$0 = i;
        c46721.I$1 = i2;
        c46721.label = 2;
        if (mutableSharedFlow2.emit(list, c46721) == coroutine_suspended) {
            return coroutine_suspended;
        }
        tuningDetailsListViewModel2 = tuningDetailsListViewModel;
        int i8 = i2;
        i4 = i;
        i5 = i8;
        tuningDetailsListViewModel2.mutableNewAndOldDetails.setValue(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(i4), Boxing.boxInt(i5)}));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateDetailInfo(int i, int i2, int i3, Continuation<? super Unit> continuation) throws Throwable {
        C46731 c46731;
        TuningDetailsListViewModel tuningDetailsListViewModel;
        if (continuation instanceof C46731) {
            c46731 = (C46731) continuation;
            int i4 = c46731.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c46731.label = i4 - Integer.MIN_VALUE;
            } else {
                c46731 = new C46731(continuation);
            }
        }
        Object objFirst = c46731.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = c46731.label;
        if (i5 == 0) {
            ResultKt.throwOnFailure(objFirst);
            MutableSharedFlow<List<Integer>> mutableSharedFlow = this.mutableDetailsWithIdAndStatus;
            c46731.L$0 = this;
            c46731.I$0 = i;
            c46731.I$1 = i2;
            c46731.I$2 = i3;
            c46731.label = 1;
            objFirst = FlowKt.first(mutableSharedFlow, c46731);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
            tuningDetailsListViewModel = this;
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFirst);
                return Unit.INSTANCE;
            }
            i3 = c46731.I$2;
            i2 = c46731.I$1;
            i = c46731.I$0;
            tuningDetailsListViewModel = (TuningDetailsListViewModel) c46731.L$0;
            ResultKt.throwOnFailure(objFirst);
        }
        List<Integer> list = (List) objFirst;
        int i6 = 0;
        int i7 = 1;
        boolean z = false;
        while (i6 < list.size()) {
            if (list.get(i6).intValue() == i) {
                list.set(i7, Boxing.boxInt(i3));
                z = true;
            }
            if (list.get(i6).intValue() == i2 && list.get(i7).intValue() == 2) {
                list.set(i7, Boxing.boxInt(1));
            }
            i6 += 2;
            i7 += 2;
        }
        if (!z) {
            list.add(Boxing.boxInt(i));
            list.add(Boxing.boxInt(i3));
        }
        MutableSharedFlow<List<Integer>> mutableSharedFlow2 = tuningDetailsListViewModel.mutableDetailsWithIdAndStatus;
        c46731.L$0 = null;
        c46731.label = 2;
        if (mutableSharedFlow2.emit(list, c46731) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    public final void previewDetail(int detailTuneId) throws JSONException {
        this.actionWithJson.putDetailOrCollapseToClient(22, detailTuneId);
    }

    public final void playSound(int soundTuneId) throws JSONException {
        this.actionWithJson.putSoundToClient(29, soundTuneId);
    }

    /* compiled from: TuningDetailsListViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$resetDetail$1", m7120f = "TuningDetailsListViewModel.kt", m7121i = {0, 1, 1, 2}, m7122l = {371, 379, 385}, m7123m = "invokeSuspend", m7124n = {"oldDetailId", "allItems", "oldDetailId", "oldDetailId"}, m7125s = {"I$0", "L$0", "I$0", "I$0"})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$resetDetail$1 */
    /* loaded from: classes2.dex */
    public static final class C46641 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int I$0;
        public Object L$0;
        public int label;
        public final /* synthetic */ TuningDetailsListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46641(JSONObject jSONObject, TuningDetailsListViewModel tuningDetailsListViewModel, Continuation<? super C46641> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = tuningDetailsListViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C46641(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x009b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int iOptInt;
            Object next;
            List list;
            MutableSharedFlow mutableSharedFlow;
            int i;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                iOptInt = this.$json.optInt("r");
                if (iOptInt != -1) {
                    MutableSharedFlow mutableSharedFlow2 = this.this$0.mutableDetailsList;
                    this.I$0 = iOptInt;
                    this.label = 1;
                    obj = FlowKt.first(mutableSharedFlow2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$0;
                    ResultKt.throwOnFailure(obj);
                    this.this$0.mutableNewAndOldDetails.setValue(CollectionsKt__CollectionsJVMKt.listOf(Boxing.boxInt(i)));
                    return Unit.INSTANCE;
                }
                iOptInt = this.I$0;
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                mutableSharedFlow = this.this$0.mutableDetailsList;
                this.L$0 = null;
                this.I$0 = iOptInt;
                this.label = 3;
                if (mutableSharedFlow.emit(list, this) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = iOptInt;
                this.this$0.mutableNewAndOldDetails.setValue(CollectionsKt__CollectionsJVMKt.listOf(Boxing.boxInt(i)));
                return Unit.INSTANCE;
            }
            iOptInt = this.I$0;
            ResultKt.throwOnFailure(obj);
            List list2 = (List) obj;
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((TuneObj) next).getId() == iOptInt) {
                    break;
                }
            }
            TuneObj tuneObj = (TuneObj) next;
            if (tuneObj != null) {
                tuneObj.setThisLocation(1);
            }
            TuningDetailsListViewModel tuningDetailsListViewModel = this.this$0;
            this.L$0 = list2;
            this.I$0 = iOptInt;
            this.label = 2;
            if (tuningDetailsListViewModel.updateDetailInfo(-1, iOptInt, 2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = list2;
            mutableSharedFlow = this.this$0.mutableDetailsList;
            this.L$0 = null;
            this.I$0 = iOptInt;
            this.label = 3;
            if (mutableSharedFlow.emit(list, this) != coroutine_suspended) {
            }
        }
    }

    public final void resetDetail(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C46641(json, this, null), 2, null);
    }

    /* compiled from: TuningDetailsListViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$initVinyls$1", m7120f = "TuningDetailsListViewModel.kt", m7121i = {}, m7122l = {402}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$initVinyls$1 */
    /* loaded from: classes2.dex */
    public static final class C46621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<TuneVinylsObj> $tuneVinyls;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46621(List<TuneVinylsObj> list, Continuation<? super C46621> continuation) {
            super(2, continuation);
            this.$tuneVinyls = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TuningDetailsListViewModel.this.new C46621(this.$tuneVinyls, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableSharedFlow mutableSharedFlow = TuningDetailsListViewModel.this.mutableVinylsList;
                    List<TuneVinylsObj> list = this.$tuneVinyls;
                    this.label = 1;
                    if (mutableSharedFlow.emit(list, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void initVinyls(@NotNull List<TuneVinylsObj> tuneVinyls) {
        Intrinsics.checkNotNullParameter(tuneVinyls, "tuneVinyls");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C46621(tuneVinyls, null), 2, null);
    }

    /* compiled from: TuningDetailsListViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$setStartVinyl$1", m7120f = "TuningDetailsListViewModel.kt", m7121i = {1, 1}, m7122l = {HttpStatus.SC_PRECONDITION_FAILED, 418}, m7123m = "invokeSuspend", m7124n = {"oldVinylPos", "newVinylPos"}, m7125s = {"I$0", "I$1"})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$setStartVinyl$1 */
    /* loaded from: classes2.dex */
    public static final class C46711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $vinylName;
        public int I$0;
        public int I$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46711(String str, Continuation<? super C46711> continuation) {
            super(2, continuation);
            this.$vinylName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TuningDetailsListViewModel.this.new C46711(this.$vinylName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int iResetVinyl;
            int i;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = TuningDetailsListViewModel.this.mutableVinylsList;
                this.label = 1;
                obj = FlowKt.first(mutableSharedFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$1;
                    iResetVinyl = this.I$0;
                    ResultKt.throwOnFailure(obj);
                    TuningDetailsListViewModel.this.mutableNewAndOldVinyls.setValue(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(i), Boxing.boxInt(iResetVinyl)}));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) obj;
            iResetVinyl = TuningDetailsListViewModel.this.resetVinyl(list);
            int startVinyl = TuningDetailsListViewModel.this.setStartVinyl(list, this.$vinylName, null);
            MutableSharedFlow mutableSharedFlow2 = TuningDetailsListViewModel.this.mutableVinylsList;
            this.I$0 = iResetVinyl;
            this.I$1 = startVinyl;
            this.label = 2;
            if (mutableSharedFlow2.emit(list, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i = startVinyl;
            TuningDetailsListViewModel.this.mutableNewAndOldVinyls.setValue(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(i), Boxing.boxInt(iResetVinyl)}));
            return Unit.INSTANCE;
        }
    }

    public final void setStartVinyl(@NotNull String vinylName) {
        Intrinsics.checkNotNullParameter(vinylName, "vinylName");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C46711(vinylName, null), 2, null);
    }

    /* compiled from: TuningDetailsListViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$resetVinyl$1", m7120f = "TuningDetailsListViewModel.kt", m7121i = {1}, m7122l = {HttpStatus.SC_TOO_MANY_REQUESTS, 433}, m7123m = "invokeSuspend", m7124n = {"oldVinylPos"}, m7125s = {"I$0"})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$resetVinyl$1 */
    /* loaded from: classes2.dex */
    public static final class C46651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int I$0;
        public int label;

        public C46651(Continuation<? super C46651> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TuningDetailsListViewModel.this.new C46651(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = TuningDetailsListViewModel.this.mutableVinylsList;
                this.label = 1;
                obj = FlowKt.first(mutableSharedFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$0;
                    ResultKt.throwOnFailure(obj);
                    TuningDetailsListViewModel.this.mutableNewAndOldVinyls.setValue(CollectionsKt__CollectionsJVMKt.listOf(Boxing.boxInt(i)));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) obj;
            int iResetVinyl = TuningDetailsListViewModel.this.resetVinyl(list);
            MutableSharedFlow mutableSharedFlow2 = TuningDetailsListViewModel.this.mutableVinylsList;
            this.I$0 = iResetVinyl;
            this.label = 2;
            if (mutableSharedFlow2.emit(list, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i = iResetVinyl;
            TuningDetailsListViewModel.this.mutableNewAndOldVinyls.setValue(CollectionsKt__CollectionsJVMKt.listOf(Boxing.boxInt(i)));
            return Unit.INSTANCE;
        }
    }

    public final void resetVinyl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C46651(null), 2, null);
    }

    public final int resetVinyl(List<TuneVinylsObj> allVinyls) {
        Object next;
        Iterator<T> it = allVinyls.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((TuneVinylsObj) next).getStartVinyl()) {
                break;
            }
        }
        TuneVinylsObj tuneVinylsObj = (TuneVinylsObj) next;
        if (tuneVinylsObj == null) {
            return -1;
        }
        tuneVinylsObj.setStartVinyl(false);
        return allVinyls.indexOf(tuneVinylsObj);
    }

    public final int setStartVinyl(List<TuneVinylsObj> allVinyls, String vinylName, Integer vinylId) {
        Object next;
        boolean zAreEqual;
        Iterator<T> it = allVinyls.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            TuneVinylsObj tuneVinylsObj = (TuneVinylsObj) next;
            if (vinylName != null) {
                zAreEqual = Intrinsics.areEqual(tuneVinylsObj.getNameVinyl(), vinylName);
            } else {
                zAreEqual = vinylId != null && tuneVinylsObj.getId() == vinylId.intValue();
            }
            if (zAreEqual) {
                break;
            }
        }
        TuneVinylsObj tuneVinylsObj2 = (TuneVinylsObj) next;
        if (tuneVinylsObj2 == null) {
            return -1;
        }
        tuneVinylsObj2.setStartVinyl(true);
        return allVinyls.indexOf(tuneVinylsObj2);
    }

    public final void sendBuyVinyl(int vinylId) throws JSONException {
        this.actionWithJson.putIntegerDataToServer(3, vinylId);
    }

    public final void previewVinyl(@NotNull String vinylName) throws JSONException {
        Intrinsics.checkNotNullParameter(vinylName, "vinylName");
        this.actionWithJson.putVinylToClient(25, vinylName);
    }

    /* compiled from: TuningDetailsListViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$updateVinylsAfterEstablished$1", m7120f = "TuningDetailsListViewModel.kt", m7121i = {1, 1}, m7122l = {490, 495}, m7123m = "invokeSuspend", m7124n = {"oldPos", "newPos"}, m7125s = {"I$0", "I$1"})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$updateVinylsAfterEstablished$1 */
    /* loaded from: classes2.dex */
    public static final class C46761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int I$0;
        public int I$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46761(JSONObject jSONObject, Continuation<? super C46761> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TuningDetailsListViewModel.this.new C46761(this.$json, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int iResetVinyl;
            int i;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = TuningDetailsListViewModel.this.mutableVinylsList;
                this.label = 1;
                obj = FlowKt.first(mutableSharedFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$1;
                    iResetVinyl = this.I$0;
                    ResultKt.throwOnFailure(obj);
                    TuningDetailsListViewModel.this.mutableNewAndOldVinyls.setValue(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(i), Boxing.boxInt(iResetVinyl)}));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) obj;
            iResetVinyl = TuningDetailsListViewModel.this.resetVinyl(list);
            int startVinyl = TuningDetailsListViewModel.this.setStartVinyl(list, null, Boxing.boxInt(this.$json.optInt("p")));
            MutableSharedFlow mutableSharedFlow2 = TuningDetailsListViewModel.this.mutableVinylsList;
            this.I$0 = iResetVinyl;
            this.I$1 = startVinyl;
            this.label = 2;
            if (mutableSharedFlow2.emit(list, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i = startVinyl;
            TuningDetailsListViewModel.this.mutableNewAndOldVinyls.setValue(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(i), Boxing.boxInt(iResetVinyl)}));
            return Unit.INSTANCE;
        }
    }

    public final void updateVinylsAfterEstablished(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C46761(json, null), 2, null);
    }

    /* compiled from: TuningDetailsListViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$initItemsForBoxList$1", m7120f = "TuningDetailsListViewModel.kt", m7121i = {}, m7122l = {536}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$initItemsForBoxList$1 */
    /* loaded from: classes2.dex */
    public static final class C46591 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $carId;
        public int label;
        public final /* synthetic */ TuningDetailsListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46591(int i, TuningDetailsListViewModel tuningDetailsListViewModel, Continuation<? super C46591> continuation) {
            super(2, continuation);
            this.$carId = i;
            this.this$0 = tuningDetailsListViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C46591(this.$carId, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            boolean z;
            String str;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ArrayList arrayList = new ArrayList();
                    Iterator<Integer> it = TuningConstants.INSTANCE.getElectronicCars().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        if (it.next().intValue() == this.$carId) {
                            z = true;
                            break;
                        }
                    }
                    int size = TuningConstants.INSTANCE.getActiveSelectorListForInfoBrake().size();
                    boolean z2 = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        List<TuneObj> tuneItemsForCurrentSelector = this.this$0.getTuneItemsForCurrentSelector(TuningConstants.INSTANCE.getActiveSelectorListForInfoBrake().get(i2).intValue());
                        if (!z2) {
                            this.this$0.mutableCurrentBox.setValue(tuneItemsForCurrentSelector.get(0));
                            z2 = true;
                        }
                        tuneItemsForCurrentSelector.remove(0);
                        for (TuneObj tuneObj : tuneItemsForCurrentSelector) {
                            if (z) {
                                String str2 = TuningConstants.INSTANCE.getTitleItemForElectronicCars().get(i2);
                                str = ((Object) str2) + " " + tuneObj.getName();
                            } else {
                                String str3 = TuningConstants.INSTANCE.getTitleItemsForDVSCars().get(i2);
                                str = ((Object) str3) + " " + tuneObj.getName();
                            }
                            arrayList.add(new TuningBoxItemObj(tuneObj.getId(), str));
                        }
                    }
                    MutableStateFlow mutableStateFlow = this.this$0.mutableItemsForBox;
                    this.label = 1;
                    if (mutableStateFlow.emit(arrayList, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void initItemsForBoxList(int carId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C46591(carId, this, null), 2, null);
    }

    public final void openBox(int boxId) throws JSONException {
        this.actionWithJson.putIntegerDataToServer(11, boxId);
    }

    public final void setNewStatusForDialogBox(boolean newStatus) {
        this.mutableVisibleDialogBox.setValue(Boolean.valueOf(newStatus));
    }

    /* compiled from: TuningDetailsListViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$setNewPresent$1", m7120f = "TuningDetailsListViewModel.kt", m7121i = {}, m7122l = {558}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nTuningDetailsListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TuningDetailsListViewModel.kt\ncom/blackhub/bronline/game/gui/tuning/viewmodel/TuningDetailsListViewModel$setNewPresent$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,726:1\n37#2,2:727\n*S KotlinDebug\n*F\n+ 1 TuningDetailsListViewModel.kt\ncom/blackhub/bronline/game/gui/tuning/viewmodel/TuningDetailsListViewModel$setNewPresent$1\n*L\n566#1:727,2\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$setNewPresent$1 */
    /* loaded from: classes2.dex */
    public static final class C46701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ TuningDetailsListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46701(JSONObject jSONObject, TuningDetailsListViewModel tuningDetailsListViewModel, Continuation<? super C46701> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = tuningDetailsListViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C46701(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object next;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                JSONObject jSONObject = this.$json;
                if (jSONObject == null) {
                    this.this$0.mutableNamePresent.setValue(CollectionsKt__CollectionsKt.emptyList());
                    return Unit.INSTANCE;
                }
                TuningDetailsListViewModel tuningDetailsListViewModel = this.this$0;
                this.label = 1;
                if (tuningDetailsListViewModel.updateItemStatus(jSONObject, 1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            int iOptInt = this.$json.optInt("p");
            Iterator it = ((List) this.this$0.mutableItemsForBox.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((TuningBoxItemObj) next).getId() == iOptInt) {
                    break;
                }
            }
            TuningBoxItemObj tuningBoxItemObj = (TuningBoxItemObj) next;
            if (tuningBoxItemObj != null) {
                TuningDetailsListViewModel tuningDetailsListViewModel2 = this.this$0;
                String strNextLine = new Scanner(tuningBoxItemObj.getName()).nextLine();
                Intrinsics.checkNotNull(strNextLine);
                String[] strArr = (String[]) new Regex(" ").split(strNextLine, 0).toArray(new String[0]);
                if (strArr.length >= 2) {
                    tuningDetailsListViewModel2.mutableNamePresent.setValue(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{strArr[0], strArr[1]}));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void setNewPresent(@Nullable JSONObject json) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C46701(json, this, null), 2, null);
    }

    /* compiled from: TuningDetailsListViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$setAllSelectors$1", m7120f = "TuningDetailsListViewModel.kt", m7121i = {}, m7122l = {583}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel$setAllSelectors$1 */
    /* loaded from: classes2.dex */
    public static final class C46661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $carId;
        public final /* synthetic */ TuneGuiNodeObj $tuningType;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46661(TuneGuiNodeObj tuneGuiNodeObj, int i, Continuation<? super C46661> continuation) {
            super(2, continuation);
            this.$tuningType = tuneGuiNodeObj;
            this.$carId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TuningDetailsListViewModel.this.new C46661(this.$tuningType, this.$carId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TuningDetailsListViewModel tuningDetailsListViewModel = TuningDetailsListViewModel.this;
                    TuneGuiNodeObj tuneGuiNodeObj = this.$tuningType;
                    int i2 = this.$carId;
                    this.label = 1;
                    if (tuningDetailsListViewModel.initItemsForSubmenu(tuneGuiNodeObj, i2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void setAllSelectors(@NotNull TuneGuiNodeObj tuningType, int carId) {
        Intrinsics.checkNotNullParameter(tuningType, "tuningType");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new C46661(tuningType, carId, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initItemsForSubmenu(TuneGuiNodeObj tuneGuiNodeObj, int i, Continuation<? super Unit> continuation) throws Throwable {
        C46601 c46601;
        TuningDetailsListViewModel tuningDetailsListViewModel;
        if (continuation instanceof C46601) {
            c46601 = (C46601) continuation;
            int i2 = c46601.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c46601.label = i2 - Integer.MIN_VALUE;
            } else {
                c46601 = new C46601(continuation);
            }
        }
        Object obj = c46601.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c46601.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            List<Integer> value = this.mutableAllSelectors.getValue();
            if (!value.isEmpty()) {
                List<TuneGuiNodeObj> listLInitItems = lInitItems(tuneGuiNodeObj, value, i);
                MutableSharedFlow<List<TuneGuiNodeObj>> mutableSharedFlow = this.mutableAllItemsForSubmenu;
                c46601.label = 1;
                if (mutableSharedFlow.emit(listLInitItems, c46601) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            c46601.L$0 = this;
            c46601.L$1 = tuneGuiNodeObj;
            c46601.I$0 = i;
            c46601.label = 2;
            if (initCurrentSelectors(c46601) == coroutine_suspended) {
                return coroutine_suspended;
            }
            tuningDetailsListViewModel = this;
            c46601.L$0 = null;
            c46601.L$1 = null;
            c46601.label = 3;
            if (tuningDetailsListViewModel.initItemsForSubmenu(tuneGuiNodeObj, i, c46601) == coroutine_suspended) {
            }
        } else {
            if (i3 == 1) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i3 == 2) {
                i = c46601.I$0;
                tuneGuiNodeObj = (TuneGuiNodeObj) c46601.L$1;
                tuningDetailsListViewModel = (TuningDetailsListViewModel) c46601.L$0;
                ResultKt.throwOnFailure(obj);
                c46601.L$0 = null;
                c46601.L$1 = null;
                c46601.label = 3;
                if (tuningDetailsListViewModel.initItemsForSubmenu(tuneGuiNodeObj, i, c46601) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        }
        FirebaseCrashlytics.getInstance().log("initItemsForSubmenu recursion");
        FirebaseCrashlytics.getInstance().recordException(new Throwable());
        return Unit.INSTANCE;
    }

    public final List<TuneGuiNodeObj> lInitItems(TuneGuiNodeObj tuningType, List<Integer> allSelectors, int carId) {
        ArrayList arrayList = new ArrayList();
        int size = tuningType.getNames().size();
        for (int i = 0; i < size; i++) {
            int selectorId = tuningType.getNames().get(i).getSelectorId();
            if (tuningType.getNames().get(i).getOpensType() == 2 && selectorId != 2) {
                int size2 = allSelectors.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (selectorId == allSelectors.get(i2).intValue()) {
                        TuneGuiNodeObj tuneGuiNodeObj = tuningType.getNames().get(i);
                        Intrinsics.checkNotNullExpressionValue(tuneGuiNodeObj, "get(...)");
                        arrayList.add(changeIcons(tuneGuiNodeObj, carId, selectorId));
                    }
                }
            } else if (selectorId == 2) {
                int size3 = TuningConstants.INSTANCE.getCarIdWithoutVinyls().size();
                int i3 = 0;
                while (true) {
                    if (i3 < size3) {
                        if (carId == TuningConstants.INSTANCE.getCarIdWithoutVinyls().get(i3).intValue()) {
                            break;
                        }
                        i3++;
                    } else {
                        TuneGuiNodeObj tuneGuiNodeObj2 = tuningType.getNames().get(i);
                        Intrinsics.checkNotNullExpressionValue(tuneGuiNodeObj2, "get(...)");
                        arrayList.add(tuneGuiNodeObj2);
                        break;
                    }
                }
            } else {
                TuneGuiNodeObj tuneGuiNodeObj3 = tuningType.getNames().get(i);
                Intrinsics.checkNotNullExpressionValue(tuneGuiNodeObj3, "get(...)");
                arrayList.add(tuneGuiNodeObj3);
            }
        }
        return arrayList;
    }

    public final TuneGuiNodeObj changeIcons(TuneGuiNodeObj obj, int carId, int selectorId) {
        Iterator<Integer> it = TuningConstants.INSTANCE.getElectronicCars().iterator();
        int i = 0;
        boolean z = false;
        while (it.hasNext()) {
            if (carId == it.next().intValue()) {
                z = true;
            }
        }
        int size = TuningConstants.INSTANCE.getActiveSelectorListForInfoBrake().size();
        while (true) {
            if (i >= size) {
                break;
            }
            TuningConstants tuningConstants = TuningConstants.INSTANCE;
            if (selectorId != tuningConstants.getActiveSelectorListForInfoBrake().get(i).intValue()) {
                i++;
            } else if (z) {
                obj.setName(tuningConstants.getTitleItemForElectronicCars().get(i));
                obj.setImageId(tuningConstants.getResForElectronicCars().get(i));
            } else {
                obj.setName(tuningConstants.getTitleItemsForDVSCars().get(i));
                obj.setImageId(tuningConstants.getResForDVSCars().get(i));
            }
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initCurrentSelectors(Continuation<? super Unit> continuation) throws Throwable {
        C46581 c46581;
        TuningDetailsListViewModel tuningDetailsListViewModel;
        List<Integer> list;
        if (continuation instanceof C46581) {
            c46581 = (C46581) continuation;
            int i = c46581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c46581.label = i - Integer.MIN_VALUE;
            } else {
                c46581 = new C46581(continuation);
            }
        }
        Object currentSelectors = c46581.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c46581.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(currentSelectors);
            List<TuneObj> value = this.mutableTuneItems.getValue();
            if (!value.isEmpty()) {
                List<Integer> allSelectorsWithDef1 = getAllSelectorsWithDef1(value);
                c46581.L$0 = this;
                c46581.L$1 = allSelectorsWithDef1;
                c46581.label = 1;
                currentSelectors = getCurrentSelectors(value, c46581);
                if (currentSelectors == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tuningDetailsListViewModel = this;
                list = allSelectorsWithDef1;
            } else {
                FirebaseCrashlytics.getInstance().log("tuneItems empty");
                FirebaseCrashlytics.getInstance().recordException(new Throwable());
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) c46581.L$1;
            tuningDetailsListViewModel = (TuningDetailsListViewModel) c46581.L$0;
            ResultKt.throwOnFailure(currentSelectors);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(list);
        linkedHashSet.addAll((List) currentSelectors);
        tuningDetailsListViewModel.mutableAllSelectors.setValue(new ArrayList(linkedHashSet));
        tuningDetailsListViewModel.ifInitSelectors = true;
        return Unit.INSTANCE;
    }

    public final List<Integer> getAllSelectorsWithDef1(List<TuneObj> tuneItemsFromJSON) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (TuneObj tuneObj : tuneItemsFromJSON) {
            if (tuneObj.getDef() == 1) {
                linkedHashSet.add(Integer.valueOf(tuneObj.getSelector()));
            }
        }
        return new ArrayList(linkedHashSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCurrentSelectors(List<TuneObj> list, Continuation<? super List<Integer>> continuation) throws Throwable {
        C46571 c46571;
        Object next;
        if (continuation instanceof C46571) {
            c46571 = (C46571) continuation;
            int i = c46571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c46571.label = i - Integer.MIN_VALUE;
            } else {
                c46571 = new C46571(continuation);
            }
        }
        Object objFirst = c46571.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c46571.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            MutableSharedFlow<List<Integer>> mutableSharedFlow = this.mutableDetailsWithIdAndStatus;
            c46571.L$0 = list;
            c46571.label = 1;
            objFirst = FlowKt.first(mutableSharedFlow, c46571);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) c46571.L$0;
            ResultKt.throwOnFailure(objFirst);
        }
        List list2 = (List) objFirst;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Ref.IntRef intRef = new Ref.IntRef();
        while (intRef.element < list2.size()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((TuneObj) next).getId() == ((Number) list2.get(intRef.element)).intValue()) {
                    break;
                }
            }
            TuneObj tuneObj = (TuneObj) next;
            if (tuneObj != null) {
                Boxing.boxBoolean(linkedHashSet.add(Boxing.boxInt(tuneObj.getSelector())));
            }
            intRef.element += 2;
        }
        return new ArrayList(linkedHashSet);
    }
}

