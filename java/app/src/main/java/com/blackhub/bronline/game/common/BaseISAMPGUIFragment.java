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

