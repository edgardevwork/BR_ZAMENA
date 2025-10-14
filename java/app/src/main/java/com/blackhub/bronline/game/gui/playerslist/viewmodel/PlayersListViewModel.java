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

