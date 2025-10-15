package com.blackhub.bronline.game.common;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStateManager;
import androidx.fragment.app.FragmentTransaction;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.ISAMPGUI;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.JNIActivity;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: BaseISAMPGUIFragmentCompose.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0004J\b\u0010\u0014\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m7105d2 = {"Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragmentCompose;", "UiState", "Lcom/blackhub/bronline/game/common/UiState;", "ViewModel", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/ISAMPGUI;", "Lcom/blackhub/bronline/game/common/BaseFragmentCompose;", "screenId", "", "(I)V", "jsonObj", "Lorg/json/JSONObject;", "getJsonObj", "()Lorg/json/JSONObject;", "setJsonObj", "(Lorg/json/JSONObject;)V", "close", "", "json", "closeFragment", "getGuiId", "initViewsISAMPGUI", SVG.View.NODE_NAME, "Landroid/view/View;", "isShowingGui", "", "onViewCreated", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "Landroid/os/Bundle;", "show", "manager", "Lcom/blackhub/bronline/game/GUIManager;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Lcom/blackhub/bronline/game/core/JNIActivity;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public abstract class BaseISAMPGUIFragmentCompose<UiState extends UiState, ViewModel extends BaseViewModel<UiState>> extends BaseFragmentCompose<UiState, ViewModel> implements ISAMPGUI {
    public static final int $stable = 8;

    @Nullable
    public JSONObject jsonObj;
    public final int screenId;

    public void initViewsISAMPGUI(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public boolean isShowingGui() {
        return true;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void show(@Nullable JSONObject json, @Nullable GUIManager manager, @Nullable JNIActivity jNIActivity) {
    }

    public BaseISAMPGUIFragmentCompose(int i) {
        super(i);
        this.screenId = i;
    }

    @Nullable
    public final JSONObject getJsonObj() {
        return this.jsonObj;
    }

    public final void setJsonObj(@Nullable JSONObject jSONObject) {
        this.jsonObj = jSONObject;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentCompose, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(com.blackhub.bronline.game.core.constants.Other.JSON_OBJECT_TAG) : null;
        if (string != null) {
            this.jsonObj = new JSONObject(string);
        }
        initViewsISAMPGUI(view);
        GUIManager companion = GUIManager.INSTANCE.getInstance();
        int screenId = getScreenId();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.blackhub.bronline.game.ISAMPGUI");
        companion.updateStack(screenId, this);
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void close(@Nullable JSONObject json) {
        FragmentManager supportFragmentManager;
        FragmentTransaction fragmentTransactionBeginTransaction;
        FragmentTransaction fragmentTransactionRemove;
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction()) == null || (fragmentTransactionRemove = fragmentTransactionBeginTransaction.remove(this)) == null) {
            return;
        }
        fragmentTransactionRemove.commit();
    }

    public final void closeFragment() {
        GUIManager.INSTANCE.getInstance().closeGUI(null, getScreenId());
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId, reason: from getter */
    public int getScreenId() {
        return this.screenId;
    }
}
