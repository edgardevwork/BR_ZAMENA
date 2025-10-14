package com.blackhub.bronline.game;

import com.blackhub.bronline.game.core.JNIActivity;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface ISAMPGUI {
    void close(JSONObject json);

    /* renamed from: getGuiId */
    int getScreenId();

    boolean isShowingGui();

    void newBackPress();

    void onPacketIncoming(JSONObject json);

    void show(JSONObject json, GUIManager manager, JNIActivity activity);
}
