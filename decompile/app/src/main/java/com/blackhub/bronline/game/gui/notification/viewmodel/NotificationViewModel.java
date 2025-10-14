package com.blackhub.bronline.game.gui.notification.viewmodel;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.constants.NativeConstants;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.notification.data.NotificationObj;
import com.blackhub.bronline.game.gui.notification.network.NotificationActionWithJSON;
import com.blackhub.bronline.game.gui.notification.state.NotificationUiState;
import com.blackhub.bronline.game.gui.notification.utils.NotificationKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NotificationViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u001e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001dH\u0002J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0018H\u0002J\b\u0010!\u001a\u00020\u0013H\u0002J\u0010\u0010\"\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010$J$\u0010%\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0018J\u000e\u0010'\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010(\u001a\u00020\u0013J\u0010\u0010)\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0018H\u0002J\b\u0010*\u001a\u00020\u0013H\u0002J\b\u0010+\u001a\u00020\u0013H\u0002J\u000e\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020.R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006/"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/notification/viewmodel/NotificationViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/notification/state/NotificationUiState;", "actionWithJson", "Lcom/blackhub/bronline/game/gui/notification/network/NotificationActionWithJSON;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "(Lcom/blackhub/bronline/game/gui/notification/network/NotificationActionWithJSON;Lcom/blackhub/bronline/game/core/resources/StringResource;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getStringResource", "()Lcom/blackhub/bronline/game/core/resources/StringResource;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "addNewNotification", "", "json", "Lorg/json/JSONObject;", "clickButton", "type", "", "id", "subId", "getNotificationFromBacklog", "isNewType", "", "isHideInterface", "isHide", "isNeedRemoveNotificationById", "isNeedRemoveNotifications", "migrateNotifications", "notificationFromAdapter", "Lcom/blackhub/bronline/game/gui/notification/data/NotificationObj;", "notificationActions", "action", "onPacketIncoming", "removeAllNotifications", "removeNotificationById", "removeNotificationFromBacklog", "removeTwoNotification", "sendOther", "context", "Landroid/content/Context;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nNotificationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationViewModel.kt\ncom/blackhub/bronline/game/gui/notification/viewmodel/NotificationViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,235:1\n230#2,5:236\n230#2,5:242\n230#2,5:247\n230#2,5:252\n230#2,5:257\n230#2,5:262\n230#2,5:270\n230#2,5:275\n230#2,5:280\n230#2,5:285\n1#3:241\n819#4:267\n847#4,2:268\n*S KotlinDebug\n*F\n+ 1 NotificationViewModel.kt\ncom/blackhub/bronline/game/gui/notification/viewmodel/NotificationViewModel\n*L\n89#1:236,5\n108#1:242,5\n120#1:247,5\n147#1:252,5\n169#1:257,5\n188#1:262,5\n201#1:270,5\n213#1:275,5\n221#1:280,5\n229#1:285,5\n199#1:267\n199#1:268,2\n*E\n"})
/* loaded from: classes3.dex */
public final class NotificationViewModel extends BaseViewModel<NotificationUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<NotificationUiState> _uiState;

    @NotNull
    public final NotificationActionWithJSON actionWithJson;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<NotificationUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public NotificationViewModel(@NotNull NotificationActionWithJSON actionWithJson, @NotNull StringResource stringResource) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        this.actionWithJson = actionWithJson;
        this.stringResource = stringResource;
        this._uiState = StateFlowKt.MutableStateFlow(new NotificationUiState(false, null, false, false, false, false, 0, 0, 255, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<NotificationUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<NotificationUiState> getUiState() {
        return this.uiState;
    }

    public final void onPacketIncoming(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        int iOptInt = json.optInt(NativeConstants.ACTION_WITH_NATIVE_KEYBOARD);
        if (iOptInt == 1) {
            isHideInterface(true);
            return;
        }
        if (iOptInt == 9) {
            isHideInterface(false);
            return;
        }
        if (iOptInt == 99) {
            isNeedRemoveNotifications();
        } else if (json.optInt("not") == 1) {
            isNeedRemoveNotificationById(json.optInt("b"));
        } else {
            notificationActions$default(this, json, 0, 1, 2, null);
        }
    }

    public static /* synthetic */ void notificationActions$default(NotificationViewModel notificationViewModel, JSONObject jSONObject, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            jSONObject = null;
        }
        if ((i3 & 2) != 0) {
            i = -1;
        }
        notificationViewModel.notificationActions(jSONObject, i, i2);
    }

    public final void notificationActions(@Nullable JSONObject json, int subId, int action) {
        if (action == 1) {
            addNewNotification(json);
            return;
        }
        if (action == 2) {
            removeNotificationFromBacklog();
        } else if (action == 3) {
            removeTwoNotification();
        } else {
            if (action != 4) {
                return;
            }
            removeNotificationById(subId);
        }
    }

    public final void clickButton(int type, int id, int subId) throws JSONException {
        this.actionWithJson.clickButton(type, id, subId);
    }

    public final void sendOther(@NotNull Context context) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        this.actionWithJson.sendOther(context);
    }

    public final void getNotificationFromBacklog(boolean isNewType) {
        NotificationUiState value;
        NotificationUiState notificationUiState;
        MutableStateFlow<NotificationUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            notificationUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, notificationUiState.copy((16 & 1) != 0 ? notificationUiState.isNewHud : isNewType, (16 & 2) != 0 ? notificationUiState.backlogNotification : null, (16 & 4) != 0 ? notificationUiState.isNeedNotificationFromBacklog : true, (16 & 8) != 0 ? notificationUiState.isRemoved : false, (16 & 16) != 0 ? notificationUiState.isHideInterface : false, (16 & 32) != 0 ? notificationUiState.isNeedRemoveAllNotifications : false, (16 & 64) != 0 ? notificationUiState.newSize : 0, (16 & 128) != 0 ? notificationUiState.notificationIdIfNeedRemove : -1)));
    }

    public final void migrateNotifications(@Nullable NotificationObj notificationFromAdapter) {
        NotificationUiState value;
        NotificationUiState notificationUiState;
        List<NotificationObj> backlogNotification = get_uiState().getValue().getBacklogNotification();
        boolean z = !get_uiState().getValue().isNewHud();
        if (!z && notificationFromAdapter != null) {
            backlogNotification.add(0, notificationFromAdapter);
        }
        MutableStateFlow<NotificationUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            notificationUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, notificationUiState.copy((16 & 1) != 0 ? notificationUiState.isNewHud : z, (16 & 2) != 0 ? notificationUiState.backlogNotification : backlogNotification, (16 & 4) != 0 ? notificationUiState.isNeedNotificationFromBacklog : false, (16 & 8) != 0 ? notificationUiState.isRemoved : false, (16 & 16) != 0 ? notificationUiState.isHideInterface : false, (16 & 32) != 0 ? notificationUiState.isNeedRemoveAllNotifications : false, (16 & 64) != 0 ? notificationUiState.newSize : backlogNotification.size(), (16 & 128) != 0 ? notificationUiState.notificationIdIfNeedRemove : -1)));
    }

    public final void removeAllNotifications() {
        NotificationUiState value;
        NotificationUiState notificationUiState;
        MutableStateFlow<NotificationUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            notificationUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, notificationUiState.copy((16 & 1) != 0 ? notificationUiState.isNewHud : false, (16 & 2) != 0 ? notificationUiState.backlogNotification : new ArrayList(), (16 & 4) != 0 ? notificationUiState.isNeedNotificationFromBacklog : false, (16 & 8) != 0 ? notificationUiState.isRemoved : false, (16 & 16) != 0 ? notificationUiState.isHideInterface : false, (16 & 32) != 0 ? notificationUiState.isNeedRemoveAllNotifications : false, (16 & 64) != 0 ? notificationUiState.newSize : 0, (16 & 128) != 0 ? notificationUiState.notificationIdIfNeedRemove : -1)));
    }

    public final void addNewNotification(JSONObject json) {
        NotificationUiState value;
        NotificationUiState notificationUiState;
        if (json != null) {
            int iOptInt = json.optInt("t");
            String strOptString = json.optString("i");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            int iOptInt2 = json.optInt("d");
            int iOptInt3 = json.optInt("s");
            int iOptInt4 = json.optInt("b");
            String strOptString2 = json.optString("k");
            if (strOptString2.length() == 0) {
                strOptString2 = getStringResource().notificationDefaultButton();
            }
            String str = strOptString2;
            Intrinsics.checkNotNullExpressionValue(str, "ifEmpty(...)");
            NotificationObj notificationObj = new NotificationObj(iOptInt, strOptString, iOptInt2, iOptInt3, iOptInt4, str, null, 64, null);
            boolean z = json.optInt(NotificationKeys.NOTIFICATION_VERSION) == 1;
            List<NotificationObj> backlogNotification = get_uiState().getValue().getBacklogNotification();
            backlogNotification.add(notificationObj);
            MutableStateFlow<NotificationUiState> mutableStateFlow = get_uiState();
            do {
                value = mutableStateFlow.getValue();
                notificationUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, notificationUiState.copy((16 & 1) != 0 ? notificationUiState.isNewHud : z, (16 & 2) != 0 ? notificationUiState.backlogNotification : backlogNotification, (16 & 4) != 0 ? notificationUiState.isNeedNotificationFromBacklog : false, (16 & 8) != 0 ? notificationUiState.isRemoved : false, (16 & 16) != 0 ? notificationUiState.isHideInterface : false, (16 & 32) != 0 ? notificationUiState.isNeedRemoveAllNotifications : false, (16 & 64) != 0 ? notificationUiState.newSize : backlogNotification.size(), (16 & 128) != 0 ? notificationUiState.notificationIdIfNeedRemove : -1)));
        }
    }

    public final void removeNotificationFromBacklog() {
        NotificationUiState value;
        NotificationUiState notificationUiState;
        List<NotificationObj> backlogNotification = get_uiState().getValue().getBacklogNotification();
        try {
            CollectionsKt__MutableCollectionsKt.removeFirstOrNull(backlogNotification);
        } catch (Exception e) {
            UtilsKt.crashlyticsLog("removeNotificationFromBacklog exception: " + e);
        }
        MutableStateFlow<NotificationUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            notificationUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, notificationUiState.copy((16 & 1) != 0 ? notificationUiState.isNewHud : false, (16 & 2) != 0 ? notificationUiState.backlogNotification : backlogNotification, (16 & 4) != 0 ? notificationUiState.isNeedNotificationFromBacklog : false, (16 & 8) != 0 ? notificationUiState.isRemoved : true, (16 & 16) != 0 ? notificationUiState.isHideInterface : false, (16 & 32) != 0 ? notificationUiState.isNeedRemoveAllNotifications : false, (16 & 64) != 0 ? notificationUiState.newSize : backlogNotification.size(), (16 & 128) != 0 ? notificationUiState.notificationIdIfNeedRemove : -1)));
    }

    public final void removeTwoNotification() {
        NotificationUiState value;
        NotificationUiState notificationUiState;
        List<NotificationObj> backlogNotification = get_uiState().getValue().getBacklogNotification();
        for (int i = 0; i < 2; i++) {
        }
        MutableStateFlow<NotificationUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            notificationUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, notificationUiState.copy((16 & 1) != 0 ? notificationUiState.isNewHud : false, (16 & 2) != 0 ? notificationUiState.backlogNotification : backlogNotification, (16 & 4) != 0 ? notificationUiState.isNeedNotificationFromBacklog : false, (16 & 8) != 0 ? notificationUiState.isRemoved : true, (16 & 16) != 0 ? notificationUiState.isHideInterface : false, (16 & 32) != 0 ? notificationUiState.isNeedRemoveAllNotifications : false, (16 & 64) != 0 ? notificationUiState.newSize : backlogNotification.size(), (16 & 128) != 0 ? notificationUiState.notificationIdIfNeedRemove : 0)));
    }

    public final void removeNotificationById(int subId) {
        NotificationUiState value;
        NotificationUiState notificationUiState;
        List<NotificationObj> backlogNotification = get_uiState().getValue().getBacklogNotification();
        ArrayList arrayList = new ArrayList();
        for (Object obj : backlogNotification) {
            if (((NotificationObj) obj).getSubId() != subId) {
                arrayList.add(obj);
            }
        }
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        MutableStateFlow<NotificationUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            notificationUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, notificationUiState.copy((16 & 1) != 0 ? notificationUiState.isNewHud : false, (16 & 2) != 0 ? notificationUiState.backlogNotification : mutableList, (16 & 4) != 0 ? notificationUiState.isNeedNotificationFromBacklog : false, (16 & 8) != 0 ? notificationUiState.isRemoved : false, (16 & 16) != 0 ? notificationUiState.isHideInterface : false, (16 & 32) != 0 ? notificationUiState.isNeedRemoveAllNotifications : false, (16 & 64) != 0 ? notificationUiState.newSize : mutableList.size(), (16 & 128) != 0 ? notificationUiState.notificationIdIfNeedRemove : -1)));
    }

    public final void isHideInterface(boolean isHide) {
        NotificationUiState value;
        NotificationUiState notificationUiState;
        MutableStateFlow<NotificationUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            notificationUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, notificationUiState.copy((16 & 1) != 0 ? notificationUiState.isNewHud : false, (16 & 2) != 0 ? notificationUiState.backlogNotification : null, (16 & 4) != 0 ? notificationUiState.isNeedNotificationFromBacklog : false, (16 & 8) != 0 ? notificationUiState.isRemoved : false, (16 & 16) != 0 ? notificationUiState.isHideInterface : isHide, (16 & 32) != 0 ? notificationUiState.isNeedRemoveAllNotifications : false, (16 & 64) != 0 ? notificationUiState.newSize : 0, (16 & 128) != 0 ? notificationUiState.notificationIdIfNeedRemove : 0)));
    }

    public final void isNeedRemoveNotifications() {
        NotificationUiState value;
        NotificationUiState notificationUiState;
        MutableStateFlow<NotificationUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            notificationUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, notificationUiState.copy((16 & 1) != 0 ? notificationUiState.isNewHud : false, (16 & 2) != 0 ? notificationUiState.backlogNotification : null, (16 & 4) != 0 ? notificationUiState.isNeedNotificationFromBacklog : false, (16 & 8) != 0 ? notificationUiState.isRemoved : false, (16 & 16) != 0 ? notificationUiState.isHideInterface : false, (16 & 32) != 0 ? notificationUiState.isNeedRemoveAllNotifications : true, (16 & 64) != 0 ? notificationUiState.newSize : 0, (16 & 128) != 0 ? notificationUiState.notificationIdIfNeedRemove : 0)));
    }

    public final void isNeedRemoveNotificationById(int subId) {
        NotificationUiState value;
        NotificationUiState notificationUiState;
        MutableStateFlow<NotificationUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            notificationUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, notificationUiState.copy((16 & 1) != 0 ? notificationUiState.isNewHud : false, (16 & 2) != 0 ? notificationUiState.backlogNotification : null, (16 & 4) != 0 ? notificationUiState.isNeedNotificationFromBacklog : false, (16 & 8) != 0 ? notificationUiState.isRemoved : false, (16 & 16) != 0 ? notificationUiState.isHideInterface : false, (16 & 32) != 0 ? notificationUiState.isNeedRemoveAllNotifications : false, (16 & 64) != 0 ? notificationUiState.newSize : 0, (16 & 128) != 0 ? notificationUiState.notificationIdIfNeedRemove : subId)));
    }
}
