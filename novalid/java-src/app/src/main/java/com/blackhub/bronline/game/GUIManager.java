package com.blackhub.bronline.game;

import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.android.billingclient.api.BillingFlowParams;
import com.blackhub.bronline.common.MarketAnalytic;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.JNIJSONTransport;
import com.blackhub.bronline.game.core.OnChangeFragmentListener;
import com.blackhub.bronline.game.core.constants.LogTagConstants;
import com.blackhub.bronline.game.core.constants.NativeConstants;
import com.blackhub.bronline.game.core.constants.Other;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.game.core.preferences.Preferences;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.activetask.ActiveTaskGuiFragment;
import com.blackhub.bronline.game.gui.admintools.AdminToolsGuiFragment;
import com.blackhub.bronline.game.gui.blackpassbanner.BlackPassBannerComposeGUIFragment;
import com.blackhub.bronline.game.gui.bprewards.BpRewardsGuiFragment;
import com.blackhub.bronline.game.gui.brdialogwindow.BrDialogWindow;
import com.blackhub.bronline.game.gui.brsimbanner.BrSimBannerComposeGUIFragment;
import com.blackhub.bronline.game.gui.calendar.CalendarGUIFragment;
import com.blackhub.bronline.game.gui.cases.CasesGUIFragment;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerGUIFragment;
import com.blackhub.bronline.game.gui.chat.ChatGuiFragment;
import com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment;
import com.blackhub.bronline.game.gui.clicker.ClickerGuiFragment;
import com.blackhub.bronline.game.gui.craft.CraftGuiFragment;
import com.blackhub.bronline.game.gui.donate.GUIDonate;
import com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool;
import com.blackhub.bronline.game.gui.electric.ElectricGuiFragment;
import com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem;
import com.blackhub.bronline.game.gui.entertainmentsystem.p014ui.GUIEntertainmentSystemFinalWindow;
import com.blackhub.bronline.game.gui.familysystem.GUIFamilySystem;
import com.blackhub.bronline.game.gui.fishing.FishingGUIFragment;
import com.blackhub.bronline.game.gui.fractions.GUIFractionSystem;
import com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill;
import com.blackhub.bronline.game.gui.gasmangame.p015ui.GUIGasmanGame;
import com.blackhub.bronline.game.gui.gifts.GiftsGuiFragment;
import com.blackhub.bronline.game.gui.halloweenaward.HalloweenAwardGuiFragment;
import com.blackhub.bronline.game.gui.holidayevents.HolidayEventsGuiFragment;
import com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcGUIFragment;
import com.blackhub.bronline.game.gui.inventory.GUICarsTrunkOrCloset;
import com.blackhub.bronline.game.gui.inventory.GUIUsersInventory;
import com.blackhub.bronline.game.gui.legacy.BrAudioDialog;
import com.blackhub.bronline.game.gui.legacy.BrDialogDance;
import com.blackhub.bronline.game.gui.legacy.BrDialogDiner;
import com.blackhub.bronline.game.gui.legacy.BrDialogHack;
import com.blackhub.bronline.game.gui.legacy.BrDialogPipes;
import com.blackhub.bronline.game.gui.legacy.BrDialogRobbery;
import com.blackhub.bronline.game.gui.legacy.BrDialogSawmill;
import com.blackhub.bronline.game.gui.legacy.BrDialogWires;
import com.blackhub.bronline.game.gui.legacy.BrFingerPrintDialog;
import com.blackhub.bronline.game.gui.legacy.BrNewCaptcha;
import com.blackhub.bronline.game.gui.marketplace.MarketplaceGuiFragment;
import com.blackhub.bronline.game.gui.menu.MenuComposeGUIFragment;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.blackhub.bronline.game.gui.menupausesettingandmap.p016ui.MenuSettingMainUiFragment;
import com.blackhub.bronline.game.gui.minigameevents.GUIMiniGameEventsGame;
import com.blackhub.bronline.game.gui.moduledialog.ModuleDialogGuiFragment;
import com.blackhub.bronline.game.gui.notification.GUINotificationNewStyle;
import com.blackhub.bronline.game.gui.notification.utils.NotificationKeys;
import com.blackhub.bronline.game.gui.panelinfo.PanelInfoGuiFragment;
import com.blackhub.bronline.game.gui.plates.PlatesGuiFragment;
import com.blackhub.bronline.game.gui.playerslist.GUIPlayersList;
import com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar;
import com.blackhub.bronline.game.gui.rateapp.RateAppComposeGUIFragment;
import com.blackhub.bronline.game.gui.rating.RatingGuiFragment;
import com.blackhub.bronline.game.gui.registration.GUIRegistration;
import com.blackhub.bronline.game.gui.rent.RentGuiFragment;
import com.blackhub.bronline.game.gui.smieditor.GUISmiEditor;
import com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction;
import com.blackhub.bronline.game.gui.socialnetworklink.GUISocialNetworkLink;
import com.blackhub.bronline.game.gui.socialnetworklink.SocialNetworkLinkUtils;
import com.blackhub.bronline.game.gui.spawnlocation.GUISpawnLocation;
import com.blackhub.bronline.game.gui.tanpinbanner.TanpinBannerGuiFragment;
import com.blackhub.bronline.game.gui.taxi.TaxiFragment;
import com.blackhub.bronline.game.gui.taximap.TaxiMapFragment;
import com.blackhub.bronline.game.gui.taxiorder.TaxiOrderFragment;
import com.blackhub.bronline.game.gui.taxirating.TaxiRatingFragment;
import com.blackhub.bronline.game.gui.tuning.GUITuning;
import com.blackhub.bronline.game.gui.tutorialhints.TutorialGuiFragment;
import com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventGuiFragment;
import com.blackhub.bronline.game.gui.videoplayer.VideoPlayerGuiFragment;
import com.blackhub.bronline.game.gui.vipaccount.GUIVipAccount;
import com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem;
import com.blackhub.bronline.game.gui.youtubeplayer.YotubePlayerFragment;
import com.blackhub.bronline.launcher.LauncherConstants;
import com.bless.client.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallations;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.StartupParamsCallback;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GUIManager.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0005J\u001a\u0010\u0017\u001a\u00020\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0019\u001a\u00020\u0005J\u0010\u0010\u001a\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\nJ\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u000e\u0010 \u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0005J\u0018\u0010!\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0018\u0010\"\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0018\u0010#\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\nH\u0002J\b\u0010$\u001a\u00020\u0006H\u0002J\u000e\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0006J\u0006\u0010'\u001a\u00020\u0006J\u0006\u0010(\u001a\u00020\u0013J\u0015\u0010)\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010*J\u000e\u0010+\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0005J\u001a\u0010,\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0016\u0010/\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\nJ\u0006\u00100\u001a\u00020\u0013J\u0018\u00101\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0010\u00102\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0010\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u0005H\u0002J\u0010\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u000207H\u0002J\u0016\u00108\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\nJ\u0018\u00109\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0016\u0010:\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\nJ\u0018\u0010;\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00052\b\u0010<\u001a\u0004\u0018\u00010\u0011R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, m7105d2 = {"Lcom/blackhub/bronline/game/GUIManager;", "Lcom/blackhub/bronline/game/core/OnChangeFragmentListener;", "()V", "isOpenScreen", "", "", "", "jsonCache", "Landroid/util/SparseArray;", "Ljava/util/ArrayList;", "Lorg/json/JSONObject;", "Lkotlin/collections/ArrayList;", "screenIsWithTouches", "", "[Ljava/lang/Integer;", "screensIsFragment", "showingScreen", "Lcom/blackhub/bronline/game/ISAMPGUI;", "closeAllWindows", "", "closeAllWindowsExSAMP", "closeFragment", "fragmentConst", "closeGUI", "json", "screenId", "closeSAMPWindow", "closingScreen", "createGuiFromId", "id", "getFragmentTag", "", "getGUIs", "handleFragmentScreen", "handleNotificationScreen", "handleOtherScreen", "isNewHud", "isShowingKeyboard", "isShowing", "isShowingScreens", "migrateNotifications", "newBackPressed", "(Ljava/lang/Integer;)V", "notifyGUIClosed", "onFragmentChange", "currentBundle", "Landroid/os/Bundle;", "onPacketIncoming", "onSpawn", "openingScreen", "prepareJsonForTypeOfInterface", "sendAppMetricaProfileId", BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID, "sendFirebaseInstallationsIdAndAppMetricaDeviceId", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Lcom/blackhub/bronline/game/core/JNIActivity;", "sendJsonData", "showCurrentGUI", "showGUI", "updateStack", "gui", "Companion", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nGUIManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIManager.kt\ncom/blackhub/bronline/game/GUIManager\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1272:1\n215#2,2:1273\n215#2,2:1275\n215#2,2:1277\n*S KotlinDebug\n*F\n+ 1 GUIManager.kt\ncom/blackhub/bronline/game/GUIManager\n*L\n732#1:1273,2\n843#1:1275,2\n859#1:1277,2\n*E\n"})
/* loaded from: classes3.dex */
public final class GUIManager implements OnChangeFragmentListener {

    @Nullable
    public static GUIManager mManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public final Map<Integer, ISAMPGUI> showingScreen = new LinkedHashMap();

    @NotNull
    public Map<Integer, Boolean> isOpenScreen = new LinkedHashMap();

    @NotNull
    public final SparseArray<ArrayList<JSONObject>> jsonCache = new SparseArray<>();

    @NotNull
    public final Integer[] screenIsWithTouches = {13, 65, 39};

    @NotNull
    public final Integer[] screensIsFragment = {49, 34, 33, 24, 28, 36, 45, 46, 50, 30, 14, 16, 18, 17, 25, 39, 35, 47, 52, 40, 27, 37, 22, 42, 43, 2, 56, 57, 61, 21, 63, 64, 65, 58, 59, 38, 66, 68, 67, 69, 70, 6, 1, 72, 71, 73, 74, 75, 76, 77, 11, 79, 80, 81, 82};

    @NotNull
    public static final GUIManager getInstance() {
        return INSTANCE.getInstance();
    }

    @JvmStatic
    public static final void setGUIManagerNull() {
        INSTANCE.setGUIManagerNull();
    }

    /* compiled from: GUIManager.kt */
    @Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m7105d2 = {"Lcom/blackhub/bronline/game/GUIManager$Companion;", "", "()V", "instance", "Lcom/blackhub/bronline/game/GUIManager;", "getInstance$annotations", "getInstance", "()Lcom/blackhub/bronline/game/GUIManager;", "mManager", "setGUIManagerNull", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        public Companion() {
        }

        @JvmStatic
        public final void setGUIManagerNull() {
            GUIManager.mManager = null;
        }

        @NotNull
        public final GUIManager getInstance() {
            if (GUIManager.mManager == null) {
                GUIManager.mManager = new GUIManager();
            }
            GUIManager gUIManager = GUIManager.mManager;
            Intrinsics.checkNotNull(gUIManager, "null cannot be cast to non-null type com.blackhub.bronline.game.GUIManager");
            return gUIManager;
        }
    }

    @Override // com.blackhub.bronline.game.core.OnChangeFragmentListener
    public void onFragmentChange(int fragmentConst, @Nullable Bundle currentBundle) {
        FragmentManager supportFragmentManager;
        JNIActivity context = JNIActivity.getContext();
        FragmentTransaction fragmentTransactionBeginTransaction = (context == null || (supportFragmentManager = context.getSupportFragmentManager()) == null) ? null : supportFragmentManager.beginTransaction();
        String fragmentTag = getFragmentTag(fragmentConst);
        if (fragmentTransactionBeginTransaction != null) {
            switch (fragmentConst) {
                case 1:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, PlatesGuiFragment.class, currentBundle, fragmentTag);
                    break;
                case 2:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, GUIFuelFill.class, currentBundle, fragmentTag);
                    break;
                case 6:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, RentGuiFragment.class, currentBundle, fragmentTag);
                    break;
                case 11:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, ChooseServerGuiFragment.class, currentBundle, fragmentTag);
                    break;
                case 13:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_notification_container, GUINotificationNewStyle.class, currentBundle, fragmentTag);
                    break;
                case 14:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, MenuComposeGUIFragment.class, currentBundle, fragmentTag);
                    break;
                case 16:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, TaxiFragment.class, currentBundle, fragmentTag);
                    break;
                case 17:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, TaxiOrderFragment.class, currentBundle, fragmentTag);
                    break;
                case 18:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, TaxiRatingFragment.class, currentBundle, fragmentTag);
                    break;
                case 21:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, TaxiMapFragment.class, currentBundle, fragmentTag);
                    break;
                case 22:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, GUIDonate.class, currentBundle, fragmentTag);
                    break;
                case 24:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, GUISmiEditor.class, currentBundle, fragmentTag);
                    break;
                case 25:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, GUIPlayersList.class, currentBundle, fragmentTag);
                    break;
                case 27:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, GUIRadialMenuForCar.class, currentBundle, fragmentTag);
                    break;
                case 28:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, GUITuning.class, currentBundle, fragmentTag);
                    break;
                case 30:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, HolidayEventsGuiFragment.class, currentBundle, fragmentTag);
                    break;
                case 33:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, GUIUsersInventory.class, currentBundle, fragmentTag);
                    break;
                case 34:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, GUICarsTrunkOrCloset.class, currentBundle, fragmentTag);
                    break;
                case 35:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, BlackPassBannerComposeGUIFragment.class, currentBundle, fragmentTag);
                    break;
                case 36:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, GUISocialInteraction.class, currentBundle, fragmentTag);
                    break;
                case 37:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, GUIDrivingSchool.class, currentBundle, fragmentTag);
                    break;
                case 38:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, GUIRegistration.class, currentBundle, fragmentTag);
                    break;
                case 39:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, TutorialGuiFragment.class, currentBundle, fragmentTag);
                    break;
                case 40:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, GUIWoundSystem.class, currentBundle, fragmentTag);
                    break;
                case 42:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, GUIEntertainmentSystem.class, currentBundle, fragmentTag);
                    break;
                case 43:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, GUIEntertainmentSystemFinalWindow.class, currentBundle, fragmentTag);
                    break;
                case 45:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, GUIFamilySystem.class, currentBundle, fragmentTag);
                    break;
                case 46:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, GUIFractionSystem.class, currentBundle, fragmentTag);
                    break;
                case 47:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, MenuSettingMainUiFragment.class, currentBundle, fragmentTag);
                    break;
                case 49:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, CraftGuiFragment.class, currentBundle, fragmentTag);
                    break;
                case 50:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, GUISpawnLocation.class, currentBundle, fragmentTag);
                    break;
                case 52:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, GUISocialNetworkLink.class, currentBundle, fragmentTag);
                    break;
                case 56:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, ElectricGuiFragment.class, currentBundle, fragmentTag);
                    break;
                case 57:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, CatchStreamerGUIFragment.class, currentBundle, fragmentTag);
                    break;
                case 58:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, GUIGasmanGame.class, currentBundle, fragmentTag);
                    break;
                case 59:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, FishingGUIFragment.class, currentBundle, fragmentTag);
                    break;
                case 61:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, YotubePlayerFragment.class, currentBundle, fragmentTag);
                    break;
                case 63:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, InteractionWithNpcGUIFragment.class, currentBundle, fragmentTag);
                    break;
                case 64:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, HalloweenAwardGuiFragment.class, currentBundle, fragmentTag);
                    break;
                case 65:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, ActiveTaskGuiFragment.class, currentBundle, fragmentTag);
                    break;
                case 66:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, AdminToolsGuiFragment.class, currentBundle, fragmentTag);
                    break;
                case 67:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, BrSimBannerComposeGUIFragment.class, currentBundle, fragmentTag);
                    break;
                case 68:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, UpgradeObjectEventGuiFragment.class, currentBundle, fragmentTag);
                    break;
                case 69:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, GiftsGuiFragment.class, currentBundle, fragmentTag);
                    break;
                case 70:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, PanelInfoGuiFragment.class, currentBundle, fragmentTag);
                    break;
                case 71:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, CalendarGUIFragment.class, currentBundle, fragmentTag);
                    break;
                case 72:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, RateAppComposeGUIFragment.class, currentBundle, fragmentTag);
                    break;
                case 73:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, CasesGUIFragment.class, currentBundle, fragmentTag);
                    break;
                case 74:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, BpRewardsGuiFragment.class, currentBundle, fragmentTag);
                    break;
                case 75:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, TanpinBannerGuiFragment.class, currentBundle, fragmentTag);
                    break;
                case 76:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, VideoPlayerGuiFragment.class, currentBundle, fragmentTag);
                    break;
                case 77:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, MarketplaceGuiFragment.class, currentBundle, fragmentTag);
                    break;
                case 79:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, ClickerGuiFragment.class, currentBundle, fragmentTag);
                    break;
                case 80:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, ChatGuiFragment.class, currentBundle, fragmentTag);
                    break;
                case 81:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, ModuleDialogGuiFragment.class, currentBundle, fragmentTag);
                    break;
                case 82:
                    fragmentTransactionBeginTransaction.add(R.id.jniactivity_main_root_view, RatingGuiFragment.class, currentBundle, fragmentTag);
                    break;
            }
            fragmentTransactionBeginTransaction.setReorderingAllowed(true).commitAllowingStateLoss();
        }
    }

    public final boolean isShowingScreens() {
        if (!(!this.showingScreen.isEmpty())) {
            return false;
        }
        for (Map.Entry<Integer, ISAMPGUI> entry : this.showingScreen.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if (entry.getValue() != null && iIntValue != 13) {
                return true;
            }
        }
        return false;
    }

    public final boolean getGUIs(int id) {
        ISAMPGUI isampgui = this.showingScreen.get(Integer.valueOf(id));
        if (isampgui != null) {
            return isampgui.isShowingGui();
        }
        return false;
    }

    public final void onPacketIncoming(int screenId, @NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        UtilsKt.crashlyticsLog("onPacketIncoming(screenId = " + screenId + ", json = " + json + ")", LogTagConstants.GET_DATA_TAG);
        if (screenId == 38 && json.optInt("t") == 0) {
            JNIActivity context = JNIActivity.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            sendFirebaseInstallationsIdAndAppMetricaDeviceId(context);
        }
        if (screenId == 100) {
            int iOptInt = json.optInt("id");
            sendAppMetricaProfileId(iOptInt);
            Preferences.putInteger(JNIActivity.getContext(), Preferences.USER_ACCOUNT_ID, iOptInt);
            if (UtilsKt.isRustoreBuildVariant()) {
                JNIActivity.getRustoreBillingPurchases();
            }
        }
        if (json.optInt("o") == 1) {
            openingScreen(screenId, json);
            return;
        }
        if (json.optInt("c") == 1) {
            closingScreen(screenId, json);
            return;
        }
        if (this.showingScreen.get(Integer.valueOf(screenId)) != null) {
            ISAMPGUI isampgui = this.showingScreen.get(Integer.valueOf(screenId));
            if (isampgui != null) {
                isampgui.onPacketIncoming(json);
                return;
            }
            return;
        }
        if (this.jsonCache.get(screenId) != null) {
            ArrayList<JSONObject> arrayList = this.jsonCache.get(screenId);
            if (arrayList != null) {
                arrayList.add(json);
                return;
            }
            return;
        }
        ArrayList<JSONObject> arrayList2 = new ArrayList<>();
        arrayList2.add(json);
        this.jsonCache.put(screenId, arrayList2);
    }

    public final void sendJsonData(int screenId, @NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        UtilsKt.crashlyticsLog("sendJsonData(screenId = " + screenId + ", json = " + json + ")", LogTagConstants.SEND_DATA_TAG);
        String string = json.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        try {
            Charset charsetForName = Charset.forName("windows-1251");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
            byte[] bytes = string.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            JNIJSONTransport.sendJsonData(screenId, bytes);
        } catch (Exception e) {
            UtilsKt.crashlyticsException(e);
        }
    }

    public final void closeSAMPWindow(@Nullable JSONObject json) {
        UtilsKt.crashlyticsLog("closeSAMPWindow(), showingScreen.size() = " + this.showingScreen.size());
        if (this.showingScreen.get(10) != null) {
            ISAMPGUI isampgui = this.showingScreen.get(10);
            if (isampgui != null) {
                isampgui.close(json);
            }
            UtilsKt.crashlyticsLog("closeSAMPWindow(), DIALOG_WINDOW_SAMP closed");
            this.showingScreen.put(10, null);
        }
    }

    public final void closeAllWindows() {
        UtilsKt.crashlyticsLog("closeAllWindows(), showingScreen.size() = " + this.showingScreen.size());
        JNIActivity context = JNIActivity.getContext();
        if (context != null) {
            context.runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.GUIManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    GUIManager.closeAllWindows$lambda$4(this.f$0);
                }
            });
        }
    }

    public static final void closeAllWindows$lambda$4(GUIManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (Map.Entry<Integer, ISAMPGUI> entry : this$0.showingScreen.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            ISAMPGUI value = entry.getValue();
            if (iIntValue != 10) {
                closeGUI$default(this$0, null, iIntValue, 1, null);
            } else if (value != null) {
                value.close(null);
            }
        }
    }

    public final void closeAllWindowsExSAMP() {
        UtilsKt.crashlyticsLog("closeAllWindowsExSAMP(), showingScreen.size() = " + this.showingScreen.size());
        JNIActivity context = JNIActivity.getContext();
        if (context != null) {
            context.runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.GUIManager$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    GUIManager.closeAllWindowsExSAMP$lambda$6(this.f$0);
                }
            });
        }
    }

    public static final void closeAllWindowsExSAMP$lambda$6(GUIManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<Map.Entry<Integer, ISAMPGUI>> it = this$0.showingScreen.entrySet().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().getKey().intValue();
            if (iIntValue != 10) {
                closeGUI$default(this$0, null, iIntValue, 1, null);
            }
        }
    }

    public static /* synthetic */ void closeGUI$default(GUIManager gUIManager, JSONObject jSONObject, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            jSONObject = null;
        }
        gUIManager.closeGUI(jSONObject, i);
    }

    public final void closeGUI(@Nullable JSONObject json, int screenId) {
        UtilsKt.crashlyticsLog("closeGUI, screenId = " + screenId + ", showingScreen.size() = " + this.showingScreen.size());
        if (json != null && json.optInt("not") == 1 && this.showingScreen.get(13) != null) {
            ISAMPGUI isampgui = this.showingScreen.get(13);
            if (isampgui != null) {
                isampgui.onPacketIncoming(json);
                return;
            }
            return;
        }
        if (screenId == 10 || screenId == 13) {
            return;
        }
        ISAMPGUI isampgui2 = this.showingScreen.get(Integer.valueOf(screenId));
        if (isampgui2 != null) {
            isampgui2.close(json);
        }
        this.showingScreen.put(Integer.valueOf(screenId), null);
        this.isOpenScreen.put(Integer.valueOf(screenId), Boolean.FALSE);
    }

    public final void notifyGUIClosed(int screenId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("c", 1);
        sendJsonData(screenId, jSONObject);
        if (screenId != 38 || this.showingScreen.get(13) == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(NativeConstants.ACTION_WITH_NATIVE_KEYBOARD, 99);
        ISAMPGUI isampgui = this.showingScreen.get(13);
        if (isampgui != null) {
            isampgui.onPacketIncoming(jSONObject2);
        }
    }

    public final void onSpawn() {
        UtilsKt.crashlyticsLog("onSpawn()");
        if (this.showingScreen.get(13) == null) {
            onFragmentChange(13, null);
        }
    }

    public final void showGUI(int screenId, @NotNull JSONObject json) throws JSONException {
        JNIActivity context;
        Intrinsics.checkNotNullParameter(json, "json");
        UtilsKt.crashlyticsLog("showGUI(screenId = " + screenId + ", json = " + json + ")");
        if (!ArraysKt___ArraysKt.contains(this.screenIsWithTouches, Integer.valueOf(screenId)) && (context = JNIActivity.getContext()) != null) {
            context.cancelAllTouches();
        }
        if (screenId == 51) {
            JNIActivity.openCustomTab(Uri.parse(json.optString("s")));
        } else {
            showCurrentGUI(screenId, json);
        }
    }

    public final void updateStack(int screenId, @Nullable ISAMPGUI gui) {
        if (gui != null) {
            this.showingScreen.put(Integer.valueOf(screenId), gui);
            if (this.jsonCache.get(screenId) != null) {
                int size = this.jsonCache.get(screenId).size();
                for (int i = 0; i < size; i++) {
                    gui.onPacketIncoming(this.jsonCache.get(screenId).get(i));
                }
                this.jsonCache.remove(screenId);
            }
        }
    }

    public final void closeFragment(int fragmentConst) {
        JNIActivity context = JNIActivity.getContext();
        if (context != null && !context.isFinishing()) {
            Fragment fragmentFindFragmentByTag = context.getSupportFragmentManager().findFragmentByTag(getFragmentTag(fragmentConst));
            if (fragmentFindFragmentByTag != null) {
                context.getSupportFragmentManager().beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
                return;
            }
            return;
        }
        UtilsKt.crashlyticsRecordNewException("jniActivity = " + context);
    }

    public final void newBackPressed(@Nullable Integer screenId) {
        ISAMPGUI isampgui = this.showingScreen.get(screenId);
        if (isampgui != null) {
            isampgui.newBackPress();
        }
    }

    public final void migrateNotifications() {
        newBackPressed(13);
    }

    public final void isShowingKeyboard(boolean isShowing) throws JSONException {
        ISAMPGUI isampgui;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(NativeConstants.ACTION_WITH_NATIVE_KEYBOARD, isShowing ? 1 : 9);
        ISAMPGUI isampgui2 = this.showingScreen.get(13);
        if (isampgui2 != null) {
            isampgui2.onPacketIncoming(jSONObject);
        }
        if (this.showingScreen.get(39) != null) {
            ISAMPGUI isampgui3 = this.showingScreen.get(39);
            if (isampgui3 != null) {
                isampgui3.onPacketIncoming(jSONObject);
                return;
            }
            return;
        }
        if (this.showingScreen.get(65) != null) {
            ISAMPGUI isampgui4 = this.showingScreen.get(65);
            if (isampgui4 != null) {
                isampgui4.onPacketIncoming(jSONObject);
                return;
            }
            return;
        }
        if (this.showingScreen.get(66) == null || (isampgui = this.showingScreen.get(66)) == null) {
            return;
        }
        isampgui.onPacketIncoming(jSONObject);
    }

    public final String getFragmentTag(int fragmentConst) {
        return GUIManagerKt.FRAGMENT_TAG + fragmentConst;
    }

    public final JSONObject prepareJsonForTypeOfInterface(JSONObject json) throws JSONException {
        if (isNewHud()) {
            json.put(NotificationKeys.NOTIFICATION_VERSION, 1);
        } else {
            json.put(NotificationKeys.NOTIFICATION_VERSION, 2);
        }
        return json;
    }

    public final boolean isNewHud() {
        JNIActivity context = JNIActivity.getContext();
        if (context != null) {
            int integer = Preferences.getInteger(context, NewMenuConstants.HUD_VERSION);
            if (integer == -1) {
                Preferences.putInteger(context, NewMenuConstants.HUD_VERSION, 1);
                UtilsKt.crashlyticsRecordNewException("hudVersion = 1");
                integer = 1;
            }
            return integer == 1;
        }
        UtilsKt.crashlyticsRecordNewException("activity == null");
        return false;
    }

    public final void sendFirebaseInstallationsIdAndAppMetricaDeviceId(JNIActivity jNIActivity) {
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        FirebaseInstallations.getInstance().getId().addOnCompleteListener(jNIActivity, new OnCompleteListener() { // from class: com.blackhub.bronline.game.GUIManager$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                GUIManager.sendFirebaseInstallationsIdAndAppMetricaDeviceId$lambda$9(objectRef, countDownLatch, task);
            }
        });
        AppMetrica.requestStartupParams(JNIActivity.getContext(), new StartupParamsCallback() { // from class: com.blackhub.bronline.game.GUIManager$sendFirebaseInstallationsIdAndAppMetricaDeviceId$startupParamsCallback$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.appmetrica.analytics.StartupParamsCallback
            public void onReceive(@Nullable StartupParamsCallback.Result result) {
                objectRef2.element = result != null ? result.deviceIdHash : 0;
                Preferences.putString(JNIActivity.getContext(), Preferences.USER_APPMETRICA_DEVICE_ID, objectRef2.element);
                countDownLatch.countDown();
            }

            @Override // io.appmetrica.analytics.StartupParamsCallback
            public void onRequestError(@NotNull StartupParamsCallback.Reason reason, @Nullable StartupParamsCallback.Result result) {
                Intrinsics.checkNotNullParameter(reason, "reason");
                UtilsKt.crashlyticsRecordNewException("Error getting AppMetricaDeviceID: " + reason.value);
                countDownLatch.countDown();
            }
        }, CollectionsKt__CollectionsJVMKt.listOf(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH));
        new Thread(new Runnable() { // from class: com.blackhub.bronline.game.GUIManager$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() throws JSONException, InterruptedException {
                GUIManager.sendFirebaseInstallationsIdAndAppMetricaDeviceId$lambda$11(countDownLatch, this, objectRef, objectRef2);
            }
        }).start();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object] */
    public static final void sendFirebaseInstallationsIdAndAppMetricaDeviceId$lambda$9(Ref.ObjectRef firebaseInstallationId, CountDownLatch latch, Task task) {
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "$firebaseInstallationId");
        Intrinsics.checkNotNullParameter(latch, "$latch");
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            firebaseInstallationId.element = task.getResult();
            latch.countDown();
        }
    }

    public static final void sendFirebaseInstallationsIdAndAppMetricaDeviceId$lambda$11(CountDownLatch latch, GUIManager this$0, Ref.ObjectRef firebaseInstallationId, Ref.ObjectRef appMetricaDeviceId) throws JSONException, InterruptedException {
        Intrinsics.checkNotNullParameter(latch, "$latch");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "$firebaseInstallationId");
        Intrinsics.checkNotNullParameter(appMetricaDeviceId, "$appMetricaDeviceId");
        latch.await();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 9);
        jSONObject.put("id", firebaseInstallationId.element);
        jSONObject.put(GUIManagerKt.APPMETRICA_DEVICE_ID_KEY, appMetricaDeviceId.element);
        this$0.sendJsonData(38, jSONObject);
    }

    public final void showCurrentGUI(int screenId, JSONObject json) throws JSONException {
        if (ArraysKt___ArraysKt.contains(this.screensIsFragment, Integer.valueOf(screenId))) {
            handleFragmentScreen(screenId, json);
        } else if (screenId == 13) {
            handleNotificationScreen(screenId, json);
        } else {
            handleOtherScreen(screenId, json);
        }
    }

    public final void handleFragmentScreen(int screenId, JSONObject json) {
        if (!BooleanExtensionKt.getOrFalse(this.isOpenScreen.get(Integer.valueOf(screenId)))) {
            this.isOpenScreen.put(Integer.valueOf(screenId), Boolean.TRUE);
            onFragmentChange(screenId, Useful.INSTANCE.jsonStringToBundle(json, Other.JSON_OBJECT_TAG));
        } else if (this.showingScreen.get(Integer.valueOf(screenId)) != null) {
            closeGUI(null, screenId);
            this.isOpenScreen.put(Integer.valueOf(screenId), Boolean.TRUE);
            onFragmentChange(screenId, Useful.INSTANCE.jsonStringToBundle(json, Other.JSON_OBJECT_TAG));
        }
    }

    public final void handleNotificationScreen(int screenId, JSONObject json) throws JSONException {
        JSONObject jSONObjectPrepareJsonForTypeOfInterface = prepareJsonForTypeOfInterface(json);
        if (this.showingScreen.get(Integer.valueOf(screenId)) != null) {
            ISAMPGUI isampgui = this.showingScreen.get(Integer.valueOf(screenId));
            if (isampgui != null) {
                isampgui.onPacketIncoming(jSONObjectPrepareJsonForTypeOfInterface);
                return;
            }
            return;
        }
        onFragmentChange(screenId, Useful.INSTANCE.jsonStringToBundle(jSONObjectPrepareJsonForTypeOfInterface, Other.JSON_OBJECT_TAG));
    }

    public final void handleOtherScreen(final int screenId, final JSONObject json) {
        try {
            if (this.showingScreen.get(Integer.valueOf(screenId)) != null) {
                ISAMPGUI isampgui = this.showingScreen.get(Integer.valueOf(screenId));
                if (isampgui != null) {
                    isampgui.close(null);
                }
                if (screenId != 10) {
                    this.showingScreen.remove(Integer.valueOf(screenId));
                }
            }
            updateStack(screenId, createGuiFromId(screenId));
            final JNIActivity context = JNIActivity.getContext();
            if (context == null) {
                return;
            }
            UtilsKt.crashlyticsLog("GUIManager cViewRootImpl.setViewCurrentState: " + context.getLifecycle().getState());
            if (UsefulKt.isActivityValid(context)) {
                context.runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.GUIManager$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        GUIManager.handleOtherScreen$lambda$12(context, screenId, this, json);
                    }
                });
            }
        } catch (Exception e) {
            UtilsKt.crashlyticsLog("BAD VERSION, screenId = " + screenId);
            UtilsKt.crashlyticsException(e);
        }
    }

    public static final void handleOtherScreen$lambda$12(JNIActivity activity, int i, GUIManager this$0, JSONObject json) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(json, "$json");
        if (UsefulKt.isActivityValid(activity)) {
            UtilsKt.crashlyticsLog("GUIManager activity is NOT finishing SHOW() " + i);
            ISAMPGUI isampgui = this$0.showingScreen.get(Integer.valueOf(i));
            if (isampgui != null) {
                isampgui.show(json, this$0, activity);
                return;
            }
            return;
        }
        UtilsKt.crashlyticsRecordNewException("GuiManager SHOW isFinishing: " + activity.isFinishing() + ", isDestroyed: " + activity.isDestroyed());
    }

    public final ISAMPGUI createGuiFromId(int id) {
        if (id == 3) {
            return BrDialogDiner.newInstance();
        }
        if (id == 4) {
            return BrDialogHack.newInstance();
        }
        if (id == 5) {
            return BrDialogRobbery.newInstance();
        }
        if (id == 12) {
            return BrFingerPrintDialog.newInstance();
        }
        if (id == 15) {
            return BrDialogDance.newInstance();
        }
        if (id == 23) {
            return BrDialogSawmill.newInstance();
        }
        if (id == 26) {
            return BrNewCaptcha.newInstance();
        }
        if (id == 31) {
            return GUIMiniGameEventsGame.newInstance();
        }
        if (id != 41) {
            switch (id) {
                case 7:
                    return BrDialogWires.newInstance();
                case 8:
                    return BrDialogPipes.newInstance();
                case 9:
                    return BrAudioDialog.newInstance();
                case 10:
                    return BrDialogWindow.newInstance();
                default:
                    return null;
            }
        }
        return GUIVipAccount.INSTANCE.newInstance();
    }

    public final void openingScreen(int screenId, JSONObject json) throws JSONException {
        this.jsonCache.remove(screenId);
        if (screenId == 38) {
            JSONArray jSONArrayOptJSONArray = json.optJSONArray(SocialNetworkLinkUtils.KEY_BUTTON_STATUS);
            JNIActivity context = JNIActivity.getContext();
            if (context != null) {
                Preferences.putObject(context, SocialNetworkLinkUtils.KEY_BUTTON_STATUS, jSONArrayOptJSONArray);
            }
        }
        showGUI(screenId, json);
    }

    public final void closingScreen(int screenId, JSONObject json) {
        if (json.optInt("not") == 1) {
            closeGUI(json, screenId);
        } else if (this.showingScreen.get(Integer.valueOf(screenId)) != null) {
            if (screenId != 10) {
                closeGUI(json, screenId);
            } else {
                closeSAMPWindow(json);
            }
        }
    }

    public final void sendAppMetricaProfileId(int i) {
        int integer = Preferences.getInteger(JNIActivity.getContext(), Preferences.USER_SERVER) + 1;
        String str = Preferences.getString(JNIActivity.getContext(), NewMenuConstants.PLAYERS_NICK) + LauncherConstants.UNDERSCORE_STRING + integer;
        String str2 = i + LauncherConstants.UNDERSCORE_STRING + integer;
        MarketAnalytic marketAnalytic = MarketAnalytic.INSTANCE;
        marketAnalytic.getEngine().setUserId(str2);
        marketAnalytic.getEngine().setNickServer(str);
    }
}
