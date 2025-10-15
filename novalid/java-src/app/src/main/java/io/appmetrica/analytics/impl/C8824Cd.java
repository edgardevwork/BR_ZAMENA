package io.appmetrica.analytics.impl;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.blackhub.bronline.game.gui.tutorialhints.TutorialKeys;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Cd */
/* loaded from: classes6.dex */
public final class C8824Cd {

    /* renamed from: a */
    public final HashMap f6430a;

    public C8824Cd() {
        HashMap map = new HashMap();
        this.f6430a = map;
        map.put("google_aid", "g");
        map.put("huawei_oaid", "h");
        map.put("sim_info", "si");
        map.put("features_collecting", "fc");
        map.put("permissions_collecting", "pc");
        map.put("retry_policy", "rp");
        map.put("cache_control", "cc");
        map.put("auto_inapp_collecting", "aic");
        map.put("attribution", TutorialKeys.TUTORIAL_ADDITIONAL_TASK_PROGRESS_LIST_KEY);
        map.put("startup_update", CmcdConfiguration.KEY_STARTUP);
        map.put("ssl_pinning", "sp");
        map.put("external_attribution", "exta");
    }

    /* renamed from: a */
    public final String m5028a(String str) {
        return this.f6430a.containsKey(str) ? (String) this.f6430a.get(str) : str;
    }
}
