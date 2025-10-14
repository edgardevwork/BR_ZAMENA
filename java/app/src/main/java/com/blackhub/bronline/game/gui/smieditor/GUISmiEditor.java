package com.blackhub.bronline.game.gui.smieditor;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.p007ts.TsExtractor;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.SmiDialogBinding;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.core.model.ConfigurationJsonModel;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.smieditor.adapters.SmiEditorAdapter;
import com.blackhub.bronline.game.gui.smieditor.adapters.SmiEditorCarsAndAccessoriesAdapter;
import com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj;
import com.blackhub.bronline.game.gui.smieditor.data.SmiInfo;
import com.blackhub.bronline.game.gui.smieditor.data.SmiList;
import com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.bless.client.R;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GUISmiEditor.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGUISmiEditor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUISmiEditor.kt\ncom/blackhub/bronline/game/gui/smieditor/GUISmiEditor\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,626:1\n172#2,9:627\n106#2,15:636\n*S KotlinDebug\n*F\n+ 1 GUISmiEditor.kt\ncom/blackhub/bronline/game/gui/smieditor/GUISmiEditor\n*L\n58#1:627,9\n63#1:636,15\n*E\n"})

public final class GUISmiEditor extends BaseISAMPGUIFragment<SmiDialogBinding> {
    public static final int $stable = 8;

    @Nullable
    public SmiEditorCarsAndAccessoriesAdapter carOrAccessoriesAdapter;
    public boolean changeTextForAdIfCarOrAccessories;

    @Nullable
    public SmiEditorCarsAndAccessoriesAdapter.OnUserClickCarsAndAccessories clickListenerCarOrAccessories;

    @Nullable
    public SmiEditorAdapter.OnUserClickListenerSmiEditor clickListenerFirst;

    @Nullable
    public SmiEditorAdapter emptyAdapter;

    @Nullable
    public SmiEditorAdapter firstAdapter;

    @NotNull
    public final List<SmiEditorBodyObj> firstColumn;

    @Nullable
    public SmiEditorAdapter fourthAdapter;

    @NotNull
    public String getStartTextAd;
    public boolean ifUnlockFromSwitch;
    public boolean isShowStartAd;

    @Inject
    public MainViewModelFactory<JNIActivityViewModel> mainActivityFactory;

