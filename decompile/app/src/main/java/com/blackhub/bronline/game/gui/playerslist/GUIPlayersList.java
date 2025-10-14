package com.blackhub.bronline.game.gui.playerslist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Filter;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.databinding.PlayerListDialogBinding;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.gui.playerslist.adapters.PlayersListAdapter;
import com.blackhub.bronline.game.gui.playerslist.data.PlayersData;
import com.blackhub.bronline.game.gui.playerslist.viewmodel.PlayersListViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.bless.client.R;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GUIPlayersList.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002J\b\u0010\u001d\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u001bH\u0016J\u0010\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020\u001b2\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\b\u0010*\u001a\u00020\u001bH\u0002J\b\u0010+\u001a\u00020\u001bH\u0002J\b\u0010,\u001a\u00020\u001bH\u0003J\u0010\u0010-\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010.\u001a\u00020\u001bH\u0002J\u0010\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\rH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u00061"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/playerslist/GUIPlayersList;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragment;", "Lcom/blackhub/bronline/databinding/PlayerListDialogBinding;", "()V", "mHandler", "Landroid/os/Handler;", "mRunnable", "Ljava/lang/Runnable;", "playersListAdapter", "Lcom/blackhub/bronline/game/gui/playerslist/adapters/PlayersListAdapter;", "searchText", "", "thisPosition", "", "viewModel", "Lcom/blackhub/bronline/game/gui/playerslist/viewmodel/PlayersListViewModel;", "getViewModel", "()Lcom/blackhub/bronline/game/gui/playerslist/viewmodel/PlayersListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "vmFactory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "getVmFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setVmFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "getFilterPlayers", "", "textForFilter", "getGuiId", "getViewBinding", "hideKeyboard", "initViewsISAMPGUI", "newBackPress", "onAttach", "context", "Landroid/content/Context;", "onDestroyView", "onPacketIncoming", "json", "Lorg/json/JSONObject;", "setDataFromJson", "setNullableParameters", "setRepeatUpdate", "setVMObservers", "setVisibleIconInSearchView", "setupSetOnClickListeners", "updateValueOnlinePlayers", "playersDataSize", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nGUIPlayersList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIPlayersList.kt\ncom/blackhub/bronline/game/gui/playerslist/GUIPlayersList\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,173:1\n106#2,15:174\n58#3,23:189\n93#3,3:212\n*S KotlinDebug\n*F\n+ 1 GUIPlayersList.kt\ncom/blackhub/bronline/game/gui/playerslist/GUIPlayersList\n*L\n38#1:174,15\n106#1:189,23\n106#1:212,3\n*E\n"})
/* loaded from: classes2.dex */
public final class GUIPlayersList extends BaseISAMPGUIFragment<PlayerListDialogBinding> {
    public static final int $stable = 8;

    @Nullable
    public Handler mHandler;

    @Nullable
    public Runnable mRunnable;

    @Nullable
    public PlayersListAdapter playersListAdapter;

    @NotNull
    public String searchText = "";
    public int thisPosition = -1;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;

    @Inject
    public MainViewModelFactory<PlayersListViewModel> vmFactory;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 25;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ PlayerListDialogBinding access$getBinding(GUIPlayersList gUIPlayersList) {
        return (PlayerListDialogBinding) gUIPlayersList.getBinding();
    }

    @NotNull
    public final MainViewModelFactory<PlayersListViewModel> getVmFactory() {
        MainViewModelFactory<PlayersListViewModel> mainViewModelFactory = this.vmFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vmFactory");
        return null;
    }

    public final void setVmFactory(@NotNull MainViewModelFactory<PlayersListViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.vmFactory = mainViewModelFactory;
    }

    public final PlayersListViewModel getViewModel() {
        return (PlayersListViewModel) this.viewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        setDataFromJson(json);
    }

