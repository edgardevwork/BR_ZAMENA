package com.blackhub.bronline.game.gui.minigameevents;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.ISAMPGUI;
import com.blackhub.bronline.game.common.GUIPopupWindow;
import com.blackhub.bronline.game.common.UIContainer;
import com.blackhub.bronline.game.core.JNIActivity;
import com.bless.client.R;
import org.json.JSONException;
import org.json.JSONObject;


public class GUIMiniGameEventsGame implements ISAMPGUI {
    public static final int HALLOWEEN_GAME_FINGER = 2;
    public static final int HALLOWEEN_GAME_IMAGE = 3;
    public static final int HALLOWEEN_GAME_PRIZE = 0;
    public static final int HALLOWEEN_GAME_UNTIE = 1;
    public JNIActivity mActivity = null;
    public GUIManager mGUIManager = null;
    public GUIPopupWindow mWindow = null;
    public View mViewRoot = null;
    public JSONObject mJson = null;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public int getGuiId() {
        return 31;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(JSONObject json) {
    }

    public static ISAMPGUI newInstance() {
        return new GUIMiniGameEventsGame();
    }

    public GUIManager getGuiManager() {
        return this.mGUIManager;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    @SuppressLint({"InflateParams"})
    public void show(JSONObject json, GUIManager manager, JNIActivity activity) {
        this.mGUIManager = manager;
        this.mActivity = activity;
        this.mJson = json;
        if (this.mWindow == null) {
            this.mViewRoot = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.halloween_game, (ViewGroup) null, false);
            GUIPopupWindow gUIPopupWindow = new GUIPopupWindow(this.mViewRoot, -1, -1, true);
            this.mWindow = gUIPopupWindow;
            gUIPopupWindow.setAnimationStyle(R.style.PopupWindowAnimation);
        }
        UIContainer uIContainer = (UIContainer) this.mViewRoot.findViewById(R.id.container);
        uIContainer.addLayout(0, new UILayoutMiniGameEventsGamePrize(this));
        uIContainer.addLayout(1, new UILayoutMiniGameEventsGameUnTie(this));
        uIContainer.addLayout(2, new UILayoutMiniGameEventsGameFinger(this));
        uIContainer.addLayout(3, new UILayoutMiniGameEventsGameImage(this));
        int iOptInt = this.mJson.optInt("g");
        boolean z = this.mJson.optInt("x") != 1;
        if (iOptInt == 3 || !z) {
            this.mViewRoot.findViewById(R.id.close).setVisibility(8);
        } else {
            this.mViewRoot.findViewById(R.id.close).setVisibility(0);
        }
        uIContainer.setCurrentLayout(iOptInt);
        this.mViewRoot.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.minigameevents.GUIMiniGameEventsGame$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                this.f$0.lambda$show$0(view);
            }
        });
        this.mWindow.showAtLocation(this.mActivity.getParentLayout(), 17, 0, 0);
        this.mWindow.setDimming(0.8f);
    }

    public final /* synthetic */ void lambda$show$0(View view) throws JSONException {
        this.mGUIManager.notifyGUIClosed(getGuiId());
        close(null);
    }

    public JSONObject getJson() {
        return this.mJson;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void close(JSONObject json) {
        GUIPopupWindow gUIPopupWindow = this.mWindow;
        if (gUIPopupWindow != null) {
            gUIPopupWindow.dismiss();
        }
        if (json == null || json.optInt("t") != 1) {
            return;
        }
        this.mGUIManager.sendJsonData(getGuiId(), json);
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public boolean isShowingGui() {
        GUIPopupWindow gUIPopupWindow = this.mWindow;
        if (gUIPopupWindow != null) {
            return gUIPopupWindow.isShowing();
        }
        return false;
    }
}
