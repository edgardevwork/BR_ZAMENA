package com.blackhub.bronline.game.gui.smieditor.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.media.AudioAttributesCompat;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.p007ts.TsExtractor;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj;
import com.blackhub.bronline.game.gui.smieditor.data.SmiInfo;
import com.blackhub.bronline.game.gui.smieditor.data.SmiList;
import com.blackhub.bronline.game.gui.smieditor.network.SmiEditorActionWithJSON;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
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
import org.apache.commons.compress.compressors.bzip2.BZip2Constants;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SmiEditorViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u00100\u001a\u000201J\u001e\u00102\u001a\u0002012\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u00104\u001a\u00020\u001bH\u0002J\u0006\u00105\u001a\u000201J\u0006\u00106\u001a\u000201J\u0014\u00107\u001a\u0002012\f\u00108\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u000e\u00109\u001a\u0002012\u0006\u0010:\u001a\u00020\fJ\u0016\u0010;\u001a\u0002012\u0006\u0010<\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010=J\u0016\u0010>\u001a\u0002012\u0006\u0010<\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010=J\u001c\u0010?\u001a\u0002012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082@¢\u0006\u0002\u0010AJ\u0010\u0010B\u001a\u0002012\u0006\u0010C\u001a\u00020\u001bH\u0002J \u0010D\u001a\u0002012\b\u0010E\u001a\u0004\u0018\u00010\u00102\u0006\u0010F\u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010GJ\u000e\u0010H\u001a\u0002012\u0006\u0010:\u001a\u00020\u0010J\u000e\u0010I\u001a\u0002012\u0006\u0010J\u001a\u00020\u001bJ\u000e\u0010K\u001a\u0002012\u0006\u0010L\u001a\u00020\nJ\u0010\u0010M\u001a\u0002012\b\u0010N\u001a\u0004\u0018\u00010OJ\u000e\u0010P\u001a\u0002012\u0006\u0010Q\u001a\u00020\u0010J\u000e\u0010R\u001a\u0002012\u0006\u0010F\u001a\u00020\u001bJ\u000e\u0010S\u001a\u0002012\u0006\u0010L\u001a\u00020\u0012J\u000e\u0010T\u001a\u0002012\u0006\u0010U\u001a\u00020\u0010J\u0018\u0010V\u001a\u0002012\b\u0010E\u001a\u0004\u0018\u00010\u00102\u0006\u0010F\u001a\u00020\u001bJ\u000e\u0010W\u001a\u0002012\u0006\u0010N\u001a\u00020OR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\u001d¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001d¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u001d\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\u001d¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100\u001d¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u001d¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001b0'¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)¨\u0006X"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/smieditor/viewmodel/SmiEditorViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/smieditor/network/SmiEditorActionWithJSON;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "(Lcom/blackhub/bronline/game/gui/smieditor/network/SmiEditorActionWithJSON;Lcom/blackhub/bronline/game/common/LocalNotification;)V", "mutableBodyFromJSON", "", "Lcom/blackhub/bronline/game/gui/smieditor/data/SmiEditorBodyObj;", "mutableCarsAndAccessories", "Lcom/blackhub/bronline/game/gui/smieditor/data/SmiList;", "mutableFinalText", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "", "mutableFourthColumn", "", "mutableObjForNavigation", "Lkotlinx/coroutines/flow/MutableStateFlow;", "mutableSecondColumn", "mutableStartText", "mutableThirdColumn", "mutableTitleSecondColumn", "mutableTitleThirdColumn", "mutableValueOfQueue", "", "newFinalText", "Lkotlinx/coroutines/flow/SharedFlow;", "getNewFinalText", "()Lkotlinx/coroutines/flow/SharedFlow;", "newFourthColumn", "getNewFourthColumn", "newSecondColumn", "getNewSecondColumn", "newThirdColumn", "getNewThirdColumn", "startText", "Lkotlinx/coroutines/flow/StateFlow;", "getStartText", "()Lkotlinx/coroutines/flow/StateFlow;", "titleSecondColumn", "getTitleSecondColumn", "titleThirdColumn", "getTitleThirdColumn", "valueOfQueue", "getValueOfQueue", "backFromFourthToThirdColumnForTitleOfColumn", "", "changeSizeOfCollection", "currentCollection", "currentSize", "clearTitleForSecondAndThirdColumn", "clearTitleForThirdColumn", "initBody", "bodyFromJSON", "initCarsAndAccessories", "data", "initTitleForSecondColumn", "currentTitle", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initTitleForThirdColumn", "lEmitFinalText", "currentList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lSetValueOfQueue", "newValue", "lUpdateFinalText", "newValueOfText", "currentPos", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putDataToServer", "putInfoForClickCancelOrNextOrDismiss", "valueOfKey", "setFourthColumn", "currentObj", "setInitData", "jsonObject", "Lorg/json/JSONObject;", "setNewStartText", "currentText", "setSecondColumn", "setThirdColumn", "showErrorNotification", ThrowableDeserializer.PROP_NAME_MESSAGE, "updateFinalText", "updateValueOfQueue", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class SmiEditorViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final SmiEditorActionWithJSON actionWithJSON;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public List<SmiEditorBodyObj> mutableBodyFromJSON;

    @Nullable
    public SmiList mutableCarsAndAccessories;

    @NotNull
    public final MutableSharedFlow<List<String>> mutableFinalText;

    @NotNull
    public final MutableSharedFlow<List<Object>> mutableFourthColumn;

    @NotNull
    public final MutableStateFlow<List<SmiEditorBodyObj>> mutableObjForNavigation;

    @NotNull
    public final MutableSharedFlow<List<SmiEditorBodyObj>> mutableSecondColumn;

    @NotNull
    public final MutableStateFlow<String> mutableStartText;

    @NotNull
    public final MutableSharedFlow<List<Object>> mutableThirdColumn;

    @NotNull
    public final MutableSharedFlow<String> mutableTitleSecondColumn;

    @NotNull
    public final MutableSharedFlow<String> mutableTitleThirdColumn;

    @NotNull
    public final MutableStateFlow<Integer> mutableValueOfQueue;

    @NotNull
    public final SharedFlow<List<String>> newFinalText;

    @NotNull
    public final SharedFlow<List<Object>> newFourthColumn;

    @NotNull
    public final SharedFlow<List<SmiEditorBodyObj>> newSecondColumn;

    @NotNull
    public final SharedFlow<List<Object>> newThirdColumn;

    @NotNull
    public final StateFlow<String> startText;

    @NotNull
    public final SharedFlow<String> titleSecondColumn;

    @NotNull
    public final SharedFlow<String> titleThirdColumn;

    @NotNull
    public final StateFlow<Integer> valueOfQueue;

    /* compiled from: SmiEditorViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel", m7120f = "SmiEditorViewModel.kt", m7121i = {0, 0, 0}, m7122l = {236, SnappyCompressorOutputStream.TWO_SIZE_BYTE_MARKER}, m7123m = "lUpdateFinalText", m7124n = {"this", "newValueOfText", "currentPos"}, m7125s = {"L$0", "L$1", "I$0"})
    /* renamed from: com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$lUpdateFinalText$1 */
    /* loaded from: classes2.dex */
    public static final class C44961 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C44961(Continuation<? super C44961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SmiEditorViewModel.this.lUpdateFinalText(null, 0, this);
        }
    }

    @Inject
    public SmiEditorViewModel(@NotNull SmiEditorActionWithJSON actionWithJSON, @NotNull LocalNotification localNotification) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        this.actionWithJSON = actionWithJSON;
        this.localNotification = localNotification;
        this.mutableBodyFromJSON = CollectionsKt__CollectionsKt.emptyList();
        MutableSharedFlow<List<String>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableFinalText = mutableSharedFlowMutableSharedFlow$default;
        this.newFinalText = mutableSharedFlowMutableSharedFlow$default;
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.mutableValueOfQueue = MutableStateFlow;
        this.valueOfQueue = MutableStateFlow;
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow("");
        this.mutableStartText = MutableStateFlow2;
        this.startText = MutableStateFlow2;
        MutableSharedFlow<List<SmiEditorBodyObj>> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableSecondColumn = mutableSharedFlowMutableSharedFlow$default2;
        this.newSecondColumn = mutableSharedFlowMutableSharedFlow$default2;
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableTitleSecondColumn = mutableSharedFlowMutableSharedFlow$default3;
        this.titleSecondColumn = mutableSharedFlowMutableSharedFlow$default3;
        MutableSharedFlow<List<Object>> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableThirdColumn = mutableSharedFlowMutableSharedFlow$default4;
        this.newThirdColumn = mutableSharedFlowMutableSharedFlow$default4;
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableTitleThirdColumn = mutableSharedFlowMutableSharedFlow$default5;
        this.titleThirdColumn = mutableSharedFlowMutableSharedFlow$default5;
        this.mutableObjForNavigation = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        MutableSharedFlow<List<Object>> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableFourthColumn = mutableSharedFlowMutableSharedFlow$default6;
        this.newFourthColumn = mutableSharedFlowMutableSharedFlow$default6;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new C44921(null), 2, null);
    }

    @NotNull
    public final SharedFlow<List<String>> getNewFinalText() {
        return this.newFinalText;
    }

    @NotNull
    public final StateFlow<Integer> getValueOfQueue() {
        return this.valueOfQueue;
    }

    @NotNull
    public final StateFlow<String> getStartText() {
        return this.startText;
    }

    @NotNull
    public final SharedFlow<List<SmiEditorBodyObj>> getNewSecondColumn() {
        return this.newSecondColumn;
    }

    @NotNull
    public final SharedFlow<String> getTitleSecondColumn() {
        return this.titleSecondColumn;
    }

    @NotNull
    public final SharedFlow<List<Object>> getNewThirdColumn() {
        return this.newThirdColumn;
    }

    @NotNull
    public final SharedFlow<String> getTitleThirdColumn() {
        return this.titleThirdColumn;
    }

    @NotNull
    public final SharedFlow<List<Object>> getNewFourthColumn() {
        return this.newFourthColumn;
    }

    /* compiled from: SmiEditorViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$1", m7120f = "SmiEditorViewModel.kt", m7121i = {}, m7122l = {70}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$1 */
    /* loaded from: classes3.dex */
    public static final class C44921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C44921(Continuation<? super C44921> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SmiEditorViewModel.this.new C44921(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SmiEditorViewModel smiEditorViewModel = SmiEditorViewModel.this;
                    ArrayList arrayList = new ArrayList();
                    this.label = 1;
                    if (smiEditorViewModel.lEmitFinalText(arrayList, this) == coroutine_suspended) {
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

    public final Object lEmitFinalText(List<String> list, Continuation<? super Unit> continuation) {
        Object objEmit = this.mutableFinalText.emit(list, continuation);
        return objEmit == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    public final void initBody(@NotNull List<SmiEditorBodyObj> bodyFromJSON) {
        Intrinsics.checkNotNullParameter(bodyFromJSON, "bodyFromJSON");
        this.mutableBodyFromJSON = bodyFromJSON;
    }

    public final void initCarsAndAccessories(@NotNull SmiList data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.mutableCarsAndAccessories = data;
    }

    public final void setInitData(@Nullable JSONObject jsonObject) {
        if (jsonObject != null) {
            lSetValueOfQueue(jsonObject.optInt("a"));
            MutableStateFlow<String> mutableStateFlow = this.mutableStartText;
            String strOptString = jsonObject.optString("d");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            mutableStateFlow.setValue(strOptString);
        }
    }

    public final void setNewStartText(@NotNull String currentText) {
        Intrinsics.checkNotNullParameter(currentText, "currentText");
        this.mutableStartText.setValue(currentText);
    }

    public final void lSetValueOfQueue(int newValue) {
        this.mutableValueOfQueue.setValue(Integer.valueOf(newValue));
    }

    /* compiled from: SmiEditorViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$setSecondColumn$1", m7120f = "SmiEditorViewModel.kt", m7121i = {}, m7122l = {110, 112, 116, 118}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$setSecondColumn$1 */
    /* loaded from: classes3.dex */
    public static final class C44981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $currentPos;
        public int label;
        public final /* synthetic */ SmiEditorViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44981(int i, SmiEditorViewModel smiEditorViewModel, Continuation<? super C44981> continuation) {
            super(2, continuation);
            this.$currentPos = i;
            this.this$0 = smiEditorViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C44981(this.$currentPos, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x006d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a7 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            SmiEditorViewModel smiEditorViewModel;
            String title;
            SmiEditorViewModel smiEditorViewModel2;
            String title2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.$currentPos == 2) {
                        List<SmiEditorBodyObj> body = ((SmiEditorBodyObj) this.this$0.mutableBodyFromJSON.get(1)).getBody();
                        if (body != null) {
                            MutableSharedFlow mutableSharedFlow = this.this$0.mutableSecondColumn;
                            this.label = 1;
                            if (mutableSharedFlow.emit(body, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        smiEditorViewModel = this.this$0;
                        title = ((SmiEditorBodyObj) smiEditorViewModel.mutableBodyFromJSON.get(1)).getTitle();
                        this.label = 2;
                        if (smiEditorViewModel.initTitleForSecondColumn(title, this) == coroutine_suspended) {
                        }
                    } else {
                        List<SmiEditorBodyObj> body2 = ((SmiEditorBodyObj) this.this$0.mutableBodyFromJSON.get(0)).getBody();
                        if (body2 != null) {
                            MutableSharedFlow mutableSharedFlow2 = this.this$0.mutableSecondColumn;
                            this.label = 3;
                            if (mutableSharedFlow2.emit(body2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        smiEditorViewModel2 = this.this$0;
                        title2 = ((SmiEditorBodyObj) smiEditorViewModel2.mutableBodyFromJSON.get(0)).getTitle();
                        this.label = 4;
                        if (smiEditorViewModel2.initTitleForSecondColumn(title2, this) == coroutine_suspended) {
                        }
                    }
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            smiEditorViewModel2 = this.this$0;
                            title2 = ((SmiEditorBodyObj) smiEditorViewModel2.mutableBodyFromJSON.get(0)).getTitle();
                            this.label = 4;
                            if (smiEditorViewModel2.initTitleForSecondColumn(title2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    smiEditorViewModel = this.this$0;
                    title = ((SmiEditorBodyObj) smiEditorViewModel.mutableBodyFromJSON.get(1)).getTitle();
                    this.label = 2;
                    if (smiEditorViewModel.initTitleForSecondColumn(title, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void setSecondColumn(int currentPos) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C44981(currentPos, this, null), 2, null);
    }

    public final Object initTitleForSecondColumn(String str, Continuation<? super Unit> continuation) {
        Object objEmit = this.mutableTitleSecondColumn.emit(str, continuation);
        return objEmit == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    /* compiled from: SmiEditorViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$setThirdColumn$1", m7120f = "SmiEditorViewModel.kt", m7121i = {0}, m7122l = {Cea708Decoder.COMMAND_DLW, 147, 156}, m7123m = "invokeSuspend", m7124n = {"it"}, m7125s = {"L$1"})
    /* renamed from: com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$setThirdColumn$1 */
    /* loaded from: classes3.dex */
    public static final class C44991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Object $currentObj;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ SmiEditorViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44991(Object obj, SmiEditorViewModel smiEditorViewModel, Continuation<? super C44991> continuation) {
            super(2, continuation);
            this.$currentObj = obj;
            this.this$0 = smiEditorViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C44991(this.$currentObj, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            SmiEditorViewModel smiEditorViewModel;
            List<SmiEditorBodyObj> body;
            SmiEditorViewModel smiEditorViewModel2;
            SmiList smiList;
            ArrayList<SmiInfo> accessoriesList;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.$currentObj;
                if (obj2 instanceof SmiEditorBodyObj) {
                    Integer type = ((SmiEditorBodyObj) obj2).getType();
                    if (type != null) {
                        Object obj3 = this.$currentObj;
                        smiEditorViewModel = this.this$0;
                        int iIntValue = type.intValue();
                        if (iIntValue == 0) {
                            body = ((SmiEditorBodyObj) obj3).getBody();
                            if (body != null) {
                                List<SmiEditorBodyObj> body2 = body.get(0).getBody();
                                if (body2 != null) {
                                    MutableSharedFlow mutableSharedFlow = smiEditorViewModel.mutableThirdColumn;
                                    this.L$0 = smiEditorViewModel;
                                    this.L$1 = body;
                                    this.label = 1;
                                    if (mutableSharedFlow.emit(body2, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    smiEditorViewModel2 = smiEditorViewModel;
                                    smiEditorViewModel = smiEditorViewModel2;
                                }
                                smiEditorViewModel.mutableObjForNavigation.setValue(body);
                            }
                        } else if (iIntValue == 6 && (smiList = smiEditorViewModel.mutableCarsAndAccessories) != null && (accessoriesList = smiList.getAccessoriesList()) != null) {
                            MutableSharedFlow mutableSharedFlow2 = smiEditorViewModel.mutableThirdColumn;
                            this.label = 2;
                            if (mutableSharedFlow2.emit(accessoriesList, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            if (i == 1) {
                body = (List) this.L$1;
                smiEditorViewModel2 = (SmiEditorViewModel) this.L$0;
                ResultKt.throwOnFailure(obj);
                smiEditorViewModel = smiEditorViewModel2;
                smiEditorViewModel.mutableObjForNavigation.setValue(body);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            List<SmiEditorBodyObj> body3 = ((SmiEditorBodyObj) this.$currentObj).getBody();
            if (body3 != null) {
                SmiEditorViewModel smiEditorViewModel3 = this.this$0;
                String title = body3.get(0).getTitle();
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (smiEditorViewModel3.initTitleForThirdColumn(title, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void setThirdColumn(@NotNull Object currentObj) {
        Intrinsics.checkNotNullParameter(currentObj, "currentObj");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C44991(currentObj, this, null), 2, null);
    }

    public final Object initTitleForThirdColumn(String str, Continuation<? super Unit> continuation) {
        Object objEmit = this.mutableTitleThirdColumn.emit(str, continuation);
        return objEmit == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    /* compiled from: SmiEditorViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$setFourthColumn$1", m7120f = "SmiEditorViewModel.kt", m7121i = {0}, m7122l = {179, 181, MatroskaExtractor.ID_PIXEL_HEIGHT, TsExtractor.TS_PACKET_SIZE, 192, 194, 198, 200, 204, 206, 210, 212}, m7123m = "invokeSuspend", m7124n = {"oldObjForNavigation"}, m7125s = {"L$1"})
    /* renamed from: com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$setFourthColumn$1 */
    /* loaded from: classes3.dex */
    public static final class C44971 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ SmiEditorBodyObj $currentObj;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ SmiEditorViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44971(SmiEditorBodyObj smiEditorBodyObj, SmiEditorViewModel smiEditorViewModel, Continuation<? super C44971> continuation) {
            super(2, continuation);
            this.$currentObj = smiEditorBodyObj;
            this.this$0 = smiEditorViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C44971(this.$currentObj, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0193 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:112:0x01db A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00c3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00f9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x012e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0161 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            SmiEditorViewModel smiEditorViewModel;
            SmiEditorBodyObj smiEditorBodyObj;
            List list;
            SmiEditorViewModel smiEditorViewModel2;
            List list2;
            ArrayList<SmiInfo> lowClass;
            SmiEditorViewModel smiEditorViewModel3;
            SmiEditorBodyObj smiEditorBodyObj2;
            ArrayList<SmiInfo> carMiddleClass;
            SmiEditorViewModel smiEditorViewModel4;
            SmiEditorBodyObj smiEditorBodyObj3;
            ArrayList<SmiInfo> carHighClass;
            SmiEditorViewModel smiEditorViewModel5;
            SmiEditorBodyObj smiEditorBodyObj4;
            ArrayList<SmiInfo> carUniqueClass;
            SmiEditorViewModel smiEditorViewModel6;
            SmiEditorBodyObj smiEditorBodyObj5;
            ArrayList<SmiInfo> carMotoClass;
            SmiEditorViewModel smiEditorViewModel7;
            SmiEditorBodyObj smiEditorBodyObj6;
            String title;
            String title2;
            String title3;
            String title4;
            String title5;
            String title6;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    Integer type = this.$currentObj.getType();
                    if (type != null) {
                        smiEditorViewModel = this.this$0;
                        smiEditorBodyObj = this.$currentObj;
                        int iIntValue = type.intValue();
                        if (iIntValue == 0) {
                            list = (List) smiEditorViewModel.mutableObjForNavigation.getValue();
                            if (list.size() > 1) {
                                List<SmiEditorBodyObj> body = ((SmiEditorBodyObj) list.get(1)).getBody();
                                if (body != null) {
                                    MutableSharedFlow mutableSharedFlow = smiEditorViewModel.mutableFourthColumn;
                                    this.L$0 = smiEditorViewModel;
                                    this.L$1 = list;
                                    this.label = 1;
                                    if (mutableSharedFlow.emit(body, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    smiEditorViewModel2 = smiEditorViewModel;
                                    list2 = list;
                                    list = list2;
                                    smiEditorViewModel = smiEditorViewModel2;
                                }
                                title = ((SmiEditorBodyObj) list.get(1)).getTitle();
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 2;
                                if (smiEditorViewModel.initTitleForThirdColumn(title, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else if (iIntValue == 1) {
                            SmiList smiList = smiEditorViewModel.mutableCarsAndAccessories;
                            if (smiList != null && (lowClass = smiList.getLowClass()) != null) {
                                MutableSharedFlow mutableSharedFlow2 = smiEditorViewModel.mutableFourthColumn;
                                this.L$0 = smiEditorViewModel;
                                this.L$1 = smiEditorBodyObj;
                                this.label = 3;
                                if (mutableSharedFlow2.emit(lowClass, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                smiEditorViewModel3 = smiEditorViewModel;
                                smiEditorBodyObj2 = smiEditorBodyObj;
                                smiEditorBodyObj = smiEditorBodyObj2;
                                smiEditorViewModel = smiEditorViewModel3;
                            }
                            title2 = smiEditorBodyObj.getTitle();
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 4;
                            if (smiEditorViewModel.initTitleForThirdColumn(title2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (iIntValue == 2) {
                            SmiList smiList2 = smiEditorViewModel.mutableCarsAndAccessories;
                            if (smiList2 != null && (carMiddleClass = smiList2.getCarMiddleClass()) != null) {
                                MutableSharedFlow mutableSharedFlow3 = smiEditorViewModel.mutableFourthColumn;
                                this.L$0 = smiEditorViewModel;
                                this.L$1 = smiEditorBodyObj;
                                this.label = 5;
                                if (mutableSharedFlow3.emit(carMiddleClass, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                smiEditorViewModel4 = smiEditorViewModel;
                                smiEditorBodyObj3 = smiEditorBodyObj;
                                smiEditorBodyObj = smiEditorBodyObj3;
                                smiEditorViewModel = smiEditorViewModel4;
                            }
                            title3 = smiEditorBodyObj.getTitle();
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 6;
                            if (smiEditorViewModel.initTitleForThirdColumn(title3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (iIntValue == 3) {
                            SmiList smiList3 = smiEditorViewModel.mutableCarsAndAccessories;
                            if (smiList3 != null && (carHighClass = smiList3.getCarHighClass()) != null) {
                                MutableSharedFlow mutableSharedFlow4 = smiEditorViewModel.mutableFourthColumn;
                                this.L$0 = smiEditorViewModel;
                                this.L$1 = smiEditorBodyObj;
                                this.label = 7;
                                if (mutableSharedFlow4.emit(carHighClass, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                smiEditorViewModel5 = smiEditorViewModel;
                                smiEditorBodyObj4 = smiEditorBodyObj;
                                smiEditorBodyObj = smiEditorBodyObj4;
                                smiEditorViewModel = smiEditorViewModel5;
                            }
                            title4 = smiEditorBodyObj.getTitle();
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 8;
                            if (smiEditorViewModel.initTitleForThirdColumn(title4, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (iIntValue == 4) {
                            SmiList smiList4 = smiEditorViewModel.mutableCarsAndAccessories;
                            if (smiList4 != null && (carUniqueClass = smiList4.getCarUniqueClass()) != null) {
                                MutableSharedFlow mutableSharedFlow5 = smiEditorViewModel.mutableFourthColumn;
                                this.L$0 = smiEditorViewModel;
                                this.L$1 = smiEditorBodyObj;
                                this.label = 9;
                                if (mutableSharedFlow5.emit(carUniqueClass, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                smiEditorViewModel6 = smiEditorViewModel;
                                smiEditorBodyObj5 = smiEditorBodyObj;
                                smiEditorBodyObj = smiEditorBodyObj5;
                                smiEditorViewModel = smiEditorViewModel6;
                            }
                            title5 = smiEditorBodyObj.getTitle();
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 10;
                            if (smiEditorViewModel.initTitleForThirdColumn(title5, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (iIntValue == 5) {
                            SmiList smiList5 = smiEditorViewModel.mutableCarsAndAccessories;
                            if (smiList5 != null && (carMotoClass = smiList5.getCarMotoClass()) != null) {
                                MutableSharedFlow mutableSharedFlow6 = smiEditorViewModel.mutableFourthColumn;
                                this.L$0 = smiEditorViewModel;
                                this.L$1 = smiEditorBodyObj;
                                this.label = 11;
                                if (mutableSharedFlow6.emit(carMotoClass, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                smiEditorViewModel7 = smiEditorViewModel;
                                smiEditorBodyObj6 = smiEditorBodyObj;
                                smiEditorBodyObj = smiEditorBodyObj6;
                                smiEditorViewModel = smiEditorViewModel7;
                            }
                            title6 = smiEditorBodyObj.getTitle();
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 12;
                            if (smiEditorViewModel.initTitleForThirdColumn(title6, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 1:
                    list2 = (List) this.L$1;
                    smiEditorViewModel2 = (SmiEditorViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    list = list2;
                    smiEditorViewModel = smiEditorViewModel2;
                    title = ((SmiEditorBodyObj) list.get(1)).getTitle();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 2;
                    if (smiEditorViewModel.initTitleForThirdColumn(title, this) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                case 2:
                case 4:
                case 6:
                case 8:
                case 10:
                case 12:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 3:
                    smiEditorBodyObj2 = (SmiEditorBodyObj) this.L$1;
                    smiEditorViewModel3 = (SmiEditorViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    smiEditorBodyObj = smiEditorBodyObj2;
                    smiEditorViewModel = smiEditorViewModel3;
                    title2 = smiEditorBodyObj.getTitle();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                    if (smiEditorViewModel.initTitleForThirdColumn(title2, this) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                case 5:
                    smiEditorBodyObj3 = (SmiEditorBodyObj) this.L$1;
                    smiEditorViewModel4 = (SmiEditorViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    smiEditorBodyObj = smiEditorBodyObj3;
                    smiEditorViewModel = smiEditorViewModel4;
                    title3 = smiEditorBodyObj.getTitle();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 6;
                    if (smiEditorViewModel.initTitleForThirdColumn(title3, this) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                case 7:
                    smiEditorBodyObj4 = (SmiEditorBodyObj) this.L$1;
                    smiEditorViewModel5 = (SmiEditorViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    smiEditorBodyObj = smiEditorBodyObj4;
                    smiEditorViewModel = smiEditorViewModel5;
                    title4 = smiEditorBodyObj.getTitle();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 8;
                    if (smiEditorViewModel.initTitleForThirdColumn(title4, this) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                case 9:
                    smiEditorBodyObj5 = (SmiEditorBodyObj) this.L$1;
                    smiEditorViewModel6 = (SmiEditorViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    smiEditorBodyObj = smiEditorBodyObj5;
                    smiEditorViewModel = smiEditorViewModel6;
                    title5 = smiEditorBodyObj.getTitle();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 10;
                    if (smiEditorViewModel.initTitleForThirdColumn(title5, this) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                case 11:
                    smiEditorBodyObj6 = (SmiEditorBodyObj) this.L$1;
                    smiEditorViewModel7 = (SmiEditorViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    smiEditorBodyObj = smiEditorBodyObj6;
                    smiEditorViewModel = smiEditorViewModel7;
                    title6 = smiEditorBodyObj.getTitle();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 12;
                    if (smiEditorViewModel.initTitleForThirdColumn(title6, this) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void setFourthColumn(@NotNull SmiEditorBodyObj currentObj) {
        Intrinsics.checkNotNullParameter(currentObj, "currentObj");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C44971(currentObj, this, null), 2, null);
    }

    /* compiled from: SmiEditorViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$updateFinalText$1", m7120f = "SmiEditorViewModel.kt", m7121i = {}, m7122l = {225}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$updateFinalText$1 */
    /* loaded from: classes3.dex */
    public static final class C45001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $currentPos;
        public final /* synthetic */ String $newValueOfText;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45001(String str, int i, Continuation<? super C45001> continuation) {
            super(2, continuation);
            this.$newValueOfText = str;
            this.$currentPos = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SmiEditorViewModel.this.new C45001(this.$newValueOfText, this.$currentPos, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SmiEditorViewModel smiEditorViewModel = SmiEditorViewModel.this;
                    String str = this.$newValueOfText;
                    int i2 = this.$currentPos;
                    this.label = 1;
                    if (smiEditorViewModel.lUpdateFinalText(str, i2, this) == coroutine_suspended) {
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

    public final void updateFinalText(@Nullable String newValueOfText, int currentPos) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C45001(newValueOfText, currentPos, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object lUpdateFinalText(String str, int i, Continuation<? super Unit> continuation) throws Throwable {
        C44961 c44961;
        SmiEditorViewModel smiEditorViewModel;
        if (continuation instanceof C44961) {
            c44961 = (C44961) continuation;
            int i2 = c44961.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c44961.label = i2 - Integer.MIN_VALUE;
            } else {
                c44961 = new C44961(continuation);
            }
        }
        Object objFirst = c44961.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c44961.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objFirst);
            MutableSharedFlow<List<String>> mutableSharedFlow = this.mutableFinalText;
            c44961.L$0 = this;
            c44961.L$1 = str;
            c44961.I$0 = i;
            c44961.label = 1;
            objFirst = FlowKt.first(mutableSharedFlow, c44961);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
            smiEditorViewModel = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFirst);
                return Unit.INSTANCE;
            }
            i = c44961.I$0;
            str = (String) c44961.L$1;
            smiEditorViewModel = (SmiEditorViewModel) c44961.L$0;
            ResultKt.throwOnFailure(objFirst);
        }
        List<String> list = (List) objFirst;
        smiEditorViewModel.changeSizeOfCollection(list, i);
        if (str != null) {
            list.add(str);
        }
        c44961.L$0 = null;
        c44961.L$1 = null;
        c44961.label = 2;
        if (smiEditorViewModel.lEmitFinalText(list, c44961) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    public final void changeSizeOfCollection(List<String> currentCollection, int currentSize) {
        while (currentCollection.size() > currentSize) {
            CollectionsKt__MutableCollectionsKt.removeLast(currentCollection);
        }
    }

    /* compiled from: SmiEditorViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$backFromFourthToThirdColumnForTitleOfColumn$1", m7120f = "SmiEditorViewModel.kt", m7121i = {}, m7122l = {BZip2Constants.MAX_ALPHA_SIZE, 260}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$backFromFourthToThirdColumnForTitleOfColumn$1 */
    /* loaded from: classes3.dex */
    public static final class C44931 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C44931(Continuation<? super C44931> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SmiEditorViewModel.this.new C44931(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List list = (List) SmiEditorViewModel.this.mutableObjForNavigation.getValue();
                if (list.size() > 1) {
                    SmiEditorViewModel smiEditorViewModel = SmiEditorViewModel.this;
                    String title = ((SmiEditorBodyObj) list.get(0)).getTitle();
                    this.label = 1;
                    if (smiEditorViewModel.initTitleForThirdColumn(title, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            SmiEditorViewModel smiEditorViewModel2 = SmiEditorViewModel.this;
            this.label = 2;
            if (smiEditorViewModel2.lUpdateFinalText(null, 2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public final void backFromFourthToThirdColumnForTitleOfColumn() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C44931(null), 2, null);
    }

    /* compiled from: SmiEditorViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$clearTitleForSecondAndThirdColumn$1", m7120f = "SmiEditorViewModel.kt", m7121i = {}, m7122l = {AudioAttributesCompat.FLAG_ALL_PUBLIC, DefaultImageHeaderParser.ORIENTATION_TAG_TYPE}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$clearTitleForSecondAndThirdColumn$1 */
    /* loaded from: classes3.dex */
    public static final class C44941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C44941(Continuation<? super C44941> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SmiEditorViewModel.this.new C44941(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SmiEditorViewModel smiEditorViewModel = SmiEditorViewModel.this;
                this.label = 1;
                if (smiEditorViewModel.initTitleForSecondColumn("", this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            SmiEditorViewModel smiEditorViewModel2 = SmiEditorViewModel.this;
            this.label = 2;
            if (smiEditorViewModel2.initTitleForThirdColumn("", this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public final void clearTitleForSecondAndThirdColumn() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C44941(null), 2, null);
    }

    /* compiled from: SmiEditorViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$clearTitleForThirdColumn$1", m7120f = "SmiEditorViewModel.kt", m7121i = {}, m7122l = {284}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$clearTitleForThirdColumn$1 */
    /* loaded from: classes3.dex */
    public static final class C44951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C44951(Continuation<? super C44951> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SmiEditorViewModel.this.new C44951(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SmiEditorViewModel smiEditorViewModel = SmiEditorViewModel.this;
                    this.label = 1;
                    if (smiEditorViewModel.initTitleForThirdColumn("", this) == coroutine_suspended) {
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

    public final void clearTitleForThirdColumn() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C44951(null), 2, null);
    }

    /* compiled from: SmiEditorViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$updateValueOfQueue$1", m7120f = "SmiEditorViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel$updateValueOfQueue$1 */
    /* loaded from: classes3.dex */
    public static final class C45011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $jsonObject;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45011(JSONObject jSONObject, Continuation<? super C45011> continuation) {
            super(2, continuation);
            this.$jsonObject = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SmiEditorViewModel.this.new C45011(this.$jsonObject, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    SmiEditorViewModel.this.lSetValueOfQueue(this.$jsonObject.optInt("a"));
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void updateValueOfQueue(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C45011(jsonObject, null), 2, null);
    }

    public final void putInfoForClickCancelOrNextOrDismiss(int valueOfKey) throws JSONException {
        this.actionWithJSON.putInfoForClickCancelOrNextOrDismiss(valueOfKey);
    }

    public final void putDataToServer(@NotNull String data) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        this.actionWithJSON.putDataToServer(data);
    }

    public final void showErrorNotification(@NotNull String message) throws JSONException {
        Intrinsics.checkNotNullParameter(message, "message");
        this.localNotification.showErrorNotification(message);
    }
}
