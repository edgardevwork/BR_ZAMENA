package com.blackhub.bronline.game.gui.donate;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageButton;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.ComposeView;
import androidx.compose.p003ui.platform.ViewCompositionStrategy;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.DonateMainLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.FloatExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.model.ConfigurationJsonModel;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskModel;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.blackpass.BlackPassMainUIState;
import com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain;
import com.blackhub.bronline.game.gui.blackpass.data.PrizeState;
import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassUtils;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassActivateViewModel;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassPrizeListViewModel;
import com.blackhub.bronline.game.gui.donate.adapters.DonateHeaderOrFooterAdapter;
import com.blackhub.bronline.game.gui.donate.data.DonateItem;
import com.blackhub.bronline.game.gui.donate.data.FragmentIDWithStatusOfReplay;
import com.blackhub.bronline.game.gui.donate.data.HeaderOrFooterButtonObj;
import com.blackhub.bronline.game.gui.donate.data.ItemForDialogConfirmation;
import com.blackhub.bronline.game.gui.donate.data.ObjForResultDialog;
import com.blackhub.bronline.game.gui.donate.data.PreviewPrize;
import com.blackhub.bronline.game.gui.donate.p011ui.UILayoutDonateDepositCoins;
import com.blackhub.bronline.game.gui.donate.p011ui.UILayoutDonatePreviewCar;
import com.blackhub.bronline.game.gui.donate.p011ui.UILayoutDonatePreviewPack;
import com.blackhub.bronline.game.gui.donate.p011ui.UILayoutDonateTile;
import com.blackhub.bronline.game.gui.donate.utils.DonateAllKeys;
import com.blackhub.bronline.game.gui.donate.utils.DonateConstants;
import com.blackhub.bronline.game.gui.donate.utils.DonateDictionaryKt;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateDepositCoinsViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateServiceViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel;
import com.blackhub.bronline.game.model.remote.response.blackpass.BlackPassItems;
import com.blackhub.bronline.game.model.remote.response.blackpass.LevelsInfo;
import com.blackhub.bronline.game.p019ui.blackpass.BlackPassBoostHintUIKt;
import com.blackhub.bronline.game.p019ui.blackpass.BlackPassPrizeListUiKt;
import com.blackhub.bronline.game.p019ui.blackpass.lastchance.BlackPassLastChanceUIKt;
import com.blackhub.bronline.game.p019ui.widget.dialog.PreviewRewardDialogUiKt;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.bless.client.R;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
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
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GUIDonate.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGUIDonate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIDonate.kt\ncom/blackhub/bronline/game/gui/donate/GUIDonate\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1467:1\n172#2,9:1468\n106#2,15:1477\n106#2,15:1492\n106#2,15:1507\n106#2,15:1522\n106#2,15:1537\n106#2,15:1552\n106#2,15:1567\n256#3,2:1582\n256#3,2:1584\n*S KotlinDebug\n*F\n+ 1 GUIDonate.kt\ncom/blackhub/bronline/game/gui/donate/GUIDonate\n*L\n204#1:1468,9\n210#1:1477,15\n216#1:1492,15\n222#1:1507,15\n228#1:1522,15\n234#1:1537,15\n241#1:1552,15\n248#1:1567,15\n354#1:1582,2\n1452#1:1584,2\n*E\n"})
/* loaded from: classes2.dex */
public final class GUIDonate extends BaseISAMPGUIFragment<DonateMainLayoutBinding> {
    public static final int $stable = 8;

    @Inject
    public MainViewModelFactory<BlackPassActivateViewModel> blackPassActivateFactory;

