package com.blackhub.bronline.game.common;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStateManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewbinding.ViewBinding;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.ISAMPGUI;
import com.blackhub.bronline.game.core.JNIActivity;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: BaseISAMPGUIFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000f\u001a\u00020\rH\u0004J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragment;", "VB", "Landroidx/viewbinding/ViewBinding;", "Lcom/blackhub/bronline/game/ISAMPGUI;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "()V", "jsonObj", "Lorg/json/JSONObject;", "getJsonObj", "()Lorg/json/JSONObject;", "setJsonObj", "(Lorg/json/JSONObject;)V", "close", "", "json", "closeFragment", "initViewsISAMPGUI", "isShowingGui", "", "onViewCreated", SVG.View.NODE_NAME, "Landroid/view/View;", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "Landroid/os/Bundle;", "show", "manager", "Lcom/blackhub/bronline/game/GUIManager;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Lcom/blackhub/bronline/game/core/JNIActivity;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public abstract class BaseISAMPGUIFragment<VB extends ViewBinding> extends BaseFragment<VB> implements ISAMPGUI {
    public static final int $stable = 8;

    @Nullable
    public JSONObject jsonObj;

    public void initViewsISAMPGUI() {
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public boolean isShowingGui() {
        return true;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void show(@Nullable JSONObject json, @Nullable GUIManager manager, @Nullable JNIActivity jNIActivity) {
    }

    @Nullable
    public final JSONObject getJsonObj() {
        return this.jsonObj;
    }

    public final void setJsonObj(@Nullable JSONObject jSONObject) {
        this.jsonObj = jSONObject;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getBinding().getRoot().setClickable(true);
        getBinding().getRoot().setFocusable(true);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(com.blackhub.bronline.game.core.constants.Other.JSON_OBJECT_TAG) : null;
        if (string != null) {
            this.jsonObj = new JSONObject(string);
        }
        initViewsISAMPGUI();
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
        fragmentTransactionRemove.commitAllowingStateLoss();
    }

    public final void closeFragment() {
        GUIManager.INSTANCE.getInstance().closeGUI(null, getScreenId());
    }
}