    /* renamed from: mainActivityViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainActivityViewModel;

    @NotNull
    public String myCustomFinalTextForAd;

    @NotNull
    public String myCustomTextFromEditTextForAd;

    @NotNull
    public String myCustomTextFromSwitchForAd;
    public int oldColumn;

    @Nullable
    public SmiEditorAdapter secondAdapter;

    @Inject
    public MainViewModelFactory<SmiEditorViewModel> smiEditorFactory;

    /* renamed from: smiEditorViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy smiEditorViewModel;
    public int statusForCustomPrice;

    @Nullable
    public SmiEditorAdapter thirdAdapter;

    @NotNull
    public String valueOfPrice;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 24;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @NotNull
    public final MainViewModelFactory<JNIActivityViewModel> getMainActivityFactory() {
        MainViewModelFactory<JNIActivityViewModel> mainViewModelFactory = this.mainActivityFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainActivityFactory");
        return null;
    }

    public final void setMainActivityFactory(@NotNull MainViewModelFactory<JNIActivityViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.mainActivityFactory = mainViewModelFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JNIActivityViewModel getMainActivityViewModel() {
        return (JNIActivityViewModel) this.mainActivityViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<SmiEditorViewModel> getSmiEditorFactory() {
        MainViewModelFactory<SmiEditorViewModel> mainViewModelFactory = this.smiEditorFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("smiEditorFactory");
        return null;
    }

    public final void setSmiEditorFactory(@NotNull MainViewModelFactory<SmiEditorViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.smiEditorFactory = mainViewModelFactory;
    }

    public final SmiEditorViewModel getSmiEditorViewModel() {
        return (SmiEditorViewModel) this.smiEditorViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
        if (json != null) {
            int iOptInt = json.optInt("t");
            if (iOptInt != 0 && iOptInt != 1) {
                if (iOptInt != 2) {
                    return;
                }
                getSmiEditorViewModel().updateValueOfQueue(json);
                return;
            }
            String strOptString = json.optString("d");
            Intrinsics.checkNotNull(strOptString);
            if (strOptString.length() > 0) {
                clearInterfaceAfterGettingNewStartText();
                getSmiEditorViewModel().setNewStartText(strOptString);
            } else {
                closeFragment();
            }
        }
    }

    public final void clearInterfaceAfterGettingNewStartText() {
        setInitProperty();
        clearEditTexts();
        changeParamForFirstColumn(-1);
        clearSecondAndThirdAndFourthColumns();
        SmiEditorAdapter smiEditorAdapter = this.firstAdapter;
        if (smiEditorAdapter != null) {
            smiEditorAdapter.refreshCheck();
        }
        setVisibleForBlockWithCustomPrice(4);
        unlockButtonApply();
    }

    public final void setInitProperty() {
        this.getStartTextAd = "";
        this.myCustomTextFromSwitchForAd = "";
        this.myCustomFinalTextForAd = "";
        this.myCustomTextFromEditTextForAd = "";
        this.oldColumn = 0;
        this.isShowStartAd = true;
        this.changeTextForAdIfCarOrAccessories = false;
        this.valueOfPrice = "";
        this.statusForCustomPrice = -1;
        this.ifUnlockFromSwitch = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void clearEditTexts() {
        ((SmiDialogBinding) getBinding()).personalSmiWriter.setText("");
        ((SmiDialogBinding) getBinding()).valuePrice.setText("");
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        try {
            getSmiEditorViewModel().setInitData(getJsonObj());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        setObservers();
        initInterface();
        initListeners();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public SmiDialogBinding getViewBinding() {
        SmiDialogBinding smiDialogBindingInflate = SmiDialogBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(smiDialogBindingInflate, "inflate(...)");
        return smiDialogBindingInflate;
    }

    /* compiled from: GUISmiEditor.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$setObservers$1", m7120f = "GUISmiEditor.kt", m7121i = {}, m7122l = {167}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$setObservers$1 */
    /* loaded from: classes3.dex */
    public static final class C44821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C44821(Continuation<? super C44821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUISmiEditor.this.new C44821(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<ConfigurationJsonModel> configurationJsons = GUISmiEditor.this.getMainActivityViewModel().getConfigurationJsons();
                Lifecycle lifecycle = GUISmiEditor.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(configurationJsons, lifecycle, Lifecycle.State.STARTED);
                final GUISmiEditor gUISmiEditor = GUISmiEditor.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor.setObservers.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ConfigurationJsonModel) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull ConfigurationJsonModel configurationJsonModel, @NotNull Continuation<? super Unit> continuation) throws JSONException {
                        SmiList smiListFromJson = configurationJsonModel.getSmiListFromJson();
                        if (!smiListFromJson.getLowClass().isEmpty()) {
                            gUISmiEditor.getSmiEditorViewModel().initCarsAndAccessories(smiListFromJson);
                        } else {
                            SmiEditorViewModel smiEditorViewModel = gUISmiEditor.getSmiEditorViewModel();
                            String string = gUISmiEditor.getString(R.string.common_error_with_json_parsing);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            smiEditorViewModel.showErrorNotification(string);
                            gUISmiEditor.closeFragment();
                        }
                        List<SmiEditorBodyObj> smiEditorBodyFromJson = configurationJsonModel.getSmiEditorBodyFromJson();
                        if (!smiEditorBodyFromJson.isEmpty()) {
                            gUISmiEditor.getSmiEditorViewModel().initBody(smiEditorBodyFromJson);
                        } else {
                            SmiEditorViewModel smiEditorViewModel2 = gUISmiEditor.getSmiEditorViewModel();
                            String string2 = gUISmiEditor.getString(R.string.common_error_with_json_parsing);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            smiEditorViewModel2.showErrorNotification(string2);
                            gUISmiEditor.closeFragment();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
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

    private final void setObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C44821(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C44832(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C44843(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C44854(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C44865(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C44876(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C44887(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C44898(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C44909(null), 3, null);
    }

    /* compiled from: GUISmiEditor.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$setObservers$2", m7120f = "GUISmiEditor.kt", m7121i = {}, m7122l = {TsExtractor.TS_PACKET_SIZE}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$setObservers$2 */
    /* loaded from: classes3.dex */
    public static final class C44832 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C44832(Continuation<? super C44832> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUISmiEditor.this.new C44832(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44832) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> valueOfQueue = GUISmiEditor.this.getSmiEditorViewModel().getValueOfQueue();
                Lifecycle lifecycle = GUISmiEditor.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(valueOfQueue, lifecycle, Lifecycle.State.STARTED);
                final GUISmiEditor gUISmiEditor = GUISmiEditor.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor.setObservers.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                        gUISmiEditor.setValueQueueInView(i2);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: GUISmiEditor.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$setObservers$3", m7120f = "GUISmiEditor.kt", m7121i = {}, m7122l = {195}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$setObservers$3 */
    /* loaded from: classes3.dex */
    public static final class C44843 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C44843(Continuation<? super C44843> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUISmiEditor.this.new C44843(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44843) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<String> startText = GUISmiEditor.this.getSmiEditorViewModel().getStartText();
                Lifecycle lifecycle = GUISmiEditor.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(startText, lifecycle, Lifecycle.State.STARTED);
                final GUISmiEditor gUISmiEditor = GUISmiEditor.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor.setObservers.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((String) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
                        gUISmiEditor.getStartTextAd = str;
                        GUISmiEditor gUISmiEditor2 = gUISmiEditor;
                        gUISmiEditor2.changeViewAds(gUISmiEditor2.isShowStartAd);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: GUISmiEditor.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$setObservers$4", m7120f = "GUISmiEditor.kt", m7121i = {}, m7122l = {203}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$setObservers$4 */
    /* loaded from: classes3.dex */
    public static final class C44854 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C44854(Continuation<? super C44854> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUISmiEditor.this.new C44854(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44854) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<List<String>> newFinalText = GUISmiEditor.this.getSmiEditorViewModel().getNewFinalText();
                Lifecycle lifecycle = GUISmiEditor.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(newFinalText, lifecycle, Lifecycle.State.STARTED);
                final GUISmiEditor gUISmiEditor = GUISmiEditor.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor.setObservers.4.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<String>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<String> list, @NotNull Continuation<? super Unit> continuation) {
                        gUISmiEditor.transformCollectionWithTextToStringForAd(list);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: GUISmiEditor.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$setObservers$5", m7120f = "GUISmiEditor.kt", m7121i = {}, m7122l = {210}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$setObservers$5 */
    /* loaded from: classes3.dex */
    public static final class C44865 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C44865(Continuation<? super C44865> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUISmiEditor.this.new C44865(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44865) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<List<SmiEditorBodyObj>> newSecondColumn = GUISmiEditor.this.getSmiEditorViewModel().getNewSecondColumn();
                Lifecycle lifecycle = GUISmiEditor.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(newSecondColumn, lifecycle, Lifecycle.State.STARTED);
                final GUISmiEditor gUISmiEditor = GUISmiEditor.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor.setObservers.5.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<SmiEditorBodyObj>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<SmiEditorBodyObj> list, @NotNull Continuation<? super Unit> continuation) {
                        gUISmiEditor.initSecondColumn(list);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: GUISmiEditor.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$setObservers$6", m7120f = "GUISmiEditor.kt", m7121i = {}, m7122l = {217}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$setObservers$6 */
    /* loaded from: classes3.dex */
    public static final class C44876 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C44876(Continuation<? super C44876> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUISmiEditor.this.new C44876(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44876) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<List<Object>> newThirdColumn = GUISmiEditor.this.getSmiEditorViewModel().getNewThirdColumn();
                Lifecycle lifecycle = GUISmiEditor.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(newThirdColumn, lifecycle, Lifecycle.State.STARTED);
                final GUISmiEditor gUISmiEditor = GUISmiEditor.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor.setObservers.6.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<? extends Object>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<? extends Object> list, @NotNull Continuation<? super Unit> continuation) {
                        gUISmiEditor.initThirdColumn(list);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: GUISmiEditor.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$setObservers$7", m7120f = "GUISmiEditor.kt", m7121i = {}, m7122l = {224}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$setObservers$7 */
    /* loaded from: classes3.dex */
    public static final class C44887 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C44887(Continuation<? super C44887> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUISmiEditor.this.new C44887(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44887) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<List<Object>> newFourthColumn = GUISmiEditor.this.getSmiEditorViewModel().getNewFourthColumn();
                Lifecycle lifecycle = GUISmiEditor.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(newFourthColumn, lifecycle, Lifecycle.State.STARTED);
                final GUISmiEditor gUISmiEditor = GUISmiEditor.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor.setObservers.7.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<? extends Object>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<? extends Object> list, @NotNull Continuation<? super Unit> continuation) {
                        gUISmiEditor.initFourthColumn(list);
                        gUISmiEditor.setVisibleButtonBackToThirdColumn(0);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: GUISmiEditor.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$setObservers$8", m7120f = "GUISmiEditor.kt", m7121i = {}, m7122l = {232}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$setObservers$8 */
    /* loaded from: classes3.dex */
    public static final class C44898 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C44898(Continuation<? super C44898> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUISmiEditor.this.new C44898(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44898) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<String> titleSecondColumn = GUISmiEditor.this.getSmiEditorViewModel().getTitleSecondColumn();
                Lifecycle lifecycle = GUISmiEditor.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(titleSecondColumn, lifecycle, Lifecycle.State.STARTED);
                final GUISmiEditor gUISmiEditor = GUISmiEditor.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor.setObservers.8.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((String) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
                        gUISmiEditor.setTitleForSecondColumn(str);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: GUISmiEditor.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$setObservers$9", m7120f = "GUISmiEditor.kt", m7121i = {}, m7122l = {239}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$setObservers$9 */
    /* loaded from: classes3.dex */
    public static final class C44909 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C44909(Continuation<? super C44909> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUISmiEditor.this.new C44909(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44909) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<String> titleThirdColumn = GUISmiEditor.this.getSmiEditorViewModel().getTitleThirdColumn();
                Lifecycle lifecycle = GUISmiEditor.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(titleThirdColumn, lifecycle, Lifecycle.State.STARTED);
                final GUISmiEditor gUISmiEditor = GUISmiEditor.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor.setObservers.9.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((String) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
                        gUISmiEditor.setTitleForThirdColumn(str);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void setValueQueueInView(int valueOfQueue) {
        ((SmiDialogBinding) getBinding()).valueQueue.setText(requireActivity().getString(R.string.common_number_value, Integer.valueOf(valueOfQueue)));
    }

    public final void changeViewAds(boolean ifStartText) {
        CharSequence text;
        String str;
        if (ifStartText) {
            text = requireActivity().getText(R.string.smi_dialog_header_start_ad);
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            str = this.getStartTextAd;
        } else {
            text = requireActivity().getText(R.string.smi_dialog_header_edit_ad);
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            str = this.myCustomTextFromEditTextForAd;
            if (str.length() == 0) {
                str = this.myCustomFinalTextForAd;
            }
        }
        setTextInView(text, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextInView(CharSequence title, String textForAd) {
        ((SmiDialogBinding) getBinding()).headerStartText.setText(title);
        ((SmiDialogBinding) getBinding()).textInHeader.setText(textForAd);
    }

    public final void transformCollectionWithTextToStringForAd(List<String> currentCollection) {
        this.myCustomTextFromSwitchForAd = "";
        for (String str : currentCollection) {
            this.myCustomTextFromSwitchForAd = this.myCustomTextFromSwitchForAd + " " + str;
        }
        updateFinalPhraseWithPrice();
        changeViewAds(this.isShowStartAd);
    }

    public final void updateFinalPhraseWithPrice() {
        String string = "";
        this.myCustomFinalTextForAd = "";
        if (this.myCustomTextFromSwitchForAd.length() > 0) {
            int i = this.statusForCustomPrice;
            if (i == 0) {
                if (this.valueOfPrice.length() > 0) {
                    string = requireActivity().getString(R.string.smi_dialog_price_for_buy_if_not_empty, this.valueOfPrice);
                } else {
                    string = requireActivity().getString(R.string.smi_dialog_price_for_buy_if_empty);
                }
                Intrinsics.checkNotNull(string);
            } else if (i == 1) {
                if (this.valueOfPrice.length() > 0) {
                    string = requireActivity().getString(R.string.smi_dialog_price_for_sell_if_not_empty, this.valueOfPrice);
                } else {
                    string = requireActivity().getString(R.string.smi_dialog_price_for_sell_if_empty);
                }
                Intrinsics.checkNotNull(string);
            }
            this.myCustomFinalTextForAd = this.myCustomTextFromSwitchForAd + string;
        }
    }

    public final void initInterface() {
        initAdapters();
        initFirstColumn();
    }

    public final void initAdapters() {
        initClickListenerCarOrAccessories();
        initClickListenerFirst();
        this.firstAdapter = new SmiEditorAdapter(this.clickListenerFirst);
        this.secondAdapter = new SmiEditorAdapter(this.clickListenerFirst);
        this.thirdAdapter = new SmiEditorAdapter(this.clickListenerFirst);
        this.fourthAdapter = new SmiEditorAdapter(this.clickListenerFirst);
        this.carOrAccessoriesAdapter = new SmiEditorCarsAndAccessoriesAdapter(this.clickListenerCarOrAccessories);
    }

    public final void initClickListenerCarOrAccessories() {
        this.clickListenerCarOrAccessories = new SmiEditorCarsAndAccessoriesAdapter.OnUserClickCarsAndAccessories() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor.initClickListenerCarOrAccessories.1
            @Override // com.blackhub.bronline.game.gui.smieditor.adapters.SmiEditorCarsAndAccessoriesAdapter.OnUserClickCarsAndAccessories
            public void userClick(@NotNull SmiInfo smiInfo, int getPosition) {
                Intrinsics.checkNotNullParameter(smiInfo, "smiInfo");
                if (!GUISmiEditor.this.changeTextForAdIfCarOrAccessories) {
                    GUISmiEditor.this.changeTextForAdIfCarOrAccessories = true;
                    GUISmiEditor gUISmiEditor = GUISmiEditor.this;
                    gUISmiEditor.oldColumn++;
                    int unused = gUISmiEditor.oldColumn;
                }
                if (smiInfo.isChecked()) {
                    GUISmiEditor.this.getSmiEditorViewModel().updateFinalText((String) UtilsKt.buildTypeMerge(smiInfo.getName(), smiInfo.getNameStore()), GUISmiEditor.this.oldColumn);
                } else {
                    GUISmiEditor.this.getSmiEditorViewModel().updateFinalText(null, GUISmiEditor.this.oldColumn);
                }
                String str = (String) UtilsKt.buildTypeMerge(smiInfo.getName(), smiInfo.getNameStore());
                if (str == null) {
                    str = "";
                }
                Log.v(SmiEditorConstants.SMI_EDITOR, str);
            }
        };
    }

    public final void initClickListenerFirst() {
        this.clickListenerFirst = new SmiEditorAdapter.OnUserClickListenerSmiEditor() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor.initClickListenerFirst.1
            @Override // com.blackhub.bronline.game.gui.smieditor.adapters.SmiEditorAdapter.OnUserClickListenerSmiEditor
            public void clickable(@NotNull SmiEditorBodyObj dataSmiInfoAll, int getPosition) {
                Intrinsics.checkNotNullParameter(dataSmiInfoAll, "dataSmiInfoAll");
                GUISmiEditor.this.changeTextForAdIfCarOrAccessories = false;
                Integer column = dataSmiInfoAll.getColumn();
                if (column != null && column.intValue() == 0) {
                    if (!dataSmiInfoAll.getIsChecked()) {
                        GUISmiEditor.this.changeParamForFirstColumn(-1);
                        GUISmiEditor.this.clearSecondAndThirdAndFourthColumns();
                    } else {
                        GUISmiEditor.this.clearThirdAndFourthColumns();
                        GUISmiEditor.this.changeParamForFirstColumn(getPosition);
                        GUISmiEditor.this.getSmiEditorViewModel().setSecondColumn(getPosition);
                    }
                } else if (column != null && column.intValue() == 1) {
                    if (!dataSmiInfoAll.getIsChecked()) {
                        GUISmiEditor.this.clearThirdAndFourthColumns();
                    } else {
                        GUISmiEditor.this.setVisibleForBlockWithCustomPrice(0);
                        GUISmiEditor.this.ifUnlockFromSwitch = true;
                        GUISmiEditor.this.getSmiEditorViewModel().setThirdColumn(dataSmiInfoAll);
                        GUISmiEditor.this.unlockButtonApply();
                    }
                } else if (column != null && column.intValue() == 2) {
                    GUISmiEditor.this.getSmiEditorViewModel().setFourthColumn(dataSmiInfoAll);
                }
                Integer column2 = dataSmiInfoAll.getColumn();
                if (column2 != null) {
                    GUISmiEditor.this.oldColumn = column2.intValue();
                }
                GUISmiEditor.this.getSmiEditorViewModel().updateFinalText(dataSmiInfoAll.getIsChecked() ? dataSmiInfoAll.getTextForAd() : null, GUISmiEditor.this.oldColumn);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void clearSecondAndThirdAndFourthColumns() {
        attachAdapterToView(((SmiDialogBinding) getBinding()).rvSecondColumn, this.emptyAdapter);
        clearThirdAndFourthColumns();
        getSmiEditorViewModel().clearTitleForSecondAndThirdColumn();
        setVisibleButtonBackToThirdColumn(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void clearThirdAndFourthColumns() {
        attachAdapterToView(((SmiDialogBinding) getBinding()).rvThirdColumn, this.emptyAdapter);
        getSmiEditorViewModel().clearTitleForThirdColumn();
        setVisibleButtonBackToThirdColumn(4);
        setVisibleForBlockWithCustomPrice(4);
        this.ifUnlockFromSwitch = false;
        unlockButtonApply();
    }

    public final void changeParamForFirstColumn(int currentPos) {
        int i;
        if (currentPos != 0) {
            i = 1;
            if (currentPos != 1) {
                i = 2;
                if (currentPos != 2) {
                    i = -1;
                }
            }
        } else {
            i = 0;
        }
        this.statusForCustomPrice = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initFirstColumn() {
        SmiEditorAdapter smiEditorAdapter = this.firstAdapter;
        if (smiEditorAdapter != null) {
            smiEditorAdapter.initItems(this.firstColumn);
        }
        attachAdapterToView(((SmiDialogBinding) getBinding()).typeAds, this.firstAdapter);
    }

    public final void attachAdapterToView(RecyclerView currentRecycler, RecyclerView.Adapter<? extends RecyclerView.ViewHolder> currentAdapter) {
        if (currentRecycler != null) {
            currentRecycler.setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
            currentRecycler.setAdapter(currentAdapter);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initSecondColumn(List<SmiEditorBodyObj> data) {
        SmiEditorAdapter smiEditorAdapter = this.secondAdapter;
        if (smiEditorAdapter != null) {
            smiEditorAdapter.initItems(data);
            smiEditorAdapter.refreshCheck();
        }
        attachAdapterToView(((SmiDialogBinding) getBinding()).rvSecondColumn, this.secondAdapter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initThirdColumn(List<? extends Object> data) {
        List<? extends Object> list = data;
        if ((!list.isEmpty()) && (data.get(0) instanceof SmiEditorBodyObj)) {
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj>");
            SmiEditorAdapter smiEditorAdapter = this.thirdAdapter;
            if (smiEditorAdapter != null) {
                smiEditorAdapter.initItems(data);
                smiEditorAdapter.refreshCheck();
            }
            attachAdapterToView(((SmiDialogBinding) getBinding()).rvThirdColumn, this.thirdAdapter);
        } else if ((!list.isEmpty()) && (data.get(0) instanceof SmiInfo)) {
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.blackhub.bronline.game.gui.smieditor.data.SmiInfo>");
            SmiEditorCarsAndAccessoriesAdapter smiEditorCarsAndAccessoriesAdapter = this.carOrAccessoriesAdapter;
            if (smiEditorCarsAndAccessoriesAdapter != null) {
                smiEditorCarsAndAccessoriesAdapter.initItems(data);
                smiEditorCarsAndAccessoriesAdapter.refreshCheck();
            }
            attachAdapterToView(((SmiDialogBinding) getBinding()).rvThirdColumn, this.carOrAccessoriesAdapter);
        }
        setVisibleButtonBackToThirdColumn(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initFourthColumn(List<? extends Object> data) {
        List<? extends Object> list = data;
        if ((!list.isEmpty()) && (data.get(0) instanceof SmiEditorBodyObj)) {
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj>");
            SmiEditorAdapter smiEditorAdapter = this.fourthAdapter;
            if (smiEditorAdapter != null) {
                smiEditorAdapter.initItems(data);
                smiEditorAdapter.refreshCheck();
            }
            attachAdapterToView(((SmiDialogBinding) getBinding()).rvThirdColumn, this.fourthAdapter);
            return;
        }
        if ((!list.isEmpty()) && (data.get(0) instanceof SmiInfo)) {
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.blackhub.bronline.game.gui.smieditor.data.SmiInfo>");
            SmiEditorCarsAndAccessoriesAdapter smiEditorCarsAndAccessoriesAdapter = this.carOrAccessoriesAdapter;
            if (smiEditorCarsAndAccessoriesAdapter != null) {
                smiEditorCarsAndAccessoriesAdapter.initItems(data);
                smiEditorCarsAndAccessoriesAdapter.refreshCheck();
            }
            attachAdapterToView(((SmiDialogBinding) getBinding()).rvThirdColumn, this.carOrAccessoriesAdapter);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setVisibleButtonBackToThirdColumn(int isVisible) {
        ((SmiDialogBinding) getBinding()).buttonBackToMenuInThirdColumn.setVisibility(isVisible);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTitleForSecondColumn(String currentTitle) {
        ((SmiDialogBinding) getBinding()).headerSecondColumn.setText(currentTitle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTitleForThirdColumn(String currentTitle) {
        ((SmiDialogBinding) getBinding()).headerThirdsColumn.setText(currentTitle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initListeners() {
        SmiDialogBinding smiDialogBinding = (SmiDialogBinding) getBinding();
        smiDialogBinding.buttonBackToMenuInThirdColumn.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUISmiEditor.initListeners$lambda$13$lambda$8(this.f$0, view);
            }
        });
        smiDialogBinding.buttonChangeViewAds.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUISmiEditor.initListeners$lambda$13$lambda$9(this.f$0, view);
            }
        });
        smiDialogBinding.valuePrice.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$initListeners$1$3
            @Override // android.text.TextWatcher
            public void afterTextChanged(@NotNull Editable editable) {
                Intrinsics.checkNotNullParameter(editable, "editable");
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i1, int i2) {
                Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@NotNull CharSequence charSequence, int i, int i1, int i2) {
                Intrinsics.checkNotNullParameter(charSequence, "charSequence");
                String string = charSequence.toString();
                GUISmiEditor gUISmiEditor = this.this$0;
                String priceWithSpaces = "";
                if (string.length() > 0 && string.charAt(0) != '0') {
                    priceWithSpaces = UsefulKt.getPriceWithSpaces(Long.valueOf(Long.parseLong(string)));
                }
                gUISmiEditor.valueOfPrice = priceWithSpaces;
                this.this$0.updateFinalPhraseWithPrice();
                GUISmiEditor gUISmiEditor2 = this.this$0;
                gUISmiEditor2.changeViewAds(gUISmiEditor2.isShowStartAd);
            }
        });
        smiDialogBinding.personalSmiWriter.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$initListeners$1$4
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable p0) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence p0, int p1, int p2, int p3) {
                String string;
                GUISmiEditor gUISmiEditor = this.this$0;
                if (p0 == null || (string = p0.toString()) == null) {
                    string = "";
                }
                gUISmiEditor.myCustomTextFromEditTextForAd = string;
                GUISmiEditor gUISmiEditor2 = this.this$0;
                gUISmiEditor2.changeViewAds(gUISmiEditor2.isShowStartAd);
                this.this$0.unlockButtonApply();
            }
        });
        smiDialogBinding.buttonSendInfoSmi.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                GUISmiEditor.initListeners$lambda$13$lambda$10(this.f$0, view);
            }
        });
        smiDialogBinding.buttonDeleteInfoSmi.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                GUISmiEditor.initListeners$lambda$13$lambda$11(this.f$0, view);
            }
        });
        smiDialogBinding.buttonReplaceSmiInfo.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                GUISmiEditor.initListeners$lambda$13$lambda$12(this.f$0, view);
            }
        });
    }

    public static final void initListeners$lambda$13$lambda$8(GUISmiEditor this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.backFromFourthToThirdColumn();
    }

    public static final void initListeners$lambda$13$lambda$9(GUISmiEditor this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getStartTextAd.length() > 0) {
            view.startAnimation(this$0.getAnim());
            boolean z = !this$0.isShowStartAd;
            this$0.isShowStartAd = z;
            this$0.changeViewAds(z);
        }
    }

    public static final void initListeners$lambda$13$lambda$10(GUISmiEditor this$0, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (view.getAlpha() == 1.0f) {
            view.startAnimation(this$0.getAnim());
            this$0.sendTextToServer();
        }
    }

    public static final void initListeners$lambda$13$lambda$11(GUISmiEditor this$0, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.startAnimation(this$0.getAnim());
        this$0.getSmiEditorViewModel().putInfoForClickCancelOrNextOrDismiss(0);
    }

    public static final void initListeners$lambda$13$lambda$12(GUISmiEditor this$0, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.startAnimation(this$0.getAnim());
        this$0.getSmiEditorViewModel().putInfoForClickCancelOrNextOrDismiss(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void backFromFourthToThirdColumn() {
        SmiEditorAdapter smiEditorAdapter = this.thirdAdapter;
        if (smiEditorAdapter != null) {
            smiEditorAdapter.refreshCheck();
        }
        attachAdapterToView(((SmiDialogBinding) getBinding()).rvThirdColumn, this.thirdAdapter);
        setVisibleButtonBackToThirdColumn(4);
        getSmiEditorViewModel().backFromFourthToThirdColumnForTitleOfColumn();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setVisibleForBlockWithCustomPrice(int isVisible) {
        if (this.statusForCustomPrice != 2) {
            ((SmiDialogBinding) getBinding()).fourthColumn.setVisibility(isVisible);
        }
    }

    public final void unlockButtonApply() {
        if (this.myCustomTextFromEditTextForAd.length() > 14) {
            updateStatusForButtonApply(1.0f);
        } else if (this.myCustomTextFromEditTextForAd.length() == 0 && this.ifUnlockFromSwitch) {
            updateStatusForButtonApply(1.0f);
        } else {
            updateStatusForButtonApply(0.5f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateStatusForButtonApply(float newStatus) {
        ((SmiDialogBinding) getBinding()).buttonSendInfoSmi.setAlpha(newStatus);
    }

    public final void sendTextToServer() throws JSONException {
        String str;
        if (this.myCustomTextFromEditTextForAd.length() > 0 && this.myCustomTextFromEditTextForAd.length() > 14) {
            str = this.myCustomTextFromEditTextForAd;
        } else {
            str = this.myCustomFinalTextForAd;
        }
        getSmiEditorViewModel().putDataToServer(str);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() throws JSONException {
        getSmiEditorViewModel().putInfoForClickCancelOrNextOrDismiss(3);
        setNullableParameters();
        super.onDestroyView();
    }

    private final void setNullableParameters() {
        this.clickListenerFirst = null;
        this.clickListenerCarOrAccessories = null;
        this.firstAdapter = null;
        this.secondAdapter = null;
        this.thirdAdapter = null;
        this.fourthAdapter = null;
        this.carOrAccessoriesAdapter = null;
        this.emptyAdapter = null;
    }

    public GUISmiEditor() {
        final Function0 function0 = null;
        this.mainActivityViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(JNIActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$mainActivityViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                return (ViewModelProvider.Factory) new ViewModelProvider(fragmentActivityRequireActivity, this.this$0.getMainActivityFactory()).get(JNIActivityViewModel.class);
            }
        });
        Function0<ViewModelProvider.Factory> function02 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$smiEditorViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                GUISmiEditor gUISmiEditor = this.this$0;
                return (ViewModelProvider.Factory) new ViewModelProvider(gUISmiEditor, gUISmiEditor.getSmiEditorFactory()).get(SmiEditorViewModel.class);
            }
        };
        final Function0<Fragment> function03 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.smiEditorViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(SmiEditorViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.smieditor.GUISmiEditor$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function04 = function0;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function02);
        this.getStartTextAd = "";
        this.myCustomTextFromSwitchForAd = "";
        this.myCustomFinalTextForAd = "";
        this.myCustomTextFromEditTextForAd = "";
        this.isShowStartAd = true;
        this.valueOfPrice = "";
        this.statusForCustomPrice = -1;
        this.firstColumn = CollectionsKt__CollectionsKt.listOf((Object[]) new SmiEditorBodyObj[]{new SmiEditorBodyObj("Куплю", "Куплю", 0, 0, null), new SmiEditorBodyObj("Продам", "Продам", 0, 0, null), new SmiEditorBodyObj("Собеседование", "Проходит собеседование", 0, 0, null)});
    }
}