    private final void setDataFromJson(JSONObject json) {
        Integer numValueOf = json != null ? Integer.valueOf(json.optInt("t")) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            getViewModel().setData(json);
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() throws JSONException {
        setVMObservers();
        setDataFromJson(getJsonObj());
        this.mHandler = new Handler(Looper.getMainLooper());
        setupSetOnClickListeners();
        getViewModel().sendRequestForUpdatingData();
        setRepeatUpdate();
        JNILib.toggleDrawing2dStuff(true);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public PlayerListDialogBinding getViewBinding() {
        PlayerListDialogBinding playerListDialogBindingInflate = PlayerListDialogBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(playerListDialogBindingInflate, "inflate(...)");
        return playerListDialogBindingInflate;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setVMObservers() {
        getViewModel().getListOfPlayersLiveData().observe(getViewLifecycleOwner(), new GUIPlayersList$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends PlayersData>, Unit>() { // from class: com.blackhub.bronline.game.gui.playerslist.GUIPlayersList.setVMObservers.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends PlayersData> list) {
                invoke2((List<PlayersData>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<PlayersData> list) {
                if (GUIPlayersList.this.playersListAdapter != null) {
                    PlayersListAdapter playersListAdapter = GUIPlayersList.this.playersListAdapter;
                    if (playersListAdapter != null) {
                        Intrinsics.checkNotNull(list);
                        playersListAdapter.setDataInAdapter(list);
                    }
                } else {
                    GUIPlayersList gUIPlayersList = GUIPlayersList.this;
                    Intrinsics.checkNotNull(list);
                    PlayersListAdapter playersListAdapter2 = new PlayersListAdapter(list);
                    final GUIPlayersList gUIPlayersList2 = GUIPlayersList.this;
                    playersListAdapter2.setOnClickListenerPlayersList(new Function2<String, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.playerslist.GUIPlayersList$setVMObservers$1$1$1
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
                            invoke(str, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull String playersName, int i) {
                            Intrinsics.checkNotNullParameter(playersName, "playersName");
                            gUIPlayersList2.thisPosition = i;
                            gUIPlayersList2.getViewModel().setClickedPlayerName(playersName);
                        }
                    });
                    gUIPlayersList.playersListAdapter = playersListAdapter2;
                    GUIPlayersList.access$getBinding(GUIPlayersList.this).recyclerViewPlayersList.setAdapter(GUIPlayersList.this.playersListAdapter);
                }
                GUIPlayersList gUIPlayersList3 = GUIPlayersList.this;
                gUIPlayersList3.getFilterPlayers(gUIPlayersList3.searchText);
                GUIPlayersList.this.updateValueOnlinePlayers(list.size());
                PlayersListAdapter playersListAdapter3 = GUIPlayersList.this.playersListAdapter;
                if (playersListAdapter3 != null) {
                    playersListAdapter3.notifyDataSetChanged();
                }
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setupSetOnClickListeners() {
        ((PlayerListDialogBinding) getBinding()).playersListClose.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.playerslist.GUIPlayersList$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIPlayersList.setupSetOnClickListeners$lambda$1(this.f$0, view);
            }
        });
        ((PlayerListDialogBinding) getBinding()).iconClearSearchText.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.playerslist.GUIPlayersList$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIPlayersList.setupSetOnClickListeners$lambda$2(this.f$0, view);
            }
        });
        EditText searchView = ((PlayerListDialogBinding) getBinding()).searchView;
        Intrinsics.checkNotNullExpressionValue(searchView, "searchView");
        searchView.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.game.gui.playerslist.GUIPlayersList$setupSetOnClickListeners$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                this.this$0.searchText = String.valueOf(s);
                GUIPlayersList gUIPlayersList = this.this$0;
                gUIPlayersList.setVisibleIconInSearchView(gUIPlayersList.searchText);
                GUIPlayersList gUIPlayersList2 = this.this$0;
                gUIPlayersList2.getFilterPlayers(gUIPlayersList2.searchText);
            }
        });
    }

    public static final void setupSetOnClickListeners$lambda$1(final GUIPlayersList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.startAnimation(this$0.getAnim());
        Handler handler = this$0.mHandler;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.playerslist.GUIPlayersList$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    GUIPlayersList.setupSetOnClickListeners$lambda$1$lambda$0(this.f$0);
                }
            }, 200L);
        }
    }

    public static final void setupSetOnClickListeners$lambda$1$lambda$0(GUIPlayersList this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.closeFragment();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void setupSetOnClickListeners$lambda$2(GUIPlayersList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((PlayerListDialogBinding) this$0.getBinding()).searchView.getText().clear();
        this$0.hideKeyboard();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void hideKeyboard() {
        Object systemService = requireContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(((PlayerListDialogBinding) getBinding()).getRoot().getWindowToken(), 0);
        ((PlayerListDialogBinding) getBinding()).searchView.setFocusable(false);
        ((PlayerListDialogBinding) getBinding()).searchView.setFocusableInTouchMode(true);
    }

    public final void setRepeatUpdate() {
        Runnable runnable = new Runnable() { // from class: com.blackhub.bronline.game.gui.playerslist.GUIPlayersList$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                GUIPlayersList.setRepeatUpdate$lambda$4(this.f$0);
            }
        };
        this.mRunnable = runnable;
        Handler handler = this.mHandler;
        if (handler != null) {
            Intrinsics.checkNotNull(runnable);
            handler.postDelayed(runnable, 5000L);
        }
    }

    public static final void setRepeatUpdate$lambda$4(GUIPlayersList this$0) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().sendRequestForUpdatingData();
        Handler handler = this$0.mHandler;
        if (handler != null) {
            Runnable runnable = this$0.mRunnable;
            Intrinsics.checkNotNull(runnable);
            handler.postDelayed(runnable, 5000L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateValueOnlinePlayers(int playersDataSize) {
        ((PlayerListDialogBinding) getBinding()).playersListValuePlayers.setText(getString(R.string.players_list_online, Integer.valueOf(playersDataSize)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setVisibleIconInSearchView(String searchText) {
        PlayerListDialogBinding playerListDialogBinding = (PlayerListDialogBinding) getBinding();
        if (searchText.length() == 0) {
            playerListDialogBinding.iconSearchView.setVisibility(0);
            playerListDialogBinding.iconClearSearchText.setVisibility(4);
            playerListDialogBinding.searchView.setHint(R.string.players_list_search_hint);
        } else {
            playerListDialogBinding.iconSearchView.setVisibility(4);
            playerListDialogBinding.iconClearSearchText.setVisibility(0);
        }
    }

    public final void getFilterPlayers(String textForFilter) {
        Filter filter;
        PlayersListAdapter playersListAdapter = this.playersListAdapter;
        if (playersListAdapter == null || (filter = playersListAdapter.getFilter()) == null) {
            return;
        }
        filter.filter(textForFilter);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() throws JSONException {
        JNILib.toggleDrawing2dStuff(false);
        getViewModel().sendClosedWindow();
        Handler handler = this.mHandler;
        Intrinsics.checkNotNull(handler);
        Runnable runnable = this.mRunnable;
        Intrinsics.checkNotNull(runnable);
        handler.removeCallbacks(runnable);
        setNullableParameters();
        super.onDestroyView();
    }

    private final void setNullableParameters() {
        this.mRunnable = null;
        this.mHandler = null;
        this.playersListAdapter = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    public GUIPlayersList() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.playerslist.GUIPlayersList$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return this.this$0;
            }
        };
        Function0<ViewModelProvider.Factory> function02 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.playerslist.GUIPlayersList$viewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getVmFactory();
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.playerslist.GUIPlayersList$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function03 = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(PlayersListViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.playerslist.GUIPlayersList$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.playerslist.GUIPlayersList$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function02);
    }
}
