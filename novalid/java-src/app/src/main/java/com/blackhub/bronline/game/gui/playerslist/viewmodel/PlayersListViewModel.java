package com.blackhub.bronline.game.gui.playerslist.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.blackhub.bronline.game.gui.playerslist.data.PlayersData;
import com.blackhub.bronline.game.gui.playerslist.network.PlayersListActionWithJson;
import com.blackhub.bronline.game.gui.playerslist.utils.PlayersListUtilsKt;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PlayersListViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0015J\u0016\u0010\u001b\u001a\u00020\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/playerslist/viewmodel/PlayersListViewModel;", "Landroidx/lifecycle/ViewModel;", "actionsWithJson", "Lcom/blackhub/bronline/game/gui/playerslist/network/PlayersListActionWithJson;", "(Lcom/blackhub/bronline/game/gui/playerslist/network/PlayersListActionWithJson;)V", "clickedPlayerName", "", "getClickedPlayerName", "()Ljava/lang/String;", "setClickedPlayerName", "(Ljava/lang/String;)V", "listOfPlayersLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/blackhub/bronline/game/gui/playerslist/data/PlayersData;", "getListOfPlayersLiveData", "()Landroidx/lifecycle/LiveData;", "listOfPlayersMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "optJSONObjectToPlayersData", "optJSONObject", "Lorg/json/JSONObject;", "sendClosedWindow", "", "sendRequestForUpdatingData", "setData", "jsonObject", "setListOfPlayers", IFramePlayerOptions.Builder.LIST, "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class PlayersListViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final PlayersListActionWithJson actionsWithJson;

    @NotNull
    public String clickedPlayerName;

    @NotNull
    public final MutableLiveData<List<PlayersData>> listOfPlayersMutableLiveData;

    @Inject
    public PlayersListViewModel(@NotNull PlayersListActionWithJson actionsWithJson) {
        Intrinsics.checkNotNullParameter(actionsWithJson, "actionsWithJson");
        this.actionsWithJson = actionsWithJson;
        this.listOfPlayersMutableLiveData = new MutableLiveData<>();
        this.clickedPlayerName = "";
    }

    @NotNull
    public final LiveData<List<PlayersData>> getListOfPlayersLiveData() {
        return this.listOfPlayersMutableLiveData;
    }

    @NotNull
    public final String getClickedPlayerName() {
        return this.clickedPlayerName;
    }

    public final void setClickedPlayerName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clickedPlayerName = str;
    }

    public final void setData(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("data");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "optJSONObject(...)");
                    PlayersData playersDataOptJSONObjectToPlayersData = optJSONObjectToPlayersData(jSONObjectOptJSONObject);
                    if (Intrinsics.areEqual(playersDataOptJSONObjectToPlayersData.getName(), this.clickedPlayerName)) {
                        playersDataOptJSONObjectToPlayersData.setClicked(true);
                    }
                    arrayList.add(playersDataOptJSONObjectToPlayersData);
                }
            }
            setListOfPlayers(arrayList);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final PlayersData optJSONObjectToPlayersData(JSONObject optJSONObject) {
        int iOptInt = optJSONObject.optInt("id");
        String strOptString = optJSONObject.optString(PlayersListUtilsKt.KEY_GET_PLAYER_NICK);
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        return new PlayersData(iOptInt, strOptString, optJSONObject.optInt("level"), optJSONObject.optInt(PlayersListUtilsKt.KEY_GET_PLAYER_PING));
    }

    public final void setListOfPlayers(List<PlayersData> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        this.listOfPlayersMutableLiveData.setValue(arrayList);
    }

    public final void sendRequestForUpdatingData() throws JSONException {
        this.actionsWithJson.updateData();
    }

    public final void sendClosedWindow() throws JSONException {
        this.actionsWithJson.closedWindow();
    }
}