    /* renamed from: blackPassActivateViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy blackPassActivateViewModel;

    @Inject
    public MainViewModelFactory<BlackPassMainViewModel> blackPassMainFactory;

    /* renamed from: blackPassMainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy blackPassMainViewModel;

    @Inject
    public MainViewModelFactory<BlackPassPrizeListViewModel> blackPassPrizeListFactory;

    /* renamed from: blackPassPrizeListViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy blackPassPrizeListViewModel;
    public long blockMessageTimer;
    public long blockTimer;
    public int currentFragment;
    public int currentPage;

    @Inject
    public MainViewModelFactory<DonateDepositCoinsViewModel> depositCoinsFactory;

    /* renamed from: depositCoinsViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy depositCoinsViewModel;

    @Nullable
    public DonateCustomDialog dialogConfirmation;

    @Inject
    public MainViewModelFactory<DonateMainViewModel> donateFactory;

    @Inject
    public MainViewModelFactory<DonateServiceViewModel> donateServiceFactory;

    @Inject
    public MainViewModelFactory<DonateTileViewModel> donateTileFactory;

    /* renamed from: donateTileViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy donateTileViewModel;

    /* renamed from: donateViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy donateViewModel;

    @Nullable
    public DonateHeaderOrFooterAdapter footerAdapter;

    @Nullable
    public DonateHeaderOrFooterAdapter headerAdapter;
    public boolean ifEmptyDonateItemsFromJSON = true;

    @Nullable
    public JSONObject jsonObject;

    @Inject
    public MainViewModelFactory<JNIActivityViewModel> mainActivityFactory;

    /* renamed from: mainActivityViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainActivityViewModel;

    /* renamed from: serviceViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy serviceViewModel;

    @Nullable
    public Runnable timeoutRunnable;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 22;
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment, com.blackhub.bronline.game.ISAMPGUI
    public boolean isShowingGui() {
        return true;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ DonateMainLayoutBinding access$getBinding(GUIDonate gUIDonate) {
        return (DonateMainLayoutBinding) gUIDonate.getBinding();
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

    public final JNIActivityViewModel getMainActivityViewModel() {
        return (JNIActivityViewModel) this.mainActivityViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<DonateMainViewModel> getDonateFactory() {
        MainViewModelFactory<DonateMainViewModel> mainViewModelFactory = this.donateFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("donateFactory");
        return null;
    }

    public final void setDonateFactory(@NotNull MainViewModelFactory<DonateMainViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.donateFactory = mainViewModelFactory;
    }

    public final DonateMainViewModel getDonateViewModel() {
        return (DonateMainViewModel) this.donateViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<DonateTileViewModel> getDonateTileFactory() {
        MainViewModelFactory<DonateTileViewModel> mainViewModelFactory = this.donateTileFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("donateTileFactory");
        return null;
    }

    public final void setDonateTileFactory(@NotNull MainViewModelFactory<DonateTileViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.donateTileFactory = mainViewModelFactory;
    }

    public final DonateTileViewModel getDonateTileViewModel() {
        return (DonateTileViewModel) this.donateTileViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<DonateDepositCoinsViewModel> getDepositCoinsFactory() {
        MainViewModelFactory<DonateDepositCoinsViewModel> mainViewModelFactory = this.depositCoinsFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("depositCoinsFactory");
        return null;
    }

    public final void setDepositCoinsFactory(@NotNull MainViewModelFactory<DonateDepositCoinsViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.depositCoinsFactory = mainViewModelFactory;
    }

    public final DonateDepositCoinsViewModel getDepositCoinsViewModel() {
        return (DonateDepositCoinsViewModel) this.depositCoinsViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<DonateServiceViewModel> getDonateServiceFactory() {
        MainViewModelFactory<DonateServiceViewModel> mainViewModelFactory = this.donateServiceFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("donateServiceFactory");
        return null;
    }

    public final void setDonateServiceFactory(@NotNull MainViewModelFactory<DonateServiceViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.donateServiceFactory = mainViewModelFactory;
    }

    public final DonateServiceViewModel getServiceViewModel() {
        return (DonateServiceViewModel) this.serviceViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<BlackPassMainViewModel> getBlackPassMainFactory() {
        MainViewModelFactory<BlackPassMainViewModel> mainViewModelFactory = this.blackPassMainFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("blackPassMainFactory");
        return null;
    }

    public final void setBlackPassMainFactory(@NotNull MainViewModelFactory<BlackPassMainViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.blackPassMainFactory = mainViewModelFactory;
    }

    public final BlackPassMainViewModel getBlackPassMainViewModel() {
        return (BlackPassMainViewModel) this.blackPassMainViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<BlackPassActivateViewModel> getBlackPassActivateFactory() {
        MainViewModelFactory<BlackPassActivateViewModel> mainViewModelFactory = this.blackPassActivateFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("blackPassActivateFactory");
        return null;
    }

    public final void setBlackPassActivateFactory(@NotNull MainViewModelFactory<BlackPassActivateViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.blackPassActivateFactory = mainViewModelFactory;
    }

    public final BlackPassActivateViewModel getBlackPassActivateViewModel() {
        return (BlackPassActivateViewModel) this.blackPassActivateViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<BlackPassPrizeListViewModel> getBlackPassPrizeListFactory() {
        MainViewModelFactory<BlackPassPrizeListViewModel> mainViewModelFactory = this.blackPassPrizeListFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("blackPassPrizeListFactory");
        return null;
    }

    public final void setBlackPassPrizeListFactory(@NotNull MainViewModelFactory<BlackPassPrizeListViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.blackPassPrizeListFactory = mainViewModelFactory;
    }

    public final BlackPassPrizeListViewModel getBlackPassPrizeListViewModel() {
        return (BlackPassPrizeListViewModel) this.blackPassPrizeListViewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        App.INSTANCE.appComponent().inject(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@NotNull JSONObject json) throws JSONException {
        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(json, "json");
        int iOptInt = json.optInt("t");
        int i3 = R.string.donate_result_replenish;
        int i4 = R.string.common_error;
        switch (iOptInt) {
            case -1:
                Group groupFooter = ((DonateMainLayoutBinding) getBinding()).groupFooter;
                Intrinsics.checkNotNullExpressionValue(groupFooter, "groupFooter");
                groupFooter.setVisibility(8);
                int iOptInt2 = json.optInt("ty");
                if (iOptInt2 == -1) {
                    getBlackPassMainViewModel().initInterface(json, getMainActivityViewModel().getConfigurationJsons().getValue().getVehiclesFromJson(), getMainActivityViewModel().getConfigurationJsons().getValue().getSkinsFromJson(), getMainActivityViewModel().getConfigurationJsons().getValue().getBpRewardsModel().getListOfAwardsTypes(), json.optInt("a"));
                    if (json.optInt("sp") == 1) {
                        showOnlyBPActivate();
                        getBlackPassMainViewModel().onClickSelectLayout(4);
                        break;
                    }
                } else if (iOptInt2 == 0) {
                    int iOptInt3 = json.optInt("la");
                    if (iOptInt3 == 4 && (donateHeaderOrFooterAdapter = this.headerAdapter) != null) {
                        donateHeaderOrFooterAdapter.deselectTab();
                    }
                    getBlackPassMainViewModel().updateJson(json, iOptInt3, getMainActivityViewModel().getConfigurationJsons().getValue().getBlackPassItemsFromJson().getDeluxeRewards(), getMainActivityViewModel().getConfigurationJsons().getValue().getBpRewardsModel().getListOfAwardsTypes());
                    break;
                } else if (iOptInt2 == 1) {
                    int iOptInt4 = json.optInt("la");
                    if (iOptInt4 == 0) {
                        if (json.optInt("s") == 0) {
                            getDepositCoinsViewModel().setInputCoins(0);
                            BlackPassMainViewModel blackPassMainViewModel = getBlackPassMainViewModel();
                            String string = getString(R.string.black_pass_not_enough_money);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            String string2 = getString(R.string.black_pass_top_up_your_account);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            String string3 = getString(R.string.common_error);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            String string4 = getString(R.string.donate_result_replenish);
                            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                            blackPassMainViewModel.showDialogResult(string, 0, string2, string3, string4, 1);
                            break;
                        } else {
                            BlackPassMainViewModel.levelUp$default(getBlackPassMainViewModel(), 0, 0, 3, null);
                            break;
                        }
                    } else if (iOptInt4 == 1) {
                        if (json.optInt("s") == 0) {
                            getDepositCoinsViewModel().setInputCoins(10);
                            BlackPassMainViewModel blackPassMainViewModel2 = getBlackPassMainViewModel();
                            String string5 = getString(R.string.black_pass_not_enough_money);
                            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                            String string6 = getString(R.string.black_pass_top_up_your_account);
                            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                            String string7 = getString(R.string.common_error);
                            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                            String string8 = getString(R.string.donate_result_replenish);
                            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                            blackPassMainViewModel2.showDialogResult(string5, 0, string6, string7, string8, 1);
                            break;
                        } else {
                            getBlackPassMainViewModel().updateJson(json, 1, getMainActivityViewModel().getConfigurationJsons().getValue().getBlackPassItemsFromJson().getDeluxeRewards(), getMainActivityViewModel().getConfigurationJsons().getValue().getBpRewardsModel().getListOfAwardsTypes());
                            break;
                        }
                    } else if (iOptInt4 == 3) {
                        getBlackPassMainViewModel().updateMyPosition(json.optInt("p"));
                        break;
                    } else if (iOptInt4 == 4) {
                        if (json.optInt("s") != 0) {
                            getBlackPassMainViewModel().setPremiumStatusSuccessfullyBought();
                            if (getBlackPassMainViewModel().getUiState().getValue().getTimerDaysAndHours().getDays() < 14 && getBlackPassMainViewModel().getUiState().getValue().getBpLevel() < getBlackPassMainViewModel().getUiState().getValue().getMaxBpLevel()) {
                                getDonateViewModel().setShowBoostLevelsHintBPView(true);
                                break;
                            }
                        } else {
                            getDepositCoinsViewModel().setPriceIfNotPurchasePremium();
                            BlackPassMainViewModel blackPassMainViewModel3 = getBlackPassMainViewModel();
                            String string9 = getString(R.string.black_pass_not_enough_money);
                            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                            String string10 = getString(R.string.black_pass_top_up_your_account);
                            Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                            String string11 = getString(R.string.common_error);
                            Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                            String string12 = getString(R.string.donate_result_replenish);
                            Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
                            blackPassMainViewModel3.showDialogResult(string9, 0, string10, string11, string12, 1);
                            break;
                        }
                    }
                } else if (iOptInt2 == 2) {
                    if (json.optInt("la") == 0 && json.optInt("s") == 1) {
                        getBlackPassMainViewModel().updateAfterGetPrize(json);
                        break;
                    }
                } else if (iOptInt2 == 3 && json.optInt("tb", -2) == -2) {
                    getBlackPassMainViewModel().levelUp(json.optInt("e"), json.optInt("l"));
                    break;
                }
                break;
            case 0:
                if (json.optInt("y") == 1) {
                    DonateMainViewModel donateViewModel = getDonateViewModel();
                    donateViewModel.setValueOfRubles(json.optInt("r"));
                    donateViewModel.setValueOfCoins(json.optInt("s"));
                    i4 = R.string.common_result_done;
                    i2 = 0;
                    i = 1;
                } else if (json.optInt("k") > 0) {
                    getDepositCoinsViewModel().setInputCoins(json.optInt("k"));
                    i = 0;
                    i2 = 1;
                    DonateMainViewModel donateViewModel2 = getDonateViewModel();
                    donateViewModel2.closeTimeoutConfirmationDialog();
                    String strOptString = json.optString("m");
                    Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                    String strOptString2 = json.optString("n");
                    Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                    String string13 = getString(i4);
                    Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
                    String string14 = getString(i3);
                    Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
                    donateViewModel2.setObjForDialogResult(new ObjForResultDialog(strOptString, i, strOptString2, string13, string14, i2));
                    getDonateTileViewModel().removeSaleItemInfoAndUpdateLimit(json);
                    break;
                } else if (json.optInt("tb") == 0) {
                    i = 0;
                    i2 = 0;
                }
                i3 = R.string.common_return;
                DonateMainViewModel donateViewModel22 = getDonateViewModel();
                donateViewModel22.closeTimeoutConfirmationDialog();
                String strOptString3 = json.optString("m");
                Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
                String strOptString22 = json.optString("n");
                Intrinsics.checkNotNullExpressionValue(strOptString22, "optString(...)");
                String string132 = getString(i4);
                Intrinsics.checkNotNullExpressionValue(string132, "getString(...)");
                String string142 = getString(i3);
                Intrinsics.checkNotNullExpressionValue(string142, "getString(...)");
                donateViewModel22.setObjForDialogResult(new ObjForResultDialog(strOptString3, i, strOptString22, string132, string142, i2));
                getDonateTileViewModel().removeSaleItemInfoAndUpdateLimit(json);
                break;
            case 2:
                getDonateTileViewModel().updateSurpriseAndSalesEveryMinute(json);
                break;
            case 3:
                DonateMainViewModel donateViewModel3 = getDonateViewModel();
                donateViewModel3.setValueOfRubles(json.optInt("s"));
                donateViewModel3.setValueOfCoins(json.optInt("r"));
                break;
            case 5:
                getDepositCoinsViewModel().setCoins(json.optInt("s"));
                break;
            case 6:
                getDonateTileViewModel().clearLimit(json.optInt("id"));
                break;
            case 7:
                getDonateTileViewModel().updateValueOfLimit(json.optJSONArray("b"));
                break;
            case 8:
                getDonateTileViewModel().updateNewSaleItems(json);
                break;
            case 9:
                DonateMainViewModel donateViewModel4 = getDonateViewModel();
                String strOptString4 = json.optString("m");
                Intrinsics.checkNotNullExpressionValue(strOptString4, "optString(...)");
                String strOptString5 = json.optString("n");
                Intrinsics.checkNotNullExpressionValue(strOptString5, "optString(...)");
                String string15 = getString(R.string.common_error);
                Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
                String string16 = getString(R.string.common_close);
                Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
                donateViewModel4.setObjForDialogResult(new ObjForResultDialog(strOptString4, 0, strOptString5, string15, string16, 999));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() throws Resources.NotFoundException {
        getDataFromJson(getJsonObj());
        initObjects();
        setObservers();
        initHeaderPages();
        initFooterPages();
        initListeners();
        ComposeView composeView = ((DonateMainLayoutBinding) getBinding()).composeViewFirstDonateFullScreen;
        ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed disposeOnViewTreeLifecycleDestroyed = ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE;
        composeView.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        ((DonateMainLayoutBinding) getBinding()).composeViewSecondDonateFullScreen.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        ((DonateMainLayoutBinding) getBinding()).composeViewDonate.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        switch (this.currentFragment) {
            case 101:
            case 102:
            case 103:
                ((DonateMainLayoutBinding) getBinding()).composeViewDonate.setVisibility(0);
                break;
        }
        ((DonateMainLayoutBinding) getBinding()).composeViewDonate.setContent(ComposableLambdaKt.composableLambdaInstance(1149016189, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate.initViewsISAMPGUI.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@Nullable Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1149016189, i, -1, "com.blackhub.bronline.game.gui.donate.GUIDonate.initViewsISAMPGUI.<anonymous> (GUIDonate.kt:514)");
                    }
                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(((BlackPassMainUIState) FlowExtKt.collectAsStateWithLifecycle(GUIDonate.this.getBlackPassMainViewModel().getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7).getValue()).getSeasonBg(), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composer, 3128, 116);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public DonateMainLayoutBinding getViewBinding() {
        DonateMainLayoutBinding donateMainLayoutBindingInflate = DonateMainLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(donateMainLayoutBindingInflate, "inflate(...)");
        return donateMainLayoutBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        setNullableParameters();
        super.onDestroyView();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (UtilsKt.isRustoreBuildVariant() || !getDepositCoinsViewModel().isShowFragment().getValue().booleanValue()) {
            return;
        }
        getDepositCoinsViewModel().closeDepositCoinsFragment(true);
        onCLickBpButton();
    }

    public final void getDataFromJson(JSONObject jsonObject) {
        Unit unit;
        if (jsonObject != null) {
            boolean zIsOne = IntExtensionKt.isOne(Integer.valueOf(jsonObject.optInt(DonateAllKeys.IS_NEED_SHOW_DONATE_PACKAGE_DU)));
            boolean zIsOne2 = IntExtensionKt.isOne(Integer.valueOf(jsonObject.optInt("ds")));
            this.jsonObject = jsonObject;
            DonateMainViewModel donateViewModel = getDonateViewModel();
            donateViewModel.setValueOfRubles(jsonObject.optInt("r"));
            donateViewModel.setValueOfCoins(jsonObject.optInt("d"));
            DonateDepositCoinsViewModel depositCoinsViewModel = getDepositCoinsViewModel();
            String strOptString = jsonObject.optString("em");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            depositCoinsViewModel.setEmail(strOptString);
            DonateDepositCoinsViewModel depositCoinsViewModel2 = getDepositCoinsViewModel();
            String strOptString2 = jsonObject.optString("nm");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
            depositCoinsViewModel2.setNickname(strOptString2);
            getDepositCoinsViewModel().setDoubleDonateValue(zIsOne2);
            getMainActivityViewModel().connectPurchases(zIsOne2, zIsOne);
            getDepositCoinsViewModel().setServerNumber(jsonObject.optInt(DonateAllKeys.KEY_SV_SET_SERVER_NUMBER));
            getDepositCoinsViewModel().setFlagForOpenDonatePackage(zIsOne);
            int iOptInt = jsonObject.optInt("lc");
            if (iOptInt == 2) {
                this.currentFragment = 102;
            } else if (iOptInt == 3) {
                this.currentFragment = 103;
            } else if (iOptInt == 4) {
                this.currentFragment = 101;
            } else if (iOptInt == 5) {
                this.currentFragment = 9;
            } else if (iOptInt == 6) {
                this.currentFragment = 14;
            }
            this.currentPage = jsonObject.optInt("k");
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            firebaseCrashlytics.log("jsonObject == null");
            firebaseCrashlytics.recordException(new Throwable());
        }
    }

    public final void initObjects() {
        initDialogConfirmation();
        getMainActivityViewModel();
        getDonateViewModel();
        getDonateTileViewModel();
        getDepositCoinsViewModel();
        getServiceViewModel();
        getBlackPassMainViewModel();
        getBlackPassActivateViewModel();
        getBlackPassPrizeListViewModel();
    }

    public final void initDialogConfirmation() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        DonateCustomDialog donateCustomDialog = new DonateCustomDialog(fragmentActivityRequireActivity);
        donateCustomDialog.setClickListenerInBuyCarDialog(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$initDialogConfirmation$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) throws JSONException {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) throws JSONException {
                this.this$0.getDonateViewModel().confirmationBuyCar(i);
            }
        });
        this.dialogConfirmation = donateCustomDialog;
        initDialogClickListeners();
    }

    public final void initDialogClickListeners() {
        DonateCustomDialog donateCustomDialog = this.dialogConfirmation;
        if (donateCustomDialog == null) {
            return;
        }
        donateCustomDialog.setResultClickListener(new Function2<Integer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate.initDialogClickListeners.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) throws JSONException {
                invoke(num.intValue(), num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i, int i2) throws JSONException {
                if (i == 0) {
                    GUIDonate.this.getDonateViewModel().closeConfirmationDialog();
                    return;
                }
                if (i == 1) {
                    GUIDonate.this.getDonateViewModel().closeConfirmationDialog();
                    GUIDonate.this.onCLickBpButton();
                    return;
                }
                if (i == 2) {
                    GUIDonate.this.getDonateViewModel().confirmationBuySkinsOrMoneyOrAccessoriesOrServices();
                    return;
                }
                if (i == 3) {
                    GUIDonate.this.getDonateViewModel().sendCustomValueOfRubles(i2);
                } else if (i == 333) {
                    GUIDonate.this.getDonateViewModel().setClosedStatusForInputCustomValueOfRublesDialog();
                } else {
                    if (i != 999) {
                        return;
                    }
                    GUIDonate.this.closeFragment();
                }
            }
        });
    }

    public final void startTimeout() {
        View view;
        if (this.timeoutRunnable != null && (view = getView()) != null) {
            view.removeCallbacks(this.timeoutRunnable);
        }
        this.timeoutRunnable = new Runnable() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                GUIDonate.startTimeout$lambda$8(this.f$0);
            }
        };
        View view2 = getView();
        if (view2 != null) {
            view2.postDelayed(this.timeoutRunnable, 3000L);
        }
    }

    public static final void startTimeout$lambda$8(GUIDonate this$0) throws JSONException {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DonateMainViewModel donateViewModel = this$0.getDonateViewModel();
        FragmentActivity activity = this$0.getActivity();
        String str = DonateConstants.DONATE_STUB;
        if (activity == null || (string = activity.getString(R.string.common_error)) == null) {
            string = DonateConstants.DONATE_STUB;
        }
        FragmentActivity activity2 = this$0.getActivity();
        if (activity2 != null && (string2 = activity2.getString(R.string.donate_error_body)) != null) {
            str = string2;
        }
        donateViewModel.showLocalError(0, string, str);
    }

    public final void closeTimeout() {
        if (this.timeoutRunnable != null) {
            View view = getView();
            if (view != null) {
                view.removeCallbacks(this.timeoutRunnable);
            }
            this.timeoutRunnable = null;
        }
    }

    /* compiled from: GUIDonate.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$1", m7120f = "GUIDonate.kt", m7121i = {}, m7122l = {BlackPassUtils.CAR_AWARD_ID_674}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$1 */
    /* loaded from: classes.dex */
    public static final class C38631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38631(Continuation<? super C38631> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIDonate.this.new C38631(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<ConfigurationJsonModel> configurationJsons = GUIDonate.this.getMainActivityViewModel().getConfigurationJsons();
                Lifecycle lifecycle = GUIDonate.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = androidx.lifecycle.FlowExtKt.flowWithLifecycle(configurationJsons, lifecycle, Lifecycle.State.STARTED);
                final GUIDonate gUIDonate = GUIDonate.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ConfigurationJsonModel) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull ConfigurationJsonModel configurationJsonModel, @NotNull Continuation<? super Unit> continuation) throws JSONException {
                        List<DonateItem> donateItemsFromJson = configurationJsonModel.getDonateItemsFromJson();
                        if (!donateItemsFromJson.isEmpty()) {
                            gUIDonate.ifEmptyDonateItemsFromJSON = false;
                            gUIDonate.getDonateTileViewModel().initDonateItemsFromJSON(donateItemsFromJson, gUIDonate.jsonObject);
                            gUIDonate.getServiceViewModel().initServiceItems(donateItemsFromJson);
                            gUIDonate.getDonateTileViewModel().initSaleItems(gUIDonate.jsonObject);
                            gUIDonate.initDonateInterface();
                        } else {
                            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                            donateItemsFromJson.size();
                            firebaseCrashlytics.recordException(new Throwable());
                            GUIDonate gUIDonate2 = gUIDonate;
                            String string = gUIDonate2.getString(R.string.donate_error_init_interface);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            gUIDonate2.showErrorMessage(string);
                            gUIDonate.closeFragment();
                        }
                        BlackPassItems blackPassItemsFromJson = configurationJsonModel.getBlackPassItemsFromJson();
                        gUIDonate.getBlackPassMainViewModel().initDataFromJson(blackPassItemsFromJson, gUIDonate.getMainActivityViewModel().getConfigurationJsons().getValue().getCalendarModel().getProperties().getSeasonColor());
                        BlackPassPrizeListViewModel blackPassPrizeListViewModel = gUIDonate.getBlackPassPrizeListViewModel();
                        List<LevelsInfo> standardLevel = blackPassItemsFromJson.getStandardLevel();
                        if (standardLevel == null) {
                            standardLevel = CollectionsKt__CollectionsKt.emptyList();
                        }
                        List<LevelsInfo> premiumLevel = blackPassItemsFromJson.getPremiumLevel();
                        if (premiumLevel == null) {
                            premiumLevel = CollectionsKt__CollectionsKt.emptyList();
                        }
                        blackPassPrizeListViewModel.initPrizeList(standardLevel, premiumLevel);
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
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C38631(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C38732(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C38743(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C38754(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C38765(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C38776(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C38787(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C38798(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C38809(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C386410(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C386511(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C386712(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C386813(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C387014(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C387115(null), 3, null);
    }

    /* compiled from: GUIDonate.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$2", m7120f = "GUIDonate.kt", m7121i = {}, m7122l = {711}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$2 */
    /* loaded from: classes3.dex */
    public static final class C38732 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38732(Continuation<? super C38732> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIDonate.this.new C38732(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38732) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> newValueOfRubles = GUIDonate.this.getDonateViewModel().getNewValueOfRubles();
                Lifecycle lifecycle = GUIDonate.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = androidx.lifecycle.FlowExtKt.flowWithLifecycle(newValueOfRubles, lifecycle, Lifecycle.State.STARTED);
                final GUIDonate gUIDonate = GUIDonate.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                        gUIDonate.setValueOfRublesInView(i2);
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

    /* compiled from: GUIDonate.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$3", m7120f = "GUIDonate.kt", m7121i = {}, m7122l = {720}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$3 */
    /* loaded from: classes3.dex */
    public static final class C38743 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38743(Continuation<? super C38743> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIDonate.this.new C38743(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38743) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> newValueOfCoins = GUIDonate.this.getDonateViewModel().getNewValueOfCoins();
                Lifecycle lifecycle = GUIDonate.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = androidx.lifecycle.FlowExtKt.flowWithLifecycle(newValueOfCoins, lifecycle, Lifecycle.State.STARTED);
                final GUIDonate gUIDonate = GUIDonate.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                        gUIDonate.setValueOfCoinsInView(i2);
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

    /* compiled from: GUIDonate.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$4", m7120f = "GUIDonate.kt", m7121i = {}, m7122l = {729}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$4 */
    /* loaded from: classes3.dex */
    public static final class C38754 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38754(Continuation<? super C38754> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIDonate.this.new C38754(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38754) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> timeoutStatusDialogConfirmation = GUIDonate.this.getDonateViewModel().getTimeoutStatusDialogConfirmation();
                Lifecycle lifecycle = GUIDonate.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = androidx.lifecycle.FlowExtKt.flowWithLifecycle(timeoutStatusDialogConfirmation, lifecycle, Lifecycle.State.STARTED);
                final GUIDonate gUIDonate = GUIDonate.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.4.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                        if (z) {
                            gUIDonate.startTimeout();
                        } else {
                            gUIDonate.closeTimeout();
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

    /* compiled from: GUIDonate.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$5", m7120f = "GUIDonate.kt", m7121i = {}, m7122l = {742}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$5 */
    /* loaded from: classes3.dex */
    public static final class C38765 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38765(Continuation<? super C38765> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIDonate.this.new C38765(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38765) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<ItemForDialogConfirmation> itemForDialogConfirmation = GUIDonate.this.getDonateViewModel().getItemForDialogConfirmation();
                Lifecycle lifecycle = GUIDonate.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = androidx.lifecycle.FlowExtKt.flowWithLifecycle(itemForDialogConfirmation, lifecycle, Lifecycle.State.STARTED);
                final GUIDonate gUIDonate = GUIDonate.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.5.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ItemForDialogConfirmation) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull ItemForDialogConfirmation itemForDialogConfirmation2, @NotNull Continuation<? super Unit> continuation) {
                        DonateCustomDialog donateCustomDialog = gUIDonate.dialogConfirmation;
                        if (donateCustomDialog != null) {
                            donateCustomDialog.showConfirmationPopupDialog(itemForDialogConfirmation2);
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

    /* compiled from: GUIDonate.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$6", m7120f = "GUIDonate.kt", m7121i = {}, m7122l = {749}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$6 */
    /* loaded from: classes3.dex */
    public static final class C38776 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38776(Continuation<? super C38776> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIDonate.this.new C38776(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38776) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<FragmentIDWithStatusOfReplay> fragmentID = GUIDonate.this.getDonateViewModel().getFragmentID();
                Lifecycle lifecycle = GUIDonate.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = androidx.lifecycle.FlowExtKt.flowWithLifecycle(fragmentID, lifecycle, Lifecycle.State.STARTED);
                final GUIDonate gUIDonate = GUIDonate.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.6.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((FragmentIDWithStatusOfReplay) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull FragmentIDWithStatusOfReplay fragmentIDWithStatusOfReplay, @NotNull Continuation<? super Unit> continuation) {
                        gUIDonate.currentFragment = fragmentIDWithStatusOfReplay.getFragmentID();
                        gUIDonate.showNewFragment(fragmentIDWithStatusOfReplay);
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

    /* compiled from: GUIDonate.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$7", m7120f = "GUIDonate.kt", m7121i = {}, m7122l = {759}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$7 */
    /* loaded from: classes3.dex */
    public static final class C38787 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38787(Continuation<? super C38787> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIDonate.this.new C38787(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38787) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<ObjForResultDialog> itemForDialogResult = GUIDonate.this.getDonateViewModel().getItemForDialogResult();
                Lifecycle lifecycle = GUIDonate.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = androidx.lifecycle.FlowExtKt.flowWithLifecycle(itemForDialogResult, lifecycle, Lifecycle.State.STARTED);
                final GUIDonate gUIDonate = GUIDonate.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.7.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ObjForResultDialog) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull ObjForResultDialog objForResultDialog, @NotNull Continuation<? super Unit> continuation) {
                        DonateCustomDialog donateCustomDialog = gUIDonate.dialogConfirmation;
                        if (donateCustomDialog != null) {
                            donateCustomDialog.showResultDialog(objForResultDialog);
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

    /* compiled from: GUIDonate.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$8", m7120f = "GUIDonate.kt", m7121i = {}, m7122l = {768}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$8 */
    /* loaded from: classes3.dex */
    public static final class C38798 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38798(Continuation<? super C38798> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIDonate.this.new C38798(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38798) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> stateFlowIsShowingDialogConfirmation = GUIDonate.this.getDonateViewModel().isShowingDialogConfirmation();
                Lifecycle lifecycle = GUIDonate.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = androidx.lifecycle.FlowExtKt.flowWithLifecycle(stateFlowIsShowingDialogConfirmation, lifecycle, Lifecycle.State.STARTED);
                final GUIDonate gUIDonate = GUIDonate.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.8.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                        DonateCustomDialog donateCustomDialog;
                        if (!z && (donateCustomDialog = gUIDonate.dialogConfirmation) != null) {
                            donateCustomDialog.dismissDialog();
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

    /* compiled from: GUIDonate.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$9", m7120f = "GUIDonate.kt", m7121i = {}, m7122l = {779}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$9 */
    /* loaded from: classes3.dex */
    public static final class C38809 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38809(Continuation<? super C38809> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIDonate.this.new C38809(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38809) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> stateFlowIsShowingInputCustomValueOfRublesDialog = GUIDonate.this.getDonateViewModel().isShowingInputCustomValueOfRublesDialog();
                Lifecycle lifecycle = GUIDonate.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = androidx.lifecycle.FlowExtKt.flowWithLifecycle(stateFlowIsShowingInputCustomValueOfRublesDialog, lifecycle, Lifecycle.State.STARTED);
                final GUIDonate gUIDonate = GUIDonate.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.9.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                        DonateCustomDialog donateCustomDialog;
                        if (z && (donateCustomDialog = gUIDonate.dialogConfirmation) != null) {
                            donateCustomDialog.showInputCustomValueOfMoneyDialog();
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

    /* compiled from: GUIDonate.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$10", m7120f = "GUIDonate.kt", m7121i = {}, m7122l = {788}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$10 */
    /* loaded from: classes.dex */
    public static final class C386410 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C386410(Continuation<? super C386410> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIDonate.this.new C386410(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C386410) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Long> blockTimer = GUIDonate.this.getDonateViewModel().getBlockTimer();
                Lifecycle lifecycle = GUIDonate.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = androidx.lifecycle.FlowExtKt.flowWithLifecycle(blockTimer, lifecycle, Lifecycle.State.STARTED);
                final GUIDonate gUIDonate = GUIDonate.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.10.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).longValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(long j, @NotNull Continuation<? super Unit> continuation) {
                        gUIDonate.blockTimer = j;
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

    /* compiled from: GUIDonate.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$11", m7120f = "GUIDonate.kt", m7121i = {}, m7122l = {796}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$11 */
    /* loaded from: classes.dex */
    public static final class C386511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C386511(Continuation<? super C386511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIDonate.this.new C386511(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C386511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> showLastChanceBPBoostView = GUIDonate.this.getDonateViewModel().getShowLastChanceBPBoostView();
                Lifecycle lifecycle = GUIDonate.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = androidx.lifecycle.FlowExtKt.flowWithLifecycle(showLastChanceBPBoostView, lifecycle, Lifecycle.State.STARTED);
                final GUIDonate gUIDonate = GUIDonate.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.11.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                        if (z) {
                            ComposeView composeView = GUIDonate.access$getBinding(gUIDonate).composeViewFirstDonateFullScreen;
                            final GUIDonate gUIDonate2 = gUIDonate;
                            composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
                            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(100785024, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$11$1$1$1
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer, int i2) {
                                    if ((i2 & 11) != 2 || !composer.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(100785024, i2, -1, "com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GUIDonate.kt:800)");
                                        }
                                        long jColorResource = ColorResources_androidKt.colorResource(R.color.total_black_90, composer, 6);
                                        final GUIDonate gUIDonate3 = gUIDonate2;
                                        FakeDialogKt.m15089FakeDialog3IgeMak(null, jColorResource, ComposableLambdaKt.composableLambda(composer, -1773983732, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$11$1$1$1.1
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer2, int i3) {
                                                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1773983732, i3, -1, "com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GUIDonate.kt:801)");
                                                    }
                                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                    Alignment center = Alignment.INSTANCE.getCenter();
                                                    GUIDonate gUIDonate4 = gUIDonate3;
                                                    composer2.startReplaceableGroup(733328855);
                                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                                    composer2.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                                                    if (!(composer2.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer2.startReusableNode();
                                                    if (composer2.getInserting()) {
                                                        composer2.createNode(constructor);
                                                    } else {
                                                        composer2.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                                    composer2.startReplaceableGroup(2058660585);
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    BlackPassLastChanceUIKt.BlackPassLastChanceUI(gUIDonate4.getDonateViewModel(), gUIDonate4.getBlackPassMainViewModel(), composer2, 72);
                                                    composer2.endReplaceableGroup();
                                                    composer2.endNode();
                                                    composer2.endReplaceableGroup();
                                                    composer2.endReplaceableGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }
                                        }), composer, 384, 1);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer.skipToGroupEnd();
                                }
                            }));
                            composeView.setVisibility(0);
                        } else if (GUIDonate.access$getBinding(gUIDonate).composeViewFirstDonateFullScreen.getVisibility() != 8) {
                            ComposeView composeView2 = GUIDonate.access$getBinding(gUIDonate).composeViewFirstDonateFullScreen;
                            composeView2.setContent(ComposableSingletons$GUIDonateKt.INSTANCE.m14452getLambda1$app_siteRelease());
                            composeView2.setVisibility(8);
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

    /* compiled from: GUIDonate.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$12", m7120f = "GUIDonate.kt", m7121i = {}, m7122l = {830}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$12 */
    /* loaded from: classes.dex */
    public static final class C386712 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C386712(Continuation<? super C386712> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIDonate.this.new C386712(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C386712) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> showBoostLevelsHintBPView = GUIDonate.this.getDonateViewModel().getShowBoostLevelsHintBPView();
                Lifecycle lifecycle = GUIDonate.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = androidx.lifecycle.FlowExtKt.flowWithLifecycle(showBoostLevelsHintBPView, lifecycle, Lifecycle.State.STARTED);
                final GUIDonate gUIDonate = GUIDonate.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.12.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                        if (z) {
                            ComposeView composeView = GUIDonate.access$getBinding(gUIDonate).composeViewFirstDonateFullScreen;
                            final GUIDonate gUIDonate2 = gUIDonate;
                            composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
                            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1097950241, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$12$1$1$1
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer, int i2) {
                                    if ((i2 & 11) != 2 || !composer.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1097950241, i2, -1, "com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GUIDonate.kt:834)");
                                        }
                                        BlackPassBoostHintUIKt.BlackPassBoostHintUI(gUIDonate2.getBlackPassMainViewModel(), gUIDonate2.getDonateViewModel(), composer, 72);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer.skipToGroupEnd();
                                }
                            }));
                            composeView.setVisibility(0);
                        } else if (GUIDonate.access$getBinding(gUIDonate).composeViewFirstDonateFullScreen.getVisibility() != 8) {
                            ComposeView composeView2 = GUIDonate.access$getBinding(gUIDonate).composeViewFirstDonateFullScreen;
                            composeView2.setContent(ComposableSingletons$GUIDonateKt.INSTANCE.m14453getLambda2$app_siteRelease());
                            composeView2.setVisibility(8);
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

    /* compiled from: GUIDonate.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$13", m7120f = "GUIDonate.kt", m7121i = {}, m7122l = {859}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$13 */
    /* loaded from: classes.dex */
    public static final class C386813 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C386813(Continuation<? super C386813> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIDonate.this.new C386813(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C386813) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<PreviewPrize> previewPrize = GUIDonate.this.getDonateViewModel().getPreviewPrize();
                Lifecycle lifecycle = GUIDonate.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = androidx.lifecycle.FlowExtKt.flowWithLifecycle(previewPrize, lifecycle, Lifecycle.State.STARTED);
                final GUIDonate gUIDonate = GUIDonate.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.13.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PreviewPrize) obj2, (Continuation<? super Unit>) continuation);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
                    @Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(@NotNull final PreviewPrize previewPrize2, @NotNull Continuation<? super Unit> continuation) {
                        final int i2;
                        int typeOfAward = previewPrize2.getTypeOfAward();
                        if (typeOfAward != 0) {
                            i2 = typeOfAward != 3 ? typeOfAward != 4 ? 1 : 2 : 3;
                        }
                        ComposeView composeView = GUIDonate.access$getBinding(gUIDonate).composeViewSecondDonateFullScreen;
                        final GUIDonate gUIDonate2 = gUIDonate;
                        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
                        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-492322163, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$13$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i3) {
                                if ((i3 & 11) != 2 || !composer.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-492322163, i3, -1, "com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GUIDonate.kt:869)");
                                    }
                                    String name = previewPrize2.getName();
                                    int i4 = i2;
                                    CommonRarityEnum rarity = previewPrize2.getRarity();
                                    Bitmap image = previewPrize2.getImage();
                                    final PreviewPrize previewPrize3 = previewPrize2;
                                    final GUIDonate gUIDonate3 = gUIDonate2;
                                    PreviewRewardDialogUiKt.PreviewRewardDialogUi(name, i4, rarity, image, 0, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$13$1$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                            if (previewPrize3.getTypeOfAward() == 4) {
                                                gUIDonate3.getBlackPassMainViewModel().onTaskClick(new CommonTaskModel(false, previewPrize3.getId(), 0, null, null, 0, 0, null, null, null, 0, 2045, null));
                                                gUIDonate3.getDonateViewModel().closePreviewPrize();
                                            } else {
                                                gUIDonate3.getDonateViewModel().closePreviewPrize();
                                            }
                                        }
                                    }, composer, 4096, 16);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer.skipToGroupEnd();
                            }
                        }));
                        composeView.setVisibility(0);
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

    /* compiled from: GUIDonate.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$14", m7120f = "GUIDonate.kt", m7121i = {}, m7122l = {895}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$14 */
    /* loaded from: classes.dex */
    public static final class C387014 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C387014(Continuation<? super C387014> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIDonate.this.new C387014(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C387014) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<PreviewPrize> gettingPrize = GUIDonate.this.getDonateViewModel().getGettingPrize();
                Lifecycle lifecycle = GUIDonate.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = androidx.lifecycle.FlowExtKt.flowWithLifecycle(gettingPrize, lifecycle, Lifecycle.State.STARTED);
                final GUIDonate gUIDonate = GUIDonate.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.14.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PreviewPrize) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull PreviewPrize previewPrize, @NotNull Continuation<? super Unit> continuation) {
                        if (previewPrize.getTypeOfAward() == 0 || previewPrize.getTypeOfAward() == 4) {
                            gUIDonate.startActionForTypeOfInterface(previewPrize);
                        }
                        ComposeView composeView = GUIDonate.access$getBinding(gUIDonate).composeViewSecondDonateFullScreen;
                        composeView.setContent(ComposableSingletons$GUIDonateKt.INSTANCE.m14454getLambda3$app_siteRelease());
                        composeView.setVisibility(8);
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

    /* compiled from: GUIDonate.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$15", m7120f = "GUIDonate.kt", m7121i = {}, m7122l = {911}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$15 */
    /* loaded from: classes.dex */
    public static final class C387115 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C387115(Continuation<? super C387115> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIDonate.this.new C387115(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C387115) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<PrizeState> uiState = GUIDonate.this.getBlackPassPrizeListViewModel().getUiState();
                Lifecycle lifecycle = GUIDonate.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = androidx.lifecycle.FlowExtKt.flowWithLifecycle(uiState, lifecycle, Lifecycle.State.STARTED);
                final GUIDonate gUIDonate = GUIDonate.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.15.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PrizeState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull PrizeState prizeState, @NotNull Continuation<? super Unit> continuation) {
                        if (prizeState.isShowingDialog()) {
                            ComposeView composeView = GUIDonate.access$getBinding(gUIDonate).composeViewFirstDonateFullScreen;
                            final GUIDonate gUIDonate2 = gUIDonate;
                            if (composeView.getVisibility() == 8) {
                                composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-279816682, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$15$1$1$1
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                        invoke(composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer, int i2) {
                                        if ((i2 & 11) != 2 || !composer.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-279816682, i2, -1, "com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GUIDonate.kt:915)");
                                            }
                                            long jColorResource = ColorResources_androidKt.colorResource(R.color.black_60, composer, 6);
                                            final GUIDonate gUIDonate3 = gUIDonate2;
                                            FakeDialogKt.m15089FakeDialog3IgeMak(null, jColorResource, ComposableLambdaKt.composableLambda(composer, -304689910, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$setObservers$15$1$1$1.1
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                    invoke(composer2, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer2, int i3) {
                                                    if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-304689910, i3, -1, "com.blackhub.bronline.game.gui.donate.GUIDonate.setObservers.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GUIDonate.kt:918)");
                                                        }
                                                        BlackPassPrizeListUiKt.BlackPassPrizeListUi(null, gUIDonate3.getBlackPassPrizeListViewModel(), gUIDonate3.getDonateViewModel(), composer2, MpegAudioUtil.SAMPLES_PER_FRAME_L3_V2, 1);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer2.skipToGroupEnd();
                                                }
                                            }), composer, 384, 1);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer.skipToGroupEnd();
                                    }
                                }));
                                composeView.setVisibility(0);
                            }
                        } else {
                            ComposeView composeView2 = GUIDonate.access$getBinding(gUIDonate).composeViewFirstDonateFullScreen;
                            if (composeView2.getVisibility() == 0) {
                                composeView2.setContent(ComposableSingletons$GUIDonateKt.INSTANCE.m14455getLambda4$app_siteRelease());
                                composeView2.setVisibility(8);
                            }
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

    public final void startActionForTypeOfInterface(PreviewPrize prize) {
        if (prize.getFromInterface() == 0) {
            getBlackPassMainViewModel().getPrize(0, prize.getId(), prize.isPremium());
        }
    }

    public final void initDonateInterface() throws JSONException {
        int i = this.currentFragment;
        if (i == 9) {
            DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = this.headerAdapter;
            if (donateHeaderOrFooterAdapter != null) {
                donateHeaderOrFooterAdapter.deselectTab();
            }
            replaceFragment(UILayoutDonateDepositCoins.class, 9);
            return;
        }
        if (i != 14) {
            switch (i) {
                case 101:
                    replaceFragment(GUIBlackPassMain.class, 101);
                    getBlackPassMainViewModel().onClickSelectLayout(getBlackPassMainViewModel().getStartLayout().getValue().intValue());
                    DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter2 = this.headerAdapter;
                    if (donateHeaderOrFooterAdapter2 != null) {
                        donateHeaderOrFooterAdapter2.setBPTab();
                        break;
                    }
                    break;
                case 102:
                    getBlackPassMainViewModel().setStartLayout(4);
                    addFragment(GUIBlackPassMain.class, 4);
                    showOnlyBPActivate();
                    break;
                case 103:
                    replaceFragment(GUIBlackPassMain.class, 103);
                    showOnlyBpTasks();
                    DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter3 = this.headerAdapter;
                    if (donateHeaderOrFooterAdapter3 != null) {
                        donateHeaderOrFooterAdapter3.setBPTab();
                        break;
                    }
                    break;
                default:
                    replaceFragment(UILayoutDonateTile.class, 10);
                    if (this.currentPage == 92) {
                        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter4 = this.footerAdapter;
                        if (donateHeaderOrFooterAdapter4 != null) {
                            donateHeaderOrFooterAdapter4.setNewTab(4);
                        }
                        getDonateTileViewModel().showVIPPlatinumItems();
                    }
                    if (this.currentPage == 93) {
                        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter5 = this.footerAdapter;
                        if (donateHeaderOrFooterAdapter5 != null) {
                            donateHeaderOrFooterAdapter5.setNewTab(3);
                        }
                        getDonateTileViewModel().showPackGee();
                        break;
                    }
                    break;
            }
            return;
        }
        DonateMainViewModel.showNewFragment$default(getDonateViewModel(), 0, true, false, 4, null);
        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter6 = this.headerAdapter;
        if (donateHeaderOrFooterAdapter6 != null) {
            donateHeaderOrFooterAdapter6.setFirstTab();
        }
        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter7 = this.footerAdapter;
        if (donateHeaderOrFooterAdapter7 != null) {
            donateHeaderOrFooterAdapter7.deselectTab();
        }
        getDonateTileViewModel().setCurrentPage(6);
    }

    public final void showOnlyBPActivate() throws JSONException {
        getBlackPassMainViewModel().sendShowCurrentLayout(4);
    }

    public final void showOnlyBpTasks() throws JSONException {
        getBlackPassMainViewModel().sendShowCurrentLayout(1);
        getBlackPassMainViewModel().setStartLayout(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setValueOfRublesInView(int valueOfRubles) {
        ((DonateMainLayoutBinding) getBinding()).donateHeaderValueRub.setText(UsefulKt.getPriceWithSpaces(Integer.valueOf(valueOfRubles)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setValueOfCoinsInView(int valueOfCoins) {
        ((DonateMainLayoutBinding) getBinding()).donateHeaderValueBc.setText(UsefulKt.getPriceWithSpaces(Integer.valueOf(valueOfCoins)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showNewFragment(FragmentIDWithStatusOfReplay fragmentIDWithStatusOfReplay) {
        Class<? extends Fragment> currentClassOfFragment = getCurrentClassOfFragment(fragmentIDWithStatusOfReplay.getFragmentID());
        if (fragmentIDWithStatusOfReplay.getFragmentID() != 101) {
            ((DonateMainLayoutBinding) getBinding()).composeViewDonate.setVisibility(8);
        } else {
            ((DonateMainLayoutBinding) getBinding()).composeViewDonate.setVisibility(0);
        }
        if (getParentFragmentManager().findFragmentByTag(DonateDictionaryKt.getFragmentId(fragmentIDWithStatusOfReplay.getFragmentID())) == null) {
            if (fragmentIDWithStatusOfReplay.getIfReplace()) {
                replaceFragment(currentClassOfFragment, fragmentIDWithStatusOfReplay.getFragmentID());
            } else {
                addFragment(currentClassOfFragment, fragmentIDWithStatusOfReplay.getFragmentID());
            }
        }
    }

    public final Class<? extends Fragment> getCurrentClassOfFragment(int fragmentId) {
        if (fragmentId == 2) {
            return UILayoutDonatePreviewCar.class;
        }
        if (fragmentId == 101) {
            return GUIBlackPassMain.class;
        }
        if (fragmentId == 4 || fragmentId == 5) {
            return UILayoutDonatePreviewPack.class;
        }
        switch (fragmentId) {
            case 9:
                DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = this.headerAdapter;
                if (donateHeaderOrFooterAdapter != null) {
                    donateHeaderOrFooterAdapter.deselectTab();
                    break;
                }
                break;
        }
        return UILayoutDonatePreviewPack.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initHeaderPages() throws Resources.NotFoundException {
        List<HeaderOrFooterButtonObj> listEmptyList;
        String[] stringArray = getResources().getStringArray(R.array.donate_header_titles);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        if (stringArray.length == 4) {
            String str = stringArray[0];
            Intrinsics.checkNotNullExpressionValue(str, "get(...)");
            HeaderOrFooterButtonObj headerOrFooterButtonObj = new HeaderOrFooterButtonObj(str, 10, true);
            String str2 = stringArray[1];
            Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
            HeaderOrFooterButtonObj headerOrFooterButtonObj2 = new HeaderOrFooterButtonObj(str2, 11, false);
            String str3 = stringArray[2];
            Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
            HeaderOrFooterButtonObj headerOrFooterButtonObj3 = new HeaderOrFooterButtonObj(str3, 12, false);
            String str4 = stringArray[3];
            Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
            listEmptyList = CollectionsKt__CollectionsKt.listOf((Object[]) new HeaderOrFooterButtonObj[]{headerOrFooterButtonObj, headerOrFooterButtonObj2, headerOrFooterButtonObj3, new HeaderOrFooterButtonObj(str4, 13, false)});
        } else {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = new DonateHeaderOrFooterAdapter();
        donateHeaderOrFooterAdapter.initItemsList(true, listEmptyList);
        this.headerAdapter = donateHeaderOrFooterAdapter;
        initLayoutChangeListener();
        RecyclerView recyclerView = ((DonateMainLayoutBinding) getBinding()).donateHeaderRV;
        Intrinsics.checkNotNull(recyclerView);
        setInitParamsForRecyclerView(recyclerView, this.headerAdapter);
        recyclerView.setOutlineProvider(new ViewOutlineProvider() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$initHeaderPages$2$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(@Nullable View p0, @Nullable Outline p1) {
                FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                int iDpToPx = FloatExtensionKt.dpToPx(7.0f, fragmentActivityRequireActivity);
                if (p0 == null || p1 == null) {
                    return;
                }
                p1.setRoundRect(0, 0 - iDpToPx, p0.getWidth(), p0.getHeight(), iDpToPx);
            }
        });
    }

    public final void initLayoutChangeListener() {
        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = this.headerAdapter;
        if (donateHeaderOrFooterAdapter != null) {
            donateHeaderOrFooterAdapter.setButtonClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$initLayoutChangeListener$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) throws JSONException {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i) throws JSONException {
                    if (System.currentTimeMillis() - this.this$0.blockTimer > 1000) {
                        if (this.this$0.currentFragment == 9) {
                            this.this$0.getDepositCoinsViewModel().closeDepositCoinsFragment(true);
                        }
                        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter2 = this.this$0.headerAdapter;
                        if (donateHeaderOrFooterAdapter2 != null) {
                            donateHeaderOrFooterAdapter2.setNewTab(i);
                            return;
                        }
                        return;
                    }
                    GUIDonate gUIDonate = this.this$0;
                    String string = gUIDonate.getString(R.string.donate_error_message_if_blocked_change_of_pages_or_tab);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    gUIDonate.showErrorMessage(string);
                }
            });
            donateHeaderOrFooterAdapter.setLayoutOrPageClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$initLayoutChangeListener$1$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) throws JSONException {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i) throws JSONException {
                    if (this.this$0.currentFragment == 9) {
                        this.this$0.getDepositCoinsViewModel().closeDepositCoinsFragment(true);
                    }
                    switch (i) {
                        case 10:
                            Group groupFooter = GUIDonate.access$getBinding(this.this$0).groupFooter;
                            Intrinsics.checkNotNullExpressionValue(groupFooter, "groupFooter");
                            groupFooter.setVisibility(0);
                            DonateMainViewModel.showNewFragment$default(this.this$0.getDonateViewModel(), 10, true, false, 4, null);
                            this.this$0.setFirstTabForTilePage();
                            break;
                        case 11:
                            Group groupFooter2 = GUIDonate.access$getBinding(this.this$0).groupFooter;
                            Intrinsics.checkNotNullExpressionValue(groupFooter2, "groupFooter");
                            groupFooter2.setVisibility(8);
                            DonateMainViewModel.showNewFragment$default(this.this$0.getDonateViewModel(), 11, true, false, 4, null);
                            break;
                        case 12:
                            Group groupFooter3 = GUIDonate.access$getBinding(this.this$0).groupFooter;
                            Intrinsics.checkNotNullExpressionValue(groupFooter3, "groupFooter");
                            groupFooter3.setVisibility(8);
                            this.this$0.getBlackPassMainViewModel().onClickSelectLayout(0);
                            this.this$0.getBlackPassMainViewModel().sendShowCurrentLayout(0);
                            this.this$0.getBlackPassMainViewModel().setStartLayout(0);
                            DonateMainViewModel.showNewFragment$default(this.this$0.getDonateViewModel(), 101, true, false, 4, null);
                            break;
                        case 13:
                            Group groupFooter4 = GUIDonate.access$getBinding(this.this$0).groupFooter;
                            Intrinsics.checkNotNullExpressionValue(groupFooter4, "groupFooter");
                            groupFooter4.setVisibility(8);
                            this.this$0.getDonateViewModel().openHeaderBoxes();
                            this.this$0.closeDialog();
                            break;
                    }
                }
            });
        }
    }

    public final void setFirstTabForTilePage() {
        getDonateTileViewModel().setCurrentPage(0);
        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = this.footerAdapter;
        if (donateHeaderOrFooterAdapter != null) {
            donateHeaderOrFooterAdapter.setFirstTab();
        }
    }

    public final void replaceFragment(Class<? extends Fragment> fragment, int fragmentId) {
        getChildFragmentManager().beginTransaction().replace(R.id.donate_body_container, fragment, null, DonateDictionaryKt.getFragmentId(fragmentId)).commit();
    }

    public final void addFragment(Class<? extends Fragment> fragment, int fragmentId) {
        getChildFragmentManager().beginTransaction().addToBackStack(fragment.toString()).add(R.id.donate_body_container, fragment, null, DonateDictionaryKt.getFragmentId(fragmentId)).commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initFooterPages() throws Resources.NotFoundException {
        List<HeaderOrFooterButtonObj> listEmptyList;
        String[] stringArray = getResources().getStringArray(R.array.donate_footer_titles);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        if (stringArray.length == 6) {
            String str = stringArray[0];
            Intrinsics.checkNotNullExpressionValue(str, "get(...)");
            HeaderOrFooterButtonObj headerOrFooterButtonObj = new HeaderOrFooterButtonObj(str, 0, true);
            String str2 = stringArray[1];
            Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
            HeaderOrFooterButtonObj headerOrFooterButtonObj2 = new HeaderOrFooterButtonObj(str2, 1, false);
            String str3 = stringArray[2];
            Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
            HeaderOrFooterButtonObj headerOrFooterButtonObj3 = new HeaderOrFooterButtonObj(str3, 2, false);
            String str4 = stringArray[3];
            Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
            HeaderOrFooterButtonObj headerOrFooterButtonObj4 = new HeaderOrFooterButtonObj(str4, 3, false);
            String str5 = stringArray[4];
            Intrinsics.checkNotNullExpressionValue(str5, "get(...)");
            HeaderOrFooterButtonObj headerOrFooterButtonObj5 = new HeaderOrFooterButtonObj(str5, 4, false);
            String str6 = stringArray[5];
            Intrinsics.checkNotNullExpressionValue(str6, "get(...)");
            listEmptyList = CollectionsKt__CollectionsKt.listOf((Object[]) new HeaderOrFooterButtonObj[]{headerOrFooterButtonObj, headerOrFooterButtonObj2, headerOrFooterButtonObj3, headerOrFooterButtonObj4, headerOrFooterButtonObj5, new HeaderOrFooterButtonObj(str6, 11, false)});
        } else {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = new DonateHeaderOrFooterAdapter();
        donateHeaderOrFooterAdapter.initItemsList(false, listEmptyList);
        this.footerAdapter = donateHeaderOrFooterAdapter;
        initPageChangeListener();
        RecyclerView recyclerView = ((DonateMainLayoutBinding) getBinding()).donateFooterRV;
        Intrinsics.checkNotNull(recyclerView);
        setInitParamsForRecyclerView(recyclerView, this.footerAdapter);
        recyclerView.setOutlineProvider(new ViewOutlineProvider() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$initFooterPages$2$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(@Nullable View p0, @Nullable Outline p1) {
                FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                int iDpToPx = FloatExtensionKt.dpToPx(7.0f, fragmentActivityRequireActivity);
                if (p0 == null || p1 == null) {
                    return;
                }
                p1.setRoundRect(0, 0, p0.getWidth(), p0.getHeight() + iDpToPx, iDpToPx);
            }
        });
    }

    public final void initPageChangeListener() {
        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = this.footerAdapter;
        if (donateHeaderOrFooterAdapter != null) {
            donateHeaderOrFooterAdapter.setButtonClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$initPageChangeListener$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) throws JSONException {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i) throws JSONException {
                    if (this.this$0.getDepositCoinsViewModel().isShowFragment().getValue().booleanValue()) {
                        this.this$0.getDepositCoinsViewModel().closeDepositCoinsFragment(true);
                        this.this$0.getDonateViewModel().showNewFragment(10, false, true);
                    }
                    if (System.currentTimeMillis() - this.this$0.blockTimer > 1000) {
                        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter2 = this.this$0.footerAdapter;
                        if (donateHeaderOrFooterAdapter2 != null) {
                            donateHeaderOrFooterAdapter2.setNewTab(i);
                            return;
                        }
                        return;
                    }
                    GUIDonate gUIDonate = this.this$0;
                    String string = gUIDonate.getString(R.string.donate_error_message_if_blocked_change_of_pages_or_tab);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    gUIDonate.showErrorMessage(string);
                }
            });
            donateHeaderOrFooterAdapter.setLayoutOrPageClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$initPageChangeListener$1$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) throws JSONException {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i) throws JSONException {
                    if (this.this$0.getDepositCoinsViewModel().isShowFragment().getValue().booleanValue()) {
                        this.this$0.getDepositCoinsViewModel().closeDepositCoinsFragment(true);
                        this.this$0.getDonateViewModel().showNewFragment(10, false, true);
                    }
                    if (!this.this$0.ifEmptyDonateItemsFromJSON) {
                        this.this$0.getDonateTileViewModel().setCurrentPage(i);
                    } else {
                        this.this$0.showMainError();
                    }
                }
            });
        }
    }

    public final void showMainError() throws JSONException {
        DonateMainViewModel donateViewModel = getDonateViewModel();
        String string = getString(R.string.donate_main_error_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(R.string.donate_main_error_body);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        donateViewModel.showLocalError(9, string, string2);
    }

    public final void setInitParamsForRecyclerView(RecyclerView currentRecyclerView, final RecyclerView.Adapter<? extends RecyclerView.ViewHolder> currentAdapter) {
        currentRecyclerView.setAdapter(currentAdapter);
        final FragmentActivity fragmentActivityRequireActivity = requireActivity();
        currentRecyclerView.setLayoutManager(new LinearLayoutManager(fragmentActivityRequireActivity) { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$setInitParamsForRecyclerView$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean checkLayoutParams(@NotNull RecyclerView.LayoutParams lp) {
                Intrinsics.checkNotNullParameter(lp, "lp");
                int width = getWidth();
                RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter = currentAdapter;
                Intrinsics.checkNotNull(adapter);
                ((ViewGroup.MarginLayoutParams) lp).width = width / adapter.getSizeInv();
                return super.checkLayoutParams(lp);
            }
        });
        currentRecyclerView.setClipToOutline(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initListeners() {
        DonateMainLayoutBinding donateMainLayoutBinding = (DonateMainLayoutBinding) getBinding();
        donateMainLayoutBinding.donateHeaderLeft.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                GUIDonate.initListeners$lambda$20$lambda$16(this.f$0, view);
            }
        });
        donateMainLayoutBinding.donateHeaderRight.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                GUIDonate.initListeners$lambda$20$lambda$17(this.f$0, view);
            }
        });
        donateMainLayoutBinding.donateFooterLeft.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                GUIDonate.initListeners$lambda$20$lambda$18(this.f$0, view);
            }
        });
        donateMainLayoutBinding.donateFooterRight.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                GUIDonate.initListeners$lambda$20$lambda$19(this.f$0, view);
            }
        });
        ImageButton donateButtonExit = donateMainLayoutBinding.donateButtonExit;
        Intrinsics.checkNotNullExpressionValue(donateButtonExit, "donateButtonExit");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, donateButtonExit, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$initListeners$1$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws JSONException {
                this.this$0.closeDialog();
            }
        }, 1, null);
        ImageButton donateHeaderButtonBc = donateMainLayoutBinding.donateHeaderButtonBc;
        Intrinsics.checkNotNullExpressionValue(donateHeaderButtonBc, "donateHeaderButtonBc");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, donateHeaderButtonBc, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$initListeners$1$6
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
                if (this.this$0.currentFragment != 9) {
                    this.this$0.onCLickBpButton();
                }
            }
        }, 1, null);
        ImageButton donateHeaderButtonRub = donateMainLayoutBinding.donateHeaderButtonRub;
        Intrinsics.checkNotNullExpressionValue(donateHeaderButtonRub, "donateHeaderButtonRub");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, donateHeaderButtonRub, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$initListeners$1$7
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
                if (this.this$0.currentFragment == 9) {
                    this.this$0.getDepositCoinsViewModel().closeDepositCoinsFragment(true);
                }
                if (this.this$0.currentFragment != 0) {
                    DonateMainViewModel.showNewFragment$default(this.this$0.getDonateViewModel(), 0, true, false, 4, null);
                    DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = this.this$0.headerAdapter;
                    if (donateHeaderOrFooterAdapter != null) {
                        donateHeaderOrFooterAdapter.setFirstTab();
                    }
                }
                DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter2 = this.this$0.footerAdapter;
                if (donateHeaderOrFooterAdapter2 != null) {
                    donateHeaderOrFooterAdapter2.deselectTab();
                }
                this.this$0.getDonateTileViewModel().setCurrentPage(6);
            }
        }, 1, null);
    }

    public static final void initListeners$lambda$20$lambda$16(GUIDonate this$0, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (System.currentTimeMillis() - this$0.blockTimer > 500) {
            this$0.blockTimer = System.currentTimeMillis();
            DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = this$0.headerAdapter;
            if (donateHeaderOrFooterAdapter != null) {
                donateHeaderOrFooterAdapter.previousTab();
                return;
            }
            return;
        }
        String string = this$0.getString(R.string.donate_error_message_if_blocked_change_of_pages_or_tab);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this$0.showErrorMessage(string);
    }

    public static final void initListeners$lambda$20$lambda$17(GUIDonate this$0, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (System.currentTimeMillis() - this$0.blockTimer > 500) {
            this$0.blockTimer = System.currentTimeMillis();
            DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = this$0.headerAdapter;
            if (donateHeaderOrFooterAdapter != null) {
                donateHeaderOrFooterAdapter.nextTab();
                return;
            }
            return;
        }
        String string = this$0.getString(R.string.donate_error_message_if_blocked_change_of_pages_or_tab);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this$0.showErrorMessage(string);
    }

    public static final void initListeners$lambda$20$lambda$18(GUIDonate this$0, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (System.currentTimeMillis() - this$0.blockTimer > 500) {
            this$0.blockTimer = System.currentTimeMillis();
            DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = this$0.footerAdapter;
            if (donateHeaderOrFooterAdapter != null) {
                donateHeaderOrFooterAdapter.previousTab();
                return;
            }
            return;
        }
        String string = this$0.getString(R.string.donate_error_message_if_blocked_change_of_pages_or_tab);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this$0.showErrorMessage(string);
    }

    public static final void initListeners$lambda$20$lambda$19(GUIDonate this$0, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (System.currentTimeMillis() - this$0.blockTimer > 500) {
            this$0.blockTimer = System.currentTimeMillis();
            DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = this$0.footerAdapter;
            if (donateHeaderOrFooterAdapter != null) {
                donateHeaderOrFooterAdapter.nextTab();
                return;
            }
            return;
        }
        String string = this$0.getString(R.string.donate_error_message_if_blocked_change_of_pages_or_tab);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this$0.showErrorMessage(string);
    }

    public final void showErrorMessage(String newMessage) throws JSONException {
        if (System.currentTimeMillis() - this.blockMessageTimer > 1000) {
            this.blockMessageTimer = System.currentTimeMillis();
            getDonateViewModel().showErrorMessage(newMessage);
        }
    }

    public final void closeDialog() throws JSONException {
        getDonateViewModel().closeDialog();
        closeFragment();
    }

    private final void setNullableParameters() {
        DonateCustomDialog donateCustomDialog = this.dialogConfirmation;
        if (donateCustomDialog != null) {
            donateCustomDialog.dismissDialog();
        }
        getBlackPassMainViewModel().clearData();
        getBlackPassPrizeListViewModel().clearData();
        getDonateTileViewModel().clearData();
        this.headerAdapter = null;
        this.footerAdapter = null;
        this.jsonObject = null;
        this.dialogConfirmation = null;
        this.timeoutRunnable = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCLickBpButton() {
        Group groupFooter = ((DonateMainLayoutBinding) getBinding()).groupFooter;
        Intrinsics.checkNotNullExpressionValue(groupFooter, "groupFooter");
        groupFooter.setVisibility(0);
        DonateMainViewModel.showNewFragment$default(getDonateViewModel(), 10, true, false, 4, null);
        DonateMainViewModel.showNewFragment$default(getDonateViewModel(), 9, false, false, 4, null);
        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = this.headerAdapter;
        if (donateHeaderOrFooterAdapter != null) {
            donateHeaderOrFooterAdapter.setFirstTab();
        }
        DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter2 = this.footerAdapter;
        if (donateHeaderOrFooterAdapter2 != null) {
            donateHeaderOrFooterAdapter2.deselectTab();
        }
        getDonateTileViewModel().setCurrentPage(12);
    }

    public GUIDonate() {
        final Function0 function0 = null;
        this.mainActivityViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(JNIActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$mainActivityViewModel$2
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
        Function0<ViewModelProvider.Factory> function02 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$donateViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                GUIDonate gUIDonate = this.this$0;
                return (ViewModelProvider.Factory) new ViewModelProvider(gUIDonate, gUIDonate.getDonateFactory()).get(DonateMainViewModel.class);
            }
        };
        final Function0<Fragment> function03 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$2
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
        this.donateViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$4
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
        Function0<ViewModelProvider.Factory> function04 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$donateTileViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                GUIDonate gUIDonate = this.this$0;
                return (ViewModelProvider.Factory) new ViewModelProvider(gUIDonate, gUIDonate.getDonateTileFactory()).get(DonateTileViewModel.class);
            }
        };
        final Function0<Fragment> function05 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$6
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
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function05.invoke();
            }
        });
        this.donateTileViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateTileViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function06 = function0;
                if (function06 != null && (creationExtras = (CreationExtras) function06.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function04);
        final Function0<ViewModelStoreOwner> function06 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$depositCoinsViewModel$2
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
        Function0<ViewModelProvider.Factory> function07 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$depositCoinsViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getDepositCoinsFactory();
            }
        };
        final Lazy lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$11
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function06.invoke();
            }
        });
        this.depositCoinsViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateDepositCoinsViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$12
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy3).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$13
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function08 = function0;
                if (function08 != null && (creationExtras = (CreationExtras) function08.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function07);
        Function0<ViewModelProvider.Factory> function08 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$serviceViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                GUIDonate gUIDonate = this.this$0;
                return (ViewModelProvider.Factory) new ViewModelProvider(gUIDonate, gUIDonate.getDonateServiceFactory()).get(DonateServiceViewModel.class);
            }
        };
        final Function0<Fragment> function09 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$15
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
        final Lazy lazy4 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$16
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function09.invoke();
            }
        });
        this.serviceViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateServiceViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$17
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy4).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$18
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function010 = function0;
                if (function010 != null && (creationExtras = (CreationExtras) function010.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy4);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function08);
        final Function0<ViewModelStoreOwner> function010 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$blackPassMainViewModel$2
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
        Function0<ViewModelProvider.Factory> function011 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$blackPassMainViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getBlackPassMainFactory();
            }
        };
        final Lazy lazy5 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$20
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function010.invoke();
            }
        });
        this.blackPassMainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BlackPassMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$21
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy5).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$22
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function012 = function0;
                if (function012 != null && (creationExtras = (CreationExtras) function012.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy5);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function011);
        final Function0<ViewModelStoreOwner> function012 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$blackPassActivateViewModel$2
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
        Function0<ViewModelProvider.Factory> function013 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$blackPassActivateViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getBlackPassActivateFactory();
            }
        };
        final Lazy lazy6 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$24
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function012.invoke();
            }
        });
        this.blackPassActivateViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BlackPassActivateViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$25
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy6).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$26
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function014 = function0;
                if (function014 != null && (creationExtras = (CreationExtras) function014.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy6);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function013);
        final Function0<ViewModelStoreOwner> function014 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$blackPassPrizeListViewModel$2
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
        Function0<ViewModelProvider.Factory> function015 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$blackPassPrizeListViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getBlackPassPrizeListFactory();
            }
        };
        final Lazy lazy7 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$28
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function014.invoke();
            }
        });
        this.blackPassPrizeListViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BlackPassPrizeListViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$29
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy7).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.GUIDonate$special$$inlined$viewModels$default$30
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function016 = function0;
                if (function016 != null && (creationExtras = (CreationExtras) function016.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy7);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function015);
    }
}

