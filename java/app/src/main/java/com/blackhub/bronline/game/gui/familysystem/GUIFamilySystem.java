package com.blackhub.bronline.game.gui.familysystem;

import android.text.SpannableString;
import android.text.Spanned;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.databinding.FamiliesMainContainerBinding;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.GUIManagerKt;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.common.UIContainer;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.core.model.ConfigurationJsonModel;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.admintools.AdminToolsKeys;
import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassKeys;
import com.blackhub.bronline.game.gui.familysystem.data.FamilyNotificationData;
import com.blackhub.bronline.game.gui.familysystem.data.FamilyPlayer;
import com.blackhub.bronline.game.gui.familysystem.data.FamilySystemList;
import com.blackhub.bronline.game.gui.familysystem.data.FamilyTopData;
import com.blackhub.bronline.game.gui.familysystem.network.ActionsWithJSON;
import com.blackhub.bronline.game.gui.fractions.Const;
import com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventKeys;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
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
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GUIFamilySystem.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGUIFamilySystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIFamilySystem.kt\ncom/blackhub/bronline/game/gui/familysystem/GUIFamilySystem\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,869:1\n172#2,9:870\n*S KotlinDebug\n*F\n+ 1 GUIFamilySystem.kt\ncom/blackhub/bronline/game/gui/familysystem/GUIFamilySystem\n*L\n94#1:870,9\n*E\n"})

public final class GUIFamilySystem extends BaseISAMPGUIFragment<FamiliesMainContainerBinding> {
    public static final int $stable = 8;

    @Nullable
    public ActionsWithJSON actionsWithJSON;

    @Nullable
    public UIContainer container;

    @Nullable
    public UIFamilyRating familyRatingLayout;
    public int familyStatus;

    @Nullable
    public FamilySystemList familySystemListFromJson;

    @Nullable
    public GUIManager guiManager;
    public boolean ifCloseOtherMethodAndNotInforming;
    public int ifFamilyInTop;
    public int ifLeader;

    @Nullable
    public LogicForDialogApply logicForDialogApply;

    @Nullable
    public LogicForDialogBuyToken logicForDialogBuyToken;

    @Nullable
    public JNIActivity mainActivity;

    @Nullable
    public UIMailLayout mainLayout;

    /* renamed from: mainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainViewModel;

    @Nullable
    public UIMenuCarPark menuCarParkLayout;

    @Nullable
    public UIMenuFamilyPlayersSetting menuFamilyPlayersSettingLayout;

    @Nullable
    public UIMenuFamilySetting menuFamilySettingLayout;

    @Nullable
    public UIMenuFamilyStore menuFamilyStoreLayout;

    @Nullable
    public UIMenuFamilyUpgrade menuFamilyUpgradeLayout;

    @Nullable
    public UIMenuMain menuMainLayout;

    @Nullable
    public UIFamilyNotification notificationsLayout;
    public int playersId;

    @Nullable
    public UIFamilyQuests questsLayout;

    @Nullable
    public UIFamilyShop shopLayout;

    @Nullable
    public UITopPresents topPresentsLayout;
    public int valueBlackCoins;
    public int valueMoney;
    public int valueNotifications;

    @NotNull
    public Spanned familyName = new SpannableString("");

    @NotNull
    public String playersNick = "";

    @NotNull
    public final GetDataFromJsonAndTransformationToCorrectType actionWithJson = new GetDataFromJsonAndTransformationToCorrectType();

    @NotNull
    public final List<Integer> otherState = new ArrayList();
    public boolean ifFromMainMenuForUpgrade = true;
    public boolean ifFromMainMenuForCarPark = true;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 45;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @Nullable
    public final GUIManager getGuiManager() {
        return this.guiManager;
    }

    public final void setGuiManager(@Nullable GUIManager gUIManager) {
        this.guiManager = gUIManager;
    }

    public final int getIfLeader() {
        return this.ifLeader;
    }

    public final void setIfLeader(int i) {
        this.ifLeader = i;
    }

    public final int getFamilyStatus() {
        return this.familyStatus;
    }

    public final void setFamilyStatus(int i) {
        this.familyStatus = i;
    }

    @NotNull
    public final String getPlayersNick() {
        return this.playersNick;
    }

    public final void setPlayersNick(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.playersNick = str;
    }

    public final int getPlayersId() {
        return this.playersId;
    }

    public final void setPlayersId(int i) {
        this.playersId = i;
    }

    public final boolean getIfCloseOtherMethodAndNotInforming() {
        return this.ifCloseOtherMethodAndNotInforming;
    }

    public final void setIfCloseOtherMethodAndNotInforming(boolean z) {
        this.ifCloseOtherMethodAndNotInforming = z;
    }

    public final boolean getIfFromMainMenuForUpgrade() {
        return this.ifFromMainMenuForUpgrade;
    }

    public final void setIfFromMainMenuForUpgrade(boolean z) {
        this.ifFromMainMenuForUpgrade = z;
    }

    public final boolean getIfFromMainMenuForCarPark() {
        return this.ifFromMainMenuForCarPark;
    }

    public final void setIfFromMainMenuForCarPark(boolean z) {
        this.ifFromMainMenuForCarPark = z;
    }

    public final JNIActivityViewModel getMainViewModel() {
        return (JNIActivityViewModel) this.mainViewModel.getValue();
    }

    @Nullable
    public final FamilySystemList getFamilySystemListFromJson() {
        return this.familySystemListFromJson;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) throws IllegalStateException, JSONException {
        UIMenuCarPark uIMenuCarPark;
        UIMenuFamilySetting uIMenuFamilySetting;
        UIMenuFamilyPlayersSetting uIMenuFamilyPlayersSetting;
        if (json != null) {
            switch (json.optInt("t")) {
                case 2:
                    int iOptInt = json.optInt("s");
                    if (iOptInt == 1) {
                        int iOptInt2 = json.optInt("r");
                        int iOptInt3 = json.optInt("d");
                        UIMenuCarPark uIMenuCarPark2 = this.menuCarParkLayout;
                        if (uIMenuCarPark2 != null) {
                            uIMenuCarPark2.setCurrentRankAndStatus(iOptInt2, iOptInt3);
                            break;
                        }
                    } else if (iOptInt == 2) {
                        if (json.optInt("d") == 1 && (uIMenuCarPark = this.menuCarParkLayout) != null) {
                            uIMenuCarPark.updateStatusAfterAction();
                            break;
                        }
                    } else {
                        List<String> jsonArrayReturnStringList = this.actionWithJson.getJsonArrayReturnStringList(json.optJSONArray("n"));
                        List<Integer> jsonArrayReturnIntList = this.actionWithJson.getJsonArrayReturnIntList(json.optJSONArray("id"));
                        int iOptInt4 = json.optInt("g");
                        if (jsonArrayReturnIntList.size() > 0) {
                            UIMenuCarPark uIMenuCarPark3 = this.menuCarParkLayout;
                            if (uIMenuCarPark3 != null) {
                                uIMenuCarPark3.setCarsList(jsonArrayReturnIntList, jsonArrayReturnStringList);
                                uIMenuCarPark3.setGarage(iOptInt4);
                            }
                            listenerLayout(9);
                            break;
                        }
                    }
                    break;
                case 3:
                    if (json.optInt("s") == 1) {
                        int iOptInt5 = json.optInt("na");
                        int iOptInt6 = json.optInt("tp");
                        if (iOptInt6 == 0) {
                            ((FamiliesMainContainerBinding) getBinding()).moneyValue.setText(String.valueOf(iOptInt5));
                        } else if (iOptInt6 == 1) {
                            ((FamiliesMainContainerBinding) getBinding()).blackCoinValue.setText(String.valueOf(iOptInt5));
                        }
                        UIFamilyShop uIFamilyShop = this.shopLayout;
                        if (uIFamilyShop != null) {
                            uIFamilyShop.updateAfterPurchase();
                        }
                        LogicForDialogApply logicForDialogApply = this.logicForDialogApply;
                        if (logicForDialogApply != null) {
                            logicForDialogApply.closeDialogApply();
                            break;
                        }
                    } else {
                        LogicForDialogApply logicForDialogApply2 = this.logicForDialogApply;
                        if (logicForDialogApply2 != null) {
                            logicForDialogApply2.closeDialogApply();
                            break;
                        }
                    }
                    break;
                case 4:
                    int iOptInt7 = json.optInt("s");
                    if (iOptInt7 == 1) {
                        UIMenuFamilyUpgrade uIMenuFamilyUpgrade = this.menuFamilyUpgradeLayout;
                        if (uIMenuFamilyUpgrade != null) {
                            uIMenuFamilyUpgrade.updateState(json.optInt("id"));
                        }
                    } else if (iOptInt7 != 2) {
                        int iOptInt8 = json.optInt("m");
                        List<Integer> jsonArrayReturnIntList2 = this.actionWithJson.getJsonArrayReturnIntList(json.optJSONArray("y"));
                        UIMenuFamilyUpgrade uIMenuFamilyUpgrade2 = this.menuFamilyUpgradeLayout;
                        if (uIMenuFamilyUpgrade2 != null) {
                            uIMenuFamilyUpgrade2.setStartData(iOptInt8, jsonArrayReturnIntList2);
                        }
                        listenerLayout(10);
                    }
                    LogicForDialogApply logicForDialogApply3 = this.logicForDialogApply;
                    if (logicForDialogApply3 != null) {
                        logicForDialogApply3.closeDialogApply();
                        break;
                    }
                    break;
                case 5:
                    int iOptInt9 = json.optInt("id");
                    if (iOptInt9 == 1) {
                        if (json.optInt("st") == 1) {
                            int iOptInt10 = json.optInt(BlackPassKeys.CL_MARATHON_LEVEL);
                            List<String> jsonArrayReturnStringList2 = this.actionWithJson.getJsonArrayReturnStringList(json.optJSONArray("r"));
                            List<Integer> jsonArrayReturnIntList3 = this.actionWithJson.getJsonArrayReturnIntList(json.optJSONArray("rp"));
                            UIMenuFamilySetting uIMenuFamilySetting2 = this.menuFamilySettingLayout;
                            if (uIMenuFamilySetting2 != null) {
                                uIMenuFamilySetting2.setStartData(iOptInt10, jsonArrayReturnStringList2, jsonArrayReturnIntList3);
                            }
                            listenerLayout(7);
                        }
                        int iOptInt11 = json.optInt("s");
                        if (iOptInt11 == 1) {
                            if (json.optInt("n") == 1) {
                                int iOptInt12 = json.optInt("r");
                                UIMenuFamilySetting uIMenuFamilySetting3 = this.menuFamilySettingLayout;
                                if (uIMenuFamilySetting3 != null) {
                                    uIMenuFamilySetting3.setRanksPosition(iOptInt12);
                                    uIMenuFamilySetting3.updateRankName(iOptInt12);
                                    break;
                                }
                            }
                        } else if (iOptInt11 == 2) {
                            if (json.optInt("n") == 1) {
                                int iOptInt13 = json.optInt("r");
                                int iOptInt14 = json.optInt("k");
                                int iOptInt15 = json.optInt("b");
                                UIMenuFamilySetting uIMenuFamilySetting4 = this.menuFamilySettingLayout;
                                if (uIMenuFamilySetting4 != null) {
                                    uIMenuFamilySetting4.updateAccess(1, iOptInt14, iOptInt13, iOptInt15);
                                    uIMenuFamilySetting4.setRanksPosition(iOptInt13);
                                    break;
                                }
                            } else {
                                int iOptInt16 = json.optInt("k");
                                UIMenuFamilySetting uIMenuFamilySetting5 = this.menuFamilySettingLayout;
                                if (uIMenuFamilySetting5 != null) {
                                    uIMenuFamilySetting5.updateAccess(0, iOptInt16, -1, -1);
                                    break;
                                }
                            }
                        } else if (iOptInt11 == 3 && json.optInt("n") == 1 && (uIMenuFamilySetting = this.menuFamilySettingLayout) != null) {
                            uIMenuFamilySetting.updateStartColor(json.optInt("r"));
                            break;
                        }
                    } else if (iOptInt9 == 2) {
                        int iOptInt17 = json.optInt("s");
                        if (iOptInt17 == 1) {
                            int iOptInt18 = json.optInt("sk");
                            int iOptInt19 = json.optInt("rb");
                            int iOptInt20 = json.optInt("rv");
                            int iOptInt21 = json.optInt("rp");
                            int iOptInt22 = json.optInt("m");
                            String strOptString = json.optString("rn");
                            Integer[] numArr = {Integer.valueOf(iOptInt18), Integer.valueOf(iOptInt19), Integer.valueOf(iOptInt20), Integer.valueOf(iOptInt21), Integer.valueOf(iOptInt22)};
                            UIMenuFamilyPlayersSetting uIMenuFamilyPlayersSetting2 = this.menuFamilyPlayersSettingLayout;
                            if (uIMenuFamilyPlayersSetting2 != null) {
                                uIMenuFamilyPlayersSetting2.setPlayersInfo(numArr, strOptString);
                                break;
                            }
                        } else if (iOptInt17 == 2) {
                            if (json.optInt("r") == 1 && (uIMenuFamilyPlayersSetting = this.menuFamilyPlayersSettingLayout) != null) {
                                uIMenuFamilyPlayersSetting.updatePlayersAction();
                                break;
                            }
                        } else {
                            List<FamilyPlayer> jsonArrayReturnFamilyPlayer = this.actionWithJson.getJsonArrayReturnFamilyPlayer(json.optJSONArray(Const.FRACTION_CONTROL_T_LIST_OF_NICKNAMES), json.optJSONArray("rs"));
                            UIMenuFamilyPlayersSetting uIMenuFamilyPlayersSetting3 = this.menuFamilyPlayersSettingLayout;
                            if (uIMenuFamilyPlayersSetting3 != null) {
                                uIMenuFamilyPlayersSetting3.setAllPlayers(jsonArrayReturnFamilyPlayer);
                            }
                            listenerLayout(8);
                            break;
                        }
                    } else if (iOptInt9 == 3) {
                        int iOptInt23 = json.optInt("r");
                        if (iOptInt23 == 0) {
                            List<Integer> jsonArrayReturnIntList4 = this.actionWithJson.getJsonArrayReturnIntList(json.optJSONArray(Const.FRACTION_CONTROL_T_LIST_OF_NICKNAMES));
                            UIMenuFamilyStore uIMenuFamilyStore = this.menuFamilyStoreLayout;
                            if (uIMenuFamilyStore != null) {
                                uIMenuFamilyStore.updateParameters(jsonArrayReturnIntList4);
                                break;
                            }
                        } else if (iOptInt23 == 1 && json.optInt("s") == 1) {
                            this.ifCloseOtherMethodAndNotInforming = true;
                            closeFragment();
                            ActionsWithJSON actionsWithJSON = this.actionsWithJSON;
                            if (actionsWithJSON != null) {
                                actionsWithJSON.openStore(1);
                                break;
                            }
                        }
                    } else if (iOptInt9 != 4 && iOptInt9 != 5) {
                        int iOptInt24 = json.optInt("r");
                        int iOptInt25 = json.optInt(GUIManagerKt.APPMETRICA_DEVICE_ID_KEY);
                        int iOptInt26 = json.optInt("s");
                        List<Integer> jsonArrayReturnIntList5 = this.actionWithJson.getJsonArrayReturnIntList(json.optJSONArray("my"));
                        List<Integer> jsonArrayReturnIntList6 = this.actionWithJson.getJsonArrayReturnIntList(json.optJSONArray(UpgradeObjectEventKeys.EVENT_TOP_LIST_SERVER_ID_PLAYER_KEY));
                        List<Integer> jsonArrayReturnIntList7 = this.actionWithJson.getJsonArrayReturnIntList(json.optJSONArray("mk"));
                        List<Integer> jsonArrayReturnIntList8 = this.actionWithJson.getJsonArrayReturnIntList(json.optJSONArray("kb"));
                        List<Integer> jsonArrayReturnIntList9 = this.actionWithJson.getJsonArrayReturnIntList(json.optJSONArray(AdminToolsKeys.ADMIN_TOOLS_BUTTONS_ARRAY_KEY));
                        List<Integer> jsonArrayReturnIntList10 = this.actionWithJson.getJsonArrayReturnIntList(json.optJSONArray("pn"));
                        List<Integer> jsonArrayReturnIntList11 = this.actionWithJson.getJsonArrayReturnIntList(json.optJSONArray("ug"));
                        List<Integer> listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(Integer.valueOf(iOptInt24), Integer.valueOf(iOptInt25), Integer.valueOf(iOptInt26));
                        List<Integer> list = this.otherState;
                        list.clear();
                        list.addAll(jsonArrayReturnIntList5);
                        list.addAll(jsonArrayReturnIntList6);
                        list.addAll(jsonArrayReturnIntList7);
                        list.addAll(jsonArrayReturnIntList8);
                        list.addAll(jsonArrayReturnIntList9);
                        list.addAll(jsonArrayReturnIntList10);
                        UIMenuMain uIMenuMain = this.menuMainLayout;
                        if (uIMenuMain != null) {
                            uIMenuMain.setStartParameters(jsonArrayReturnIntList11, listMutableListOf, this.otherState, this.playersNick, this.playersId);
                        }
                        listenerLayout(6);
                        break;
                    }
                    break;
                case 6:
                    int iOptInt27 = json.optInt("b");
                    if (iOptInt27 == 1) {
                        String strOptString2 = json.optString("k");
                        String strOptString3 = json.optString("n");
                        int iOptInt28 = json.optInt("x");
                        Intrinsics.checkNotNull(strOptString2);
                        Intrinsics.checkNotNull(strOptString3);
                        FamilyNotificationData familyNotificationData = new FamilyNotificationData(strOptString2, strOptString3, iOptInt28);
                        int i = this.valueNotifications + 1;
                        this.valueNotifications = i;
                        setNotification(i);
                        UIFamilyNotification uIFamilyNotification = this.notificationsLayout;
                        if (uIFamilyNotification != null) {
                            uIFamilyNotification.addNewNotification(familyNotificationData);
                            break;
                        }
                    } else if (iOptInt27 == 2) {
                        int iOptInt29 = json.optInt("d");
                        String strOptString4 = json.optString("k");
                        String strOptString5 = json.optString("n");
                        int iOptInt30 = json.optInt("x");
                        UIFamilyNotification uIFamilyNotification2 = this.notificationsLayout;
                        if (uIFamilyNotification2 != null) {
                            uIFamilyNotification2.removeNotification(iOptInt29);
                        }
                        if (iOptInt30 != -1) {
                            Intrinsics.checkNotNull(strOptString4);
                            Intrinsics.checkNotNull(strOptString5);
                            FamilyNotificationData familyNotificationData2 = new FamilyNotificationData(strOptString4, strOptString5, iOptInt30);
                            UIFamilyNotification uIFamilyNotification3 = this.notificationsLayout;
                            if (uIFamilyNotification3 != null) {
                                uIFamilyNotification3.addOldNotification(familyNotificationData2);
                                break;
                            }
                        }
                    } else {
                        List<FamilyNotificationData> jsonArrayAndIntCollectionReturnFamilyNotificationList = this.actionWithJson.getJsonArrayAndIntCollectionReturnFamilyNotificationList(json.optJSONArray("m"), this.actionWithJson.getJsonArrayReturnIntList(json.optJSONArray("x")));
                        UIFamilyNotification uIFamilyNotification4 = this.notificationsLayout;
                        if (uIFamilyNotification4 != null) {
                            uIFamilyNotification4.setStartData(jsonArrayAndIntCollectionReturnFamilyNotificationList);
                        }
                        listenerLayout(5);
                        break;
                    }
                    break;
                case 7:
                    int iOptInt31 = json.optInt("p");
                    FamilyTopData familyTopData = new FamilyTopData(iOptInt31, this.familyName, json.optInt("tp"), json.optInt(AdminToolsKeys.ADMIN_TOOLS_PLAYER_TEXT_REPORT_KEY), json.optInt("tz"), R.color.black, 0, 0, false, false, 768, null);
                    List<Integer> jsonArrayReturnIntList12 = this.actionWithJson.getJsonArrayReturnIntList(json.optJSONArray("m"));
                    List<Spanned> jsonArrayReturnSpannedList = this.actionWithJson.getJsonArrayReturnSpannedList(json.optJSONArray(UpgradeObjectEventKeys.EVENT_TOP_LIST_NAME_PLAYER_KEY));
                    UIFamilyRating uIFamilyRating = this.familyRatingLayout;
                    if (uIFamilyRating != null) {
                        uIFamilyRating.setStartParameters(familyTopData, jsonArrayReturnIntList12, jsonArrayReturnSpannedList, iOptInt31);
                    }
                    listenerLayout(1);
                    break;
                case 9:
                    int iOptInt32 = json.optInt("s");
                    if (iOptInt32 == 1) {
                        int iOptInt33 = json.optInt("m");
                        LogicForDialogBuyToken logicForDialogBuyToken = this.logicForDialogBuyToken;
                        if (logicForDialogBuyToken != null) {
                            logicForDialogBuyToken.updateCostInBC(iOptInt33);
                            break;
                        }
                    } else if (iOptInt32 == 2 && json.optInt("r") == 1) {
                        ((FamiliesMainContainerBinding) getBinding()).moneyValue.setText(String.valueOf(json.optInt("m")));
                        break;
                    }
                    break;
                case 10:
                    int iOptInt34 = json.optInt("s");
                    if (iOptInt34 == 0) {
                        LogicForDialogApply logicForDialogApply4 = this.logicForDialogApply;
                        if (logicForDialogApply4 != null) {
                            logicForDialogApply4.closeDialogApply();
                            break;
                        }
                    } else if (iOptInt34 == 1) {
                        LogicForDialogApply logicForDialogApply5 = this.logicForDialogApply;
                        if (logicForDialogApply5 != null) {
                            logicForDialogApply5.closeDialogApply();
                        }
                        this.ifCloseOtherMethodAndNotInforming = true;
                        closeFragment();
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        this.mainActivity = JNIActivity.getContext();
        this.guiManager = GUIManager.INSTANCE.getInstance();
        this.actionsWithJSON = new ActionsWithJSON(this.guiManager);
        getStartParameters(getJsonObj());
        JNILib.toggleDrawing2dStuff(true);
        this.logicForDialogApply = new LogicForDialogApply(this, this.mainActivity, this.actionsWithJSON);
        initFamilySystemListFromJson();
        this.logicForDialogBuyToken = new LogicForDialogBuyToken(this, this.mainActivity, this.actionsWithJSON);
        setFamilyName(this.familyName);
        setMoney(this.valueMoney);
        setBlackCoin(this.valueBlackCoins);
        setNotification(this.valueNotifications);
        setLavr(this.ifFamilyInTop);
        FamiliesMainContainerBinding familiesMainContainerBinding = (FamiliesMainContainerBinding) getBinding();
        AppCompatButton buttonClose = familiesMainContainerBinding.buttonClose;
        Intrinsics.checkNotNullExpressionValue(buttonClose, "buttonClose");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonClose, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.GUIFamilySystem$initViewsISAMPGUI$1$1
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
                this.this$0.setIfCloseOtherMethodAndNotInforming(false);
                this.this$0.closeFragment();
            }
        }, 1, null);
        ImageView buttonAddMoney = familiesMainContainerBinding.buttonAddMoney;
        Intrinsics.checkNotNullExpressionValue(buttonAddMoney, "buttonAddMoney");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonAddMoney, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.GUIFamilySystem$initViewsISAMPGUI$1$2
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
                LogicForDialogBuyToken logicForDialogBuyToken = this.this$0.logicForDialogBuyToken;
                if (logicForDialogBuyToken != null) {
                    logicForDialogBuyToken.showDialog();
                }
            }
        }, 1, null);
        AppCompatButton buttonFamiliesSetting = familiesMainContainerBinding.buttonFamiliesSetting;
        Intrinsics.checkNotNullExpressionValue(buttonFamiliesSetting, "buttonFamiliesSetting");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonFamiliesSetting, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.GUIFamilySystem$initViewsISAMPGUI$1$3
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
                ActionsWithJSON actionsWithJSON = this.this$0.actionsWithJSON;
                if (actionsWithJSON != null) {
                    actionsWithJSON.sendGetLayout(5);
                }
            }
        }, 1, null);
        ImageView buttonNotification = familiesMainContainerBinding.buttonNotification;
        Intrinsics.checkNotNullExpressionValue(buttonNotification, "buttonNotification");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonNotification, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.GUIFamilySystem$initViewsISAMPGUI$1$4
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
                ActionsWithJSON actionsWithJSON = this.this$0.actionsWithJSON;
                if (actionsWithJSON != null) {
                    actionsWithJSON.sendGetLayout(6);
                }
            }
        }, 1, null);
        AppCompatButton buttonTop = familiesMainContainerBinding.buttonTop;
        Intrinsics.checkNotNullExpressionValue(buttonTop, "buttonTop");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonTop, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.GUIFamilySystem$initViewsISAMPGUI$1$5
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
                ActionsWithJSON actionsWithJSON = this.this$0.actionsWithJSON;
                if (actionsWithJSON != null) {
                    actionsWithJSON.sendGetLayout(7);
                }
            }
        }, 1, null);
        AppCompatButton buttonBack = familiesMainContainerBinding.buttonBack;
        Intrinsics.checkNotNullExpressionValue(buttonBack, "buttonBack");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonBack, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.GUIFamilySystem$initViewsISAMPGUI$1$6
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
                this.this$0.listenerLayout(0);
            }
        }, 1, null);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FamiliesMainContainerBinding getViewBinding() {
        FamiliesMainContainerBinding familiesMainContainerBindingInflate = FamiliesMainContainerBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(familiesMainContainerBindingInflate, "inflate(...)");
        return familiesMainContainerBindingInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void closeAndroidsButtons() {
        UsefulKt.hideSystemUI(((FamiliesMainContainerBinding) getBinding()).getRoot());
    }

    /* compiled from: GUIFamilySystem.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.familysystem.GUIFamilySystem$initFamilySystemListFromJson$1", m7120f = "GUIFamilySystem.kt", m7121i = {}, m7122l = {TypedValues.MotionType.TYPE_DRAW_PATH}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.familysystem.GUIFamilySystem$initFamilySystemListFromJson$1 */
    public static final class C40171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C40171(Continuation<? super C40171> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIFamilySystem.this.new C40171(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C40171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<ConfigurationJsonModel> configurationJsons = GUIFamilySystem.this.getMainViewModel().getConfigurationJsons();
                Lifecycle lifecycle = GUIFamilySystem.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(configurationJsons, lifecycle, Lifecycle.State.STARTED);
                final GUIFamilySystem gUIFamilySystem = GUIFamilySystem.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.familysystem.GUIFamilySystem.initFamilySystemListFromJson.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ConfigurationJsonModel) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull ConfigurationJsonModel configurationJsonModel, @NotNull Continuation<? super Unit> continuation) throws JSONException {
                        if (!configurationJsonModel.getFamilySystemListFromJson().getUpgradeList().isEmpty()) {
                            gUIFamilySystem.familySystemListFromJson = configurationJsonModel.getFamilySystemListFromJson();
                            gUIFamilySystem.initialisationContainer();
                            gUIFamilySystem.listenerLayout(0);
                        } else {
                            LocalNotification localNotification = new LocalNotification(GUIManager.INSTANCE.getInstance());
                            String string = gUIFamilySystem.getString(R.string.common_error_with_json_parsing);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            localNotification.showErrorNotification(string);
                            gUIFamilySystem.closeFragment();
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

    public final void initFamilySystemListFromJson() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C40171(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initialisationContainer() {
        this.container = ((FamiliesMainContainerBinding) getBinding()).mainContainer;
        UIMailLayout uIMailLayout = new UIMailLayout(this, this.actionsWithJSON);
        this.mainLayout = uIMailLayout;
        UIContainer uIContainer = this.container;
        if (uIContainer != null) {
            uIContainer.addLayout(0, uIMailLayout);
        }
        UIFamilyRating uIFamilyRating = new UIFamilyRating(this, this.mainActivity);
        this.familyRatingLayout = uIFamilyRating;
        UIContainer uIContainer2 = this.container;
        if (uIContainer2 != null) {
            uIContainer2.addLayout(1, uIFamilyRating);
        }
        UITopPresents uITopPresents = new UITopPresents(this, this.mainActivity);
        this.topPresentsLayout = uITopPresents;
        UIContainer uIContainer3 = this.container;
        if (uIContainer3 != null) {
            uIContainer3.addLayout(2, uITopPresents);
        }
        UIFamilyShop uIFamilyShop = new UIFamilyShop(this, this.mainActivity, this.logicForDialogApply);
        this.shopLayout = uIFamilyShop;
        UIContainer uIContainer4 = this.container;
        if (uIContainer4 != null) {
            uIContainer4.addLayout(3, uIFamilyShop);
        }
        UIFamilyQuests uIFamilyQuests = new UIFamilyQuests(this, this.mainActivity, this.actionsWithJSON);
        this.questsLayout = uIFamilyQuests;
        UIContainer uIContainer5 = this.container;
        if (uIContainer5 != null) {
            uIContainer5.addLayout(4, uIFamilyQuests);
        }
        UIFamilyNotification uIFamilyNotification = new UIFamilyNotification(this, this.mainActivity, this.actionsWithJSON, this.logicForDialogApply);
        this.notificationsLayout = uIFamilyNotification;
        UIContainer uIContainer6 = this.container;
        if (uIContainer6 != null) {
            uIContainer6.addLayout(5, uIFamilyNotification);
        }
        UIMenuMain uIMenuMain = new UIMenuMain(this, this.mainActivity, this.actionsWithJSON, this.logicForDialogApply);
        this.menuMainLayout = uIMenuMain;
        UIContainer uIContainer7 = this.container;
        if (uIContainer7 != null) {
            uIContainer7.addLayout(6, uIMenuMain);
        }
        UIMenuFamilySetting uIMenuFamilySetting = new UIMenuFamilySetting(this, this.mainActivity, this.actionsWithJSON);
        this.menuFamilySettingLayout = uIMenuFamilySetting;
        UIContainer uIContainer8 = this.container;
        if (uIContainer8 != null) {
            uIContainer8.addLayout(7, uIMenuFamilySetting);
        }
        UIMenuFamilyPlayersSetting uIMenuFamilyPlayersSetting = new UIMenuFamilyPlayersSetting(this.mainActivity, this.actionsWithJSON);
        this.menuFamilyPlayersSettingLayout = uIMenuFamilyPlayersSetting;
        UIContainer uIContainer9 = this.container;
        if (uIContainer9 != null) {
            uIContainer9.addLayout(8, uIMenuFamilyPlayersSetting);
        }
        UIMenuCarPark uIMenuCarPark = new UIMenuCarPark(this.mainActivity, this.actionsWithJSON);
        this.menuCarParkLayout = uIMenuCarPark;
        UIContainer uIContainer10 = this.container;
        if (uIContainer10 != null) {
            uIContainer10.addLayout(9, uIMenuCarPark);
        }
        UIMenuFamilyUpgrade uIMenuFamilyUpgrade = new UIMenuFamilyUpgrade(this, this.mainActivity, this.actionsWithJSON, this.logicForDialogApply);
        this.menuFamilyUpgradeLayout = uIMenuFamilyUpgrade;
        UIContainer uIContainer11 = this.container;
        if (uIContainer11 != null) {
            uIContainer11.addLayout(10, uIMenuFamilyUpgrade);
        }
        UIMenuFamilyStore uIMenuFamilyStore = new UIMenuFamilyStore(this.mainActivity, this.actionsWithJSON);
        this.menuFamilyStoreLayout = uIMenuFamilyStore;
        UIContainer uIContainer12 = this.container;
        if (uIContainer12 != null) {
            uIContainer12.addLayout(11, uIMenuFamilyStore);
        }
    }

    public final void getStartParameters(JSONObject json) {
        if (json != null) {
            ActionWithString actionWithString = new ActionWithString();
            String strOptString = json.optString("n");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            this.familyName = actionWithString.convertStringToHtmlType(strOptString);
            this.ifLeader = json.optInt("k");
            this.valueMoney = json.optInt("m");
            this.valueBlackCoins = json.optInt("j");
            this.valueNotifications = json.optInt("y");
            this.ifFamilyInTop = json.optInt("b");
            String strOptString2 = json.optString("pn");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
            this.playersNick = strOptString2;
            this.playersId = json.optInt("pi");
            this.familyStatus = json.optInt(BlackPassKeys.IS_IS_REWARD_STANDART);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setFamilyName(Spanned familyName) {
        TextView textView = ((FamiliesMainContainerBinding) getBinding()).titleText;
        textView.setText(familyName);
        textView.setSelected(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setMoney(int thisMoney) {
        ((FamiliesMainContainerBinding) getBinding()).moneyValue.setText(UsefulKt.getPriceWithSpaces(Integer.valueOf(thisMoney)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setBlackCoin(int thisBlackCoin) {
        ((FamiliesMainContainerBinding) getBinding()).blackCoinValue.setText(UsefulKt.getPriceWithSpaces(Integer.valueOf(thisBlackCoin)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setNotification(int thisValueNotification) {
        FamiliesMainContainerBinding familiesMainContainerBinding = (FamiliesMainContainerBinding) getBinding();
        if (thisValueNotification == 0) {
            familiesMainContainerBinding.valueNotification.setVisibility(4);
            familiesMainContainerBinding.buttonNotification.setImageResource(R.drawable.ic_notification_old);
        } else if (thisValueNotification < 10) {
            familiesMainContainerBinding.valueNotification.setVisibility(0);
            familiesMainContainerBinding.valueNotification.setText(String.valueOf(thisValueNotification));
            familiesMainContainerBinding.buttonNotification.setImageResource(R.drawable.ic_notification_active);
        } else {
            familiesMainContainerBinding.valueNotification.setVisibility(0);
            familiesMainContainerBinding.valueNotification.setText("9+");
            familiesMainContainerBinding.buttonNotification.setImageResource(R.drawable.ic_notification_active);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setLavr(int conditionInTop) {
        if (conditionInTop == 0) {
            ((FamiliesMainContainerBinding) getBinding()).titleText.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ic_family_old_w30_h26, 0, 0, 0);
        } else {
            if (conditionInTop != 1) {
                return;
            }
            ((FamiliesMainContainerBinding) getBinding()).titleText.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ic_family_in_bracket_w34_h26, 0, 0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void listenerLayout(int thisLayout) {
        if (thisLayout != 0) {
            ((FamiliesMainContainerBinding) getBinding()).buttonBack.setVisibility(0);
        } else {
            ((FamiliesMainContainerBinding) getBinding()).buttonBack.setVisibility(4);
        }
        switch (thisLayout) {
            case 2:
                UITopPresents uITopPresents = this.topPresentsLayout;
                if (uITopPresents != null) {
                    uITopPresents.setParameters();
                    break;
                }
                break;
            case 3:
                UIFamilyShop uIFamilyShop = this.shopLayout;
                if (uIFamilyShop != null) {
                    uIFamilyShop.setStartParameters(this.familyStatus);
                    break;
                }
                break;
            case 4:
                UIFamilyQuests uIFamilyQuests = this.questsLayout;
                if (uIFamilyQuests != null) {
                    uIFamilyQuests.setStartParameters();
                    break;
                }
                break;
            case 5:
                this.valueNotifications = 0;
                setNotification(0);
                break;
            case 8:
                UIMenuFamilyPlayersSetting uIMenuFamilyPlayersSetting = this.menuFamilyPlayersSettingLayout;
                if (uIMenuFamilyPlayersSetting != null) {
                    uIMenuFamilyPlayersSetting.setStartParameters();
                    break;
                }
                break;
            case 9:
                UIMenuCarPark uIMenuCarPark = this.menuCarParkLayout;
                if (uIMenuCarPark != null) {
                    uIMenuCarPark.setStartData();
                    uIMenuCarPark.setVisibleButtonBackToMenu(this.ifFromMainMenuForCarPark);
                    break;
                }
                break;
            case 10:
                UIMenuFamilyUpgrade uIMenuFamilyUpgrade = this.menuFamilyUpgradeLayout;
                if (uIMenuFamilyUpgrade != null) {
                    uIMenuFamilyUpgrade.setVisibleButtonBackToMenu(this.ifFromMainMenuForUpgrade);
                    break;
                }
                break;
            case 11:
                UIMenuFamilyStore uIMenuFamilyStore = this.menuFamilyStoreLayout;
                if (uIMenuFamilyStore != null) {
                    uIMenuFamilyStore.setStartParameters(this.otherState);
                    break;
                }
                break;
        }
        UIContainer uIContainer = this.container;
        if (uIContainer != null) {
            uIContainer.setCurrentLayout(thisLayout);
        }
    }

    public final void upgradeFamily() throws JSONException {
        UIMenuFamilyUpgrade uIMenuFamilyUpgrade = this.menuFamilyUpgradeLayout;
        if (uIMenuFamilyUpgrade != null) {
            uIMenuFamilyUpgrade.upgradeFamily();
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() throws JSONException {
        ActionsWithJSON actionsWithJSON;
        if (!this.ifCloseOtherMethodAndNotInforming && (actionsWithJSON = this.actionsWithJSON) != null) {
            actionsWithJSON.sendPressButton(8);
        }
        LogicForDialogApply logicForDialogApply = this.logicForDialogApply;
        if (logicForDialogApply != null) {
            logicForDialogApply.closeDialogApply();
        }
        LogicForDialogBuyToken logicForDialogBuyToken = this.logicForDialogBuyToken;
        if (logicForDialogBuyToken != null) {
            logicForDialogBuyToken.closeDialog();
        }
        JNILib.toggleDrawing2dStuff(false);
        setNullableParameters();
        super.onDestroyView();
    }

    private final void setNullableParameters() {
        LogicForDialogBuyToken logicForDialogBuyToken = this.logicForDialogBuyToken;
        if (logicForDialogBuyToken != null) {
            logicForDialogBuyToken.setNullableParameters();
        }
        LogicForDialogApply logicForDialogApply = this.logicForDialogApply;
        if (logicForDialogApply != null) {
            logicForDialogApply.setNullableParameters();
        }
        UIFamilyRating uIFamilyRating = this.familyRatingLayout;
        if (uIFamilyRating != null) {
            uIFamilyRating.setNullableParameters();
        }
        UITopPresents uITopPresents = this.topPresentsLayout;
        if (uITopPresents != null) {
            uITopPresents.setNullableParameters();
        }
        UIFamilyShop uIFamilyShop = this.shopLayout;
        if (uIFamilyShop != null) {
            uIFamilyShop.setNullableParameters();
        }
        UIFamilyQuests uIFamilyQuests = this.questsLayout;
        if (uIFamilyQuests != null) {
            uIFamilyQuests.setNullableParameters();
        }
        UIFamilyNotification uIFamilyNotification = this.notificationsLayout;
        if (uIFamilyNotification != null) {
            uIFamilyNotification.setNullableParameters();
        }
        UIMenuFamilySetting uIMenuFamilySetting = this.menuFamilySettingLayout;
        if (uIMenuFamilySetting != null) {
            uIMenuFamilySetting.setNullableParameters();
        }
        UIMenuFamilyPlayersSetting uIMenuFamilyPlayersSetting = this.menuFamilyPlayersSettingLayout;
        if (uIMenuFamilyPlayersSetting != null) {
            uIMenuFamilyPlayersSetting.setNullableParameters();
        }
        UIMenuCarPark uIMenuCarPark = this.menuCarParkLayout;
        if (uIMenuCarPark != null) {
            uIMenuCarPark.setNullableParameters();
        }
        UIMenuFamilyUpgrade uIMenuFamilyUpgrade = this.menuFamilyUpgradeLayout;
        if (uIMenuFamilyUpgrade != null) {
            uIMenuFamilyUpgrade.setNullableParameters();
        }
        UIMenuFamilyStore uIMenuFamilyStore = this.menuFamilyStoreLayout;
        if (uIMenuFamilyStore != null) {
            uIMenuFamilyStore.setNullableParameters();
        }
        this.mainActivity = null;
        this.guiManager = null;
        this.actionsWithJSON = null;
        this.container = null;
        this.mainLayout = null;
        this.familyRatingLayout = null;
        this.topPresentsLayout = null;
        this.shopLayout = null;
        this.questsLayout = null;
        this.notificationsLayout = null;
        this.menuMainLayout = null;
        this.menuFamilySettingLayout = null;
        this.menuFamilyPlayersSettingLayout = null;
        this.menuCarParkLayout = null;
        this.menuFamilyUpgradeLayout = null;
        this.menuFamilyStoreLayout = null;
        this.logicForDialogApply = null;
        this.logicForDialogBuyToken = null;
    }

    public GUIFamilySystem() {
        final Function0 function0 = null;
        this.mainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(JNIActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.familysystem.GUIFamilySystem$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.familysystem.GUIFamilySystem$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.familysystem.GUIFamilySystem$mainViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                return (ViewModelProvider.Factory) new ViewModelProvider(fragmentActivityRequireActivity).get(JNIActivityViewModel.class);
            }
        });
    }
}

